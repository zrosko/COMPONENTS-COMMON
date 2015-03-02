package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class ZahNalogObavijestVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PO_ZAH_NALOG_OBAVIJEST__ID_OBAVIJESTI = "id_obavijesti";
	public static String PO_ZAH_NALOG_OBAVIJEST__ID_NALOGA = "id_naloga";
	public static String PO_ZAH_NALOG_OBAVIJEST__DATUM_OBAVIJESTI = "datum_obavijesti";
	public static String PO_ZAH_NALOG_OBAVIJEST__OPIS = "opis";
	public static String PO_ZAH_NALOG_OBAVIJEST__OSOBA_UNOSA = "osoba_unosa";

	public ZahNalogObavijestVo() {
		super();
	}

	public ZahNalogObavijestVo(AS2Record value) {
		super(value);
	}

	public String getIdObavijesti() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OBAVIJEST__ID_OBAVIJESTI);
	}

	public String getIdNaloga() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OBAVIJEST__ID_NALOGA);
	}

	public Calendar getDatumObavijesti() {
		return getAsCalendar(PO_ZAH_NALOG_OBAVIJEST__DATUM_OBAVIJESTI);
	}

	public String getOpis() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OBAVIJEST__OPIS);
	}

	public String getOsobaUnosa() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OBAVIJEST__OSOBA_UNOSA);
	}

	public void setIdObavijesti(String value) {
		set(PO_ZAH_NALOG_OBAVIJEST__ID_OBAVIJESTI, value);
	}

	public void setIdNaloga(String value) {
		set(PO_ZAH_NALOG_OBAVIJEST__ID_NALOGA, value);
	}

	public void setDatumObavijesti(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_NALOG_OBAVIJEST__DATUM_OBAVIJESTI);
	}

	public void setOpis(String value) {
		set(PO_ZAH_NALOG_OBAVIJEST__OPIS, value);
	}

	public void setOsobaUnosa(String value) {
		set(PO_ZAH_NALOG_OBAVIJEST__OSOBA_UNOSA, value);
	}
}