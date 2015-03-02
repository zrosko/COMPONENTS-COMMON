package hr.adriacomsoftware.app.common.gradani.facade;


import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.dto.OsobaVo;
import hr.adriacomsoftware.app.common.gradani.dto.VezanaOsobaRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class GradaniFacadeProxy extends AS2FacadeProxy implements GradaniFacade {

    private static GradaniFacadeProxy _instance = null;

    private GradaniFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.gradani.facade.GradaniFacadeServer");
    }

    public static GradaniFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new GradaniFacadeProxy();
        return _instance;
    }

    public PartijaRs citajSvePartijeOsobe(OsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePartijeOsobe");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }
    public PartijaRs citajSvePovezenePartijeOsobe(OsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePovezenePartijeOsobe");
		PartijaRs res = (PartijaRs) executeQuery(value);
		return res;
    }

    public VezanaOsobaRs citajSvePovezaneOsobeOsobe(OsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvePovezaneOsobeOsobe");
		VezanaOsobaRs res = (VezanaOsobaRs) executeQuery(value);
		return res;
    }

    public OsobaRs citajPodatkeKlijenta(OsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajPodatkeKlijenta");
		OsobaRs res = (OsobaRs) executeQuery(value);
		return res;
    }

	public OsnovniRs citajPrometeOsobe(OsnovniVo value) throws AS2Exception {
		value.setRemoteMethod("citajPrometeOsobe");
		OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
	}
}