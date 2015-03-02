package hr.adriacomsoftware.app.common.helpdesk.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class HelpDeskRadniNalogStatusVo extends HelpDeskVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String HD_RADNI_NALOG_STATUS__ID_RADNOG_NALOGA = "id_radnog_naloga";
	public static String HD_RADNI_NALOG_STATUS__DATUM = "datum";
	public static String HD_RADNI_NALOG_STATUS__OPERATER = "operater";
	public static String HD_RADNI_NALOG_STATUS__EMAIL_FROM = "email_from";
	public static String HD_RADNI_NALOG_STATUS__EMAIL_TO = "email_to";
	public static String HD_RADNI_NALOG_STATUS__PORUKA = "poruka";

	/* Attributes names /> */
	/* </ Constructors */
	public HelpDeskRadniNalogStatusVo() {
		super();
	}

	public HelpDeskRadniNalogStatusVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdRadnogNaloga() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_STATUS__ID_RADNOG_NALOGA);
	}

	public Calendar getDatum() {
		return getAsCalendar(HD_RADNI_NALOG_STATUS__DATUM);
	}

	public String getOperater() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_STATUS__OPERATER);
	}

	public String getEmailFrom() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_STATUS__EMAIL_FROM);
	}

	public String getEmailTo() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_STATUS__EMAIL_TO);
	}

	public String getPoruka() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_STATUS__PORUKA);
	}

	public void setIdRadnogNaloga(String value) {
		set(HD_RADNI_NALOG_STATUS__ID_RADNOG_NALOGA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, HD_RADNI_NALOG_STATUS__DATUM);
	}

	public void setOperater(String value) {
		set(HD_RADNI_NALOG_STATUS__OPERATER, value);
	}

	public void setEmailFrom(String value) {
		set(HD_RADNI_NALOG_STATUS__EMAIL_FROM, value);
	}

	public void setEmailTo(String value) {
		set(HD_RADNI_NALOG_STATUS__EMAIL_TO, value);
	}

	public void setPoruka(String value) {
		set(HD_RADNI_NALOG_STATUS__PORUKA, value);
	}
	/* Getters/Setters /> */
}