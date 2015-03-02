package hr.adriacomsoftware.app.common.bpm.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class BpmVo extends AS2Record {
	private static final long serialVersionUID = 1L;

	public BpmVo() {
		super();
	}

	public BpmVo(AS2Record value) {
		super(value);
	}

	public void setIspravnoNE() {
		set(ISPRAVNO, INDIKATOR_ZERO);
	}

	public void setIspravnoDA() {
		set(ISPRAVNO, INDIKATOR_ONE);
	}
}