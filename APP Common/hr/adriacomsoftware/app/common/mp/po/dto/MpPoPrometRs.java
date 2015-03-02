package hr.adriacomsoftware.app.common.mp.po.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class MpPoPrometRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public MpPoPrometRs() {
		super();
	}

	public MpPoPrometRs(AS2RecordList set) {
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			MpPoPrometVo vo = new MpPoPrometVo(row);
			this.addRow(vo);
		}
	}
}