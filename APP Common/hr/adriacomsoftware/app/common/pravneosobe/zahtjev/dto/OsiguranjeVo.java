package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class OsiguranjeVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;
	public static String PO_ZAH_OSIGURANJE__ID_OSIGURANJA = "id_osiguranja";
	public static String PO_ZAH_OSIGURANJE__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_OSIGURANJE__DATUM = "datum";
	public static String PO_ZAH_OSIGURANJE__KRITERIJ_OSIGURANJA = "kriterij_osiguranja";

	public OsiguranjeVo() {
		super();
	}

	public OsiguranjeVo(AS2Record value) {
		super(value);
	}

	public String getIdOsiguranja() {
		return getAsStringOrEmpty(PO_ZAH_OSIGURANJE__ID_OSIGURANJA);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(PO_ZAH_OSIGURANJE__BROJ_ZAHTJEVA);
	}

	public Calendar getDatum() {
		return getAsCalendar(PO_ZAH_OSIGURANJE__DATUM);
	}

	public String getKriterijOsiguranja() {
		return getAsStringOrEmpty(PO_ZAH_OSIGURANJE__KRITERIJ_OSIGURANJA);
	}

	public void setIdOsiguranja(String value) {
		set(PO_ZAH_OSIGURANJE__ID_OSIGURANJA, value);
	}

	public void setBrojZahtjeva(String value) {
		set(PO_ZAH_OSIGURANJE__BROJ_ZAHTJEVA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_OSIGURANJE__DATUM);
	}

	public void setKriterijOsiguranja(String value) {
		set(PO_ZAH_OSIGURANJE__KRITERIJ_OSIGURANJA, value);
	}

}