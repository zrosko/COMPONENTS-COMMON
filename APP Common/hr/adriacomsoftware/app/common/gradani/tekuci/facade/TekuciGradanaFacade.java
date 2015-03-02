package hr.adriacomsoftware.app.common.gradani.tekuci.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.tekuci.dto.CekRs;
import hr.adriacomsoftware.app.common.gradani.tekuci.dto.CekVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;

public interface TekuciGradanaFacade {
    public abstract PartijaRs izvjestajPartijaPoKriteriju(OsnovniVo value) throws Exception;
    public abstract PartijaRs izvjestajNedozvoljenoPrekoracenje(OsnovniVo value) throws Exception;
    public abstract PartijaRs izvjestajPartijeBezPrometa(OsnovniVo value) throws Exception;
    public abstract PartijaRs izvjestajKamateNaknade(OsnovniVo value) throws Exception;
	public abstract OsobaRs procitajSveOsobe() throws Exception;
	public abstract OsobaRs pronadiSveOsobe(OsnovniVo value) throws Exception;
	public abstract PartijaRs izvjestajTrajniNalozi(OsnovniVo value) throws Exception;
	public abstract PartijaRs izvjestajRocnostNedozvoljenogPrekoracenja(OsnovniVo value) throws Exception;
	public abstract PartijaRs izvjestajNaplataRezervacija(OsnovniVo value) throws Exception;
	public abstract PartijaRs izvjestajCrnaLista(OsnovniVo value) throws Exception;
	public abstract PartijaRs izvjestajDnevneOpomene(OsnovniVo value) throws Exception;
	public abstract PartijaRs registarTekucihRacuna(OsnovniVo value) throws Exception;
	/* cekovi */
    public abstract CekVo dodajCek(CekVo value) throws Exception;
    public abstract CekVo azurirajCek(CekVo value) throws Exception; 
    public abstract CekVo brisiCek(CekVo value) throws Exception;
    public abstract CekRs procitajSveCekove(CekVo value) throws Exception; 
    public abstract CekVo brisiViseCekova(CekRs value) throws Exception; 
    public abstract CekRs procitajSveNeiskoristeCekoveZaPartiju(CekVo value) throws Exception;
}