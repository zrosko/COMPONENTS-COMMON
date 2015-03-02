package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class BankaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	public BankaVo() {
		super();
	}

	public BankaVo(AS2Record value) {
		super(value);
	}

	public Calendar getDatumStanja() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_BANKA__DATUM_STANJA);
	}

	public String getJamstveniKapital() {
		return getAsStringOrEmpty(
				ZAHDataDictionary.PO_ZAH_BANKA__JAMSTVENI_KAPITAL).replace('.',
				',');
	}

	public String getBrojDionica() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKA__BROJ_DIONICA);
	}

	public String getCijenaDionice() {
		return getAsStringOrEmpty(
				ZAHDataDictionary.PO_ZAH_BANKA__CIJENA_DIONICE).replace('.',
				',');
	}

	public void setDatumStanja(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_BANKA__DATUM_STANJA);
	}

	public void setJamstveniKapital(String value) {
		value = value.replace(',', '.');
		set(ZAHDataDictionary.PO_ZAH_BANKA__JAMSTVENI_KAPITAL, value);
	}

	public void setBrojDionica(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKA__BROJ_DIONICA, value);
	}

	public void setCijenaDionice(String value) {
		value = value.replace(',', '.');
		set(ZAHDataDictionary.PO_ZAH_BANKA__CIJENA_DIONICE, value);
	}
}