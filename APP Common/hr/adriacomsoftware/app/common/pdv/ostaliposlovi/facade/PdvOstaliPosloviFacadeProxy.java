package hr.adriacomsoftware.app.common.pdv.ostaliposlovi.facade;

import hr.adriacomsoftware.app.common.pdv.ostaliposlovi.dto.PdvOstaliPosloviRs;
import hr.adriacomsoftware.app.common.pdv.ostaliposlovi.dto.PdvOstaliPosloviVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class PdvOstaliPosloviFacadeProxy extends AS2FacadeProxy implements PdvOstaliPosloviFacade {

    private static PdvOstaliPosloviFacadeProxy _instance = null;

    private PdvOstaliPosloviFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pdv.ostaliposlovi.facade.PdvOstaliPosloviFacadeServer");
    }

    public static PdvOstaliPosloviFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new PdvOstaliPosloviFacadeProxy();
        return _instance;
    }
    public PdvOstaliPosloviRs listajSvePdv(PdvOstaliPosloviVo value) throws AS2Exception {
    	value.setRemoteMethod("listajSvePdv");
    	PdvOstaliPosloviRs res = (PdvOstaliPosloviRs) executeQuery(value);
    	return res;
     }

    public PdvOstaliPosloviRs pronadiPdv(PdvOstaliPosloviVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiPdv");
    	PdvOstaliPosloviRs res = (PdvOstaliPosloviRs) executeQuery(value);
    	return res;
     }

    public PdvOstaliPosloviVo citajPdv(PdvOstaliPosloviVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPdv");
    	PdvOstaliPosloviVo res = (PdvOstaliPosloviVo) execute(value);
    	return res;
    }
    
    public PdvOstaliPosloviVo dodajPdv(PdvOstaliPosloviVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPdv");
    	PdvOstaliPosloviVo res = (PdvOstaliPosloviVo) execute(value);
    	return res;
    }

    public PdvOstaliPosloviVo azurirajPdv(PdvOstaliPosloviVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajPdv");
    	PdvOstaliPosloviVo res = (PdvOstaliPosloviVo) execute(value);
    	return res;
    }
    public PdvOstaliPosloviVo brisiPdv(PdvOstaliPosloviVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPdv");
    	PdvOstaliPosloviVo res = (PdvOstaliPosloviVo) execute(value);
    	return res;
    }

}