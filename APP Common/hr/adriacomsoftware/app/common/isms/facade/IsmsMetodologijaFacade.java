package hr.adriacomsoftware.app.common.isms.facade;

import hr.adriacomsoftware.app.common.isms.dto.IsmsImovinaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsKategorijaImovineRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsKategorijaImovineVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsKontrolaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsKontrolaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsLokacijaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsLokacijaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsPrijetnjaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsPrijetnjaVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRanjivostRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRanjivostVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsVo;
import hr.adriacomsoftware.app.common.isms.dto.IsmsZgradaRs;
import hr.adriacomsoftware.app.common.isms.dto.IsmsZgradaVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface IsmsMetodologijaFacade {
	public abstract IsmsVo azurirajMetodologiju(IsmsVo value) throws Exception;
	public abstract IsmsRs procitajSveMetodologije(IsmsVo value) throws Exception;
	public abstract IsmsVo dodajMetodologiju(IsmsVo value) throws Exception;
	public abstract IsmsVo brisiMetodologiju(IsmsVo value) throws Exception;
    //lookup
    public abstract AS2RecordList listajSveKategorijeImovine() throws Exception;
    public abstract AS2RecordList listajSveKategorijeImovineKratko() throws Exception;
    public abstract AS2RecordList listajSveKategorijeImovineVrsta(IsmsImovinaVo value) throws Exception;
    public abstract AS2RecordList listajSveLokacije() throws Exception;
    public abstract AS2RecordList listajSveLokacijeVrsta(IsmsLokacijaVo value) throws Exception;
	public abstract AS2RecordList listajSvaRanjivosti() throws Exception;
	public abstract AS2RecordList listajSvePrijetnje() throws Exception;
	public abstract AS2RecordList listajSvePrijetnjeVrsta(IsmsPrijetnjaVo value) throws Exception;
	public abstract AS2RecordList listajSveKontrole() throws Exception;
    public abstract AS2RecordList listajSvePovjerljivosti() throws Exception;
    public abstract AS2RecordList listajSveCjelovitosti() throws Exception;
    public abstract AS2RecordList listajSveRaspolozivosti() throws Exception;
    public abstract AS2RecordList listajSveVaznosti() throws Exception;
    public abstract AS2RecordList listajSveOdgovornosti() throws Exception;
    public abstract AS2RecordList listajSveDokazivosti() throws Exception;
    public abstract AS2RecordList listajSveVjerojatnostiOtkrivanja() throws Exception;
    public abstract AS2RecordList listajSveVrstePrijetnje() throws Exception;
    public abstract AS2RecordList listajSveVjerojatnostiPrijetnje() throws Exception;
    public abstract AS2RecordList listajSveVrsteRanjivosti() throws Exception;
    public abstract AS2RecordList listajSvePosljedicaRanjivosti() throws Exception;
    public abstract AS2RecordList listajSveZgrade() throws Exception;
    public abstract AS2RecordList listajSveRanjivostiVrsta(IsmsRanjivostVo value) throws Exception;
    //prijetnje
    public abstract IsmsPrijetnjaRs citajSvePrijetnje(IsmsPrijetnjaVo value) throws Exception;
    public abstract IsmsPrijetnjaRs pronadiSvePrijetnje(IsmsPrijetnjaVo value) throws Exception;
    public abstract IsmsPrijetnjaVo dodajPrijetnju(IsmsPrijetnjaVo value) throws Exception;
    public abstract IsmsPrijetnjaVo citajPrijetnju(IsmsPrijetnjaVo value) throws Exception;
    public abstract IsmsPrijetnjaVo duplicirajPrijetnju(IsmsPrijetnjaVo value) throws Exception;
    public abstract IsmsPrijetnjaVo brisiPrijetnju(IsmsPrijetnjaVo value) throws Exception;
    public abstract IsmsPrijetnjaVo azurirajPrijetnju(IsmsPrijetnjaVo value)throws Exception;
    //ranjivosti
    public abstract IsmsRanjivostRs citajSveRanjivosti(IsmsRanjivostVo value) throws Exception;
    public abstract IsmsRanjivostRs pronadiSveRanjivosti(IsmsRanjivostVo value) throws Exception;
    public abstract IsmsRanjivostVo dodajRanjivost(IsmsRanjivostVo value) throws Exception;
    public abstract IsmsRanjivostVo citajRanjivost(IsmsRanjivostVo value) throws Exception;
    public abstract IsmsRanjivostVo duplicirajRanjivost(IsmsRanjivostVo value) throws Exception;
    public abstract IsmsRanjivostVo brisiRanjivost(IsmsRanjivostVo value) throws Exception;
    public abstract IsmsRanjivostVo azurirajRanjivost(IsmsRanjivostVo value) throws Exception;    
    //zgrada
    public abstract IsmsZgradaRs procitajSveZgrade(IsmsZgradaVo value) throws Exception;
    public abstract IsmsZgradaVo azurirajZgradu(IsmsZgradaVo value) throws Exception;
    public abstract IsmsZgradaVo dodajZgradu(IsmsZgradaVo value) throws Exception;
    public abstract IsmsZgradaVo brisiZgradu(IsmsZgradaVo value) throws Exception;
    //lokacija
    public abstract IsmsLokacijaRs procitajSveLokacije(IsmsLokacijaVo value) throws Exception;
    public abstract IsmsLokacijaVo azurirajLokaciju(IsmsLokacijaVo value) throws Exception;
    public abstract IsmsLokacijaVo dodajLokaciju(IsmsLokacijaVo value) throws Exception;
    public abstract IsmsLokacijaVo brisiLokaciju(IsmsLokacijaVo value) throws Exception;
    //kontrole
    public abstract IsmsKontrolaRs citajSveKontrole(IsmsKontrolaVo value) throws Exception;
    public abstract IsmsKontrolaRs citajSveKontroleStatus(IsmsKontrolaVo value) throws Exception;
    public abstract IsmsKontrolaRs pronadiSveKontrole(IsmsKontrolaVo value) throws Exception;
    public abstract IsmsKontrolaVo dodajKontrolu(IsmsKontrolaVo value) throws Exception;
    public abstract IsmsKontrolaVo citajKontrolu(IsmsKontrolaVo value) throws Exception;
    public abstract IsmsKontrolaVo duplicirajKontrolu(IsmsKontrolaVo value) throws Exception;
    public abstract IsmsKontrolaVo brisiKontrolu(IsmsKontrolaVo value) throws Exception;
    public abstract IsmsKontrolaVo azurirajKontrolu(IsmsKontrolaVo value)throws Exception;
    //kategorija imovine
    public abstract IsmsKategorijaImovineRs procitajSveKategorije(IsmsKategorijaImovineVo value) throws Exception;
    public abstract IsmsKategorijaImovineVo azurirajKategoriju(IsmsKategorijaImovineVo value) throws Exception;
    public abstract IsmsKategorijaImovineVo dodajKategoriju(IsmsKategorijaImovineVo value) throws Exception;
    public abstract IsmsKategorijaImovineVo brisiKategoriju(IsmsKategorijaImovineVo value) throws Exception;
}
