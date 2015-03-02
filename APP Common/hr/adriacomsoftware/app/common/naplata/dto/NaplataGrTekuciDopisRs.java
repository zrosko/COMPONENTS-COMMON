package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class NaplataGrTekuciDopisRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public NaplataGrTekuciDopisRs() {
		super();
	}

	public NaplataGrTekuciDopisRs(AS2RecordList set) {
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			NaplataGrTekuciDopisVo vo = new NaplataGrTekuciDopisVo(row);
			this.addRow(vo);
		}
	}
}