package hr.adriacomsoftware.app.common.dionice.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class DionicaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	public DionicaVo() {
		super();
	}

	public DionicaVo(AS2Record value) {
		super(value);
	}
}