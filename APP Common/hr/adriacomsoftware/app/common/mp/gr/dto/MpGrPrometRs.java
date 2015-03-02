package hr.adriacomsoftware.app.common.mp.gr.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class MpGrPrometRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public MpGrPrometRs() {
		super();
	}

	public MpGrPrometRs(AS2RecordList set) {
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			MpGrPrometVo vo = new MpGrPrometVo(row);
			this.addRow(vo);
		}
	}
}