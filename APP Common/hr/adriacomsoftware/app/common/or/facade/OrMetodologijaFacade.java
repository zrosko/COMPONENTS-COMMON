package hr.adriacomsoftware.app.common.or.facade;

import hr.adriacomsoftware.app.common.or.dto.OrKategorijaDogadajaRs;
import hr.adriacomsoftware.app.common.or.dto.OrKategorijaDogadajaVo;
import hr.adriacomsoftware.app.common.or.dto.OrKategorijaGubitkaRs;
import hr.adriacomsoftware.app.common.or.dto.OrKategorijaGubitkaVo;
import hr.adriacomsoftware.app.common.or.dto.OrKontniPlanRs;
import hr.adriacomsoftware.app.common.or.dto.OrKontniPlanVo;
import hr.adriacomsoftware.app.common.or.dto.OrKontrolaRs;
import hr.adriacomsoftware.app.common.or.dto.OrKontrolaVo;
import hr.adriacomsoftware.app.common.or.dto.OrOcjenaRs;
import hr.adriacomsoftware.app.common.or.dto.OrOcjenaVo;
import hr.adriacomsoftware.app.common.or.dto.OrPoslovnaFunkcijaRs;
import hr.adriacomsoftware.app.common.or.dto.OrPoslovnaFunkcijaVo;
import hr.adriacomsoftware.app.common.or.dto.OrPoslovnaLinijaRs;
import hr.adriacomsoftware.app.common.or.dto.OrPoslovnaLinijaVo;
import hr.adriacomsoftware.app.common.or.dto.OrPrijetnjaRs;
import hr.adriacomsoftware.app.common.or.dto.OrPrijetnjaVo;
import hr.adriacomsoftware.app.common.or.dto.OrUzrokDogadajaRs;
import hr.adriacomsoftware.app.common.or.dto.OrUzrokDogadajaVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface OrMetodologijaFacade {
    //lookup
	public abstract AS2RecordList listajSveProizvode() throws Exception;
    public abstract AS2RecordList listajSvePoslovneLinije() throws Exception;
    public abstract AS2RecordList listajSvePoslovneFunkcije() throws Exception;
    //prijetnja
    public abstract AS2RecordList listajSvePrijetnja() throws Exception;
    public abstract OrPrijetnjaRs pretraziPrijetnja(OrPrijetnjaVo value) throws Exception;
    public abstract OrPrijetnjaRs procitajSvePrijetnja(OrPrijetnjaVo value) throws Exception;
    public abstract OrPrijetnjaVo azurirajPrijetnja(OrPrijetnjaVo value) throws Exception;
    public abstract OrPrijetnjaVo dodajPrijetnja(OrPrijetnjaVo value) throws Exception;
    public abstract OrPrijetnjaVo brisiPrijetnja(OrPrijetnjaVo value) throws Exception;
    //poslovna linija
    public abstract OrPoslovnaLinijaRs procitajSvePoslovneLinije(OrPoslovnaLinijaVo value) throws Exception;
    public abstract OrPoslovnaLinijaVo azurirajPoslovnuLiniju(OrPoslovnaLinijaVo value) throws Exception;
    public abstract OrPoslovnaLinijaVo dodajPoslovnuLiniju(OrPoslovnaLinijaVo value) throws Exception;
    public abstract OrPoslovnaLinijaVo brisiPoslovnuLiniju(OrPoslovnaLinijaVo value) throws Exception;
    //kategorija dogadaja
    public abstract AS2RecordList listajSveKategorijaDogadaja() throws Exception;
    public abstract OrKategorijaDogadajaRs pretraziKategorijaDogadaja(OrKategorijaDogadajaVo value) throws Exception;
    public abstract OrKategorijaDogadajaRs procitajSveKategorijaDogadaja(OrKategorijaDogadajaVo value) throws Exception;
    public abstract OrKategorijaDogadajaVo azurirajKategorijaDogadaja(OrKategorijaDogadajaVo value) throws Exception;
    public abstract OrKategorijaDogadajaVo dodajKategorijaDogadaja(OrKategorijaDogadajaVo value) throws Exception;
    public abstract OrKategorijaDogadajaVo brisiKategorijaDogadaja(OrKategorijaDogadajaVo value) throws Exception;
    //kategorija gubitka
    public abstract AS2RecordList listajSveKategorijaGubitka() throws Exception;
    public abstract OrKategorijaGubitkaRs pretraziKategorijaGubitka(OrKategorijaGubitkaVo value) throws Exception;
    public abstract OrKategorijaGubitkaRs procitajSveKategorijaGubitka(OrKategorijaGubitkaVo value) throws Exception;
    public abstract OrKategorijaGubitkaVo azurirajKategorijaGubitka(OrKategorijaGubitkaVo value) throws Exception;
    public abstract OrKategorijaGubitkaVo dodajKategorijaGubitka(OrKategorijaGubitkaVo value) throws Exception;
    public abstract OrKategorijaGubitkaVo brisiKategorijaGubitka(OrKategorijaGubitkaVo value) throws Exception;
    //kontrola
    public abstract AS2RecordList listajSveKontrola() throws Exception;
    public abstract OrKontrolaRs pretraziKontrola(OrKontrolaVo value) throws Exception;
    public abstract OrKontrolaRs procitajSveKontrola(OrKontrolaVo value) throws Exception;
    public abstract OrKontrolaVo azurirajKontrola(OrKontrolaVo value) throws Exception;
    public abstract OrKontrolaVo dodajKontrola(OrKontrolaVo value) throws Exception;
    public abstract OrKontrolaVo brisiKontrola(OrKontrolaVo value) throws Exception;
    //ocjena
    public abstract AS2RecordList listajSveOcjena(OrOcjenaVo value) throws Exception;
    public abstract OrOcjenaRs pretraziOcjena(OrOcjenaVo value) throws Exception;
    public abstract OrOcjenaRs procitajSveOcjena(OrOcjenaVo value) throws Exception;
    public abstract OrOcjenaVo azurirajOcjena(OrOcjenaVo value) throws Exception;
    public abstract OrOcjenaVo dodajOcjena(OrOcjenaVo value) throws Exception;
    public abstract OrOcjenaVo brisiOcjena(OrOcjenaVo value) throws Exception;
    //uzrok dogadaja
    public abstract AS2RecordList listajSveUzrokDogadaja() throws Exception;
    public abstract OrUzrokDogadajaRs pretraziUzrokDogadaja(OrUzrokDogadajaVo value) throws Exception;
    public abstract OrUzrokDogadajaRs procitajSveUzrokDogadaja(OrUzrokDogadajaVo value) throws Exception;
    public abstract OrUzrokDogadajaVo azurirajUzrokDogadaja(OrUzrokDogadajaVo value) throws Exception;
    public abstract OrUzrokDogadajaVo dodajUzrokDogadaja(OrUzrokDogadajaVo value) throws Exception;
    public abstract OrUzrokDogadajaVo brisiUzrokDogadaja(OrUzrokDogadajaVo value) throws Exception;
    //poslovna funkcija
    public abstract OrPoslovnaFunkcijaRs procitajSvePoslovneFunkcije(OrPoslovnaFunkcijaVo value) throws Exception;
    public abstract OrPoslovnaFunkcijaVo azurirajPoslovnuFunkciju(OrPoslovnaFunkcijaVo value) throws Exception;
    public abstract OrPoslovnaFunkcijaVo dodajPoslovnuFunkciju(OrPoslovnaFunkcijaVo value) throws Exception;
    public abstract OrPoslovnaFunkcijaVo brisiPoslovnuFunkciju(OrPoslovnaFunkcijaVo value) throws Exception;
    //kontni plan
    public abstract OrKontniPlanVo brisiOrKontniPlan(OrKontniPlanVo value) throws Exception;
    public abstract OrKontniPlanVo dodajOrKontniPlan(OrKontniPlanVo value) throws Exception;
    public abstract OrKontniPlanVo azurirajOrKontniPlan(OrKontniPlanVo value) throws Exception;
    public abstract OrKontniPlanRs procitajSveOrKontniPlan(OrKontniPlanVo value) throws Exception;
    public abstract AS2RecordList listajSveOrKontniPlan() throws Exception;
    public abstract OrKontniPlanRs pretraziOrKontniPlan(OrKontniPlanVo value) throws Exception;
}
