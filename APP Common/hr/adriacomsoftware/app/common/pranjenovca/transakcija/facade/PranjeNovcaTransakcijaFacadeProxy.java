package hr.adriacomsoftware.app.common.pranjenovca.transakcija.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.transakcija.dto.PrnTransakcijaRs;
import hr.adriacomsoftware.app.common.pranjenovca.transakcija.dto.PrnTransakcijaVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class PranjeNovcaTransakcijaFacadeProxy extends AS2FacadeProxy implements PranjeNovcaTransakcijaFacade {

    private static PranjeNovcaTransakcijaFacadeProxy _instance = null;

    private PranjeNovcaTransakcijaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pranjenovca.transakcija.facade.PranjeNovcaTransakcijaFacadeServer");
    }

    public static PranjeNovcaTransakcijaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new PranjeNovcaTransakcijaFacadeProxy();
        return _instance;
    }
    public PrnTransakcijaRs procitajSveTransakcijePravnihOsoba(PrnTransakcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveTransakcijePravnihOsoba");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
     }
    public PrnTransakcijaRs pronadiTransakcijePravnihOsoba(PravnaOsobaVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiTransakcijePravnihOsoba");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
     }
    public PrnTransakcijaRs pronadiNoveTransakcijePravnihOsoba(PrnTransakcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiNoveTransakcijePravnihOsoba");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
     }
    public PrnTransakcijaRs procitajSveTransakcijeGradana(PrnTransakcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveTransakcijeGradana");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
     }
    public PrnTransakcijaRs procitajSveStavkeTransakcije(PrnTransakcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveStavkeTransakcije");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
     }
    public PrnTransakcijaRs pronadiTransakcijeGradana(OsobaVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiTransakcijeGradana");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
     }
    public PrnTransakcijaRs pronadiNoveTransakcijeGradana(PrnTransakcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiNoveTransakcijeGradana");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
     }
    public PrnTransakcijaVo brisiTransakciju(PrnTransakcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiTransakciju");
    	PrnTransakcijaVo res = (PrnTransakcijaVo)  execute(value);
    	return res;
     }

    public PrnTransakcijaRs filterTransakcijeGradana(PrnTransakcijaVo value) throws AS2Exception {
    	value.setRemoteMethod("filterTransakcijeGradana");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
    }

    public PrnTransakcijaRs filterTransakcijePravnihOsoba(PrnTransakcijaVo value) throws AS2Exception {
    	value.setRemoteMethod("filterTransakcijePravnihOsoba");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
    }
    
    public PrnTransakcijaVo citajTransakciju(PrnTransakcijaVo value) throws AS2Exception {
    	value.setRemoteMethod("citajTransakciju");
    	PrnTransakcijaVo res = (PrnTransakcijaVo) execute(value);
    	return res;
    }

    public PrnTransakcijaVo azurirajTransakciju(PrnTransakcijaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajTransakciju");
    	PrnTransakcijaVo res = (PrnTransakcijaVo) execute(value);
    	return res;
    }

    public PrnTransakcijaVo dodajTransakciju(PrnTransakcijaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajTransakciju");
    	PrnTransakcijaVo res = (PrnTransakcijaVo) execute(value);
    	return res;
    }

    public PrnTransakcijaRs procitajSveObradeTransakcijaGradana(PrnTransakcijaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveObradeTransakcijaGradana");
    	PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
    }
    public PrnTransakcijaRs izvjestajTransakcijeZaRazdobljeGradana(PrnTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajTransakcijeZaRazdobljeGradana");
        PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
    }
	public PrnTransakcijaRs izvjestajTransakcijePreko105000Gradana(PrnTransakcijaVo value) throws AS2Exception {
	    value.setRemoteMethod("izvjestajTransakcijePreko105000Gradana");
	    PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
		return res;
	}

    public PrnTransakcijaRs izvjestajTransakcijeZaRazdobljePravnihOsoba(PrnTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajTransakcijeZaRazdobljePravnihOsoba");
        PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
    }

    public PrnTransakcijaRs dubinskaAnalizaTransakcijeFizickeOsobe(PrnTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("dubinskaAnalizaTransakcijeFizickeOsobe");
        PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
    }
    public PrnTransakcijaRs dubinskaAnalizaTransakcijePravneOsobe(PrnTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("dubinskaAnalizaTransakcijePravneOsobe");
        PrnTransakcijaRs res = (PrnTransakcijaRs) executeQuery(value);
    	return res;
    }

    public PrnTransakcijaVo citajBiljesku(PrnTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("citajBiljesku");
        PrnTransakcijaVo res = (PrnTransakcijaVo) execute(value);
        return res;
    }

    public PrnTransakcijaVo azurirajBiljesku(PrnTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajBiljesku");
        PrnTransakcijaVo res = (PrnTransakcijaVo) execute(value);
        return res;
    }

    public PrnTransakcijaVo dodajBiljesku(PrnTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajBiljesku");
        PrnTransakcijaVo res = (PrnTransakcijaVo) execute(value);
        return res;
    }
}