package hr.adriacomsoftware.app.common.naplata.facade;

import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrKreditiRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrKreditiVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface NaplataGrKreditiFacade {
	public abstract NaplataGrKreditiVo brisiNaplataGrKrediti(NaplataGrKreditiVo value) throws Exception;
	public abstract NaplataGrKreditiVo dodajNaplataGrKrediti(NaplataGrKreditiVo value) throws Exception;
	public abstract NaplataGrKreditiVo azurirajNaplataGrKrediti(NaplataGrKreditiVo value) throws Exception;
	public abstract NaplataGrKreditiRs procitajSveNaplataGrKrediti(NaplataGrKreditiVo value) throws Exception;
	public abstract AS2RecordList listajSveNaplataGrKrediti() throws Exception;
	public abstract NaplataGrKreditiRs pretraziNaplataGrKrediti(NaplataGrKreditiVo value) throws Exception;
	public abstract NaplataGrKreditiRs procitajPovijestPolja(NaplataGrKreditiVo value) throws Exception;
	public abstract NaplataGrKreditiRs izvjestaji(NaplataGrKreditiVo value) throws Exception;
	public abstract NaplataGrKreditiRs izvjestajReferat(NaplataGrKreditiVo value) throws Exception;
	
	
}
