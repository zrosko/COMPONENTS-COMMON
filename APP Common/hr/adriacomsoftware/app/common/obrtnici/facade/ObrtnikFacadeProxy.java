package hr.adriacomsoftware.app.common.obrtnici.facade;


import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class ObrtnikFacadeProxy extends AS2FacadeProxy implements ObrtnikFacade {

    private static ObrtnikFacadeProxy _instance = null;

    private ObrtnikFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.obrtnici.facade.ObrtnikFacadeServer");
    }

    public static ObrtnikFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new ObrtnikFacadeProxy();
        return _instance;
    }

    public PravnaOsobaRs citajSveObrtnike(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSveObrtnike");
		PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public PravnaOsobaRs pronadiSveObrtnike(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveObrtnike");
		PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public PravnaOsobaVo citajObrtnika(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajObrtnika");
		PravnaOsobaVo res = (PravnaOsobaVo)  execute(value);
		return res;
    }
}