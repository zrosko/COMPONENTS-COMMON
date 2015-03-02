package hr.adriacomsoftware.app.common.mp.gr.facade;


import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrOsobaRs;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrOsobaVo;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrPartijaRs;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrPartijaVo;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrPrometRs;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrPrometVo;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrVezanaOsobaRs;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrVezanaOsobaVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class MpGrFacadeProxy extends AS2FacadeProxy implements MpGrFacade {

    private static MpGrFacadeProxy _instance = null;

    private MpGrFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.mp.gr.facade.MpGrFacadeServer");
    }

    public static MpGrFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new MpGrFacadeProxy();
        return _instance;
    }

    /************* FACADE PROXY  mp_gr_osoba ************/

    public MpGrOsobaVo brisiMpGrOsoba(MpGrOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMpGrOsoba");
    	MpGrOsobaVo res = (MpGrOsobaVo) execute(value);
    	return res;
    }
    public MpGrOsobaVo dodajMpGrOsoba(MpGrOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMpGrOsoba");
    	MpGrOsobaVo res = (MpGrOsobaVo) execute(value);
    	return res;
    }
    public MpGrOsobaVo azurirajMpGrOsoba(MpGrOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMpGrOsoba");
    	MpGrOsobaVo res = (MpGrOsobaVo) execute(value);
    	return res;
    }
    public MpGrOsobaRs procitajSveMpGrOsoba(MpGrOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpGrOsoba");
    	MpGrOsobaRs res = (MpGrOsobaRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMpGrOsoba() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMpGrOsoba");
    	return res;
    }
    public MpGrOsobaRs pretraziMpGrOsoba(MpGrOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziSveMpGrOsoba");
    	MpGrOsobaRs res = (MpGrOsobaRs) executeQuery(value);
    	return res;
    }
    

    /************* FACADE PROXY  mp_gr_partija ************/

    public MpGrPartijaVo brisiMpGrPartija(MpGrPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMpGrPartija");
    	MpGrPartijaVo res = (MpGrPartijaVo) execute(value);
    	return res;
    }
    public MpGrPartijaVo dodajMpGrPartija(MpGrPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMpGrPartija");
    	MpGrPartijaVo res = (MpGrPartijaVo) execute(value);
    	return res;
    }
    public MpGrPartijaVo azurirajMpGrPartija(MpGrPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMpGrPartija");
    	MpGrPartijaVo res = (MpGrPartijaVo) execute(value);
    	return res;
    }
    public MpGrPartijaRs procitajSveMpGrPartija(MpGrPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpGrPartija");
    	MpGrPartijaRs res = (MpGrPartijaRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMpGrPartija() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMpGrPartija");
    	return res;
    }
    public MpGrPartijaRs pretraziMpGrPartija(MpGrPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziSveMpGrPartija");
    	MpGrPartijaRs res = (MpGrPartijaRs) executeQuery(value);
    	return res;
    }
    public MpGrPartijaVo provjeriMpGrPartija(MpGrPartijaVo value) throws AS2Exception {
    	value.setRemoteMethod("provjeriMpGrPartija");
    	MpGrPartijaVo res = (MpGrPartijaVo) execute(value);
    	return res;
    }
    

    /************* FACADE PROXY  mp_gr_vezana_osoba ************/

    public MpGrVezanaOsobaVo brisiMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMpGrVezanaOsoba");
    	MpGrVezanaOsobaVo res = (MpGrVezanaOsobaVo) execute(value);
    	return res;
    }
    public MpGrVezanaOsobaVo dodajMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMpGrVezanaOsoba");
    	MpGrVezanaOsobaVo res = (MpGrVezanaOsobaVo) execute(value);
    	return res;
    }
    public MpGrVezanaOsobaVo azurirajMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMpGrVezanaOsoba");
    	MpGrVezanaOsobaVo res = (MpGrVezanaOsobaVo) execute(value);
    	return res;
    }
    public MpGrVezanaOsobaRs procitajSveMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpGrVezanaOsoba");
    	MpGrVezanaOsobaRs res = (MpGrVezanaOsobaRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMpGrVezanaOsoba() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMpGrVezanaOsoba");
    	return res;
    }
    public MpGrVezanaOsobaRs pretraziMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziSveMpGrVezanaOsoba");
    	MpGrVezanaOsobaRs res = (MpGrVezanaOsobaRs) executeQuery(value);
    	return res;
    }


    /************* FACADE PROXY  mp_gr_promet ************/

    public MpGrPrometVo brisiMpGrPromet(MpGrPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMpGrPromet");
    	MpGrPrometVo res = (MpGrPrometVo) execute(value);
    	return res;
    }
    public MpGrPrometVo dodajMpGrPromet(MpGrPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMpGrPromet");
    	MpGrPrometVo res = (MpGrPrometVo) execute(value);
    	return res;
    }
    public MpGrPrometVo azurirajMpGrPromet(MpGrPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMpGrPromet");
    	MpGrPrometVo res = (MpGrPrometVo) execute(value);
    	return res;
    }
    public MpGrPrometRs procitajSveMpGrPromet(MpGrPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpGrPromet");
    	MpGrPrometRs res = (MpGrPrometRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMpGrPromet() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMpGrPromet");
    	return res;
    }
    public MpGrPrometRs pretraziMpGrPromet(MpGrPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziMpGrPromet");
    	MpGrPrometRs res = (MpGrPrometRs) executeQuery(value);
    	return res;
    }
    public MpGrPrometRs procitajSveMpGrPrometGrupno(MpGrPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpGrPrometGrupno");
    	MpGrPrometRs res = (MpGrPrometRs) executeQuery(value);
    	return res;
    }
    public MpGrPrometRs pretraziMpGrPrometGrupno(MpGrPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziMpGrPrometGrupno");
    	MpGrPrometRs res = (MpGrPrometRs) executeQuery(value);
    	return res;
    }

	public void proknjiziMpGrPromet(MpGrPrometVo value) throws AS2Exception {
    	value.setRemoteMethod("proknjiziMpGrPromet");
    	/*MpGrPrometVo res = (MpGrPrometVo)*/ execute(value);
	}

	public MpGrPrometVo validate(MpGrPrometVo value) throws AS2Exception {
		value.setRemoteMethod("validate");
		MpGrPrometVo res = (MpGrPrometVo) execute(value);
    	return res;
	}

	public MpGrPrometRs izvjestaji(MpGrPrometVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestaji");
		MpGrPrometRs res = (MpGrPrometRs) executeQuery(value);
    	return res;
	}
}