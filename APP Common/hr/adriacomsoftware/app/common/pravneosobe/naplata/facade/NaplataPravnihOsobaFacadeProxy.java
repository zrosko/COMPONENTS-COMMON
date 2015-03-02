package hr.adriacomsoftware.app.common.pravneosobe.naplata.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OpomenaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OpomenaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class NaplataPravnihOsobaFacadeProxy extends AS2FacadeProxy implements NaplataPravnihOsobaFacade
{

	private static NaplataPravnihOsobaFacadeProxy _instance = null;
	
	private NaplataPravnihOsobaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.naplata.facade.NaplataPravnihOsobaFacadeServer");
	}

	public static NaplataPravnihOsobaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new NaplataPravnihOsobaFacadeProxy();
		return _instance;
	}
	public PravnaOsobaRs procitajSvePravneOsobeNaplata() throws AS2Exception {
	    PravnaOsobaRs res = (PravnaOsobaRs) executeQuery("procitajSvePravneOsobeNaplata");
		return res;
	 }
	public PravnaOsobaRs pronadiSvePravneOsobeNaplata(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSvePravneOsobeNaplata");
	    PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }
    public OsnovniRs pregledPrometa(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("pregledPrometa");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    public OpomenaRs izvjestajOpomeneKredita(OpomenaVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajOpomeneKredita");
		OpomenaRs res = (OpomenaRs) executeQuery(value);
		return res;
	 }
    public OpomenaRs iskljuciOpomene(OpomenaVo value) throws AS2Exception {
        value.setRemoteMethod("iskljuciOpomene");
		OpomenaRs res = (OpomenaRs) execute(value);
		return res;
    }

    public OpomenaRs ukljuciOpomene(OpomenaVo value) throws AS2Exception {
        value.setRemoteMethod("ukljuciOpomene");
		OpomenaRs res = (OpomenaRs) execute(value);
		return res;
    }

        
    public OsnovniRs pregledUgovora(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pregledUgovora");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs pregledBoniteta(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pregledBoniteta");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs pregledStanja(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pregledStanja");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs pregledVezanihOsoba(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pregledVezanihOsoba");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs pregledRezervacija(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pregledRezervacija");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
}
