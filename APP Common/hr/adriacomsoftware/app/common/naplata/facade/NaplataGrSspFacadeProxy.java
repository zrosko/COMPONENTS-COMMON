package hr.adriacomsoftware.app.common.naplata.facade;

import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspOtplatniPlanRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspOtplatniPlanVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspPrivitakVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class NaplataGrSspFacadeProxy extends AS2FacadeProxy implements NaplataGrSspFacade {

    private static NaplataGrSspFacadeProxy _instance = null;

    private NaplataGrSspFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.naplata.facade.NaplataGrSspFacadeServer");
    }

    public static NaplataGrSspFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new NaplataGrSspFacadeProxy();
        return _instance;
    }
//    public NaplataRs listajSveSpise(NaplataVo value) throws J2EEException {
//    	value.setRemoteMethod("listajSveSpise");
//    	NaplataRs res = (NaplataRs) executeQuery(value);
//    	return res;
//     }
//    public NaplataRs listajSveBiljeske(NaplataVo value) throws J2EEException {
//    	value.setRemoteMethod("listajSveBiljeske");
//    	NaplataRs res = (NaplataRs) executeQuery(value);
//    	return res;
//     }
//    public NaplataVo citajBiljesku(NaplataVo value) throws J2EEException {
//    	value.setRemoteMethod("citajBiljesku");
//    	NaplataVo res = (NaplataVo) execute(value);
//    	return res;
//    }
//    public NaplataVo dodajBiljesku(NaplataVo value) throws J2EEException {
//    	value.setRemoteMethod("dodajBiljesku");
//    	NaplataVo res = (NaplataVo) execute(value);
//    	return res;
//    }
//    public NaplataVo azurirajBiljesku(NaplataVo value) throws J2EEException {
//    	value.setRemoteMethod("azurirajBiljesku");
//    	NaplataVo res = (NaplataVo) execute(value);
//    	return res;
//    }
//    public NaplataVo brisiBiljesku(NaplataVo value) throws J2EEException {
//    	value.setRemoteMethod("brisiBiljesku");
//    	NaplataVo res = (NaplataVo) execute(value);
//    	return res;
//    }
//    public NaplataVo brisiViseBiljeski(NaplataRs value) throws J2EEException {
//    	value.setRemoteMethod("brisiViseBiljeski");
//    	NaplataVo res = (NaplataVo)  execute(value);
//    	return res;
//    }
//    public NaplataRs pronadiSpise(NaplataVo value) throws J2EEException {
//    	value.setRemoteMethod("pronadiSpise");
//    	NaplataRs res = (NaplataRs) executeQuery(value);
//    	return res;
//    }
//    public NaplataRs citajSpis(NaplataVo value) throws J2EEException {
//    	value.setRemoteMethod("citajSpis");
//    	NaplataRs res = (NaplataRs) executeQuery(value);
//    	return res;
//    }
//
//	public NaplataKlijentRs procitajKlijenteNaplate(NaplataKlijentVo value)	throws J2EEException {
//    	value.setRemoteMethod("procitajKlijenteNaplate");
//    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
//    	return res;
//	}
//
//	public NaplataKlijentRs pronadiKlijenteNaplate(NaplataKlijentVo value) throws J2EEException {
//    	value.setRemoteMethod("pronadiKlijenteNaplate");
//    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
//    	return res;
//	}
//
//	public NaplataKlijentRs filtrirajKlijente(NaplataKlijentVo value) throws J2EEException {
//    	value.setRemoteMethod("filtrirajKlijente");
//    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
//    	return res;
//	}
//
//	public NaplataKlijentVo dodajKlijentaNaplate(NaplataKlijentVo value) throws J2EEException {
//    	value.setRemoteMethod("dodajKlijentaNaplate");
//    	NaplataKlijentVo res = (NaplataKlijentVo) execute(value);
//    	return res;
//	}
//
//	public NaplataKlijentVo azurirajKlijentaNaplate(NaplataKlijentVo value)	throws J2EEException {
//    	value.setRemoteMethod("azurirajKlijentaNaplate");
//    	NaplataKlijentVo res = (NaplataKlijentVo) execute(value);
//    	return res;
//	}
//	//kontakt
//	public NaplataKlijentKontaktVo azurirajKontakt(NaplataKlijentKontaktVo value)throws J2EEException {
//    	value.setRemoteMethod("azurirajKontakt");
//    	NaplataKlijentKontaktVo res = (NaplataKlijentKontaktVo) execute(value);
//    	return res;
//	}
//	public NaplataKlijentKontaktRs procitajSveKontakte(NaplataKlijentVo value) throws J2EEException {
//    	value.setRemoteMethod("procitajSveKontakte");
//    	NaplataKlijentKontaktRs res = (NaplataKlijentKontaktRs) executeQuery(value);
//    	return res;
//	}
//
//	public NaplataKlijentKontaktVo dodajKontakt(NaplataKlijentKontaktVo value)throws J2EEException {
//    	value.setRemoteMethod("dodajKontakt");
//    	NaplataKlijentKontaktVo res = (NaplataKlijentKontaktVo) execute(value);
//    	return res;
//	}
//
//	public NaplataKlijentKontaktVo brisiKontakt(NaplataKlijentKontaktVo value)throws J2EEException {
//    	value.setRemoteMethod("brisiKontakt");
//    	NaplataKlijentKontaktVo res = (NaplataKlijentKontaktVo) execute(value);
//    	return res;
//	}
//
//	public NaplataKlijentKontaktVo brisiViseKontakta(NaplataKlijentKontaktRs value) throws J2EEException {
//    	value.setRemoteMethod("brisiViseKontakta");
//    	NaplataKlijentKontaktVo res = (NaplataKlijentKontaktVo) execute(value);
//    	return res;
//	}
	//biljeske
	public NaplataGrSspVo azurirajBiljesku(NaplataGrSspVo value) throws AS2Exception {
	   	value.setRemoteMethod("azurirajBiljesku");
	   	NaplataGrSspVo res = (NaplataGrSspVo) execute(value);
    	return res;
	}

	public NaplataGrSspRs procitajSveBiljeske(NaplataGrSspVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveBiljeske");
		NaplataGrSspRs res = (NaplataGrSspRs) executeQuery(value);
    	return res;
	}

	public NaplataGrSspVo procitajBiljesku(NaplataGrSspVo value) throws AS2Exception {
	   	value.setRemoteMethod("procitajBiljesku");
	   	NaplataGrSspVo res = (NaplataGrSspVo) execute(value);
    	return res;
	}
	
	public NaplataGrSspVo dodajBiljesku(NaplataGrSspVo value)throws AS2Exception {
	   	value.setRemoteMethod("dodajBiljesku");
	   	NaplataGrSspVo res = (NaplataGrSspVo) execute(value);
    	return res;
	}

	public NaplataGrSspVo brisiBiljesku(NaplataGrSspVo value)throws AS2Exception {
	   	value.setRemoteMethod("brisiBiljesku");
	   	NaplataGrSspVo res = (NaplataGrSspVo) execute(value);
    	return res;
	}

	public NaplataGrSspVo brisiViseBiljeski(NaplataGrSspRs value) throws AS2Exception {
	   	value.setRemoteMethod("brisiViseBiljeski");
	   	NaplataGrSspVo res = (NaplataGrSspVo) execute(value);
    	return res;
	}
//	public NaplataKlijentVo dodajNoveKlijente(J2EEResultSet value)throws J2EEException {
//	   	value.setRemoteMethod("dodajNoveKlijente");
//	   	NaplataKlijentVo res = (NaplataKlijentVo) execute(value);
//    	return res;
//	}
//	public void brisiViseKlijenata(J2EEResultSet value)throws J2EEException {
//	   	value.setRemoteMethod("brisiViseKlijenata");
//	   	execute(value);
//	}
//	//status
//	public NaplataKlijentStatusVo azurirajStatus(NaplataKlijentStatusVo value)	throws J2EEException {
//	   	value.setRemoteMethod("azurirajStatus");
//	   	NaplataKlijentStatusVo res = (NaplataKlijentStatusVo) execute(value);
//    	return res;
//	}
//
//	public NaplataKlijentStatusRs procitajSveStatuse(NaplataKlijentVo value)	throws J2EEException {
//		value.setRemoteMethod("procitajSveStatuse");
//		NaplataKlijentStatusRs res = (NaplataKlijentStatusRs) executeQuery(value);
//    	return res;
//	}
//
//	public NaplataKlijentStatusVo dodajStatus(NaplataKlijentStatusVo value)	throws J2EEException {
//	   	value.setRemoteMethod("dodajStatus");
//	   	NaplataKlijentStatusVo res = (NaplataKlijentStatusVo) execute(value);
//    	return res;
//	}
//
//	public NaplataKlijentStatusVo brisiStatus(NaplataKlijentStatusVo value)throws J2EEException {
//	   	value.setRemoteMethod("brisiStatus");
//	   	NaplataKlijentStatusVo res = (NaplataKlijentStatusVo) execute(value);
//    	return res;
//	}
//
//	public NaplataKlijentStatusVo brisiViseStatusaKlijenta(NaplataKlijentStatusRs value) throws J2EEException {
//	   	value.setRemoteMethod("brisiViseStatusaKlijenta");
//	   	NaplataKlijentStatusVo res = (NaplataKlijentStatusVo) execute(value);
//    	return res;
//	}
//	public NaplataKlijentRs izvjesceKlijentaNaplate(NaplataKlijentVo value)	throws J2EEException {
//		value.setRemoteMethod("izvjesceKlijentaNaplate");
//		NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
//    	return res;
//	}
//
//	public NaplataKlijentRs izvjesceNaplateSkupno(NaplataKlijentVo value) throws J2EEException {
//		value.setRemoteMethod("izvjesceNaplateSkupno");
//		NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
//    	return res;
//	}
//
//	public J2EEResultSet prometProlaznaKontaKreditaGradana(OsnovniVo value)	throws J2EEException {
//		value.setRemoteMethod("prometProlaznaKontaKreditaGradana");
//		return executeQuery(value);
//	}
	public NaplataGrSspRs procitajPartijeNaplateSSP(NaplataGrSspVo value)	throws AS2Exception {
    	value.setRemoteMethod("procitajPartijeNaplateSSP");
    	NaplataGrSspRs res = (NaplataGrSspRs) executeQuery(value);
    	return res;
	}
	public NaplataGrSspRs pronadiPartijeNaplateSSP(NaplataGrSspVo value)	throws AS2Exception {
    	value.setRemoteMethod("pronadiPartijeNaplateSSP");
    	NaplataGrSspRs res = (NaplataGrSspRs) executeQuery(value);
    	return res;
	}
	public NaplataGrSspRs procitajPovijestPolja(NaplataGrSspVo value) throws AS2Exception {
		value.setRemoteMethod("procitajPovijestPolja");
		NaplataGrSspRs res = (NaplataGrSspRs) executeQuery(value);
    	return res;
	}

	public NaplataGrSspRs izvjestaji(NaplataGrSspVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestaji");
		NaplataGrSspRs res = (NaplataGrSspRs) executeQuery(value);
    	return res;
	}

	public NaplataGrSspRs izvjestajReferat(NaplataGrSspVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajReferat");
		NaplataGrSspRs res = (NaplataGrSspRs) executeQuery(value);
    	return res;
	}
	//privitak
	public NaplataGrSspPrivitakVo dodajPrivitak(NaplataGrSspPrivitakVo value) throws AS2Exception {
		value.setRemoteMethod("dodajPrivitak");
		NaplataGrSspPrivitakVo res = (NaplataGrSspPrivitakVo) execute(value);
    	return res;
    }
    public NaplataGrSspPrivitakVo citajPrivitak(NaplataGrSspPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrivitak");
    	NaplataGrSspPrivitakVo res = (NaplataGrSspPrivitakVo) execute(value);
    	return res;
    }
    public NaplataGrSspPrivitakVo brisiPrivitak(NaplataGrSspPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPrivitak");
    	NaplataGrSspPrivitakVo res = (NaplataGrSspPrivitakVo) execute(value);
    	return res;
    }
    //otplatni plan
	public NaplataGrSspOtplatniPlanVo azurirajOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajOtplatniPlan");
		NaplataGrSspOtplatniPlanVo res = (NaplataGrSspOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataGrSspOtplatniPlanRs procitajOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("procitajOtplatniPlan");
		NaplataGrSspOtplatniPlanRs res = (NaplataGrSspOtplatniPlanRs) executeQuery(value);
    	return res;
	}

	public NaplataGrSspOtplatniPlanVo dodajOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("dodajOtplatniPlan");
		NaplataGrSspOtplatniPlanVo res = (NaplataGrSspOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataGrSspOtplatniPlanVo brisiOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("brisiOtplatniPlan");
		NaplataGrSspOtplatniPlanVo res = (NaplataGrSspOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataGrSspOtplatniPlanVo brisiViseOtplatnihPlanova(NaplataGrSspOtplatniPlanRs value) throws AS2Exception {
		value.setRemoteMethod("brisiViseOtplatnihPlanova");
		NaplataGrSspOtplatniPlanVo res = (NaplataGrSspOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataGrSspOtplatniPlanVo izradiOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("izradiOtplatniPlan");
		NaplataGrSspOtplatniPlanVo res = (NaplataGrSspOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataGrSspRs procitajMogucePotpisnikeNagodbe(NaplataGrSspVo value) throws AS2Exception {
		value.setRemoteMethod("procitajMogucePotpisnikeNagodbe");
		NaplataGrSspRs res = (NaplataGrSspRs) executeQuery(value);
    	return res;
	}

	public NaplataGrSspRs procitajSifre(NaplataGrSspVo value)	throws AS2Exception {
		value.setRemoteMethod("procitajSifre");
		NaplataGrSspRs res = (NaplataGrSspRs) executeQuery(value);
    	return res;
	}
}