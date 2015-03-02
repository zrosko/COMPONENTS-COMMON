package hr.adriacomsoftware.app.common.pravneosobe.povezaneosobe.facade;

import hr.adriacomsoftware.app.common.pravneosobe.povezaneosobe.dto.KlijentPovezanaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.povezaneosobe.dto.KlijentPovezanaOsobaVo;

public interface KlijentPovezaneOsobeFacade {
	public abstract KlijentPovezanaOsobaVo azurirajPovezanuOsobu(KlijentPovezanaOsobaVo value) throws Exception;
	public abstract KlijentPovezanaOsobaRs procitajSvePovezaneOsobe(KlijentPovezanaOsobaVo value) throws Exception;
	public abstract KlijentPovezanaOsobaRs procitajSvePovezaneOsobePOVIJEST(KlijentPovezanaOsobaVo value) throws Exception;
	public abstract KlijentPovezanaOsobaVo dodajPovezanuOsobu(KlijentPovezanaOsobaVo value) throws Exception;
	public abstract KlijentPovezanaOsobaVo dodajPovezaneOsobe(KlijentPovezanaOsobaRs value) throws Exception;
	public abstract KlijentPovezanaOsobaVo brisiPovezanuOsobu(KlijentPovezanaOsobaVo value) throws Exception;
	public abstract KlijentPovezanaOsobaRs listaPovezanihOsoba(KlijentPovezanaOsobaVo value) throws Exception;
	public abstract KlijentPovezanaOsobaVo dodajPovezaneOsobeIzPRN(KlijentPovezanaOsobaVo value) throws Exception;	
	public abstract KlijentPovezanaOsobaRs usporedbaSaBSAPovezanimOsobama(KlijentPovezanaOsobaVo value) throws Exception;
	public abstract KlijentPovezanaOsobaVo brisiVisePovezanihOsoba(KlijentPovezanaOsobaRs value) throws Exception;
}
