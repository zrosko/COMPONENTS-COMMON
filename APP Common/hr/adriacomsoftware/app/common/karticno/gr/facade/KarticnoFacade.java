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

public interface KarticnoFacade {
	//zahtjev
	public abstract McardGrZahtjevVo brisiMcardGrZahtjev(McardGrZahtjevVo value) throws Exception;
	public abstract McardGrZahtjevVo dodajMcardGrZahtjev(McardGrZahtjevVo value) throws Exception;
	public abstract McardGrZahtjevVo azurirajMcardGrZahtjev(McardGrZahtjevVo value) throws Exception;
	public abstract McardGrZahtjevRs procitajSveMcardGrZahtjev(McardGrZahtjevVo value) throws Exception;
	public abstract McardGrZahtjevVo procitajMcardGrZahtjev(McardGrZahtjevVo value)throws Exception;
	public abstract AS2RecordList listajSveMcardGrZahtjev() throws Exception;
	public abstract McardGrZahtjevRs pretraziMcardGrZahtjev(McardGrZahtjevVo value) throws Exception;
	
	public abstract McardGrZahtjevVo ucitajPodatkeZaMcardGrZahtjev(McardGrZahtjevVo value)throws Exception;
	public abstract McardGrZahtjevRs procitajSifre(McardGrZahtjevVo value) throws Exception;
	
	//pokazatelj
	public abstract McardGrPokazateljVo brisiMcardGrPokazatelj(McardGrPokazateljVo value) throws Exception;
	public abstract McardGrPokazateljVo dodajMcardGrPokazatelj(McardGrPokazateljVo value) throws Exception;
	public abstract McardGrPokazateljVo azurirajMcardGrPokazatelj(McardGrPokazateljVo value) throws Exception;
	public abstract McardGrPokazateljRs procitajSveMcardGrPokazatelj(McardGrPokazateljVo value) throws Exception;
	public abstract AS2RecordList listajSveMcardGrPokazatelj() throws Exception;
	public abstract McardGrPokazateljRs pretraziMcardGrPokazatelj(McardGrPokazateljVo value) throws Exception;
	
	//ocjene
	public abstract McardGrZahtjevOcjenaVo brisiMcardGrZahtjevSveOcjene(McardGrZahtjevOcjenaVo value) throws Exception;
	public abstract McardGrZahtjevOcjenaVo brisiMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws Exception;
	public abstract McardGrZahtjevOcjenaVo dodajMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws Exception;
	public abstract McardGrZahtjevOcjenaVo azurirajMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws Exception;
	public abstract McardGrZahtjevOcjenaRs procitajSveMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws Exception;
	public abstract AS2RecordList listajSveMcardGrZahtjevOcjena() throws Exception;
	public abstract McardGrZahtjevOcjenaRs pretraziMcardGrZahtjevOcjena(McardGrZahtjevOcjenaVo value) throws Exception;
	
	//priprema ocjena
    public abstract McardGrZahtjevOcjenaRs pripremaOcjena(McardGrZahtjevOcjenaVo value) throws Exception;
   
    //Izvjestaji
    public abstract McardGrZahtjevRs izvjestaji(McardGrZahtjevVo value) throws Exception;

    //privitak
    public McardGrZahtjevPrivitakRs procitajSvePrivitke(McardGrZahtjevPrivitakVo value) throws Exception;
    public McardGrZahtjevPrivitakVo dodajPrivitak(McardGrZahtjevPrivitakVo value) throws Exception;
    public McardGrZahtjevPrivitakVo citajPrivitak(McardGrZahtjevPrivitakVo value) throws Exception;
    public McardGrZahtjevPrivitakVo brisiPrivitak(McardGrZahtjevPrivitakVo value) throws Exception;
    
    public abstract OsnovniRs procitajSvePartijeStednje(OsnovniVo value) throws Exception;
	public abstract OsnovniRs procitajSvePartijeMcard(OsnovniVo value) throws Exception;
	public abstract OsnovniRs procitajPartijeTekuci(OsnovniVo value)throws Exception;

}
