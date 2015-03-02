package hr.adriacomsoftware.app.common.crm.obrada.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KontaktObradaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String KONTAKT_OBRADA__ID_OBRADE = "id_obrade";
	public static String KONTAKT_OBRADA__DATUM_OBRADE = "datum_obrade";
	public static String KONTAKT_OBRADA__DATUM_POCETAK = "datum_pocetak";
	public static String KONTAKT_OBRADA__DATUM_KRAJ = "datum_kraj";
	public static String KONTAKT_OBRADA__VRSTA_DOKUMENTA = "vrsta_dokumenta";
	public static String KONTAKT_OBRADA__DOKUMENT = "dokument";
	public static String KONTAKT_OBRADA__BROJ_STAVKI = "broj_stavki";
	public static String KONTAKT_OBRADA__KORISNIK = "korisnik";
	public static String KONTAKT_OBRADA__ISPRAVNO = "ispravno";

	public KontaktObradaVo() {
		super();
	}

	public KontaktObradaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdObrade() {
		return getAsStringOrEmpty(KONTAKT_OBRADA__ID_OBRADE);
	}

	public Calendar getDatumObrade() {
		return getAsCalendar(KONTAKT_OBRADA__DATUM_OBRADE);
	}

	public Calendar getDatumPocetak() {
		return getAsCalendar(KONTAKT_OBRADA__DATUM_POCETAK);
	}

	public Calendar getDatumKraj() {
		return getAsCalendar(KONTAKT_OBRADA__DATUM_KRAJ);
	}

	public String getVrstaDokumenta() {
		return getAsStringOrEmpty(KONTAKT_OBRADA__VRSTA_DOKUMENTA);
	}

	public String getDokument() {
		return getAsStringOrEmpty(KONTAKT_OBRADA__DOKUMENT);
	}

	public String getBrojStavki() {
		return getAsStringOrEmpty(KONTAKT_OBRADA__BROJ_STAVKI);
	}

	public String getKorisnik() {
		return getAsStringOrEmpty(KONTAKT_OBRADA__KORISNIK);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(KONTAKT_OBRADA__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdObrade(String value) {
		set(KONTAKT_OBRADA__ID_OBRADE, value);
	}

	public void setDatumObrade(Calendar value) {
		setCalendarAsDateString(value, KONTAKT_OBRADA__DATUM_OBRADE);
	}

	public void setDatumPocetak(Calendar value) {
		setCalendarAsDateString(value, KONTAKT_OBRADA__DATUM_POCETAK);
	}

	public void setDatumKraj(Calendar value) {
		setCalendarAsDateString(value, KONTAKT_OBRADA__DATUM_KRAJ);
	}

	public void setVrstaDokumenta(String value) {
		set(KONTAKT_OBRADA__VRSTA_DOKUMENTA, value);
	}

	public void setDokument(String value) {
		set(KONTAKT_OBRADA__DOKUMENT, value);
	}

	public void setBrojStavki(String value) {
		set(KONTAKT_OBRADA__BROJ_STAVKI, value);
	}

	public void setKorisnik(String value) {
		set(KONTAKT_OBRADA__KORISNIK, value);
	}

	public void setIspravno(String value) {
		set(KONTAKT_OBRADA__ISPRAVNO, value);
	}
}