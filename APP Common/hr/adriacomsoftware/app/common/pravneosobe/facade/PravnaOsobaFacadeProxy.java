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
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class PravnaOsobaFacadeProxy extends AS2FacadeProxy implements PravnaOsobaFacade {

    private static PravnaOsobaFacadeProxy _instance = null;

    private PravnaOsobaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.facade.PravnaOsobaFacadeServer");
    }

    public static PravnaOsobaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new PravnaOsobaFacadeProxy();
        return _instance;
    }

    public PravnaOsobaRs citajSvePravneOsobeJrr(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePravneOsobeJrr");
		PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public PravnaOsobaRs pronadiSvePravneOsobeJrr(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSvePravneOsobeJrr");
		PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }
    public PravnaOsobaRs pronadiSvePartijePravneOsobeJrr(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSvePartijePravneOsobeJrr");
		PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public PravnaOsobaVo citajPravnuOsobuJrr(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajPravnuOsobuJrr");
		PravnaOsobaVo res = (PravnaOsobaVo)  execute(value);
		return res;
    }    
    public PravnaOsobaRs pronadiPravnuOsobuJrrSimple(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiPravnuOsobuJrrSimple");
		PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }
    public PravnaOsobaRs citajSvePravneOsobe(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePravneOsobe");
		PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public PravnaOsobaRs pronadiSvePravneOsobe(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSvePravneOsobe");
		PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public PravnaOsobaVo citajPravnuOsobu(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajPravnuOsobu");
		PravnaOsobaVo res = (PravnaOsobaVo)  execute(value);
		return res;
    }

    public PartijaRs citajSaldaSvihPartija(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSaldaSvihPartija");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs citajSvePartijeKredita(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePartijeKredita");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public PartijaRs citajSveUgovore(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSveUgovore");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs citajSveDepozite(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSveDepozite");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public Bon2UpitRs citajSveBon2Podatke(Bon2UpitVo value) throws AS2Exception {
        value.setRemoteMethod("citajSveBon2Podatke");
        Bon2UpitRs res = (Bon2UpitRs) executeQuery(value);
		return res;
    }
    public PartijaRs citajBonitet(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajBonitet");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs citajSvePartijePravneOsobe(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePartijePravneOsobe");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public VezanaOsobaRs citajSvePovezaneOsobeOsobe(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePovezaneOsobeOsobe");
		VezanaOsobaRs res = (VezanaOsobaRs) executeQuery(value);
		return res;
    }
/****************************/

    public void upisiObracunNaknada(AS2RecordList value) throws AS2Exception {
        value.setRemoteMethod("upisiObracunNaknada");
        execute(value);
    }
    public PravnaOsobaRs citajPodatkeKlijenta(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajPodatkeKlijenta");
		PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public ZahOcjenaRs pripremaSkoringOcjena(ZahOcjenaVo value) throws AS2Exception {
		value.setRemoteMethod("pripremaSkoringOcjena");
		ZahOcjenaRs res = (ZahOcjenaRs) executeQuery(value);
		return res;
    }

    public ZahOcjenaRs procitajSkoringPravneOsobe(ZahOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSkoringPravneOsobe");
    	ZahOcjenaRs res = (ZahOcjenaRs)  executeQuery(value);
    	return res;
    }
    public PartijaRs citajSvePartijeIzlozenosti(PravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePartijeIzlozenosti");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    //kupac
    public KupacVo azurirajKupca(KupacVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajKupca");
        KupacVo res = (KupacVo)  execute(value);
        return res;
    }

    public KupacRs procitajSveKupce(KupacVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveKupce");
        KupacRs res = (KupacRs) executeQuery(value);
        return res;
    }

    public KupacVo dodajKupca(KupacVo value) throws AS2Exception {
        value.setRemoteMethod("dodajKupca");
        KupacVo res = (KupacVo)  execute(value);
        return res;
    }

    public KupacVo brisiKupca(KupacVo value) throws AS2Exception {
        value.setRemoteMethod("brisiKupca");
        KupacVo res = (KupacVo)  execute(value);
        return res;
    }
    public KupacVo brisiSveKupce(KupacVo value) throws AS2Exception {
        value.setRemoteMethod("brisiSveKupce");
        KupacVo res = (KupacVo)  execute(value);
        return res;
    }
    public KupacVo brisiViseKupaca(KupacRs value) throws AS2Exception {
        value.setRemoteMethod("brisiViseKupaca");
        KupacVo res = (KupacVo)  execute(value);
        return res;
    }
    public KupacVo dodajViseKupaca(KupacRs value) throws AS2Exception {
        value.setRemoteMethod("dodajViseKupaca");
        KupacVo res = (KupacVo)  execute(value);
        return res;
    }
    public DobavljacVo azurirajDobavljaca(DobavljacVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajDobavljaca");
        DobavljacVo res = (DobavljacVo)  execute(value);
        return res;
    }

    public DobavljacRs procitajSveDobavljace(DobavljacVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveDobavljace");
        DobavljacRs res = (DobavljacRs) executeQuery(value);
        return res;
    }

    public DobavljacVo dodajDobavljaca(DobavljacVo value) throws AS2Exception {
        value.setRemoteMethod("dodajDobavljaca");
        DobavljacVo res = (DobavljacVo)  execute(value);
        return res;
    }

    public DobavljacVo brisiDobavljaca(DobavljacVo value) throws AS2Exception {
        value.setRemoteMethod("brisiDobavljaca");
        DobavljacVo res = (DobavljacVo)  execute(value);
        return res;
    }
    public DobavljacVo brisiViseDobavljaca(DobavljacRs value) throws AS2Exception {
        value.setRemoteMethod("brisiViseDobavljaca");
        DobavljacVo res = (DobavljacVo)  execute(value);
        return res;
    }
    public DobavljacVo dodajViseDobavljaca(DobavljacRs value) throws AS2Exception {
        value.setRemoteMethod("dodajViseDobavljaca");
        DobavljacVo res = (DobavljacVo)  execute(value);
        return res;
    }
    public DobavljacVo brisiSveDobavljace(DobavljacVo value) throws AS2Exception {
        value.setRemoteMethod("brisiSveDobavljace");
        DobavljacVo res = (DobavljacVo)  execute(value);
        return res;
    }

	public OsnovniRs citajPrometePravneOsobe(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("citajPrometePravneOsobe");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
	}

}