package hr.adriacomsoftware.app.common.cmdb.facade;


import hr.adriacomsoftware.app.common.cmdb.dto.CmdbDjelatnikRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbDjelatnikVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbDobavljacRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbDobavljacVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaDodatakRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaDodatakVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaKorisnikRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaKorisnikVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaPrivitakRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaPrivitakVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaVezaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaVezaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbKvarRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbKvarVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbMrezniCvorRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbMrezniCvorVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbOrgJedinicaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbOrgJedinicaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbPromjenaPrivitakRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbPromjenaPrivitakVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbPromjenaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbPromjenaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.DjelatnikIzobrazbaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.DjelatnikIzobrazbaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.DjelatnikVjestinaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.DjelatnikVjestinaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.EmailVo;
import hr.adriacomsoftware.app.common.cmdb.dto.IzobrazbaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.IzobrazbaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.VjestinaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.VjestinaVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class CMDBFacadeProxy extends AS2FacadeProxy implements CMDBFacade {

    private static CMDBFacadeProxy _instance = null;

    private CMDBFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.cmdb.facade.CMDBFacadeServer");
    }
    public static CMDBFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new CMDBFacadeProxy();
        return _instance;
    }
    public CmdbImovinaRs citajSvuImovinu(CmdbImovinaVo value) throws AS2Exception {

    	value.setRemoteMethod("citajSvuImovinu");
    	CmdbImovinaRs res = (CmdbImovinaRs) executeQuery(value);
    	return res;
     }
    public CmdbImovinaRs pronadiSvuImovinu(CmdbImovinaVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiSvuImovinu");
    	CmdbImovinaRs res = (CmdbImovinaRs) executeQuery(value);
    	return res;
     }
    public CmdbImovinaVo dodajImovinu(CmdbImovinaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajImovinu");
    	CmdbImovinaVo res = (CmdbImovinaVo)  execute(value);
    	return res;
     }
    public CmdbImovinaVo citajImovinu(CmdbImovinaVo value) throws AS2Exception {

    	value.setRemoteMethod("citajImovinu");
    	CmdbImovinaVo res = (CmdbImovinaVo)  execute(value);
    	return res;
     }
    public CmdbImovinaVo duplicirajImovinu(CmdbImovinaVo value) throws AS2Exception {

    	value.setRemoteMethod("duplicirajImovinu");
    	CmdbImovinaVo res = (CmdbImovinaVo)  execute(value);
    	return res;
     }
    public CmdbImovinaVo brisiImovinu(CmdbImovinaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiImovinu");
    	CmdbImovinaVo res = (CmdbImovinaVo)  execute(value);
    	return res;
     }
    public CmdbImovinaVo azurirajImovinu(CmdbImovinaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajImovinu");
    	CmdbImovinaVo res = (CmdbImovinaVo)  execute(value);
    	return res;
     }
    //povijest imovine
    public CmdbImovinaRs citajPovijestImovine(CmdbImovinaVo value) throws AS2Exception {
        value.setRemoteMethod("citajPovijestImovine");
        CmdbImovinaRs res = (CmdbImovinaRs) executeQuery(value);
        return res;
     }
    public CmdbImovinaVo dodajUrediPovijestImovine(CmdbImovinaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajUrediPovijestImovine");
        CmdbImovinaVo res = (CmdbImovinaVo)  execute(value);
        return res;
     }
    
    
    public CmdbImovinaKorisnikRs procitajSveKorisnikeImovine(CmdbImovinaKorisnikVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveKorisnikeImovine");
    	CmdbImovinaKorisnikRs res = (CmdbImovinaKorisnikRs) executeQuery(value);
    	return res;
     }
    public CmdbImovinaKorisnikVo azurirajKorisnikaImovine(CmdbImovinaKorisnikVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajKorisnikaImovine");
    	CmdbImovinaKorisnikVo res = (CmdbImovinaKorisnikVo)  execute(value);
    	return res;
     }
    public CmdbImovinaKorisnikVo dodajKorisnikaImovine(CmdbImovinaKorisnikVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajKorisnikaImovine");
    	CmdbImovinaKorisnikVo res = (CmdbImovinaKorisnikVo)  execute(value);
    	return res;
     }
    public CmdbImovinaKorisnikVo brisiKorisnikaImovine(CmdbImovinaKorisnikVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiKorisnikaImovine");
    	CmdbImovinaKorisnikVo res = (CmdbImovinaKorisnikVo)  execute(value);
    	return res;
     }
    public CmdbDjelatnikRs procitajSveDjelatnike(CmdbDjelatnikVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveDjelatnike");
    	CmdbDjelatnikRs res = (CmdbDjelatnikRs) executeQuery(value);
    	return res;
     }
    public CmdbDjelatnikRs pronadiDjelatnike(CmdbDjelatnikVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiDjelatnike");
    	CmdbDjelatnikRs res = (CmdbDjelatnikRs) executeQuery(value);
    	return res;
     }
    public CmdbDjelatnikVo azurirajDjelatnika(CmdbDjelatnikVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajDjelatnika");
    	CmdbDjelatnikVo res = (CmdbDjelatnikVo)  execute(value);
    	return res;
     }
    public CmdbDjelatnikVo dodajDjelatnika(CmdbDjelatnikVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajDjelatnika");
    	CmdbDjelatnikVo res = (CmdbDjelatnikVo)  execute(value);
    	return res;
     }
    public CmdbDjelatnikVo brisiDjelatnika(CmdbDjelatnikVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiDjelatnika");
    	CmdbDjelatnikVo res = (CmdbDjelatnikVo)  execute(value);
    	return res;
     }
    public IzobrazbaRs procitajSveIzobrazbe(IzobrazbaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveIzobrazbe");
    	IzobrazbaRs res = (IzobrazbaRs) executeQuery(value);
    	return res;
     }
    public IzobrazbaVo azurirajIzobrazbu(IzobrazbaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajIzobrazbu");
    	IzobrazbaVo res = (IzobrazbaVo)  execute(value);
    	return res;
     }
    public IzobrazbaVo dodajIzobrazbu(IzobrazbaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajIzobrazbu");
    	IzobrazbaVo res = (IzobrazbaVo)  execute(value);
    	return res;
     }
    public IzobrazbaVo brisiIzobrazbu(IzobrazbaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiIzobrazbu");
    	IzobrazbaVo res = (IzobrazbaVo)  execute(value);
    	return res;
     }
    public VjestinaRs procitajSveVjestine(VjestinaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveVjestine");
    	VjestinaRs res = (VjestinaRs) executeQuery(value);
    	return res;
     }
    public VjestinaVo azurirajVjestinu(VjestinaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajVjestinu");
    	VjestinaVo res = (VjestinaVo)  execute(value);
    	return res;
     }
    public VjestinaVo dodajVjestinu(VjestinaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajVjestinu");
    	VjestinaVo res = (VjestinaVo)  execute(value);
    	return res;
     }
    public VjestinaVo brisiVjestinu(VjestinaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiVjestinu");
    	VjestinaVo res = (VjestinaVo)  execute(value);
    	return res;
     }
    public DjelatnikIzobrazbaRs procitajSveIzobrazbeDjelatnika(DjelatnikIzobrazbaVo value)   {

    	value.setRemoteMethod("procitajSveIzobrazbeDjelatnika");
    	DjelatnikIzobrazbaRs res = (DjelatnikIzobrazbaRs) executeQuery(value);
    	return res;
     }

    public DjelatnikIzobrazbaVo azurirajIzobrazbuDjelatnika(DjelatnikIzobrazbaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajIzobrazbuDjelatnika");
    	DjelatnikIzobrazbaVo res = (DjelatnikIzobrazbaVo)  execute(value);
    	return res;
     }
    public DjelatnikIzobrazbaVo dodajIzobrazbuDjelatika(DjelatnikIzobrazbaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajIzobrazbuDjelatika");
    	DjelatnikIzobrazbaVo res = (DjelatnikIzobrazbaVo)  execute(value);
    	return res;
     }
    public DjelatnikIzobrazbaVo brisiIzobrazbuDjelatnika(DjelatnikIzobrazbaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiIzobrazbuDjelatnika");
    	DjelatnikIzobrazbaVo res = (DjelatnikIzobrazbaVo)  execute(value);
    	return res;
     }
    public DjelatnikVjestinaRs procitajSveVjestineDjelatnika(DjelatnikVjestinaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveVjestineDjelatnika");
    	DjelatnikVjestinaRs res = (DjelatnikVjestinaRs) executeQuery(value);
    	return res;
     }
    public DjelatnikVjestinaVo azurirajVjestinuDjelatnika(DjelatnikVjestinaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajVjestinuDjelatnika");
    	DjelatnikVjestinaVo res = (DjelatnikVjestinaVo)  execute(value);
    	return res;
     }
    public DjelatnikVjestinaVo dodajVjestinuDjelatnika(DjelatnikVjestinaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajVjestinuDjelatnika");
    	DjelatnikVjestinaVo res = (DjelatnikVjestinaVo)  execute(value);
    	return res;
     }
    public DjelatnikVjestinaVo brisiVjestinuDjelatnika(DjelatnikVjestinaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiVjestinuDjelatnika");
    	DjelatnikVjestinaVo res = (DjelatnikVjestinaVo)  execute(value);
    	return res;
     }
    public EmailVo proslijediEmailom(EmailVo value) throws AS2Exception {

    	value.setRemoteMethod("proslijediEmailom");
    	EmailVo res = (EmailVo)  execute(value);
    	return res;
     }
    public CmdbDjelatnikRs pronadiEmailDjelatnike(CmdbDjelatnikVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiEmailDjelatnike");
    	CmdbDjelatnikRs res = (CmdbDjelatnikRs) executeQuery(value);
    	return res;
     }
    public CmdbOrgJedinicaRs procitajSveOrgJedinice(CmdbOrgJedinicaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveOrgJedinice");
    	CmdbOrgJedinicaRs res = (CmdbOrgJedinicaRs) executeQuery(value);
    	return res;
     }
    public CmdbImovinaDodatakRs procitajSveDodatkeImovine(CmdbImovinaDodatakVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveDodatkeImovine");
    	CmdbImovinaDodatakRs res = (CmdbImovinaDodatakRs) executeQuery(value);
    	return res;
     }
    public CmdbImovinaDodatakVo azurirajDodatakImovine(CmdbImovinaDodatakVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajDodatakImovine");
    	CmdbImovinaDodatakVo res = (CmdbImovinaDodatakVo)  execute(value);
    	return res;
     }
    public CmdbImovinaDodatakVo dodajDodatakImovine(CmdbImovinaDodatakVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajDodatakImovine");
    	CmdbImovinaDodatakVo res = (CmdbImovinaDodatakVo)  execute(value);
    	return res;
     }
    public CmdbImovinaDodatakVo brisiDodatakImovine(CmdbImovinaDodatakVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiDodatakImovine");
    	CmdbImovinaDodatakVo res = (CmdbImovinaDodatakVo)  execute(value);
    	return res;
     }
    public CmdbImovinaPrivitakRs procitajSvePrivitkeImovine(CmdbImovinaPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSvePrivitkeImovine");
    	CmdbImovinaPrivitakRs res = (CmdbImovinaPrivitakRs) executeQuery(value);
    	return res;
     }
    public CmdbImovinaPrivitakVo dodajPrivitakImovine(CmdbImovinaPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajPrivitakImovine");
    	CmdbImovinaPrivitakVo res = (CmdbImovinaPrivitakVo)  execute(value);
    	return res;
     }
    public CmdbImovinaPrivitakVo citajPrivitakImovine(CmdbImovinaPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("citajPrivitakImovine");
    	CmdbImovinaPrivitakVo res = (CmdbImovinaPrivitakVo)  execute(value);
    	return res;
     }
    public CmdbImovinaPrivitakVo brisiPrivitakImovine(CmdbImovinaPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiPrivitakImovine");
    	CmdbImovinaPrivitakVo res = (CmdbImovinaPrivitakVo)  execute(value);
    	return res;
     }
    public CmdbPromjenaPrivitakRs procitajSvePrivitkePromjene(CmdbPromjenaPrivitakVo value)   {

    	value.setRemoteMethod("procitajSvePrivitkePromjene");
    	CmdbPromjenaPrivitakRs res = (CmdbPromjenaPrivitakRs) executeQuery(value);
    	return res;
     }

    public CmdbPromjenaPrivitakVo dodajPrivitakPromjene(CmdbPromjenaPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajPrivitakPromjene");
    	CmdbPromjenaPrivitakVo res = (CmdbPromjenaPrivitakVo)  execute(value);
    	return res;
     }
    public CmdbPromjenaPrivitakVo citajPrivitakPromjene(CmdbPromjenaPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("citajPrivitakPromjene");
    	CmdbPromjenaPrivitakVo res = (CmdbPromjenaPrivitakVo)  execute(value);
    	return res;
     }
    public CmdbPromjenaPrivitakVo brisiPrivitakPromjene(CmdbPromjenaPrivitakVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiPrivitakPromjene");
    	CmdbPromjenaPrivitakVo res = (CmdbPromjenaPrivitakVo)  execute(value);
    	return res;
     }
    public CmdbKvarRs procitajSveKvaroveImovine(CmdbKvarVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveKvaroveImovine");
    	CmdbKvarRs res = (CmdbKvarRs) executeQuery(value);
    	return res;
     }
    public CmdbKvarVo azurirajKvarImovine(CmdbKvarVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajKvarImovine");
    	CmdbKvarVo res = (CmdbKvarVo)  execute(value);
    	return res;
     }
    public CmdbKvarVo dodajKvarImovine(CmdbKvarVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajKvarImovine");
    	CmdbKvarVo res = (CmdbKvarVo)  execute(value);
    	return res;
     }
    public CmdbKvarVo brisiKvarImovine(CmdbKvarVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiKvarImovine");
    	CmdbKvarVo res = (CmdbKvarVo)  execute(value);
    	return res;
     }
    public CmdbPromjenaRs procitajSvePromjeneImovine(CmdbPromjenaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSvePromjeneImovine");
    	CmdbPromjenaRs res = (CmdbPromjenaRs) executeQuery(value);
    	return res;
     }
    public CmdbPromjenaVo azurirajPromjenuImovine(CmdbPromjenaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajPromjenuImovine");
    	CmdbPromjenaVo res = (CmdbPromjenaVo)  execute(value);
    	return res;
     }
    public CmdbPromjenaVo dodajPromjenuImovine(CmdbPromjenaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajPromjenuImovine");
    	CmdbPromjenaVo res = (CmdbPromjenaVo)  execute(value);
    	return res;
     }
    public CmdbPromjenaVo brisiPromjenuImovine(CmdbPromjenaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiPromjenuImovine");
    	CmdbPromjenaVo res = (CmdbPromjenaVo)  execute(value);
    	return res;
     }
    public CmdbImovinaVezaRs procitajSveVezeImovine(CmdbImovinaVezaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveVezeImovine");
    	CmdbImovinaVezaRs res = (CmdbImovinaVezaRs) executeQuery(value);
    	return res;
     }
    public CmdbImovinaVezaVo azurirajVezuImovine(CmdbImovinaVezaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajVezuImovine");
    	CmdbImovinaVezaVo res = (CmdbImovinaVezaVo)  execute(value);
    	return res;
     }
    public CmdbImovinaVezaVo dodajVezuImovine(CmdbImovinaVezaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajVezuImovine");
    	CmdbImovinaVezaVo res = (CmdbImovinaVezaVo)  execute(value);
    	return res;
     }
    public CmdbImovinaVezaVo brisiVezuImovine(CmdbImovinaVezaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiVezuImovine");
    	CmdbImovinaVezaVo res = (CmdbImovinaVezaVo)  execute(value);
    	return res;
     }
    public CmdbDobavljacRs procitajSveDobavljace(CmdbDobavljacVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveDobavljace");
    	CmdbDobavljacRs res = (CmdbDobavljacRs) executeQuery(value);
    	return res;
     }
    public CmdbDobavljacVo azurirajDobavljaca(CmdbDobavljacVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajDobavljaca");
    	CmdbDobavljacVo res = (CmdbDobavljacVo)  execute(value);
    	return res;
     }
    public CmdbDobavljacVo dodajDobavljaca(CmdbDobavljacVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajDobavljaca");
    	CmdbDobavljacVo res = (CmdbDobavljacVo)  execute(value);
    	return res;
     }
    public CmdbDobavljacVo brisiDobavljaca(CmdbDobavljacVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiDobavljaca");
    	CmdbDobavljacVo res = (CmdbDobavljacVo)  execute(value);
    	return res;
     }
    public CmdbMrezniCvorRs procitajSveDobavljace(CmdbMrezniCvorVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveDobavljace");
    	CmdbMrezniCvorRs res = (CmdbMrezniCvorRs) executeQuery(value);
    	return res;
     }
    public CmdbMrezniCvorVo azurirajDobavljaca(CmdbMrezniCvorVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajDobavljaca");
    	CmdbMrezniCvorVo res = (CmdbMrezniCvorVo)  execute(value);
    	return res;
     }
    public CmdbMrezniCvorVo dodajDobavljaca(CmdbMrezniCvorVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajDobavljaca");
    	CmdbMrezniCvorVo res = (CmdbMrezniCvorVo)  execute(value);
    	return res;
     }
    public CmdbMrezniCvorVo brisiDobavljaca(CmdbMrezniCvorVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiDobavljaca");
    	CmdbMrezniCvorVo res = (CmdbMrezniCvorVo)  execute(value);
    	return res;
     }
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
    //lookup kategorija imovine kratko
    public String getNazivZaKategorijuImovine(String sifra_mjesta){
	    return listajSveKategorijeImovine().rsReadNameForId(sifra_mjesta);
    }
    public String getSifruKategorijeImovineZaNaziv(String naziv){
	    return listajSveKategorijeImovine().rsReadIdForName(naziv);
    }
    public CmdbPromjenaRs procitajSvePromjene(CmdbPromjenaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSvePromjene");
    	CmdbPromjenaRs res = (CmdbPromjenaRs) executeQuery(value);
    	return res;
    }
    //org. jedinica
    public CmdbOrgJedinicaVo azurirajOrgJedinicu(CmdbOrgJedinicaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajOrgJedinicu");
    	CmdbOrgJedinicaVo res = (CmdbOrgJedinicaVo)  execute(value);
    	return res;
    }
    public CmdbOrgJedinicaVo dodajOrgJedinicu(CmdbOrgJedinicaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajOrgJedinicu");
    	CmdbOrgJedinicaVo res = (CmdbOrgJedinicaVo)  execute(value);
    	return res;
    }
    public CmdbOrgJedinicaVo brisiOrgJedinicu(CmdbOrgJedinicaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiOrgJedinicu");
    	CmdbOrgJedinicaVo res = (CmdbOrgJedinicaVo)  execute(value);
    	return res;
    }
    public AS2RecordList listajSvePoslovnice() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSvePoslovnice");
	    AS2RecordList rs = null;//NE RADI KES ZBOG IZMJENA ORG. JED. (J2EEResultSet)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSvePoslovnice");
		    addToCache("listajSvePoslovnice", rs);
		}
		return rs;
    }
    public String getNazivZaSifruPoslovnice(String sifra_poslovnice){
	    return listajSvePoslovnice().rsReadNameForId(sifra_poslovnice);
    }
    public String getSifruPoslovniceZaNaziv(String naziv){
	    return listajSvePoslovnice().rsReadIdForName(naziv);
    }
	public AS2RecordList listajSveKorisnickeAplikacije() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveKorisnickeAplikacije");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveKorisnickeAplikacije");
		    addToCache("listajSveKorisnickeAplikacije", rs);
		}
		return rs;
	}
	public String getNazivZaKorisnickuAplikacije(String sifra){
	    return listajSveKorisnickeAplikacije().rsReadNameForId(sifra);
    }
    public String getSifruKorisnickeAplikacijeZaNaziv(String naziv){
	    return listajSveKorisnickeAplikacije().rsReadIdForName(naziv);
    }	
}