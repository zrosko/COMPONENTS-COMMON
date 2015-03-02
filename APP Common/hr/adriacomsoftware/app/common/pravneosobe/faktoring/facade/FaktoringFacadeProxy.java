package hr.adriacomsoftware.app.common.pravneosobe.faktoring.facade;

import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.DiskontRs;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.DiskontVo;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.FakturaRs;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.FakturaVo;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.KupacFaktoringaRs;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.KupacFaktoringaVo;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.KupacLimitRs;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.KupacLimitVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class FaktoringFacadeProxy extends AS2FacadeProxy implements FaktoringFacade {
    private static FaktoringFacadeProxy _instance = null;
    private FaktoringFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.faktoring.facade.FaktoringFacadeServer");
    }
    public static FaktoringFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new FaktoringFacadeProxy();
        return _instance;
    }
    public AS2RecordList temeljnicaFaktoring(AS2Record value) throws AS2Exception {
        value.setRemoteMethod("temeljnicaFaktoring");
        AS2RecordList res = executeQuery(value);
        return res;
    }
    public FakturaRs procitajSveSpecifikacije(FakturaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveSpecifikacije");
        FakturaRs res = (FakturaRs) executeQuery(value);
        return res;
    }
    public FakturaRs pronadiSpecifikacije(FakturaVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSpecifikacije");
        FakturaRs res = (FakturaRs) executeQuery(value);
        return res;
    }
    public FakturaVo azurirajSpecifikaciju(FakturaVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajSpecifikaciju");
        FakturaVo res = (FakturaVo) execute(value);
        return res;
    }
    public FakturaVo dodajSpecifikaciju(FakturaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajSpecifikaciju");
        FakturaVo res = (FakturaVo) execute(value);
        return res;
    }
    public FakturaVo brisiSpecifikaciju(FakturaVo value) throws AS2Exception {
        value.setRemoteMethod("brisiSpecifikaciju");
        FakturaVo res = (FakturaVo) execute(value);
        return res;
    }
    public FakturaRs procitajSveFakture(FakturaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveFakture");
        FakturaRs res = (FakturaRs) executeQuery(value);
        return res;
    }
    public FakturaVo azurirajFakturu(FakturaVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajFakturu");
        FakturaVo res = (FakturaVo) execute(value);
        return res;
    }
    public FakturaVo dodajFakturu(FakturaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajFakturu");
        FakturaVo res = (FakturaVo) execute(value);
        return res;
    }
    public FakturaVo brisiFakturu(FakturaVo value) throws AS2Exception {
        value.setRemoteMethod("brisiFakturu");
        FakturaVo res = (FakturaVo) execute(value);
        return res;
    }
    public KupacFaktoringaRs procitajSveKupceFaktoringa(KupacFaktoringaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveKupceFaktoringa");
        KupacFaktoringaRs res = (KupacFaktoringaRs) executeQuery(value);
        return res;
    }
    public KupacFaktoringaVo azurirajKupcaFaktoringa(KupacFaktoringaVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajKupcaFaktoringa");
        KupacFaktoringaVo res = (KupacFaktoringaVo) execute(value);
        return res;
    }
    public KupacFaktoringaVo dodajKupcaFaktoringa(KupacFaktoringaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajKupcaFaktoringa");
        KupacFaktoringaVo res = (KupacFaktoringaVo) execute(value);
        return res;
    }
    public KupacFaktoringaVo brisiKupcaFaktoringa(KupacFaktoringaVo value) throws AS2Exception {
        value.setRemoteMethod("brisiKupcaFaktoringa");
        KupacFaktoringaVo res = (KupacFaktoringaVo) execute(value);
        return res;
    }
    public DiskontRs procitajSveDiskonte(DiskontVo value) throws AS2Exception {

        value.setRemoteMethod("procitajSveDiskonte");
        DiskontRs res = (DiskontRs) executeQuery(value);
        return res;
     }
    public DiskontVo azurirajDiskont(DiskontVo value) throws AS2Exception {

        value.setRemoteMethod("azurirajDiskont");
        DiskontVo res = (DiskontVo)  execute(value);
        return res;
     }
    public DiskontVo dodajDiskont(DiskontVo value) throws AS2Exception {

        value.setRemoteMethod("dodajDiskont");
        DiskontVo res = (DiskontVo)  execute(value);
        return res;
     }
    public DiskontVo brisiDiskont(DiskontVo value) throws AS2Exception {

        value.setRemoteMethod("brisiDiskont");
        DiskontVo res = (DiskontVo)  execute(value);
        return res;
     }
    public KupacLimitRs procitajSveLimiteKupca(KupacLimitVo value) throws AS2Exception {

        value.setRemoteMethod("procitajSveLimiteKupca");
        KupacLimitRs res = (KupacLimitRs) executeQuery(value);
        return res;
     }
    public KupacLimitVo azurirajLimitKupca(KupacLimitVo value) throws AS2Exception {

        value.setRemoteMethod("azurirajLimitKupca");
        KupacLimitVo res = (KupacLimitVo)  execute(value);
        return res;
     }
    public KupacLimitVo dodajLimitKupca(KupacLimitVo value) throws AS2Exception {

        value.setRemoteMethod("dodajLimitKupca");
        KupacLimitVo res = (KupacLimitVo)  execute(value);
        return res;
     }
    public KupacLimitVo brisiLimitKupca(KupacLimitVo value) throws AS2Exception {

        value.setRemoteMethod("brisiLimitKupca");
        KupacLimitVo res = (KupacLimitVo)  execute(value);
        return res;
     }
}