package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * TEST.
 */
public class CmdbVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public final static String CMDB__TEST = "test";
	public final static String ISPRAVNO = "ispravno";
	public final static String CMDB__NAZIV = "naziv";
	public final static String INDIKATOR_ONE = "1";
	public final static String INDIKATOR_ZERO = "0";

	/* Attributes names /> */
	/* </ Constructors */
	public CmdbVo() {
		super();
	}

	public CmdbVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */

	/* </ Getters */
	public void setIspravnoNE() {
		set(ISPRAVNO, INDIKATOR_ZERO);
	}

	public void setIspravnoDA() {
		set(ISPRAVNO, INDIKATOR_ONE);
	}

	/* Getters /> */
	/* </ Setters */
	public String getNaziv() {
		return getAsString(CMDB__NAZIV);
	}

	public void setNaziv(String value) {
		set(CMDB__NAZIV, value);
	}
	/* Setters /> */
}