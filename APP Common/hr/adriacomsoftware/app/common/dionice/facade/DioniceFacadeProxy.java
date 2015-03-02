package hr.adriacomsoftware.app.common.dionice.facade;


import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class DioniceFacadeProxy extends AS2FacadeProxy implements DioniceFacade {

    private static DioniceFacadeProxy _instance = null;

    private DioniceFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.dionice.facade.DioniceFacadeServer");
    }

    public static DioniceFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new DioniceFacadeProxy();
        return _instance;
    }

    public OsnovniRs dioniceRekapitulacija1(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("dioniceRekapitulacija1");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs dioniceRekapitulacija2(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("dioniceRekapitulacija2");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs dioniceStanjeNaDan(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("dioniceStanjeNaDan");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
    public OsnovniRs dioniceUsporednoStanje(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("dioniceUsporednoStanje");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
    public OsnovniRs citajDionice(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("citajDionice");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }    
    public OsnovniRs pronadiDionice(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiDionice");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
}