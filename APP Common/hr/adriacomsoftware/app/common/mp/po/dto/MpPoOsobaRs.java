package hr.adriacomsoftware.app.common.mp.po.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class MpPoOsobaRs extends AS2RecordList { 
	private static final long serialVersionUID = 1L;
	public MpPoOsobaRs () { 
		super();
	}
	public MpPoOsobaRs (AS2RecordList set) { 
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			MpPoOsobaVo vo = new MpPoOsobaVo(row);
			this.addRow(vo);
		}
	}
}