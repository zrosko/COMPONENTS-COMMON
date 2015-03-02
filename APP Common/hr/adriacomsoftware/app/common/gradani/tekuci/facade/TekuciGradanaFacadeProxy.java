package hr.adriacomsoftware.app.common.gradani.tekuci.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.tekuci.dto.CekRs;
import hr.adriacomsoftware.app.common.gradani.tekuci.dto.CekVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class TekuciGradanaFacadeProxy extends AS2FacadeProxy implements TekuciGradanaFacade
{

	private static TekuciGradanaFacadeProxy _instance = null;
	
	private TekuciGradanaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.gradani.tekuci.facade.TekuciGradanaFacadeServer");
	}

	public static TekuciGradanaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new TekuciGradanaFacadeProxy();
		return _instance;
	}
	public OsobaRs procitajSveOsobe() throws AS2Exception {
		OsobaRs res = (OsobaRs) executeQuery("procitajSveOsobe");
		return res;
	 }
    public PartijaRs izvjestajNedozvoljenoPrekoracenje(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajNedozvoljenoPrekoracenje");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajPartijeBezPrometa(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajPartijeBezPrometa");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
	public OsobaRs pronadiSveOsobe(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveOsobe");
		OsobaRs res = (OsobaRs) executeQuery(value);
		return res;
	 }

    public PartijaRs izvjestajPartijaPoKriteriju(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajPartijaPoKriteriju");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public PartijaRs izvjestajKamateNaknade(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajKamateNaknade");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajTrajniNalozi(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajTrajniNalozi");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public PartijaRs izvjestajRocnostNedozvoljenogPrekoracenja(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajRocnostNedozvoljenogPrekoracenja");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajNaplataRezervacija(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajNaplataRezervacija");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajCrnaLista(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajCrnaLista");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
	public PartijaRs izvjestajDnevneOpomene(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajDnevneOpomene");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
	 }

    public PartijaRs registarTekucihRacuna(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("registarTekucihRacuna");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    /**************** ČEKOVI **********************/
    public CekVo dodajCek(CekVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajCek");
    	CekVo res = (CekVo)  execute(value);
    	return res;
    }
    public CekVo azurirajCek(CekVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajCek");
    	CekVo res = (CekVo)  execute(value);
    	return res;
    }
    public CekVo brisiCek(CekVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiCek");
    	CekVo res = (CekVo)  execute(value);
    	return res;
    }
    public CekRs procitajSveCekove(CekVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveCekove");
    	CekRs res = (CekRs) executeQuery(value);
    	return res;
    }
    public CekVo brisiViseCekova(CekRs value) throws AS2Exception {
    	value.setRemoteMethod("brisiViseCekova");
    	CekVo res = (CekVo)  execute(value);
    	return res;
    }

	public CekRs procitajSveNeiskoristeCekoveZaPartiju(CekVo value){
		value.setRemoteMethod("procitajSveNeiskoristeCekoveZaPartiju");
		CekRs res = (CekRs) executeQuery(value);
		return res;
	}
}
