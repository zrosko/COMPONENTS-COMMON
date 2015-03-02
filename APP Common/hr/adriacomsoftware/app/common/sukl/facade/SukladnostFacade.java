package hr.adriacomsoftware.app.common.sukl.facade;

import hr.adriacomsoftware.app.common.sukl.dto.SuklAktRs;
import hr.adriacomsoftware.app.common.sukl.dto.SuklAktVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface SukladnostFacade {
	public abstract SuklAktVo brisiSuklAkt(SuklAktVo value) throws Exception;
	public abstract SuklAktVo dodajSuklAkt(SuklAktVo value) throws Exception;
	public abstract SuklAktVo azurirajSuklAkt(SuklAktVo value) throws Exception;
	public abstract SuklAktRs procitajSveSuklAkt(SuklAktVo value) throws Exception;
	public abstract AS2RecordList listajSveSuklAkt() throws Exception;
	public abstract SuklAktRs pretraziSuklAkt(SuklAktVo value) throws Exception;
}
