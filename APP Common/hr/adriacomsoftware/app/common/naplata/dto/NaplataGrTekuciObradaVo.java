package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class NaplataGrTekuciObradaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String NAPLATA_GR_TEKUCI_OBRADA__ID_OBRADE = "id_obrade";
	public static String NAPLATA_GR_TEKUCI_OBRADA__DATUM_OBRADE = "datum_obrade";
	public static String NAPLATA_GR_TEKUCI_OBRADA__DATUM_POCETAK = "datum_pocetak";
	public static String NAPLATA_GR_TEKUCI_OBRADA__DATUM_KRAJ = "datum_kraj";
	public static String NAPLATA_GR_TEKUCI_OBRADA__VRSTA_DOKUMENTA = "vrsta_dokumenta";
	public static String NAPLATA_GR_TEKUCI_OBRADA__NAZIV_DOKUMENTA = "naziv_dokumenta";
	public static String NAPLATA_GR_TEKUCI_OBRADA__DOKUMENT = "dokument";
	public static String NAPLATA_GR_TEKUCI_OBRADA__BROJ_STAVKI = "broj_stavki";
	public static String NAPLATA_GR_TEKUCI_OBRADA__KORISNIK = "korisnik";
	public static String NAPLATA_GR_TEKUCI_OBRADA__ISPRAVNO = "ispravno";

	public NaplataGrTekuciObradaVo() {
		super();
	}

	public NaplataGrTekuciObradaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdObrade() {
		return getAsStringOrEmpty(NAPLATA_GR_TEKUCI_OBRADA__ID_OBRADE);
	}

	public Calendar getDatumObrade() {
		return getAsCalendar(NAPLATA_GR_TEKUCI_OBRADA__DATUM_OBRADE);
	}

	public Calendar getDatumPocetak() {
		return getAsCalendar(NAPLATA_GR_TEKUCI_OBRADA__DATUM_POCETAK);
	}

	public Calendar getDatumKraj() {
		return getAsCalendar(NAPLATA_GR_TEKUCI_OBRADA__DATUM_KRAJ);
	}

	public String getVrstaDokumenta() {
		return getAsStringOrEmpty(NAPLATA_GR_TEKUCI_OBRADA__VRSTA_DOKUMENTA);
	}

	public String getNazivDokumenta() {
		return getAsStringOrEmpty(NAPLATA_GR_TEKUCI_OBRADA__NAZIV_DOKUMENTA);
	}

	public String getDokument() {
		return getAsStringOrEmpty(NAPLATA_GR_TEKUCI_OBRADA__DOKUMENT);
	}

	public String getBrojStavki() {
		return getAsStringOrEmpty(NAPLATA_GR_TEKUCI_OBRADA__BROJ_STAVKI);
	}

	public String getKorisnik() {
		return getAsStringOrEmpty(NAPLATA_GR_TEKUCI_OBRADA__KORISNIK);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(NAPLATA_GR_TEKUCI_OBRADA__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdObrade(String value) {
		set(NAPLATA_GR_TEKUCI_OBRADA__ID_OBRADE, value);
	}

	public void setDatumObrade(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_GR_TEKUCI_OBRADA__DATUM_OBRADE);
	}

	public void setDatumPocetak(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_GR_TEKUCI_OBRADA__DATUM_POCETAK);
	}

	public void setDatumKraj(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_GR_TEKUCI_OBRADA__DATUM_KRAJ);
	}

	public void setVrstaDokumenta(String value) {
		set(NAPLATA_GR_TEKUCI_OBRADA__VRSTA_DOKUMENTA, value);
	}

	public void setNazivDokumenta(String value) {
		set(NAPLATA_GR_TEKUCI_OBRADA__NAZIV_DOKUMENTA, value);
	}

	public void setDokument(String value) {
		set(NAPLATA_GR_TEKUCI_OBRADA__DOKUMENT, value);
	}

	public void setBrojStavki(String value) {
		set(NAPLATA_GR_TEKUCI_OBRADA__BROJ_STAVKI, value);
	}

	public void setKorisnik(String value) {
		set(NAPLATA_GR_TEKUCI_OBRADA__KORISNIK, value);
	}

	public void setIspravno(String value) {
		set(NAPLATA_GR_TEKUCI_OBRADA__ISPRAVNO, value);
	}
}