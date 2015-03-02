package hr.adriacomsoftware.app.common.jb.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.dto.OsobaVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;
import hr.as2.inf.common.data.AS2RecordList;

public interface BankaFacade {
    //lookup
	public abstract AS2RecordList listajSveDjelatnikeBankeIT() throws Exception;
    public abstract AS2RecordList listajSveRadnikeKorisnike() throws Exception; 
    public abstract AS2RecordList listajSvePoslovnice() throws Exception;
    public abstract AS2RecordList listajSveValute() throws Exception;
    public abstract AS2RecordList listajSveOpcine() throws Exception;
	public abstract AS2RecordList listajSvaMjesta() throws Exception;
	public abstract AS2RecordList listajSveZupanije() throws Exception;
	public abstract AS2RecordList listajSveDrzave(OsnovniVo value) throws Exception;
    public abstract AS2RecordList listajSveBanke() throws Exception;
    public abstract AS2RecordList listajSveBankeKratka() throws Exception;
    public abstract AS2RecordList listajSveRadnike() throws Exception;
    public abstract AS2RecordList listajSveDjelatnike() throws Exception;
    public abstract AS2RecordList listajSveDjelatnikeJmbg() throws Exception;
    public abstract AS2RecordList listajSveDjelatnikeBanke() throws Exception;
    public abstract AS2RecordList listajSveTipovePovezanihOsoba() throws Exception;
    public abstract AS2RecordList listajSvaRadnaMjesta() throws Exception;
    public abstract AS2RecordList listajSveCrneListe() throws Exception;
    public abstract OsobaRs pronadiOsobu(OsobaVo value) throws Exception;
    public abstract OsobaVo pronadiOsobuJmbg(OsobaVo value) throws Exception;
    public abstract OsobaVo pronadiOsobuOib(OsobaVo value) throws Exception;
    public abstract OsobaVo pronadiOsobuJmbgMb(OsobaVo value) throws Exception;
    public abstract OsobaVo pronadiPravnuFizickuOsobuOib(OsobaVo value) throws Exception;
    public abstract OsobaVo pronadiPravnuFizickuOsobuBrojPartije(OsobaVo value) throws Exception;
    //izvjesća 
    public abstract AS2RecordList izvjestajTecajnaLista(OsnovniVo value) throws Exception;
    public abstract AS2RecordList izvjestajOrganizacijskeJedinice() throws Exception;
    public abstract AS2RecordList izvjestajTipoviRacuna() throws Exception;
    public abstract AS2RecordList izvjestajBanke() throws Exception;
    public abstract AS2RecordList izvjestajKontniPlan() throws Exception;
    public abstract AS2RecordList izvjestajVrstePrometaRacuna() throws Exception;
    public abstract AS2RecordList listajSveVrsteTrajnihNaloga() throws Exception;
    //tromjesecna izvješća
    public abstract OsnovniRs izvjestajKreditiValutneKlauzule(OsnovniVo value) throws Exception;   
    //HNB izvješća
    public abstract OsnovniRs izvjestajObrazac4(OsnovniVo value) throws Exception; 
    public abstract OsnovniRs izvjestajObrazac1(OsnovniVo value) throws Exception;  
    //Bruto bilanca
    public abstract AS2RecordList izvjestajBrutoBilanca(OsnovniVo value) throws Exception;
    public abstract AS2RecordList listajSveDjelatnosti() throws Exception;
    public abstract AS2RecordList listajSveDjelatnostiKratko() throws Exception;
    //uloge
    public abstract AS2RecordList listajSveUloge(OsnovniVo value) throws Exception;
    public abstract AS2RecordList listajSveUlogeKomponente(OsnovniVo value) throws Exception;
    //partije
    public abstract PartijaRs listajSvePartijeZaOib(OsobaVo value) throws Exception;
    //HBOR
    public abstract OsnovniVo dodajHborPartiju(OsnovniVo value) throws Exception; 
    public abstract OsnovniVo provjeriHborPartiju(OsnovniVo value) throws Exception;
	public abstract OsnovniRs procitajUnesenePartije(OsnovniVo value) throws Exception;
    
 }
