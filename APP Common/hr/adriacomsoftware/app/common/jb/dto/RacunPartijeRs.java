package hr.adriacomsoftware.app.common.jb.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class RacunPartijeRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public RacunPartijeRs() {
		super();
	}

	public RacunPartijeRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			RacunPartijeVo vo = new RacunPartijeVo(row);
			this.addRow(vo);
		}
	}
}