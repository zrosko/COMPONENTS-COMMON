package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.garancije.facade;

import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.garancije.dto.GarancijaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.garancije.dto.GarancijaVo;

public interface GarancijeFacade {
    public abstract GarancijaRs procitajSveGarancije(GarancijaVo value) throws Exception;
    public abstract GarancijaRs pronadiGarancije(GarancijaVo value) throws Exception;
    public abstract GarancijaVo azurirajGaranciju(GarancijaVo value) throws Exception;
    public abstract GarancijaVo dodajGaranciju(GarancijaVo value) throws Exception;
    public abstract GarancijaVo brisiGaranciju(GarancijaVo value) throws Exception;    
}
