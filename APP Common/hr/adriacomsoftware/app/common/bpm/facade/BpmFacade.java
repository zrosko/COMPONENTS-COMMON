package hr.adriacomsoftware.app.common.bpm.facade;

import hr.adriacomsoftware.app.common.bpm.dto.BpmProcesRs;
import hr.adriacomsoftware.app.common.bpm.dto.BpmProcesVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface BpmFacade {
    //lookup
    public abstract AS2RecordList listajSveProcese() throws Exception;
    //proces
    public abstract BpmProcesRs procitajSveProcese(BpmProcesVo value) throws Exception;
    public abstract BpmProcesVo azurirajProces(BpmProcesVo value) throws Exception;
    public abstract BpmProcesVo dodajProces(BpmProcesVo value) throws Exception;
    public abstract BpmProcesVo brisiProces(BpmProcesVo value) throws Exception;
}
