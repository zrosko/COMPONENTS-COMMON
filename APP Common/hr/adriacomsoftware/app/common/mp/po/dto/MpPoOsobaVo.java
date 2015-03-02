package hr.adriacomsoftware.app.common.mp.po.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class MpPoOsobaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String MP_PO_OSOBA__ID_OSOBE = "id_osobe";
	public static String MP_PO_OSOBA__MATICNI_BROJ = "maticni_broj";
	public static String MP_PO_OSOBA__OIB = "oib";
	public static String MP_PO_OSOBA__NAZIV = "naziv";
	public static String MP_PO_OSOBA__POSTANSKI_BROJ = "postanski_broj";
	public static String MP_PO_OSOBA__ULICA = "ulica";
	public static String MP_PO_OSOBA__MJESTO = "mjesto";
	public static String MP_PO_OSOBA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String MP_PO_OSOBA__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";
	public static String MP_PO_OSOBA__ISPRAVNO = "ispravno";

	public MpPoOsobaVo() {
		super();
	}

	public MpPoOsobaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdOsobe() {
		return get(MP_PO_OSOBA__ID_OSOBE);
	}

	public String getMaticniBroj() {
		return get(MP_PO_OSOBA__MATICNI_BROJ);
	}

	public String getOib() {
		return get(MP_PO_OSOBA__OIB);
	}

	public String getNaziv() {
		return get(MP_PO_OSOBA__NAZIV);
	}

	public String getPostanskiBroj() {
		return get(MP_PO_OSOBA__POSTANSKI_BROJ);
	}

	public String getUlica() {
		return get(MP_PO_OSOBA__ULICA);
	}

	public String getMjesto() {
		return get(MP_PO_OSOBA__MJESTO);
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

	public void setIdOsobe(String value) {
		set(MP_PO_OSOBA__ID_OSOBE, value);
	}

	public void setMaticniBroj(String value) {
		set(MP_PO_OSOBA__MATICNI_BROJ, value);
	}

	public void setOib(String value) {
		set(MP_PO_OSOBA__OIB, value);
	}

	public void setNaziv(String value) {
		set(MP_PO_OSOBA__NAZIV, value);
	}

	public void setPostanskiBroj(String value) {
		set(MP_PO_OSOBA__POSTANSKI_BROJ, value);
	}

	public void setUlica(String value) {
		set(MP_PO_OSOBA__ULICA, value);
	}

	public void setMjesto(String value) {
		set(MP_PO_OSOBA__MJESTO, value);
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