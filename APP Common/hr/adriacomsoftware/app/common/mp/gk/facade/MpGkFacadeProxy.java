package hr.adriacomsoftware.app.common.mp.gk.facade;


import hr.adriacomsoftware.app.common.mp.gk.dto.MpGkKnjizenjaRs;
import hr.adriacomsoftware.app.common.mp.gk.dto.MpGkKnjizenjaVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class MpGkFacadeProxy extends AS2FacadeProxy implements MpGkFacade {

    private static MpGkFacadeProxy _instance = null;

    private MpGkFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.mp.gk.facade.MpGkFacadeServer");
    }

    public static MpGkFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new MpGkFacadeProxy();
        return _instance;
    }

    /************* FACADE PROXY  mp_gr_promet ************/

    public MpGkKnjizenjaVo brisiMpGkKnjizenja(MpGkKnjizenjaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMpGkKnjizenja");
    	MpGkKnjizenjaVo res = (MpGkKnjizenjaVo) execute(value);
    	return res;
    }
    public MpGkKnjizenjaVo dodajMpGkKnjizenja(MpGkKnjizenjaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMpGkKnjizenja");
    	MpGkKnjizenjaVo res = (MpGkKnjizenjaVo) execute(value);
    	return res;
    }
    public MpGkKnjizenjaVo azurirajMpGkKnjizenja(MpGkKnjizenjaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMpGkKnjizenja");
    	MpGkKnjizenjaVo res = (MpGkKnjizenjaVo) execute(value);
    	return res;
    }
    public MpGkKnjizenjaRs procitajSveMpGkKnjizenja(MpGkKnjizenjaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpGkKnjizenja");
    	MpGkKnjizenjaRs res = (MpGkKnjizenjaRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMpGkKnjizenja() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMpGkKnjizenja");
    	return res;
    }
    public MpGkKnjizenjaRs pretraziMpGkKnjizenja(MpGkKnjizenjaVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziMpGkKnjizenja");
    	MpGkKnjizenjaRs res = (MpGkKnjizenjaRs) executeQuery(value);
    	return res;
    }
    public MpGkKnjizenjaRs procitajSveMpGkKnjizenjaGrupno(MpGkKnjizenjaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMpGkKnjizenjaGrupno");
    	MpGkKnjizenjaRs res = (MpGkKnjizenjaRs) executeQuery(value);
    	return res;
    }
    public MpGkKnjizenjaRs pretraziMpGkKnjizenjaGrupno(MpGkKnjizenjaVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziMpGkKnjizenjaGrupno");
    	MpGkKnjizenjaRs res = (MpGkKnjizenjaRs) executeQuery(value);
    	return res;
    }

	public void proknjiziMpGkKnjizenja(MpGkKnjizenjaVo value) throws AS2Exception {
    	value.setRemoteMethod("proknjiziMpGkKnjizenja");
    	/*MpGkKnjizenjaVo res = (MpGkKnjizenjaVo)*/ execute(value);
	}

	public MpGkKnjizenjaVo validate(MpGkKnjizenjaVo value) throws AS2Exception {
		value.setRemoteMethod("validate");
		MpGkKnjizenjaVo res = (MpGkKnjizenjaVo) execute(value);
    	return res;
	}

	public MpGkKnjizenjaRs izvjestaji(MpGkKnjizenjaVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestaji");
		MpGkKnjizenjaRs res = (MpGkKnjizenjaRs) executeQuery(value);
    	return res;
	}
}