package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.facade;


import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto.ZahNalogObavijestRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto.ZahNalogObavijestVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto.ZahNalogPartijeRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto.ZahNalogPartijeVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class NalogOtvaranjaPartijeFacadeProxy extends AS2FacadeProxy implements NalogOtvaranjaPartijeFacade {

    private static NalogOtvaranjaPartijeFacadeProxy _instance = null;

    private NalogOtvaranjaPartijeFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.zahtjev.partija.facade.NalogOtvaranjaPartijeFacadeServer");
    }

    public static NalogOtvaranjaPartijeFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new NalogOtvaranjaPartijeFacadeProxy();
        return _instance;
    }
    public ZahNalogPartijeRs procitajSveNaloge(ZahNalogPartijeVo value) throws AS2Exception {      
        value.setRemoteMethod("procitajSveNaloge");
        ZahNalogPartijeRs res = (ZahNalogPartijeRs) executeQuery(value);
		return res;
    }

    public ZahNalogPartijeRs pronadiNaloge(ZahNalogPartijeVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiNaloge");
        ZahNalogPartijeRs res = (ZahNalogPartijeRs) executeQuery(value);
		return res;
    }

    public ZahNalogPartijeVo azurirajNalog(ZahNalogPartijeVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajNalog");
    	ZahNalogPartijeVo res = (ZahNalogPartijeVo) execute(value);
    	return res;
    }

    public ZahNalogPartijeVo dodajNalog(ZahNalogPartijeVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajNalog");
    	ZahNalogPartijeVo res = (ZahNalogPartijeVo) execute(value);
    	return res;
    }

    public ZahNalogPartijeVo brisiNalog(ZahNalogPartijeVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiNalog");
    	ZahNalogPartijeVo res = (ZahNalogPartijeVo) execute(value);
    	return res;
    }
    //obavijest
    public ZahNalogObavijestVo azurirajObavijestNaloga(ZahNalogObavijestVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajObavijestNaloga");
        ZahNalogObavijestVo res = (ZahNalogObavijestVo) execute(value);
		return res;
    }

    public ZahNalogObavijestRs procitajSveObavijestiNaloga(ZahNalogObavijestVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveObavijestiNaloga");
        ZahNalogObavijestRs res = (ZahNalogObavijestRs) executeQuery(value);
		return res;
    }

    public ZahNalogObavijestVo dodajObavijestNaloga(ZahNalogObavijestVo value) throws AS2Exception {
        value.setRemoteMethod("dodajObavijestNaloga");
        ZahNalogObavijestVo res = (ZahNalogObavijestVo) execute(value);
		return res;
    }

    public ZahNalogObavijestVo brisiObavijestNaloga(ZahNalogObavijestVo value) throws AS2Exception {
        value.setRemoteMethod("brisiObavijestNaloga");
        ZahNalogObavijestVo res = (ZahNalogObavijestVo) execute(value);
		return res;
    }

    public ZahNalogObavijestVo brisiViseObavijestiNaloga(ZahNalogObavijestRs value) throws AS2Exception {
        value.setRemoteMethod("brisiViseObavijestiNaloga");
        ZahNalogObavijestVo res = (ZahNalogObavijestVo) execute(value);
		return res;
    }
}