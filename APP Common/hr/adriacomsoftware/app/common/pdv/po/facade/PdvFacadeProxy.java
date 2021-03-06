package hr.adriacomsoftware.app.common.pdv.po.facade;

import hr.adriacomsoftware.app.common.pdv.po.dto.PdvRs;
import hr.adriacomsoftware.app.common.pdv.po.dto.PdvVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class PdvFacadeProxy extends AS2FacadeProxy implements PdvFacade {

    private static PdvFacadeProxy _instance = null;

    private PdvFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pdv.po.facade.PdvFacadeServer");
    }

    public static PdvFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new PdvFacadeProxy();
        return _instance;
    }
    public PdvRs listajSvePdv(PdvVo value) throws AS2Exception {
    	value.setRemoteMethod("listajSvePdv");
    	PdvRs res = (PdvRs) executeQuery(value);
    	return res;
     }

    public PdvRs pronadiPdv(PdvVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiPdv");
    	PdvRs res = (PdvRs) executeQuery(value);
    	return res;
     }

    public PdvVo citajPdv(PdvVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPdv");
    	PdvVo res = (PdvVo) execute(value);
    	return res;
    }
    
    public PdvVo dodajPdv(PdvVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPdv");
    	PdvVo res = (PdvVo) execute(value);
    	return res;
    }

    public PdvVo azurirajPdv(PdvVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajPdv");
    	PdvVo res = (PdvVo) execute(value);
    	return res;
    }
    public PdvVo brisiPdv(PdvVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPdv");
    	PdvVo res = (PdvVo) execute(value);
    	return res;
    }

    public AS2RecordList listajSvaProtukonta() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvaProtukonta");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvaProtukonta");
		    addToCache("listajSvaProtukonta", rs);
		}
		return rs;
    }
    public String pronadiProtukontoZaKonto(String value) throws AS2Exception {
	    AS2RecordList rs = listajSvaProtukonta();
	    rs = rs.doSearch("broj_konta","=",value);
	    if(rs.size()>0)
	        return rs.getRowAt(0).get("protu_konto");
	    return "";
    }
    public AS2RecordList listajVrsteUsluga() throws AS2Exception {
	    AS2RecordList rs = listajSvaProtukonta();
        return rs;
    }
    public String pronadiKontoZaVrstuUsluge(String value) throws AS2Exception {
	    AS2RecordList rs = listajSvaProtukonta();
	    rs = rs.doSearch("vrsta_usluge","=",value);
	    if(rs.size()>0)
	        return rs.getRowAt(0).get("broj_konta");
	    return null;
    }
}