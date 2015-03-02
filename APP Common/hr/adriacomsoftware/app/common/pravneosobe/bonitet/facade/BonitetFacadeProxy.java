package hr.adriacomsoftware.app.common.pravneosobe.bonitet.facade;

import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class BonitetFacadeProxy extends AS2FacadeProxy implements BonitetFacade {

    private static BonitetFacadeProxy _instance = null;

    private BonitetFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.bonitet.facade.BonitetFacadeServer");
    }

    public static BonitetFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new BonitetFacadeProxy();
        return _instance;
    }

    public AS2RecordList citajBilancu(PravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("citajBilancu");
		return executeQuery(value);
    }
    public AS2RecordList citajRacunDobitiGubitka(PravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("citajRacunDobitiGubitka");
		return executeQuery(value);
    }
    public AS2RecordList citajStanjaZaReferat(PravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("citajStanjaZaReferat");
		return executeQuery(value);
    }
    public AS2RecordList citajBonitetZaBSA(AS2Record value) throws AS2Exception {
		value.setRemoteMethod("citajBonitetZaBSA");
		AS2RecordList res = (AS2RecordList) executeQuery(value);
		return res;
	 }
}