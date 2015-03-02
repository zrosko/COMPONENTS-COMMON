package hr.adriacomsoftware.app.common.obrtnici.bonitet.facade;

import hr.adriacomsoftware.app.common.obrtnici.bonitet.dto.BonitetObrtnikRs;
import hr.adriacomsoftware.app.common.obrtnici.bonitet.dto.BonitetObrtnikVo;
import hr.adriacomsoftware.app.common.pravneosobe.obrasci.dto.VikrStavkaRs;
import hr.adriacomsoftware.app.common.pravneosobe.obrasci.dto.VikrStavkaVo;

public interface BonitetObrtnikFacade {
    public abstract BonitetObrtnikRs citajSveBonitete(BonitetObrtnikVo value) throws Exception;
    public abstract BonitetObrtnikRs pronadiSveBonitete(BonitetObrtnikVo value) throws Exception;
    public abstract BonitetObrtnikRs citajSveBoniteteZaObrtnika(BonitetObrtnikVo value) throws Exception;
    public abstract BonitetObrtnikVo dodajBonitet(BonitetObrtnikVo value) throws Exception;  
    public abstract BonitetObrtnikVo azurirajBonitet(BonitetObrtnikVo value) throws Exception;  
    public abstract BonitetObrtnikVo brisiBonitet(BonitetObrtnikVo value) throws Exception;
    //VIKR
    public abstract VikrStavkaRs citajSveVikrZaKlijenta(VikrStavkaVo value) throws Exception;
    public abstract VikrStavkaVo dodajVikrZaKlijenta(VikrStavkaVo value) throws Exception;
    public abstract VikrStavkaVo azurirajVikrZaKlijenta(VikrStavkaVo value) throws Exception;
    public abstract VikrStavkaVo brisiVikrZaKlijenta(VikrStavkaVo value) throws Exception;
}
