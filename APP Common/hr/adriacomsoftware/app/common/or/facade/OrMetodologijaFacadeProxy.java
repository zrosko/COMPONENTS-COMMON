package hr.adriacomsoftware.app.common.or.facade;


import hr.adriacomsoftware.app.common.or.dto.OrKategorijaDogadajaRs;
import hr.adriacomsoftware.app.common.or.dto.OrKategorijaDogadajaVo;
import hr.adriacomsoftware.app.common.or.dto.OrKategorijaGubitkaRs;
import hr.adriacomsoftware.app.common.or.dto.OrKategorijaGubitkaVo;
import hr.adriacomsoftware.app.common.or.dto.OrKontniPlanRs;
import hr.adriacomsoftware.app.common.or.dto.OrKontniPlanVo;
import hr.adriacomsoftware.app.common.or.dto.OrKontrolaRs;
import hr.adriacomsoftware.app.common.or.dto.OrKontrolaVo;
import hr.adriacomsoftware.app.common.or.dto.OrOcjenaRs;
import hr.adriacomsoftware.app.common.or.dto.OrOcjenaVo;
import hr.adriacomsoftware.app.common.or.dto.OrPoslovnaFunkcijaRs;
import hr.adriacomsoftware.app.common.or.dto.OrPoslovnaFunkcijaVo;
import hr.adriacomsoftware.app.common.or.dto.OrPoslovnaLinijaRs;
import hr.adriacomsoftware.app.common.or.dto.OrPoslovnaLinijaVo;
import hr.adriacomsoftware.app.common.or.dto.OrPrijetnjaRs;
import hr.adriacomsoftware.app.common.or.dto.OrPrijetnjaVo;
import hr.adriacomsoftware.app.common.or.dto.OrUzrokDogadajaRs;
import hr.adriacomsoftware.app.common.or.dto.OrUzrokDogadajaVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class OrMetodologijaFacadeProxy extends AS2FacadeProxy implements OrMetodologijaFacade {

    private static OrMetodologijaFacadeProxy _instance = null;

    private OrMetodologijaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.or.facade.OrMetodologijaFacadeServer");
    }

    public static OrMetodologijaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new OrMetodologijaFacadeProxy();
        return _instance;
    }
    public AS2RecordList listajSvePrijetnja()   {

    	AS2RecordList res = (AS2RecordList)  execute("listajSvePrijetnja");
    	return res;
     }
    public OrPrijetnjaRs pretraziPrijetnja(OrPrijetnjaVo value) throws AS2Exception {

    	value.setRemoteMethod("pretraziPrijetnja");
    	OrPrijetnjaRs res = (OrPrijetnjaRs) executeQuery(value);
    	return res;
     }
    public OrPrijetnjaRs procitajSvePrijetnja(OrPrijetnjaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSvePrijetnja");
    	OrPrijetnjaRs res = (OrPrijetnjaRs) executeQuery(value);
    	return res;
     }
    public OrPrijetnjaVo azurirajPrijetnja(OrPrijetnjaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajPrijetnja");
    	OrPrijetnjaVo res = (OrPrijetnjaVo)  execute(value);
    	return res;
     }
    public OrPrijetnjaVo dodajPrijetnja(OrPrijetnjaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajPrijetnja");
    	OrPrijetnjaVo res = (OrPrijetnjaVo)  execute(value);
    	return res;
     }
    public OrPrijetnjaVo brisiPrijetnja(OrPrijetnjaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiPrijetnja");
    	OrPrijetnjaVo res = (OrPrijetnjaVo)  execute(value);
    	return res;
     }
    public AS2RecordList listajSveProizvode() throws AS2Exception {
    	AS2RecordList res = executeQuery("listajSveProizvode");
    	return res;
    }
    public OrPoslovnaLinijaRs procitajSvePoslovneLinije(OrPoslovnaLinijaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePoslovneLinije");
    	OrPoslovnaLinijaRs res = (OrPoslovnaLinijaRs) executeQuery(value);
    	return res;
    }

    public OrPoslovnaLinijaVo azurirajPoslovnuLiniju(OrPoslovnaLinijaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajPoslovnuLiniju");
    	OrPoslovnaLinijaVo res = (OrPoslovnaLinijaVo)  execute(value);
    	return res;
    }

    public OrPoslovnaLinijaVo dodajPoslovnuLiniju(OrPoslovnaLinijaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPoslovnuLiniju");
    	OrPoslovnaLinijaVo res = (OrPoslovnaLinijaVo)  execute(value);
    	return res;
    }

    public OrPoslovnaLinijaVo brisiPoslovnuLiniju(OrPoslovnaLinijaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPoslovnuLiniju");
    	OrPoslovnaLinijaVo res = (OrPoslovnaLinijaVo)  execute(value);
    	return res;
    }
    //lookup poslovne linije
    public AS2RecordList listajSvePoslovneLinije() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvePoslovneLinije");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvePoslovneLinije");
		    addToCache("listajSvePoslovneLinije", rs);
		}
		return rs;
    } 
    public AS2RecordList listajSvePoslovneFunkcije() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvePoslovneFunkcije");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvePoslovneFunkcije");
		    addToCache("listajSvePoslovneFunkcije", rs);
		}
		return rs;
    } 
    public String getNazivZaSifruPoslovneLinije(String sifra){
	    return listajSvePoslovneLinije().rsReadNameForId(sifra);
    }
    public String getSifruPoslovneLinijeZaNaziv(String naziv){
	    return listajSvePoslovneLinije().rsReadIdForName(naziv);
    } 
    public AS2RecordList listajSveKategorijaDogadaja()   {
    	AS2RecordList res = (AS2RecordList)  execute("listajSveKategorijaDogadaja");
    	return res;
     }
    public OrKategorijaDogadajaRs pretraziKategorijaDogadaja(OrKategorijaDogadajaVo value) throws AS2Exception {

    	value.setRemoteMethod("pretraziKategorijaDogadaja");
    	OrKategorijaDogadajaRs res = (OrKategorijaDogadajaRs) executeQuery(value);
    	return res;
     }
    public OrKategorijaDogadajaRs procitajSveKategorijaDogadaja(OrKategorijaDogadajaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveKategorijaDogadaja");
    	OrKategorijaDogadajaRs res = (OrKategorijaDogadajaRs) executeQuery(value);
    	return res;
     }
    public OrKategorijaDogadajaVo azurirajKategorijaDogadaja(OrKategorijaDogadajaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajKategorijaDogadaja");
    	OrKategorijaDogadajaVo res = (OrKategorijaDogadajaVo)  execute(value);
    	return res;
     }
    public OrKategorijaDogadajaVo dodajKategorijaDogadaja(OrKategorijaDogadajaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajKategorijaDogadaja");
    	OrKategorijaDogadajaVo res = (OrKategorijaDogadajaVo)  execute(value);
    	return res;
     }
    public OrKategorijaDogadajaVo brisiKategorijaDogadaja(OrKategorijaDogadajaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiKategorijaDogadaja");
    	OrKategorijaDogadajaVo res = (OrKategorijaDogadajaVo)  execute(value);
    	return res;
     }
    public AS2RecordList listajSveKategorijaGubitka()   {
    	AS2RecordList res = (AS2RecordList)  execute("listajSveKategorijaGubitka");
    	return res;
     }
    public OrKategorijaGubitkaRs pretraziKategorijaGubitka(OrKategorijaGubitkaVo value) throws AS2Exception {

    	value.setRemoteMethod("pretraziKategorijaGubitka");
    	OrKategorijaGubitkaRs res = (OrKategorijaGubitkaRs) executeQuery(value);
    	return res;
     }
    public OrKategorijaGubitkaRs procitajSveKategorijaGubitka(OrKategorijaGubitkaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveKategorijaGubitka");
    	OrKategorijaGubitkaRs res = (OrKategorijaGubitkaRs) executeQuery(value);
    	return res;
     }
    public OrKategorijaGubitkaVo azurirajKategorijaGubitka(OrKategorijaGubitkaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajKategorijaGubitka");
    	OrKategorijaGubitkaVo res = (OrKategorijaGubitkaVo)  execute(value);
    	return res;
     }
    public OrKategorijaGubitkaVo dodajKategorijaGubitka(OrKategorijaGubitkaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajKategorijaGubitka");
    	OrKategorijaGubitkaVo res = (OrKategorijaGubitkaVo)  execute(value);
    	return res;
     }
    public OrKategorijaGubitkaVo brisiKategorijaGubitka(OrKategorijaGubitkaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiKategorijaGubitka");
    	OrKategorijaGubitkaVo res = (OrKategorijaGubitkaVo)  execute(value);
    	return res;
     }
    public AS2RecordList listajSveKontrola()   {
    	AS2RecordList res = (AS2RecordList)  execute("listajSveKontrola");
    	return res;
     }
    public OrKontrolaRs pretraziKontrola(OrKontrolaVo value) throws AS2Exception {

    	value.setRemoteMethod("pretraziKontrola");
    	OrKontrolaRs res = (OrKontrolaRs) executeQuery(value);
    	return res;
     }
    public OrKontrolaRs procitajSveKontrola(OrKontrolaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveKontrola");
    	OrKontrolaRs res = (OrKontrolaRs) executeQuery(value);
    	return res;
     }
    public OrKontrolaVo azurirajKontrola(OrKontrolaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajKontrola");
    	OrKontrolaVo res = (OrKontrolaVo)  execute(value);
    	return res;
     }
    public OrKontrolaVo dodajKontrola(OrKontrolaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajKontrola");
    	OrKontrolaVo res = (OrKontrolaVo)  execute(value);
    	return res;
     }
    public OrKontrolaVo brisiKontrola(OrKontrolaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiKontrola");
    	OrKontrolaVo res = (OrKontrolaVo)  execute(value);
    	return res;
     }
    //pripremiti VRSTA kod pozivanja kako bi ovo radilo 
    public AS2RecordList listajSveOcjena(OrOcjenaVo value) throws AS2Exception {
    	String _vrsta = value.get(OrOcjenaVo.OR_OCJENA__VRSTA);
    	value.setRemoteMethod("listajSveOcjena");
    	value.setCacheKey(OrOcjenaVo.OR_OCJENA__VRSTA, _vrsta);
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(value);
		if(rs==null){
	    	rs = (AS2RecordList) executeQuery(value);
	    	if (rs!=null)
	    		addToCache("listajSveCjelovitosti"+_vrsta, rs);
	    	else 
	    		rs = new AS2RecordList();
		}
		return rs;
    }
    public OrOcjenaRs pretraziOcjena(OrOcjenaVo value) throws AS2Exception {

    	value.setRemoteMethod("pretraziOcjena");
    	OrOcjenaRs res = (OrOcjenaRs) executeQuery(value);
    	return res;
     }
    public OrOcjenaRs procitajSveOcjena(OrOcjenaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveOcjena");
    	OrOcjenaRs res = (OrOcjenaRs) executeQuery(value);
    	return res;
     }
    public OrOcjenaVo azurirajOcjena(OrOcjenaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajOcjena");
    	OrOcjenaVo res = (OrOcjenaVo)  execute(value);
    	return res;
     }
    public OrOcjenaVo dodajOcjena(OrOcjenaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajOcjena");
    	OrOcjenaVo res = (OrOcjenaVo)  execute(value);
    	return res;
     }
    public OrOcjenaVo brisiOcjena(OrOcjenaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiOcjena");
    	OrOcjenaVo res = (OrOcjenaVo)  execute(value);
    	return res;
     }
	public AS2RecordList listajSveUzrokDogadaja() throws AS2Exception {
		AS2RecordList res = (AS2RecordList)  execute("listajSveUzrokDogadaja");
    	return res;
	}

	public OrUzrokDogadajaRs pretraziUzrokDogadaja(OrUzrokDogadajaVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziUzrokDogadaja");
    	OrUzrokDogadajaRs res = (OrUzrokDogadajaRs) executeQuery(value);
    	return res;
	}

    public OrUzrokDogadajaRs procitajSveUzrokDogadaja(OrUzrokDogadajaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveUzrokDogadaja");
    	OrUzrokDogadajaRs res = (OrUzrokDogadajaRs) executeQuery(value);
    	return res;
     }
    public OrUzrokDogadajaVo azurirajUzrokDogadaja(OrUzrokDogadajaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajUzrokDogadaja");
    	OrUzrokDogadajaVo res = (OrUzrokDogadajaVo)  execute(value);
    	return res;
     }
    public OrUzrokDogadajaVo dodajUzrokDogadaja(OrUzrokDogadajaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajUzrokDogadaja");
    	OrUzrokDogadajaVo res = (OrUzrokDogadajaVo)  execute(value);
    	return res;
     }
    public OrUzrokDogadajaVo brisiUzrokDogadaja(OrUzrokDogadajaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiUzrokDogadaja");
    	OrUzrokDogadajaVo res = (OrUzrokDogadajaVo)  execute(value);
    	return res;
     }
    public OrPoslovnaFunkcijaRs procitajSvePoslovneFunkcije(OrPoslovnaFunkcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSvePoslovneFunkcije");
    	OrPoslovnaFunkcijaRs res = (OrPoslovnaFunkcijaRs) executeQuery(value);
    	return res;
     }
    public OrPoslovnaFunkcijaVo azurirajPoslovnuFunkciju(OrPoslovnaFunkcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajPoslovnuFunkciju");
    	OrPoslovnaFunkcijaVo res = (OrPoslovnaFunkcijaVo)  execute(value);
    	return res;
     }
    public OrPoslovnaFunkcijaVo dodajPoslovnuFunkciju(OrPoslovnaFunkcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajPoslovnuFunkciju");
    	OrPoslovnaFunkcijaVo res = (OrPoslovnaFunkcijaVo)  execute(value);
    	return res;
     }
    public OrPoslovnaFunkcijaVo brisiPoslovnuFunkciju(OrPoslovnaFunkcijaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiPoslovnuFunkciju");
    	OrPoslovnaFunkcijaVo res = (OrPoslovnaFunkcijaVo)  execute(value);
    	return res;
     }
    //lookup ocjene
    public String getNazivZaSifruOcjene(String sifra, String vrsta){
    	OrOcjenaVo vo = new OrOcjenaVo();
    	vo.setVrsta(vrsta);
	    return listajSveOcjena(vo).rsReadNameForId(sifra);
    }
    public String getSifruOcjeneZaNaziv(String naziv, String vrsta){
    	OrOcjenaVo vo = new OrOcjenaVo();
    	vo.setVrsta(vrsta);
	    return listajSveOcjena(vo).rsReadIdForName(naziv);
    }
    //lookup uzrok dogadaja
    public String getNazivZaSifruUzrokDogadaja(String sifra){
	    return listajSveUzrokDogadaja().rsReadNameForId(sifra);
    }
    public String getSifruUzrokDogadajaZaNaziv(String naziv){
	    return listajSveUzrokDogadaja().rsReadIdForName(naziv);
    }
    //lookup kategorija dogadaja
    public String getNazivZaSifruKategorijaDogadaja(String sifra){
	    return listajSveKategorijaDogadaja().rsReadNameForId(sifra);
    }
    public String getSifruKategorijaDogadajaZaNaziv(String naziv){
	    return listajSveKategorijaDogadaja().rsReadIdForName(naziv);
    }
    //lookup kategorija gubitka
    public String getNazivZaSifruKategorijaGubitka(String sifra){
	    return listajSveKategorijaGubitka().rsReadNameForId(sifra);
    }
    public String getSifruKategorijaGubitkaZaNaziv(String naziv){
	    return listajSveKategorijaGubitka().rsReadIdForName(naziv);
    }
    //lookup proizvod
    public String getNazivZaSifruProizvoda(String sifra){
	    return listajSveProizvode().rsReadNameForId(sifra);
    }
    public String getSifruProizvodaZaNaziv(String naziv){
	    return listajSveProizvode().rsReadIdForName(naziv);
    }
    //lookup funkcije
    public String getNazivZaSifruFunkcije(String sifra){
	    return listajSvePoslovneFunkcije().rsReadNameForId(sifra);
    }
    public String getSifruFunkcijeZaNaziv(String naziv){
	    return listajSvePoslovneFunkcije().rsReadIdForName(naziv);
    }
    //lookup prijetnja
    public String getNazivZaSifruPrijetnja(String sifra){
	    return listajSvePrijetnja().rsReadNameForId(sifra);
    }
    public String getSifruPrijetnjaZaNaziv(String naziv){
	    return listajSvePrijetnja().rsReadIdForName(naziv);
    }

/************* FACADE PROXY  or_kontni_plan ************/

public OrKontniPlanVo brisiOrKontniPlan(OrKontniPlanVo value) throws AS2Exception {
	value.setRemoteMethod("brisiOrKontniPlan");
	OrKontniPlanVo res = (OrKontniPlanVo) execute(value);
	return res;
}
public OrKontniPlanVo dodajOrKontniPlan(OrKontniPlanVo value) throws AS2Exception {
	value.setRemoteMethod("dodajOrKontniPlan");
	OrKontniPlanVo res = (OrKontniPlanVo) execute(value);
	return res;
}
public OrKontniPlanVo azurirajOrKontniPlan(OrKontniPlanVo value) throws AS2Exception {
	value.setRemoteMethod("azurirajOrKontniPlan");
	OrKontniPlanVo res = (OrKontniPlanVo) execute(value);
	return res;
}
public OrKontniPlanRs procitajSveOrKontniPlan(OrKontniPlanVo value) throws AS2Exception {
	value.setRemoteMethod("procitajSveOrKontniPlan");
	OrKontniPlanRs res = (OrKontniPlanRs) executeQuery(value);
	return res;
}
public AS2RecordList listajSveOrKontniPlan() throws AS2Exception {
	AS2RecordList res = (AS2RecordList) executeQuery("listajSveOrKontniPlan");
	return res;
}
public OrKontniPlanRs pretraziOrKontniPlan(OrKontniPlanVo value) throws AS2Exception {
	value.setRemoteMethod("pretraziSveOrKontniPlan");
	OrKontniPlanRs res = (OrKontniPlanRs) executeQuery(value);
	return res;
}
}