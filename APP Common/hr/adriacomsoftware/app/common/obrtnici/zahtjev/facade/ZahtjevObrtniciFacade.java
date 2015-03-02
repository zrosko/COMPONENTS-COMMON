package hr.adriacomsoftware.app.common.obrtnici.zahtjev.facade;

import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZahtjevPravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZahtjevPravnaOsobaVo;

public interface ZahtjevObrtniciFacade {
    public abstract ZahtjevPravnaOsobaRs citajSveZahtjeve(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaRs pronadiSveZahtjeve(ZahtjevPravnaOsobaVo value) throws Exception;
}