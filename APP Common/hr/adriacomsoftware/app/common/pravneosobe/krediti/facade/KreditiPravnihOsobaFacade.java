package hr.adriacomsoftware.app.common.pravneosobe.krediti.facade;

import hr.adriacomsoftware.app.common.jb.dto.IzvjestajRs;
import hr.adriacomsoftware.app.common.jb.dto.IzvjestajVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.IzvodVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.KreditniProgramRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.KreditniProgramVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OpomenaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OpomenaVo;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OtplatniPlanRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OtplatniPlanVo;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.PartijaKreditaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.PartijaKreditaVo;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.RocnostRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.RocnostVo;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

public interface KreditiPravnihOsobaFacade {
    public abstract OsnovniRs izvjestajRezervacije(OsnovniVo value) throws Exception;
    public abstract IzvjestajRs izvjestajPregledDospjelihObveza(IzvjestajVo value) throws Exception;
    public abstract OpomenaRs iskljuciOpomene(OpomenaVo value) throws Exception;
    public abstract OpomenaRs ukljuciOpomene(OpomenaVo value) throws Exception;
    public abstract OpomenaRs procitajSveObradeOpomena(OpomenaVo value) throws Exception;
	public abstract OpomenaRs izvjestajOpomeneKredita(OpomenaVo value) throws Exception;
	public abstract AS2RecordList temeljnica(AS2Record value) throws Exception;
	public abstract RocnostRs izvjestajRocnostiOtplateKonto(RocnostVo value) throws Exception;
	public abstract RocnostRs izvjestajRocnostiOtplateKomitent(RocnostVo value) throws Exception;
	public abstract PravnaOsobaRs procitajSvePravneOsobeKredite() throws Exception;
	public abstract PravnaOsobaRs pronadiSvePravneOsobeKredite(OsnovniVo value) throws Exception;
	public abstract AS2RecordList izvjestajIzvodiKredita(IzvodVo value) throws Exception;
	public abstract KreditniProgramRs izvjestajKreditniProgram(KreditniProgramVo value) throws Exception;
	public abstract OsnovniRs izvjestajPrometNaDan26017(OsnovniVo value) throws Exception;
	public abstract IzvjestajRs izvjestajStanjeKreditaPoKomitentimaSuzeni(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs izvjestajStanjeKreditaPoKomitentima(IzvjestajVo value) throws Exception;
	public abstract OsnovniRs izvjestajHamagKrediti(OsnovniVo value) throws Exception;
	public abstract PartijaRs izvjestajKreditniProgramSvePartije(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs izvjestajRevalorizacijaPoKontima(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs izvjestajRevalorizacijaPoPartijama(IzvjestajVo value) throws Exception;
	public abstract OsnovniRs izvjestajKamatniOstaliPrihodiPoKontu(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajKamatniOstaliPrihodiZbirno(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajNovoOdobreniKrediti(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajPromjenaFazeKredita(OsnovniVo value) throws Exception;
	//detalji
	public abstract OsnovniRs pregledUgovora(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pregledPrometa(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pregledPrometaZaPeriod(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pregledBoniteta(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pregledStanja(OsnovniVo value) throws Exception;
	//otplatni plan
	public abstract OtplatniPlanRs izradiOtplatniPlan(OtplatniPlanVo value) throws Exception;
	public abstract IzvjestajRs izvjestajPoveznicaPoPartiji(IzvjestajVo value) throws Exception;
	//račun dobiti gubitka
	public abstract IzvjestajRs izvjestajRacunDobitiGubitka(IzvjestajVo value) throws Exception;
	//analiza kredita
	public abstract PartijaKreditaRs izvjestajAnalizaKredita(PartijaKreditaVo value) throws Exception;
	public abstract IzvjestajRs izvjestajKreditiFazaDva(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs izvjestajKreditiFazaCetiri(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs izvjestajKreditiFazaTri(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs izvjestajGarancijeFazaTri(IzvjestajVo value) throws Exception;
	//tuda knjizenja
	public abstract OsnovniRs izvjestajTudaKnjizenja(OsnovniVo value) throws Exception;
	//izvjestajPriljeviPoKreditimaBuduci, izvjestajPriljeviPoKreditima, izvjestajManipulativniTroskoviKnjizenja
	//izvjestajManipulativniTroskovi
	public abstract OsnovniRs izvjestajPriljeviPoKreditimaBuduci(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajPriljeviPoKreditima(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajManipulativniTroskoviKnjizenja(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajManipulativniTroskovi(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajBrutoBilanca(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajNovootvoreniKreditiZaRazdoblje(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajNovootvoreneGarancijeZaRazdoblje(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajSaldoKunskihRacunaKredita(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajIzdaniKrediti(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajSaldaKontaKnjizenja(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajSaldaKontaSuspendiranihPrihoda(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajKreditiKnjizenjaNedospjeleGlavnice(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajIOSObrazac(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajRocnostiOtplate(OsnovniVo value) throws Exception;
}