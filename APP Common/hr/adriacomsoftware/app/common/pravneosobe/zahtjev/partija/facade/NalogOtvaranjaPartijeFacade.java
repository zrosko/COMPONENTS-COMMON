package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.facade;

import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto.ZahNalogObavijestRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto.ZahNalogObavijestVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto.ZahNalogPartijeRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto.ZahNalogPartijeVo;

public interface NalogOtvaranjaPartijeFacade {
    public abstract ZahNalogPartijeRs procitajSveNaloge(ZahNalogPartijeVo value) throws Exception;
    public abstract ZahNalogPartijeRs pronadiNaloge(ZahNalogPartijeVo value) throws Exception;
    public abstract ZahNalogPartijeVo azurirajNalog(ZahNalogPartijeVo value) throws Exception;
    public abstract ZahNalogPartijeVo dodajNalog(ZahNalogPartijeVo value) throws Exception;
    public abstract ZahNalogPartijeVo brisiNalog(ZahNalogPartijeVo value) throws Exception; 
    //obavijest
	public abstract ZahNalogObavijestVo azurirajObavijestNaloga(ZahNalogObavijestVo value) throws Exception;
	public abstract ZahNalogObavijestRs procitajSveObavijestiNaloga(ZahNalogObavijestVo value) throws Exception;
	public abstract ZahNalogObavijestVo dodajObavijestNaloga(ZahNalogObavijestVo value) throws Exception;
	public abstract ZahNalogObavijestVo brisiObavijestNaloga(ZahNalogObavijestVo value) throws Exception;	
	public abstract ZahNalogObavijestVo brisiViseObavijestiNaloga(ZahNalogObavijestRs value) throws Exception;
}
