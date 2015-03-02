package hr.adriacomsoftware.app.common.pravneosobe.krediti.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class KreditniProgramFacadeProxy extends AS2FacadeProxy implements KreditniProgramFacade
{

	private static KreditniProgramFacadeProxy _instance = null;
	
	private KreditniProgramFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.krediti.facade.KreditniProgramFacadeServer");
	}

	public static KreditniProgramFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new KreditniProgramFacadeProxy();
		return _instance;
	}
    public OsnovniVo azurirajPartijuZaKreditniProgram(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajPartijuZaKreditniProgram");
    	OsnovniVo res = (OsnovniVo)  execute(value);
    	return res;
    }

    public OsnovniRs procitajSvePartijeZaKreditniProgram(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePartijeZaKreditniProgram");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniVo dodajPartijuZaKreditniProgram(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPartijuZaKreditniProgram");
    	OsnovniVo res = (OsnovniVo)  execute(value);
    	return res;
    }

    public OsnovniVo brisiPartijuZaKreditniProgram(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPartijuZaKreditniProgram");
    	OsnovniVo res = (OsnovniVo)  execute(value);
    	return res;
    }    
}
