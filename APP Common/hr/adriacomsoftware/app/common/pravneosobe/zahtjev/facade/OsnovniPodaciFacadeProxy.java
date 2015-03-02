package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.facade;

import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.BankaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.BankaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class OsnovniPodaciFacadeProxy extends AS2FacadeProxy implements OsnovniPodaciFacade
{

	private static OsnovniPodaciFacadeProxy _instance = null;
	
	private OsnovniPodaciFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.zahtjev.facade.OsnovniPodaciFacadeServer");
	}

	public static OsnovniPodaciFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new OsnovniPodaciFacadeProxy();
		return _instance;
	}
    public BankaVo azurirajOsnovnePodatke(BankaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajOsnovnePodatke");
    	BankaVo res = (BankaVo)  execute(value);
    	return res;
    }

    public BankaRs procitajSveOsnovnePodatke(BankaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveOsnovnePodatke");
    	BankaRs res = (BankaRs) executeQuery(value);
    	return res;
    }

    public BankaVo dodajOsnovnePodatke(BankaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajOsnovnePodatke");
    	BankaVo res = (BankaVo)  execute(value);
    	return res;
    }

    public BankaVo brisiOsnovnePodatke(BankaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiOsnovnePodatke");
    	BankaVo res = (BankaVo)  execute(value);
    	return res;
    }    
}
