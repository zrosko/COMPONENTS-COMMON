package hr.adriacomsoftware.app.common.cmdb.facade;

import hr.adriacomsoftware.app.common.cmdb.dto.CmdbDjelatnikRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbDjelatnikVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbDobavljacRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbDobavljacVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaDodatakRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaDodatakVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaKorisnikRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaKorisnikVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaPrivitakRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaPrivitakVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaVezaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaVezaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbImovinaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbKvarRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbKvarVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbMrezniCvorRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbMrezniCvorVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbOrgJedinicaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbOrgJedinicaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbPromjenaPrivitakRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbPromjenaPrivitakVo;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbPromjenaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.CmdbPromjenaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.DjelatnikIzobrazbaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.DjelatnikIzobrazbaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.DjelatnikVjestinaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.DjelatnikVjestinaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.EmailVo;
import hr.adriacomsoftware.app.common.cmdb.dto.IzobrazbaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.IzobrazbaVo;
import hr.adriacomsoftware.app.common.cmdb.dto.VjestinaRs;
import hr.adriacomsoftware.app.common.cmdb.dto.VjestinaVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface CMDBFacade {
    //imovina
    public abstract CmdbImovinaRs citajSvuImovinu(CmdbImovinaVo value) throws Exception;
    public abstract CmdbImovinaRs pronadiSvuImovinu(CmdbImovinaVo value) throws Exception;
    public abstract CmdbImovinaVo dodajImovinu(CmdbImovinaVo value) throws Exception;
    public abstract CmdbImovinaVo citajImovinu(CmdbImovinaVo value) throws Exception;
    public abstract CmdbImovinaVo duplicirajImovinu(CmdbImovinaVo value) throws Exception;
    public abstract CmdbImovinaVo brisiImovinu(CmdbImovinaVo value) throws Exception;
    public abstract CmdbImovinaVo azurirajImovinu(CmdbImovinaVo value) throws Exception;
    //povijest imovine
    public abstract CmdbImovinaRs citajPovijestImovine(CmdbImovinaVo value) throws Exception;
    public abstract CmdbImovinaVo dodajUrediPovijestImovine(CmdbImovinaVo value) throws Exception;
    //korisnik imovine
    public abstract CmdbImovinaKorisnikRs procitajSveKorisnikeImovine(CmdbImovinaKorisnikVo value) throws Exception;
    public abstract CmdbImovinaKorisnikVo azurirajKorisnikaImovine(CmdbImovinaKorisnikVo value) throws Exception;
    public abstract CmdbImovinaKorisnikVo dodajKorisnikaImovine(CmdbImovinaKorisnikVo value) throws Exception;
    public abstract CmdbImovinaKorisnikVo brisiKorisnikaImovine(CmdbImovinaKorisnikVo value) throws Exception;
    //djelatnik
    public abstract CmdbDjelatnikRs procitajSveDjelatnike(CmdbDjelatnikVo value) throws Exception;
    public abstract CmdbDjelatnikRs pronadiDjelatnike(CmdbDjelatnikVo value) throws Exception;
    public abstract CmdbDjelatnikVo azurirajDjelatnika(CmdbDjelatnikVo value) throws Exception;
    public abstract CmdbDjelatnikVo dodajDjelatnika(CmdbDjelatnikVo value) throws Exception;
    public abstract CmdbDjelatnikVo brisiDjelatnika(CmdbDjelatnikVo value) throws Exception;
    //izobrazba
    public abstract IzobrazbaRs procitajSveIzobrazbe(IzobrazbaVo value) throws Exception;
    public abstract IzobrazbaVo azurirajIzobrazbu(IzobrazbaVo value) throws Exception;
    public abstract IzobrazbaVo dodajIzobrazbu(IzobrazbaVo value) throws Exception;
    public abstract IzobrazbaVo brisiIzobrazbu(IzobrazbaVo value) throws Exception;
    //vjestina
    public abstract VjestinaRs procitajSveVjestine(VjestinaVo value) throws Exception;
    public abstract VjestinaVo azurirajVjestinu(VjestinaVo value) throws Exception;
    public abstract VjestinaVo dodajVjestinu(VjestinaVo value) throws Exception;
    public abstract VjestinaVo brisiVjestinu(VjestinaVo value) throws Exception;
    //djelatnik izobrazba
    public abstract DjelatnikIzobrazbaRs procitajSveIzobrazbeDjelatnika(DjelatnikIzobrazbaVo value) throws Exception;
    public abstract DjelatnikIzobrazbaVo azurirajIzobrazbuDjelatnika(DjelatnikIzobrazbaVo value) throws Exception;
    public abstract DjelatnikIzobrazbaVo dodajIzobrazbuDjelatika(DjelatnikIzobrazbaVo value) throws Exception;
    public abstract DjelatnikIzobrazbaVo brisiIzobrazbuDjelatnika(DjelatnikIzobrazbaVo value) throws Exception;
    //djelatnik vjestina
    public abstract DjelatnikVjestinaRs procitajSveVjestineDjelatnika(DjelatnikVjestinaVo value) throws Exception;
    public abstract DjelatnikVjestinaVo azurirajVjestinuDjelatnika(DjelatnikVjestinaVo value) throws Exception;
    public abstract DjelatnikVjestinaVo dodajVjestinuDjelatnika(DjelatnikVjestinaVo value) throws Exception;
    public abstract DjelatnikVjestinaVo brisiVjestinuDjelatnika(DjelatnikVjestinaVo value) throws Exception;
    //email
    public abstract EmailVo proslijediEmailom(EmailVo value) throws Exception;
    public abstract CmdbDjelatnikRs pronadiEmailDjelatnike(CmdbDjelatnikVo value) throws Exception;
    //org. jedinica
    public abstract CmdbOrgJedinicaRs procitajSveOrgJedinice(CmdbOrgJedinicaVo value) throws Exception;
    public abstract CmdbOrgJedinicaVo azurirajOrgJedinicu(CmdbOrgJedinicaVo value) throws Exception;
    public abstract CmdbOrgJedinicaVo dodajOrgJedinicu(CmdbOrgJedinicaVo value) throws Exception;
    public abstract CmdbOrgJedinicaVo brisiOrgJedinicu(CmdbOrgJedinicaVo value) throws Exception;
    public abstract AS2RecordList listajSvePoslovnice() throws Exception;
    //ostalo
    public abstract CmdbImovinaDodatakRs procitajSveDodatkeImovine(CmdbImovinaDodatakVo value) throws Exception;
    public abstract CmdbImovinaDodatakVo azurirajDodatakImovine(CmdbImovinaDodatakVo value) throws Exception;
    public abstract CmdbImovinaDodatakVo dodajDodatakImovine(CmdbImovinaDodatakVo value) throws Exception;
    public abstract CmdbImovinaDodatakVo brisiDodatakImovine(CmdbImovinaDodatakVo value) throws Exception;
    public abstract CmdbImovinaPrivitakRs procitajSvePrivitkeImovine(CmdbImovinaPrivitakVo value) throws Exception;
    public abstract CmdbImovinaPrivitakVo dodajPrivitakImovine(CmdbImovinaPrivitakVo value) throws Exception;
    public abstract CmdbImovinaPrivitakVo citajPrivitakImovine(CmdbImovinaPrivitakVo value) throws Exception;
    public abstract CmdbImovinaPrivitakVo brisiPrivitakImovine(CmdbImovinaPrivitakVo value) throws Exception;
    public abstract CmdbPromjenaPrivitakRs procitajSvePrivitkePromjene(CmdbPromjenaPrivitakVo value) throws Exception;
    public abstract CmdbPromjenaPrivitakVo dodajPrivitakPromjene(CmdbPromjenaPrivitakVo value) throws Exception;
    public abstract CmdbPromjenaPrivitakVo citajPrivitakPromjene(CmdbPromjenaPrivitakVo value) throws Exception;
    public abstract CmdbPromjenaPrivitakVo brisiPrivitakPromjene(CmdbPromjenaPrivitakVo value) throws Exception;
    public abstract CmdbKvarRs procitajSveKvaroveImovine(CmdbKvarVo value) throws Exception;
    public abstract CmdbKvarVo azurirajKvarImovine(CmdbKvarVo value) throws Exception;
    public abstract CmdbKvarVo dodajKvarImovine(CmdbKvarVo value) throws Exception;
    public abstract CmdbKvarVo brisiKvarImovine(CmdbKvarVo value) throws Exception;
    public abstract CmdbPromjenaRs procitajSvePromjene(CmdbPromjenaVo value) throws Exception;
    public abstract CmdbPromjenaRs procitajSvePromjeneImovine(CmdbPromjenaVo value) throws Exception;
    public abstract CmdbPromjenaVo azurirajPromjenuImovine(CmdbPromjenaVo value) throws Exception;
    public abstract CmdbPromjenaVo dodajPromjenuImovine(CmdbPromjenaVo value) throws Exception;
    public abstract CmdbPromjenaVo brisiPromjenuImovine(CmdbPromjenaVo value) throws Exception;
    public abstract CmdbImovinaVezaRs procitajSveVezeImovine(CmdbImovinaVezaVo value) throws Exception;
    public abstract CmdbImovinaVezaVo azurirajVezuImovine(CmdbImovinaVezaVo value) throws Exception;
    public abstract CmdbImovinaVezaVo dodajVezuImovine(CmdbImovinaVezaVo value) throws Exception;
    public abstract CmdbImovinaVezaVo brisiVezuImovine(CmdbImovinaVezaVo value) throws Exception;
    public abstract CmdbDobavljacRs procitajSveDobavljace(CmdbDobavljacVo value) throws Exception;
    public abstract CmdbDobavljacVo azurirajDobavljaca(CmdbDobavljacVo value) throws Exception;
    public abstract CmdbDobavljacVo dodajDobavljaca(CmdbDobavljacVo value) throws Exception;
    public abstract CmdbDobavljacVo brisiDobavljaca(CmdbDobavljacVo value) throws Exception;
    public abstract CmdbMrezniCvorRs procitajSveDobavljace(CmdbMrezniCvorVo value) throws Exception;
    public abstract CmdbMrezniCvorVo azurirajDobavljaca(CmdbMrezniCvorVo value) throws Exception;
    public abstract CmdbMrezniCvorVo dodajDobavljaca(CmdbMrezniCvorVo value) throws Exception;
    public abstract CmdbMrezniCvorVo brisiDobavljaca(CmdbMrezniCvorVo value) throws Exception;
    public abstract AS2RecordList listajSveKategorijeImovine() throws Exception;
    public abstract AS2RecordList listajSveKorisnickeAplikacije() throws Exception;
}