package hr.adriacomsoftware.app.common.obrtnici.facade;

import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaVo;

public interface ObrtnikFacade {
    public abstract PravnaOsobaRs citajSveObrtnike(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaRs pronadiSveObrtnike(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaVo citajObrtnika(PravnaOsobaVo value) throws Exception;  
}
