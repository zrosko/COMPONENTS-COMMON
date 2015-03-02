package hr.adriacomsoftware.app.common.pravneosobe.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.Bon2UpitRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.Bon2UpitVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.VezanaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.DobavljacRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.DobavljacVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KupacRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KupacVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.rizik.dto.ZahOcjenaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.rizik.dto.ZahOcjenaVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface PravnaOsobaFacade {
    public abstract PravnaOsobaRs citajSvePravneOsobeJrr(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaRs pronadiSvePravneOsobeJrr(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaRs pronadiSvePartijePravneOsobeJrr(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaVo citajPravnuOsobuJrr(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaRs pronadiPravnuOsobuJrrSimple(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaRs citajSvePravneOsobe(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaRs pronadiSvePravneOsobe(PravnaOsobaVo value) throws Exception;
    public abstract PravnaOsobaVo citajPravnuOsobu(PravnaOsobaVo value) throws Exception;
    public abstract PartijaRs citajSaldaSvihPartija(PravnaOsobaVo value) throws Exception;
    public abstract PartijaRs citajSvePartijeKredita(PravnaOsobaVo value) throws Exception;
    public abstract PartijaRs citajSveUgovore(PravnaOsobaVo value) throws Exception;
    public abstract PartijaRs citajSveDepozite(PravnaOsobaVo value) throws Exception;
    public abstract Bon2UpitRs citajSveBon2Podatke(Bon2UpitVo value) throws Exception;
    public abstract PartijaRs citajBonitet(PravnaOsobaVo value) throws Exception;
    public abstract PartijaRs citajSvePartijePravneOsobe(PravnaOsobaVo value) throws Exception;
    public abstract VezanaOsobaRs citajSvePovezaneOsobeOsobe(PravnaOsobaVo value) throws Exception;    
    public abstract void upisiObracunNaknada(AS2RecordList value) throws Exception;
    public abstract PravnaOsobaRs citajPodatkeKlijenta(PravnaOsobaVo value) throws Exception;
    public abstract ZahOcjenaRs pripremaSkoringOcjena(ZahOcjenaVo value) throws Exception;
    public abstract ZahOcjenaRs procitajSkoringPravneOsobe(ZahOcjenaVo value) throws Exception;
    public abstract PartijaRs citajSvePartijeIzlozenosti(PravnaOsobaVo value) throws Exception; 
    //kupci
    public abstract KupacVo azurirajKupca(KupacVo value) throws Exception;
    public abstract KupacRs procitajSveKupce(KupacVo value) throws Exception;
    public abstract KupacVo dodajKupca(KupacVo value) throws Exception;
    public abstract KupacVo dodajViseKupaca(KupacRs value) throws Exception;
    public abstract KupacVo brisiKupca(KupacVo value) throws Exception;
    public abstract KupacVo brisiSveKupce(KupacVo value) throws Exception;
    public abstract KupacVo brisiViseKupaca(KupacRs value) throws Exception;
    //dobavljaci
    public abstract DobavljacVo azurirajDobavljaca(DobavljacVo value) throws Exception;
    public abstract DobavljacRs procitajSveDobavljace(DobavljacVo value) throws Exception;
    public abstract DobavljacVo dodajDobavljaca(DobavljacVo value) throws Exception;
    public abstract DobavljacVo dodajViseDobavljaca(DobavljacRs value) throws Exception;
    public abstract DobavljacVo brisiDobavljaca(DobavljacVo value) throws Exception;
    public abstract DobavljacVo brisiSveDobavljace(DobavljacVo value) throws Exception;
    public abstract DobavljacVo brisiViseDobavljaca(DobavljacRs value) throws Exception;
    //promet
    public abstract OsnovniRs citajPrometePravneOsobe(OsnovniVo value) throws Exception;
}
