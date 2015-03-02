package hr.adriacomsoftware.app.common.gradani.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.dto.OsobaVo;
import hr.adriacomsoftware.app.common.gradani.dto.VezanaOsobaRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;

public interface GradaniFacade {
    public abstract PartijaRs citajSvePartijeOsobe(OsobaVo value) throws Exception;
    public abstract VezanaOsobaRs citajSvePovezaneOsobeOsobe(OsobaVo value) throws Exception;
    public abstract OsobaRs citajPodatkeKlijenta(OsobaVo value) throws Exception;
    public abstract OsnovniRs citajPrometeOsobe(OsnovniVo value) throws Exception;
}
