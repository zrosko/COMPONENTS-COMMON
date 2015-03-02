package hr.adriacomsoftware.app.common.gradani.krediti.dto;

import hr.adriacomsoftware.app.common.jb.dto.BaznaOpomenaVo;
import hr.as2.inf.common.data.AS2Record;

public class OpomenaVo extends BaznaOpomenaVo {
	private static final long serialVersionUID = 1L;

	public OpomenaVo() {
		super();
	}

	public OpomenaVo(AS2Record value) {
		super(value);
	}

}