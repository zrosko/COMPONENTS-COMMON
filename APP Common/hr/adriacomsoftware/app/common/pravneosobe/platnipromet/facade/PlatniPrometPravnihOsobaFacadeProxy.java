package hr.adriacomsoftware.app.common.pravneosobe.platnipromet.facade;

import hr.adriacomsoftware.app.common.jb.dto.IzvjestajRs;
import hr.adriacomsoftware.app.common.jb.dto.IzvjestajVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.NaplataMjenicaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.NaplataMjenicaVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class PlatniPrometPravnihOsobaFacadeProxy extends AS2FacadeProxy implements PlatniPrometPravnihOsobaFacade
{

	private static PlatniPrometPravnihOsobaFacadeProxy _instance = null;
	
	private PlatniPrometPravnihOsobaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.platnipromet.facade.PlatniPrometPravnihOsobaFacadeServer");
	}

	public static PlatniPrometPravnihOsobaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new PlatniPrometPravnihOsobaFacadeProxy();
		return _instance;
	}

    public PravnaOsobaRs procitajSvePravneOsobePlatniPromet() throws AS2Exception {
	    PravnaOsobaRs res = (PravnaOsobaRs) executeQuery("procitajSvePravneOsobePlatniPromet");
		return res;
    }

    public PravnaOsobaRs pronadiSvePravneOsobePlatniPromet(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSvePravneOsobePlatniPromet");
	    PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs pregledPrometaPoPartiji(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("pregledPrometaPoPartiji");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs poslovniRacun(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("poslovniRacun");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs poslovniRacunZaPartiju(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("poslovniRacunZaPartiju");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs poslovniRacuniNaknada(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("poslovniRacuniNaknada");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs poslovniRacunMjesecno(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("poslovniRacunMjesecno");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajZatezneKamate(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajZatezneKamate");
        OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajMjesecnaRekapitulacija(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajMjesecnaRekapitulacija");
        OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs prosjecnoStanjePartijaPoMaticnomBroju(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("prosjecnoStanjePartijaPoMaticnomBroju");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs prosjecnoStanjePartije(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("prosjecnoStanjePartije");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs poslovniRacun500000(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("poslovniRacun500000");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

	public NaplataMjenicaVo dodajMjenicu(NaplataMjenicaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajMjenicu");
		NaplataMjenicaVo res = (NaplataMjenicaVo)  execute(value);
    	return res;
	}

	public NaplataMjenicaVo azurirajMjenicu(NaplataMjenicaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajMjenicu");
		NaplataMjenicaVo res = (NaplataMjenicaVo)  execute(value);
    	return res;
	}

	public NaplataMjenicaRs procitajSveMjenice(NaplataMjenicaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveMjenice");
        NaplataMjenicaRs res = (NaplataMjenicaRs) executeQuery(value);
		return res;
	}

	public NaplataMjenicaRs pronadiMjenice(NaplataMjenicaVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiMjenice");
        NaplataMjenicaRs res = (NaplataMjenicaRs) executeQuery(value);
		return res;
	}

	public NaplataMjenicaVo brisiMjenicu(NaplataMjenicaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiMjenicu");
		NaplataMjenicaVo res = (NaplataMjenicaVo) execute(value);
    	return res;
	}

	public NaplataMjenicaVo brisiViseMjenica(NaplataMjenicaRs value) throws AS2Exception {
	   	value.setRemoteMethod("brisiViseMjenica");
	   	NaplataMjenicaVo res = (NaplataMjenicaVo) execute(value);
    	return res;
	}

	public NaplataMjenicaRs izvjestaji(NaplataMjenicaVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestaji");
        NaplataMjenicaRs res = (NaplataMjenicaRs) executeQuery(value);
		return res;
	}
	
}
