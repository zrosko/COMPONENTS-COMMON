package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class CmdbPromjenaPrivitakRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;
    public CmdbPromjenaPrivitakRs() {
        super();
    }
    public CmdbPromjenaPrivitakRs(AS2RecordList set) {
        super(); //rows not set inside super constructor
        setColumnNames(set.getColumnNames());
        setColumnSizes(set.getColumnSizes());
        setMetaData(set.getMetaData());
        Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
            CmdbPromjenaPrivitakVo vo = new CmdbPromjenaPrivitakVo(row);
            this.addRow(vo);
        }
    }
}