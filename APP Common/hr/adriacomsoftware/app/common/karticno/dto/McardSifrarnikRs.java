package hr.adriacomsoftware.app.common.karticno.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class McardSifrarnikRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public McardSifrarnikRs() {
		super();
	}

	public McardSifrarnikRs(AS2RecordList set) {
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		setProperties(set.getProperties());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			McardSifrarnikVo vo = new McardSifrarnikVo(row);
			this.addRow(vo);
		}
	}
}
