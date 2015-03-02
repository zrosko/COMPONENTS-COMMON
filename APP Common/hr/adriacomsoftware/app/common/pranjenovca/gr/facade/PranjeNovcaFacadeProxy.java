package hr.adriacomsoftware.app.common.pranjenovca.gr.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.dto.OsobaVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnFizickaOsobaRs;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnFizickaOsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnGrRacunRs;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnGrRacunVo;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnPoliticarVo;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnPrivitakRs;
import hr.adriacomsoftware.app.common.pranjenovca.gr.dto.PrnPrivitakVo;
import hr.as2.inf.common.core.AS2Helper;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class PranjeNovcaFacadeProxy extends AS2FacadeProxy implements PranjeNovcaFacade {

    private static PranjeNovcaFacadeProxy _instance = null;

    private PranjeNovcaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pranjenovca.gr.facade.PranjeNovcaFacadeServer");
    }

    public static PranjeNovcaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new PranjeNovcaFacadeProxy();
        return _instance;
    }
    //PDF - ova metoda nije u PranjeNovcaFacade inteface-u
    public byte[] izvjestajiFizickeOsobePDF(AS2Record value) throws AS2Exception {
		value.setRemoteMethod("izvjestajiFizickeOsobe");
		StringBuffer _url = new StringBuffer();
		//_url.append("http://192.168.0.225:8080/adriacom_sspn_1102/front?fileName=");
		_url.append("http://"+AS2Helper.getHost()+":8080/adriacom_sspn_1102/front?fileName=");
		_url.append(value.get("fileName"));
		_url.append("&fileLocation=C:\\Program%20Files%20(x86)\\Apache%20Software%20Foundation\\Tomcat%208.0\\webapps\\ROOT\\PDF\\");
		_url.append("&@@component=");
		_url.append(_component);
		_url.append("&@@service=");
		_url.append("izvjestajiFizickeOsobe");
		_url.append("&@@transform_to=");
		_url.append("hr.adriacomsoftware.app.common.gradani.dto.OsobaVo");
		_url.append("&id_upitnika=");
		_url.append(value.get("id_upitnika"));
		_url.append("&org_jedinica=");
		_url.append(value.get("org_jedinica"));
		_url.append("&@@report_selected=");
		_url.append(value.get("@izvjestaj"));
		_url.append("&@@Output=File");
		value.set("@@URL", _url.toString());
		byte[] ret = executeGetFile(value);
        return ret;
	}
    //fizička osoba
    public OsobaRs procitajSveOsobe(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveOsobe");
    	OsobaRs res = (OsobaRs) executeQuery(value);
    	return res;
    }
    public OsobaRs pronadiOsobe(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiOsobe");
    	OsobaRs res = (OsobaRs) executeQuery(value);
    	return res;
    } 
    public OsobaRs izvjestajiFizickeOsobe(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("izvjestajiFizickeOsobe");
    	OsobaRs res = (OsobaRs) executeQuery(value);
    	return res;
    } 
    //račun
    public PrnGrRacunVo citajRacun(PrnGrRacunVo value) throws AS2Exception {
    	value.setRemoteMethod("citajRacun");
    	PrnGrRacunVo res = (PrnGrRacunVo) execute(value);
    	return res;
    }
    public PrnGrRacunVo azurirajRacun(PrnGrRacunVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajRacun");
    	PrnGrRacunVo res = (PrnGrRacunVo)  execute(value);
    	return res;
    }
    public PrnGrRacunVo dodajRacun(PrnGrRacunVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajRacun");
    	PrnGrRacunVo res = (PrnGrRacunVo)  execute(value);
    	return res;
    }
    public PrnGrRacunRs listaRacuna(PrnGrRacunVo value) throws AS2Exception {
    	value.setRemoteMethod("listaRacuna");
    	PrnGrRacunRs res = (PrnGrRacunRs)  executeQuery(value);
    	return res;
    }
    //političar
    public PrnPoliticarVo citajPoliticara(PrnPoliticarVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPoliticara");
    	PrnPoliticarVo res = (PrnPoliticarVo) execute(value);
    	return res;
    }
    public PrnPoliticarVo azurirajPoliticara(PrnPoliticarVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajPoliticara");
    	PrnPoliticarVo res = (PrnPoliticarVo)  execute(value);
    	return res;
    }
    public PrnPoliticarVo dodajPoliticara(PrnPoliticarVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPoliticara");
    	PrnPoliticarVo res = (PrnPoliticarVo)  execute(value);
    	return res;
    }
    //upitnik
    public PrnFizickaOsobaRs procitajSveUpitnike(PrnFizickaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveUpitnike");
    	PrnFizickaOsobaRs res = (PrnFizickaOsobaRs) executeQuery(value);
    	return res;
     }
    public PrnFizickaOsobaVo citajUpitnik(PrnFizickaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("citajUpitnik");
    	PrnFizickaOsobaVo res = (PrnFizickaOsobaVo) execute(value);
    	return res;
    }
    public PrnFizickaOsobaRs pronadiUpitnike(PrnFizickaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pronadiUpitnike");
    	PrnFizickaOsobaRs res = (PrnFizickaOsobaRs) executeQuery(value);
    	return res;
     }
    public PrnFizickaOsobaVo azurirajUpitnik(PrnFizickaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajUpitnik");
    	PrnFizickaOsobaVo res = (PrnFizickaOsobaVo)  execute(value);
    	return res;
     }
    public PrnFizickaOsobaVo dodajUpitnik(PrnFizickaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajUpitnik");
    	PrnFizickaOsobaVo res = (PrnFizickaOsobaVo)  execute(value);
    	return res;
     }
    public PrnFizickaOsobaVo brisiUpitnik(PrnFizickaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiUpitnik");
    	PrnFizickaOsobaVo res = (PrnFizickaOsobaVo)  execute(value);
    	return res;
     }
    public PrnFizickaOsobaVo ucitajUpitnik(PrnFizickaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("ucitajUpitnik");
    	PrnFizickaOsobaVo res = (PrnFizickaOsobaVo) execute(value);
    	return res;
    }
    //privitak
    public PrnPrivitakRs procitajSvePrivitke(PrnPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePrivitke");
    	PrnPrivitakRs res = (PrnPrivitakRs) executeQuery(value);
    	return res;
     }
    public PrnPrivitakVo dodajPrivitak(PrnPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPrivitak");
    	PrnPrivitakVo res = (PrnPrivitakVo)  execute(value);
    	return res;
     }
    public PrnPrivitakVo citajPrivitak(PrnPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrivitak");
    	PrnPrivitakVo res = (PrnPrivitakVo)  execute(value);
    	return res;
     }
    public PrnPrivitakVo brisiPrivitak(PrnPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPrivitak");
    	PrnPrivitakVo res = (PrnPrivitakVo)  execute(value);
    	return res;
     }

    public PrnFizickaOsobaVo azurirajZavrsnePodatkeUpitnika(PrnFizickaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajZavrsnePodatkeUpitnika");
    	PrnFizickaOsobaVo res = (PrnFizickaOsobaVo)  execute(value);
    	return res;
    }
    public PrnFizickaOsobaRs dubinskaAnalizaOsobe(OsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dubinskaAnalizaOsobe");
    	PrnFizickaOsobaRs res = (PrnFizickaOsobaRs) executeQuery(value);
    	return res;
    }
    public PrnFizickaOsobaRs dubinskaAnalizaSvihOsoba(OsobaVo value) throws AS2Exception {
        value.setRemoteMethod("dubinskaAnalizaSvihOsoba");
        PrnFizickaOsobaRs res = (PrnFizickaOsobaRs) executeQuery(value);
    	return res;
    }
	public AS2RecordList izvjestajSwiftTransakcijeDrzavaCrnaLista(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("izvjestajSwiftTransakcijeDrzavaCrnaLista");
        AS2RecordList res = (AS2RecordList) executeQuery(value);
    	return res;
	}
	
	/************* FACADE PROXY  zajednicko ************/
	
	public OsnovniRs procitajPrnSifre(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("procitajPrnSifre");
		value.setCacheKey("izvor", value.get("izvor"));
		OsnovniRs rs = (OsnovniRs) getQueryFromCache(value);

		if (rs == null) {

			rs = (OsnovniRs) executeQuery(value);
			addToCache(value.getRemoteMethod()+value.getCacheKey(), rs);
		}

		AS2RecordList rs_upit = rs.doSearch("vrsta", "=", value.get("vrsta"));

		return new OsnovniRs(rs_upit);

	}
}