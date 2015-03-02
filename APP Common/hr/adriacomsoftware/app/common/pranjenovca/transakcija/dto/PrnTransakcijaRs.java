package hr.adriacomsoftware.app.common.pranjenovca.transakcija.dto;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

import java.util.Iterator;

public class PrnTransakcijaRs extends AS2RecordList {
	private static final long serialVersionUID = 1L;

	public PrnTransakcijaRs() {
		super();
	}

	public PrnTransakcijaRs(AS2RecordList set) {
		super(); // rows not set inside super constructor
		setColumnNames(set.getColumnNames());
		setColumnSizes(set.getColumnSizes());
		setMetaData(set.getMetaData());
		Iterator<AS2Record> E = set.getRows().iterator();
		while (E.hasNext()) {
			AS2Record row = E.next();
			PrnTransakcijaVo vo = new PrnTransakcijaVo(row);
			this.addRow(vo);
		}
	}
}