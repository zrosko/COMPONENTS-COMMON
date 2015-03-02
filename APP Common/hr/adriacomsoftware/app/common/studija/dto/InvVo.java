package hr.adriacomsoftware.app.common.studija.dto;

import hr.as2.inf.common.data.AS2Record;

public class InvVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public final static String INDIKATOR_ONE = "1";
	public final static String INDIKATOR_ZERO = "0";
	public final static String ISPRAVNO = "ispravno";
	public static String ENTITET = "@entitet";

	/* Attributes names /> */
	/* </ Constructors */
	public InvVo() {
		super();
	}

	public InvVo(AS2Record value) {
		super(value);
	}
}
