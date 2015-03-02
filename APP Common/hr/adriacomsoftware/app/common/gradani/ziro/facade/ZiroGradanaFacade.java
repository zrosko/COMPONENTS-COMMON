package hr.adriacomsoftware.app.common.gradani.ziro.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;

public interface ZiroGradanaFacade {
    public abstract PartijaRs izvjestajPartijaPoKriteriju(OsnovniVo value) throws Exception;
    public abstract PartijaRs izvjestajPartijeBezPrometa(OsnovniVo value) throws Exception;
    public abstract PartijaRs izvjestajKamateNaknade(OsnovniVo value) throws Exception;
    public abstract PartijaRs izvjestajZiroSaPrometom(OsnovniVo value) throws Exception;
    public abstract PartijaRs izvjestajZiroKamatneStope(OsnovniVo value) throws Exception;
    public abstract PartijaRs izvjestajZiroBlokirani(OsnovniVo value) throws Exception;
    public abstract OsobaRs procitajSveOsobe() throws Exception;
	public abstract OsobaRs pronadiSveOsobe(OsnovniVo value) throws Exception;
	public abstract PartijaRs registarZiroRacuna(OsnovniVo value) throws Exception;
}
