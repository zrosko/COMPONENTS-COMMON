package hr.adriacomsoftware.app.common.pravneosobe.krediti.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;

public interface KreditniProgramFacade {
	public abstract OsnovniVo azurirajPartijuZaKreditniProgram(OsnovniVo value) throws Exception;
	public abstract OsnovniRs procitajSvePartijeZaKreditniProgram(OsnovniVo value) throws Exception;
	public abstract OsnovniVo dodajPartijuZaKreditniProgram(OsnovniVo value) throws Exception;
	public abstract OsnovniVo brisiPartijuZaKreditniProgram(OsnovniVo value) throws Exception;
}
