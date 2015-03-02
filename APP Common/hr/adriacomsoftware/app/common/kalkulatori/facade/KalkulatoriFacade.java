package hr.adriacomsoftware.app.common.kalkulatori.facade;

import hr.adriacomsoftware.app.common.kalkulatori.dto.FinancijskiKalkulatorVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface KalkulatoriFacade {
    public abstract FinancijskiKalkulatorVo izracunajZateznukamatu(FinancijskiKalkulatorVo value) throws Exception;
    public abstract AS2RecordList izracunajPlanOtplateEks(FinancijskiKalkulatorVo value) throws Exception;
    public abstract AS2RecordList izracunajPlanOtplate(FinancijskiKalkulatorVo value) throws Exception;
    public abstract AS2RecordList izracunajKamatu(FinancijskiKalkulatorVo value) throws Exception;
}
