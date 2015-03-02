package hr.adriacomsoftware.app.common.pranjenovca.crnalista.facade;

import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaAdresaOsobeVo;
import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaDokumentOsobeVo;
import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaOsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaRs;
import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface CrnaListaFacade {
    //crna lista
    public abstract CrnaListaRs pronadiOsobeNaCrnimListama(CrnaListaVo value) throws Exception;
    public abstract CrnaListaRs procitajSveOsobeCrnihListi(CrnaListaVo value) throws Exception;
    public abstract AS2RecordList procitajSveAdreseOsobeNaCrnojListi(CrnaListaOsobaVo value) throws Exception;
    public abstract AS2RecordList procitajSveDokumenteOsobeNaCrnojListi(CrnaListaOsobaVo value) throws Exception;
    public abstract AS2RecordList procitajOsobuNaCrnojListi(CrnaListaOsobaVo value) throws Exception;
    public abstract AS2RecordList procitajDrzaveNaCrnimListama(CrnaListaVo value) throws Exception;
    public abstract AS2RecordList procitajRizicneDjelatnosti(CrnaListaVo value) throws Exception;
    public abstract CrnaListaOsobaVo azurirajOsobu(CrnaListaOsobaVo value) throws Exception;
    public abstract CrnaListaOsobaVo dodajOsobu(CrnaListaOsobaVo value) throws Exception;
	public abstract CrnaListaAdresaOsobeVo azurirajAdresu(CrnaListaAdresaOsobeVo value) throws Exception;
	public abstract CrnaListaAdresaOsobeVo dodajAdresu(CrnaListaAdresaOsobeVo value) throws Exception;
	public abstract CrnaListaAdresaOsobeVo brisiAdresu(CrnaListaAdresaOsobeVo value) throws Exception;
	public abstract CrnaListaDokumentOsobeVo azurirajDokument(CrnaListaDokumentOsobeVo value) throws Exception;
	public abstract CrnaListaDokumentOsobeVo dodajDokument(CrnaListaDokumentOsobeVo value) throws Exception;
	public abstract CrnaListaDokumentOsobeVo brisiDokument(CrnaListaDokumentOsobeVo value) throws Exception;
}
