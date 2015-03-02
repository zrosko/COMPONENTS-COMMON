package hr.adriacomsoftware.app.common.crm.kontakt.dto;

import hr.as2.inf.common.data.AS2Record;

/************* CONSTANTS kontakt_privitak ************/

public class KontaktPrivitakVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String KONTAKT_PRIVITAK__ID_PRIVITKA = "id_privitka";
	public static String KONTAKT_PRIVITAK__ID_AKTIVNOSTI = "id_aktivnosti";
	public static String KONTAKT_PRIVITAK__NAZIV_DOKUMENTA = "naziv_dokumenta";
	public static String KONTAKT_PRIVITAK__AUTOR = "autor";
	public static String KONTAKT_PRIVITAK__KLJUCNE_RIJECI = "kljucne_rijeci";
	public static String KONTAKT_PRIVITAK__SAZETAK = "sazetak";
	public static String KONTAKT_PRIVITAK__DOKUMENT = "dokument";
	public static String KONTAKT_PRIVITAK__ISPRAVNO = "ispravno";

	public KontaktPrivitakVo() {
		super();
	}

	public KontaktPrivitakVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdPrivitka() {
		return getAsStringOrEmpty(KONTAKT_PRIVITAK__ID_PRIVITKA);
	}

	public String getIdAktivnosti() {
		return getAsStringOrEmpty(KONTAKT_PRIVITAK__ID_AKTIVNOSTI);
	}

	public String getNazivDokumenta() {
		return getAsStringOrEmpty(KONTAKT_PRIVITAK__NAZIV_DOKUMENTA);
	}

	public String getAutor() {
		return getAsStringOrEmpty(KONTAKT_PRIVITAK__AUTOR);
	}

	public String getKljucneRijeci() {
		return getAsStringOrEmpty(KONTAKT_PRIVITAK__KLJUCNE_RIJECI);
	}

	public String getSazetak() {
		return getAsStringOrEmpty(KONTAKT_PRIVITAK__SAZETAK);
	}

	public String getDokument() {
		return getAsStringOrEmpty(KONTAKT_PRIVITAK__DOKUMENT);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(KONTAKT_PRIVITAK__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdPrivitka(String value) {
		set(KONTAKT_PRIVITAK__ID_PRIVITKA, value);
	}

	public void setIdAktivnosti(String value) {
		set(KONTAKT_PRIVITAK__ID_AKTIVNOSTI, value);
	}

	public void setNazivDokumenta(String value) {
		set(KONTAKT_PRIVITAK__NAZIV_DOKUMENTA, value);
	}

	public void setAutor(String value) {
		set(KONTAKT_PRIVITAK__AUTOR, value);
	}

	public void setKljucneRijeci(String value) {
		set(KONTAKT_PRIVITAK__KLJUCNE_RIJECI, value);
	}

	public void setSazetak(String value) {
		set(KONTAKT_PRIVITAK__SAZETAK, value);
	}

	public void setDokument(String value) {
		set(KONTAKT_PRIVITAK__DOKUMENT, value);
	}

	public void setIspravno(String value) {
		set(KONTAKT_PRIVITAK__ISPRAVNO, value);
	}
}