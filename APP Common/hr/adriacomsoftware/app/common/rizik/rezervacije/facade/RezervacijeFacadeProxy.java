package hr.adriacomsoftware.app.common.rizik.rezervacije.facade;

import hr.adriacomsoftware.app.common.rizik.rezervacije.dto.RezervacijaRs;
import hr.adriacomsoftware.app.common.rizik.rezervacije.dto.RezervacijaVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class RezervacijeFacadeProxy extends AS2FacadeProxy implements RezervacijeFacade {
    private static RezervacijeFacadeProxy _instance = null;
    private RezervacijeFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.rizik.rezervacije.facade.RezervacijeFacadeServer");
    }
    public static RezervacijeFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new RezervacijeFacadeProxy();
        return _instance;
    }
    public RezervacijaRs procitajRezervacije(RezervacijaVo value) throws AS2Exception {
        value.setRemoteMethod("procitajRezervacije");
        RezervacijaRs res = (RezervacijaRs) executeQuery(value);
        return res;
    }
    public RezervacijaRs pronadiRezervacije(RezervacijaVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiRezervacije");
        RezervacijaRs res = (RezervacijaRs) executeQuery(value);
        return res;
    }
}