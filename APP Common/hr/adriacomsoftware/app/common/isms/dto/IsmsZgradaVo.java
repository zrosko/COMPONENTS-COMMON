package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

public class IsmsZgradaVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_ZGRADA__ID_ZGRADE = "id_zgrade";
	public static String ISMS_ZGRADA__NAZIV = "naziv";
	public static String ISMS_ZGRADA__ULICA = "ulica";
	public static String ISMS_ZGRADA__MJESTO = "mjesto";
	public static String ISMS_ZGRADA__POSTANSKI_BROJ = "postanski_broj";
	public static String ISMS_ZGRADA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsZgradaVo() {
		super();
	}

	public IsmsZgradaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdZgrade() {
		return getAsStringOrEmpty(ISMS_ZGRADA__ID_ZGRADE);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS_ZGRADA__NAZIV);
	}

	public String getUlica() {
		return getAsStringOrEmpty(ISMS_ZGRADA__ULICA);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(ISMS_ZGRADA__MJESTO);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(ISMS_ZGRADA__POSTANSKI_BROJ);
	}

	public String getOpis() {
		return getAsStringOrEmpty(ISMS_ZGRADA__OPIS);
	}

	public void setIdZgrade(String value) {
		set(ISMS_ZGRADA__ID_ZGRADE, value);
	}

	public void setNaziv(String value) {
		set(ISMS_ZGRADA__NAZIV, value);
	}

	public void setUlica(String value) {
		set(ISMS_ZGRADA__ULICA, value);
	}

	public void setMjesto(String value) {
		set(ISMS_ZGRADA__MJESTO, value);
	}

	public void setPostanskiBroj(String value) {
		set(ISMS_ZGRADA__POSTANSKI_BROJ, value);
	}

	public void setOpis(String value) {
		set(ISMS_ZGRADA__OPIS, value);
	}
	/* Getters/Setters /> */
}