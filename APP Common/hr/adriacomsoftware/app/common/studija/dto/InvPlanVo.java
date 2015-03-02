package hr.adriacomsoftware.app.common.studija.dto;

import hr.as2.inf.common.data.AS2Record;

public class InvPlanVo extends InvVo {
	private static final long serialVersionUID = 1L;
	public static String INV_PLAN__ID_PLANA = "id_plana";
	public static String INV_PLAN__NAZIV_PLANA = "naziv_plana";
	public static String INV_PLAN__NAZIV_PODUZETNIKA = "naziv_poduzetnika";
	public static String INV_PLAN__NAZIV_PODUZETNIKA_KRATKI = "naziv_poduzetnika_kratki";
	public static String INV_PLAN__ADRESA = "adresa";
	public static String INV_PLAN__OIB = "oib";
	public static String INV_PLAN__MATICNI_BROJ = "maticni_broj";
	public static String INV_PLAN__OBLIK_VLASNISTVA = "oblik_vlasnistva";
	public static String INV_PLAN__VELICINA = "velicina";
	public static String INV_PLAN__POSLOVNA_BANKA = "poslovna_banka";
	public static String INV_PLAN__BROJ_ZAPOSLENIH = "broj_zaposlenih";
	public static String INV_PLAN__UPISANI_KAPITAL = "upisani_kapital";
	public static String INV_PLAN__GODINA_OSNIVANJA = "godina_osnivanja";
	public static String INV_PLAN__PRAVNI_OBLIK = "pravni_oblik";
	public static String INV_PLAN__NKD_DJELATNOST = "nkd_djelatnost";
	public static String INV_PLAN__INTERNET_ADRESA = "internet_adresa";
	public static String INV_PLAN__EMAIL = "email";
	public static String INV_PLAN__TELEFON = "telefon";
	public static String INV_PLAN__ISPRAVNO = "ispravno";

	public InvPlanVo() {
		super();
	}

	public InvPlanVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdPlana() {
		return getAsStringOrEmpty(INV_PLAN__ID_PLANA);
	}

	public String getNazivPlana() {
		return getAsStringOrEmpty(INV_PLAN__NAZIV_PLANA);
	}

	public String getNazivPoduzetnika() {
		return getAsStringOrEmpty(INV_PLAN__NAZIV_PODUZETNIKA);
	}

	public String getNazivPoduzetnikaKratki() {
		return getAsStringOrEmpty(INV_PLAN__NAZIV_PODUZETNIKA_KRATKI);
	}

	public String getAdresa() {
		return getAsStringOrEmpty(INV_PLAN__ADRESA);
	}

	public String getOib() {
		return getAsStringOrEmpty(INV_PLAN__OIB);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(INV_PLAN__MATICNI_BROJ);
	}

	public String getOblikVlasnistva() {
		return getAsStringOrEmpty(INV_PLAN__OBLIK_VLASNISTVA);
	}

	public String getVelicina() {
		return getAsStringOrEmpty(INV_PLAN__VELICINA);
	}

	public String getPoslovnaBanka() {
		return getAsStringOrEmpty(INV_PLAN__POSLOVNA_BANKA);
	}

	public String getBrojZaposlenih() {
		return getAsStringOrEmpty(INV_PLAN__BROJ_ZAPOSLENIH);
	}

	public String getUpisaniKapital() {
		return getAsStringOrEmpty(INV_PLAN__UPISANI_KAPITAL);
	}

	public String getGodinaOsnivanja() {
		return getAsStringOrEmpty(INV_PLAN__GODINA_OSNIVANJA);
	}

	public String getPravniOblik() {
		return getAsStringOrEmpty(INV_PLAN__PRAVNI_OBLIK);
	}

	public String getNkdDjelatnost() {
		return getAsStringOrEmpty(INV_PLAN__NKD_DJELATNOST);
	}

	public String getInternetAdresa() {
		return getAsStringOrEmpty(INV_PLAN__INTERNET_ADRESA);
	}

	public String getEmail() {
		return getAsStringOrEmpty(INV_PLAN__EMAIL);
	}

	public String getTelefon() {
		return getAsStringOrEmpty(INV_PLAN__TELEFON);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(INV_PLAN__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdPlana(String value) {
		set(INV_PLAN__ID_PLANA, value);
	}

	public void setNazivPlana(String value) {
		set(INV_PLAN__NAZIV_PLANA, value);
	}

	public void setNazivPoduzetnika(String value) {
		set(INV_PLAN__NAZIV_PODUZETNIKA, value);
	}

	public void setNazivPoduzetnikaKratki(String value) {
		set(INV_PLAN__NAZIV_PODUZETNIKA_KRATKI, value);
	}

	public void setAdresa(String value) {
		set(INV_PLAN__ADRESA, value);
	}

	public void setOib(String value) {
		set(INV_PLAN__OIB, value);
	}

	public void setMaticniBroj(String value) {
		set(INV_PLAN__MATICNI_BROJ, value);
	}

	public void setOblikVlasnistva(String value) {
		set(INV_PLAN__OBLIK_VLASNISTVA, value);
	}

	public void setVelicina(String value) {
		set(INV_PLAN__VELICINA, value);
	}

	public void setPoslovnaBanka(String value) {
		set(INV_PLAN__POSLOVNA_BANKA, value);
	}

	public void setBrojZaposlenih(String value) {
		set(INV_PLAN__BROJ_ZAPOSLENIH, value);
	}

	public void setUpisaniKapital(String value) {
		set(INV_PLAN__UPISANI_KAPITAL, value);
	}

	public void setGodinaOsnivanja(String value) {
		set(INV_PLAN__GODINA_OSNIVANJA, value);
	}

	public void setPravniOblik(String value) {
		set(INV_PLAN__PRAVNI_OBLIK, value);
	}

	public void setNkdDjelatnost(String value) {
		set(INV_PLAN__NKD_DJELATNOST, value);
	}

	public void setInternetAdresa(String value) {
		set(INV_PLAN__INTERNET_ADRESA, value);
	}

	public void setEmail(String value) {
		set(INV_PLAN__EMAIL, value);
	}

	public void setTelefon(String value) {
		set(INV_PLAN__TELEFON, value);
	}

	public void setIspravno(String value) {
		set(INV_PLAN__ISPRAVNO, value);
	}
}