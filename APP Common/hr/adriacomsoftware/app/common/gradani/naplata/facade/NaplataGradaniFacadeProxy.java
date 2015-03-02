package hr.adriacomsoftware.app.common.gradani.naplata.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.OpomenaRs;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.OpomenaVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class NaplataGradaniFacadeProxy extends AS2FacadeProxy implements NaplataGradaniFacade{

	private static NaplataGradaniFacadeProxy _instance = null;
	
	private NaplataGradaniFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.gradani.naplata.facade.NaplataGradaniFacadeServer");
	}

	public static NaplataGradaniFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new NaplataGradaniFacadeProxy();
		return _instance;
	}
	public OsobaRs procitajSveGradaneNaplata() throws AS2Exception {
	    OsobaRs res = (OsobaRs) executeQuery("procitajSveGradaneNaplata");
		return res;
	 }
	public OsobaRs pronadiSveGradaneNaplata(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSveGradaneNaplata");
	    OsobaRs res = (OsobaRs) executeQuery(value);
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
