package hr.adriacomsoftware.app.common.pranjenovca.gr.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.dto.OsobaVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnFizickaOsobaRs;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnFizickaOsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnGrRacunRs;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnGrRacunVo;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnPoliticarVo;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnPrivitakRs;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnPrivitakVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface PranjeNovcaFacade {
    //fizička osoba
    public abstract OsobaRs procitajSveOsobe(OsobaVo value) throws Exception;
    public abstract OsobaRs pronadiOsobe(OsobaVo value) throws Exception;
    public abstract OsobaRs izvjestajiFizickeOsobe(OsobaVo value) throws Exception;
    //račun
    public abstract PrnGrRacunVo citajRacun(PrnGrRacunVo value) throws Exception;
    public abstract PrnGrRacunVo azurirajRacun(PrnGrRacunVo value) throws Exception;
    public abstract PrnGrRacunVo dodajRacun(PrnGrRacunVo value) throws Exception;
    public abstract PrnGrRacunRs listaRacuna(PrnGrRacunVo value) throws Exception;
    //politicar
    public abstract PrnPoliticarVo citajPoliticara(PrnPoliticarVo value) throws Exception;
    public abstract PrnPoliticarVo azurirajPoliticara(PrnPoliticarVo value) throws Exception;
    public abstract PrnPoliticarVo dodajPoliticara(PrnPoliticarVo value) throws Exception;
    //upitnik
    public abstract PrnFizickaOsobaVo azurirajZavrsnePodatkeUpitnika(PrnFizickaOsobaVo value) throws Exception;
    public abstract PrnFizickaOsobaRs procitajSveUpitnike(PrnFizickaOsobaVo value) throws Exception;
    public abstract PrnFizickaOsobaVo citajUpitnik(PrnFizickaOsobaVo value) throws Exception;
    public abstract PrnFizickaOsobaRs pronadiUpitnike(PrnFizickaOsobaVo value) throws Exception;
    public abstract PrnFizickaOsobaVo azurirajUpitnik(PrnFizickaOsobaVo value) throws Exception;
    public abstract PrnFizickaOsobaVo dodajUpitnik(PrnFizickaOsobaVo value) throws Exception;
    public abstract PrnFizickaOsobaVo brisiUpitnik(PrnFizickaOsobaVo value) throws Exception;
    public abstract PrnFizickaOsobaVo ucitajUpitnik(PrnFizickaOsobaVo value) throws Exception;
    //privitak
    public abstract PrnPrivitakRs procitajSvePrivitke(PrnPrivitakVo value) throws Exception;
    public abstract PrnPrivitakVo dodajPrivitak(PrnPrivitakVo value) throws Exception;
    public abstract PrnPrivitakVo citajPrivitak(PrnPrivitakVo value) throws Exception;
    public abstract PrnPrivitakVo brisiPrivitak(PrnPrivitakVo value) throws Exception;
    //dubinska analiza
    public abstract PrnFizickaOsobaRs dubinskaAnalizaOsobe(OsobaVo value) throws Exception;
    public abstract PrnFizickaOsobaRs dubinskaAnalizaSvihOsoba(OsobaVo value) throws Exception;
    //crna lista
    public abstract AS2RecordList izvjestajSwiftTransakcijeDrzavaCrnaLista(OsnovniVo value) throws Exception;
    
    /************* FACADE INTERFACE  zajednicko ************/
	
	public abstract OsnovniRs procitajPrnSifre(OsnovniVo value) throws Exception;
}
