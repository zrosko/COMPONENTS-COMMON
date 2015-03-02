package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class CmdbImovinaDodatakRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public CmdbImovinaDodatakRs() {
		super();
	}

	public CmdbImovinaDodatakRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			CmdbImovinaDodatakVo vo = new CmdbImovinaDodatakVo(row);
			this.addRow(vo);
		}
	}
}