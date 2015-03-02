package hr.adriacomsoftware.app.common.gradani.naplata.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.OpomenaRs;
import hr.adriacomsoftware.app.common.gradani.krediti.dto.OpomenaVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;

public interface NaplataGradaniFacade {
	public abstract OsobaRs procitajSveGradaneNaplata() throws Exception;
	public abstract OsobaRs pronadiSveGradaneNaplata(OsnovniVo value) throws Exception;
	public abstract OpomenaRs izvjestajOpomeneKredita(OpomenaVo value) throws Exception;
	public abstract OsnovniRs pregledUgovora(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pregledPrometa(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pregledBoniteta(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pregledStanja(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pregledVezanihOsoba(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pregledRezervacija(OsnovniVo value) throws Exception;
}