package hr.adriacomsoftware.app.common.gradani.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class VezanaOsobaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_GR_VEZANA_OSOBA__ID_VEZANE_OSOBE = "id_vezane_osobe";
	public static String BI_GR_VEZANA_OSOBA__BROJ_PARTIJE = "broj_partije";
	public static String BI_GR_VEZANA_OSOBA__JMBG = "jmbg";
	public static String BI_GR_VEZANA_OSOBA__TIP_PUNOMOCI = "tip_punomoci";
	public static String BI_GR_VEZANA_OSOBA__DATUM_OD = "datum_od";
	public static String BI_GR_VEZANA_OSOBA__DATUM_DO = "datum_do";

	/* Attributes names /> */
	/* </ Constructors */
	public VezanaOsobaVo() {
		super();
	}

	public VezanaOsobaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getIdVezaneOsobe() {
		return getAsStringOrEmpty(BI_GR_VEZANA_OSOBA__ID_VEZANE_OSOBE);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(BI_GR_VEZANA_OSOBA__BROJ_PARTIJE);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(BI_GR_VEZANA_OSOBA__JMBG);
	}

	public String getTipPunomoci() {
		return getAsStringOrEmpty(BI_GR_VEZANA_OSOBA__TIP_PUNOMOCI);
	}

	public Calendar getDatumOd() {
		return getAsCalendar(BI_GR_VEZANA_OSOBA__DATUM_OD);
	}

	public Calendar getDatumDo() {
		return getAsCalendar(BI_GR_VEZANA_OSOBA__DATUM_DO);
	}

	public void setIdVezaneOsobe(String value) {
		set(BI_GR_VEZANA_OSOBA__ID_VEZANE_OSOBE, value);
	}

	public void setBrojPartije(String value) {
		set(BI_GR_VEZANA_OSOBA__BROJ_PARTIJE, value);
	}

	public void setJmbg(String value) {
		set(BI_GR_VEZANA_OSOBA__JMBG, value);
	}

	public void setTipPunomoci(String value) {
		set(BI_GR_VEZANA_OSOBA__TIP_PUNOMOCI, value);
	}

	public void setDatumOd(Calendar value) {
		setCalendarAsDateString(value, BI_GR_VEZANA_OSOBA__DATUM_OD);
	}

	public void setDatumDo(Calendar value) {
		setCalendarAsDateString(value, BI_GR_VEZANA_OSOBA__DATUM_DO);
	}

	/* Setters /> */
}