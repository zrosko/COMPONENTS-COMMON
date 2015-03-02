package hr.adriacomsoftware.app.common.pravneosobe.bonitet.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class BonitetBilancaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
    public BonitetBilancaVo() {
        super();
    }
    public BonitetBilancaVo(AS2Record value) {
        super(value);
    }
   
}