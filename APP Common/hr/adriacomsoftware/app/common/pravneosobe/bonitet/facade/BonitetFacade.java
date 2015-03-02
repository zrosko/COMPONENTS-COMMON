package hr.adriacomsoftware.app.common.pravneosobe.bonitet.facade;

import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaVo;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

public interface BonitetFacade {
    public abstract AS2RecordList citajBilancu(PravnaOsobaVo value) throws Exception;
    public abstract AS2RecordList citajRacunDobitiGubitka(PravnaOsobaVo value) throws Exception;
    public abstract AS2RecordList citajStanjaZaReferat(PravnaOsobaVo value) throws Exception;
    public abstract AS2RecordList citajBonitetZaBSA(AS2Record value) throws Exception;
}
