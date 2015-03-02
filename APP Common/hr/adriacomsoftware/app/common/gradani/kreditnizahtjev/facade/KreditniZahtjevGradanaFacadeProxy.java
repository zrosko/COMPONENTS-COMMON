package hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.facade;

import hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto.KreditniZahtjevOsobaVo;
import hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto.KreditniZahtjevRs;
import hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto.KreditniZahtjevVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class KreditniZahtjevGradanaFacadeProxy extends AS2FacadeProxy implements KreditniZahtjevGradanaFacade
{

	private static KreditniZahtjevGradanaFacadeProxy _instance = null;
	
	private KreditniZahtjevGradanaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.gradani.kreditnizahtjev.facade.KreditniZahtjevGradanaFacadeServer");
	}

	public static KreditniZahtjevGradanaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new KreditniZahtjevGradanaFacadeProxy();
		return _instance;
	}

    public KreditniZahtjevVo dodajKreditniZahtjev(KreditniZahtjevVo value) throws AS2Exception {
		value.setRemoteMethod("dodajKreditniZahtjev");
		KreditniZahtjevVo res = (KreditniZahtjevVo)  execute(value);
		return res;
    }

    public KreditniZahtjevVo dodajKreditniZahtjevJamacSuduznik(KreditniZahtjevVo value) throws AS2Exception {
		value.setRemoteMethod("dodajKreditniZahtjevJamacSuduznik");
		KreditniZahtjevVo res = (KreditniZahtjevVo)  execute(value);
		return res;
    }

    public void azurirajKreditniZahtjev(KreditniZahtjevVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKreditniZahtjev");
		execute(value);
    }

    public void azurirajKreditniZahtjevJamacSuduznik(KreditniZahtjevVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKreditniZahtjevJamacSuduznik");
		execute(value);        
    }

    public KreditniZahtjevRs procitajSveKreditneZahtjeve() throws AS2Exception {
        KreditniZahtjevRs res = (KreditniZahtjevRs) executeQuery("procitajSveKreditneZahtjeve");
		return res;
    }

    public void brisiKreditniZahtjevJamacSuduznik(KreditniZahtjevOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiKreditniZahtjevJamacSuduznik");
		execute(value);     
	}

    public void brisiKreditniZahtjev(KreditniZahtjevVo value) throws AS2Exception {
		value.setRemoteMethod("brisiKreditniZahtjev");
		execute(value);  
    }

    public KreditniZahtjevVo citajKreditniZahtjev(KreditniZahtjevVo value) throws AS2Exception {
		value.setRemoteMethod("citajKreditniZahtjev");
		KreditniZahtjevVo res = (KreditniZahtjevVo)  execute(value);
		return res;
    }

    public KreditniZahtjevVo citajKreditniZahtjevSuduznik(KreditniZahtjevVo value) throws AS2Exception {
		value.setRemoteMethod("citajKreditniZahtjevSuduznik");
		KreditniZahtjevVo res = (KreditniZahtjevVo)  execute(value);
		return res;
    }
    public void azurirajPrijedlog(KreditniZahtjevVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajPrijedlog");
		execute(value);
    }
}
