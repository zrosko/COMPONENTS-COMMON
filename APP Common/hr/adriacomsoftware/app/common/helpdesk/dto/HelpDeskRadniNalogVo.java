package hr.adriacomsoftware.app.common.helpdesk.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class HelpDeskRadniNalogVo extends HelpDeskVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String HD_RADNI_NALOG__ID_RADNOG_NALOGA = "id_radnog_naloga";
	public static String HD_RADNI_NALOG__NAZIV = "naziv";
	public static String HD_RADNI_NALOG__ID_POZIVA = "id_poziva";
	public static String HD_RADNI_NALOG__ID_INCIDENTA = "id_incidenta";
	public static String HD_RADNI_NALOG__DATUM_OTVARANJA = "datum_otvaranja";
	public static String HD_RADNI_NALOG__DATUM_ZATVARANJA = "datum_zatvaranja";
	public static String HD_RADNI_NALOG__OSOBA_RADA = "osoba_rada";
	public static String HD_RADNI_NALOG__OPIS_RADA = "opis_rada";
	public static String HD_RADNI_NALOG__STATUS = "status";
	public static String HD_RADNI_NALOG__PRIORITET = "prioritet";
	public static String HD_RADNI_NALOG__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public HelpDeskRadniNalogVo() {
		super();
	}

	public HelpDeskRadniNalogVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdRadnogNaloga() {
		return getAsStringOrEmpty(HD_RADNI_NALOG__ID_RADNOG_NALOGA);
	}

	public String getIdPoziva() {
		return getAsStringOrEmpty(HD_RADNI_NALOG__ID_POZIVA);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(HD_RADNI_NALOG__NAZIV);
	}

	public String getIdIncidenta() {
		return getAsStringOrEmpty(HD_RADNI_NALOG__ID_INCIDENTA);
	}

	public Calendar getDatumOtvaranja() {
		return getAsCalendar(HD_RADNI_NALOG__DATUM_OTVARANJA);
	}

	public Calendar getDatumZatvaranja() {
		return getAsCalendar(HD_RADNI_NALOG__DATUM_ZATVARANJA);
	}

	public String getOsobaRada() {
		return getAsStringOrEmpty(HD_RADNI_NALOG__OSOBA_RADA);
	}

	public String getOpisRada() {
		return getAsStringOrEmpty(HD_RADNI_NALOG__OPIS_RADA);
	}

	public String getStatus() {
		return getAsStringOrEmpty(HD_RADNI_NALOG__STATUS);
	}

	public String getPrioritet() {
		return getAsStringOrEmpty(HD_RADNI_NALOG__PRIORITET);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(HD_RADNI_NALOG__ISPRAVNO);
	}

	// setters
	public void setIdRadnogNaloga(String value) {
		set(HD_RADNI_NALOG__ID_RADNOG_NALOGA, value);
	}

	public void setIdPoziva(String value) {
		set(HD_RADNI_NALOG__ID_POZIVA, value);
	}

	public void setNaziv(String value) {
		set(HD_RADNI_NALOG__NAZIV, value);
	}

	public void setIdIncidenta(String value) {
		set(HD_RADNI_NALOG__ID_INCIDENTA, value);
	}

	public void setDatumOtvaranja(Calendar value) {
		setCalendarAsDateString(value, HD_RADNI_NALOG__DATUM_OTVARANJA);
	}

	public void setDatumZatvaranja(Calendar value) {
		setCalendarAsDateString(value, HD_RADNI_NALOG__DATUM_ZATVARANJA);
	}

	public void setOsobaRada(String value) {
		set(HD_RADNI_NALOG__OSOBA_RADA, value);
	}

	public void setOpisRada(String value) {
		set(HD_RADNI_NALOG__OPIS_RADA, value);
	}

	public void setStatus(String value) {
		set(HD_RADNI_NALOG__STATUS, value);
	}

	public void setPrioritet(String value) {
		set(HD_RADNI_NALOG__PRIORITET, value);
	}

	public void setIspravno(String value) {
		set(HD_RADNI_NALOG__ISPRAVNO, value);
	}

	/* Getters/Setters /> */
}