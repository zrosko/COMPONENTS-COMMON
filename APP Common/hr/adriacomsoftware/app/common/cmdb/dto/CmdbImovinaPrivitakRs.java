package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class CmdbImovinaPrivitakRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public CmdbImovinaPrivitakRs() {
		super();
	}

	public CmdbImovinaPrivitakRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			CmdbImovinaPrivitakVo vo = new CmdbImovinaPrivitakVo(row);
			this.addRow(vo);
		}
	}
}