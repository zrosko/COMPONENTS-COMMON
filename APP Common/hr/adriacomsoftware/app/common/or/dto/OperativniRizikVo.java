package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class OperativniRizikVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public final static String INDIKATOR_ONE = "1";
	public final static String INDIKATOR_ZERO = "0";
	public final static String ISPRAVNO = "ispravno";
	public static String ENTITET = "@entitet";

	/* Attributes names /> */
	/* </ Constructors */
	public OperativniRizikVo() {
		super();
	}

	public OperativniRizikVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public void setIspravnoNE() {
		set(ISPRAVNO, INDIKATOR_ZERO);
	}

	public void setIspravnoDA() {
		set(ISPRAVNO, INDIKATOR_ONE);
	}
	/* </ Getters */

	/* Getters /> */
	/* </ Setters */

	/* Setters /> */
}