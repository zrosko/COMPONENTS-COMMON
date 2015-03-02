package hr.adriacomsoftware.app.common.pdv.ostaliposlovi.facade;

import hr.adriacomsoftware.app.common.pdv.ostaliposlovi.dto.PdvOstaliPosloviRs;
import hr.adriacomsoftware.app.common.pdv.ostaliposlovi.dto.PdvOstaliPosloviVo;

public interface PdvOstaliPosloviFacade {
    public abstract PdvOstaliPosloviRs listajSvePdv(PdvOstaliPosloviVo value) throws Exception;
    public abstract PdvOstaliPosloviRs pronadiPdv(PdvOstaliPosloviVo value) throws Exception;
    public abstract PdvOstaliPosloviVo citajPdv(PdvOstaliPosloviVo value) throws Exception;
    public abstract PdvOstaliPosloviVo dodajPdv(PdvOstaliPosloviVo value) throws Exception;
    public abstract PdvOstaliPosloviVo azurirajPdv(PdvOstaliPosloviVo value) throws Exception;
    public abstract PdvOstaliPosloviVo brisiPdv(PdvOstaliPosloviVo value) throws Exception;
}
