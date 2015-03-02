package hr.adriacomsoftware.app.common.pranjenovca.transakcija.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.transakcija.dto.PrnTransakcijaRs;
import hr.adriacomsoftware.app.common.pranjenovca.transakcija.dto.PrnTransakcijaVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaVo;

public interface PranjeNovcaTransakcijaFacade {
    //pravna osoba
    public abstract PrnTransakcijaRs procitajSveTransakcijePravnihOsoba(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs pronadiTransakcijePravnihOsoba(PravnaOsobaVo value) throws Exception;
    public abstract PrnTransakcijaRs pronadiNoveTransakcijePravnihOsoba(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs filterTransakcijePravnihOsoba(PrnTransakcijaVo value) throws Exception;
    //građani
    public abstract PrnTransakcijaRs procitajSveObradeTransakcijaGradana(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs procitajSveTransakcijeGradana(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs pronadiTransakcijeGradana(OsobaVo value) throws Exception;
    public abstract PrnTransakcijaRs pronadiNoveTransakcijeGradana(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs filterTransakcijeGradana(PrnTransakcijaVo value) throws Exception;
    //transakcija
    public abstract PrnTransakcijaVo brisiTransakciju(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaVo citajTransakciju(PrnTransakcijaVo value) throws Exception;    
    public abstract PrnTransakcijaVo azurirajTransakciju(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaVo dodajTransakciju(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs procitajSveStavkeTransakcije(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs izvjestajTransakcijeZaRazdobljeGradana(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs izvjestajTransakcijePreko105000Gradana(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs izvjestajTransakcijeZaRazdobljePravnihOsoba(PrnTransakcijaVo value) throws Exception;
    //dubinska analiza
    public abstract PrnTransakcijaRs dubinskaAnalizaTransakcijeFizickeOsobe(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaRs dubinskaAnalizaTransakcijePravneOsobe(PrnTransakcijaVo value) throws Exception;
    //biljeska
    public abstract PrnTransakcijaVo citajBiljesku(PrnTransakcijaVo value) throws Exception;    
    public abstract PrnTransakcijaVo azurirajBiljesku(PrnTransakcijaVo value) throws Exception;
    public abstract PrnTransakcijaVo dodajBiljesku(PrnTransakcijaVo value) throws Exception;

}
