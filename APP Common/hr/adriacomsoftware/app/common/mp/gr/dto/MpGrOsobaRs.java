package hr.adriacomsoftware.app.common.mp.gr.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class MpGrOsobaRs extends AS2RecordList { 
	private static final long serialVersionUID = 1L;
	public MpGrOsobaRs () { 
		super();
	}
	public MpGrOsobaRs (AS2RecordList set) { 
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			MpGrOsobaVo vo = new MpGrOsobaVo(row);
			this.addRow(vo);
		}
	}
}