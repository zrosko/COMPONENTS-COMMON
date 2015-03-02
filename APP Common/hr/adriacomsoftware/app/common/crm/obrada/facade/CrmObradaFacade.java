package hr.adriacomsoftware.app.common.crm.obrada.facade;

import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

public interface CrmObradaFacade {
	public abstract AS2Record dodajObradu(AS2RecordList value) throws Exception;
}
