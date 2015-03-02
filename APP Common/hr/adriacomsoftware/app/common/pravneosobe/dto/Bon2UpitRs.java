package hr.adriacomsoftware.app.common.pravneosobe.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class Bon2UpitRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public Bon2UpitRs() {
		super();
	}

	public Bon2UpitRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			Bon2UpitVo vo = new Bon2UpitVo(row);
			this.addRow(vo);
		}
	}
}