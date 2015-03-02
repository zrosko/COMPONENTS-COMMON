package hr.adriacomsoftware.app.common.pravneosobe.naplata.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OpomenaRs;
import hr.adriacomsoftware.app.common.pravneosobe.krediti.dto.OpomenaVo;
import hr.as2.inf.common.exceptions.AS2Exception;

public interface NaplataPravnihOsobaFacade {
    
	public abstract PravnaOsobaRs procitajSvePravneOsobeNaplata() throws AS2Exception;
	public abstract PravnaOsobaRs pronadiSvePravneOsobeNaplata(OsnovniVo value) throws AS2Exception;
	public abstract OpomenaRs izvjestajOpomeneKredita(OpomenaVo value) throws AS2Exception;
	//detalji
	public abstract OsnovniRs pregledUgovora(OsnovniVo value) throws AS2Exception;
	public abstract OsnovniRs pregledPrometa(OsnovniVo value) throws AS2Exception;
	public abstract OsnovniRs pregledBoniteta(OsnovniVo value) throws AS2Exception;
	public abstract OsnovniRs pregledStanja(OsnovniVo value) throws AS2Exception;
	public abstract OsnovniRs pregledVezanihOsoba(OsnovniVo value) throws AS2Exception;
	public abstract OsnovniRs pregledRezervacija(OsnovniVo value) throws AS2Exception;
}