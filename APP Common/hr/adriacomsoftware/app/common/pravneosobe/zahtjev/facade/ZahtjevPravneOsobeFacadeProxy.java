package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.facade;


import hr.adriacomsoftware.app.common.cmdb.dto.EmailVo;
import hr.adriacomsoftware.app.common.jb.dto.ZahtjevPrivitakRs;
import hr.adriacomsoftware.app.common.jb.dto.ZahtjevPrivitakVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.BankarskiProizvodRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.BankarskiProizvodVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.Bon2Rs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.Bon2Vo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.DobavljacRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.DobavljacVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KolateralPonudeniRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KolateralPonudeniVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KratkorocniPlanVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KupacRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KupacVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.OsiguranjeVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PodaciKlijentaVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PoslovniOdnosBankaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PoslovniOdnosBankaVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PovezanaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PovezanaOsobaVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.RizikKomentarRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.RizikKomentarVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.RizikRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.RizikVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.UrednostVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.VikrRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.VikrVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZaduzenostKodBankeRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZaduzenostKodBankeVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZaduzenostRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZaduzenostVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZahtjevPravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZahtjevPravnaOsobaVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.rizik.dto.ZahOcjenaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.rizik.dto.ZahOcjenaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class ZahtjevPravneOsobeFacadeProxy extends AS2FacadeProxy implements ZahtjevPravneOsobeFacade {

    private static ZahtjevPravneOsobeFacadeProxy _instance = null;

    private ZahtjevPravneOsobeFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.zahtjev.facade.ZahtjevPravneOsobeFacadeServer");
    }

    public static ZahtjevPravneOsobeFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new ZahtjevPravneOsobeFacadeProxy();
        return _instance;
    }
    public ZahtjevPravnaOsobaRs procitajSvePodatkeZahtjeva(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSvePodatkeZahtjeva");
        ZahtjevPravnaOsobaRs res = (ZahtjevPravnaOsobaRs) executeQuery(value);
		return res;
    }
    public PodaciKlijentaVo dodajOsnovnePodatke(PodaciKlijentaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajOsnovnePodatke");
		PodaciKlijentaVo res = (PodaciKlijentaVo)  execute(value);
		return res;
    }
    public PodaciKlijentaVo azurirajOsnovnePodatke(PodaciKlijentaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajOsnovnePodatke");
		PodaciKlijentaVo res = (PodaciKlijentaVo)  execute(value);
		return res;
    }
    public ZahtjevPravnaOsobaVo dodajZahtjev(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajZahtjev");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }

    public ZahtjevPravnaOsobaRs citajSveZahtjeve(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSveZahtjeve");
		ZahtjevPravnaOsobaRs res = (ZahtjevPravnaOsobaRs) executeQuery(value);
		return res;
    }
    public ZahtjevPravnaOsobaRs pronadiSveZahtjeve(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveZahtjeve");
		ZahtjevPravnaOsobaRs res = (ZahtjevPravnaOsobaRs) executeQuery(value);
		return res;
    }

    public ZahtjevPravnaOsobaVo citajZahtjev(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajZahtjev");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)execute(value);
		return res;
    }

    public ZahtjevPravnaOsobaVo brisiZahtjev(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiZahtjev");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }
    public ZahtjevPravnaOsobaVo azurirajStatusZahtjeva(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajStatusZahtjeva");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }
    public ZahtjevPravnaOsobaVo obradaZahtjeva(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("obradaZahtjeva");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }

    public EmailVo proslijediZahtjev(EmailVo value) throws AS2Exception {
		value.setRemoteMethod("proslijediZahtjev");
		EmailVo res = (EmailVo)  execute(value);
		return res;
    }
    public ZahtjevPravnaOsobaVo pripremiZahtjev(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pripremiZahtjev");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }
    public ZahtjevPravnaOsobaVo pripremiOsnovnePodatke(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pripremiOsnovnePodatke");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }

    public PoslovniOdnosBankaVo dodajPoslovniOdnosBanka(PoslovniOdnosBankaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajPoslovniOdnosBanka");
		PoslovniOdnosBankaVo res = (PoslovniOdnosBankaVo)  execute(value);
		return res;
    }

    public PoslovniOdnosBankaVo azurirajPoslovniOdnosBanka(PoslovniOdnosBankaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajPoslovniOdnosBanka");
		PoslovniOdnosBankaVo res = (PoslovniOdnosBankaVo)  execute(value);
		return res;
    }
    public PoslovniOdnosBankaVo azurirajKomentarPoslovnogOdnosaBanka(PoslovniOdnosBankaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKomentarPoslovnogOdnosaBanka");
		PoslovniOdnosBankaVo res = (PoslovniOdnosBankaVo)  execute(value);
		return res;
    }
    public PoslovniOdnosBankaVo citajPoslovniOdnosBanka(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajPoslovniOdnosBanka");
		PoslovniOdnosBankaVo res = (PoslovniOdnosBankaVo)execute(value);
		return res;
    }
    //bon2
    public Bon2Vo azurirajBon2(Bon2Vo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajBon2");
    	Bon2Vo res = (Bon2Vo)  execute(value);
    	return res;
    }

    public Bon2Rs procitajSveBon2(Bon2Vo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveBon2");
    	Bon2Rs res = (Bon2Rs) executeQuery(value);
    	return res;
    }

    public Bon2Vo dodajBon2(Bon2Vo value) throws AS2Exception {
    	value.setRemoteMethod("dodajBon2");
    	Bon2Vo res = (Bon2Vo)  execute(value);
    	return res;
    }

    public Bon2Vo brisiBon2(Bon2Vo value) throws AS2Exception {
    	value.setRemoteMethod("brisiBon2");
    	Bon2Vo res = (Bon2Vo)  execute(value);
    	return res;
    }
    public Bon2Vo brisiViseBon2(Bon2Rs value) throws AS2Exception {
    	value.setRemoteMethod("brisiViseBon2");
    	Bon2Vo res = (Bon2Vo)  execute(value);
    	return res;
    }
    public Bon2Rs procitajSveBon2POVIJEST(Bon2Vo value) throws AS2Exception {
      	value.setRemoteMethod("procitajSveBon2POVIJEST");
    	Bon2Rs res = (Bon2Rs) executeQuery(value);
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
    public KupacRs procitajSveKupcePOVIJEST(KupacVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveKupcePOVIJEST");
    	KupacRs res = (KupacRs) executeQuery(value);
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
    public DobavljacRs procitajSveDobavljacePOVIJEST(DobavljacVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveDobavljacePOVIJEST");
    	DobavljacRs res = (DobavljacRs) executeQuery(value);
    	return res;
    }
    public PovezanaOsobaVo azurirajPovezanuOsobu(PovezanaOsobaVo value) throws AS2Exception {
       	value.setRemoteMethod("azurirajPovezanuOsobu");
       	PovezanaOsobaVo res = (PovezanaOsobaVo)  execute(value);
    	return res;
    }

    public PovezanaOsobaRs procitajSvePovezaneOsobe(PovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobe");
    	PovezanaOsobaRs res = (PovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public PovezanaOsobaRs procitajSvePovezaneOsobeVlasnike(PovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobeVlasnike");
    	PovezanaOsobaRs res = (PovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public PovezanaOsobaRs procitajSvePovezaneOsobePOVIJESTZahtjev(PovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobePOVIJESTZahtjev");
    	PovezanaOsobaRs res = (PovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public PovezanaOsobaRs procitajSvePovezaneOsobeVlasnikePOVIJESTZahtjev(PovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobeVlasnikePOVIJESTZahtjev");
    	PovezanaOsobaRs res = (PovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public PovezanaOsobaRs procitajSvePovezaneOsobePOVIJEST(PovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobePOVIJEST");
    	PovezanaOsobaRs res = (PovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public PovezanaOsobaRs procitajSvePovezaneOsobeVlasnikePOVIJEST(PovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobeVlasnikePOVIJEST");
    	PovezanaOsobaRs res = (PovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public PovezanaOsobaVo dodajPovezanuOsobu(PovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPovezanuOsobu");
    	PovezanaOsobaVo res = (PovezanaOsobaVo)  execute(value);
    	return res;
    }
    public PovezanaOsobaVo dodajPovezaneOsobe(PovezanaOsobaRs value) throws AS2Exception {
    	value.setRemoteMethod("dodajPovezaneOsobe");
    	PovezanaOsobaVo res = (PovezanaOsobaVo)  execute(value);
    	return res;
    }
    public PovezanaOsobaVo brisiPovezanuOsobu(PovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPovezanuOsobu");
    	PovezanaOsobaVo res = (PovezanaOsobaVo)  execute(value);
    	return res;
    }
    public PovezanaOsobaVo brisiVisePovezanihOsoba(PovezanaOsobaRs value) throws AS2Exception {
    	value.setRemoteMethod("brisiVisePovezanihOsoba");
    	PovezanaOsobaVo res = (PovezanaOsobaVo)  execute(value);
    	return res;
    }

    public KratkorocniPlanVo dodajKratkorocniPlan(KratkorocniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("dodajKratkorocniPlan");
		KratkorocniPlanVo res = (KratkorocniPlanVo)  execute(value);
		return res;
    }

    public KratkorocniPlanVo azurirajKratkorocniPlan(KratkorocniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKratkorocniPlan");
		KratkorocniPlanVo res = (KratkorocniPlanVo)  execute(value);
		return res;
    }

    public KratkorocniPlanVo citajKratkorocniPlan(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajKratkorocniPlan");
		KratkorocniPlanVo res = (KratkorocniPlanVo)  execute(value);
		return res;
    }

    public KratkorocniPlanVo citajKratkorocniPlanPOVIJEST(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajKratkorocniPlanPOVIJEST");
		KratkorocniPlanVo res = (KratkorocniPlanVo)  execute(value);
		return res;
    }
    public KratkorocniPlanVo brisiKratkorocniPlan(KratkorocniPlanVo value) throws AS2Exception {
        value.setRemoteMethod("brisiKratkorocniPlan");
        KratkorocniPlanVo res = (KratkorocniPlanVo)  execute(value);
        return res;
    }
    public ZaduzenostVo azurirajZaduzenost(ZaduzenostVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajZaduzenost");
    	ZaduzenostVo res = (ZaduzenostVo)  execute(value);
    	return res;
    }

    public ZaduzenostRs procitajSveZaduzenosti(ZaduzenostVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveZaduzenosti");
    	ZaduzenostRs res = (ZaduzenostRs) executeQuery(value);
    	return res;
    }

    public ZaduzenostVo dodajZaduzenost(ZaduzenostVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajZaduzenost");
    	ZaduzenostVo res = (ZaduzenostVo)  execute(value);
    	return res;
    }

    public ZaduzenostVo brisiZaduzenost(ZaduzenostVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiZaduzenost");
    	ZaduzenostVo res = (ZaduzenostVo)  execute(value);
    	return res;
    }
    public ZaduzenostVo brisiViseZaduzenosti(ZaduzenostRs value) throws AS2Exception {
    	value.setRemoteMethod("brisiViseZaduzenosti");
    	ZaduzenostVo res = (ZaduzenostVo)  execute(value);
    	return res;
    }
    public ZaduzenostVo dodajViseZaduzenosti(ZaduzenostRs value) throws AS2Exception {
        value.setRemoteMethod("dodajViseZaduzenosti");
        ZaduzenostVo res = (ZaduzenostVo)  execute(value);
        return res;
    }
    public ZaduzenostKodBankeVo azurirajZaduzenostKodBanke(ZaduzenostKodBankeVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajZaduzenostKodBanke");
    	ZaduzenostKodBankeVo res = (ZaduzenostKodBankeVo)  execute(value);
    	return res;
    }

    public ZaduzenostKodBankeRs procitajSveZaduzenostiKodBanke(ZaduzenostKodBankeVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveZaduzenostiKodBanke");
    	ZaduzenostKodBankeRs res = (ZaduzenostKodBankeRs) executeQuery(value);
    	return res;
    }
    public ZaduzenostKodBankeRs procitajSveZaduzenostiKodBankePovezanaOsoba(ZaduzenostKodBankeVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveZaduzenostiKodBankePovezanaOsoba");
    	ZaduzenostKodBankeRs res = (ZaduzenostKodBankeRs) executeQuery(value);
    	return res;
    }

    public ZaduzenostKodBankeVo dodajZaduzenostKodBanke(ZaduzenostKodBankeVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajZaduzenostKodBanke");
    	ZaduzenostKodBankeVo res = (ZaduzenostKodBankeVo)  execute(value);
    	return res;
    }

    public ZaduzenostKodBankeVo brisiZaduzenostKodBanke(ZaduzenostKodBankeVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiZaduzenostKodBanke");
    	ZaduzenostKodBankeVo res = (ZaduzenostKodBankeVo)  execute(value);
    	return res;
    }    
    public ZaduzenostKodBankeRs procitajSveZaduzenostiKodBankePOVIJEST(ZaduzenostKodBankeVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveZaduzenostiKodBankePOVIJEST");
    	ZaduzenostKodBankeRs res = (ZaduzenostKodBankeRs) executeQuery(value);
    	return res;
    }
    public ZaduzenostKodBankeRs procitajSveZaduzenostiKodBankePovezanaOsobaPOVIJEST(ZaduzenostKodBankeVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveZaduzenostiKodBankePovezanaOsobaPOVIJEST");
    	ZaduzenostKodBankeRs res = (ZaduzenostKodBankeRs) executeQuery(value);
    	return res;
    }
    public PoslovniOdnosBankaVo citajPoslovniOdnosBankaPOVIJEST(ZahtjevPravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPoslovniOdnosBankaPOVIJEST");
    	PoslovniOdnosBankaVo res = (PoslovniOdnosBankaVo)  execute(value);
    	return res;
    }

    public BankarskiProizvodVo azurirajTrazeniProizvod(BankarskiProizvodVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajTrazeniProizvod");
    	BankarskiProizvodVo res = (BankarskiProizvodVo)  execute(value);
    	return res;
    }

    public BankarskiProizvodRs procitajSveTrazeneProizvode(BankarskiProizvodVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveTrazeneProizvode");
    	BankarskiProizvodRs res = (BankarskiProizvodRs) executeQuery(value);
    	return res;
    }

    public BankarskiProizvodVo dodajTrazeniProizvod(BankarskiProizvodVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajTrazeniProizvod");
    	BankarskiProizvodVo res = (BankarskiProizvodVo)  execute(value);
    	return res;
    }

    public BankarskiProizvodVo brisiTrazeniProizvod(BankarskiProizvodVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiTrazeniProizvod");
    	BankarskiProizvodVo res = (BankarskiProizvodVo)  execute(value);
    	return res;
    }

    public KolateralPonudeniVo azurirajPonudeniKolateral(KolateralPonudeniVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajPonudeniKolateral");
    	KolateralPonudeniVo res = (KolateralPonudeniVo)  execute(value);
    	return res;
    }

    public KolateralPonudeniRs procitajSvePonudeneKolaterale(KolateralPonudeniVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePonudeneKolaterale");
    	KolateralPonudeniRs res = (KolateralPonudeniRs) executeQuery(value);
    	return res;
    }
    public KolateralPonudeniRs procitajSvePonudeneKolateralePOVIJEST(KolateralPonudeniVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePonudeneKolateralePOVIJEST");
    	KolateralPonudeniRs res = (KolateralPonudeniRs) executeQuery(value);
    	return res;
    }
    public KolateralPonudeniVo dodajPonudeniKolateral(KolateralPonudeniVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPonudeniKolateral");
    	KolateralPonudeniVo res = (KolateralPonudeniVo)  execute(value);
    	return res;
    }

    public KolateralPonudeniVo brisiPonudeniKolateral(KolateralPonudeniVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPonudeniKolateral");
    	KolateralPonudeniVo res = (KolateralPonudeniVo)  execute(value);
    	return res;
    }
    public KolateralPonudeniVo brisiVisePonudenihKolaterala(KolateralPonudeniRs value) throws AS2Exception {
    	value.setRemoteMethod("brisiVisePonudenihKolaterala");
    	KolateralPonudeniVo res = (KolateralPonudeniVo)  execute(value);
    	return res;
    }
    public VikrVo azurirajVikr(VikrVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajVikr");
    	VikrVo res = (VikrVo)  execute(value);
    	return res;
    }

    public VikrRs procitajSveVikr(VikrVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveVikr");
    	VikrRs res = (VikrRs)  executeQuery(value);
    	return res;
    }

    public VikrVo dodajVikr(VikrVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajVikr");
    	VikrVo res = (VikrVo)  execute(value);
    	return res;
    }

    public VikrVo brisiVikr(VikrVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiVikr");
    	VikrVo res = (VikrVo)  execute(value);
    	return res;
    }
    public ZahtjevPrivitakRs procitajSvePrivitke(ZahtjevPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSvePrivitke");
    	ZahtjevPrivitakRs res = (ZahtjevPrivitakRs) executeQuery(value);
    	return res;
     }
    public ZahtjevPrivitakVo dodajPrivitak(ZahtjevPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajPrivitak");
    	ZahtjevPrivitakVo res = (ZahtjevPrivitakVo)  execute(value);
    	return res;
     }
    public ZahtjevPrivitakVo citajPrivitak(ZahtjevPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("citajPrivitak");
    	ZahtjevPrivitakVo res = (ZahtjevPrivitakVo)  execute(value);
    	return res;
     }
    public ZahtjevPrivitakVo brisiPrivitak(ZahtjevPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiPrivitak");
    	ZahtjevPrivitakVo res = (ZahtjevPrivitakVo)  execute(value);
    	return res;
     }

    public ZahtjevPravnaOsobaVo pripremiPrijedlogOdluke(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pripremiPrijedlogOdluke");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }

    public ZahtjevPravnaOsobaVo duplicirajZahtjev(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("duplicirajZahtjev");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }

    public ZahtjevPravnaOsobaVo ponavljanjeObradeNaDatumObrade(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("ponavljanjeObradeNaDatumObrade");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }
    public ZahtjevPravnaOsobaVo promjenaDatumaProcjeneRizika(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("promjenaDatumaProcjeneRizika");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
		return res;
    }

    public PoslovniOdnosBankaRs citajStednjuPovezanihOsoba(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("citajStednjuPovezanihOsoba");
        PoslovniOdnosBankaRs res = (PoslovniOdnosBankaRs)  execute(value);
		return res;
    }
    //rizik
    public RizikVo azurirajOpceKomentare(RizikVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajOpceKomentare");
		RizikVo res = (RizikVo)  execute(value);
		return res;
    }
    public RizikVo citajRizik(RizikVo value) throws AS2Exception {
    	value.setRemoteMethod("citajRizik");
    	RizikVo res = (RizikVo)  execute(value);
    	return res;
     }

    public RizikVo dodajOpceKomentare(RizikVo value) throws AS2Exception {
		value.setRemoteMethod("dodajOpceKomentare");
		RizikVo res = (RizikVo)  execute(value);
		return res;
    }
    public RizikVo dodajProcjenuRizika(RizikVo value) throws AS2Exception {
		value.setRemoteMethod("dodajProcjenuRizika");
		RizikVo res = (RizikVo)  execute(value);
		return res;
    }
    public RizikVo azurirajProcjenuRizika(RizikVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajProcjenuRizika");
		RizikVo res = (RizikVo)  execute(value);
		return res;
    }
    public BankarskiProizvodRs procitajSveOdobreneProizvode(BankarskiProizvodVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveOdobreneProizvode");
    	BankarskiProizvodRs res = (BankarskiProizvodRs) executeQuery(value);
    	return res;
    }
    public ZahtjevPravnaOsobaVo citajZahtjevZaProcjenuRizika(RizikVo value) throws AS2Exception {
		value.setRemoteMethod("citajZahtjevZaProcjenuRizika");
		ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)execute(value);
		return res;
    }

    public ZahOcjenaVo azurirajOcjenu(ZahOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajOcjenu");
    	ZahOcjenaVo res = (ZahOcjenaVo)  execute(value);
    	return res;
    }

    public ZahOcjenaRs procitajSveOcjene(ZahOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveOcjene");
    	ZahOcjenaRs res = (ZahOcjenaRs)  executeQuery(value);
    	return res;
    }
    public ZahOcjenaVo brisiOcjenu(ZahOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiOcjenu");
    	ZahOcjenaVo res = (ZahOcjenaVo)  execute(value);
    	return res;
    }
    public ZahOcjenaVo brisiViseOcjena(ZahOcjenaRs value) throws AS2Exception {
    	value.setRemoteMethod("brisiViseOcjena");
    	ZahOcjenaVo res = (ZahOcjenaVo)  execute(value);
    	return res;
    }
    public ZahOcjenaRs pripremaOcjena(ZahOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("pripremaOcjena");
    	ZahOcjenaRs res = (ZahOcjenaRs)  executeQuery(value);
    	return res;
    }
    public RizikVo osvjeziFinancijskePodatkeZaProcjenu(RizikVo value) throws AS2Exception {
		value.setRemoteMethod("osvjeziFinancijskePodatkeZaProcjenu");
		RizikVo res = (RizikVo)  execute(value);
		return res;
    }
    public RizikVo osvjeziPoslovniOdnosZaProcjenu(RizikVo value) throws AS2Exception {
		value.setRemoteMethod("osvjeziPoslovniOdnosZaProcjenu");
		RizikVo res = (RizikVo)  execute(value);
		return res;
    }
    public RizikRs pripremaMisljenja(RizikVo value) throws AS2Exception {
    	value.setRemoteMethod("pripremaMisljenja");
    	RizikRs res = (RizikRs)  executeQuery(value);
    	return res;
    }
    public RizikRs citajMisljenje(RizikVo value) throws AS2Exception {
    	value.setRemoteMethod("citajMisljenje");
    	RizikRs res = (RizikRs)  executeQuery(value);
    	return res;
    }

    public PovezanaOsobaRs listaPovezanihOsoba(PovezanaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("listaPovezanihOsoba");
        PovezanaOsobaRs res = (PovezanaOsobaRs)  executeQuery(value);
    	return res;
    }
    public String getJmbgMbVezaZaNaziv(PovezanaOsobaVo value){
	    return listaPovezanihOsoba(value).rsReadIdForName(value.getJmbgMbVeza());
    }
    public String getNazivZaJmbgMbVeza(PovezanaOsobaVo value){  
	    return listaPovezanihOsoba(value).rsReadNameForId(value.getJmbgMbVeza());
    }
    public PovezanaOsobaRs dodajPovezaneOsobeIzPO(PovezanaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajPovezaneOsobeIzPO");
        PovezanaOsobaRs res = (PovezanaOsobaRs)  execute(value);
    	return res;
    }

    public RizikRs procitajSveProcjeneRizika(RizikVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveProcjeneRizika");
        RizikRs res = (RizikRs)  executeQuery(value);
    	return res;
    }

    public RizikRs pronadiProcjeneRizika(RizikVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiProcjeneRizika");
        RizikRs res = (RizikRs)  executeQuery(value);
    	return res;
    }

    public RizikVo brisiProcjenuRizika(RizikVo value) throws AS2Exception {
		value.setRemoteMethod("brisiProcjenuRizika");
		RizikVo res = (RizikVo)  execute(value);
		return res;
    }
    public ZahtjevPravnaOsobaVo dodajBonitet(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajBonitet");
        ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
        return res;
    }

    public ZahtjevPravnaOsobaVo citajPrijedlogOdobrenja(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("citajPrijedlogOdobrenja");
        ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo) execute(value);
        return res;
    }
    public ZahtjevPravnaOsobaVo azurirajOdobrenjeZahtjeva(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajOdobrenjeZahtjeva");
        ZahtjevPravnaOsobaVo res = (ZahtjevPravnaOsobaVo)  execute(value);
        return res;
    }
    //UREDNOST
    public UrednostVo dodajUrednostZahtjeva(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajUrednostZahtjeva");
        UrednostVo res = (UrednostVo)  execute(value);
        return res;
    }

    public UrednostVo azurirajUrednostZahtjeva(UrednostVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajUrednostZahtjeva");
        UrednostVo res = (UrednostVo)  execute(value);
        return res;
    }
    public UrednostVo citajUrednostZahtjeva(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("citajUrednostZahtjeva");
        UrednostVo res = (UrednostVo) execute(value);
        return res;
    }
    //OSIGURANJE
    public OsiguranjeVo dodajOsiguranjeZahtjeva(OsiguranjeVo value) throws AS2Exception {
        value.setRemoteMethod("dodajOsiguranjeZahtjeva");
        OsiguranjeVo res = (OsiguranjeVo)  execute(value);
        return res;
    }

    public OsiguranjeVo azurirajOsiguranjeZahtjeva(OsiguranjeVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajOsiguranjeZahtjeva");
        OsiguranjeVo res = (OsiguranjeVo)  execute(value);
        return res;
    }

    public OsiguranjeVo citajOsiguranjeZahtjeva(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("citajOsiguranjeZahtjeva");
        OsiguranjeVo res = (OsiguranjeVo) execute(value);
        return res;
    }

    public KolateralPonudeniRs procitajSvePostojeceKolaterale(ZaduzenostKodBankeVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSvePostojeceKolaterale");
        KolateralPonudeniRs res = (KolateralPonudeniRs) executeQuery(value);
        return res;
    }

    public RizikKomentarVo dodajKomentar(RizikKomentarVo value) throws AS2Exception {
        value.setRemoteMethod("dodajKomentar");
        RizikKomentarVo res = (RizikKomentarVo)  execute(value);
        return res;
    }

    public RizikKomentarVo azurirajKomentar(RizikKomentarVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajKomentar");
        RizikKomentarVo res = (RizikKomentarVo)  execute(value);
        return res;
    }

    public RizikKomentarVo brisiKomentar(RizikKomentarVo value) throws AS2Exception {
        value.setRemoteMethod("brisiKomentar");
        RizikKomentarVo res = (RizikKomentarVo)  execute(value);
        return res;
    }

    public RizikKomentarRs procitajSveKomentare(RizikKomentarVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveKomentare");
        RizikKomentarRs res = (RizikKomentarRs)  executeQuery(value);
        return res;
    }
    public RizikVo duplicirajMisljenje(RizikVo value) throws AS2Exception {
        value.setRemoteMethod("duplicirajMisljenje");
        RizikVo res = (RizikVo)  execute(value);
		return res;
    }

	public PoslovniOdnosBankaRs citajDionicePovezanihOsoba(ZahtjevPravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("citajDionicePovezanihOsoba");
        PoslovniOdnosBankaRs res = (PoslovniOdnosBankaRs) executeQuery(value);
        return res;
	}
}