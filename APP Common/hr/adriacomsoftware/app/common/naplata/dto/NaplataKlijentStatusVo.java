package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class NaplataKlijentStatusVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String NAPLATA_KLIJENT_STATUS__ID_STATUSA = "id_statusa";
	public static String NAPLATA_KLIJENT_STATUS__OIB = "oib";
	public static String NAPLATA_KLIJENT_STATUS__VRSTA = "vrsta";
	public static String NAPLATA_KLIJENT_STATUS__DATUM = "datum";
	public static String NAPLATA_KLIJENT_STATUS__STANJE = "stanje";

	/* Attributes names /> */
	/* </ Constructors */
	public NaplataKlijentStatusVo() {
		super();
	}

	public NaplataKlijentStatusVo(AS2Record value) {
		super(value);
	}

	public String getIdStatusa() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_STATUS__ID_STATUSA);
	}

	public String getOib() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_STATUS__OIB);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_STATUS__VRSTA);
	}

	public Calendar getDatum() {
		return getAsCalendar(NAPLATA_KLIJENT_STATUS__DATUM);
	}

	public String getStanje() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_STATUS__STANJE);
	}

	/*********** SETTERS ******/
	public void setIdStatusa(String value) {
		set(NAPLATA_KLIJENT_STATUS__ID_STATUSA, value);
	}

	public void setOib(String value) {
		set(NAPLATA_KLIJENT_STATUS__OIB, value);
	}

	public void setVrsta(String value) {
		set(NAPLATA_KLIJENT_STATUS__VRSTA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, NAPLATA_KLIJENT_STATUS__DATUM);
	}

	public void setStanje(String value) {
		set(NAPLATA_KLIJENT_STATUS__STANJE, value);
	}
}