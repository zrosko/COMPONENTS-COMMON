package hr.adriacomsoftware.app.common.bpm.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class BpmProcesRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public BpmProcesRs() {
		super();
	}

	public BpmProcesRs(AS2RecordList set) {
		super(); // rows not set inside super construct
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			BpmProcesVo vo = new BpmProcesVo(row);
			this.addRow(vo);
		}
	}
}