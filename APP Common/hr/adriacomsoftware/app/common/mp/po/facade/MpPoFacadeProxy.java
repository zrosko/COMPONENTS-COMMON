package hr.adriacomsoftware.app.common.mp.po.facade;


import hr.adriacomsoftware.app.common.mp.po.dto.MpPoOsobaRs;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoOsobaVo;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoPartijaRs;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoPartijaVo;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoPrometRs;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoPrometVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class MpPoFacadeProxy extends AS2FacadeProxy implements MpPoFacade {

    private static MpPoFacadeProxy _instance = null;

    private MpPoFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.mp.po.facade.MpPoFacadeServer");
    }

    public static MpPoFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new MpPoFacadeProxy();
        return _instance;
    }

    /************* FACADE PROXY  mp_po_osoba ************/

    public MpPoOsobaVo brisiMpPoOsoba(MpPoOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMpPoOsoba");
    	MpPoOsobaVo res = (MpPoOsobaVo) execute(value);
    	return res;
    }
    public MpPoOsobaVo dodajMpPoOsoba(MpPoOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMpPoOsoba");
    	MpPoOsobaVo res = (MpPoOsobaVo) execute(value);
    	return res;
    }
    public MpPoOsobaVo azurirajMpPoOsoba(MpPoOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMpPoOsoba");
    	MpPoOsobaVo res = (MpPoOsobaVo) execute(value);
    	return res;
    }
    public MpPoOsobaRs procitajSveMpPoOsoba(MpPoOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpPoOsoba");
    	MpPoOsobaRs res = (MpPoOsobaRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMpPoOsoba() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMpPoOsoba");
    	return res;
    }
    public MpPoOsobaRs pretraziMpPoOsoba(MpPoOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziSveMpPoOsoba");
    	MpPoOsobaRs res = (MpPoOsobaRs) executeQuery(value);
    	return res;
    }
    

    /************* FACADE PROXY  mp_po_partija ************/

    public MpPoPartijaVo brisiMpPoPartija(MpPoPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMpPoPartija");
    	MpPoPartijaVo res = (MpPoPartijaVo) execute(value);
    	return res;
    }
    public MpPoPartijaVo dodajMpPoPartija(MpPoPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMpPoPartija");
    	MpPoPartijaVo res = (MpPoPartijaVo) execute(value);
    	return res;
    }
    public MpPoPartijaVo azurirajMpPoPartija(MpPoPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMpPoPartija");
    	MpPoPartijaVo res = (MpPoPartijaVo) execute(value);
    	return res;
    }
    public MpPoPartijaRs procitajSveMpPoPartija(MpPoPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpPoPartija");
    	MpPoPartijaRs res = (MpPoPartijaRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMpPoPartija() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMpPoPartija");
    	return res;
    }
    public MpPoPartijaRs pretraziMpPoPartija(MpPoPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziSveMpPoPartija");
    	MpPoPartijaRs res = (MpPoPartijaRs) executeQuery(value);
    	return res;
    }
    public MpPoPartijaVo provjeriMpPoPartija(MpPoPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("provjeriMpPoPartija");
    	MpPoPartijaVo res = (MpPoPartijaVo) execute(value);
    	return res;
    }
    

    
    /************* FACADE PROXY  mp_po_promet ************/

    public MpPoPrometVo brisiMpPoPromet(MpPoPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMpPoPromet");
    	MpPoPrometVo res = (MpPoPrometVo) execute(value);
    	return res;
    }
    public MpPoPrometVo dodajMpPoPromet(MpPoPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMpPoPromet");
    	MpPoPrometVo res = (MpPoPrometVo) execute(value);
    	return res;
    }
    public MpPoPrometVo azurirajMpPoPromet(MpPoPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMpPoPromet");
    	MpPoPrometVo res = (MpPoPrometVo) execute(value);
    	return res;
    }
    public MpPoPrometRs procitajSveMpPoPromet(MpPoPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpPoPromet");
    	MpPoPrometRs res = (MpPoPrometRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMpPoPromet() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMpPoPromet");
    	return res;
    }
    public MpPoPrometRs pretraziMpPoPromet(MpPoPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziMpPoPromet");
    	MpPoPrometRs res = (MpPoPrometRs) executeQuery(value);
    	return res;
    }
    public MpPoPrometRs procitajSveMpPoPrometGrupno(MpPoPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpPoPrometGrupno");
    	MpPoPrometRs res = (MpPoPrometRs) executeQuery(value);
    	return res;
    }
    public MpPoPrometRs pretraziMpPoPrometGrupno(MpPoPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziMpPoPrometGrupno");
    	MpPoPrometRs res = (MpPoPrometRs) executeQuery(value);
    	return res;
    }

	public void proknjiziMpPoPromet(MpPoPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("proknjiziMpPoPromet");
    	/*MpPoPrometVo res = (MpPoPrometVo)*/ execute(value);
	}

	public MpPoPrometVo validate(MpPoPrometVo value) throws AS2Exception {
		value.setRemoteMethod("validate");
		MpPoPrometVo res = (MpPoPrometVo) execute(value);
    	return res;
	}

	public MpPoPrometRs izvjestaji(MpPoPrometVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestaji");
		MpPoPrometRs res = (MpPoPrometRs) executeQuery(value);
    	return res;
	}
}