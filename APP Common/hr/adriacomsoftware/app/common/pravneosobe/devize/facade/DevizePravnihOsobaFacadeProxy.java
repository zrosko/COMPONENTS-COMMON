package hr.adriacomsoftware.app.common.pravneosobe.devize.facade;

import hr.adriacomsoftware.app.common.jb.dto.IzvjestajRs;
import hr.adriacomsoftware.app.common.jb.dto.IzvjestajVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaVo;
import hr.adriacomsoftware.app.common.jb.dto.RacunPartijeRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.IzvodRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.IzvodVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class DevizePravnihOsobaFacadeProxy extends AS2FacadeProxy implements DevizePravnihOsobaFacade
{

	private static DevizePravnihOsobaFacadeProxy _instance = null;
	
	private DevizePravnihOsobaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.devize.facade.DevizePravnihOsobaFacadeServer");
	}

	public static DevizePravnihOsobaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new DevizePravnihOsobaFacadeProxy();
		return _instance;
	}

	public IzvodRs izvjestajIzvodiDeviza(IzvodVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajIzvodiDeviza");
		IzvodRs res = (IzvodRs) executeQuery(value);
		return res;
	 }
	public PravnaOsobaRs procitajSvePravneOsobeDevize() throws AS2Exception {

	    PravnaOsobaRs res = (PravnaOsobaRs) executeQuery("procitajSvePravneOsobeDevize");
		return res;
	 }

    public IzvodRs procitajSveObradeDeviznihIzvoda(IzvodVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveObradeDeviznihIzvoda");
		IzvodRs res = (IzvodRs) executeQuery(value);
		return res;
    }

    public RacunPartijeRs izvjestajStanjePartije(PartijaVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajStanjePartije");
		RacunPartijeRs res = (RacunPartijeRs) executeQuery(value);
		return res;
    }
    public RacunPartijeRs izvjestajStanjeValute(PartijaVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajStanjeValute");
		RacunPartijeRs res = (RacunPartijeRs) executeQuery(value);
		return res;
    }

    public PravnaOsobaRs pronadiSvePravneOsobeDevize(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSvePravneOsobeDevize");
	    PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs priljevOdljev(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("priljevOdljev");
        IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs izvjestajDevizneTecajneRazlike(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajDevizneTecajneRazlike");
        IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs izvjestajOroceniDevizniDepoziti(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajOroceniDevizniDepoziti");
        IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs izvjestajOroceniKunskiDepoziti(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajOroceniKunskiDepoziti");
        IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
}
