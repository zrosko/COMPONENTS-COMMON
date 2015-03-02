package hr.adriacomsoftware.app.common.pravneosobe.povezaneosobe.facade;


import hr.adriacomsoftware.app.common.pravneosobe.povezaneosobe.dto.KlijentPovezanaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.povezaneosobe.dto.KlijentPovezanaOsobaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class KlijentPovezaneOsobeFacadeProxy extends AS2FacadeProxy implements KlijentPovezaneOsobeFacade {

    private static KlijentPovezaneOsobeFacadeProxy _instance = null;

    private KlijentPovezaneOsobeFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.povezaneosobe.facade.KlijentPovezaneOsobeFacadeServer");
    }

    public static KlijentPovezaneOsobeFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new KlijentPovezaneOsobeFacadeProxy();
        return _instance;
    }
    public KlijentPovezanaOsobaVo azurirajPovezanuOsobu(KlijentPovezanaOsobaVo value) throws AS2Exception {
       	value.setRemoteMethod("azurirajPovezanuOsobu");
       	KlijentPovezanaOsobaVo res = (KlijentPovezanaOsobaVo)  execute(value);
    	return res;
    }

    public KlijentPovezanaOsobaRs procitajSvePovezaneOsobe(KlijentPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobe");
    	KlijentPovezanaOsobaRs res = (KlijentPovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public KlijentPovezanaOsobaRs procitajSvePovezaneOsobeVlasnike(KlijentPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobeVlasnike");
    	KlijentPovezanaOsobaRs res = (KlijentPovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public KlijentPovezanaOsobaRs procitajSvePovezaneOsobePOVIJEST(KlijentPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobePOVIJEST");
    	KlijentPovezanaOsobaRs res = (KlijentPovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public KlijentPovezanaOsobaRs procitajSvePovezaneOsobeVlasnikePOVIJEST(KlijentPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePovezaneOsobeVlasnikePOVIJEST");
    	KlijentPovezanaOsobaRs res = (KlijentPovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public KlijentPovezanaOsobaVo dodajPovezanuOsobu(KlijentPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPovezanuOsobu");
    	KlijentPovezanaOsobaVo res = (KlijentPovezanaOsobaVo)  execute(value);
    	return res;
    }
    public KlijentPovezanaOsobaVo dodajPovezaneOsobe(KlijentPovezanaOsobaRs value) throws AS2Exception {
    	value.setRemoteMethod("dodajPovezaneOsobe");
    	KlijentPovezanaOsobaVo res = (KlijentPovezanaOsobaVo)  execute(value);
    	return res;
    }
    public KlijentPovezanaOsobaVo brisiPovezanuOsobu(KlijentPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPovezanuOsobu");
    	KlijentPovezanaOsobaVo res = (KlijentPovezanaOsobaVo)  execute(value);
    	return res;
    }
    public KlijentPovezanaOsobaVo brisiVisePovezanihOsoba(KlijentPovezanaOsobaRs value) throws AS2Exception {
    	value.setRemoteMethod("brisiVisePovezanihOsoba");
    	KlijentPovezanaOsobaVo res = (KlijentPovezanaOsobaVo)  execute(value);
    	return res;
    }
    public KlijentPovezanaOsobaRs listaPovezanihOsoba(KlijentPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("listaPovezanihOsoba");
    	KlijentPovezanaOsobaRs res = (KlijentPovezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public String getJmbgMbVezaZaNaziv(KlijentPovezanaOsobaVo value){
	    return listaPovezanihOsoba(value).rsReadIdForName(value.getJmbgMbVeza());
    }
    public String getNazivZaJmbgMbVeza(KlijentPovezanaOsobaVo value){  
	    return listaPovezanihOsoba(value).rsReadNameForId(value.getJmbgMbVeza());
    }

    public KlijentPovezanaOsobaVo dodajPovezaneOsobeIzPRN(KlijentPovezanaOsobaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajPovezaneOsobeIzPRN");
    	KlijentPovezanaOsobaVo res = (KlijentPovezanaOsobaVo)  execute(value);
    	return res;
    }
    public KlijentPovezanaOsobaRs usporedbaSaBSAPovezanimOsobama(KlijentPovezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("usporedbaSaBSAPovezanimOsobama");
    	KlijentPovezanaOsobaRs res = (KlijentPovezanaOsobaRs) executeQuery(value);
    	return res;
    }
 }