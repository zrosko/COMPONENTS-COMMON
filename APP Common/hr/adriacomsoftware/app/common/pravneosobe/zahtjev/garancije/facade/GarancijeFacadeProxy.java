package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.garancije.facade;


import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.garancije.dto.GarancijaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.garancije.dto.GarancijaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class GarancijeFacadeProxy extends AS2FacadeProxy implements GarancijeFacade {

    private static GarancijeFacadeProxy _instance = null;

    private GarancijeFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.zahtjev.garancije.facade.GarancijeFacadeServer");
    }

    public static GarancijeFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new GarancijeFacadeProxy();
        return _instance;
    }
    public GarancijaRs procitajSveGarancije(GarancijaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveGarancije");
        GarancijaRs res = (GarancijaRs) executeQuery(value);
		return res;
    }

    public GarancijaRs pronadiGarancije(GarancijaVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiGarancije");
        GarancijaRs res = (GarancijaRs) executeQuery(value);
		return res;
    }

    public GarancijaVo azurirajGaranciju(GarancijaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajGaranciju");
    	GarancijaVo res = (GarancijaVo) execute(value);
    	return res;
    }

    public GarancijaVo dodajGaranciju(GarancijaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajGaranciju");
    	GarancijaVo res = (GarancijaVo) execute(value);
    	return res;
    }

    public GarancijaVo brisiGaranciju(GarancijaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiGaranciju");
    	GarancijaVo res = (GarancijaVo) execute(value);
    	return res;
    }
}