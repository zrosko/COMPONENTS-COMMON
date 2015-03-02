package hr.adriacomsoftware.app.common.obrtnici.zahtjev.facade;


import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZahtjevPravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZahtjevPravnaOsobaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class ZahtjevObrtniciFacadeProxy extends AS2FacadeProxy implements ZahtjevObrtniciFacade {

    private static ZahtjevObrtniciFacadeProxy _instance = null;

    private ZahtjevObrtniciFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.obrtnici.zahtjev.facade.ZahtjevObrtniciFacadeServer");
    }

    public static ZahtjevObrtniciFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new ZahtjevObrtniciFacadeProxy();
        return _instance;
    }
    public ZahtjevPravnaOsobaRs citajSveZahtjeve(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSveZahtjeve");
		ZahtjevPravnaOsobaRs res = (ZahtjevPravnaOsobaRs) executeQuery(value);
		return res;
    }
    public ZahtjevPravnaOsobaRs pronadiSveZahtjeve(ZahtjevPravnaOsobaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveZahtjeve");
		ZahtjevPravnaOsobaRs res = (ZahtjevPravnaOsobaRs) executeQuery(value);
		return res;
    }
}