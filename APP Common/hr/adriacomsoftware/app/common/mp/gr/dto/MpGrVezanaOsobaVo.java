package hr.adriacomsoftware.app.common.mp.gr.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class MpGrVezanaOsobaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String MP_GR_VEZANA_OSOBA__ID_VEZANE_OSOBE = "id_vezane_osobe";
	public static String MP_GR_VEZANA_OSOBA__BROJ_PARTIJE = "broj_partije";
	public static String MP_GR_VEZANA_OSOBA__JMBG = "jmbg";
	public static String MP_GR_VEZANA_OSOBA__OIB = "oib";
	public static String MP_GR_VEZANA_OSOBA__TIP_PUNOMOCI = "tip_punomoci";
	public static String MP_GR_VEZANA_OSOBA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String MP_GR_VEZANA_OSOBA__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";
	public static String MP_GR_VEZANA_OSOBA__ISPRAVNO = "ispravno";

	public MpGrVezanaOsobaVo() {
		super();
	}

	public MpGrVezanaOsobaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdVezaneOsobe() {
		return get(MP_GR_VEZANA_OSOBA__ID_VEZANE_OSOBE);
	}

	public String getBrojPartije() {
		return get(MP_GR_VEZANA_OSOBA__BROJ_PARTIJE);
	}

	public String getJmbg() {
		return get(MP_GR_VEZANA_OSOBA__JMBG);
	}

	public String getOib() {
		return get(MP_GR_VEZANA_OSOBA__OIB);
	}

	public String getTipPunomoci() {
		return get(MP_GR_VEZANA_OSOBA__TIP_PUNOMOCI);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(MP_GR_VEZANA_OSOBA__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getOperaterZadnjeIzmjene() {
		return get(MP_GR_VEZANA_OSOBA__OPERATER_ZADNJE_IZMJENE);
	}

	public String getIspravno() {
		return get(MP_GR_VEZANA_OSOBA__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdVezaneOsobe(String value) {
		set(MP_GR_VEZANA_OSOBA__ID_VEZANE_OSOBE, value);
	}

	public void setBrojPartije(String value) {
		set(MP_GR_VEZANA_OSOBA__BROJ_PARTIJE, value);
	}

	public void setJmbg(String value) {
		set(MP_GR_VEZANA_OSOBA__JMBG, value);
	}

	public void setOib(String value) {
		set(MP_GR_VEZANA_OSOBA__OIB, value);
	}

	public void setTipPunomoci(String value) {
		set(MP_GR_VEZANA_OSOBA__TIP_PUNOMOCI, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				MP_GR_VEZANA_OSOBA__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setOperaterZadnjeIzmjene(String value) {
		set(MP_GR_VEZANA_OSOBA__OPERATER_ZADNJE_IZMJENE, value);
	}

	public void setIspravno(String value) {
		set(MP_GR_VEZANA_OSOBA__ISPRAVNO, value);
	}
}
