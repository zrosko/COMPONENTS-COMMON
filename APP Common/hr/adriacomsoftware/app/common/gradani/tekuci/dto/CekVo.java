package hr.adriacomsoftware.app.common.gradani.tekuci.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class CekVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_GR_TEKUCI_CEK_UNOS__ID = "id";
	public static String BI_GR_TEKUCI_CEK_UNOS__OIB = "oib";
	public static String BI_GR_TEKUCI_CEK_UNOS__JMBG = "jmbg";
	public static String BI_GR_TEKUCI_CEK_UNOS__SERIJSKI_BROJ = "serijski_broj";
	public static String BI_GR_TEKUCI_CEK_UNOS__BROJ_PARTIJE = "broj_partije";
	public static String BI_GR_TEKUCI_CEK_UNOS__IZNOS = "iznos";
	public static String BI_GR_TEKUCI_CEK_UNOS__STATUS_CEKA = "status_ceka";
	public static String BI_GR_TEKUCI_CEK_UNOS__DATUM_PROMETA = "datum_prometa";
	public static String BI_GR_TEKUCI_CEK_UNOS__DATUM_REALIZACIJE = "datum_realizacije";
	public static String BI_GR_TEKUCI_CEK_UNOS__NAPOMENA = "napomena";
	public static String BI_GR_TEKUCI_CEK_UNOS__OPERATER_UNOSA = "operater_unosa";
	public static String BI_GR_TEKUCI_CEK_UNOS__VRIJEME_UNOSA = "vrijeme_unosa";
	public static String BI_GR_TEKUCI_CEK_UNOS__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public CekVo() {
		super();
	}

	public CekVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getId() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__ID);
	}

	public String getOib() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__OIB);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__JMBG);
	}

	public String getSerijskiBroj() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__SERIJSKI_BROJ);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__BROJ_PARTIJE);
	}

	public String getIznos() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__IZNOS);
	}

	public String getStatusCeka() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__STATUS_CEKA);
	}

	public Calendar getDatumPrometa() {
		return getAsCalendar(BI_GR_TEKUCI_CEK_UNOS__DATUM_PROMETA);
	}

	public Calendar getDatumRealizacije() {
		return getAsCalendar(BI_GR_TEKUCI_CEK_UNOS__DATUM_REALIZACIJE);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__NAPOMENA);
	}

	public String getOperaterUnosa() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__OPERATER_UNOSA);
	}

	public Calendar getVrijemeUnosa() {
		return getAsCalendar(BI_GR_TEKUCI_CEK_UNOS__VRIJEME_UNOSA);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(BI_GR_TEKUCI_CEK_UNOS__ISPRAVNO);
	}

	public void setId(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__ID, value);
	}

	public void setOib(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__OIB, value);
	}

	public void setJmbg(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__JMBG, value);
	}

	public void setSerijskiBroj(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__SERIJSKI_BROJ, value);
	}

	public void setBrojPartije(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__BROJ_PARTIJE, value);
	}

	public void setIznos(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__IZNOS, value);
	}

	public void setStatusCeka(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__STATUS_CEKA, value);
	}

	public void setDatumPrometa(Calendar value) {
		setCalendarAsDateString(value, BI_GR_TEKUCI_CEK_UNOS__DATUM_PROMETA);
	}

	public void setDatumRealizacije(Calendar value) {
		setCalendarAsDateString(value, BI_GR_TEKUCI_CEK_UNOS__DATUM_REALIZACIJE);
	}

	public void setNapomena(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__NAPOMENA, value);
	}

	public void setOperaterUnosa(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__OPERATER_UNOSA, value);
	}

	public void setVrijemeUnosa(Calendar value) {
		setCalendarAsDateString(value, BI_GR_TEKUCI_CEK_UNOS__VRIJEME_UNOSA);
	}

	public void setIspravno(String value) {
		set(BI_GR_TEKUCI_CEK_UNOS__ISPRAVNO, value);
	}

	/* Setters /> */
}