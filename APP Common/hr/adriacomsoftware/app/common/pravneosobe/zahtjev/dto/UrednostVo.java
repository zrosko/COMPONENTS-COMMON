package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class UrednostVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;
	public static String PO_ZAH_UREDNOST__ID_UREDNOSTI = "id_urednosti";
	public static String PO_ZAH_UREDNOST__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_UREDNOST__DATUM = "datum";
	public static String PO_ZAH_UREDNOST__MAX_BROJ_DANA_KASNJENJA = "max_broj_dana_kasnjenja";
	public static String PO_ZAH_UREDNOST__PRAG_MATERIJALNOSTI = "prag_materijalnosti";
	public static String PO_ZAH_UREDNOST__DOSPJELI_DUG = "dospjeli_dug";
	public static String PO_ZAH_UREDNOST__IZLOZENOST_BRUTO = "izlozenost_bruto";
	public static String PO_ZAH_UREDNOST__IZNOS_REZERVACIJE = "iznos_rezervacije";

	public UrednostVo() {
		super();
	}

	public UrednostVo(AS2Record value) {
		super(value);
	}

	public String getIdUrednosti() {
		return getAsStringOrEmpty(PO_ZAH_UREDNOST__ID_UREDNOSTI);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(PO_ZAH_UREDNOST__BROJ_ZAHTJEVA);
	}

	public Calendar getDatum() {
		return getAsCalendar(PO_ZAH_UREDNOST__DATUM);
	}

	public String getMaxBrojDanaKasnjenja() {
		return getAsStringOrEmpty(PO_ZAH_UREDNOST__MAX_BROJ_DANA_KASNJENJA);
	}

	public String getPragMaterijalnosti() {
		return getAsStringOrEmpty(PO_ZAH_UREDNOST__PRAG_MATERIJALNOSTI);
	}

	public String getDospjeliDug() {
		return getAsStringOrEmpty(PO_ZAH_UREDNOST__DOSPJELI_DUG);
	}

	public String getIzlozenostBruto() {
		return getAsStringOrEmpty(PO_ZAH_UREDNOST__IZLOZENOST_BRUTO);
	}

	public String getIznosRezervacije() {
		return getAsStringOrEmpty(PO_ZAH_UREDNOST__IZNOS_REZERVACIJE);
	}

	public void setIdUrednosti(String value) {
		set(PO_ZAH_UREDNOST__ID_UREDNOSTI, value);
	}

	public void setBrojZahtjeva(String value) {
		set(PO_ZAH_UREDNOST__BROJ_ZAHTJEVA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_UREDNOST__DATUM);
	}

	public void setMaxBrojDanaKasnjenja(String value) {
		set(PO_ZAH_UREDNOST__MAX_BROJ_DANA_KASNJENJA, value);
	}

	public void setPragMaterijalnosti(String value) {
		set(PO_ZAH_UREDNOST__PRAG_MATERIJALNOSTI, value);
	}

	public void setDospjeliDug(String value) {
		set(PO_ZAH_UREDNOST__DOSPJELI_DUG, value);
	}

	public void setIzlozenostBruto(String value) {
		set(PO_ZAH_UREDNOST__IZLOZENOST_BRUTO, value);
	}

	public void setIznosRezervacije(String value) {
		set(PO_ZAH_UREDNOST__IZNOS_REZERVACIJE, value);
	}
}