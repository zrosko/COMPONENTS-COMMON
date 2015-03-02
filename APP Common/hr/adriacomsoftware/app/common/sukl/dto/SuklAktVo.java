package hr.adriacomsoftware.app.common.sukl.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class SuklAktVo extends AS2Record { 
private static final long serialVersionUID = 1L;
public static String SUKL_AKT__ID_AKTA = "id_akta";
public static String SUKL_AKT__TIP = "tip";
public static String SUKL_AKT__NAZIV = "naziv";
public static String SUKL_AKT__POTPISNIK = "potpisnik";
public static String SUKL_AKT__POTPISNIK_IME_PREZIME = "potpisnik_ime_prezime";
public static String SUKL_AKT__DATUM_DONOSENJA = "datum_donosenja";
public static String SUKL_AKT__POCETAK_PRIMJENE = "pocetak_primjene";
public static String SUKL_AKT__INACICA = "inacica";
public static String SUKL_AKT__ZADUZENA_OSOBA = "zaduzena_osoba";
public static String SUKL_AKT__ZADUZENA_OSOBA_IME_PREZIME = "zaduzena_osoba_ime_prezime";
public static String SUKL_AKT__ZAMJENA_ZADUZENA_OSOBA = "zamjena_zaduzena_osoba";
public static String SUKL_AKT__ZAMJENA_ZADUZENA_OSOBA_IME_PREZIME = "zamjena_zaduzena_osoba_ime_prezime";
public static String SUKL_AKT__KORISNICI = "korisnici";
public static String SUKL_AKT__FRENKVENCIJA_OSVJEZAVANJA = "frenkvencija_osvjezavanja";
public static String SUKL_AKT__ZADNJE_OSVJEZENJE = "zadnje_osvjezenje";
public static String SUKL_AKT__DATUM_UKIDANJA = "datum_ukidanja";
public static String SUKL_AKT__OPIS = "opis";
public static String SUKL_AKT__KONZULTIRA_SE = "konzultira_se";
public static String SUKL_AKT__INFORMAIRA_SE = "informaira_se";
public static String SUKL_AKT__HTTP_LINK = "http_link";
public static String SUKL_AKT__POVJERLJIVOST = "povjerljivost";
public static String SUKL_AKT__DOKUMENT = "dokument";
public static String SUKL_AKT__ISPRAVNO = "ispravno";

public SuklAktVo () { 
	super();
}
public SuklAktVo (AS2Record value) { 
	super(value);
}

/************* GETTERS ************/

public String getIdAkta() {
	return get(SUKL_AKT__ID_AKTA);
}
public String getTip() {
	return get(SUKL_AKT__TIP);
}
public String getNaziv() {
	return get(SUKL_AKT__NAZIV);
}
public String getPotpisnik() {
	return get(SUKL_AKT__POTPISNIK);
}
public String getPotpisnikImePrezime() {
	return get(SUKL_AKT__POTPISNIK_IME_PREZIME);
}
public Calendar getDatumDonosenja() {
	return getAsCalendar(SUKL_AKT__DATUM_DONOSENJA);
}
public Calendar getPocetakPrimjene() {
	return getAsCalendar(SUKL_AKT__POCETAK_PRIMJENE);
}
public String getInacica() {
	return get(SUKL_AKT__INACICA);
}
public String getZaduzenaOsoba() {
	return get(SUKL_AKT__ZADUZENA_OSOBA);
}
public String getZaduzenaOsobaImePrezime() {
	return get(SUKL_AKT__ZADUZENA_OSOBA_IME_PREZIME);
}
public String getZamjenaZaduzenaOsoba() {
	return get(SUKL_AKT__ZAMJENA_ZADUZENA_OSOBA);
}
public String getZamjenaZaduzenaOsobaImePrezime() {
	return get(SUKL_AKT__ZAMJENA_ZADUZENA_OSOBA_IME_PREZIME);
}
public String getKorisnici() {
	return get(SUKL_AKT__KORISNICI);
}
public String getFrenkvencijaOsvjezavanja() {
	return get(SUKL_AKT__FRENKVENCIJA_OSVJEZAVANJA);
}
public Calendar getZadnjeOsvjezenje() {
	return getAsCalendar(SUKL_AKT__ZADNJE_OSVJEZENJE);
}
public Calendar getDatumUkidanja() {
	return getAsCalendar(SUKL_AKT__DATUM_UKIDANJA);
}
public String getOpis() {
	return get(SUKL_AKT__OPIS);
}
public String getKonzultiraSe() {
	return get(SUKL_AKT__KONZULTIRA_SE);
}
public String getInformairaSe() {
	return get(SUKL_AKT__INFORMAIRA_SE);
}
public String getHttpLink() {
	return get(SUKL_AKT__HTTP_LINK);
}
public String getPovjerljivost() {
	return get(SUKL_AKT__POVJERLJIVOST);
}
public String getDokument() {
	return get(SUKL_AKT__DOKUMENT);
}
public String getIspravno() {
	return get(SUKL_AKT__ISPRAVNO);
}

/************* SETTERS ************/

public void setIdAkta(String value) {
	set(SUKL_AKT__ID_AKTA, value);
}
public void setTip(String value) {
	set(SUKL_AKT__TIP, value);
}
public void setNaziv(String value) {
	set(SUKL_AKT__NAZIV, value);
}
public void setPotpisnik(String value) {
	set(SUKL_AKT__POTPISNIK, value);
}
public void setPotpisnikImePrezime(String value) {
	set(SUKL_AKT__POTPISNIK_IME_PREZIME, value);
}
public void setDatumDonosenja(Calendar value) {
	setCalendarAsDateString(value, SUKL_AKT__DATUM_DONOSENJA);
}
public void setPocetakPrimjene(Calendar value) {
	setCalendarAsDateString(value, SUKL_AKT__POCETAK_PRIMJENE);
}
public void setInacica(String value) {
	set(SUKL_AKT__INACICA, value);
}
public void setZaduzenaOsoba(String value) {
	set(SUKL_AKT__ZADUZENA_OSOBA, value);
}
public void setZaduzenaOsobaImePrezime(String value) {
	set(SUKL_AKT__ZADUZENA_OSOBA_IME_PREZIME, value);
}
public void setZamjenaZaduzenaOsoba(String value) {
	set(SUKL_AKT__ZAMJENA_ZADUZENA_OSOBA, value);
}
public void setZamjenaZaduzenaOsobaImePrezime(String value) {
	set(SUKL_AKT__ZAMJENA_ZADUZENA_OSOBA_IME_PREZIME, value);
}
public void setKorisnici(String value) {
	set(SUKL_AKT__KORISNICI, value);
}
public void setFrenkvencijaOsvjezavanja(String value) {
	set(SUKL_AKT__FRENKVENCIJA_OSVJEZAVANJA, value);
}
public void setZadnjeOsvjezenje(Calendar value) {
	setCalendarAsDateString(value, SUKL_AKT__ZADNJE_OSVJEZENJE);
}
public void setDatumUkidanja(Calendar value) {
	setCalendarAsDateString(value, SUKL_AKT__DATUM_UKIDANJA);
}
public void setOpis(String value) {
	set(SUKL_AKT__OPIS, value);
}
public void setKonzultiraSe(String value) {
	set(SUKL_AKT__KONZULTIRA_SE, value);
}
public void setInformairaSe(String value) {
	set(SUKL_AKT__INFORMAIRA_SE, value);
}
public void setHttpLink(String value) {
	set(SUKL_AKT__HTTP_LINK, value);
}
public void setPovjerljivost(String value) {
	set(SUKL_AKT__POVJERLJIVOST, value);
}
public void setDokument(String value) {
	set(SUKL_AKT__DOKUMENT, value);
}
public void setIspravno(String value) {
	set(SUKL_AKT__ISPRAVNO, value);
}
}