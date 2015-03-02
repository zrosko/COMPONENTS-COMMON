package hr.adriacomsoftware.app.common.obrtnici.bonitet.facade;

import hr.adriacomsoftware.app.common.obrtnici.bonitet.dto.BonitetObrtnikRs;
import hr.adriacomsoftware.app.common.obrtnici.bonitet.dto.BonitetObrtnikVo;
import hr.adriacomsoftware.app.common.pravneosobe.obrasci.dto.VikrStavkaRs;
import hr.adriacomsoftware.app.common.pravneosobe.obrasci.dto.VikrStavkaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class BonitetObrtnikFacadeProxy extends AS2FacadeProxy implements BonitetObrtnikFacade {
    private static BonitetObrtnikFacadeProxy _instance = null;
    private BonitetObrtnikFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.obrtnici.bonitet.facade.BonitetObrtnikFacadeServer");
    }
    public static BonitetObrtnikFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new BonitetObrtnikFacadeProxy();
        return _instance;
    }
    public BonitetObrtnikRs citajSveBonitete(BonitetObrtnikVo value) throws AS2Exception {
        value.setRemoteMethod("citajSveBonitete");
        BonitetObrtnikRs res = (BonitetObrtnikRs) executeQuery(value);
        return res;
    }
    public BonitetObrtnikRs pronadiSveBonitete(BonitetObrtnikVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSveBonitete");
        BonitetObrtnikRs res = (BonitetObrtnikRs) executeQuery(value);
        return res;
    }
    public BonitetObrtnikRs citajSveBoniteteZaObrtnika(BonitetObrtnikVo value) throws AS2Exception {
        value.setRemoteMethod("citajSveBoniteteZaObrtnika");
        BonitetObrtnikRs res = (BonitetObrtnikRs) executeQuery(value);
        return res;
    }
    public BonitetObrtnikVo dodajBonitet(BonitetObrtnikVo value) throws AS2Exception {
        value.setRemoteMethod("dodajBonitet");
        BonitetObrtnikVo res = (BonitetObrtnikVo) execute(value);
        return res;
    }
    public BonitetObrtnikVo azurirajBonitet(BonitetObrtnikVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajBonitet");
        BonitetObrtnikVo res = (BonitetObrtnikVo) execute(value);
        return res;
    }
    public BonitetObrtnikVo brisiBonitet(BonitetObrtnikVo value) throws AS2Exception {
        value.setRemoteMethod("brisiBonitet");
        BonitetObrtnikVo res = (BonitetObrtnikVo) execute(value);
        return res;
    }
    // VIKR obrazac
    public VikrStavkaRs citajSveVikrZaKlijenta(VikrStavkaVo value) throws AS2Exception {
        value.setRemoteMethod("citajSveVikrZaKlijenta");
        VikrStavkaRs res = (VikrStavkaRs) executeQuery(value);
        return res;
    }
    public VikrStavkaVo dodajVikrZaKlijenta(VikrStavkaVo value) throws AS2Exception {
        value.setRemoteMethod("dodajVikrZaKlijenta");
        VikrStavkaVo res = (VikrStavkaVo) execute(value);
        return res;
    }
    public VikrStavkaVo azurirajVikrZaKlijenta(VikrStavkaVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajVikrZaKlijenta");
        VikrStavkaVo res = (VikrStavkaVo) execute(value);
        return res;
    }
    public VikrStavkaVo brisiVikrZaKlijenta(VikrStavkaVo value) throws AS2Exception {
        value.setRemoteMethod("brisiVikrZaKlijenta");
        VikrStavkaVo res = (VikrStavkaVo) execute(value);
        return res;
    }
}