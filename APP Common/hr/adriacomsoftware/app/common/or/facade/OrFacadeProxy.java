package hr.adriacomsoftware.app.common.or.facade;


import hr.adriacomsoftware.app.common.or.dto.OrDogadajRs;
import hr.adriacomsoftware.app.common.or.dto.OrDogadajVo;
import hr.adriacomsoftware.app.common.or.dto.OrGubitakRs;
import hr.adriacomsoftware.app.common.or.dto.OrGubitakVo;
import hr.adriacomsoftware.app.common.or.dto.OrNadoknadaRs;
import hr.adriacomsoftware.app.common.or.dto.OrNadoknadaVo;
import hr.adriacomsoftware.app.common.or.dto.OrPoduzetaMjeraRs;
import hr.adriacomsoftware.app.common.or.dto.OrPoduzetaMjeraVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class OrFacadeProxy extends AS2FacadeProxy implements OrFacade {

    private static OrFacadeProxy _instance = null;

    private OrFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.or.facade.OrFacadeServer");
    }

    public static OrFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new OrFacadeProxy();
        return _instance;
    }

    public OrDogadajRs pronadiDogadaje(OrDogadajVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiDogadaje");
    	OrDogadajRs res = (OrDogadajRs) executeQuery(value);
    	return res;
     }
    public OrDogadajRs procitajSveDogadaje(OrDogadajVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveDogadaje");
    	OrDogadajRs res = (OrDogadajRs) executeQuery(value);
    	return res;
     }
    public OrDogadajVo azurirajDogadaj(OrDogadajVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajDogadaj");
    	OrDogadajVo res = (OrDogadajVo)  execute(value);
    	return res;
     }
    public OrDogadajVo dodajDogadaj(OrDogadajVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajDogadaj");
    	OrDogadajVo res = (OrDogadajVo)  execute(value);
    	return res;
     }
    public OrDogadajVo brisiDogadaj(OrDogadajVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiDogadaj");
    	OrDogadajVo res = (OrDogadajVo)  execute(value);
    	return res;
     }
    public OrGubitakRs pronadiGubitake(OrGubitakVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiGubitake");
    	OrGubitakRs res = (OrGubitakRs) executeQuery(value);
    	return res;
     }
    public OrGubitakRs procitajSveGubitake(OrGubitakVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveGubitake");
    	OrGubitakRs res = (OrGubitakRs) executeQuery(value);
    	return res;
     }
    public OrGubitakVo azurirajGubitak(OrGubitakVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajGubitak");
    	OrGubitakVo res = (OrGubitakVo)  execute(value);
    	return res;
     }
    public OrGubitakVo dodajGubitak(OrGubitakVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajGubitak");
    	OrGubitakVo res = (OrGubitakVo)  execute(value);
    	return res;
     }
    public OrGubitakVo brisiGubitak(OrGubitakVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiGubitak");
    	OrGubitakVo res = (OrGubitakVo)  execute(value);
    	return res;
     }
    public OrNadoknadaRs pronadiNadoknada(OrNadoknadaVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiNadoknada");
    	OrNadoknadaRs res = (OrNadoknadaRs) executeQuery(value);
    	return res;
     }
    public OrNadoknadaRs procitajSveNadoknada(OrNadoknadaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveNadoknada");
    	OrNadoknadaRs res = (OrNadoknadaRs) executeQuery(value);
    	return res;
     }
    public OrNadoknadaVo azurirajNadoknada(OrNadoknadaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajNadoknada");
    	OrNadoknadaVo res = (OrNadoknadaVo)  execute(value);
    	return res;
     }
    public OrNadoknadaVo dodajNadoknada(OrNadoknadaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajNadoknada");
    	OrNadoknadaVo res = (OrNadoknadaVo)  execute(value);
    	return res;
     }
    public OrNadoknadaVo brisiNadoknada(OrNadoknadaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiNadoknada");
    	OrNadoknadaVo res = (OrNadoknadaVo)  execute(value);
    	return res;
     }
    public OrPoduzetaMjeraRs pronadiPoduzetaMjera(OrPoduzetaMjeraVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiPoduzetaMjera");
    	OrPoduzetaMjeraRs res = (OrPoduzetaMjeraRs) executeQuery(value);
    	return res;
     }
    public OrPoduzetaMjeraRs procitajSvePoduzetaMjera(OrPoduzetaMjeraVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSvePoduzetaMjera");
    	OrPoduzetaMjeraRs res = (OrPoduzetaMjeraRs) executeQuery(value);
    	return res;
     }
    public OrPoduzetaMjeraVo azurirajPoduzetaMjera(OrPoduzetaMjeraVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajPoduzetaMjera");
    	OrPoduzetaMjeraVo res = (OrPoduzetaMjeraVo)  execute(value);
    	return res;
     }
    public OrPoduzetaMjeraVo dodajPoduzetaMjera(OrPoduzetaMjeraVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajPoduzetaMjera");
    	OrPoduzetaMjeraVo res = (OrPoduzetaMjeraVo)  execute(value);
    	return res;
     }
    public OrPoduzetaMjeraVo brisiPoduzetaMjera(OrPoduzetaMjeraVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiPoduzetaMjera");
    	OrPoduzetaMjeraVo res = (OrPoduzetaMjeraVo)  execute(value);
    	return res;
     }
}