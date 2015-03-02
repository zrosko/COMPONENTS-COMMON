package hr.adriacomsoftware.app.common.karticno.gr.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.karticno.gr.dto.McardGrPokazateljRs;
import hr.adriacomsoftware.app.common.karticno.gr.dto.McardGrPokazateljVo;
import hr.adriacomsoftware.app.common.karticno.gr.dto.McardGrZahtjevOcjenaRs;
import hr.adriacomsoftware.app.common.karticno.gr.dto.McardGrZahtjevOcjenaVo;
import hr.adriacomsoftware.app.common.karticno.gr.dto.McardGrZahtjevPrivitakRs;
import hr.adriacomsoftware.app.common.karticno.gr.dto.McardGrZahtjevPrivitakVo;
import hr.adriacomsoftware.app.common.karticno.gr.dto.McardGrZahtjevRs;
import hr.adriacomsoftware.app.common.karticno.gr.dto.McardGrZahtjevVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class KarticnoFacadeProxy extends AS2FacadeProxy implements KarticnoFacade {

    private static KarticnoFacadeProxy _instance = null;

    private KarticnoFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.karticno.gr.facade.KarticnoFacadeServer");
    }

    public static KarticnoFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new KarticnoFacadeProxy();
        return _instance;
    }

    public McardGrZahtjevVo brisiMcardGrZahtjev(McardGrZahtjevVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMcardGrZahtjev");
    	McardGrZahtjevVo res = (McardGrZahtjevVo) execute(value);
    	return res;
    }
    public McardGrZahtjevVo dodajMcardGrZahtjev(McardGrZahtjevVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMcardGrZahtjev");
    	McardGrZahtjevVo res = (McardGrZahtjevVo) execute(value);
    	return res;
    }
    public McardGrZahtjevVo azurirajMcardGrZahtjev(McardGrZahtjevVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMcardGrZahtjev");
    	McardGrZahtjevVo res = (McardGrZahtjevVo) execute(value);
    	return res;
    }
    public McardGrZahtjevRs procitajSveMcardGrZahtjev(McardGrZahtjevVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMcardGrZahtjev");
    	McardGrZahtjevRs res = (McardGrZahtjevRs) executeQuery(value);
    	return res;
    }
    public McardGrZahtjevVo procitajMcardGrZahtjev(McardGrZahtjevVo value)throws AS2Exception {
    	value.setRemoteMethod("procitajMcardGrZahtjev");
    	McardGrZahtjevVo res = (McardGrZahtjevVo) execute(value);
    	return res;
    }
    public AS2RecordList listajSveMcardGrZahtjev() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMcardGrZahtjev");
    	return res;
    }
    public McardGrZahtjevRs pretraziMcardGrZahtjev(McardGrZahtjevVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziMcardGrZahtjev");
    	McardGrZahtjevRs res = (McardGrZahtjevRs) executeQuery(value);
    	return res;
    } 
    public McardGrZahtjevVo ucitajPodatkeZaMcardGrZahtjev(McardGrZahtjevVo value)throws AS2Exception {
    	value.setRemoteMethod("ucitajPodatkeZaMcardGrZahtjev");
    	McardGrZahtjevVo res = (McardGrZahtjevVo) execute(value);
    	return res;
    }
    public McardGrZahtjevRs procitajSifre(McardGrZahtjevVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSifre");
    	McardGrZahtjevRs res = (McardGrZahtjevRs) executeQuery(value);
    	return res;
    }
    //pokazatelj
    public McardGrPokazateljVo brisiMcardGrPokazatelj(McardGrPokazateljVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMcardGrPokazatelj");
    	McardGrPokazateljVo res = (McardGrPokazateljVo) execute(value);
    	return res;
    }
    public McardGrPokazateljVo dodajMcardGrPokazatelj(McardGrPokazateljVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMcardGrPokazatelj");
    	McardGrPokazateljVo res = (McardGrPokazateljVo) execute(value);
    	return res;
    }
    public McardGrPokazateljVo azurirajMcardGrPokazatelj(McardGrPokazateljVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMcardGrPokazatelj");
    	McardGrPokazateljVo res = (McardGrPokazateljVo) execute(value);
    	return res;
    }
    public McardGrPokazateljRs procitajSveMcardGrPokazatelj(McardGrPokazateljVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMcardGrPokazatelj");
    	McardGrPokazateljRs res = (McardGrPokazateljRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMcardGrPokazatelj() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMcardGrPokazatelj");
    	return res;
    }
    public McardGrPokazateljRs pretraziMcardGrPokazatelj(McardGrPokazateljVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziSveMcardGrPokazatelj");
    	McardGrPokazateljRs res = (McardGrPokazateljRs) executeQuery(value);
    	return res;
    }
    public McardGrZahtjevOcjenaVo brisiMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMcardGrZahtjevOcjena");
    	McardGrZahtjevOcjenaVo res = (McardGrZahtjevOcjenaVo) execute(value);
    	return res;
    }
    public McardGrZahtjevOcjenaVo dodajMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajMcardGrZahtjevOcjena");
    	McardGrZahtjevOcjenaVo res = (McardGrZahtjevOcjenaVo) execute(value);
    	return res;
    }
    public McardGrZahtjevOcjenaVo azurirajMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajMcardGrZahtjevOcjena");
    	McardGrZahtjevOcjenaVo res = (McardGrZahtjevOcjenaVo) execute(value);
    	return res;
    }
    public McardGrZahtjevOcjenaRs procitajSveMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveMcardGrZahtjevOcjena");
    	McardGrZahtjevOcjenaRs res = (McardGrZahtjevOcjenaRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveMcardGrZahtjevOcjena() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveMcardGrZahtjevOcjena");
    	return res;
    }
    public McardGrZahtjevOcjenaRs pretraziMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziSveMcardGrZahtjevOcjena");
    	McardGrZahtjevOcjenaRs res = (McardGrZahtjevOcjenaRs) executeQuery(value);
    	return res;
    }

	public McardGrZahtjevOcjenaRs pripremaOcjena(McardGrZahtjevOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("pripremaOcjena");
    	McardGrZahtjevOcjenaRs res = (McardGrZahtjevOcjenaRs) executeQuery(value);
    	return res;
	}
	
	//Izvjestaji
	public McardGrZahtjevRs izvjestaji(McardGrZahtjevVo value) throws AS2Exception {
		value.setRemoteMethod("izvjestaji");
		McardGrZahtjevRs res = (McardGrZahtjevRs) executeQuery(value);
    	return res;
	}

	public McardGrZahtjevPrivitakRs procitajSvePrivitke(McardGrZahtjevPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSvePrivitke");
    	McardGrZahtjevPrivitakRs res = (McardGrZahtjevPrivitakRs) executeQuery(value);
    	return res;
	}

	public McardGrZahtjevPrivitakVo dodajPrivitak(McardGrZahtjevPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajPrivitak");
    	McardGrZahtjevPrivitakVo res = (McardGrZahtjevPrivitakVo) execute(value);
    	return res;
	}

	public McardGrZahtjevPrivitakVo citajPrivitak(McardGrZahtjevPrivitakVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrivitak");
    	McardGrZahtjevPrivitakVo res = (McardGrZahtjevPrivitakVo) execute(value);
    	return res;
	}

	public McardGrZahtjevPrivitakVo brisiPrivitak(McardGrZahtjevPrivitakVo value)throws AS2Exception {
    	value.setRemoteMethod("brisiPrivitak");
    	McardGrZahtjevPrivitakVo res = (McardGrZahtjevPrivitakVo) execute(value);
    	return res;
	}
	
	public OsnovniRs procitajSvePartijeStednje(OsnovniVo value)throws AS2Exception {
        value.setRemoteMethod("procitajSvePartijeStednje");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
	}
	public OsnovniRs procitajSvePartijeMcard(OsnovniVo value)throws AS2Exception {
        value.setRemoteMethod("procitajSvePartijeMcard");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
	}

	public OsnovniRs procitajPartijeTekuci(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("procitajPartijeTekuci");//$NON-NLS-1$
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
	}

	public McardGrZahtjevOcjenaVo brisiMcardGrZahtjevSveOcjene(McardGrZahtjevOcjenaVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiMcardGrZahtjevSveOcjene");
    	McardGrZahtjevOcjenaVo res = (McardGrZahtjevOcjenaVo) execute(value);
    	return res;
	}
}
