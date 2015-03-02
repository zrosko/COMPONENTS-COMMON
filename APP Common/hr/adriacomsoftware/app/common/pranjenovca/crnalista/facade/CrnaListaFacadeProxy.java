package hr.adriacomsoftware.app.common.pranjenovca.crnalista.facade;

import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaAdresaOsobeVo;
import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaDokumentOsobeVo;
import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaOsobaVo;
import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaRs;
import hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto.CrnaListaVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class CrnaListaFacadeProxy extends AS2FacadeProxy implements CrnaListaFacade {

    private static CrnaListaFacadeProxy _instance = null;

    private CrnaListaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.pranjenovca.crnalista.facade.CrnaListaFacadeServer");
    }

    public static CrnaListaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new CrnaListaFacadeProxy();
        return _instance;
    }
    public CrnaListaRs pronadiOsobeNaCrnimListama(CrnaListaVo value) throws AS2Exception {

    	value.setRemoteMethod("pronadiOsobeNaCrnimListama");
    	CrnaListaRs res = (CrnaListaRs) executeQuery(value);
    	return res;
     }
    public CrnaListaRs procitajSveOsobeCrnihListi(CrnaListaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveOsobeCrnihListi");
    	CrnaListaRs res = (CrnaListaRs) executeQuery(value);
    	return res;
     }
    public AS2RecordList procitajSveAdreseOsobeNaCrnojListi(CrnaListaOsobaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveAdreseOsobeNaCrnojListi");
    	AS2RecordList res = (AS2RecordList)  execute(value);
    	return res;
     }
    public AS2RecordList procitajSveDokumenteOsobeNaCrnojListi(CrnaListaOsobaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSveDokumenteOsobeNaCrnojListi");
    	AS2RecordList res = (AS2RecordList)  execute(value);
    	return res;
     }
    public AS2RecordList procitajOsobuNaCrnojListi(CrnaListaOsobaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajOsobuNaCrnojListi");
    	AS2RecordList res = (AS2RecordList)  execute(value);
    	return res;
     }

    public AS2RecordList procitajDrzaveNaCrnimListama(CrnaListaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajDrzaveNaCrnimListama");
    	AS2RecordList res = (AS2RecordList)  execute(value);
    	return res;
    }
    public AS2RecordList procitajRizicneDjelatnosti(CrnaListaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajRizicneDjelatnosti");
    	AS2RecordList res = (AS2RecordList)  execute(value);
    	return res;
    }

    public CrnaListaOsobaVo azurirajOsobu(CrnaListaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajOsobu");
    	CrnaListaOsobaVo res = (CrnaListaOsobaVo)  execute(value);
    	return res;
    }

    public CrnaListaOsobaVo dodajOsobu(CrnaListaOsobaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajOsobu");
    	CrnaListaOsobaVo res = (CrnaListaOsobaVo)  execute(value);
    	return res;
    }

    public CrnaListaAdresaOsobeVo azurirajAdresu(CrnaListaAdresaOsobeVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajAdresu");
    	CrnaListaAdresaOsobeVo res = (CrnaListaAdresaOsobeVo)  execute(value);
    	return res;
    }

    public CrnaListaAdresaOsobeVo dodajAdresu(CrnaListaAdresaOsobeVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajAdresu");
    	CrnaListaAdresaOsobeVo res = (CrnaListaAdresaOsobeVo)  execute(value);
    	return res;
    }

    public CrnaListaAdresaOsobeVo brisiAdresu(CrnaListaAdresaOsobeVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiAdresu");
    	CrnaListaAdresaOsobeVo res = (CrnaListaAdresaOsobeVo)  execute(value);
    	return res;
    }

    public CrnaListaDokumentOsobeVo azurirajDokument(CrnaListaDokumentOsobeVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajDokument");
    	CrnaListaDokumentOsobeVo res = (CrnaListaDokumentOsobeVo)  execute(value);
    	return res;
    }

    public CrnaListaDokumentOsobeVo dodajDokument(CrnaListaDokumentOsobeVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajDokument");
    	CrnaListaDokumentOsobeVo res = (CrnaListaDokumentOsobeVo)  execute(value);
    	return res;
    }

    public CrnaListaDokumentOsobeVo brisiDokument(CrnaListaDokumentOsobeVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiDokument");
    	CrnaListaDokumentOsobeVo res = (CrnaListaDokumentOsobeVo)  execute(value);
    	return res;
    }
 }