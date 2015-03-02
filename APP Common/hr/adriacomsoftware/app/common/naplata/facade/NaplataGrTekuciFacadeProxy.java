package hr.adriacomsoftware.app.common.naplata.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciBiljeskaRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciBiljeskaVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciDopisRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciDopisVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciObradaRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciObradaVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciPracenjeRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciPracenjeVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class NaplataGrTekuciFacadeProxy extends AS2FacadeProxy implements NaplataGrTekuciFacade {

    private static NaplataGrTekuciFacadeProxy _instance = null;

    private NaplataGrTekuciFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.naplata.facade.NaplataGrTekuciFacadeServer");
    }

    public static NaplataGrTekuciFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new NaplataGrTekuciFacadeProxy();
        return _instance;
    }

    /************* FACADE PROXY  naplata_gr_tekuci_pracenje ************/

    public NaplataGrTekuciPracenjeVo brisiNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiNaplataGrTekuciPracenje");
    	NaplataGrTekuciPracenjeVo res = (NaplataGrTekuciPracenjeVo) execute(value);
    	return res;
    }
    public NaplataGrTekuciPracenjeVo dodajNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajNaplataGrTekuciPracenje");
    	NaplataGrTekuciPracenjeVo res = (NaplataGrTekuciPracenjeVo) execute(value);
    	return res;
    }
    public NaplataGrTekuciPracenjeVo azurirajNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajNaplataGrTekuciPracenje");
    	NaplataGrTekuciPracenjeVo res = (NaplataGrTekuciPracenjeVo) execute(value);
    	return res;
    }
    public NaplataGrTekuciPracenjeRs procitajSveNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveNaplataGrTekuciPracenje");
    	NaplataGrTekuciPracenjeRs res = (NaplataGrTekuciPracenjeRs) executeQuery(value);
    	return res;
    }
    public AS2RecordList listajSveNaplataGrTekuciPracenje() throws AS2Exception {
    	AS2RecordList res = (AS2RecordList) executeQuery("listajSveNaplataGrTekuciPracenje");
    	return res;
    }
    public NaplataGrTekuciPracenjeRs pretraziNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws AS2Exception {
    	value.setRemoteMethod("pretraziNaplataGrTekuciPracenje");
    	NaplataGrTekuciPracenjeRs res = (NaplataGrTekuciPracenjeRs) executeQuery(value);
    	return res;
    }

	public NaplataGrTekuciPracenjeVo procitajiNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajiNaplataGrTekuciPracenje");
    	NaplataGrTekuciPracenjeVo res = (NaplataGrTekuciPracenjeVo) execute(value);
    	return res;
	}
	public NaplataGrTekuciPracenjeVo dodajNoveKlijente(NaplataGrTekuciPracenjeRs value)throws AS2Exception {
	   	value.setRemoteMethod("dodajNoveKlijente");
	   	NaplataGrTekuciPracenjeVo res = (NaplataGrTekuciPracenjeVo) execute(value);
    	return res;
	}
	

	/************* FACADE PROXY  naplata_gr_tekuci_biljeska ************/

	public NaplataGrTekuciBiljeskaVo brisiNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiNaplataGrTekuciBiljeska");
		NaplataGrTekuciBiljeskaVo res = (NaplataGrTekuciBiljeskaVo) execute(value);
		return res;
	}
	public NaplataGrTekuciBiljeskaVo dodajNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajNaplataGrTekuciBiljeska");
		NaplataGrTekuciBiljeskaVo res = (NaplataGrTekuciBiljeskaVo) execute(value);
		return res;
	}
	public NaplataGrTekuciBiljeskaVo azurirajNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajNaplataGrTekuciBiljeska");
		NaplataGrTekuciBiljeskaVo res = (NaplataGrTekuciBiljeskaVo) execute(value);
		return res;
	}
	public NaplataGrTekuciBiljeskaRs procitajSveNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveNaplataGrTekuciBiljeska");
		NaplataGrTekuciBiljeskaRs res = (NaplataGrTekuciBiljeskaRs) executeQuery(value);
		return res;
	}
	public AS2RecordList listajSveNaplataGrTekuciBiljeska() throws AS2Exception {
		AS2RecordList res = (AS2RecordList) executeQuery("listajSveNaplataGrTekuciBiljeska");
		return res;
	}
	public NaplataGrTekuciBiljeskaRs pretraziNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws AS2Exception {
		value.setRemoteMethod("pretraziSveNaplataGrTekuciBiljeska");
		NaplataGrTekuciBiljeskaRs res = (NaplataGrTekuciBiljeskaRs) executeQuery(value);
		return res;
	}
	public NaplataGrTekuciBiljeskaVo procitajiNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajiNaplataGrTekuciBiljeska");
    	NaplataGrTekuciBiljeskaVo res = (NaplataGrTekuciBiljeskaVo) execute(value);
    	return res;
	}
	public NaplataGrTekuciBiljeskaVo brisiViseBiljeski(NaplataGrTekuciBiljeskaRs value) throws AS2Exception {
	   	value.setRemoteMethod("brisiViseBiljeski");
	   	NaplataGrTekuciBiljeskaVo res = (NaplataGrTekuciBiljeskaVo) execute(value);
    	return res;
	}

	

	/************* FACADE PROXY  naplata_gr_tekuci_dopis ************/

	public NaplataGrTekuciDopisVo brisiNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws AS2Exception {
		value.setRemoteMethod("brisiNaplataGrTekuciDopis");
		NaplataGrTekuciDopisVo res = (NaplataGrTekuciDopisVo) execute(value);
		return res;
	}
	public NaplataGrTekuciDopisVo dodajNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws AS2Exception {
		value.setRemoteMethod("dodajNaplataGrTekuciDopis");
		NaplataGrTekuciDopisVo res = (NaplataGrTekuciDopisVo) execute(value);
		return res;
	}
	public NaplataGrTekuciDopisVo azurirajNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajNaplataGrTekuciDopis");
		NaplataGrTekuciDopisVo res = (NaplataGrTekuciDopisVo) execute(value);
		return res;
	}
	public NaplataGrTekuciDopisRs procitajSveNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveNaplataGrTekuciDopis");
		NaplataGrTekuciDopisRs res = (NaplataGrTekuciDopisRs) executeQuery(value);
		return res;
	}
	public AS2RecordList listajSveNaplataGrTekuciDopis() throws AS2Exception {
		AS2RecordList res = (AS2RecordList) executeQuery("listajSveNaplataGrTekuciDopis");
		return res;
	}
	public NaplataGrTekuciDopisRs pretraziNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws AS2Exception {
		value.setRemoteMethod("pretraziSveNaplataGrTekuciDopis");
		NaplataGrTekuciDopisRs res = (NaplataGrTekuciDopisRs) executeQuery(value);
		return res;
	}
	public NaplataGrTekuciDopisVo procitajiNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajiNaplataGrTekuciDopis");
    	NaplataGrTekuciDopisVo res = (NaplataGrTekuciDopisVo) execute(value);
    	return res;
	}
	public NaplataGrTekuciDopisVo brisiViseDopisa(NaplataGrTekuciDopisRs value) throws AS2Exception {
	   	value.setRemoteMethod("brisiViseDopisa");
	   	NaplataGrTekuciDopisVo res = (NaplataGrTekuciDopisVo) execute(value);
    	return res;
	}
	
	
	public NaplataGrTekuciDopisVo citajPrivitak(NaplataGrTekuciDopisVo value) throws AS2Exception {
    	value.setRemoteMethod("citajPrivitak");
    	NaplataGrTekuciDopisVo res = (NaplataGrTekuciDopisVo) execute(value);
    	return res;
	}
	
	

	/************* FACADE PROXY  naplata_gr_tekuci_obrada ************/

	public NaplataGrTekuciObradaVo brisiNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiNaplataGrTekuciObrada");
		NaplataGrTekuciObradaVo res = (NaplataGrTekuciObradaVo) execute(value);
		return res;
	}
	public NaplataGrTekuciObradaVo dodajNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajNaplataGrTekuciObrada");
		NaplataGrTekuciObradaVo res = (NaplataGrTekuciObradaVo) execute(value);
		return res;
	}
	public NaplataGrTekuciObradaVo azurirajNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajNaplataGrTekuciObrada");
		NaplataGrTekuciObradaVo res = (NaplataGrTekuciObradaVo) execute(value);
		return res;
	}
	public NaplataGrTekuciObradaRs procitajSveNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveNaplataGrTekuciObrada");
		NaplataGrTekuciObradaRs res = (NaplataGrTekuciObradaRs) executeQuery(value);
		return res;
	}
	public AS2RecordList listajSveNaplataGrTekuciObrada() throws AS2Exception {
		AS2RecordList res = (AS2RecordList) executeQuery("listajSveNaplataGrTekuciObrada");
		return res;
	}
	public NaplataGrTekuciObradaRs pretraziNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws AS2Exception {
		value.setRemoteMethod("pretraziNaplataGrTekuciObrada");
		NaplataGrTekuciObradaRs res = (NaplataGrTekuciObradaRs) executeQuery(value);
		return res;
	}

	
	public NaplataGrTekuciObradaRs citajStavkeObrade(NaplataGrTekuciObradaVo value) throws AS2Exception {
		value.setRemoteMethod("citajStavkeObrade");
		NaplataGrTekuciObradaRs res = (NaplataGrTekuciObradaRs) executeQuery(value);
		return res;
	}
	
	public AS2Record dodajObradu(NaplataGrTekuciPracenjeRs value)throws AS2Exception {
	   	value.setRemoteMethod("dodajObradu");
	   	AS2Record res = (AS2Record) execute(value);
    	return res;
	}
	
	public NaplataGrTekuciObradaVo citajObradu(NaplataGrTekuciObradaVo value) throws AS2Exception {
    	value.setRemoteMethod("citajObradu");
    	NaplataGrTekuciObradaVo res = (NaplataGrTekuciObradaVo) execute(value);
    	return res;
	}
	
	
	/************* FACADE PROXY  zajednicko ************/
	
	public OsnovniRs procitajSifre(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSifre");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
	}

	public OsnovniRs izvjestaji(OsnovniVo value) throws AS2Exception {
    	value.setRemoteMethod("izvjestaji");
    	OsnovniRs res = (OsnovniRs) executeQuery(value);
    	return res;
	}
	
}