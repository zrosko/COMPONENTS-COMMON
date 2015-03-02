package hr.adriacomsoftware.app.common.rizik.rezervacije.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class RezervacijaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	public RezervacijaVo() {
		super();
	}

	public RezervacijaVo(AS2Record value) {
		super(value);
	}
}