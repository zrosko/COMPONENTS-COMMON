package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class StatusZahtjevaVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;

	public StatusZahtjevaVo() {
		super();
	}

	public StatusZahtjevaVo(AS2Record value) {
		super(value);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__BROJ_ZAHTJEVA);
	}

	public String getStatusZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__STATUS_ZAHTJEVA);
	}

	public Calendar getDatumPromjene() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__DATUM_PROMJENE);
	}

	public String getOperater() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__OPERATER);
	}

	public String getEmail() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__EMAIL);
	}

	public String getPoruka() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__PORUKA);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__BROJ_ZAHTJEVA, value);
	}

	public void setStatusZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__STATUS_ZAHTJEVA, value);
	}

	public void setDatumPromjene(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__DATUM_PROMJENE);
	}

	public void setOperater(String value) {
		set(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__OPERATER, value);
	}

	public void setEmail(String value) {
		set(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__EMAIL, value);
	}

	public void setPoruka(String value) {
		set(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__PORUKA, value);
	}
}