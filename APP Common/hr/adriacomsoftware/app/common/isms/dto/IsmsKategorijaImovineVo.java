package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

public class IsmsKategorijaImovineVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_KATEGORIJA_IMOVINE__ID_KATEGORIJE = "id_kategorije";
	public static String ISMS_KATEGORIJA_IMOVINE__NOVI_ID_KATEGORIJE = "novi_id_kategorije";
	public static String ISMS_KATEGORIJA_IMOVINE__NAZIV = "naziv";
	public static String ISMS_KATEGORIJA_IMOVINE__OPIS = "opis";
	public static String ISMS_KATEGORIJA_IMOVINE__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsKategorijaImovineVo() {
		super();
	}

	public IsmsKategorijaImovineVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdKategorije() {
		return getAsStringOrEmpty(ISMS_KATEGORIJA_IMOVINE__ID_KATEGORIJE);
	}

	public String getNoviIdKategorije() {
		return getAsStringOrEmpty(ISMS_KATEGORIJA_IMOVINE__NOVI_ID_KATEGORIJE);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS_KATEGORIJA_IMOVINE__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(ISMS_KATEGORIJA_IMOVINE__OPIS);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(ISMS_KATEGORIJA_IMOVINE__ISPRAVNO);
	}

	public void setIdKategorije(String value) {
		set(ISMS_KATEGORIJA_IMOVINE__ID_KATEGORIJE, value);
	}

	public void setNoviIdKategorije(String value) {
		set(ISMS_KATEGORIJA_IMOVINE__NOVI_ID_KATEGORIJE, value);
	}

	public void setNaziv(String value) {
		set(ISMS_KATEGORIJA_IMOVINE__NAZIV, value);
	}

	public void setOpis(String value) {
		set(ISMS_KATEGORIJA_IMOVINE__OPIS, value);
	}

	public void setIspravno(String value) {
		set(ISMS_KATEGORIJA_IMOVINE__ISPRAVNO, value);
	}
	/* Getters/Setters /> */
}