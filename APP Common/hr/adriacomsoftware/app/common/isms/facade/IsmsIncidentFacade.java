package hr.adriacomsoftware.app.common.isms.facade;

import hr.adriacomsoftware.app.common.isms.dto.IsmsIncidentRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsIncidentVo;

public interface IsmsIncidentFacade {
    //incident
    public abstract IsmsIncidentRs procitajSveIncidente(IsmsIncidentVo value) throws Exception;
    public abstract IsmsIncidentVo azurirajIncident(IsmsIncidentVo value) throws Exception;
    public abstract IsmsIncidentVo dodajIncident(IsmsIncidentVo value) throws Exception;
    public abstract IsmsIncidentVo brisiIncident(IsmsIncidentVo value) throws Exception;
}
