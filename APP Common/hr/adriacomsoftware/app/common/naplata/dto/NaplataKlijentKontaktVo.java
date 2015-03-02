package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

public class NaplataKlijentKontaktVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String NAPLATA_KLIJENT_KONTAKT__ID_KONTATKA = "id_kontatka";
	public static String NAPLATA_KLIJENT_KONTAKT__OIB = "oib";
	public static String NAPLATA_KLIJENT_KONTAKT__IME = "ime";
	public static String NAPLATA_KLIJENT_KONTAKT__PREZIME = "prezime";
	public static String NAPLATA_KLIJENT_KONTAKT__JMBG = "jmbg";
	public static String NAPLATA_KLIJENT_KONTAKT__OIB_KONTAKTA = "oib_kontakta";
	public static String NAPLATA_KLIJENT_KONTAKT__OPIS_KONTAKTA = "opis_kontakta";
	public static String NAPLATA_KLIJENT_KONTAKT__TELEFON = "telefon";
	public static String NAPLATA_KLIJENT_KONTAKT__MOBITEL = "mobitel";
	public static String NAPLATA_KLIJENT_KONTAKT__FAX = "fax";
	public static String NAPLATA_KLIJENT_KONTAKT__EMAIL = "email";
	public static String NAPLATA_KLIJENT_KONTAKT__ULICA = "ulica";
	public static String NAPLATA_KLIJENT_KONTAKT__MJESTO = "mjesto";
	public static String NAPLATA_KLIJENT_KONTAKT__POSTANSKI_BROJ = "postanski_broj";
	public static String NAPLATA_KLIJENT_KONTAKT__STATUS_KONTAKTA = "status_kontakta";

	/* Attributes names /> */
	/* </ Constructors */
	public NaplataKlijentKontaktVo() {
		super();
	}

	public NaplataKlijentKontaktVo(AS2Record value) {
		super(value);
	}

	public String getIdKontatka() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__ID_KONTATKA);
	}

	public String getOib() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__OIB);
	}

	public String getIme() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__IME);
	}

	public String getPrezime() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__PREZIME);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__JMBG);
	}

	public String getOibKontakta() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__OIB_KONTAKTA);
	}

	public String getOpisKontakta() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__OPIS_KONTAKTA);
	}

	public String getTelefon() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__TELEFON);
	}

	public String getMobitel() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__MOBITEL);
	}

	public String getFax() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__FAX);
	}

	public String getEmail() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__EMAIL);
	}

	public String getUlica() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__ULICA);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__MJESTO);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__POSTANSKI_BROJ);
	}

	public String getStatusKontakta() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__STATUS_KONTAKTA);
	}

	public void setIdKontatka(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__ID_KONTATKA, value);
	}

	public void setOib(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__OIB, value);
	}

	public void setIme(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__IME, value);
	}

	public void setPrezime(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__PREZIME, value);
	}

	public void setJmbg(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__JMBG, value);
	}

	public void setOibKontakta(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__OIB_KONTAKTA, value);
	}

	public void setOpisKontakta(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__OPIS_KONTAKTA, value);
	}

	public void setTelefon(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__TELEFON, value);
	}

	public void setMobitel(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__MOBITEL, value);
	}

	public void setFax(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__FAX, value);
	}

	public void setEmail(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__EMAIL, value);
	}

	public void setUlica(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__ULICA, value);
	}

	public void setMjesto(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__MJESTO, value);
	}

	public void setPostanskiBroj(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__POSTANSKI_BROJ, value);
	}

	public void setStatusKontakta(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__STATUS_KONTAKTA, value);
	}

}