package hr.adriacomsoftware.app.common.mp.gr.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class MpGrPartijaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String MP_GR_PARTIJA__ID_PARTIJE = "id_partije";
	public static String MP_GR_PARTIJA__BROJ_PARTIJE = "broj_partije";
	public static String MP_GR_PARTIJA__JMBG = "jmbg";
	public static String MP_GR_PARTIJA__OIB = "oib";
	public static String MP_GR_PARTIJA__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String MP_GR_PARTIJA__DATUM_OTVARANJA = "datum_otvaranja";
	public static String MP_GR_PARTIJA__DATUM_ZATVARANJA = "datum_zatvaranja";
	public static String MP_GR_PARTIJA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String MP_GR_PARTIJA__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";
	public static String MP_GR_PARTIJA__ISPRAVNO = "ispravno";

	public MpGrPartijaVo() {
		super();
	}

	public MpGrPartijaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdPartije() {
		return get(MP_GR_PARTIJA__ID_PARTIJE);
	}

	public String getBrojPartije() {
		return get(MP_GR_PARTIJA__BROJ_PARTIJE);
	}

	public String getJmbg() {
		return get(MP_GR_PARTIJA__JMBG);
	}

	public String getOib() {
		return get(MP_GR_PARTIJA__OIB);
	}

	public String getOrganizacijskaJedinica() {
		return get(MP_GR_PARTIJA__ORGANIZACIJSKA_JEDINICA);
	}

	public Calendar getDatumOtvaranja() {
		return getAsCalendar(MP_GR_PARTIJA__DATUM_OTVARANJA);
	}

	public Calendar getDatumZatvaranja() {
		return getAsCalendar(MP_GR_PARTIJA__DATUM_ZATVARANJA);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(MP_GR_PARTIJA__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getOperaterZadnjeIzmjene() {
		return get(MP_GR_PARTIJA__OPERATER_ZADNJE_IZMJENE);
	}

	public String getIspravno() {
		return get(MP_GR_PARTIJA__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdPartije(String value) {
		set(MP_GR_PARTIJA__ID_PARTIJE, value);
	}

	public void setBrojPartije(String value) {
		set(MP_GR_PARTIJA__BROJ_PARTIJE, value);
	}

	public void setJmbg(String value) {
		set(MP_GR_PARTIJA__JMBG, value);
	}

	public void setOib(String value) {
		set(MP_GR_PARTIJA__OIB, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(MP_GR_PARTIJA__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setDatumOtvaranja(Calendar value) {
		setCalendarAsDateString(value, MP_GR_PARTIJA__DATUM_OTVARANJA);
	}

	public void setDatumZatvaranja(Calendar value) {
		setCalendarAsDateString(value, MP_GR_PARTIJA__DATUM_ZATVARANJA);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value, MP_GR_PARTIJA__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setOperaterZadnjeIzmjene(String value) {
		set(MP_GR_PARTIJA__OPERATER_ZADNJE_IZMJENE, value);
	}

	public void setIspravno(String value) {
		set(MP_GR_PARTIJA__ISPRAVNO, value);
	}
}