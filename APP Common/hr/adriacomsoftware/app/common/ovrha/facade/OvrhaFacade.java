package hr.adriacomsoftware.app.common.ovrha.facade;

import hr.adriacomsoftware.app.common.ovrha.dto.OvrhaRs;
import hr.adriacomsoftware.app.common.ovrha.dto.OvrhaVo;

public interface OvrhaFacade {
    public abstract OvrhaRs listajSveOvrhe(OvrhaVo value) throws Exception;
    public abstract OvrhaRs citajSveRacuneOvrhe(OvrhaVo value) throws Exception;
    public abstract OvrhaVo dodajOvrhu(OvrhaVo value) throws Exception;
    public abstract OvrhaVo azurirajOvrhu(OvrhaVo value) throws Exception;
    public abstract OvrhaVo brisiOvrhu(OvrhaVo value) throws Exception;
    public abstract OvrhaVo brisiRacun(OvrhaVo value) throws Exception;
    public abstract OvrhaVo zadnjiRedniBrojKorisnika(OvrhaVo value) throws Exception;
    public abstract OvrhaRs exportExcel(OvrhaVo value) throws Exception;
    public abstract OvrhaRs pronadiOvrhe(OvrhaVo value) throws Exception;
    public abstract OvrhaVo izracunajBrojPaketa(OvrhaVo value) throws Exception;

}
