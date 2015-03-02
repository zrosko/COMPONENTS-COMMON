package hr.adriacomsoftware.app.common.isms.facade;


import hr.adriacomsoftware.app.common.isms.dto.IsmsImovinaKopijaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsImovinaKopijaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsImovinaKorisnikRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsImovinaKorisnikVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsImovinaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsImovinaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRizikKontrolaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRizikKontrolaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRizikRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRizikVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class IsmsProcjenaRizikaFacadeProxy extends AS2FacadeProxy implements IsmsProcjenaRizikaFacade {

    private static IsmsProcjenaRizikaFacadeProxy _instance = null;

    private IsmsProcjenaRizikaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.isms.facade.IsmsProcjenaRizikaFacadeServer");
    }

    public static IsmsProcjenaRizikaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new IsmsProcjenaRizikaFacadeProxy();
        return _instance;
    }

    public IsmsImovinaVo dodajImovinu(IsmsImovinaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajImovinu");
		IsmsImovinaVo res = (IsmsImovinaVo)  execute(value);
		return res;
    }
    public IsmsImovinaVo azurirajImovinu(IsmsImovinaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajImovinu");
		IsmsImovinaVo res = (IsmsImovinaVo)  execute(value);
		return res;
    }
    public void azurirajVlasnikaImovine(IsmsImovinaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajVlasnikaImovine");
		/*IsmsImovinaVo res = (IsmsImovinaVo)*/  execute(value);
    }
    public void azurirajKategorijuImovine(IsmsImovinaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKategorijuImovine");
		/*IsmsImovinaVo res = (IsmsImovinaVo)*/  execute(value);
    }
    public IsmsImovinaRs citajSvuImovinu(IsmsImovinaVo value) throws AS2Exception {
		value.setRemoteMethod("citajSvuImovinu");
		IsmsImovinaRs res = (IsmsImovinaRs) executeQuery(value);
		return res;
    }
    public IsmsImovinaRs pronadiSvuImovinu(IsmsImovinaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSvuImovinu");
		IsmsImovinaRs res = (IsmsImovinaRs) executeQuery(value);
		return res;
    }

    public IsmsImovinaVo citajImovinu(IsmsImovinaVo value) throws AS2Exception {
		value.setRemoteMethod("citajImovinu");
		IsmsImovinaVo res = (IsmsImovinaVo)  execute(value);
		return res;
    }

    public IsmsImovinaVo duplicirajImovinu(IsmsImovinaVo value) throws AS2Exception {
		value.setRemoteMethod("duplicirajImovinu");
		IsmsImovinaVo res = (IsmsImovinaVo)  execute(value);
		return res;
    }

    public IsmsImovinaVo brisiImovinu(IsmsImovinaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiImovinu");
		IsmsImovinaVo res = (IsmsImovinaVo)  execute(value);
		return res;
    }

    public IsmsImovinaKopijaRs procitajSveKopijeImovine(IsmsImovinaKopijaVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveKopijeImovine");
		IsmsImovinaKopijaRs res = (IsmsImovinaKopijaRs) executeQuery(value);
		return res;
    }

    public IsmsImovinaKopijaVo azurirajKopijuImovine(IsmsImovinaKopijaVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKopijuImovine");
		IsmsImovinaKopijaVo res = (IsmsImovinaKopijaVo)  execute(value);
		return res;
    }

    public IsmsImovinaKopijaVo dodajKopijuImovine(IsmsImovinaKopijaVo value) throws AS2Exception {
		value.setRemoteMethod("dodajKopijuImovine");
		IsmsImovinaKopijaVo res = (IsmsImovinaKopijaVo)  execute(value);
		return res;
    }

    public IsmsImovinaKopijaVo brisiKopijuImovine(IsmsImovinaKopijaVo value) throws AS2Exception {
		value.setRemoteMethod("brisiKopijuImovine");
		IsmsImovinaKopijaVo res = (IsmsImovinaKopijaVo)  execute(value);
		return res;
    }

    public IsmsImovinaKorisnikRs procitajSveKorisnikeImovine(IsmsImovinaKorisnikVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveKorisnikeImovine");
		IsmsImovinaKorisnikRs res = (IsmsImovinaKorisnikRs) executeQuery(value);
		return res;
    }

    public IsmsImovinaKorisnikVo azurirajKorisnikaImovine(IsmsImovinaKorisnikVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajKorisnikaImovine");
		IsmsImovinaKorisnikVo res = (IsmsImovinaKorisnikVo)  execute(value);
		return res;
    }

    public IsmsImovinaKorisnikVo dodajKorisnikaImovine(IsmsImovinaKorisnikVo value) throws AS2Exception {
		value.setRemoteMethod("dodajKorisnikaImovine");
		IsmsImovinaKorisnikVo res = (IsmsImovinaKorisnikVo)  execute(value);
		return res;
    }

    public IsmsImovinaKorisnikVo brisiKorisnikaImovine(IsmsImovinaKorisnikVo value) throws AS2Exception {
		value.setRemoteMethod("brisiKorisnikaImovine");
		IsmsImovinaKorisnikVo res = (IsmsImovinaKorisnikVo)  execute(value);
		return res;
    }

    public IsmsRizikRs procitajSveRizike(IsmsRizikVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveRizike");
		IsmsRizikRs res = (IsmsRizikRs) executeQuery(value);
		return res;
    }
    public IsmsRizikRs pronadiSveRizike(IsmsRizikVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveRizike");
		IsmsRizikRs res = (IsmsRizikRs) executeQuery(value);
		return res;
    }
    public IsmsRizikVo azurirajRizik(IsmsRizikVo value) throws AS2Exception {
		value.setRemoteMethod("azurirajRizik");
		IsmsRizikVo res = (IsmsRizikVo)  execute(value);
		return res;
    }

    public IsmsRizikVo dodajRizik(IsmsRizikVo value) throws AS2Exception {
		value.setRemoteMethod("dodajRizik");
		IsmsRizikVo res = (IsmsRizikVo)  execute(value);
		return res;
    }

    public IsmsRizikVo brisiRizik(IsmsRizikVo value) throws AS2Exception {
		value.setRemoteMethod("brisiRizik");
		IsmsRizikVo res = (IsmsRizikVo)  execute(value);
		return res;
    } 
    public IsmsRizikVo duplicirajRizik(IsmsRizikVo value) throws AS2Exception {
		value.setRemoteMethod("duplicirajRizik");
		IsmsRizikVo res = (IsmsRizikVo)  execute(value);
		return res;
    }

    public IsmsRizikRs procitajSveRizikeZaImovinu(IsmsRizikVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveRizikeZaImovinu");
		IsmsRizikRs res = (IsmsRizikRs) executeQuery(value);
		return res;
    }

    public void potvrdiProcjenuVrijednostiImovine(IsmsImovinaRs value) throws AS2Exception {
		value.setRemoteMethod("potvrdiProcjenuVrijednostiImovine");
		execute(value);   
    }

    public void potvrdiProcjenuRazineRizika(IsmsRizikRs value) throws AS2Exception {
		value.setRemoteMethod("potvrdiProcjenuRazineRizika");
		execute(value);         
    }
    public void arhivirajProcjenuRazineRizika() throws AS2Exception {
		execute("arhivirajProcjenuRazineRizika");         
    }
    public IsmsRizikKontrolaRs procitajSvePredlozeneKontroleZaRizik(IsmsRizikKontrolaVo value) throws AS2Exception {

    	value.setRemoteMethod("procitajSvePredlozeneKontroleZaRizik");
    	IsmsRizikKontrolaRs res = (IsmsRizikKontrolaRs) executeQuery(value);
    	return res;
     }
    public IsmsRizikKontrolaVo azurirajKontroluZaRizik(IsmsRizikKontrolaVo value) throws AS2Exception {

    	value.setRemoteMethod("azurirajKontroluZaRizik");
    	IsmsRizikKontrolaVo res = (IsmsRizikKontrolaVo)  execute(value);
    	return res;
     }
    public IsmsRizikKontrolaVo dodajKontroluZaRizik(IsmsRizikKontrolaVo value) throws AS2Exception {

    	value.setRemoteMethod("dodajKontroluZaRizik");
    	IsmsRizikKontrolaVo res = (IsmsRizikKontrolaVo)  execute(value);
    	return res;
     }
    public IsmsRizikKontrolaVo brisiKontroluZaRizik(IsmsRizikKontrolaVo value) throws AS2Exception {

    	value.setRemoteMethod("brisiKontroluZaRizik");
    	IsmsRizikKontrolaVo res = (IsmsRizikKontrolaVo)  execute(value);
    	return res;
     }
     public IsmsRizikKontrolaRs procitajSveKontroleZaSmanjivanjeRizika(IsmsRizikKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("procitajSveKontroleZaSmanjivanjeRizika");
		IsmsRizikKontrolaRs res = (IsmsRizikKontrolaRs) executeQuery(value);
		return res;
    }

    public IsmsRizikKontrolaRs pronadiSveKontroleZaSmanjivanjeRizika(IsmsRizikKontrolaVo value) throws AS2Exception {
		value.setRemoteMethod("pronadiSveKontroleZaSmanjivanjeRizika");
		IsmsRizikKontrolaRs res = (IsmsRizikKontrolaRs) executeQuery(value);
		return res;
    }
    public void arhivirajSmanjenjeRizika() throws AS2Exception {
		execute("arhivirajSmanjenjeRizika");         
    }
}