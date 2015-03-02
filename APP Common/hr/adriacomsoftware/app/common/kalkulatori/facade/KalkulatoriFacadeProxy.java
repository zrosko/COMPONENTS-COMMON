package hr.adriacomsoftware.app.common.kalkulatori.facade;

import hr.adriacomsoftware.app.common.kalkulatori.dto.FinancijskiKalkulatorVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class KalkulatoriFacadeProxy extends AS2FacadeProxy implements KalkulatoriFacade {

    private static KalkulatoriFacadeProxy _instance = null;

    private KalkulatoriFacadeProxy() {
    	setRemoteObject("hr.adriacomsoftware.app.server.kalkulatori.facade.KalkulatoriFacadeServer");
    }

    public static KalkulatoriFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new KalkulatoriFacadeProxy();
        return _instance;
    }

    public FinancijskiKalkulatorVo izracunajZateznukamatu(FinancijskiKalkulatorVo value) throws AS2Exception {
    	value.setRemoteMethod("izracunajZateznukamatu");
    	FinancijskiKalkulatorVo res = (FinancijskiKalkulatorVo) execute(value);
    	return res;
    }

	public AS2RecordList izracunajPlanOtplateEks(FinancijskiKalkulatorVo value) throws AS2Exception {
    	value.setRemoteMethod("izracunajPlanOtplateEks");
    	return executeQuery(value);
	}

	public AS2RecordList izracunajPlanOtplate(FinancijskiKalkulatorVo value) throws AS2Exception {
    	value.setRemoteMethod("izracunajPlanOtplate");
    	return executeQuery(value);
	}

	public AS2RecordList izracunajKamatu(FinancijskiKalkulatorVo value)	throws Exception {
		value.setRemoteMethod("izracunajKamatu");
    	return executeQuery(value);
	}
}