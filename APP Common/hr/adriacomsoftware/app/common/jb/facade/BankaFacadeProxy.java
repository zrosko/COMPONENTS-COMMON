package hr.adriacomsoftware.app.common.jb.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.dto.OsobaVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.adriacomsoftware.app.common.jb.dto.RadnikRs;
import hr.adriacomsoftware.app.common.jb.dto.RadnikVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class BankaFacadeProxy extends AS2FacadeProxy implements BankaFacade {

    private static BankaFacadeProxy _instance = null;

    private BankaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.jb.facade.BankaFacadeServer");
    }

    public static BankaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new BankaFacadeProxy();
        return _instance;
    }

    public AS2RecordList listajSveRadnike() throws AS2Exception {
        RadnikVo vo = new RadnikVo();
	    vo.setRemoteMethod("listajSveRadnike");
	    RadnikRs rs = (RadnikRs)getQueryFromCache(vo);
		if(rs==null){
		    rs = (RadnikRs) executeQuery("listajSveRadnike");
		    addToCache("listajSveRadnike", rs);
		}
		return rs;	
    }
    public AS2RecordList listajSveDjelatnike() throws AS2Exception {
        OsnovniVo vo = new OsnovniVo();
	    vo.setRemoteMethod("listajSveDjelatnike");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveDjelatnike");
		    addToCache("listajSveDjelatnike", rs);
		}
		return rs;	
    }
    public AS2RecordList listajSveDjelatnikeJmbg() throws AS2Exception {
        OsnovniVo vo = new OsnovniVo();
	    vo.setRemoteMethod("listajSveDjelatnikeJmbg");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveDjelatnikeJmbg");
		    addToCache("listajSveDjelatnikeJmbg", rs);
		}
		return rs;	
    }
    public AS2RecordList listajSveDjelatnikeBanke() throws AS2Exception {
        OsnovniVo vo = new OsnovniVo();
	    vo.setRemoteMethod("listajSveDjelatnikeBanke");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveDjelatnikeBanke");
		    addToCache("listajSveDjelatnikeBanke", rs);
		}
		return rs;	
    }
    public AS2RecordList listajSveKorisnikeBanke() throws AS2Exception {
        OsnovniVo vo = new OsnovniVo();
	    vo.setRemoteMethod("listajSveKorisnikeBanke");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveKorisnikeBanke");
		    addToCache("listajSveKorisnikeBanke", rs);
		}
		return rs;	
    }
    public AS2RecordList listajSveBanke() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveBanke");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveBanke");
		    addToCache("listajSveBanke", rs);
		}
		return rs;	
    }
    public AS2RecordList listajSveBankeKratka() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveBankeKratka");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveBankeKratka");
		    addToCache("listajSveBankeKratka", rs);
		}
		return rs;	
    }

    public AS2RecordList listajSvePoslovnice() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvePoslovnice");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvePoslovnice");
		    addToCache("listajSvePoslovnice", rs);
		}
		return rs;
    }

    public AS2RecordList listajSveValute() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveValute");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveValute");
		    addToCache("listajSveValute", rs);
		}
		return rs;
    }
    public AS2RecordList listajSveVrsteTrajnihNaloga() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveVrsteTrajnihNaloga");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveVrsteTrajnihNaloga");
		    addToCache("listajSveVrsteTrajnihNaloga", rs);
		}
		return rs;
    }

    public AS2RecordList listajSveOpcine() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveOpcine");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveOpcine");
		    addToCache("listajSveOpcine", rs);
		}
		return rs;
    }

    public AS2RecordList listajSvaMjesta() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvaMjesta");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvaMjesta");
		    addToCache("listajSvaMjesta", rs);
		}
		return rs;	
    }

    public AS2RecordList listajSveZupanije() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveZupanije");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveZupanije");
		    addToCache("listajSveZupanije", rs);
		}
		return rs;	
    }

//    public J2EEResultSet listajSveDrzave() throws J2EEException {
//        J2EEValueObject vo = new J2EEValueObject();
//	    vo.setRemoteMethod("listajSveDrzave");
//	    J2EEResultSet rs = (J2EEResultSet)getQueryFromCache(vo);
//	    if(rs!=null && rs.getResultSet("doSearch")!=null){
//	        J2EEResultSet rs_upit = rs.getResultSet("doSearch");
//	        rs.deleteResultSet("doSearch");
//	        return rs_upit;
//	    }
//		if(rs==null){
//		    rs = (J2EEResultSet) executeQuery("listajSveDrzave");
//		    addToCache("listajSveDrzave", rs);
//		}
//		return rs;	
//    }
    public AS2RecordList listajSveDrzave(OsnovniVo value) throws AS2Exception {
	    value.setRemoteMethod("listajSveDrzave");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(value);
	    if(rs!=null && rs.getResultSet(value.get("doSearch"))!=null){
	        AS2RecordList rs_upit = rs.getResultSet(value.get("doSearch"));
	        rs.deleteResultSet(value.get("doSearch"));
	        return rs_upit;
	    }
		if(rs==null){
		    
		    rs = (AS2RecordList) executeQuery(value);
		    addToCache("listajSveDrzave", rs);
		}
		return rs;	
    }
    public void pronadiDrzave(String lista, String value) throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveDrzave");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
	    AS2RecordList rs_upit = rs.doSearch("name","%like%",value);
		rs.addResultSet(lista,rs_upit);	
    }
    public AS2RecordList listajSveTipovePovezanihOsoba() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveTipovePovezanihOsoba");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveTipovePovezanihOsoba");
		    addToCache("listajSveTipovePovezanihOsoba", rs);
		}
		return rs;	
    }
    public AS2RecordList listajSveCrneListe() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveCrneListe");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveCrneListe");
		    addToCache("listajSveCrneListe", rs);
		}
		return rs;
    }
    public String getNazivZaSifruRadnika(String sifra_radnika){
	    return listajSveRadnike().rsReadNameForId(sifra_radnika);
    }
    public String getSifruRadnikaZaNaziv(String naziv){
	    return listajSveRadnike().rsReadIdForName(naziv);
    }
    public String getNazivZaSifruBanke(String sifra_banke){
	    return listajSveBanke().rsReadNameForId(sifra_banke);
    }
    public String getSifruBankeZaNaziv(String naziv){
	    return listajSveBanke().rsReadIdForName(naziv);
    }
    public String getNazivZaSifruPoslovnice(String sifra_poslovnice){
	    return listajSvePoslovnice().rsReadNameForId(sifra_poslovnice);
    }
    public String getSifruPoslovniceZaNaziv(String naziv){
	    return listajSvePoslovnice().rsReadIdForName(naziv);
    }
    public String getNazivZaSifruValute(String sifra_valute){
	    return listajSveValute().rsReadNameForId(sifra_valute);
    }
    public String getSifruValuteZaNaziv(String naziv){
	    return listajSveValute().rsReadIdForName(naziv);
    }
    public String getNazivZaSifruOpcine(String sifra_opcine){
	    return listajSveOpcine().rsReadNameForId(sifra_opcine);
    }
    public String getSifruOpcineZaNaziv(String naziv){
	    return listajSveOpcine().rsReadIdForName(naziv);
    }
    public String getNazivZaSifruMjesta(String sifra_mjesta){
	    return listajSvaMjesta().rsReadNameForId(sifra_mjesta);
    }
    public String getSifruMjestaZaNaziv(String naziv){
	    return listajSvaMjesta().rsReadIdForName(naziv);
    }
    public String getNazivZaSifruZupanije(String sifra_zupanije){
	    return listajSveZupanije().rsReadNameForId(sifra_zupanije);
    }
    public String getNazivZaSifruDrzave(String sifra_drzave){
	    return listajSveDrzave(new OsnovniVo()).rsReadNameForId(sifra_drzave);
    }
    public String getSifruZupanijeZaNaziv(String naziv){
	    return listajSveZupanije().rsReadIdForName(naziv);
    }
    public String getSifruDrzaveZaNaziv(String naziv){
	    return listajSveDrzave(new OsnovniVo()).rsReadIdForName(naziv);
    }
    //djelatnosti
    public String getNazivZaDjelatnost(String sifra_djelatnosti){
	    return listajSveDjelatnosti().rsReadNameForId(sifra_djelatnosti);
    }
    public String getSifruDjelatnostiZaNaziv(String naziv){
	    return listajSveDjelatnosti().rsReadIdForName(naziv);
    }
    //djelantosti kratko
    public String getNazivZaDjelatnostKratko(String sifra_djelatnosti){
	    return listajSveDjelatnostiKratko().rsReadNameForId(sifra_djelatnosti);
    }
    public String getSifruDjelatnostiKratkoZaNaziv(String naziv){
	    return listajSveDjelatnostiKratko().rsReadIdForName(naziv);
    }
    //vrsta trajnog naloga
    public String getNazivZaSifruVrstTrajnogNaloga(String sifra_valute){
	    return listajSveVrsteTrajnihNaloga().rsReadNameForId(sifra_valute);
    }
    public String getSifruVrsteTrajnogNalogaZaNaziv(String naziv){
	    return listajSveVrsteTrajnihNaloga().rsReadIdForName(naziv);
    }
    //djelatnici jmbg
    public String getNazivZaDjelatnikaJmbg(String jmbg){
	    return listajSveDjelatnikeJmbg().rsReadNameForId(jmbg);
    }
    public String getJmbgZaNaziv(String naziv){
	    return listajSveDjelatnikeJmbg().rsReadIdForName(naziv);
    }
    //djelatnici banke
    public String getNazivZaDjelatnikaBanke(String jmbg){
	    return listajSveDjelatnikeBanke().rsReadNameForId(jmbg);
    }
    public String getJmbgZaNazivDjelatnikaBanke(String naziv){
	    return listajSveDjelatnikeBanke().rsReadIdForName(naziv);
    }
    //djelatnici oznaka korisnika
    public String getNazivZaKorisnikaBanke(String jmbg){
	    return listajSveKorisnikeBanke().rsReadNameForId(jmbg);
    }
    public String getKorisnikZaNazivDjelatnikaBanke(String naziv){
	    return listajSveKorisnikeBanke().rsReadIdForName(naziv);
    }
    //tipovi povezanih osoba
    public String getNazivZaTipPovezaneOsobe(String jmbg){
	    return listajSveTipovePovezanihOsoba().rsReadNameForId(jmbg);
    }
    public String getTipPovezaneOsobeZaNaziv(String naziv){
	    return listajSveTipovePovezanihOsoba().rsReadIdForName(naziv);
    }
    //radna mjesta
    public String getNazivZaIdRadnogMjesta(String jmbg){
	    return listajSvaRadnaMjesta().rsReadNameForId(jmbg);
    }
    public String getIdRadnogMjestaZaNaziv(String naziv){
	    return listajSvaRadnaMjesta().rsReadIdForName(naziv);
    }
    //crne liste
    public String getNazivZaCrnuListu(String id_liste){
	    return listajSveCrneListe().rsReadNameForId(id_liste);
    }
    public String getSifruCrneListeZaNaziv(String naziv){
	    return listajSveCrneListe().rsReadIdForName(naziv);
    }

//    public J2EEResultSet listajSveUslugeFilter(J2EEValueObject value) throws J2EEException {
//        value.setRemoteMethod("listajSveUslugeFilter");
//        J2EEResultSet res = (J2EEResultSet) executeQuery(value);
//        return res;
//    }
//    public J2EEResultSet listajSveKupceFilter(J2EEValueObject value) throws J2EEException {
//        value.setRemoteMethod("listajSveKupceFilter");
//        J2EEResultSet res = (J2EEResultSet) executeQuery(value);
//        return res;
//    }
    //djelatnici jmbg

    public AS2RecordList izvjestajTecajnaLista(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajTecajnaLista");
		return executeQuery(value);
    }

    public AS2RecordList izvjestajOrganizacijskeJedinice() throws AS2Exception {
        return executeQuery("izvjestajOrganizacijskeJedinice");
    }

    public AS2RecordList izvjestajTipoviRacuna() throws AS2Exception {
        return executeQuery("izvjestajTipoviRacuna");
    }
    
    public AS2RecordList izvjestajVrstePrometaRacuna() throws AS2Exception {
        return executeQuery("izvjestajVrstePrometaRacuna");
    }
    
    public AS2RecordList izvjestajBanke() throws AS2Exception {
        return executeQuery("izvjestajBanke");
    }

    public AS2RecordList izvjestajKontniPlan() throws AS2Exception {
        return executeQuery("izvjestajKontniPlan");
    }

    public OsnovniRs izvjestajKreditiValutneKlauzule(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestajKreditiValutneKlauzule");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public OsnovniRs izvjestajObrazac4(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajObrazac4");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
    public OsnovniRs izvjestajObrazac1(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajObrazac1");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }

    public AS2RecordList izvjestajBrutoBilanca(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajBrutoBilanca");
		return executeQuery(value);
    }

    public AS2RecordList listajSveDjelatnosti() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveDjelatnosti");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveDjelatnosti");
		    addToCache("listajSveDjelatnosti", rs);
		}
		return rs;	
    }

    public AS2RecordList listajSveDjelatnostiKratko() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveDjelatnostiKratko");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveDjelatnostiKratko");
		    addToCache("listajSveDjelatnostiKratko", rs);
		}
		return rs;	
    }
    public AS2RecordList listajSvaRadnaMjesta() throws AS2Exception {
        OsnovniVo vo = new OsnovniVo();
	    vo.setRemoteMethod("listajSvaRadnaMjesta");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvaRadnaMjesta");
		    addToCache("listajSvaRadnaMjesta", rs);
		}
		return rs;	
    } 
    public OsobaRs pronadiOsobu(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiOsobu");
    	OsobaRs res = (OsobaRs) executeQuery(value);
    	return res;
     }

    public OsobaVo pronadiOsobuJmbg(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiOsobuJmbg");
    	OsobaVo res = (OsobaVo) execute(value);
    	return res;
    }

    public OsobaVo pronadiOsobuOib(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiOsobuOib");
    	OsobaVo res = (OsobaVo) execute(value);
    	return res;
    }

    public OsobaVo pronadiOsobuJmbgMb(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiOsobuJmbgMb");
    	OsobaVo res = (OsobaVo) execute(value);
    	return res;
    }

    public OsobaVo pronadiPravnuFizickuOsobuOib(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiPravnuFizickuOsobuOib");
    	OsobaVo res = (OsobaVo) execute(value);
    	return res;
    }
    
    public OsobaVo pronadiPravnuFizickuOsobuBrojPartije(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiPravnuFizickuOsobuBrojPartije");
    	OsobaVo res = (OsobaVo) execute(value);
    	return res;
    }

    public AS2RecordList listajSveRadnikeKorisnike() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveRadnikeKorisnike");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveRadnikeKorisnike");
		    addToCache("listajSveRadnikeKorisnike", rs);
		}
		return rs;
    }
    public String getNazivZaSifruRadnikaKorisnika(String sifra_radnika){
	    return listajSveRadnikeKorisnike().rsReadNameForId(sifra_radnika);
    }
    public String getSifruRadnikaKorisnikaZaNaziv(String naziv){
	    return listajSveRadnikeKorisnike().rsReadIdForName(naziv);
    }
    //uloga
    public AS2RecordList listajSveUloge(OsnovniVo value) throws AS2Exception {
	    value.setRemoteMethod("listajSveUloge");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(value);
		if(rs==null){		    
		    rs = (AS2RecordList) executeQuery(value);
		    addToCache("listajSveUloge", rs);
		}
		return rs.doSearch("id_imovine","=",value.get("id_imovine"), 0, 100, null); 	
    }
    public void pronadiUloge(String lista, String value) throws AS2Exception {
        AS2Record vo = new AS2Record();
        if(lista.equals("uloga_komponenta"))
            vo.setRemoteMethod("listajSveUlogeKomponente");
        else
            vo.setRemoteMethod("listajSveUloge");
	    vo.set("id_imovine",value);
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
	    if(rs==null){
	        if(lista.equals("uloga_komponenta"))
	            rs=BankaFacadeProxy.getInstance().listajSveUlogeKomponente(new OsnovniVo(vo));
	        else
	            rs=BankaFacadeProxy.getInstance().listajSveUloge(new OsnovniVo(vo));
	    }
	    AS2RecordList rs_upit = rs.doSearch("id_imovine","%like%",value);
		rs.addResultSet(lista,rs_upit);	
    }

    public AS2RecordList listajSveUlogeKomponente(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("listajSveUlogeKomponente");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(value);
	    if(rs!=null && rs.getResultSet(value.get("doSearch"))!=null){
	        AS2RecordList rs_upit = rs.getResultSet(value.get("doSearch"));
	        rs.deleteResultSet(value.get("doSearch"));
	        return rs_upit;
	    }
		if(rs==null){
		    
		    rs = (AS2RecordList) executeQuery(value);
		    addToCache("listajSveUlogeKomponente", rs);
		}
		return rs;	
    }

	public AS2RecordList listajSveDjelatnikeBankeIT() throws AS2Exception {
        OsnovniVo vo = new OsnovniVo();
	    vo.setRemoteMethod("listajSveDjelatnikeBankeIT");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveDjelatnikeBankeIT");
		    addToCache("listajSveDjelatnikeBankeIT", rs);
		}
		return rs;	
	}

	public PartijaRs listajSvePartijeZaOib(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("listajSvePartijeZaOib");
    	PartijaRs res = (PartijaRs) executeQuery(value);
    	return res;
	}
	
	//HBOR
    public OsnovniVo dodajHborPartiju(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajHborPartiju");
    	OsnovniVo res = (OsnovniVo) execute(value);
    	return res;
    }
    public OsnovniVo provjeriHborPartiju(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("provjeriHborPartiju");
    	OsnovniVo res = (OsnovniVo) execute(value);
    	return res;
    }

	public OsnovniRs procitajUnesenePartije(OsnovniVo value)throws AS2Exception {
		value.setRemoteMethod("procitajUnesenePartije");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
	}
}