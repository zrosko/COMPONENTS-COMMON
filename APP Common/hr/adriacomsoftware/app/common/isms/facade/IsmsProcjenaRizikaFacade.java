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

public interface IsmsProcjenaRizikaFacade {
    //imovina
    public abstract IsmsImovinaRs citajSvuImovinu(IsmsImovinaVo value) throws Exception;
    public abstract IsmsImovinaRs pronadiSvuImovinu(IsmsImovinaVo value) throws Exception;
    public abstract IsmsImovinaVo dodajImovinu(IsmsImovinaVo value) throws Exception;
    public abstract IsmsImovinaVo citajImovinu(IsmsImovinaVo value) throws Exception;
    public abstract IsmsImovinaVo duplicirajImovinu(IsmsImovinaVo value) throws Exception;
    public abstract IsmsImovinaVo brisiImovinu(IsmsImovinaVo value) throws Exception;
    public abstract IsmsImovinaVo azurirajImovinu(IsmsImovinaVo value)throws Exception;
    public abstract void potvrdiProcjenuVrijednostiImovine(IsmsImovinaRs value) throws Exception;
    public abstract void azurirajVlasnikaImovine(IsmsImovinaVo value) throws Exception;
    public abstract void azurirajKategorijuImovine(IsmsImovinaVo value) throws Exception;
    //kopije imovine
    public abstract IsmsImovinaKopijaRs procitajSveKopijeImovine(IsmsImovinaKopijaVo value) throws Exception;
    public abstract IsmsImovinaKopijaVo azurirajKopijuImovine(IsmsImovinaKopijaVo value) throws Exception;
    public abstract IsmsImovinaKopijaVo dodajKopijuImovine(IsmsImovinaKopijaVo value) throws Exception;
    public abstract IsmsImovinaKopijaVo brisiKopijuImovine(IsmsImovinaKopijaVo value) throws Exception;
    //korisnik imovine
    public abstract IsmsImovinaKorisnikRs procitajSveKorisnikeImovine(IsmsImovinaKorisnikVo value) throws Exception;
    public abstract IsmsImovinaKorisnikVo azurirajKorisnikaImovine(IsmsImovinaKorisnikVo value) throws Exception;
    public abstract IsmsImovinaKorisnikVo dodajKorisnikaImovine(IsmsImovinaKorisnikVo value) throws Exception;
    public abstract IsmsImovinaKorisnikVo brisiKorisnikaImovine(IsmsImovinaKorisnikVo value) throws Exception;
    //rizik 
    public abstract IsmsRizikRs procitajSveRizikeZaImovinu(IsmsRizikVo value) throws Exception;
    public abstract IsmsRizikRs procitajSveRizike(IsmsRizikVo value) throws Exception;
    public abstract IsmsRizikRs pronadiSveRizike(IsmsRizikVo value) throws Exception;
    public abstract IsmsRizikVo azurirajRizik(IsmsRizikVo value) throws Exception;
    public abstract IsmsRizikVo dodajRizik(IsmsRizikVo value) throws Exception;
    public abstract IsmsRizikVo brisiRizik(IsmsRizikVo value) throws Exception;
    public abstract IsmsRizikVo duplicirajRizik(IsmsRizikVo value) throws Exception;
    public abstract void potvrdiProcjenuRazineRizika(IsmsRizikRs value) throws Exception;
    public abstract void arhivirajProcjenuRazineRizika() throws Exception;    
    //prijedlog mjera
    public abstract IsmsRizikKontrolaRs procitajSvePredlozeneKontroleZaRizik(IsmsRizikKontrolaVo value) throws Exception;
    public abstract IsmsRizikKontrolaVo azurirajKontroluZaRizik(IsmsRizikKontrolaVo value) throws Exception;
    public abstract IsmsRizikKontrolaVo dodajKontroluZaRizik(IsmsRizikKontrolaVo value) throws Exception;
    public abstract IsmsRizikKontrolaVo brisiKontroluZaRizik(IsmsRizikKontrolaVo value) throws Exception;    
    public abstract IsmsRizikKontrolaRs procitajSveKontroleZaSmanjivanjeRizika(IsmsRizikKontrolaVo value) throws Exception;
    public abstract IsmsRizikKontrolaRs pronadiSveKontroleZaSmanjivanjeRizika(IsmsRizikKontrolaVo value) throws Exception;
    public abstract void arhivirajSmanjenjeRizika() throws Exception;
}
