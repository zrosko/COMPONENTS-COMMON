package hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.facade;

import hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto.KreditniZahtjevOsobaVo;
import hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto.KreditniZahtjevRs;
import hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto.KreditniZahtjevVo;

public interface KreditniZahtjevGradanaFacade {
	public abstract KreditniZahtjevVo dodajKreditniZahtjev(KreditniZahtjevVo value) throws Exception;
	public abstract KreditniZahtjevVo dodajKreditniZahtjevJamacSuduznik(KreditniZahtjevVo value) throws Exception;
	public abstract void azurirajKreditniZahtjev(KreditniZahtjevVo value) throws Exception;
	public abstract void azurirajKreditniZahtjevJamacSuduznik(KreditniZahtjevVo value) throws Exception;
	public abstract void brisiKreditniZahtjevJamacSuduznik(KreditniZahtjevOsobaVo value) throws Exception;
	public abstract void brisiKreditniZahtjev(KreditniZahtjevVo value) throws Exception;
	public abstract KreditniZahtjevRs procitajSveKreditneZahtjeve() throws Exception;
	public abstract KreditniZahtjevVo citajKreditniZahtjev(KreditniZahtjevVo value) throws Exception;
	public abstract KreditniZahtjevVo citajKreditniZahtjevSuduznik(KreditniZahtjevVo value) throws Exception;
	public abstract void azurirajPrijedlog(KreditniZahtjevVo value) throws Exception;
}
