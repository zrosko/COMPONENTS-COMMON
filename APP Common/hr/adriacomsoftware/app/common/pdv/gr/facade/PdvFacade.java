package hr.adriacomsoftware.app.common.pdv.gr.facade;

import hr.adriacomsoftware.app.common.pdv.gr.dto.PdvRs;
import hr.adriacomsoftware.app.common.pdv.gr.dto.PdvVo;

public interface PdvFacade {
    public abstract PdvRs listajSvePdv(PdvVo value) throws Exception;
    public abstract PdvRs pronadiPdv(PdvVo value) throws Exception;
    public abstract PdvVo citajPdv(PdvVo value) throws Exception;
    public abstract PdvVo dodajPdv(PdvVo value) throws Exception;
    public abstract PdvVo azurirajPdv(PdvVo value) throws Exception;
    public abstract PdvVo brisiPdv(PdvVo value) throws Exception;
    public abstract PdvVo pronadiVrstuUslugeDetalji(PdvVo value)throws Exception;
}
