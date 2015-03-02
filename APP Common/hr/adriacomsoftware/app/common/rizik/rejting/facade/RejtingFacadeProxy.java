package hr.adriacomsoftware.app.common.rizik.rejting.facade;

import hr.adriacomsoftware.app.common.rizik.rejting.dto.PokazateljOcjenaRs;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.PokazateljOcjenaVo;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.PokazateljRs;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.PokazateljVo;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.RejtingRs;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.RejtingVo;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.SkoringRs;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.SkoringVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class RejtingFacadeProxy extends AS2FacadeProxy implements RejtingFacade {
    private static RejtingFacadeProxy _instance = null;
    private RejtingFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.rizik.rejting.facade.RejtingFacadeServer");
    }
    public static RejtingFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new RejtingFacadeProxy();
        return _instance;
    }
    public RejtingRs procitajRejtingPravnihOsoba(RejtingVo value) throws AS2Exception {
        value.setRemoteMethod("procitajRejtingPravnihOsoba");
        RejtingRs res = (RejtingRs) executeQuery(value);
        return res;
    }
    public RejtingRs pronadiRejtingPravnihOsoba(RejtingVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiRejtingPravnihOsoba");
        RejtingRs res = (RejtingRs) executeQuery(value);
        return res;
    }
    public SkoringRs pripremaOcjenaPravneOsobe(SkoringVo value) throws AS2Exception {
        value.setRemoteMethod("pripremaOcjenaPravneOsobe");
        SkoringRs res = (SkoringRs) executeQuery(value);
        return res;
    }
    public SkoringRs procitajSkoringPravneOsobe(SkoringVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSkoringPravneOsobe");
        SkoringRs res = (SkoringRs) executeQuery(value);
        return res;
    }
    public SkoringVo azurirajSkoring(SkoringVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajSkoring");
        SkoringVo res = (SkoringVo) execute(value);
        return res;
    }
    public SkoringVo brisiSkoring(SkoringVo value) throws AS2Exception {
        value.setRemoteMethod("brisiSkoring");
        SkoringVo res = (SkoringVo) execute(value);
        return res;
    }
    public SkoringVo brisiViseSkoringa(SkoringRs value) throws AS2Exception {
    	value.setRemoteMethod("brisiViseSkoringa");
    	SkoringVo res = (SkoringVo)  execute(value);
    	return res;
    }
    public PokazateljRs procitajSvePokazatelje(PokazateljVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSvePokazatelje");
        PokazateljRs res = (PokazateljRs) executeQuery(value);
        return res;
    }
    public PokazateljVo azurirajPokazatelj(PokazateljVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajPokazatelj");
        PokazateljVo res = (PokazateljVo) execute(value);
        return res;
    }
    public PokazateljVo citajPokazatelj(PokazateljVo value) throws AS2Exception {
        value.setRemoteMethod("citajPokazatelj");
        PokazateljVo res = (PokazateljVo) execute(value);
        return res;
    }
    public PokazateljRs izracunajPokazatelje(PokazateljVo value) throws AS2Exception {
        value.setRemoteMethod("izracunajPokazatelje");
        PokazateljRs res = (PokazateljRs) executeQuery(value);
        return res;
    }
    public PokazateljVo azurirajVrstuPokazatelja(PokazateljVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajVrstuPokazatelja");
        PokazateljVo res = (PokazateljVo) execute(value);
        return res;
    }
    public PokazateljRs procitajSveVrstePokazatelja(PokazateljVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveVrstePokazatelja");
        PokazateljRs res = (PokazateljRs) executeQuery(value);
        return res;
    }
    public PokazateljOcjenaRs procitajSveOcjenePokazatelja(PokazateljVo value) throws AS2Exception {
        value.setRemoteMethod("procitajSveOcjenePokazatelja");
        PokazateljOcjenaRs res = (PokazateljOcjenaRs) executeQuery(value);
        return res;
    }
    public PokazateljOcjenaVo azurirajOcjenuPokazatelja(PokazateljOcjenaVo value) throws AS2Exception {
        value.setRemoteMethod("azurirajOcjenuPokazatelja");
        PokazateljOcjenaVo res = (PokazateljOcjenaVo) execute(value);
        return res;
    }
    public PokazateljRs izracunajRanoUpozorenje(PokazateljVo value) throws AS2Exception {
        value.setRemoteMethod("izracunajRanoUpozorenje");
        PokazateljRs res = (PokazateljRs) executeQuery(value);
        return res;
    }
}