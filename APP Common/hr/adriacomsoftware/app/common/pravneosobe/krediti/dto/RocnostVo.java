package hr.adriacomsoftware.app.common.pravneosobe.krediti.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class RocnostVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_VRSTA_ROCNOSTI_ONLINE = "vrsta_rocnosti_online";
	public static String BI_VRSTA_ROCNOSTI_GLAVNICA = "G"; // G,K,O - glavnica,
															// kamate, oboje
	public static String BI_VRSTA_ROCNOSTI_KAMATE = "K";
	public static String BI_VRSTA_ROCNOSTI_GLAVNICA_KAMATE = "O";
	public static String BI_VRSTA_ROCNOSTI_PARTIJA = "P";
	public static String BI_VRSTA_ROCNOSTI_SINDICIRANI = "S";
	public static String BI_VRSTA_ROCNOSTI_GLAVNICA_KAMATE_ODVOJENO = "D";
	public static String BI_VRSTA_IZVJESCA = "@vrsta_izvjesca";
	public static String BI_VRSTA_IZVJESCA_KOMITENT = "KOMITENT";
	public static String BI_VRSTA_IZVJESCA_STANDARDNO = "KONTO";
	public static String BI_VRSTA_ROCNOSTI_SORT = "@sort";
	public static String BI_VRSTA_ROCNOSTI_GRAFIKA = "@grafika";
	// public static String BI_VRSTA_ROCNOSTI_PO_PARTIJI = "@po_partiji";
	public static String BI_VRSTA_ROCNOSTI_SORT_NAZIV = "N"; // N - naziv
																// (zadano po
																// rocnosti)
	public static String BI_VRSTA_ROCNOSTI_GRAFIKA_NAZIV = "G"; // N - naziv
																// (zadano po
																// rocnosti)

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
	public String getIzborOcjene() {
		return getAsStringOrEmpty("izbor_ocjene");
	}

	public String getVrstaIzvjesca() {
		return getAsStringOrEmpty(BI_VRSTA_IZVJESCA);
	}

	public String getGlavnicaKamate() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__GLAVNICA_KAMATE);
	}

	public String getValutaProtuvaluta() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__VALUTA_PROTUVALUTA);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__BROJ_PARTIJE);
	}

	public String getBrojPartijeDo() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__BROJ_PARTIJE_DO);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__NAZIV);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__MATICNI_BROJ);
	}

	public Calendar getDatum() {
		return getAsCalendar(JBDataDictionary.BI_ROCNOST__DATUM);
	}

	public String getOrganizacijskaJedinicaOd() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__ORGANIZACIJSKA_JEDINICA_OD);
	}

	public String getOrganizacijskaJedinicaDo() {
		return getAsStringOrEmpty(JBDataDictionary.BI_ROCNOST__ORGANIZACIJSKA_JEDINICA_DO);
	}

	public String getVrstaRocnostiOnline() {
		return getAsStringOrEmpty(BI_VRSTA_ROCNOSTI_ONLINE);
	}

	/* Getters /> */
	/* </ Setters */
	public void setVrstaIzvjesca(String value) {
		set(BI_VRSTA_IZVJESCA, value);
	}

	public void setGlavnicaKamate(String value) {
		set(JBDataDictionary.BI_ROCNOST__GLAVNICA_KAMATE, value);
	}

	public void setValutaProtuvaluta(String value) {
		set(JBDataDictionary.BI_ROCNOST__VALUTA_PROTUVALUTA, value);
	}

	public void setBrojPartije(String value) {
		set(JBDataDictionary.BI_ROCNOST__BROJ_PARTIJE, value);
	}

	public void setBrojPartijeDo(String value) {
		set(JBDataDictionary.BI_ROCNOST__BROJ_PARTIJE_DO, value);
	}

	public void setNaziv(String value) {
		set(JBDataDictionary.BI_ROCNOST__NAZIV, value);
	}

	public void setMaticniBroj(String value) {
		set(JBDataDictionary.BI_ROCNOST__MATICNI_BROJ, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value,JBDataDictionary.BI_ROCNOST__DATUM);
	}

	public void setOrganizacijskaJedinicaOd(String value) {
		set(JBDataDictionary.BI_ROCNOST__ORGANIZACIJSKA_JEDINICA_OD,
				value);
	}

	public void setOrganizacijskaJedinicaDo(String value) {
		set(JBDataDictionary.BI_ROCNOST__ORGANIZACIJSKA_JEDINICA_DO,
				value);
	}

	public void setVrstaRocnostiOnline(String value) {
		set(BI_VRSTA_ROCNOSTI_ONLINE, value);
	}

	public void setIzborOcjene(String value) {
		set("izbor_ocjene", value);
	}
	/* Setters /> */
}