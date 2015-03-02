package hr.adriacomsoftware.app.common.gk.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

public interface GlavnaKnjigaFacade {
    
	public abstract OsnovniRs procitajSveStavke(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pronadiSveStavke(OsnovniVo value) throws Exception;
	public abstract AS2RecordList temeljnica(AS2Record value) throws Exception;
}