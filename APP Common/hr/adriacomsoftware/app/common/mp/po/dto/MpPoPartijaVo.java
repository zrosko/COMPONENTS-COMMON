package hr.adriacomsoftware.app.common.mp.po.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class MpPoPartijaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String MP_PO_OSOBA__ID_PARTIJE = "id_partije";
	public static String MP_PO_OSOBA__BROJ_PARTIJE = "broj_partije";
	public static String MP_PO_OSOBA__MATICNI_BROJ = "maticni_broj";
	public static String MP_PO_OSOBA__OIB = "oib";
	public static String MP_PO_OSOBA__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String MP_PO_OSOBA__DATUM_OTVARANJA = "datum_otvaranja";
	public static String MP_PO_OSOBA__DATUM_ZATVARANJA = "datum_zatvaranja";
	public static String MP_PO_OSOBA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String MP_PO_OSOBA__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";
	public static String MP_PO_OSOBA__ISPRAVNO = "ispravno";

	public MpPoPartijaVo() {
		super();
	}

	public MpPoPartijaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdPartije() {
		return get(MP_PO_OSOBA__ID_PARTIJE);
	}

	public String getBrojPartije() {
		return get(MP_PO_OSOBA__BROJ_PARTIJE);
	}

	public String getMaticniBroj() {
		return get(MP_PO_OSOBA__MATICNI_BROJ);
	}

	public String getOib() {
		return get(MP_PO_OSOBA__OIB);
	}

	public String getOrganizacijskaJedinica() {
		return get(MP_PO_OSOBA__ORGANIZACIJSKA_JEDINICA);
	}

	public Calendar getDatumOtvaranja() {
		return getAsCalendar(MP_PO_OSOBA__DATUM_OTVARANJA);
	}

	public Calendar getDatumZatvaranja() {
		return getAsCalendar(MP_PO_OSOBA__DATUM_ZATVARANJA);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(MP_PO_OSOBA__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getOperaterZadnjeIzmjene() {
		return get(MP_PO_OSOBA__OPERATER_ZADNJE_IZMJENE);
	}

	public String getIspravno() {
		return get(MP_PO_OSOBA__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdPartije(String value) {
		set(MP_PO_OSOBA__ID_PARTIJE, value);
	}

	public void setBrojPartije(String value) {
		set(MP_PO_OSOBA__BROJ_PARTIJE, value);
	}

	public void setMaticniBroj(String value) {
		set(MP_PO_OSOBA__MATICNI_BROJ, value);
	}

	public void setOib(String value) {
		set(MP_PO_OSOBA__OIB, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(MP_PO_OSOBA__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setDatumOtvaranja(Calendar value) {
		setCalendarAsDateString(value, MP_PO_OSOBA__DATUM_OTVARANJA);
	}

	public void setDatumZatvaranja(Calendar value) {
		setCalendarAsDateString(value, MP_PO_OSOBA__DATUM_ZATVARANJA);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value, MP_PO_OSOBA__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setOperaterZadnjeIzmjene(String value) {
		set(MP_PO_OSOBA__OPERATER_ZADNJE_IZMJENE, value);
	}

	public void setIspravno(String value) {
		set(MP_PO_OSOBA__ISPRAVNO, value);
	}
}