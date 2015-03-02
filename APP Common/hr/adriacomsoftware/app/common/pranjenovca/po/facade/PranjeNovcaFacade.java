package hr.adriacomsoftware.app.common.pranjenovca.po.facade;

import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPoPovezanaOsobaRs;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPoPovezanaOsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPoRacunRs;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPoRacunVo;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPravnaOsobaRs;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPravnaOsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPrivitakRs;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPrivitakVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaVo;

public interface PranjeNovcaFacade {
    
    //pravna osoba
    public abstract PravnaOsobaRs procitajSveOsobe(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaRs pronadiOsobe(PravnaOsobaVo PravnaOsobaVo) throws Exception;
    public abstract PravnaOsobaRs izvjestajiPravneOsobe(PravnaOsobaVo value) throws Exception;
    //clanovi
//  povezana osoba
	public abstract PrnPoPovezanaOsobaVo azurirajPovezanuOsobu(PrnPoPovezanaOsobaVo value) throws Exception;
	public abstract PrnPoPovezanaOsobaRs procitajSvePovezaneOsobe(PrnPoPovezanaOsobaVo value) throws Exception;
	public abstract PrnPoPovezanaOsobaRs procitajSvePovezaneOsobePOVIJEST(PrnPoPovezanaOsobaVo value) throws Exception;
	public abstract PrnPoPovezanaOsobaVo dodajPovezanuOsobu(PrnPoPovezanaOsobaVo value) throws Exception;
	public abstract PrnPoPovezanaOsobaVo brisiPovezanuOsobu(PrnPoPovezanaOsobaVo value) throws Exception;
    //račun
    public abstract PrnPoRacunVo citajRacun(PrnPoRacunVo value) throws Exception;
    public abstract PrnPoRacunVo azurirajRacun(PrnPoRacunVo value) throws Exception;
    public abstract PrnPoRacunVo dodajRacun(PrnPoRacunVo value) throws Exception;
    public abstract PrnPoRacunRs listaRacuna(PrnPoRacunVo value) throws Exception;
    //upitnik
    public abstract PrnPravnaOsobaVo azurirajZavrsnePodatkeUpitnika(PrnPravnaOsobaVo value) throws Exception;
    public abstract PrnPravnaOsobaRs procitajSveUpitnike(PrnPravnaOsobaVo value) throws Exception;
    public abstract PrnPravnaOsobaVo citajUpitnik(PrnPravnaOsobaVo value) throws Exception;
    public abstract PrnPravnaOsobaRs pronadiUpitnike(PrnPravnaOsobaVo value) throws Exception;
    public abstract PrnPravnaOsobaVo azurirajUpitnik(PrnPravnaOsobaVo value) throws Exception;
    public abstract PrnPravnaOsobaVo dodajUpitnik(PrnPravnaOsobaVo value) throws Exception;
    public abstract PrnPravnaOsobaVo brisiUpitnik(PrnPravnaOsobaVo value) throws Exception;
    //privitak
    public abstract PrnPrivitakRs procitajSvePrivitke(PrnPrivitakVo value) throws Exception;
    public abstract PrnPrivitakVo dodajPrivitak(PrnPrivitakVo value) throws Exception;
    public abstract PrnPrivitakVo citajPrivitak(PrnPrivitakVo value) throws Exception;
    public abstract PrnPrivitakVo brisiPrivitak(PrnPrivitakVo value) throws Exception;
    //dubinska analiza
    public abstract PrnPravnaOsobaRs dubinskaAnalizaPravneOsobe(PravnaOsobaVo value) throws Exception;
    public abstract PrnPravnaOsobaRs dubinskaAnalizaSvihPravnihOsoba(PravnaOsobaVo value) throws Exception;
  
}
