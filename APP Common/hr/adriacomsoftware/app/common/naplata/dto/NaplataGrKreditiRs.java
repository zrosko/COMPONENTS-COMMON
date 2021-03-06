package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class NaplataGrKreditiRs extends AS2RecordList { 
	private static final long serialVersionUID = 1L;
	public NaplataGrKreditiRs () { 
		super();
	}
	public NaplataGrKreditiRs (AS2RecordList set) { 
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			NaplataGrKreditiVo vo = new NaplataGrKreditiVo(row);
			this.addRow(vo);
		}
	}
	}