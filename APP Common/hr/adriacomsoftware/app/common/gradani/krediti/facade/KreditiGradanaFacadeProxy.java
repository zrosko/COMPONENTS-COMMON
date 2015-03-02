package hr.adriacomsoftware.app.common.gradani.krediti.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.ObavijestRs;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.ObavijestVo;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.OpomenaRs;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.OpomenaVo;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.RocnostRs;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.RocnostVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class KreditiGradanaFacadeProxy extends AS2FacadeProxy implements KreditiGradanaFacade
{

	private static KreditiGradanaFacadeProxy _instance = null;
	
	private KreditiGradanaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.gradani.krediti.facade.KreditiGradanaFacadeServer");
	}

	public static KreditiGradanaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new KreditiGradanaFacadeProxy();
		return _instance;
	}
	public OpomenaRs izvjestajOpomeneKredita(OpomenaVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajOpomeneKredita");
		OpomenaRs res = (OpomenaRs) executeQuery(value);
		return res;
	 }
	public RocnostRs izvjestajRocnostiOtplate(RocnostVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajRocnostiOtplate");
		RocnostRs res = (RocnostRs) executeQuery(value);
		return res;
	 }
	public RocnostRs izvjestajRocnostiOtplateOib(RocnostVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajRocnostiOtplateOib");
		RocnostRs res = (RocnostRs) executeQuery(value);
		return res;
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

    public OsnovniRs izvjestajHBORKredita(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajHBORKredita");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    public OsnovniRs izvjestajSviDospjeliKrediti(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajSviDospjeliKrediti");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
//    public OsnovniRs izvjestajObracunAnuitetaMjesecni(OsnovniVo value) throws J2EEException {
//		value.setRemoteMethod("izvjestajObracunAnuitetaMjesecni");
//		OsnovniRs res = (OsnovniRs) executeQuery(value);
//		return res;
//    }
    public OsnovniRs izvjestajDospjeliKrediti(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajDospjeliKrediti");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajZatezneKamate(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajZatezneKamate");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajUgovoreneKamate(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajUgovoreneKamate");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajHamagKrediti(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajHamagKrediti");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajIzdanihKreditaZaPeriod(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajIzdanihKreditaZaPeriod");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajInterkalarneKamate(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajInterkalarneKamate");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajNaknade(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajNaknade");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajOpomene(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajOpomene");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    public PartijaRs izvjestajPotvrdaPlacenihKamata(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajPotvrdaPlacenihKamata");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public OpomenaRs procitajSveObradeOpomena(OpomenaVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveObradeOpomena");
		OpomenaRs res = (OpomenaRs) executeQuery(value);
		return res;
    }
    public ObavijestRs procitajSveObradeObavijesti(ObavijestVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveObradeObavijesti");
		ObavijestRs res = (ObavijestRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajUsporedbaPrometaSaGlavnomKnjigom(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajUsporedbaPrometaSaGlavnomKnjigom");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public ObavijestRs izvjestajObavijestiOtplataKredita(ObavijestVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajObavijestiOtplataKredita");
        ObavijestRs res = (ObavijestRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajStanjeKontaPartija(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajStanjeKontaPartija");
		PartijaRs res = (PartijaRs) executeQuery(value);
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
    public ObavijestRs iskljuciObavijesti(ObavijestVo value) throws AS2Exception {
        value.setRemoteMethod("iskljuciObavijesti");
        ObavijestRs res = (ObavijestRs) execute(value);
		return res;
    }
    public ObavijestRs ukljuciObavijesti(ObavijestVo value) throws AS2Exception {
        value.setRemoteMethod("ukljuciObavijesti");
        ObavijestRs res = (ObavijestRs) execute(value);
		return res;
    }

    public PartijaRs izvjestajNaplataRezervacija(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajNaplataRezervacija");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public OsnovniRs pregledPrometaZaPeriod(OsnovniVo value) throws AS2Exception {        
        value.setRemoteMethod("pregledPrometaZaPeriod");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajNaplataPotrazivanja(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajNaplataPotrazivanja");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    public OsnovniRs izvjestajPoredakKredita(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajPoredakKredita");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajRasporedAnuiteta(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajRasporedAnuiteta");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajRasporedAnuitetaRekap(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajRasporedAnuitetaRekap");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajPretplata(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajPretplata");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }

    public OsnovniRs izvjestajProlazniRacun(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajProlazniRacun");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }

    public OsnovniRs izvjestajHNBKreditiZaKupnjuDionica(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajHNBKreditiZaKupnjuDionica");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }
    public OsnovniRs izvjestajR1(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajR1");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
}
