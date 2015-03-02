package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class CmdbPromjenaRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;
    public CmdbPromjenaRs() {
        super();
    }
    public CmdbPromjenaRs(AS2RecordList set) {
        super(); //rows not set inside super constructor
        setColumnNames(set.getColumnNames());
        setColumnSizes(set.getColumnSizes());
        setMetaData(set.getMetaData());
        Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
            CmdbPromjenaVo vo = new CmdbPromjenaVo(row);
            this.addRow(vo);
        }
    }
}