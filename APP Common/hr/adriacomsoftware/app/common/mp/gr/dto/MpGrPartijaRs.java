package hr.adriacomsoftware.app.common.mp.gr.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class MpGrPartijaRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public MpGrPartijaRs() {
		super();
	}

	public MpGrPartijaRs(AS2RecordList set) {
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			MpGrPartijaVo vo = new MpGrPartijaVo(row);
			this.addRow(vo);
		}
	}
}
