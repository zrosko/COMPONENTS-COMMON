package hr.adriacomsoftware.app.common.rizik.izlozenost.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.rizik.izlozenost.dto.KrTransakcijaRs;
import hr.adriacomsoftware.app.common.rizik.izlozenost.dto.KrTransakcijaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class IzlozenostFacadeProxy extends AS2FacadeProxy implements IzlozenostFacade {
    private static IzlozenostFacadeProxy _instance = null;
    private IzlozenostFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.rizik.izlozenost.facade.IzlozenostFacadeServer");
    }
    public static IzlozenostFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new IzlozenostFacadeProxy();
        return _instance;
    }
    public KrTransakcijaRs procitajIzlozenosti(KrTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajIzlozenosti");
        KrTransakcijaRs res = (KrTransakcijaRs) executeQuery(value);
        return res;
    }
    public KrTransakcijaRs pronadiIzlozenosti(KrTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiIzlozenosti");
        KrTransakcijaRs res = (KrTransakcijaRs) executeQuery(value);
        return res;
    }
    public KrTransakcijaRs procitajZaduzenostiOsobe(KrTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajZaduzenostiOsobe");
        KrTransakcijaRs res = (KrTransakcijaRs) executeQuery(value);
        return res;
    }
    public KrTransakcijaRs procitajZaduzenostiNaplate(KrTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajZaduzenostiNaplate");
        KrTransakcijaRs res = (KrTransakcijaRs) executeQuery(value);
        return res;
    }
    public KrTransakcijaRs procitajPragMaterijalnostiPO(KrTransakcijaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajPragMaterijalnostiPO");
        KrTransakcijaRs res = (KrTransakcijaRs) executeQuery(value);
        return res;
    }
    public OsnovniRs procitajJamstveniKapital(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("procitajJamstveniKapital");
        OsnovniRs res = (OsnovniRs) executeQuery(value);
        return res;
    }
}