package hr.adriacomsoftware.app.common.sudskisporovi.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;

public interface SudskiSporoviFacade {
    public abstract OsnovniRs pronadiSveSudove(OsnovniVo value) throws Exception;
    public abstract OsnovniRs pronadiSveBiljeznike(OsnovniVo value) throws Exception;
    public abstract OsnovniRs pronadiSveSudoveJavneBiljeznikeInstitucije(OsnovniVo value) throws Exception;
 }
