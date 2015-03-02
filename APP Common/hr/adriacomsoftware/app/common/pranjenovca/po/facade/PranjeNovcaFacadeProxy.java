package hr.adriacomsoftware.app.common.pranjenovca.po.facade;

import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPoPovezanaOsobaRs;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPoPovezanaOsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPoRacunRs;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPoRacunVo;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPravnaOsobaRs;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPravnaOsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPrivitakRs;
import hr.adriacomsoftware.app.common.pranjenovca.po.dto.PrnPrivitakVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class PranjeNovcaFacadeProxy extends AS2FacadeProxy implements PranjeNovcaFacade {

    private static PranjeNovcaFacadeProxy _instance = null;

    private PranjeNovcaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pranjenovca.po.facade.PranjeNovcaFacadeServer");
    }

    public static PranjeNovcaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new PranjeNovcaFacadeProxy();
        return _instance;
    }
    
//  pravna osoba
    public PravnaOsobaRs procitajSveOsobe(PravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveOsobe");
    	PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
    	return res;
    }
    public PravnaOsobaRs pronadiOsobe(PravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiOsobe");
    	PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
    	return res;
    } 
    public PravnaOsobaRs izvjestajiPravneOsobe(PravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("izvjestajiPravneOsobe");
    	PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
    	return res;
    }
//	clanovi    
    public PrnPoPovezanaOsobaVo azurirajPovezanuOsobu(PrnPoPovezanaOsobaVo value) throws AS2Exception {
       	value.setRemoteMethod("azurirajPovezanuOsobu");
       	PrnPoPovezanaOsobaVo res = (PrnPoPovezanaOsobaVo)  execute(value);
    	return res;
    }

    public PrnPoPovezanaOsobaRs procitajSvePovezaneOsobe(PrnPoPovezanaOsobaVo value) throws AS2Exception {
//        StringBuffer upit = new StringBuffer();
//        upit.append(value.getIdUpitnika());
//        upit.append(value.getVrstaUnosa());
        //TODO ukoliko se moze koristiti cache 
        
    	value.setRemoteMethod("procitajSvePovezaneOsobe");
    	PrnPoPovezanaOsobaRs res = (PrnPoPovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public String getNazivZaJmbgMaticniBrojVeza(PrnPoPovezanaOsobaVo value){  
        //TODO String abc = procitajSvePovezaneOsobe(value).rsReadNameForId(value.getJmbgMaticniBrojVeza());
	    return procitajSvePovezaneOsobe(value).rsReadNameForId(value.getJmbgMaticniBrojVeza());
    }
    public String getJmbgMaticniBrojVezaZaNaziv(PrnPoPovezanaOsobaVo value){
	    return procitajSvePovezaneOsobe(value).rsReadIdForName(value.getJmbgMaticniBrojVeza());
    }
    public PrnPoPovezanaOsobaRs procitajSvePovezaneOsobePOVIJEST(PrnPoPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobePOVIJEST");
    	PrnPoPovezanaOsobaRs res = (PrnPoPovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public PrnPoPovezanaOsobaVo dodajPovezanuOsobu(PrnPoPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPovezanuOsobu");
    	PrnPoPovezanaOsobaVo res = (PrnPoPovezanaOsobaVo)  execute(value);
    	return res;
    }

    public PrnPoPovezanaOsobaVo brisiPovezanuOsobu(PrnPoPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPovezanuOsobu");
    	PrnPoPovezanaOsobaVo res = (PrnPoPovezanaOsobaVo)  execute(value);
    	return res;
    }

//  račun
    public PrnPoRacunVo citajRacun(PrnPoRacunVo value) throws AS2Exception {
    	value.setRemoteMethod("citajRacun");
    	PrnPoRacunVo res = (PrnPoRacunVo) execute(value);
    	return res;
    }
    public PrnPoRacunVo azurirajRacun(PrnPoRacunVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajRacun");
    	System.out.println(value);
    	PrnPoRacunVo res = (PrnPoRacunVo)  execute(value);
    	return res;
    }
    public PrnPoRacunVo dodajRacun(PrnPoRacunVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajRacun");
    	PrnPoRacunVo res = (PrnPoRacunVo)  execute(value);
    	return res;
    }
    public PrnPoRacunRs listaRacuna(PrnPoRacunVo value) throws AS2Exception {
    	value.setRemoteMethod("listaRacuna");
    	PrnPoRacunRs res = (PrnPoRacunRs)  executeQuery(value);
    	return res;
    }
//  upitnik
    public PrnPravnaOsobaRs procitajSveUpitnike(PrnPravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveUpitnike");
    	PrnPravnaOsobaRs res = (PrnPravnaOsobaRs) executeQuery(value);
    	return res;
     }
    public PrnPravnaOsobaVo citajUpitnik(PrnPravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("citajUpitnik");
    	PrnPravnaOsobaVo res = (PrnPravnaOsobaVo) execute(value);
    	return res;
    }
    public PrnPravnaOsobaRs pronadiUpitnike(PrnPravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiUpitnike");
    	PrnPravnaOsobaRs res = (PrnPravnaOsobaRs) executeQuery(value);
    	return res;
     }
    public PrnPravnaOsobaVo azurirajUpitnik(PrnPravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajUpitnik");
    	PrnPravnaOsobaVo res = (PrnPravnaOsobaVo)  execute(value);
    	return res;
     }
    public PrnPravnaOsobaVo dodajUpitnik(PrnPravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajUpitnik");
    	PrnPravnaOsobaVo res = (PrnPravnaOsobaVo)  execute(value);
    	return res;
     }
    public PrnPravnaOsobaVo brisiUpitnik(PrnPravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiUpitnik");
    	PrnPravnaOsobaVo res = (PrnPravnaOsobaVo)  execute(value);
    	return res;
     }
//  privitak
    public PrnPrivitakRs procitajSvePrivitke(PrnPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePrivitke");
    	PrnPrivitakRs res = (PrnPrivitakRs) executeQuery(value);
    	return res;
     }
    public PrnPrivitakVo dodajPrivitak(PrnPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPrivitak");
    	PrnPrivitakVo res = (PrnPrivitakVo)  execute(value);
    	return res;
     }
    public PrnPrivitakVo citajPrivitak(PrnPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrivitak");
    	PrnPrivitakVo res = (PrnPrivitakVo)  execute(value);
    	return res;
     }
    public PrnPrivitakVo brisiPrivitak(PrnPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPrivitak");
    	PrnPrivitakVo res = (PrnPrivitakVo)  execute(value);
    	return res;
     }
    public PrnPravnaOsobaVo azurirajZavrsnePodatkeUpitnika(PrnPravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajZavrsnePodatkeUpitnika");
    	PrnPravnaOsobaVo res = (PrnPravnaOsobaVo)  execute(value);
    	return res;
    }

    public PrnPravnaOsobaRs dubinskaAnalizaPravneOsobe(PravnaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dubinskaAnalizaPravneOsobe");
    	PrnPravnaOsobaRs res = (PrnPravnaOsobaRs) executeQuery(value);
    	return res;
    }

    public PrnPravnaOsobaRs dubinskaAnalizaSvihPravnihOsoba(PravnaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("dubinskaAnalizaSvihPravnihOsoba");
    	PrnPravnaOsobaRs res = (PrnPravnaOsobaRs) executeQuery(value);
    	return res;
    }
   
}