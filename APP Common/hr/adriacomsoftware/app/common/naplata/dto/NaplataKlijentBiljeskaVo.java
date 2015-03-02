package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class NaplataKlijentBiljeskaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String NAPLATA_KLIJENT_BILJESKA__ID_BILJESKE = "id_biljeske";
	public static String NAPLATA_KLIJENT_BILJESKA__OIB = "oib";
	public static String NAPLATA_KLIJENT_BILJESKA__BROJ_PARTIJE = "broj_partije";
	public static String NAPLATA_KLIJENT_BILJESKA__VRSTA = "vrsta";
	public static String NAPLATA_KLIJENT_BILJESKA__DATUM_DOGADAJA = "datum_dogadaja";
	public static String NAPLATA_KLIJENT_BILJESKA__OPIS_SITUACIJE = "opis_situacije";
	public static String NAPLATA_KLIJENT_BILJESKA__ODGOVOR_KLIJENTA = "odgovor_klijenta";
	public static String NAPLATA_KLIJENT_BILJESKA__PREPORUKA_SLUZBE = "preporuka_sluzbe";
	public static String NAPLATA_KLIJENT_BILJESKA__ODLUKA_UPRAVE = "odluka_uprave";
	public static String NAPLATA_KLIJENT_BILJESKA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";

	/* Attributes names /> */
	/* </ Constructors */
	public NaplataKlijentBiljeskaVo() {
		super();
	}

	public NaplataKlijentBiljeskaVo(AS2Record value) {
		super(value);
	}

	public String getIdBiljeske() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_BILJESKA__ID_BILJESKE);
	}

	public String getOib() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_BILJESKA__OIB);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_BILJESKA__BROJ_PARTIJE);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_BILJESKA__VRSTA);
	}

	public Calendar getDatumDogadaja() {
		return getAsCalendar(NAPLATA_KLIJENT_BILJESKA__DATUM_DOGADAJA);
	}

	public String getOpisSituacije() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_BILJESKA__OPIS_SITUACIJE);
	}

	public String getOdgovorKlijenta() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_BILJESKA__ODGOVOR_KLIJENTA);
	}

	public String getPreporukaSluzbe() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_BILJESKA__PREPORUKA_SLUZBE);
	}

	public String getOdlukaUprave() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_BILJESKA__ODLUKA_UPRAVE);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(NAPLATA_KLIJENT_BILJESKA__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setIdBiljeske(String value) {
		set(NAPLATA_KLIJENT_BILJESKA__ID_BILJESKE, value);
	}

	public void setOib(String value) {
		set(NAPLATA_KLIJENT_BILJESKA__OIB, value);
	}

	public void setBrojPartije(String value) {
		set(NAPLATA_KLIJENT_BILJESKA__BROJ_PARTIJE, value);
	}

	public void setVrsta(String value) {
		set(NAPLATA_KLIJENT_BILJESKA__VRSTA, value);
	}

	public void setDatumDogadaja(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_KLIJENT_BILJESKA__DATUM_DOGADAJA);
	}

	public void setOpisSituacije(String value) {
		set(NAPLATA_KLIJENT_BILJESKA__OPIS_SITUACIJE, value);
	}

	public void setOdgovorKlijenta(String value) {
		set(NAPLATA_KLIJENT_BILJESKA__ODGOVOR_KLIJENTA, value);
	}

	public void setPreporukaSluzbe(String value) {
		set(NAPLATA_KLIJENT_BILJESKA__PREPORUKA_SLUZBE, value);
	}

	public void setOdlukaUprave(String value) {
		set(NAPLATA_KLIJENT_BILJESKA__ODLUKA_UPRAVE, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_KLIJENT_BILJESKA__VRIJEME_ZADNJE_IZMJENE);
	}

}