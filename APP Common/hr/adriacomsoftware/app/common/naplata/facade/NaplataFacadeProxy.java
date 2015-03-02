package hr.adriacomsoftware.app.common.naplata.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentBiljeskaRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentBiljeskaVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentKontaktRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentKontaktVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentOtplatniPlanRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentOtplatniPlanVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentStatusRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentStatusVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataKlijentVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class NaplataFacadeProxy extends AS2FacadeProxy implements NaplataFacade {

    private static NaplataFacadeProxy _instance = null;

    private NaplataFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.naplata.facade.NaplataFacadeServer");
    }

    public static NaplataFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new NaplataFacadeProxy();
        return _instance;
    }
    public NaplataRs listajSveSpise(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("listajSveSpise");
    	NaplataRs res = (NaplataRs) executeQuery(value);
    	return res;
     }
    public NaplataRs listajSveBiljeske(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("listajSveBiljeske");
    	NaplataRs res = (NaplataRs) executeQuery(value);
    	return res;
     }
    public NaplataVo citajBiljesku(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("citajBiljesku");
    	NaplataVo res = (NaplataVo) execute(value);
    	return res;
    }
    public NaplataVo dodajBiljesku(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajBiljesku");
    	NaplataVo res = (NaplataVo) execute(value);
    	return res;
    }
    public NaplataVo azurirajBiljesku(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajBiljesku");
    	NaplataVo res = (NaplataVo) execute(value);
    	return res;
    }
    public NaplataVo brisiBiljesku(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiBiljesku");
    	NaplataVo res = (NaplataVo) execute(value);
    	return res;
    }
    public NaplataVo brisiViseBiljeski(NaplataRs value) throws AS2Exception {
    	value.setRemoteMethod("brisiViseBiljeski");
    	NaplataVo res = (NaplataVo)  execute(value);
    	return res;
    }
    public NaplataRs pronadiSpise(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiSpise");
    	NaplataRs res = (NaplataRs) executeQuery(value);
    	return res;
    }
    public NaplataRs citajSpis(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("citajSpis");
    	NaplataRs res = (NaplataRs) executeQuery(value);
    	return res;
    }

	public NaplataKlijentRs procitajKlijenteNaplate(NaplataKlijentVo value)	throws AS2Exception {
    	value.setRemoteMethod("procitajKlijenteNaplate");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentRs pronadiKlijenteNaplate(NaplataKlijentVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiKlijenteNaplate");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentRs filtrirajKlijente(NaplataKlijentVo value) throws AS2Exception {
    	value.setRemoteMethod("filtrirajKlijente");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentVo dodajKlijentaNaplate(NaplataKlijentVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajKlijentaNaplate");
    	NaplataKlijentVo res = (NaplataKlijentVo) execute(value);
    	return res;
	}

	public NaplataKlijentVo azurirajKlijentaNaplate(NaplataKlijentVo value)	throws AS2Exception {
    	value.setRemoteMethod("azurirajKlijentaNaplate");
    	NaplataKlijentVo res = (NaplataKlijentVo) execute(value);
    	return res;
	}
	//kontakt
	public NaplataKlijentKontaktVo azurirajKontakt(NaplataKlijentKontaktVo value)throws AS2Exception {
    	value.setRemoteMethod("azurirajKontakt");
    	NaplataKlijentKontaktVo res = (NaplataKlijentKontaktVo) execute(value);
    	return res;
	}
	public NaplataKlijentKontaktRs procitajSveKontakte(NaplataKlijentVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveKontakte");
    	NaplataKlijentKontaktRs res = (NaplataKlijentKontaktRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentKontaktVo dodajKontakt(NaplataKlijentKontaktVo value)throws AS2Exception {
    	value.setRemoteMethod("dodajKontakt");
    	NaplataKlijentKontaktVo res = (NaplataKlijentKontaktVo) execute(value);
    	return res;
	}

	public NaplataKlijentKontaktVo brisiKontakt(NaplataKlijentKontaktVo value)throws AS2Exception {
    	value.setRemoteMethod("brisiKontakt");
    	NaplataKlijentKontaktVo res = (NaplataKlijentKontaktVo) execute(value);
    	return res;
	}

	public NaplataKlijentKontaktVo brisiViseKontakta(NaplataKlijentKontaktRs value) throws AS2Exception {
    	value.setRemoteMethod("brisiViseKontakta");
    	NaplataKlijentKontaktVo res = (NaplataKlijentKontaktVo) execute(value);
    	return res;
	}
	//biljeske
	public NaplataKlijentBiljeskaVo azurirajBiljesku(NaplataKlijentBiljeskaVo value) throws AS2Exception {
	   	value.setRemoteMethod("azurirajBiljesku");
	   	NaplataKlijentBiljeskaVo res = (NaplataKlijentBiljeskaVo) execute(value);
    	return res;
	}

	public NaplataKlijentBiljeskaRs procitajSveBiljeske(NaplataKlijentVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveBiljeske");
		NaplataKlijentBiljeskaRs res = (NaplataKlijentBiljeskaRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentBiljeskaVo dodajBiljesku(NaplataKlijentBiljeskaVo value)throws AS2Exception {
	   	value.setRemoteMethod("dodajBiljesku");
	   	NaplataKlijentBiljeskaVo res = (NaplataKlijentBiljeskaVo) execute(value);
    	return res;
	}

	public NaplataKlijentBiljeskaVo brisiBiljesku(NaplataKlijentBiljeskaVo value)throws AS2Exception {
	   	value.setRemoteMethod("brisiBiljesku");
	   	NaplataKlijentBiljeskaVo res = (NaplataKlijentBiljeskaVo) execute(value);
    	return res;
	}

	public NaplataKlijentBiljeskaVo brisiViseBiljeskiKlijenta(NaplataKlijentBiljeskaRs value) throws AS2Exception {
	   	value.setRemoteMethod("brisiViseBiljeskiKlijenta");
	   	NaplataKlijentBiljeskaVo res = (NaplataKlijentBiljeskaVo) execute(value);
    	return res;
	}
	public NaplataKlijentVo dodajNoveKlijente(AS2RecordList value)throws AS2Exception {
	   	value.setRemoteMethod("dodajNoveKlijente");
	   	NaplataKlijentVo res = (NaplataKlijentVo) execute(value);
    	return res;
	}
	public void brisiViseKlijenata(AS2RecordList value)throws AS2Exception {
	   	value.setRemoteMethod("brisiViseKlijenata");
	   	execute(value);
	}
	//status
	public NaplataKlijentStatusVo azurirajStatus(NaplataKlijentStatusVo value)	throws AS2Exception {
	   	value.setRemoteMethod("azurirajStatus");
	   	NaplataKlijentStatusVo res = (NaplataKlijentStatusVo) execute(value);
    	return res;
	}

	public NaplataKlijentStatusRs procitajSveStatuse(NaplataKlijentVo value)	throws AS2Exception {
		value.setRemoteMethod("procitajSveStatuse");
		NaplataKlijentStatusRs res = (NaplataKlijentStatusRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentStatusVo dodajStatus(NaplataKlijentStatusVo value)	throws AS2Exception {
	   	value.setRemoteMethod("dodajStatus");
	   	NaplataKlijentStatusVo res = (NaplataKlijentStatusVo) execute(value);
    	return res;
	}

	public NaplataKlijentStatusVo brisiStatus(NaplataKlijentStatusVo value)throws AS2Exception {
	   	value.setRemoteMethod("brisiStatus");
	   	NaplataKlijentStatusVo res = (NaplataKlijentStatusVo) execute(value);
    	return res;
	}

	public NaplataKlijentStatusVo brisiViseStatusaKlijenta(NaplataKlijentStatusRs value) throws AS2Exception {
	   	value.setRemoteMethod("brisiViseStatusaKlijenta");
	   	NaplataKlijentStatusVo res = (NaplataKlijentStatusVo) execute(value);
    	return res;
	}
	public NaplataKlijentRs izvjesceKlijentaNaplate(NaplataKlijentVo value)	throws AS2Exception {
		value.setRemoteMethod("izvjesceKlijentaNaplate");
		NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentRs izvjesceNaplateSkupno(NaplataKlijentVo value) throws AS2Exception {
		value.setRemoteMethod("izvjesceNaplateSkupno");
		NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}

	public AS2RecordList prometProlaznaKontaKreditaGradana(OsnovniVo value)	throws AS2Exception {
		value.setRemoteMethod("prometProlaznaKontaKreditaGradana");
		return executeQuery(value);
	}
	public NaplataKlijentRs procitajKlijenteNaplateSSP(NaplataKlijentVo value)	throws AS2Exception {
    	value.setRemoteMethod("procitajKlijenteNaplateSSP");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}
	public NaplataKlijentRs pronadiKlijenteNaplateSSP(NaplataKlijentVo value)	throws AS2Exception {
    	value.setRemoteMethod("pronadiKlijenteNaplateSSP");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}
	public NaplataRs procitajPovijestPolja(NaplataVo value) throws AS2Exception {
		value.setRemoteMethod("procitajPovijestPolja");
		NaplataRs res = (NaplataRs) executeQuery(value);
    	return res;
	}

	public NaplataRs izvjestaji(NaplataVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestaji");
		NaplataRs res = (NaplataRs) executeQuery(value);
    	return res;
	}

	public NaplataRs izvjestajReferat(NaplataVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajReferat");
		NaplataRs res = (NaplataRs) executeQuery(value);
    	return res;
	}
	//privitak
	public NaplataVo dodajPrivitak(NaplataVo value) throws AS2Exception {
		value.setRemoteMethod("dodajPrivitak");
		NaplataVo res = (NaplataVo) execute(value);
    	return res;
    }
    public NaplataVo citajPrivitak(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrivitak");
    	NaplataVo res = (NaplataVo) execute(value);
    	return res;
    }
    public NaplataVo brisiPrivitak(NaplataVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPrivitak");
    	NaplataVo res = (NaplataVo) execute(value);
    	return res;
    }
    //otplatni plan
	public NaplataKlijentOtplatniPlanVo azurirajOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajOtplatniPlan");
		NaplataKlijentOtplatniPlanVo res = (NaplataKlijentOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataKlijentOtplatniPlanRs procitajOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("procitajOtplatniPlan");
		NaplataKlijentOtplatniPlanRs res = (NaplataKlijentOtplatniPlanRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentOtplatniPlanVo dodajOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("dodajOtplatniPlan");
		NaplataKlijentOtplatniPlanVo res = (NaplataKlijentOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataKlijentOtplatniPlanVo brisiOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("brisiOtplatniPlan");
		NaplataKlijentOtplatniPlanVo res = (NaplataKlijentOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataKlijentOtplatniPlanVo brisiViseOtplatnihPlanova(NaplataKlijentOtplatniPlanRs value) throws AS2Exception {
		value.setRemoteMethod("brisiViseOtplatnihPlanova");
		NaplataKlijentOtplatniPlanVo res = (NaplataKlijentOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataKlijentOtplatniPlanVo izradiOtplatniPlan(NaplataKlijentOtplatniPlanVo value) throws AS2Exception {
		value.setRemoteMethod("izradiOtplatniPlan");
		NaplataKlijentOtplatniPlanVo res = (NaplataKlijentOtplatniPlanVo) execute(value);
    	return res;
	}

	public NaplataKlijentBiljeskaRs procitajMogucePotpisnikeNagodbe(NaplataKlijentBiljeskaVo value) throws AS2Exception {
		value.setRemoteMethod("procitajMogucePotpisnikeNagodbe");
		NaplataKlijentBiljeskaRs res = (NaplataKlijentBiljeskaRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentBiljeskaRs procitajSifre(NaplataKlijentBiljeskaVo value)	throws AS2Exception {
		value.setRemoteMethod("procitajSifre");
		NaplataKlijentBiljeskaRs res = (NaplataKlijentBiljeskaRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentRs izvjesceRocnostGradani(NaplataKlijentVo value)throws AS2Exception {
    	value.setRemoteMethod("izvjesceRocnostGradani");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentRs izvjesceRocnostPravneOsobe(NaplataKlijentVo value)throws AS2Exception {
    	value.setRemoteMethod("izvjesceRocnostPravneOsobe");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentRs izvjesceZaduzenostiGradani(NaplataKlijentVo value)throws AS2Exception {
    	value.setRemoteMethod("izvjesceZaduzenostiGradani");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}

	public NaplataKlijentRs izvjesceZaduzenostiPravneOsobe(NaplataKlijentVo value) throws AS2Exception {
    	value.setRemoteMethod("izvjesceZaduzenostiPravneOsobe");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}
	
	public NaplataKlijentRs izvjesceGradaniStanjePoRacunima(NaplataKlijentVo value) throws AS2Exception {
    	value.setRemoteMethod("izvjesceGradaniStanjePoRacunima");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}
	public NaplataKlijentRs izvjescePravneOsobeStanjePoRacunima(NaplataKlijentVo value) throws AS2Exception {
    	value.setRemoteMethod("izvjescePravneOsobeStanjePoRacunima");
    	NaplataKlijentRs res = (NaplataKlijentRs) executeQuery(value);
    	return res;
	}
}