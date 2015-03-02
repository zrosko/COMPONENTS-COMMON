package hr.adriacomsoftware.app.common.jb.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class RadnikRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;
	public static final String ODSUTNI_RADNICI = "@@odsutnosti";

	public RadnikRs() {
		super();
	}

	public RadnikRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			RadnikVo vo = new RadnikVo(row);
			this.addRow(vo);
		}
	}

	public String rsCitajImePrezimeZaIdRadnika(String id_radnika) {
		Iterator<AS2Record> E = getRows().iterator();
		while (E.hasNext()) {
			RadnikVo row = (RadnikVo) E.next();
			if (row.getIdRadnika().equals(id_radnika)) {
				return row.get("ime_prezime");
			}
		}
		return "";// ime i prezime
	}

	public String rsCitajIdRadnikaZaImePrezime(String ime_prezime) {
		ime_prezime = ime_prezime.trim();
		Iterator<AS2Record> E = getRows().iterator();
		while (E.hasNext()) {
			RadnikVo row = (RadnikVo) E.next();
			if (row.get("ime_prezime").equals(ime_prezime)) {
				return row.getIdRadnika();
			}
		}
		return "";// id radnika
	}
}