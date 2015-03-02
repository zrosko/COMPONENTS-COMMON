package hr.adriacomsoftware.app.common.crm.kontakt.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/************* CONSTANTS kontakt_predmet ************/

public class KontaktPredmetVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String KONTAKT_PREDMET__ID_PREDMETA = "id_predmeta";
	public static String KONTAKT_PREDMET__ID_KLIJENTA = "id_klijenta";
	public static String KONTAKT_PREDMET__OIB = "oib";
	public static String KONTAKT_PREDMET__NAZIV = "naziv";
	public static String KONTAKT_PREDMET__ID_IZVORNOG_PREDMETA = "id_izvornog_predmeta";
	public static String KONTAKT_PREDMET__ID_IZVORA = "id_izvora";
	public static String KONTAKT_PREDMET__KATEGORIJA = "kategorija";
	public static String KONTAKT_PREDMET__PODKATEGORIJA = "podkategorija";
	public static String KONTAKT_PREDMET__DATUM_OTVARANJA = "datum_otvaranja";
	public static String KONTAKT_PREDMET__DATUM_ZATVARANJA = "datum_zatvaranja";
	public static String KONTAKT_PREDMET__STATUS_PREDMETA = "status_predmeta";
	public static String KONTAKT_PREDMET__ZADUZENA_OSOBA = "zaduzena_osoba";
	public static String KONTAKT_PREDMET__ISPRAVNO = "ispravno";

	public KontaktPredmetVo() {
		super();
	}

	public KontaktPredmetVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdPredmeta() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__ID_PREDMETA);
	}

	public String getIdKlijenta() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__ID_KLIJENTA);
	}

	public String getOib() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__OIB);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__NAZIV);
	}

	public String getIdIzvornogPredmeta() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__ID_IZVORNOG_PREDMETA);
	}

	public String getIdIzvora() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__ID_IZVORA);
	}

	public String getKategorija() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__KATEGORIJA);
	}

	public String getPodkategorija() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__PODKATEGORIJA);
	}

	public Calendar getDatumOtvaranja() {
		return getAsCalendar(KONTAKT_PREDMET__DATUM_OTVARANJA);
	}

	public Calendar getDatumZatvaranja() {
		return getAsCalendar(KONTAKT_PREDMET__DATUM_ZATVARANJA);
	}

	public String getStatusPredmeta() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__STATUS_PREDMETA);
	}

	public String getZaduzenaOsoba() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__ZADUZENA_OSOBA);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(KONTAKT_PREDMET__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdPredmeta(String value) {
		set(KONTAKT_PREDMET__ID_PREDMETA, value);
	}

	public void setIdKlijenta(String value) {
		set(KONTAKT_PREDMET__ID_KLIJENTA, value);
	}

	public void setOib(String value) {
		set(KONTAKT_PREDMET__OIB, value);
	}

	public void setNaziv(String value) {
		set(KONTAKT_PREDMET__NAZIV, value);
	}

	public void setIdIzvornogPredmeta(String value) {
		set(KONTAKT_PREDMET__ID_IZVORNOG_PREDMETA, value);
	}

	public void setIdIzvora(String value) {
		set(KONTAKT_PREDMET__ID_IZVORA, value);
	}

	public void setKategorija(String value) {
		set(KONTAKT_PREDMET__KATEGORIJA, value);
	}

	public void setPodkategorija(String value) {
		set(KONTAKT_PREDMET__PODKATEGORIJA, value);
	}

	public void setDatumOtvaranja(Calendar value) {
		setCalendarAsDateString(value, KONTAKT_PREDMET__DATUM_OTVARANJA);
	}

	public void setDatumZatvaranja(Calendar value) {
		setCalendarAsDateString(value, KONTAKT_PREDMET__DATUM_ZATVARANJA);
	}

	public void setStatusPredmeta(String value) {
		set(KONTAKT_PREDMET__STATUS_PREDMETA, value);
	}

	public void setZaduzenaOsoba(String value) {
		set(KONTAKT_PREDMET__ZADUZENA_OSOBA, value);
	}

	public void setIspravno(String value) {
		set(KONTAKT_PREDMET__ISPRAVNO, value);
	}
}