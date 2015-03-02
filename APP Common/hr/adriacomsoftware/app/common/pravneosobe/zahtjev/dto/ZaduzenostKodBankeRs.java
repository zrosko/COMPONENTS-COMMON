package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class ZaduzenostKodBankeRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public ZaduzenostKodBankeRs() {
		super();
	}

	public ZaduzenostKodBankeRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			ZaduzenostKodBankeVo vo = new ZaduzenostKodBankeVo(row);
			this.addRow(vo);
		}
	}

	// maxDanaKasnjenja
	public String maxBrojDanaKasnjenja() {
		float max_broj_dana = 0;
		int radni_brojac = 0;

		Iterator<AS2Record> E = getRows().iterator();
		while (E.hasNext()) {
			AS2Record vo = E.next();
			radni_brojac = vo
					.getAsInt(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_DANA_KASNJENJA_GLAVNICA);
			if (radni_brojac > max_broj_dana)
				max_broj_dana = radni_brojac;
			radni_brojac = vo
					.getAsInt(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_DANA_KASNJENJA_KAMATE);
			if (radni_brojac > max_broj_dana)
				max_broj_dana = radni_brojac;
		}
		return getFormatedAmount(max_broj_dana);
	}

	public String ukupnaZaduzenost() {
		float ukupno_odobreni_iznos = 0;

		Iterator<AS2Record> E = getRows().iterator();
		while (E.hasNext()) {
			AS2Record vo = E.next();
			ukupno_odobreni_iznos = ukupno_odobreni_iznos
					+ vo.getAsFloat(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__ODOBRENI_IZNOS);
		}
		return getFormatedAmount(ukupno_odobreni_iznos);
	}

	public String ukupnaIzlozenost() {
		float ukupno_izlozenost = 0;

		Iterator<AS2Record> E = getRows().iterator();
		while (E.hasNext()) {
			AS2Record vo = E.next();
			ukupno_izlozenost = ukupno_izlozenost
					+ vo.getAsFloat(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNA_IZLOZENOST);
		}
		return getFormatedAmount(ukupno_izlozenost);
	}
}