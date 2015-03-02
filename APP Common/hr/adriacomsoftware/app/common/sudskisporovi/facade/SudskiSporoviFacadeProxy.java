package hr.adriacomsoftware.app.common.sudskisporovi.facade;


import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class SudskiSporoviFacadeProxy extends AS2FacadeProxy implements SudskiSporoviFacade {

    private static SudskiSporoviFacadeProxy _instance = null;
    public static SudskiSporoviFacadeProxy getInstance() {
        if (_instance == null) {
            _instance = new SudskiSporoviFacadeProxy();
        }
        return _instance;
    }
    private SudskiSporoviFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.sudskisporovi.facade.SudskiSporoviFacadeServer");
    }
    public OsnovniRs pronadiSveSudove(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSveSudove");
        OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    public OsnovniRs pronadiSveBiljeznike(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSveBiljeznike");
        OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
	public OsnovniRs pronadiSveSudoveJavneBiljeznikeInstitucije(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSveSudoveJavneBiljeznikeInstitucije");
        OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
	}
}