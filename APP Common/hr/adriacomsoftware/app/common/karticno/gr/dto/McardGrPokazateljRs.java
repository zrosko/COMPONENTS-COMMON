package hr.adriacomsoftware.app.common.karticno.gr.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class McardGrPokazateljRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public McardGrPokazateljRs() {
		super();
	}

	public McardGrPokazateljRs(AS2RecordList set) {
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		setProperties(set.getProperties());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			McardGrPokazateljVo vo = new McardGrPokazateljVo(row);
			this.addRow(vo);
		}
	}
}
