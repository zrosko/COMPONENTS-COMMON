package hr.adriacomsoftware.app.common.mp.gk.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class MpGkKnjizenjaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String BI_MP_GLAVNA_KNJIGA__ID_GLAVNI = "id_glavni";
	public static String BI_MP_GLAVNA_KNJIGA__BROJ_KONTA = "broj_konta";
	public static String BI_MP_GLAVNA_KNJIGA__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String BI_MP_GLAVNA_KNJIGA__VALUTA_RACUNA = "valuta_racuna";
	public static String BI_MP_GLAVNA_KNJIGA__IZNOS_VALUTA = "iznos_valuta";
	public static String BI_MP_GLAVNA_KNJIGA__PROTUVALUTA_RACUNA = "protuvaluta_racuna";
	public static String BI_MP_GLAVNA_KNJIGA__IZNOS_PROTUVALUTA = "iznos_protuvaluta";
	public static String BI_MP_GLAVNA_KNJIGA__DATUM_KNJIZENJA = "datum_knjizenja";
	public static String BI_MP_GLAVNA_KNJIGA__VRSTA_PROMETA = "vrsta_prometa";
	public static String BI_MP_GLAVNA_KNJIGA__DUGUJE_POTRAZUJE = "duguje_potrazuje";
	public static String BI_MP_GLAVNA_KNJIGA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String BI_MP_GLAVNA_KNJIGA__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";
	public static String BI_MP_GLAVNA_KNJIGA__ISPRAVNO = "ispravno";

	public MpGkKnjizenjaVo() {
		super();
	}

	public MpGkKnjizenjaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdGlavni() {
		return get(BI_MP_GLAVNA_KNJIGA__ID_GLAVNI);
	}

	public String getBrojKonta() {
		return get(BI_MP_GLAVNA_KNJIGA__BROJ_KONTA);
	}

	public String getOrganizacijskaJedinica() {
		return get(BI_MP_GLAVNA_KNJIGA__ORGANIZACIJSKA_JEDINICA);
	}

	public String getValutaRacuna() {
		return get(BI_MP_GLAVNA_KNJIGA__VALUTA_RACUNA);
	}

	public String getIznosValuta() {
		return get(BI_MP_GLAVNA_KNJIGA__IZNOS_VALUTA);
	}

	public String getProtuvalutaRacuna() {
		return get(BI_MP_GLAVNA_KNJIGA__PROTUVALUTA_RACUNA);
	}

	public String getIznosProtuvaluta() {
		return get(BI_MP_GLAVNA_KNJIGA__IZNOS_PROTUVALUTA);
	}

	// public Calendar getDatumKnjizenja() {
	// return getAsCalendar(BI_MP_GLAVNA_KNJIGA__DATUM_KNJIZENJA);
	// }
	// public Calendar getDatumValutiranja() {
	// return getAsCalendar(BI_MP_GLAVNA_KNJIGA__DATUM_VALUTIRANJA);
	// }
	public String getVrstaPrometa() {
		return get(BI_MP_GLAVNA_KNJIGA__VRSTA_PROMETA);
	}

	public String getDugujePotrazuje() {
		return get(BI_MP_GLAVNA_KNJIGA__DUGUJE_POTRAZUJE);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(BI_MP_GLAVNA_KNJIGA__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getOperaterZadnjeIzmjene() {
		return get(BI_MP_GLAVNA_KNJIGA__OPERATER_ZADNJE_IZMJENE);
	}

	public String getIspravno() {
		return get(BI_MP_GLAVNA_KNJIGA__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdGlavni(String value) {
		set(BI_MP_GLAVNA_KNJIGA__ID_GLAVNI, value);
	}

	public void setBrojKonta(String value) {
		set(BI_MP_GLAVNA_KNJIGA__BROJ_KONTA, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(BI_MP_GLAVNA_KNJIGA__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setValutaRacuna(String value) {
		set(BI_MP_GLAVNA_KNJIGA__VALUTA_RACUNA, value);
	}

	public void setIznosValuta(String value) {
		set(BI_MP_GLAVNA_KNJIGA__IZNOS_VALUTA, value);
	}

	public void setProtuvalutaRacuna(String value) {
		set(BI_MP_GLAVNA_KNJIGA__PROTUVALUTA_RACUNA, value);
	}

	public void setIznosProtuvaluta(String value) {
		set(BI_MP_GLAVNA_KNJIGA__IZNOS_PROTUVALUTA, value);
	}

	// public void setDatumKnjizenja(Calendar value) {
	// setCalendarAsDateString(value,
	// BI_MP_GLAVNA_KNJIGA__DATUM_KNJIZENJA);
	// }
	// public void setDatumValutiranja(Calendar value) {
	// setCalendarAsDateString(value,
	// BI_MP_GLAVNA_KNJIGA__DATUM_VALUTIRANJA);
	// }
	public void setVrstaPrometa(String value) {
		set(BI_MP_GLAVNA_KNJIGA__VRSTA_PROMETA, value);
	}

	public void setDugujePotrazuje(String value) {
		set(BI_MP_GLAVNA_KNJIGA__DUGUJE_POTRAZUJE, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				BI_MP_GLAVNA_KNJIGA__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setOperaterZadnjeIzmjene(String value) {
		set(BI_MP_GLAVNA_KNJIGA__OPERATER_ZADNJE_IZMJENE, value);
	}

	public void setIspravno(String value) {
		set(BI_MP_GLAVNA_KNJIGA__ISPRAVNO, value);
	}
}