package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class Bon2Rs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public Bon2Rs() {
		super();
	}

	public Bon2Rs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			Bon2Vo vo = new Bon2Vo(row);
			this.addRow(vo);
		}
	}
}