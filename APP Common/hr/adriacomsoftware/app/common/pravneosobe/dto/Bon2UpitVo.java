package hr.adriacomsoftware.app.common.pravneosobe.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class Bon2UpitVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BON2_UPIT__MATICNI_BROJ = "maticni_broj";
	public static String BON2_UPIT__BROJ_DANA = "broj_dana";
	public static String BON2_UPIT__DATUM = "datum";

	/* Attributes names /> */
	/* </ Constructors */
	public Bon2UpitVo() {
		super();
	}

	public Bon2UpitVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getMaticniBroj() {
		return getAsStringOrEmpty(BON2_UPIT__MATICNI_BROJ);
	}

	public String getBrojDana() {
		return getAsStringOrEmpty(BON2_UPIT__BROJ_DANA);
	}

	public Calendar getDatum() {
		return getAsCalendar(BON2_UPIT__DATUM);
	}

	/* Getters /> */
	/* </ Setters */
	public void setMaticniBroj(String value) {
		set(BON2_UPIT__MATICNI_BROJ, value);
	}

	public void setBrojDana(String value) {
		set(BON2_UPIT__BROJ_DANA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, BON2_UPIT__DATUM);
	}
	/* Setters /> */
}