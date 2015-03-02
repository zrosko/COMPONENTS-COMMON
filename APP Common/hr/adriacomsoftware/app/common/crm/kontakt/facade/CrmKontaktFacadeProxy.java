package hr.adriacomsoftware.app.common.crm.kontakt.facade;

import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktAktivnostRs;
import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktAktivnostVo;
import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktPredmetRs;
import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktPredmetVo;
import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktPrivitakVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class CrmKontaktFacadeProxy extends AS2FacadeProxy implements CrmKontaktFacade {

    private static CrmKontaktFacadeProxy _instance = null;

    private CrmKontaktFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.crm.kontakt.facade.CrmKontaktFacadeServer");
    }

    public static CrmKontaktFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new CrmKontaktFacadeProxy();
        return _instance;
    }


	/************* FACADE PROXY  kontakt_predmet ************/
	
	public KontaktPredmetVo brisiKontaktPredmet(KontaktPredmetVo value) throws AS2Exception {
		value.setRemoteMethod("brisiKontaktPredmet");
		KontaktPredmetVo res = (KontaktPredmetVo) execute(value);
		return res;
	}
	public KontaktPredmetVo dodajKontaktPredmet(KontaktPredmetVo value) throws AS2Exception {
		value.setRemoteMethod("dodajKontaktPredmet");
		KontaktPredmetVo res = (KontaktPredmetVo) execute(value);
		return res;
	}
	public KontaktPredmetVo azurirajKontaktPredmet(KontaktPredmetVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKontaktPredmet");
		KontaktPredmetVo res = (KontaktPredmetVo) execute(value);
		return res;
	}
	public KontaktPredmetRs procitajSveKontaktPredmet(KontaktPredmetVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveKontaktPredmet");
		KontaktPredmetRs res = (KontaktPredmetRs) executeQuery(value);
		return res;
	}
	public AS2RecordList listajSveKontaktPredmet() throws AS2Exception {
		AS2RecordList res = (AS2RecordList) executeQuery("listajSveKontaktPredmet");
		return res;
	}
	public KontaktPredmetRs pretraziKontaktPredmet(KontaktPredmetVo value) throws AS2Exception {
		value.setRemoteMethod("pretraziKontaktPredmet");
		KontaktPredmetRs res = (KontaktPredmetRs) executeQuery(value);
		return res;
	}

	

	/************* FACADE PROXY  kontakt_aktivnost ************/

	public KontaktAktivnostVo brisiKontaktAktivnost(KontaktAktivnostVo value) throws AS2Exception {
		value.setRemoteMethod("brisiKontaktAktivnost");
		KontaktAktivnostVo res = (KontaktAktivnostVo) execute(value);
		return res;
	}
	public KontaktAktivnostVo dodajKontaktAktivnost(KontaktAktivnostVo value) throws AS2Exception {
		value.setRemoteMethod("dodajKontaktAktivnost");
		KontaktAktivnostVo res = (KontaktAktivnostVo) execute(value);
		return res;
	}
	public KontaktAktivnostVo azurirajKontaktAktivnost(KontaktAktivnostVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKontaktAktivnost");
		KontaktAktivnostVo res = (KontaktAktivnostVo) execute(value);
		return res;
	}
	public KontaktAktivnostRs procitajSveKontaktAktivnost(KontaktAktivnostVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveKontaktAktivnost");
		KontaktAktivnostRs res = (KontaktAktivnostRs) executeQuery(value);
		return res;
	}
	public AS2RecordList listajSveKontaktAktivnost() throws AS2Exception {
		AS2RecordList res = (AS2RecordList) executeQuery("listajSveKontaktAktivnost");
		return res;
	}
	public KontaktAktivnostRs pretraziKontaktAktivnost(KontaktAktivnostVo value) throws AS2Exception {
		value.setRemoteMethod("pretraziKontaktAktivnost");
		KontaktAktivnostRs res = (KontaktAktivnostRs) executeQuery(value);
		return res;
	}



	/************* FACADE PROXY  kontakt_privitak ************/

	public KontaktPrivitakVo dodajPrivitak(KontaktPrivitakVo value) throws AS2Exception {
		value.setRemoteMethod("dodajPrivitak");
		KontaktPrivitakVo res = (KontaktPrivitakVo) execute(value);
    	return res;
    }
    public KontaktPrivitakVo citajPrivitak(KontaktPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrivitak");
    	KontaktPrivitakVo res = (KontaktPrivitakVo) execute(value);
    	return res;
    }
    public KontaktPrivitakVo brisiPrivitak(KontaktPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiPrivitak");
    	KontaktPrivitakVo res = (KontaktPrivitakVo) execute(value);
    	return res;
    }

	
	/************* FACADE PROXY  zajednicko ************/
	
	public OsnovniRs procitajCrmKontaktSifre(OsnovniVo value)
			throws AS2Exception {
		value.setRemoteMethod("procitajCrmKontaktSifre");
		value.setCacheKey("kategorija", value.get("kategorija"));
		OsnovniRs rs = (OsnovniRs) getQueryFromCache(value);

		if (rs == null) {

			rs = (OsnovniRs) executeQuery(value);
			addToCache(value.getRemoteMethod()+value.getCacheKey(), rs);
		}

		AS2RecordList rs_upit = rs.doSearch("vrsta", "=", value.get("vrsta"));

		return new OsnovniRs(rs_upit);

	}

	public OsnovniRs izvjestaji(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("izvjestaji");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
	}	
}