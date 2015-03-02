package hr.adriacomsoftware.app.common.dionice.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;

public interface DioniceFacade {
    public abstract OsnovniRs dioniceRekapitulacija1(OsnovniVo value) throws Exception;
	public abstract OsnovniRs dioniceRekapitulacija2(OsnovniVo value) throws Exception;
	public abstract OsnovniRs dioniceStanjeNaDan(OsnovniVo value) throws Exception;
	public abstract OsnovniRs dioniceUsporednoStanje(OsnovniVo value) throws Exception;
	public abstract OsnovniRs citajDionice(OsnovniVo value) throws Exception;
	public abstract OsnovniRs pronadiDionice(OsnovniVo value) throws Exception;
}
