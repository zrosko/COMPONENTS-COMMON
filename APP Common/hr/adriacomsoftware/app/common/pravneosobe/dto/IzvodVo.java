package hr.adriacomsoftware.app.common.pravneosobe.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class IzvodVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_IZVOD_VO__PONAVLJANJE_OBRADE = "@ponavljanje_obrade";

	/* Attributes names /> */
	/* </ Constructors */
	public IzvodVo() {
		super();
	}

	public IzvodVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getBrojPartije() {
		return getAsString(JBDataDictionary.BI_IZVOD__BROJ_PARTIJE);
	}

	public String getBrojKonta() {
		return getAsString(JBDataDictionary.BI_IZVOD__BROJ_KONTA);
	}

	public String getBrojPartijeDo() {
		return getAsString(JBDataDictionary.BI_IZVOD__BROJ_PARTIJE_DO);
	}

	public String getNaziv() {
		return getAsString(JBDataDictionary.BI_IZVOD__NAZIV);
	}

	public String getMaticniBroj() {
		return getAsString(JBDataDictionary.BI_IZVOD__MATICNI_BROJ);
	}

	public String getBrojIzvoda() {
		return getAsString(JBDataDictionary.BI_IZVOD__BROJ_IZVODA);
	}

	public Calendar getDatum() {
		return getAsCalendar(JBDataDictionary.BI_IZVOD__DATUM);
	}

	public Calendar getDatumPocetak() {
		return getAsCalendar(JBDataDictionary.BI_IZVOD__DATUM_POCETAK);
	}

	public Calendar getDatumKraj() {
		return getAsCalendar(JBDataDictionary.BI_IZVOD__DATUM_KRAJ);
	}

	public String getOrganizacijskaJedinicaOd() {
		return getAsString(JBDataDictionary.BI_IZVOD__ORGANIZACIJSKA_JEDINICA_OD);
	}

	public String getOrganizacijskaJedinicaDo() {
		return getAsString(JBDataDictionary.BI_IZVOD__ORGANIZACIJSKA_JEDINICA_DO);
	}

	/* Getters /> */
	/* </ Setters */
	public void setBrojPartije(String value) {
		set(JBDataDictionary.BI_IZVOD__BROJ_PARTIJE, value);
	}

	public void setBrojKonta(String value) {
		set(JBDataDictionary.BI_IZVOD__BROJ_KONTA, value);
	}

	public void setBrojPartijeDo(String value) {
		set(JBDataDictionary.BI_IZVOD__BROJ_PARTIJE_DO, value);
	}

	public void setNaziv(String value) {
		set(JBDataDictionary.BI_IZVOD__NAZIV, value);
	}

	public void setMaticniBroj(String value) {
		set(JBDataDictionary.BI_IZVOD__MATICNI_BROJ, value);
	}

	public void setBrojIzvoda(String value) {
		set(JBDataDictionary.BI_IZVOD__BROJ_IZVODA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, JBDataDictionary.BI_IZVOD__DATUM);
	}

	public void setDatumPocetak(Calendar value) {
		setCalendarAsDateString(value, JBDataDictionary.BI_IZVOD__DATUM_POCETAK);
	}

	public void setDatumKraj(Calendar value) {
		setCalendarAsDateString(value, JBDataDictionary.BI_IZVOD__DATUM_KRAJ);
	}

	public void setOrganizacijskaJedinicaOd(String value) {
		set(JBDataDictionary.BI_IZVOD__ORGANIZACIJSKA_JEDINICA_OD, value);
	}

	public void setOrganizacijskaJedinicaDo(String value) {
		set(JBDataDictionary.BI_IZVOD__ORGANIZACIJSKA_JEDINICA_DO, value);
	}
	/* Setters /> */
}