package hr.adriacomsoftware.app.common.isms.facade;

import hr.adriacomsoftware.app.common.isms.dto.IsmsImovinaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsKategorijaImovineRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsKategorijaImovineVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsKontrolaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsKontrolaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsLokacijaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsLokacijaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsPrijetnjaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsPrijetnjaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRanjivostRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRanjivostVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsZgradaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsZgradaVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class IsmsMetodologijaFacadeProxy extends AS2FacadeProxy implements IsmsMetodologijaFacade {

    private static IsmsMetodologijaFacadeProxy _instance = null;

    private IsmsMetodologijaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.isms.facade.IsmsMetodologijaFacadeServer");
    }

    public static IsmsMetodologijaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new IsmsMetodologijaFacadeProxy();
        return _instance;
    }
//  lookup cjelovitost
    public String getNazivZaSifruCjelovitosti(String sifra){
	    return listajSveCjelovitosti().rsReadNameForId(sifra);
    }
    public String getSifruCjelovitostiZaNaziv(String naziv){
	    return listajSveCjelovitosti().rsReadIdForName(naziv);
    }
    //lookup raspoloživost
    public String getNazivZaSifruRaspolozivosti(String sifra){
	    return listajSveRaspolozivosti().rsReadNameForId(sifra);
    }
    public String getSifruRaspolozivostiZaNaziv(String naziv){
	    return listajSveRaspolozivosti().rsReadIdForName(naziv);
    }
    //povjerljivost
    public String getNazivZaSifruPovjerljivosti(String sifra){
	    return listajSvePovjerljivosti().rsReadNameForId(sifra);
    }
    public String getSifruPovjerljivostiZaNaziv(String naziv){
	    return listajSvePovjerljivosti().rsReadIdForName(naziv);
    }
    //važnost
    public String getNazivZaSifruVaznosti(String sifra){
	    return listajSveVaznosti().rsReadNameForId(sifra);
    }
    public String getSifruVaznostiZaNaziv(String naziv){
	    return listajSveVaznosti().rsReadIdForName(naziv);
    }
    //dokazivost
    public String getNazivZaSifruDokazivosti(String sifra){
	    return listajSveDokazivosti().rsReadNameForId(sifra);
    }
    public String getSifruDokazivostiZaNaziv(String naziv){
	    return listajSveDokazivosti().rsReadIdForName(naziv);
    }
    //vjerojatnost otkrivanja
    public String getNazivZaSifruVjerojatnostiOtkrivanja(String sifra){
	    return listajSveVjerojatnostiOtkrivanja().rsReadNameForId(sifra);
    }
    public String getSifruVjerojatnostiOtkrivanjaZaNaziv(String naziv){
	    return listajSveVjerojatnostiOtkrivanja().rsReadIdForName(naziv);
    }
    //odgovornost
    public String getNazivZaSifruOdgovornosti(String sifra){
	    return listajSveOdgovornosti().rsReadNameForId(sifra);
    }
    public String getSifruOdgovornostiZaNaziv(String naziv){
	    return listajSveOdgovornosti().rsReadIdForName(naziv);
    }
    //prijetnja
    public String getNazivZaSifruPrijetnje(String sifra_mjesta){
	    return listajSvePrijetnje().rsReadNameForId(sifra_mjesta);
    }
    public String getSifruPrijetnjeZaNaziv(String naziv){
	    return listajSvePrijetnje().rsReadIdForName(naziv);
    }
    //ranjivosti
    public String getNazivZaSifruRanjivosti(String sifra){
	    return listajSvaRanjivosti().rsReadNameForId(sifra);
    }
    public String getSifruRanjivostiZaNaziv(String naziv){
	    return listajSvaRanjivosti().rsReadIdForName(naziv);
    }
    //kontrole
    public String getNazivZaSifruKontrole(String sifra){
	    return listajSveKontrole().rsReadNameForId(sifra);
    }
    public String getSifruKontroleZaNaziv(String naziv){
	    return listajSveKontrole().rsReadIdForName(naziv);
    }
    //lookup lokacije
    public String getNazivZaSifruLokacije(String sifra_mjesta){
	    return listajSveLokacije().rsReadNameForId(sifra_mjesta);
    }
    public String getSifruLokacijeZaNaziv(String naziv){
	    return listajSveLokacije().rsReadIdForName(naziv);
    }
    //lookup kategorija imovine
    public String getNazivZaKategorijuImovine(String sifra_mjesta){
	    return listajSveKategorijeImovine().rsReadNameForId(sifra_mjesta);
    }
    public String getSifruKategorijeImovineZaNaziv(String naziv){
	    return listajSveKategorijeImovine().rsReadIdForName(naziv);
    }
    //lookup kategorija imovine kratko
    public String getNazivZaKategorijuImovineKratko(String sifra_mjesta){
	    return listajSveKategorijeImovineKratko().rsReadNameForId(sifra_mjesta);
    }
    public String getSifruKategorijeImovineKratkoZaNaziv(String naziv){
	    return listajSveKategorijeImovineKratko().rsReadIdForName(naziv);
    }
    //lookup zgradae
    public String getNazivZaSifruZgrade(String sifra_mjesta){
	    return listajSveZgrade().rsReadNameForId(sifra_mjesta);
    }
    public String getSifruZgradeZaNaziv(String naziv){
	    return listajSveZgrade().rsReadIdForName(naziv);
    }
    //lookup vrsta prijetnje
    public String getNazivZaSifruVrstePrijetnje(String sifra_mjesta){
	    return listajSveVrstePrijetnje().rsReadNameForId(sifra_mjesta);
    }
    public String getSifruVrstePrijetnjeZaNaziv(String naziv){
	    return listajSveVrstePrijetnje().rsReadIdForName(naziv);
    }
    //lookup vjerojatnost prijetnje
    public String getNazivZaSifruVjerojatnostiPrijetnje(String sifra_mjesta){
	    return listajSveVjerojatnostiPrijetnje().rsReadNameForId(sifra_mjesta);
    }
    public String getSifruVjerojatnostiPrijetnjeZaNaziv(String naziv){
	    return listajSveVjerojatnostiPrijetnje().rsReadIdForName(naziv);
    }
    //lookup vrsta ranjivosti
    public String getNazivZaSifruVrsteRanjivosti(String sifra){
	    return listajSveVrsteRanjivosti().rsReadNameForId(sifra);
    }
    public String getSifruVrsteRanjivostiZaNaziv(String naziv){
	    return listajSveVrsteRanjivosti().rsReadIdForName(naziv);
    }
//  lookup posljedica ranjivosti
    public String getNazivZaSifruPosljediceRanjivosti(String sifra){
	    return listajSvePosljedicaRanjivosti().rsReadNameForId(sifra);
    }
    public String getSifruPosljediceRanjivostiZaNaziv(String naziv){
	    return listajSvePosljedicaRanjivosti().rsReadIdForName(naziv);
    }
    public IsmsVo azurirajMetodologiju(IsmsVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMetodologiju");
    	IsmsVo res = (IsmsVo)  execute(value);
    	return res;
    }

    public IsmsRs procitajSveMetodologije(IsmsVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMetodologije");
    	IsmsRs res = (IsmsRs) executeQuery(value);
    	return res;
    }

    public IsmsVo dodajMetodologiju(IsmsVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMetodologiju");
    	IsmsVo res = (IsmsVo)  execute(value);
    	return res;
    }

    public IsmsVo brisiMetodologiju(IsmsVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMetodologiju");
    	IsmsVo res = (IsmsVo)  execute(value);
    	return res;
    }  
    //lookup
    public AS2RecordList listajSveKategorijeImovine() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveKategorijeImovine");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveKategorijeImovine");
		    addToCache("listajSveKategorijeImovine", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveKategorijeImovineKratko() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveKategorijeImovineKratko");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveKategorijeImovineKratko");
		    addToCache("listajSveKategorijeImovineKratko", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveKategorijeImovineVrsta(IsmsImovinaVo value) throws AS2Exception {
	    value.setRemoteMethod("listajSveKategorijeImovineVrsta");
	    AS2RecordList rs = null;// nema spramanja (J2EEResultSet)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery(value);
		    addToCache("listajSveKategorijeImovineVrsta", rs);
		}
		return rs;
    }
    public AS2RecordList listajSvePrijetnjeVrsta(IsmsPrijetnjaVo value) throws AS2Exception {
	    value.setRemoteMethod("listajSvePrijetnjeVrsta");
	    AS2RecordList rs = null;// nema spramanja (J2EEResultSet)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery(value);
		    //addToCache("listajSvePrijetnjeVrsta", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveRanjivostiVrsta(IsmsRanjivostVo value) throws AS2Exception {
	    value.setRemoteMethod("listajSveRanjivostiVrsta");
	    AS2RecordList rs = null;// nema spramanja (J2EEResultSet)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery(value);
		    //addToCache("listajSveRanjivostiVrsta", rs);
		}
		return rs;
    }
    public AS2RecordList listajSvePrijetnje() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvePrijetnje");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvePrijetnje");
		    addToCache("listajSvePrijetnje", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveLokacije() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveLokacije");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveLokacije");
		    addToCache("listajSveLokacije", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveLokacijeVrsta(IsmsLokacijaVo value) throws AS2Exception {
	    value.setRemoteMethod("listajSveLokacijeVrsta");
	    AS2RecordList rs = null;// nema spramanja (J2EEResultSet)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery(value);
		    addToCache("listajSveLokacijeVrsta", rs);
		}
		return rs;
    }

    public AS2RecordList listajSvaRanjivosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvaRanjivosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvaRanjivosti");
		    addToCache("listajSvaRanjivosti", rs);
		}
		return rs;
    }

    public AS2RecordList listajSveKontrole() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveKontrole");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveKontrole");
		    addToCache("listajSveKontrole", rs);
		}
		return rs;
    }

    public AS2RecordList listajSvePovjerljivosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvePovjerljivosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvePovjerljivosti");
		    addToCache("listajSvePovjerljivosti", rs);
		}
		return rs;
    }

    public AS2RecordList listajSveCjelovitosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveCjelovitosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveCjelovitosti");
		    addToCache("listajSveCjelovitosti", rs);
		}
		return rs;
    }

    public AS2RecordList listajSveRaspolozivosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveRaspolozivosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveRaspolozivosti");
		    addToCache("listajSveRaspolozivosti", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveVaznosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveVaznosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveVaznosti");
		    addToCache("listajSveVaznosti", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveOdgovornosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveOdgovornosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveOdgovornosti");
		    addToCache("listajSveOdgovornosti", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveDokazivosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveDokazivosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveDokazivosti");
		    addToCache("listajSveDokazivosti", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveVjerojatnostiOtkrivanja() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveVjerojatnostiOtkrivanja");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveVjerojatnostiOtkrivanja");
		    addToCache("listajSveVjerojatnostiOtkrivanja", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveVrstePrijetnje() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveVrstePrijetnje");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveVrstePrijetnje");
		    addToCache("listajSveVrstePrijetnje", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveVjerojatnostiPrijetnje() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveVjerojatnostiPrijetnje");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveVjerojatnostiPrijetnje");
		    addToCache("listajSveVjerojatnostiPrijetnje", rs);
		}
		return rs;
    }
    
    public IsmsPrijetnjaRs citajSvePrijetnje(IsmsPrijetnjaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePrijetnje");
		IsmsPrijetnjaRs res = (IsmsPrijetnjaRs) executeQuery(value);
		return res;
    }

    public IsmsPrijetnjaRs pronadiSvePrijetnje(IsmsPrijetnjaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSvePrijetnje");
		IsmsPrijetnjaRs res = (IsmsPrijetnjaRs) executeQuery(value);
		return res;
    }

    public IsmsPrijetnjaVo dodajPrijetnju(IsmsPrijetnjaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajPrijetnju");
		IsmsPrijetnjaVo res = (IsmsPrijetnjaVo)  execute(value);
		return res;
    }

    public IsmsPrijetnjaVo citajPrijetnju(IsmsPrijetnjaVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrijetnju");
		IsmsPrijetnjaVo res = (IsmsPrijetnjaVo)  execute(value);
		return res;
    }

    public IsmsPrijetnjaVo duplicirajPrijetnju(IsmsPrijetnjaVo value) throws AS2Exception {
		value.setRemoteMethod("duplicirajPrijetnju");
		IsmsPrijetnjaVo res = (IsmsPrijetnjaVo)  execute(value);
		return res;
    }

    public IsmsPrijetnjaVo brisiPrijetnju(IsmsPrijetnjaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiPrijetnju");
		IsmsPrijetnjaVo res = (IsmsPrijetnjaVo)  execute(value);
		return res;
    }

    public IsmsPrijetnjaVo azurirajPrijetnju(IsmsPrijetnjaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajPrijetnju");
		IsmsPrijetnjaVo res = (IsmsPrijetnjaVo)  execute(value);
		return res;
    }

    public AS2RecordList listajSveVrsteRanjivosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveVrsteRanjivosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveVrsteRanjivosti");
		    addToCache("listajSveVrsteRanjivosti", rs);
		}
		return rs;
    }

    public AS2RecordList listajSvePosljedicaRanjivosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvePosljedicaRanjivosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvePosljedicaRanjivosti");
		    addToCache("listajSvePosljedicaRanjivosti", rs);
		}
		return rs;
    }

    public IsmsRanjivostRs citajSveRanjivosti(IsmsRanjivostVo value) throws AS2Exception {
		value.setRemoteMethod("citajSveRanjivosti");
		IsmsRanjivostRs res = (IsmsRanjivostRs) executeQuery(value);
		return res;
    }

    public IsmsRanjivostRs pronadiSveRanjivosti(IsmsRanjivostVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveRanjivosti");
		IsmsRanjivostRs res = (IsmsRanjivostRs) executeQuery(value);
		return res;
    }

    public IsmsRanjivostVo dodajRanjivost(IsmsRanjivostVo value) throws AS2Exception {
		value.setRemoteMethod("dodajRanjivost");
		IsmsRanjivostVo res = (IsmsRanjivostVo)  execute(value);
		return res;
    }

    public IsmsRanjivostVo citajRanjivost(IsmsRanjivostVo value) throws AS2Exception {
		value.setRemoteMethod("citajRanjivost");
		IsmsRanjivostVo res = (IsmsRanjivostVo)  execute(value);
		return res;
    }

    public IsmsRanjivostVo duplicirajRanjivost(IsmsRanjivostVo value) throws AS2Exception {
		value.setRemoteMethod("duplicirajRanjivost");
		IsmsRanjivostVo res = (IsmsRanjivostVo)  execute(value);
		return res;
    }

    public IsmsRanjivostVo brisiRanjivost(IsmsRanjivostVo value) throws AS2Exception {
		value.setRemoteMethod("brisiRanjivost");
		IsmsRanjivostVo res = (IsmsRanjivostVo)  execute(value);
		return res;
    }

    public IsmsRanjivostVo azurirajRanjivost(IsmsRanjivostVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajRanjivost");
		IsmsRanjivostVo res = (IsmsRanjivostVo)  execute(value);
		return res;
    }

    public IsmsZgradaRs procitajSveZgrade(IsmsZgradaVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveZgrade");
		IsmsZgradaRs res = (IsmsZgradaRs) executeQuery(value);
		return res;
    }

    public IsmsZgradaVo azurirajZgradu(IsmsZgradaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajZgradu");
		IsmsZgradaVo res = (IsmsZgradaVo)  execute(value);
		return res;
    }

    public IsmsZgradaVo dodajZgradu(IsmsZgradaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajZgradu");
		IsmsZgradaVo res = (IsmsZgradaVo)  execute(value);
		return res;
    }

    public IsmsZgradaVo brisiZgradu(IsmsZgradaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiZgradu");
		IsmsZgradaVo res = (IsmsZgradaVo)  execute(value);
		return res;
    }

    public IsmsLokacijaRs procitajSveLokacije(IsmsLokacijaVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveLokacije");
		IsmsLokacijaRs res = (IsmsLokacijaRs) executeQuery(value);
		return res;
    }

    public IsmsLokacijaVo azurirajLokaciju(IsmsLokacijaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajLokaciju");
		IsmsLokacijaVo res = (IsmsLokacijaVo)  execute(value);
		return res;
    }

    public IsmsLokacijaVo dodajLokaciju(IsmsLokacijaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajLokaciju");
		IsmsLokacijaVo res = (IsmsLokacijaVo)  execute(value);
		return res;
    }

    public IsmsLokacijaVo brisiLokaciju(IsmsLokacijaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiLokaciju");
		IsmsLokacijaVo res = (IsmsLokacijaVo)  execute(value);
		return res;
    }

    public AS2RecordList listajSveZgrade() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveZgrade");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveZgrade");
		    addToCache("listajSveZgrade", rs);
		}
		return rs;
    }

    public IsmsKontrolaRs citajSveKontrole(IsmsKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSveKontrole");
		IsmsKontrolaRs res = (IsmsKontrolaRs) executeQuery(value);
		return res;
    }
    public IsmsKontrolaRs citajSveKontroleStatus(IsmsKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSveKontroleStatus");
		IsmsKontrolaRs res = (IsmsKontrolaRs) executeQuery(value);
		return res;
    }

    public IsmsKontrolaRs pronadiSveKontrole(IsmsKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveKontrole");
		IsmsKontrolaRs res = (IsmsKontrolaRs) executeQuery(value);
		return res;
    }

    public IsmsKontrolaVo dodajKontrolu(IsmsKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajKontrolu");
		IsmsKontrolaVo res = (IsmsKontrolaVo)  execute(value);
		return res;
    }

    public IsmsKontrolaVo citajKontrolu(IsmsKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("citajKontrolu");
		IsmsKontrolaVo res = (IsmsKontrolaVo)  execute(value);
		return res;
    }

    public IsmsKontrolaVo duplicirajKontrolu(IsmsKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("duplicirajKontrolu");
		IsmsKontrolaVo res = (IsmsKontrolaVo)  execute(value);
		return res;
    }

    public IsmsKontrolaVo brisiKontrolu(IsmsKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiKontrolu");
		IsmsKontrolaVo res = (IsmsKontrolaVo)  execute(value);
		return res;
    }

    public IsmsKontrolaVo azurirajKontrolu(IsmsKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKontrolu");
		IsmsKontrolaVo res = (IsmsKontrolaVo)  execute(value);
		return res;
    }
    public IsmsKategorijaImovineRs procitajSveKategorije(IsmsKategorijaImovineVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveKategorije");
    	IsmsKategorijaImovineRs res = (IsmsKategorijaImovineRs) executeQuery(value);
    	return res;
     }
    public IsmsKategorijaImovineVo azurirajKategoriju(IsmsKategorijaImovineVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajKategoriju");
    	IsmsKategorijaImovineVo res = (IsmsKategorijaImovineVo)  execute(value);
    	return res;
     }
    public IsmsKategorijaImovineVo dodajKategoriju(IsmsKategorijaImovineVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajKategoriju");
    	IsmsKategorijaImovineVo res = (IsmsKategorijaImovineVo)  execute(value);
    	return res;
     }
    public IsmsKategorijaImovineVo brisiKategoriju(IsmsKategorijaImovineVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiKategoriju");
    	IsmsKategorijaImovineVo res = (IsmsKategorijaImovineVo)  execute(value);
    	return res;
     }
}