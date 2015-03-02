package hr.adriacomsoftware.app.common.crm.kontakt.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/************* CONSTANTS kontakt_aktivnost ************/

public class KontaktAktivnostVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String KONTAKT_AKTIVNOST__ID_AKTIVNOSTI = "id_aktivnosti";
	public static String KONTAKT_AKTIVNOST__ID_KLIJENTA = "id_klijenta";
	public static String KONTAKT_AKTIVNOST__ID_PREDMETA = "id_predmeta";
	public static String KONTAKT_AKTIVNOST__ID_KONTAKTA = "id_kontakta";
	public static String KONTAKT_AKTIVNOST__OIB = "oib";
	public static String KONTAKT_AKTIVNOST__KORISNIK = "korisnik";
	public static String KONTAKT_AKTIVNOST__DATUM = "datum";
	public static String KONTAKT_AKTIVNOST__DATUM_REALIZACIJE = "datum_realizacije";
	public static String KONTAKT_AKTIVNOST__DATUM_BUDUCEG_KONTAKTA = "datum_buduceg_kontakta";
	public static String KONTAKT_AKTIVNOST__NAZIV = "naziv";
	public static String KONTAKT_AKTIVNOST__KATEGORIJA = "kategorija";
	public static String KONTAKT_AKTIVNOST__PODKATEGORIJA = "podkategorija";
	public static String KONTAKT_AKTIVNOST__KANAL = "kanal";
	public static String KONTAKT_AKTIVNOST__ULAZNO_IZLAZNO = "ulazno_izlazno";
	public static String KONTAKT_AKTIVNOST__KONTAKT_OSTVAREN = "kontakt_ostvaren";
	public static String KONTAKT_AKTIVNOST__PRIORITET = "prioritet";
	public static String KONTAKT_AKTIVNOST__OPIS = "opis";
	public static String KONTAKT_AKTIVNOST__ISPRAVNO = "ispravno";
	public static String KONTAKT_AKTIVNOST__ID_TEMP = "id_temp";

	public KontaktAktivnostVo() {
		super();
	}

	public KontaktAktivnostVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdAktivnosti() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__ID_AKTIVNOSTI);
	}

	public String getIdKlijenta() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__ID_KLIJENTA);
	}

	public String getIdPredmeta() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__ID_PREDMETA);
	}

	public String getIdKontakta() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__ID_KONTAKTA);
	}

	public String getOib() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__OIB);
	}

	public String getKorisnik() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__KORISNIK);
	}

	public Calendar getDatum() {
		return getAsCalendar(KONTAKT_AKTIVNOST__DATUM);
	}

	public Calendar getDatumRealizacije() {
		return getAsCalendar(KONTAKT_AKTIVNOST__DATUM_REALIZACIJE);
	}

	public Calendar getDatumBuducegKontakta() {
		return getAsCalendar(KONTAKT_AKTIVNOST__DATUM_BUDUCEG_KONTAKTA);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__NAZIV);
	}

	public String getKategorija() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__KATEGORIJA);
	}

	public String getPodkategorija() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__PODKATEGORIJA);
	}

	public String getKanal() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__KANAL);
	}

	public String getUlaznoIzlazno() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__ULAZNO_IZLAZNO);
	}

	public String getKontaktOstvaren() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__KONTAKT_OSTVAREN);
	}

	public String getPrioritet() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__PRIORITET);
	}

	public String getOpis() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__OPIS);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(KONTAKT_AKTIVNOST__ISPRAVNO);
	}

	public Calendar getIdTemp() {
		return getAsCalendar(KONTAKT_AKTIVNOST__ID_TEMP);
	}

	/************* SETTERS ************/

	public void setIdAktivnosti(String value) {
		set(KONTAKT_AKTIVNOST__ID_AKTIVNOSTI, value);
	}

	public void setIdKlijenta(String value) {
		set(KONTAKT_AKTIVNOST__ID_KLIJENTA, value);
	}

	public void setIdPredmeta(String value) {
		set(KONTAKT_AKTIVNOST__ID_PREDMETA, value);
	}

	public void setIdKontakta(String value) {
		set(KONTAKT_AKTIVNOST__ID_KONTAKTA, value);
	}

	public void setOib(String value) {
		set(KONTAKT_AKTIVNOST__OIB, value);
	}

	public void setKorisnik(String value) {
		set(KONTAKT_AKTIVNOST__KORISNIK, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, KONTAKT_AKTIVNOST__DATUM);
	}

	public void setDatumRealizacije(Calendar value) {
		setCalendarAsDateString(value, KONTAKT_AKTIVNOST__DATUM_REALIZACIJE);
	}

	public void setDatumBuducegKontakta(Calendar value) {
		setCalendarAsDateString(value,
				KONTAKT_AKTIVNOST__DATUM_BUDUCEG_KONTAKTA);
	}

	public void setNaziv(String value) {
		set(KONTAKT_AKTIVNOST__NAZIV, value);
	}

	public void setKategorija(String value) {
		set(KONTAKT_AKTIVNOST__KATEGORIJA, value);
	}

	public void setPodkategorija(String value) {
		set(KONTAKT_AKTIVNOST__PODKATEGORIJA, value);
	}

	public void setKanal(String value) {
		set(KONTAKT_AKTIVNOST__KANAL, value);
	}

	public void setUlaznoIzlazno(String value) {
		set(KONTAKT_AKTIVNOST__ULAZNO_IZLAZNO, value);
	}

	public void setKontaktOstvaren(String value) {
		set(KONTAKT_AKTIVNOST__KONTAKT_OSTVAREN, value);
	}

	public void setPrioritet(String value) {
		set(KONTAKT_AKTIVNOST__PRIORITET, value);
	}

	public void setOpis(String value) {
		set(KONTAKT_AKTIVNOST__OPIS, value);
	}

	public void setIspravno(String value) {
		set(KONTAKT_AKTIVNOST__ISPRAVNO, value);
	}

	public void setIdTemp(Calendar value) {
		setCalendarAsDateString(value, KONTAKT_AKTIVNOST__ID_TEMP);
	}
}