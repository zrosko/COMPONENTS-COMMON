package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/************* CONSTANTS view_naplata_gr_tekuci_pracenje ************/

public class NaplataGrTekuciBiljeskaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_KONTAKTA_TEKST = "datum_kontakta_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__VRSTA_KONTAKTA = "vrsta_kontakta";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__KONTAKT_OSTVAREN = "kontakt_ostvaren";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DOGOVOR_POSTIGNUT = "dogovor_postignut";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_BUDUCEG_KONTAKTA_TEKST = "datum_buduceg_kontakta_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_KONTAKTA = "datum_kontakta";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_BUDUCEG_KONTAKTA = "datum_buduceg_kontakta";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_DOGADAJA = "datum_dogadaja";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__REFERENT = "referent";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__STANJE_NA_DAN_DOGOVORA = "stanje_na_dan_dogovora";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__KOMENTAR = "komentar";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__ID_BILJESKE = "id_biljeske";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__ID_PRACENJA = "id_pracenja";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String VIEW_NAPLATA_GR_TEKUCI_BILJESKA__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";

	public NaplataGrTekuciBiljeskaVo() {
		super();
	}

	public NaplataGrTekuciBiljeskaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getDatumKontaktaTekst() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_KONTAKTA_TEKST);
	}

	public String getVrstaKontakta() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__VRSTA_KONTAKTA);
	}

	public String getKontaktOstvaren() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__KONTAKT_OSTVAREN);
	}

	public String getDogovorPostignut() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DOGOVOR_POSTIGNUT);
	}

	public String getDatumBuducegKontaktaTekst() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_BUDUCEG_KONTAKTA_TEKST);
	}

	public Calendar getDatumKontakta() {
		return getAsCalendar(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_KONTAKTA);
	}

	// public Calendar getDatumBuducegKontakta() {
	// return
	// getAsCalendar(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_BUDUCEG_KONTAKTA);
	// }

	public Calendar getDatumDogadaja() {
		return getAsCalendar(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_DOGADAJA);
	}

	public String getReferent() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__REFERENT);
	}

	public String getStanjeNaDanDogovora() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__STANJE_NA_DAN_DOGOVORA);
	}

	public String getKomentar() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__KOMENTAR);
	}

	public String getIdBiljeske() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__ID_BILJESKE);
	}

	public String getIdPracenja() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__ID_PRACENJA);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getOperaterZadnjeIzmjene() {
		return get(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__OPERATER_ZADNJE_IZMJENE);
	}

	/************* SETTERS ************/

	public void setDatumKontaktaTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_KONTAKTA_TEKST, value);
	}

	public void setVrstaKontakta(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__VRSTA_KONTAKTA, value);
	}

	public void setKontaktOstvaren(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__KONTAKT_OSTVAREN, value);
	}

	public void setDogovorPostignut(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DOGOVOR_POSTIGNUT, value);
	}

	public void setDatumBuducegKontaktaTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_BUDUCEG_KONTAKTA_TEKST,
				value);
	}

	public void setDatumKontakta(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_KONTAKTA);
	}

	// public void setDatumBuducegKontakta(Calendar value) {
	// setCalendarAsDateString(value,
	// VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_BUDUCEG_KONTAKTA);
	// }

	public void setDatumDogadaja(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_TEKUCI_BILJESKA__DATUM_DOGADAJA);
	}

	public void setReferent(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__REFERENT, value);
	}

	public void setStanjeNaDanDogovora(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__STANJE_NA_DAN_DOGOVORA, value);
	}

	public void setKomentar(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__KOMENTAR, value);
	}

	public void setIdBiljeske(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__ID_BILJESKE, value);
	}

	public void setIdPracenja(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__ID_PRACENJA, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_TEKUCI_BILJESKA__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setOperaterZadnjeIzmjene(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_BILJESKA__OPERATER_ZADNJE_IZMJENE, value);
	}
}