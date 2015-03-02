package hr.adriacomsoftware.app.common.ovrha.facade;

import hr.adriacomsoftware.app.common.ovrha.dto.OvrhaRs;
import hr.adriacomsoftware.app.common.ovrha.dto.OvrhaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class OvrhaFacadeProxy extends AS2FacadeProxy implements OvrhaFacade {

    private static OvrhaFacadeProxy _instance = null;

    private OvrhaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.ovrha.facade.OvrhaFacadeServer");
    }

    public static OvrhaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new OvrhaFacadeProxy();
        return _instance;
    }
    public OvrhaRs listajSveOvrhe(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("listajSveOvrhe");
    	OvrhaRs res = (OvrhaRs) executeQuery(value);
    	return res;
     }
    public OvrhaRs citajSveRacuneOvrhe(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("citajSveRacuneOvrhe");
    	OvrhaRs res = (OvrhaRs) executeQuery(value);
    	return res;
    }
    public OvrhaVo dodajOvrhu(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajOvrhu");
    	OvrhaVo res = (OvrhaVo) execute(value);
    	return res;
    }
    public OvrhaVo azurirajOvrhu(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajOvrhu");
    	OvrhaVo res = (OvrhaVo) execute(value);
    	return res;
    }
    public OvrhaVo brisiOvrhu(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiOvrhu");
    	OvrhaVo res = (OvrhaVo) execute(value);
    	return res;
    }
    public OvrhaVo brisiRacun(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiRacun");
    	OvrhaVo res = (OvrhaVo) execute(value);
    	return res;
    }
    public OvrhaVo zadnjiRedniBrojKorisnika(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("zadnjiRedniBrojKorisnika");
    	OvrhaVo res = (OvrhaVo) execute(value);
    	return res;
    }

    public OvrhaRs exportExcel(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("exportExcel");
    	OvrhaRs res = (OvrhaRs) executeQuery(value);
    	return res;
    }

    public OvrhaRs pronadiOvrhe(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiOvrhe");
    	OvrhaRs res = (OvrhaRs) executeQuery(value);
    	return res;
     }

    public OvrhaVo izracunajBrojPaketa(OvrhaVo value) throws AS2Exception {
    	value.setRemoteMethod("izracunajBrojPaketa");
    	OvrhaVo res = (OvrhaVo) execute(value);
    	return res;
    }


}