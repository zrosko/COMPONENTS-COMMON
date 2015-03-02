package hr.adriacomsoftware.app.common.pravneosobe.platnipromet.facade;

import hr.adriacomsoftware.app.common.jb.dto.IzvjestajRs;
import hr.adriacomsoftware.app.common.jb.dto.IzvjestajVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.NaplataMjenicaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.NaplataMjenicaVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;

public interface PlatniPrometPravnihOsobaFacade {
	public abstract PravnaOsobaRs procitajSvePravneOsobePlatniPromet() throws Exception;
	public abstract PravnaOsobaRs pronadiSvePravneOsobePlatniPromet(OsnovniVo value) throws Exception;
	public abstract IzvjestajRs pregledPrometaPoPartiji(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs poslovniRacun(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs poslovniRacunZaPartiju(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs poslovniRacuniNaknada(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs poslovniRacunMjesecno(IzvjestajVo value) throws Exception;
	public abstract OsnovniRs izvjestajZatezneKamate(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajMjesecnaRekapitulacija(OsnovniVo value) throws Exception;
	public abstract IzvjestajRs prosjecnoStanjePartijaPoMaticnomBroju(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs prosjecnoStanjePartije(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs poslovniRacun500000(IzvjestajVo value) throws Exception;
	public abstract NaplataMjenicaVo dodajMjenicu(NaplataMjenicaVo value) throws Exception;
	public abstract NaplataMjenicaVo azurirajMjenicu(NaplataMjenicaVo value) throws Exception;
	public abstract NaplataMjenicaRs procitajSveMjenice(NaplataMjenicaVo value) throws Exception;
	public abstract NaplataMjenicaRs pronadiMjenice(NaplataMjenicaVo value) throws Exception;
	public abstract NaplataMjenicaVo brisiMjenicu(NaplataMjenicaVo value) throws Exception;
	public abstract NaplataMjenicaVo brisiViseMjenica(NaplataMjenicaRs value) throws Exception;
	public abstract NaplataMjenicaRs izvjestaji(NaplataMjenicaVo value) throws Exception;
}