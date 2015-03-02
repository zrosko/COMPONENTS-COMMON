package hr.adriacomsoftware.app.common.naplata.facade;

import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrKreditiRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrKreditiVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class NaplataGrKreditiFacadeProxy extends AS2FacadeProxy implements NaplataGrKreditiFacade {

    private static NaplataGrKreditiFacadeProxy _instance = null;

    private NaplataGrKreditiFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.naplata.facade.NaplataGrKreditiFacadeServer");
    }

    public static NaplataGrKreditiFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new NaplataGrKreditiFacadeProxy();
        return _instance;
    }

    /************* FACADE PROXY  naplata_gr_krediti ************/

    public NaplataGrKreditiVo brisiNaplataGrKrediti(NaplataGrKreditiVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiNaplataGrKrediti");
    	NaplataGrKreditiVo res = (NaplataGrKreditiVo) execute(value);
    	return res;
    }
    public NaplataGrKreditiVo dodajNaplataGrKrediti(NaplataGrKreditiVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajNaplataGrKrediti");
    	NaplataGrKreditiVo res = (NaplataGrKreditiVo) execute(value);
    	return res;
    }
    public NaplataGrKreditiVo azurirajNaplataGrKrediti(NaplataGrKreditiVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajNaplataGrKrediti");
    	NaplataGrKreditiVo res = (NaplataGrKreditiVo) execute(value);
    	return res;
    }
    public NaplataGrKreditiRs procitajSveNaplataGrKrediti(NaplataGrKreditiVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveNaplataGrKrediti");
    	NaplataGrKreditiRs res = (NaplataGrKreditiRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveNaplataGrKrediti() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveNaplataGrKrediti");
    	return res;
    }
    public NaplataGrKreditiRs pretraziNaplataGrKrediti(NaplataGrKreditiVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziNaplataGrKrediti");
    	NaplataGrKreditiRs res = (NaplataGrKreditiRs) executeQuery(value);
    	return res;
    }
    
    
    
	public NaplataGrKreditiRs procitajPovijestPolja(NaplataGrKreditiVo value) throws AS2Exception {
		value.setRemoteMethod("procitajPovijestPolja");
		NaplataGrKreditiRs res = (NaplataGrKreditiRs) executeQuery(value);
    	return res;
	}

	public NaplataGrKreditiRs izvjestaji(NaplataGrKreditiVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestaji");
		NaplataGrKreditiRs res = (NaplataGrKreditiRs) executeQuery(value);
    	return res;
	}

	public NaplataGrKreditiRs izvjestajReferat(NaplataGrKreditiVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajReferat");
		NaplataGrKreditiRs res = (NaplataGrKreditiRs) executeQuery(value);
    	return res;
	}
}