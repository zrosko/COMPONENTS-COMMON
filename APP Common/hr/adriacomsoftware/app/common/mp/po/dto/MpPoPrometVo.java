package hr.adriacomsoftware.app.common.mp.po.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class MpPoPrometVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String MP_PO_PROMET__ID_PROMETA = "id_prometa";
	public static String MP_PO_PROMET__BROJ_PARTIJE = "broj_partije";
	public static String MP_PO_PROMET__VALUTA_RACUNA = "valuta_racuna";
	public static String MP_PO_PROMET__IZNOS_VALUTA = "iznos_valuta";
	public static String MP_PO_PROMET__PROTUVALUTA_RACUNA = "protuvaluta_racuna";
	public static String MP_PO_PROMET__IZNOS_PROTUVALUTA = "iznos_protuvaluta";
	public static String MP_PO_PROMET__BROJ_KONTA = "broj_konta";
	public static String MP_PO_PROMET__DUGUJE_POTRAZUJE = "duguje_potrazuje";
	public static String MP_PO_PROMET__DATUM_KNJIZENJA = "datum_knjizenja";
	public static String MP_PO_PROMET__DATUM_VALUTIRANJA = "datum_valutiranja";
	public static String MP_PO_PROMET__VRSTA_PROMETA = "vrsta_prometa";
	public static String MP_PO_PROMET__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String MP_PO_PROMET__BROJ_PAKETA = "broj_paketa";
	public static String MP_PO_PROMET__REDNI_BROJ_STAVKE = "redni_broj_stavke";
	public static String MP_PO_PROMET__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String MP_PO_PROMET__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";
	public static String MP_PO_PROMET__ISPRAVNO = "ispravno";

	public MpPoPrometVo() {
		super();
	}

	public MpPoPrometVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdPrometa() {
		return get(MP_PO_PROMET__ID_PROMETA);
	}

	public String getBrojPartije() {
		return get(MP_PO_PROMET__BROJ_PARTIJE);
	}

	public String getValutaRacuna() {
		return get(MP_PO_PROMET__VALUTA_RACUNA);
	}

	public String getIznosValuta() {
		return get(MP_PO_PROMET__IZNOS_VALUTA);
	}

	public String getProtuvalutaRacuna() {
		return get(MP_PO_PROMET__PROTUVALUTA_RACUNA);
	}

	public String getIznosProtuvaluta() {
		return get(MP_PO_PROMET__IZNOS_PROTUVALUTA);
	}

	public String getBrojKonta() {
		return get(MP_PO_PROMET__BROJ_KONTA);
	}

	public String getDugujePotrazuje() {
		return get(MP_PO_PROMET__DUGUJE_POTRAZUJE);
	}

	// public Calendar getDatumKnjizenja() {
	// return getPropertyAsCalendar(MP_PO_PROMET__DATUM_KNJIZENJA);
	// }
	// public Calendar getDatumValutiranja() {
	// return getPropertyAsCalendar(MP_PO_PROMET__DATUM_VALUTIRANJA);
	// }
	public String getVrstaPrometa() {
		return get(MP_PO_PROMET__VRSTA_PROMETA);
	}

	public String getOrganizacijskaJedinica() {
		return get(MP_PO_PROMET__ORGANIZACIJSKA_JEDINICA);
	}

	public String getBrojPaketa() {
		return get(MP_PO_PROMET__BROJ_PAKETA);
	}

	public String getRedniBrojStavke() {
		return get(MP_PO_PROMET__REDNI_BROJ_STAVKE);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(MP_PO_PROMET__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getOperaterZadnjeIzmjene() {
		return get(MP_PO_PROMET__OPERATER_ZADNJE_IZMJENE);
	}

	public String getIspravno() {
		return get(MP_PO_PROMET__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdPrometa(String value) {
		set(MP_PO_PROMET__ID_PROMETA, value);
	}

	public void setBrojPartije(String value) {
		set(MP_PO_PROMET__BROJ_PARTIJE, value);
	}

	public void setValutaRacuna(String value) {
		set(MP_PO_PROMET__VALUTA_RACUNA, value);
	}

	public void setIznosValuta(String value) {
		set(MP_PO_PROMET__IZNOS_VALUTA, value);
	}

	public void setProtuvalutaRacuna(String value) {
		set(MP_PO_PROMET__PROTUVALUTA_RACUNA, value);
	}

	public void setIznosProtuvaluta(String value) {
		set(MP_PO_PROMET__IZNOS_PROTUVALUTA, value);
	}

	public void setBrojKonta(String value) {
		set(MP_PO_PROMET__BROJ_KONTA, value);
	}

	public void setDugujePotrazuje(String value) {
		set(MP_PO_PROMET__DUGUJE_POTRAZUJE, value);
	}

	// public void setDatumKnjizenja(Calendar value) {
	// setPropertyCalendarAsDateString(value, MP_PO_PROMET__DATUM_KNJIZENJA);
	// }
	// public void setDatumValutiranja(Calendar value) {
	// setPropertyCalendarAsDateString(value, MP_PO_PROMET__DATUM_VALUTIRANJA);
	// }
	public void setVrstaPrometa(String value) {
		set(MP_PO_PROMET__VRSTA_PROMETA, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(MP_PO_PROMET__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setBrojPaketa(String value) {
		set(MP_PO_PROMET__BROJ_PAKETA, value);
	}

	public void setRedniBrojStavke(String value) {
		set(MP_PO_PROMET__REDNI_BROJ_STAVKE, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value, MP_PO_PROMET__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setOperaterZadnjeIzmjene(String value) {
		set(MP_PO_PROMET__OPERATER_ZADNJE_IZMJENE, value);
	}

	public void setIspravno(String value) {
		set(MP_PO_PROMET__ISPRAVNO, value);
	}
}