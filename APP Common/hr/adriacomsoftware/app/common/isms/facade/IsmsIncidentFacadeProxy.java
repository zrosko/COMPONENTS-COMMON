package hr.adriacomsoftware.app.common.isms.facade;


import hr.adriacomsoftware.app.common.isms.dto.IsmsIncidentRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsIncidentVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class IsmsIncidentFacadeProxy extends AS2FacadeProxy implements IsmsIncidentFacade {

    private static IsmsIncidentFacadeProxy _instance = null;

    private IsmsIncidentFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.isms.facade.IsmsIncidentFacadeServer");
    }

    public static IsmsIncidentFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new IsmsIncidentFacadeProxy();
        return _instance;
    }
    public IsmsIncidentRs procitajSveIncidente(IsmsIncidentVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveIncidente");
		IsmsIncidentRs res = (IsmsIncidentRs) executeQuery(value);
		return res;
    }

    public IsmsIncidentVo azurirajIncident(IsmsIncidentVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajIncident");
		IsmsIncidentVo res = (IsmsIncidentVo)  execute(value);
		return res;
    }

    public IsmsIncidentVo dodajIncident(IsmsIncidentVo value) throws AS2Exception {
		value.setRemoteMethod("dodajIncident");
		IsmsIncidentVo res = (IsmsIncidentVo)  execute(value);
		return res;
    }

    public IsmsIncidentVo brisiIncident(IsmsIncidentVo value) throws AS2Exception {
		value.setRemoteMethod("brisiIncident");
		IsmsIncidentVo res = (IsmsIncidentVo)  execute(value);
		return res;
    } 
}