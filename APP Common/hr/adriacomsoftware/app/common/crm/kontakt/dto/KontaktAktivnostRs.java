package hr.adriacomsoftware.app.common.crm.kontakt.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class KontaktAktivnostRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public KontaktAktivnostRs() {
		super();
	}

	public KontaktAktivnostRs(AS2RecordList set) {
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			KontaktAktivnostVo vo = new KontaktAktivnostVo(row);
			this.addRow(vo);
		}
	}
}