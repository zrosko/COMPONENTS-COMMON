package hr.adriacomsoftware.app.common.pdv.po.facade;

import hr.adriacomsoftware.app.common.pdv.po.dto.PdvRs;
import hr.adriacomsoftware.app.common.pdv.po.dto.PdvVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface PdvFacade {
    public abstract PdvRs listajSvePdv(PdvVo value) throws Exception;
    public abstract PdvRs pronadiPdv(PdvVo value) throws Exception;
    public abstract PdvVo citajPdv(PdvVo value) throws Exception;
    public abstract PdvVo dodajPdv(PdvVo value) throws Exception;
    public abstract PdvVo azurirajPdv(PdvVo value) throws Exception;
    public abstract PdvVo brisiPdv(PdvVo value) throws Exception;
    public abstract AS2RecordList listajSvaProtukonta()throws Exception;
}
