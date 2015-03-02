package hr.adriacomsoftware.app.common.gradani.stednja.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.stednja.dto.StednjaVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class GradaniStednjaFacadeProxy extends AS2FacadeProxy implements GradaniStednjaFacade
{

	private static GradaniStednjaFacadeProxy _instance = null;
	
	private GradaniStednjaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.gradani.stednja.facade.GradaniStednjaFacadeServer");//$NON-NLS-1$
	}

	public static GradaniStednjaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new GradaniStednjaFacadeProxy();
		return _instance;
	}
    public OsnovniVo azurirajPartijuZaObavijest(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajPartijuZaObavijest"); //$NON-NLS-1$
    	OsnovniVo res = (OsnovniVo)  execute(value);
    	return res;
    }

    public OsnovniRs procitajSvePartijeZaObavijest(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePartijeZaObavijest"); //$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniVo dodajPartijuZaObavijest(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPartijuZaObavijest"); //$NON-NLS-1$
    	OsnovniVo res = (OsnovniVo)  execute(value);
    	return res;
    }

    public OsnovniVo brisiPartijuZaObavijest(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPartijuZaObavijest"); //$NON-NLS-1$
    	OsnovniVo res = (OsnovniVo)  execute(value);
    	return res;
    }
	
    public OsnovniRs izvjestajObavijestiDoznaka(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajObavijestiDoznaka");//$NON-NLS-1$
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    public OsnovniRs izvjestajObavijestiMirovine(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajObavijestiMirovine");//$NON-NLS-1$
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs listaNegativnihPartija(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("listaNegativnihPartija");//$NON-NLS-1$
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs listaPrometaPogresnaValuta(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("listaPrometaPogresnaValuta");//$NON-NLS-1$
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    
	public OsobaRs procitajSveOsobe() throws AS2Exception {
		OsobaRs res = (OsobaRs) executeQuery("procitajSveOsobe");//$NON-NLS-1$
		return res;
	 }
	
	public OsobaRs pronadiSveOsobe(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveOsobe");//$NON-NLS-1$
		OsobaRs res = (OsobaRs) executeQuery(value);
		return res;
	 }

    public PartijaRs listaPartijaNerezidenata(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("listaPartijaNerezidenata");//$NON-NLS-1$
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public PartijaRs listaTecajnihRazlika(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("listaTecajnihRazlika");//$NON-NLS-1$
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public PartijaRs listaStednjaFiksnaKamata(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("listaStednjaFiksnaKamata");//$NON-NLS-1$
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public OsnovniRs brojPartijaDepozitaNaDan(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("brojPartijaDepozitaNaDan");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
    public OsnovniRs rekapitulacijaPripisaKamataKune(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("rekapitulacijaPripisaKamataKune");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
    public OsnovniRs rekapitulacijaPripisaKamataDevize(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("rekapitulacijaPripisaKamataDevize");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
    public OsnovniRs priljevOdljev(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("priljevOdljev");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs izvjestajPoredakStednje(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajPoredakStednje");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
	// primjer sa subreportom koji ima isti query
    public OsnovniRs izvjestajKunskaStednja(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajKunskaStednja");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs izvjestajKunskaStednjaBrojPartija(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajKunskaStednjaBrojPartija");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs izvjestajDeviznaStednja(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajDeviznaStednja");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs izvjestajDeviznaStednjaBrojPartija(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajDeviznaStednjaBrojPartija");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs izvjestajOrocenaStednja(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajOrocenaStednja");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
    public OsnovniRs izvjestajOrocenaStednjaPartije(StednjaVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajOrocenaStednjaPartije");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
    public OsnovniRs izvjestajTransakcijePreko105000(StednjaVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajTransakcijePreko105000");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs izvjestajPregledPartijaKonto924061(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajPregledPartijaKonto924061");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs izvjestajNeregularnoZatvorenePartije(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajNeregularnoZatvorenePartije");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
    public OsnovniRs izvjestajRekapitulacijaPoKontima(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajRekapitulacijaPoKontima");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs izvjestajRekapitulacijaPoValutama(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajRekapitulacijaPoValutama");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }

    public OsnovniRs izvjestajDeviznaStednjaPoIntervalima(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajDeviznaStednjaPoIntervalima");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
    public OsnovniRs izvjestajNajvecih20(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajNajvecih20");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
    }
}

