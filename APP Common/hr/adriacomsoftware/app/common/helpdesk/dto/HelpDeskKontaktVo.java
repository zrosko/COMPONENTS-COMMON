package hr.adriacomsoftware.app.common.helpdesk.dto;

import hr.as2.inf.common.data.AS2Record;

public class HelpDeskKontaktVo extends HelpDeskVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String HD_KONTAKT__ID_KONTAKTA = "id_kontakta";
	public static String HD_KONTAKT__NAZIV = "naziv";
	public static String HD_KONTAKT__TELEFON = "telefon";
	public static String HD_KONTAKT__TELEFON_LOKALNI = "telefon_lokalni";
	public static String HD_KONTAKT__MOBITEL = "mobitel";
	public static String HD_KONTAKT__FAX = "fax";
	public static String HD_KONTAKT__EMAIL = "email";
	public static String HD_KONTAKT__KONTAKT_OSOBA = "kontakt_osoba";
	public static String HD_KONTAKT__KONTAKT_OSOBA_TELEFON = "kontakt_osoba_telefon";
	public static String HD_KONTAKT__KONTAKT_OSOBA_MOBITEL = "kontakt_osoba_mobitel";
	public static String HD_KONTAKT__KONTAKT_OSOBA_EMAIL = "kontakt_osoba_email";
	public static String HD_KONTAKT__KONTAKT_OSOBA_FUNKCIJA = "kontakt_osoba_funkcija";
	public static String HD_KONTAKT__VRSTA = "vrsta";
	public static String HD_KONTAKT__ULICA = "ulica";
	public static String HD_KONTAKT__POSTANSKI_BROJ = "postanski_broj";
	public static String HD_KONTAKT__MJESTO = "mjesto";
	public static String HD_KONTAKT__OPIS = "opis";
	public static String HD_KONTAKT__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public HelpDeskKontaktVo() {
		super();
	}

	public HelpDeskKontaktVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdKontakta() {
		return getAsStringOrEmpty(HD_KONTAKT__ID_KONTAKTA);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(HD_KONTAKT__NAZIV);
	}

	public String getTelefon() {
		return getAsStringOrEmpty(HD_KONTAKT__TELEFON);
	}

	public String getTelefonLokalni() {
		return getAsStringOrEmpty(HD_KONTAKT__TELEFON_LOKALNI);
	}

	public String getMobitel() {
		return getAsStringOrEmpty(HD_KONTAKT__MOBITEL);
	}

	public String getFax() {
		return getAsStringOrEmpty(HD_KONTAKT__FAX);
	}

	public String getEmail() {
		return getAsStringOrEmpty(HD_KONTAKT__EMAIL);
	}

	public String getKontaktOsoba() {
		return getAsStringOrEmpty(HD_KONTAKT__KONTAKT_OSOBA);
	}

	public String getKontaktOsobaTelefon() {
		return getAsStringOrEmpty(HD_KONTAKT__KONTAKT_OSOBA_TELEFON);
	}

	public String getKontaktOsobaMobitel() {
		return getAsStringOrEmpty(HD_KONTAKT__KONTAKT_OSOBA_MOBITEL);
	}

	public String getKontaktOsobaEmail() {
		return getAsStringOrEmpty(HD_KONTAKT__KONTAKT_OSOBA_EMAIL);
	}

	public String getKontaktOsobaFunkcija() {
		return getAsStringOrEmpty(HD_KONTAKT__KONTAKT_OSOBA_FUNKCIJA);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(HD_KONTAKT__VRSTA);
	}

	public String getUlica() {
		return getAsStringOrEmpty(HD_KONTAKT__ULICA);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(HD_KONTAKT__POSTANSKI_BROJ);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(HD_KONTAKT__MJESTO);
	}

	public String getOpis() {
		return getAsStringOrEmpty(HD_KONTAKT__OPIS);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(HD_KONTAKT__ISPRAVNO);
	}

	public void setIdKontakta(String value) {
		set(HD_KONTAKT__ID_KONTAKTA, value);
	}

	public void setNaziv(String value) {
		set(HD_KONTAKT__NAZIV, value);
	}

	public void setTelefon(String value) {
		set(HD_KONTAKT__TELEFON, value);
	}

	public void setTelefonLokalni(String value) {
		set(HD_KONTAKT__TELEFON_LOKALNI, value);
	}

	public void setMobitel(String value) {
		set(HD_KONTAKT__MOBITEL, value);
	}

	public void setFax(String value) {
		set(HD_KONTAKT__FAX, value);
	}

	public void setEmail(String value) {
		set(HD_KONTAKT__EMAIL, value);
	}

	public void setKontaktOsoba(String value) {
		set(HD_KONTAKT__KONTAKT_OSOBA, value);
	}

	public void setKontaktOsobaTelefon(String value) {
		set(HD_KONTAKT__KONTAKT_OSOBA_TELEFON, value);
	}

	public void setKontaktOsobaMobitel(String value) {
		set(HD_KONTAKT__KONTAKT_OSOBA_MOBITEL, value);
	}

	public void setKontaktOsobaEmail(String value) {
		set(HD_KONTAKT__KONTAKT_OSOBA_EMAIL, value);
	}

	public void setKontaktOsobaFunkcija(String value) {
		set(HD_KONTAKT__KONTAKT_OSOBA_FUNKCIJA, value);
	}

	public void setVrsta(String value) {
		set(HD_KONTAKT__VRSTA, value);
	}

	public void setUlica(String value) {
		set(HD_KONTAKT__ULICA, value);
	}

	public void setPostanskiBroj(String value) {
		set(HD_KONTAKT__POSTANSKI_BROJ, value);
	}

	public void setMjesto(String value) {
		set(HD_KONTAKT__MJESTO, value);
	}

	public void setOpis(String value) {
		set(HD_KONTAKT__OPIS, value);
	}

	public void setIspravno(String value) {
		set(HD_KONTAKT__ISPRAVNO, value);
	}
	/* Getters/Setters /> */
}