package hr.adriacomsoftware.app.common.studija.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class InvProizvodRs extends InvRs {
	private static final long serialVersionUID = 1L;

	public InvProizvodRs() {
		super();
	}

	public InvProizvodRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			InvProizvodVo vo = new InvProizvodVo(row);
			this.addRow(vo);
		}
	}
}