package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class ZaduzenostRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public ZaduzenostRs() {
		super();
	}

	public ZaduzenostRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			ZaduzenostVo vo = new ZaduzenostVo(row);
			this.addRow(vo);
		}
	}

	public String ukupnaZaduzenost() {
		float ukupno_odobreni_iznos = 0;

		Iterator<AS2Record> E = getRows().iterator();
		while (E.hasNext()) {
			AS2Record vo = E.next();
			ukupno_odobreni_iznos = ukupno_odobreni_iznos
					+ vo.getAsFloat(ZAHDataDictionary.PO_ZAH_ZADUZENOST__ODOBRENI_IZNOS);
		}
		return getFormatedAmount(ukupno_odobreni_iznos);
	}

	public String ukupnoMjesecnaRata() {
		float ukupno_mjesecna_rata = 0;

		Iterator<AS2Record> E = getRows().iterator();
		while (E.hasNext()) {
			AS2Record vo = E.next();
			ukupno_mjesecna_rata = ukupno_mjesecna_rata
					+ vo.getAsFloat(ZAHDataDictionary.PO_ZAH_ZADUZENOST__MJESECNA_RATA);
		}
		return getFormatedAmount(ukupno_mjesecna_rata);
	}

	public String ukupnoSaldo() {
		float ukupno_saldo = 0;

		Iterator<AS2Record> E = getRows().iterator();
		while (E.hasNext()) {
			AS2Record vo = E.next();
			ukupno_saldo = ukupno_saldo
					+ vo.getAsFloat(ZAHDataDictionary.PO_ZAH_ZADUZENOST__SALDO);
		}
		return getFormatedAmount(ukupno_saldo);
	}

	public String ukupnoVrijednostKolaterala() {
		float vrijednost_kolaterala = 0;

		Iterator<AS2Record> E = getRows().iterator();
		while (E.hasNext()) {
			AS2Record vo = E.next();
			vrijednost_kolaterala = vrijednost_kolaterala
					+ vo.getAsFloat(ZAHDataDictionary.PO_ZAH_ZADUZENOST__VRIJEDNOST_KOLATERALA);
		}
		return getFormatedAmount(vrijednost_kolaterala);
	}
}