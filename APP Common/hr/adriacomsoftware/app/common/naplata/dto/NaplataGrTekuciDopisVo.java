package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/************* CONSTANTS naplata_gr_tekuci_dopis ************/

public class NaplataGrTekuciDopisVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String NAPLATA_GR_TEKUCI_DOPIS__ID_DOPISA = "id_dopisa";
	public static String NAPLATA_GR_TEKUCI_DOPIS__ID_PRACENJA = "id_pracenja";
	public static String NAPLATA_GR_TEKUCI_DOPIS__DATUM_DOGADAJA = "datum_dogadaja";
	public static String NAPLATA_GR_TEKUCI_DOPIS__REFERENT = "referent";
	public static String NAPLATA_GR_TEKUCI_DOPIS__DOPIS_NAZIV = "dopis_naziv";
	public static String NAPLATA_GR_TEKUCI_DOPIS__DATUM_IZDAVANJA = "datum_izdavanja";
	public static String NAPLATA_GR_TEKUCI_DOPIS__KORISTI_ALT_ADRESU = "koristi_alt_adresu";
	public static String NAPLATA_GR_TEKUCI_DOPIS__DOKUMENT = "dokument";
	public static String NAPLATA_GR_TEKUCI_DOPIS__NAZIV_DOKUMENTA = "naziv_dokumenta";
	public static String NAPLATA_GR_TEKUCI_DOPIS__ID_OBRADE = "id_obrade";
	public static String NAPLATA_GR_TEKUCI_DOPIS__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String NAPLATA_GR_TEKUCI_DOPIS__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";
	public static String NAPLATA_GR_TEKUCI_DOPIS__ISPRAVNO = "ispravno";

	public NaplataGrTekuciDopisVo() {
		super();
	}

	public NaplataGrTekuciDopisVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdDopisa() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__ID_DOPISA);
	}

	public String getIdPracenja() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__ID_PRACENJA);
	}

	public Calendar getDatumDogadaja() {
		return getAsCalendar(NAPLATA_GR_TEKUCI_DOPIS__DATUM_DOGADAJA);
	}

	public String getReferent() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__REFERENT);
	}

	public String getDopisNaziv() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__DOPIS_NAZIV);
	}

	public Calendar getDatumIzdavanja() {
		return getAsCalendar(NAPLATA_GR_TEKUCI_DOPIS__DATUM_IZDAVANJA);
	}

	public String getKoristiAltAdresu() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__KORISTI_ALT_ADRESU);
	}

	public String getDokument() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__DOKUMENT);
	}

	public String getNazivDokumenta() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__NAZIV_DOKUMENTA);
	}

	public String getIdObrade() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__ID_OBRADE);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(NAPLATA_GR_TEKUCI_DOPIS__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getOperaterZadnjeIzmjene() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__OPERATER_ZADNJE_IZMJENE);
	}

	public String getIspravno() {
		return get(NAPLATA_GR_TEKUCI_DOPIS__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdDopisa(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__ID_DOPISA, value);
	}

	public void setIdPracenja(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__ID_PRACENJA, value);
	}

	public void setDatumDogadaja(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_GR_TEKUCI_DOPIS__DATUM_DOGADAJA);
	}

	public void setReferent(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__REFERENT, value);
	}

	public void setDopisNaziv(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__DOPIS_NAZIV, value);
	}

	public void setDatumIzdavanja(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_GR_TEKUCI_DOPIS__DATUM_IZDAVANJA);
	}

	public void setKoristiAltAdresu(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__KORISTI_ALT_ADRESU, value);
	}

	public void setDokument(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__DOKUMENT, value);
	}

	public void setNazivDokumenta(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__NAZIV_DOKUMENTA, value);
	}

	public void setIdObrade(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__ID_OBRADE, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_GR_TEKUCI_DOPIS__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setOperaterZadnjeIzmjene(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__OPERATER_ZADNJE_IZMJENE, value);
	}

	public void setIspravno(String value) {
		set(NAPLATA_GR_TEKUCI_DOPIS__ISPRAVNO, value);
	}
}