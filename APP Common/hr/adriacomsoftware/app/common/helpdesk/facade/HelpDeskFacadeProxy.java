package hr.adriacomsoftware.app.common.helpdesk.facade;


import hr.adriacomsoftware.app.common.cmdb.dto.EmailVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskKontaktRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskKontaktVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivAktivnostRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivKomentarRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivKomentarVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivPrivitakRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivPrivitakVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogAktivnostVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogPrivitakRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogPrivitakVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class HelpDeskFacadeProxy extends AS2FacadeProxy implements HelpDeskFacade {

    private static HelpDeskFacadeProxy _instance = null;

    private HelpDeskFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.helpdesk.facade.HelpDeskFacadeServer");
    }

    public static HelpDeskFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new HelpDeskFacadeProxy();
        return _instance;
    }
    public HelpDeskPozivRs procitajSvePozive(HelpDeskPozivVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSvePozive");
		HelpDeskPozivRs res = (HelpDeskPozivRs) executeQuery(value);
		return res;
    }
    public HelpDeskPozivRs pronadiPozive(HelpDeskPozivVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiPozive");
		HelpDeskPozivRs res = (HelpDeskPozivRs) executeQuery(value);
		return res;
    }

    public HelpDeskPozivVo azurirajPoziv(HelpDeskPozivVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajPoziv");
		HelpDeskPozivVo res = (HelpDeskPozivVo)  execute(value);
		return res;
    }

    public HelpDeskPozivVo dodajPoziv(HelpDeskPozivVo value) throws AS2Exception {
		value.setRemoteMethod("dodajPoziv");
		HelpDeskPozivVo res = (HelpDeskPozivVo)  execute(value);
		return res;
    }

    public HelpDeskPozivVo brisiPoziv(HelpDeskPozivVo value) throws AS2Exception {
		value.setRemoteMethod("brisiPoziv");
		HelpDeskPozivVo res = (HelpDeskPozivVo)  execute(value);
		return res;
    } 
    public HelpDeskPozivVo procitajZadnjiZahtjev(HelpDeskPozivVo value) throws AS2Exception {
		value.setRemoteMethod("procitajZadnjiZahtjev");
		HelpDeskPozivVo res = (HelpDeskPozivVo)  execute(value);
		return res;
    } 
    public HelpDeskPozivRs procitajDopusteneZahtjeve(HelpDeskPozivVo value) throws AS2Exception {
		value.setRemoteMethod("procitajDopusteneZahtjeve");
		HelpDeskPozivRs res = (HelpDeskPozivRs) executeQuery(value);
		return res;
    }
    
    public HelpDeskPozivVo dodajDopusteniZahtjev(HelpDeskPozivVo value) throws AS2Exception {
		value.setRemoteMethod("dodajDopusteniZahtjev");
		HelpDeskPozivVo res = (HelpDeskPozivVo) execute(value);
		return res;
    }
    public HelpDeskPozivVo brisiDopusteniZahtjev(HelpDeskPozivVo value) throws AS2Exception {
		value.setRemoteMethod("brisiDopusteniZahtjev");
		HelpDeskPozivVo res = (HelpDeskPozivVo) execute(value);
		return res;
    }
    
    //radni nalog
    public HelpDeskRadniNalogRs procitajSveRadneNaloge(HelpDeskRadniNalogVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveRadneNaloge");
    	HelpDeskRadniNalogRs res = (HelpDeskRadniNalogRs) executeQuery(value);
    	return res;
     }
    public HelpDeskRadniNalogRs pronadiRadneNaloge(HelpDeskRadniNalogVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiRadneNaloge");
    	HelpDeskRadniNalogRs res = (HelpDeskRadniNalogRs) executeQuery(value);
    	return res;
     }
    public HelpDeskRadniNalogVo azurirajRadniNalog(HelpDeskRadniNalogVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajRadniNalog");
    	HelpDeskRadniNalogVo res = (HelpDeskRadniNalogVo)  execute(value);
    	return res;
     }
    public HelpDeskRadniNalogVo dodajRadniNalog(HelpDeskRadniNalogVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajRadniNalog");
    	HelpDeskRadniNalogVo res = (HelpDeskRadniNalogVo)  execute(value);
    	return res;
     }
    public HelpDeskRadniNalogVo brisiRadniNalog(HelpDeskRadniNalogVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiRadniNalog");
    	HelpDeskRadniNalogVo res = (HelpDeskRadniNalogVo)  execute(value);
    	return res;
     }
    public HelpDeskPozivKomentarRs procitajSveKomentare(HelpDeskPozivKomentarVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveKomentare");
    	HelpDeskPozivKomentarRs res = (HelpDeskPozivKomentarRs) executeQuery(value);
    	return res;
     }
    public HelpDeskPozivKomentarVo azurirajKomentar(HelpDeskPozivKomentarVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajKomentar");
    	HelpDeskPozivKomentarVo res = (HelpDeskPozivKomentarVo)  execute(value);
    	return res;
     }
    public HelpDeskPozivKomentarVo dodajKomentar(HelpDeskPozivKomentarVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajKomentar");
    	HelpDeskPozivKomentarVo res = (HelpDeskPozivKomentarVo)  execute(value);
    	return res;
     }
    public HelpDeskPozivKomentarVo brisiKomentar(HelpDeskPozivKomentarVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiKomentar");
    	HelpDeskPozivKomentarVo res = (HelpDeskPozivKomentarVo)  execute(value);
    	return res;
     }
    public HelpDeskPozivAktivnostRs procitajSveAktivnosti(HelpDeskRadniNalogAktivnostVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveAktivnosti");
    	HelpDeskPozivAktivnostRs res = (HelpDeskPozivAktivnostRs) executeQuery(value);
    	return res;
     }
    public HelpDeskRadniNalogAktivnostVo azurirajAktivnost(HelpDeskRadniNalogAktivnostVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajAktivnost");
    	HelpDeskRadniNalogAktivnostVo res = (HelpDeskRadniNalogAktivnostVo)  execute(value);
    	return res;
     }
    public HelpDeskRadniNalogAktivnostVo dodajAktivnost(HelpDeskRadniNalogAktivnostVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajAktivnost");
    	HelpDeskRadniNalogAktivnostVo res = (HelpDeskRadniNalogAktivnostVo)  execute(value);
    	return res;
     }
    public HelpDeskRadniNalogAktivnostVo brisiAktivnost(HelpDeskRadniNalogAktivnostVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiAktivnost");
    	HelpDeskRadniNalogAktivnostVo res = (HelpDeskRadniNalogAktivnostVo)  execute(value);
    	return res;
     }

    public EmailVo proslijediRadniNalogEmailom(EmailVo value) throws AS2Exception {
    	value.setRemoteMethod("proslijediRadniNalogEmailom");
    	EmailVo res = (EmailVo)  execute(value);
    	return res;
    }

    public EmailVo proslijediHelpDeskPozivEmailom(EmailVo value) throws AS2Exception {
        value.setRemoteMethod("proslijediHelpDeskPozivEmailom");
    	EmailVo res = (EmailVo)  execute(value);
    	return res;
    }
    // privirak poziva
    public HelpDeskPozivPrivitakRs procitajSvePrivitke(HelpDeskPozivPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePrivitke");
    	HelpDeskPozivPrivitakRs res = (HelpDeskPozivPrivitakRs) executeQuery(value);
    	return res;
     }
    public HelpDeskPozivPrivitakVo dodajPrivitak(HelpDeskPozivPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPrivitak");
    	HelpDeskPozivPrivitakVo res = (HelpDeskPozivPrivitakVo)  execute(value);
    	return res;
     }
    public HelpDeskPozivPrivitakVo citajPrivitak(HelpDeskPozivPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrivitak");
    	HelpDeskPozivPrivitakVo res = (HelpDeskPozivPrivitakVo)  execute(value);
    	return res;
     }
    public HelpDeskPozivPrivitakVo brisiPrivitak(HelpDeskPozivPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPrivitak");
    	HelpDeskPozivPrivitakVo res = (HelpDeskPozivPrivitakVo)  execute(value);
    	return res;
     }
    // privirak ratnog naloga
    public HelpDeskRadniNalogPrivitakRs procitajSvePrivitkeRn(HelpDeskRadniNalogPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePrivitkeRn");
    	HelpDeskRadniNalogPrivitakRs res = (HelpDeskRadniNalogPrivitakRs) executeQuery(value);
    	return res;
     }
    public HelpDeskRadniNalogPrivitakVo dodajPrivitakRn(HelpDeskRadniNalogPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPrivitakRn");
    	HelpDeskRadniNalogPrivitakVo res = (HelpDeskRadniNalogPrivitakVo)  execute(value);
    	return res;
     }
    public HelpDeskRadniNalogPrivitakVo citajPrivitakRn(HelpDeskRadniNalogPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrivitakRn");
    	HelpDeskRadniNalogPrivitakVo res = (HelpDeskRadniNalogPrivitakVo)  execute(value);
    	return res;
     }
    public HelpDeskRadniNalogPrivitakVo brisiPrivitakRn(HelpDeskRadniNalogPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPrivitakRn");
    	HelpDeskRadniNalogPrivitakVo res = (HelpDeskRadniNalogPrivitakVo)  execute(value);
    	return res;
     }
    public HelpDeskKontaktRs procitajSveKontakte(HelpDeskKontaktVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveKontakte");
    	HelpDeskKontaktRs res = (HelpDeskKontaktRs) executeQuery(value);
    	return res;
     }
    public HelpDeskKontaktRs pronadiKontakte(HelpDeskKontaktVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiKontakte");
    	HelpDeskKontaktRs res = (HelpDeskKontaktRs) executeQuery(value);
    	return res;
     }
    public HelpDeskKontaktVo azurirajKontakt(HelpDeskKontaktVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajKontakt");
    	HelpDeskKontaktVo res = (HelpDeskKontaktVo)  execute(value);
    	return res;
     }
    public HelpDeskKontaktVo dodajKontakt(HelpDeskKontaktVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajKontakt");
    	HelpDeskKontaktVo res = (HelpDeskKontaktVo)  execute(value);
    	return res;
     }
    public HelpDeskKontaktVo brisiKontakt(HelpDeskKontaktVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiKontakt");
    	HelpDeskKontaktVo res = (HelpDeskKontaktVo)  execute(value);
    	return res;
     }
}