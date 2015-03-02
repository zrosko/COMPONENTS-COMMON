package hr.adriacomsoftware.app.common.karticno.gr.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class McardGrZahtjevOcjenaRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public McardGrZahtjevOcjenaRs() {
		super();
	}

	public McardGrZahtjevOcjenaRs(AS2RecordList set) {
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		setProperties(set.getProperties());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			McardGrZahtjevOcjenaVo vo = new McardGrZahtjevOcjenaVo(row);
			this.addRow(vo);
		}
	}
}
