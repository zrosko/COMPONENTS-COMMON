package hr.adriacomsoftware.app.common.sukl.facade;


import hr.adriacomsoftware.app.common.sukl.dto.SuklAktRs;
import hr.adriacomsoftware.app.common.sukl.dto.SuklAktVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class SukladnostFacadeProxy extends AS2FacadeProxy implements SukladnostFacade {

    private static SukladnostFacadeProxy _instance = null;

    private SukladnostFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.sukl.facade.SukladnostFacadeServer");
    }

    public static SukladnostFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new SukladnostFacadeProxy();
        return _instance;
    }
    public SuklAktVo brisiSuklAkt(SuklAktVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiSuklAkt");
    	SuklAktVo res = (SuklAktVo) execute(value);
    	return res;
    }
    public SuklAktVo dodajSuklAkt(SuklAktVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajSuklAkt");
    	SuklAktVo res = (SuklAktVo) execute(value);
    	return res;
    }
    public SuklAktVo azurirajSuklAkt(SuklAktVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajSuklAkt");
    	SuklAktVo res = (SuklAktVo) execute(value);
    	return res;
    }
    public SuklAktRs procitajSveSuklAkt(SuklAktVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveSuklAkt");
    	SuklAktRs res = (SuklAktRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveSuklAkt() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveSuklAkt");
    	return res;
    }
    public SuklAktRs pretraziSuklAkt(SuklAktVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziSveSuklAkt");
    	SuklAktRs res = (SuklAktRs) executeQuery(value);
    	return res;
    }
}