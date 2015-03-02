package hr.adriacomsoftware.app.common.kolaterali.facade;


import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralPartijaRs;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralPartijaVo;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralPolicaRs;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralPolicaVo;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralRs;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class KolateraliFacadeProxy extends AS2FacadeProxy implements KolateraliFacade {

    private static KolateraliFacadeProxy _instance = null;

    private KolateraliFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.kolaterali.facade.KolateraliFacadeServer");
    }

    public static KolateraliFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new KolateraliFacadeProxy();
        return _instance;
    }
    public KolateralRs citajSveKolaterale(KolateralVo value) throws AS2Exception {
		value.setRemoteMethod("citajSveKolaterale");
		KolateralRs res = (KolateralRs) executeQuery(value);
		return res;
    }

    public KolateralRs pronadiSveKolaterale(KolateralVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveKolaterale");
		KolateralRs res = (KolateralRs) executeQuery(value);
		return res;
    }
    public KolateralPolicaRs pronadiSvePolice(KolateralPolicaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSvePolice");
		KolateralPolicaRs res = (KolateralPolicaRs) executeQuery(value);
		return res;
    }

    public KolateralRs citajSvePolice(KolateralVo value) throws AS2Exception {
        value.setRemoteMethod("citajSvePolice");
		KolateralRs res = (KolateralRs) executeQuery(value);
		return res;
    }
    public KolateralRs citajKolateral(KolateralVo value) throws AS2Exception {
    	value.setRemoteMethod("citajKolateral");
    	KolateralRs res = (KolateralRs)  executeQuery(value);
    	return res;
    }

    public KolateralVo azurirajKolateral(KolateralVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajKolateral");
    	KolateralVo res = (KolateralVo)  execute(value);
    	return res;
    }

    public KolateralVo dodajKolateral(KolateralVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajKolateral");
    	KolateralVo res = (KolateralVo)  execute(value);
    	return res;
    }

    public KolateralVo brisiKolateral(KolateralVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiKolateral");
    	KolateralVo res = (KolateralVo)  execute(value);
    	return res;
    }

    public KolateralPolicaVo azurirajPolicuZaKolateral(KolateralPolicaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajPolicuZaKolateral");
    	KolateralPolicaVo res = (KolateralPolicaVo)  execute(value);
    	return res;
    }

    public KolateralPolicaRs procitajSvePoliceZaKolateral(KolateralPolicaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePoliceZaKolateral");
    	KolateralPolicaRs res = (KolateralPolicaRs) executeQuery(value);
    	return res;
    }

    public KolateralPolicaVo dodajPolicuZaKolateral(KolateralPolicaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPolicuZaKolateral");
    	KolateralPolicaVo res = (KolateralPolicaVo)  execute(value);
    	return res;
    }

    public KolateralPolicaVo brisiPolicuZaKolateral(KolateralPolicaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPolicuZaKolateral");
    	KolateralPolicaVo res = (KolateralPolicaVo)  execute(value);
    	return res;
    }

    public KolateralPartijaVo azurirajPartijuZaKolateral(KolateralPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajPartijuZaKolateral");
    	KolateralPartijaVo res = (KolateralPartijaVo)  execute(value);
    	return res;
    }

    public KolateralPartijaRs procitajSvePartijeZaKolateral(KolateralPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePartijeZaKolateral");
    	KolateralPartijaRs res = (KolateralPartijaRs) executeQuery(value);
    	return res;
    }

    public KolateralPartijaVo dodajPartijuZaKolateral(KolateralPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPartijuZaKolateral");
    	KolateralPartijaVo res = (KolateralPartijaVo)  execute(value);
    	return res;
    }

    public KolateralPartijaVo brisiPartijuZaKolateral(KolateralPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPartijuZaKolateral");
    	KolateralPartijaVo res = (KolateralPartijaVo)  execute(value);
    	return res;
    } 
    public KolateralPartijaRs procitajSveZaduzenostiKodBankePOVIJEST(KolateralPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveZaduzenostiKodBankePOVIJEST");
    	KolateralPartijaRs res = (KolateralPartijaRs) executeQuery(value);
    	return res;
    }
    //tipovi kolaterala
    public AS2RecordList procitajVrsteKolaterala(){
        AS2Record vo = new AS2Record();
        vo.setRemoteMethod("procitajVrsteKolaterala");
        AS2RecordList rs = getQueryFromCache(vo);
        if(rs==null){
            rs = executeQuery("procitajVrsteKolaterala");
            addToCache(vo.getRemoteMethod()+vo.getCacheKey(), rs);
        }
        return rs;      
    }   
    public String getNazivZaTipKolaterala(String jmbg){
        return procitajVrsteKolaterala().rsReadNameForId(jmbg);
    }
    public String getTipKolateralaZaNaziv(String naziv){
        return procitajVrsteKolaterala().rsReadIdForName(naziv);
    }

	public KolateralRs procitajSveBsaKolateraleOsobe(KolateralVo value)throws AS2Exception {
    	value.setRemoteMethod("procitajSveBsaKolateraleOsobe");
    	KolateralRs res = (KolateralRs) executeQuery(value);
    	return res;
	}
}