package hr.adriacomsoftware.app.common.gradani.ziro.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class ZiroGradanaFacadeProxy extends AS2FacadeProxy implements ZiroGradanaFacade
{

	private static ZiroGradanaFacadeProxy _instance = null;
	
	private ZiroGradanaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.gradani.ziro.facade.ZiroGradanaFacadeServer");
	}

	public static ZiroGradanaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new ZiroGradanaFacadeProxy();
		return _instance;
	}
	public OsobaRs procitajSveOsobe() throws AS2Exception {
		OsobaRs res = (OsobaRs) executeQuery("procitajSveOsobe");
		return res;
	 }
	public OsobaRs pronadiSveOsobe(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveOsobe");
		OsobaRs res = (OsobaRs) executeQuery(value);
		return res;
	 }
    public PartijaRs izvjestajKamateNaknade(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajKamateNaknade");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public PartijaRs izvjestajPartijeBezPrometa(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajPartijeBezPrometa");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public PartijaRs izvjestajPartijaPoKriteriju(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajPartijaPoKriteriju");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajZiroSaPrometom(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajZiroSaPrometom");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajZiroKamatneStope(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajZiroKamatneStope");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajZiroBlokirani(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajZiroBlokirani");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public PartijaRs registarZiroRacuna(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("registarZiroRacuna");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
}
