package hr.adriacomsoftware.app.common.jb.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class BaznaOpomenaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_PO_VRSTA_OPOMENE_SVE = "*";
	public static String BI_VRSTA_OPOMENE_OBAVJEST = "O"; // O,D,J,S - obavjest,
															// jamac, suduznik
	public static String BI_VRSTA_OPOMENE_DUZNIK = "D";
	public static String BI_VRSTA_OPOMENE_JAMAC = "J";
	public static String BI_VRSTA_OPOMENE_SUDUZNIK = "S";
	public static String BI_OPOMENA_VO__PONAVLJANJE_OBRADE = "@ponavljanje_obrade";
	public static String BI_OPOMENA_VO__PONAVLJANJE_OBRADE_ROCNOST = "@ponavljanje_obrade_rocnost";

	/* Attributes names /> */
	/* </ Constructors */
	public BaznaOpomenaVo() {
		super();
	}

	public BaznaOpomenaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */

	public String getBrojOpomene() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OPOMENE__BROJ_OPOMENE);
	}

	public String getBrojRataOd() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OPOMENE__BROJ_RATA_OD);
	}

	public String getBrojRataDo() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OPOMENE__BROJ_RATA_DO);
	}

	public String getVrstaOpomene() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OPOMENE__VRSTA_OPOMENE);
	}

	public String getBrojPartijeOd() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OPOMENE__BROJ_PARTIJE_OD);
	}

	public String getBrojPartijeDo() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OPOMENE__BROJ_PARTIJE_DO);
	}

	public Calendar getDatum() {
		return getAsCalendar(JBDataDictionary.BI_OPOMENE__DATUM);
	}

	public Calendar getZadaniDatum() {
		return getAsCalendar(JBDataDictionary.BI_OPOMENE__ZADANI_DATUM);
	}

	/* Setters */
	public void setBrojOpomene(String value) {
		set(JBDataDictionary.BI_OPOMENE__BROJ_OPOMENE, value);
	}

	public void setBrojRataOd(String value) {
		set(JBDataDictionary.BI_OPOMENE__BROJ_RATA_OD, value);
	}

	public void setBrojRataDo(String value) {
		set(JBDataDictionary.BI_OPOMENE__BROJ_RATA_DO, value);
	}

	public void setVrstaOpomene(String value) {
		set(JBDataDictionary.BI_OPOMENE__VRSTA_OPOMENE, value);
	}

	public void setBrojPartijeOd(String value) {
		set(JBDataDictionary.BI_OPOMENE__BROJ_PARTIJE_OD, value);
	}

	public void setBrojPartijeDo(String value) {
		set(JBDataDictionary.BI_OPOMENE__BROJ_PARTIJE_DO, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, JBDataDictionary.BI_OPOMENE__DATUM);
	}

	public void setZadaniDatum(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.BI_OPOMENE__ZADANI_DATUM);
	}
	/* Setters /> */
}