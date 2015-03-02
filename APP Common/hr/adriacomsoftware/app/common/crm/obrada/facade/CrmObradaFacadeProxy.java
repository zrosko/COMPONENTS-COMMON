package hr.adriacomsoftware.app.common.crm.obrada.facade;

import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class CrmObradaFacadeProxy extends AS2FacadeProxy implements CrmObradaFacade {

    private static CrmObradaFacadeProxy _instance = null;

    private CrmObradaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.crm.obrada.facade.CrmObradaFacadeServer");
    }

    public static CrmObradaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new CrmObradaFacadeProxy();
        return _instance;
    }


	/************* FACADE PROXY  obrada ************/
	
	public AS2Record dodajObradu(AS2RecordList value) throws AS2Exception {
		value.setRemoteMethod("dodajObradu");
		AS2Record res = (AS2Record) execute(value);
		return res;
	}
}