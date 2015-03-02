package hr.adriacomsoftware.app.common.naplata.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentBiljeskaRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentBiljeskaVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentKontaktRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentKontaktVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentOtplatniPlanRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentOtplatniPlanVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentStatusRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentStatusVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface NaplataFacade {
    public abstract NaplataRs citajSpis(NaplataVo value) throws Exception;
    public abstract NaplataRs listajSveSpise(NaplataVo value) throws Exception;
    public abstract NaplataRs pronadiSpise(NaplataVo value) throws Exception;
    public abstract NaplataRs listajSveBiljeske(NaplataVo value) throws Exception;
    public abstract NaplataVo citajBiljesku(NaplataVo value) throws Exception;
    public abstract NaplataVo dodajBiljesku(NaplataVo value) throws Exception;
    public abstract NaplataVo azurirajBiljesku(NaplataVo value) throws Exception;
    public abstract NaplataVo brisiBiljesku(NaplataVo value) throws Exception;
    public abstract NaplataVo brisiViseBiljeski(NaplataRs value) throws Exception;
    //naplata klijent
	public abstract NaplataKlijentRs procitajKlijenteNaplate(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentRs pronadiKlijenteNaplate(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentRs filtrirajKlijente(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentVo dodajKlijentaNaplate(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentVo azurirajKlijentaNaplate(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentVo dodajNoveKlijente(AS2RecordList value) throws Exception;
	public abstract void brisiViseKlijenata(AS2RecordList value)throws Exception;
	//kontakt
	public abstract NaplataKlijentKontaktVo azurirajKontakt(NaplataKlijentKontaktVo value) throws Exception;
	public abstract NaplataKlijentKontaktRs procitajSveKontakte(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentKontaktVo dodajKontakt(NaplataKlijentKontaktVo value) throws Exception;
	public abstract NaplataKlijentKontaktVo brisiKontakt(NaplataKlijentKontaktVo value) throws Exception;
	public abstract NaplataKlijentKontaktVo brisiViseKontakta(NaplataKlijentKontaktRs value) throws Exception;
	//biljeska
	public abstract NaplataKlijentBiljeskaVo azurirajBiljesku(NaplataKlijentBiljeskaVo value) throws Exception;
	public abstract NaplataKlijentBiljeskaRs procitajSveBiljeske(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentBiljeskaVo dodajBiljesku(NaplataKlijentBiljeskaVo value) throws Exception;
	public abstract NaplataKlijentBiljeskaVo brisiBiljesku(NaplataKlijentBiljeskaVo value) throws Exception;
	public abstract NaplataKlijentBiljeskaVo brisiViseBiljeskiKlijenta(NaplataKlijentBiljeskaRs value) throws Exception;
	//status
	public abstract NaplataKlijentStatusVo azurirajStatus(NaplataKlijentStatusVo value) throws Exception;
	public abstract NaplataKlijentStatusRs procitajSveStatuse(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentStatusVo dodajStatus(NaplataKlijentStatusVo value) throws Exception;
	public abstract NaplataKlijentStatusVo brisiStatus(NaplataKlijentStatusVo value) throws Exception;
	public abstract NaplataKlijentStatusVo brisiViseStatusaKlijenta(NaplataKlijentStatusRs value) throws Exception;
	//izvješća
	public abstract NaplataKlijentRs izvjesceKlijentaNaplate(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentRs izvjesceNaplateSkupno(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentRs izvjesceRocnostGradani(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentRs izvjesceRocnostPravneOsobe(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentRs izvjesceZaduzenostiGradani(NaplataKlijentVo value)throws Exception;
	public abstract NaplataKlijentRs izvjesceZaduzenostiPravneOsobe(NaplataKlijentVo value)throws Exception;
	public abstract NaplataKlijentRs izvjesceGradaniStanjePoRacunima(NaplataKlijentVo value)throws Exception;
	public abstract NaplataKlijentRs izvjescePravneOsobeStanjePoRacunima(NaplataKlijentVo value) throws Exception;
	//prome po kreditim gradana klijenata naplate
	public abstract AS2RecordList prometProlaznaKontaKreditaGradana(OsnovniVo value) throws Exception;
	//naplata ssp
	public abstract NaplataKlijentRs procitajKlijenteNaplateSSP(NaplataKlijentVo value) throws Exception;
	public abstract NaplataKlijentRs pronadiKlijenteNaplateSSP(NaplataKlijentVo value) throws Exception;

	public abstract NaplataRs procitajPovijestPolja(NaplataVo value) throws Exception;
	public abstract NaplataRs izvjestaji(NaplataVo value) throws Exception;
	public abstract NaplataRs izvjestajReferat(NaplataVo value) throws Exception;
	//privitak
	public abstract NaplataVo dodajPrivitak(NaplataVo value) throws Exception;
    public abstract NaplataVo citajPrivitak(NaplataVo value) throws Exception;
    public abstract NaplataVo brisiPrivitak(NaplataVo value) throws Exception;
    //otplatni plan
	public abstract NaplataKlijentOtplatniPlanVo azurirajOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws Exception;
	public abstract NaplataKlijentOtplatniPlanRs procitajOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws Exception;
	public abstract NaplataKlijentOtplatniPlanVo dodajOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws Exception;
	public abstract NaplataKlijentOtplatniPlanVo brisiOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws Exception;
	public abstract NaplataKlijentOtplatniPlanVo brisiViseOtplatnihPlanova(NaplataKlijentOtplatniPlanRs value) throws Exception;
	public abstract NaplataKlijentOtplatniPlanVo izradiOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws Exception;
	//dogovor
	public abstract NaplataKlijentBiljeskaRs procitajMogucePotpisnikeNagodbe(NaplataKlijentBiljeskaVo value) throws Exception;
	public abstract NaplataKlijentBiljeskaRs procitajSifre(NaplataKlijentBiljeskaVo value) throws Exception;
}
