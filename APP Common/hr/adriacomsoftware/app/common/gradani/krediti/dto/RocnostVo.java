package hr.adriacomsoftware.app.common.gradani.krediti.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class RocnostVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_VRSTA_ROCNOSTI_GLAVNICA = "G";
	public static String BI_VRSTA_ROCNOSTI_KAMATE = "K";
	public static String BI_VRSTA_ROCNOSTI_GLAVNICA_KAMATE = "O";

	/* Attributes names /> */
	/* </ Constructors */
	public RocnostVo() {
		super();
	}

	public RocnostVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getGlavnicaKamate() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__GLAVNICA_KAMATE);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__BROJ_PARTIJE);
	}

	public String getBrojPartijeDo() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__BROJ_PARTIJE_DO);
	}

	public String getImePrezime() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__IME_PREZIME);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__JMBG);
	}

	public Calendar getDatum() {
		return getAsCalendar(JBDataDictionary.BI_ROCNOST__DATUM);
	}

	/* Getters /> */
	/* </ Setters */
	public void setGlavnicaKamate(String value) {
		set(JBDataDictionary.BI_ROCNOST__GLAVNICA_KAMATE, value);
	}

	public void setBrojPartije(String value) {
		set(JBDataDictionary.BI_ROCNOST__BROJ_PARTIJE, value);
	}

	public void setBrojPartijeDo(String value) {
		set(JBDataDictionary.BI_ROCNOST__BROJ_PARTIJE_DO, value);
	}

	public void setImePrezime(String value) {
		set(JBDataDictionary.BI_ROCNOST__IME_PREZIME, value);
	}

	public void setJmbg(String value) {
		set(JBDataDictionary.BI_ROCNOST__JMBG, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, JBDataDictionary.BI_ROCNOST__DATUM);
	}
	/* Setters /> */
}