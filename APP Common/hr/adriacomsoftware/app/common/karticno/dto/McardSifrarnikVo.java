package hr.adriacomsoftware.app.common.karticno.dto;

import hr.as2.inf.common.data.AS2Record;

public class McardSifrarnikVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String MCARD_SIFRARNIK__ID = "id";
	public static String MCARD_SIFRARNIK__VRSTA = "vrsta";
	public static String MCARD_SIFRARNIK__RB = "rb";
	public static String MCARD_SIFRARNIK__ID_SIFRE = "id_sifre";
	public static String MCARD_SIFRARNIK__NAZIV_SIFRE = "naziv_sifre";
	public static String MCARD_SIFRARNIK__ISPRAVNO = "ispravno";

	public McardSifrarnikVo() {
		super();
	}

	public McardSifrarnikVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getId() {
		return getAsStringOrEmpty(MCARD_SIFRARNIK__ID);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(MCARD_SIFRARNIK__VRSTA);
	}

	public String getRb() {
		return getAsStringOrEmpty(MCARD_SIFRARNIK__RB);
	}

	public String getIdSifre() {
		return getAsStringOrEmpty(MCARD_SIFRARNIK__ID_SIFRE);
	}

	public String getNazivSifre() {
		return getAsStringOrEmpty(MCARD_SIFRARNIK__NAZIV_SIFRE);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(MCARD_SIFRARNIK__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setId(String value) {
		set(MCARD_SIFRARNIK__ID, value);
	}

	public void setVrsta(String value) {
		set(MCARD_SIFRARNIK__VRSTA, value);
	}

	public void setRb(String value) {
		set(MCARD_SIFRARNIK__RB, value);
	}

	public void setIdSifre(String value) {
		set(MCARD_SIFRARNIK__ID_SIFRE, value);
	}

	public void setNazivSifre(String value) {
		set(MCARD_SIFRARNIK__NAZIV_SIFRE, value);
	}

	public void setIspravno(String value) {
		set(MCARD_SIFRARNIK__ISPRAVNO, value);
	}
}
