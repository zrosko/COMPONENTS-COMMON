package hr.adriacomsoftware.app.common.helpdesk.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class HelpDeskRadniNalogAktivnostVo extends HelpDeskVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String HD_RADNI_NALOG_AKTIVNOST__ID_AKTIVNOSTI = "id_aktivnosti";
	public static String HD_RADNI_NALOG_AKTIVNOST__ID_RADNOG_NALOGA = "id_radnog_naloga";
	public static String HD_RADNI_NALOG_AKTIVNOST__DATUM_AKTIVNOSTI = "datum_aktivnosti";
	public static String HD_RADNI_NALOG_AKTIVNOST__BROJ_MINUTA_AKTIVNOSTI = "broj_minuta_aktivnosti";
	public static String HD_RADNI_NALOG_AKTIVNOST__OPIS_AKTIVNOSTI = "opis_aktivnosti";
	public static String HD_RADNI_NALOG_AKTIVNOST__NAZIV_AKTIVNOSTI = "naziv_aktivnosti";
	public static String HD_RADNI_NALOG_AKTIVNOST__POSTOTAK_ZAVRSETKA = "postotak_zavrsetka";

	/* Attributes names /> */
	/* </ Constructors */
	public HelpDeskRadniNalogAktivnostVo() {
		super();
	}

	public HelpDeskRadniNalogAktivnostVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdAktivnosti() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_AKTIVNOST__ID_AKTIVNOSTI);
	}

	public String getIdRadnogNaloga() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_AKTIVNOST__ID_RADNOG_NALOGA);
	}

	public Calendar getDatumAktivnosti() {
		return getAsCalendar(HD_RADNI_NALOG_AKTIVNOST__DATUM_AKTIVNOSTI);
	}

	public String getBrojMinutaAktivnosti() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_AKTIVNOST__BROJ_MINUTA_AKTIVNOSTI);
	}

	public String getPostotakZavrsetka() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_AKTIVNOST__POSTOTAK_ZAVRSETKA);
	}

	public String getNazivAktivnosti() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_AKTIVNOST__NAZIV_AKTIVNOSTI);
	}

	public String getOpisAktivnosti() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_AKTIVNOST__OPIS_AKTIVNOSTI);
	}

	public void setIdAktivnosti(String value) {
		set(HD_RADNI_NALOG_AKTIVNOST__ID_AKTIVNOSTI, value);
	}

	public void setIdRadnogNaloga(String value) {
		set(HD_RADNI_NALOG_AKTIVNOST__ID_RADNOG_NALOGA, value);
	}

	public void setDatumAktivnosti(Calendar value) {
		setCalendarAsDateString(value,
				HD_RADNI_NALOG_AKTIVNOST__DATUM_AKTIVNOSTI);
	}

	public void setBrojMinutaAktivnosti(String value) {
		set(HD_RADNI_NALOG_AKTIVNOST__BROJ_MINUTA_AKTIVNOSTI, value);
	}

	public void setPostotakZavrsetka(String value) {
		set(HD_RADNI_NALOG_AKTIVNOST__POSTOTAK_ZAVRSETKA, value);
	}

	public void setNazivAktivnosti(String value) {
		set(HD_RADNI_NALOG_AKTIVNOST__NAZIV_AKTIVNOSTI, value);
	}

	public void setOpisAktivnosti(String value) {
		set(HD_RADNI_NALOG_AKTIVNOST__OPIS_AKTIVNOSTI, value);
	}
	/* Getters/Setters /> */
}