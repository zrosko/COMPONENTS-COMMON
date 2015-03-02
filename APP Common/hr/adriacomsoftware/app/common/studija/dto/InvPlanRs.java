package hr.adriacomsoftware.app.common.studija.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

/************* RS inv_plan ************/

public class InvPlanRs extends InvRs {
	private static final long serialVersionUID = 1L;

	public InvPlanRs() {
		super();
	}

	public InvPlanRs(AS2RecordList set) {
		super();
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			InvPlanVo vo = new InvPlanVo(row);
			this.addRow(vo);
		}
	}
}
