package hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class KupacLimitRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public KupacLimitRs() {
		super();
	}

	public KupacLimitRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			KupacLimitVo vo = new KupacLimitVo(row);
			this.addRow(vo);
		}
	}
}