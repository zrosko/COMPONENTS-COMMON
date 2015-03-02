package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class IsmsVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public final static String ISMS__TABLE = "@@isms_table";
	public final static String ISMS__STUPANJ = "stupanj";
	public final static String ISMS__NAZIV = "naziv";
	public final static String ISMS__OPIS = "opis";
	public final static String ISMS__DATUM = "datum";
	// imovina
	public static String ID_KATEGORIJE = "id_kategorije";
	public static String NAZIV = "naziv";
	public static String CJELOVITOST = "cjelovitost";
	public static String RASPOLOZIVOST = "raspolozivost";
	public static String POVJERLJIVOST = "povjerljivost";
	public static String VAZNOST = "vaznost";
	public final static String INDIKATOR_ONE = "1";
	public final static String INDIKATOR_ZERO = "0";
	public final static String ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsVo() {
		super();
	}

	public IsmsVo(AS2Record value) {
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
	public String getStupanj() {
		return getAsStringOrEmpty(ISMS__STUPANJ);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(ISMS__OPIS);
	}

	/* Getters /> */
	/* </ Setters */
	public void setStupanj(String value) {
		set(ISMS__STUPANJ, value);
	}

	public void setNaziv(String value) {
		set(ISMS__NAZIV, value);
	}

	public void setOpis(String value) {
		set(ISMS__OPIS, value);
	}
	/* Setters /> */
}