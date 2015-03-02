package hr.adriacomsoftware.app.common.pravneosobe.krediti.facade;

import hr.adriacomsoftware.app.common.jb.dto.IzvjestajRs;
import hr.adriacomsoftware.app.common.jb.dto.IzvjestajVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.IzvodVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.KreditniProgramRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.KreditniProgramVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OpomenaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OpomenaVo;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OtplatniPlanRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OtplatniPlanVo;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.PartijaKreditaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.PartijaKreditaVo;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.RocnostRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.RocnostVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class KreditiPravnihOsobaFacadeProxy extends AS2FacadeProxy implements KreditiPravnihOsobaFacade
{

	private static KreditiPravnihOsobaFacadeProxy _instance = null;
	
	private KreditiPravnihOsobaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.krediti.facade.KreditiPravnihOsobaFacadeServer");
	}

	public static KreditiPravnihOsobaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new KreditiPravnihOsobaFacadeProxy();
		return _instance;
	}
    public OpomenaRs procitajSveObradeOpomena(OpomenaVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveObradeOpomena");
		OpomenaRs res = (OpomenaRs) executeQuery(value);
		return res;
    }
	public OpomenaRs izvjestajOpomeneKredita(OpomenaVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajOpomeneKredita");
		OpomenaRs res = (OpomenaRs) executeQuery(value);
		return res;
	 }
	public AS2RecordList temeljnica(AS2Record value) throws AS2Exception {
		value.setRemoteMethod("temeljnica");
		AS2RecordList res = (AS2RecordList) executeQuery(value);
		return res;
	 }
	public RocnostRs izvjestajRocnostiOtplateKonto(RocnostVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajRocnostiOtplateKonto");
		RocnostRs res = (RocnostRs) executeQuery(value);
		return res;
	 }
	public OsnovniRs izvjestajRocnostiOtplate(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajRocnostiOtplate");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
	 }
	public RocnostRs izvjestajRocnostiOtplateKomitent(RocnostVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajRocnostiOtplateKomitent");
		RocnostRs res = (RocnostRs) executeQuery(value);
		return res;
	 }
	public AS2RecordList izvjestajIzvodiKredita(IzvodVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajIzvodiKredita");
		AS2RecordList res =  executeQuery(value);
		return res;
	 }
	public PravnaOsobaRs procitajSvePravneOsobeKredite() throws AS2Exception {

	    PravnaOsobaRs res = (PravnaOsobaRs) executeQuery("procitajSvePravneOsobeKredite");
		return res;
	 }
	public KreditniProgramRs izvjestajKreditniProgram(KreditniProgramVo value) throws AS2Exception {

		value.setRemoteMethod("izvjestajKreditniProgram");
		KreditniProgramRs res = (KreditniProgramRs) executeQuery(value);
		return res;
	 }
    public OsnovniRs izvjestajPrometNaDan26017(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajPrometNaDan26017");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs izvjestajStanjeKreditaPoKomitentimaSuzeni(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajStanjeKreditaPoKomitentimaSuzeni");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs izvjestajPregledDospjelihObveza(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajPregledDospjelihObveza");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs izvjestajStanjeKreditaPoKomitentima(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajStanjeKreditaPoKomitentima");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public PravnaOsobaRs pronadiSvePravneOsobeKredite(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSvePravneOsobeKredite");
	    PravnaOsobaRs res = (PravnaOsobaRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajHamagKrediti(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajHamagKrediti");
        OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public PartijaRs izvjestajKreditniProgramSvePartije(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajKreditniProgramSvePartije");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs izvjestajRevalorizacijaPoKontima(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajRevalorizacijaPoKontima");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs izvjestajRevalorizacijaPoPartijama(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajRevalorizacijaPoPartijama");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

    public OsnovniRs pregledUgovora(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("pregledUgovora");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs pregledPrometa(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("pregledPrometa");
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

    public OsnovniRs izvjestajKamatniOstaliPrihodiPoKontu(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajKamatniOstaliPrihodiPoKontu");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajKamatniOstaliPrihodiZbirno(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajKamatniOstaliPrihodiZbirno");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
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

    public OsnovniRs izvjestajNovoOdobreniKrediti(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajNovoOdobreniKrediti");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs pregledPrometaZaPeriod(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pregledPrometaZaPeriod");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajPromjenaFazeKredita(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajPromjenaFazeKredita");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OtplatniPlanRs izradiOtplatniPlan(OtplatniPlanVo value) throws AS2Exception {
        value.setRemoteMethod("izradiOtplatniPlan");
        OtplatniPlanRs res = (OtplatniPlanRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs izvjestajPoveznicaPoPartiji(IzvjestajVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajPoveznicaPoPartiji");
        IzvjestajRs res = (IzvjestajRs)executeQuery(value);
        return res;
    }

    public IzvjestajRs izvjestajRacunDobitiGubitka(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajRacunDobitiGubitka");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public PartijaKreditaRs izvjestajAnalizaKredita(PartijaKreditaVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajAnalizaKredita");
		PartijaKreditaRs res = (PartijaKreditaRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs izvjestajKreditiFazaDva(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajKreditiFazaDva");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public IzvjestajRs izvjestajKreditiFazaCetiri(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajKreditiFazaCetiri");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }
    public OsnovniRs izvjestajTudaKnjizenja(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajTudaKnjizenja");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajPriljeviPoKreditimaBuduci(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajPriljeviPoKreditimaBuduci");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajPriljeviPoKreditima(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajPriljeviPoKreditima");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajManipulativniTroskoviKnjizenja(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajManipulativniTroskoviKnjizenja");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajManipulativniTroskovi(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajManipulativniTroskovi");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajBrutoBilanca(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajBrutoBilanca");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    public OsnovniRs izvjestajNovootvoreniKreditiZaRazdoblje(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajNovootvoreniKreditiZaRazdoblje");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }

    public OsnovniRs izvjestajNovootvoreneGarancijeZaRazdoblje(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajNovootvoreneGarancijeZaRazdoblje");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }

    public OsnovniRs izvjestajSaldoKunskihRacunaKredita(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajSaldoKunskihRacunaKredita");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }

    public OsnovniRs izvjestajSaldaKontaKnjizenja(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajSaldaKontaKnjizenja");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }

    public OsnovniRs izvjestajSaldaKontaSuspendiranihPrihoda(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajSaldaKontaSuspendiranihPrihoda");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }
    public OsnovniRs izvjestajIOSObrazac(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajIOSObrazac");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }
    
    public IzvjestajRs izvjestajKreditiFazaTri(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajKreditiFazaTri");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

    public IzvjestajRs izvjestajGarancijeFazaTri(IzvjestajVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajGarancijeFazaTri");
		IzvjestajRs res = (IzvjestajRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajIzdaniKrediti(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajIzdaniKrediti");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }
    public OsnovniRs izvjestajRezervacije(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajRezervacije");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }

    public OsnovniRs izvjestajKreditiKnjizenjaNedospjeleGlavnice(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajKreditiKnjizenjaNedospjeleGlavnice");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }
}
