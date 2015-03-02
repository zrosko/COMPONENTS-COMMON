package hr.adriacomsoftware.app.common.obrtnici.bonitet.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class BonitetObrtnikVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String BONITET_OBRTNIK__ID_BONITETA = "id_boniteta";
	public static String BONITET_OBRTNIK__MATICNI_BROJ = "maticni_broj";
	public static String BONITET_OBRTNIK__OIB = "oib";
	public static String BONITET_OBRTNIK__NAZIV = "naziv";
	public static String BONITET_OBRTNIK__OPIS = "opis";
	public static String BONITET_OBRTNIK__POSLOVNE_BANKE = "poslovne_banke";
	public static String BONITET_OBRTNIK__POCETAK_POSLOVNOG_ODNOSA = "pocetak_poslovnog_odnosa";
	public static String BONITET_OBRTNIK__GODINA_POCETKA_POSLOVANJA = "godina_pocetka_poslovanja";
	public static String BONITET_OBRTNIK__DATUM = "datum";
	public static String BONITET_OBRTNIK__UKUPNI_PRIMICI = "ukupni_primici";
	public static String BONITET_OBRTNIK__UKUPNI_IZDACI = "ukupni_izdaci";
	public static String BONITET_OBRTNIK__DOHODAK = "dohodak";
	public static String BONITET_OBRTNIK__NAPOMENA = "napomena";
	public static String BONITET_OBRTNIK__BROJ_ZAPOSLENIH = "broj_zaposlenih";
	public static String BONITET_OBRTNIK__BROJ_DANA_BLOKADE = "broj_dana_blokade";
	public static String BONITET_OBRTNIK__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String BONITET_OBRTNIK__ISPRAVNO = "ispravno";

	public BonitetObrtnikVo() {
		super();
	}

	public BonitetObrtnikVo(AS2Record value) {
		super(value);
	}

	public String getIdBoniteta() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__ID_BONITETA);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__MATICNI_BROJ);
	}

	public String getOib() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__OIB);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__OPIS);
	}

	public String getPoslovneBanke() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__POSLOVNE_BANKE);
	}

	public String getPocetakPoslovnogOdnosa() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__POCETAK_POSLOVNOG_ODNOSA);
	}

	public String getGodinaPocetkaPoslovanja() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__GODINA_POCETKA_POSLOVANJA);
	}

	public Calendar getDatum() {
		return getAsCalendar(BONITET_OBRTNIK__DATUM);
	}

	public String getUkupniPrimici() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__UKUPNI_PRIMICI);
	}

	public String getUkupniIzdaci() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__UKUPNI_IZDACI);
	}

	public String getDohodak() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__DOHODAK);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__NAPOMENA);
	}

	public String getBrojZaposlenih() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__BROJ_ZAPOSLENIH);
	}

	public String getBrojDanaBlokade() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__BROJ_DANA_BLOKADE);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(BONITET_OBRTNIK__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(BONITET_OBRTNIK__ISPRAVNO);
	}

	public void setIdBoniteta(String value) {
		set(BONITET_OBRTNIK__ID_BONITETA, value);
	}

	public void setMaticniBroj(String value) {
		set(BONITET_OBRTNIK__MATICNI_BROJ, value);
	}

	public void setOib(String value) {
		set(BONITET_OBRTNIK__OIB, value);
	}

	public void setNaziv(String value) {
		set(BONITET_OBRTNIK__NAZIV, value);
	}

	public void setOpis(String value) {
		set(BONITET_OBRTNIK__OPIS, value);
	}

	public void setPoslovneBanke(String value) {
		set(BONITET_OBRTNIK__POSLOVNE_BANKE, value);
	}

	public void setPocetakPoslovnogOdnosa(String value) {
		set(BONITET_OBRTNIK__POCETAK_POSLOVNOG_ODNOSA, value);
	}

	public void setGodinaPocetkaPoslovanja(String value) {
		set(BONITET_OBRTNIK__GODINA_POCETKA_POSLOVANJA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, BONITET_OBRTNIK__DATUM);
	}

	public void setUkupniPrimici(String value) {
		set(BONITET_OBRTNIK__UKUPNI_PRIMICI, value);
	}

	public void setUkupniIzdaci(String value) {
		set(BONITET_OBRTNIK__UKUPNI_IZDACI, value);
	}

	public void setDohodak(String value) {
		set(BONITET_OBRTNIK__DOHODAK, value);
	}

	public void setNapomena(String value) {
		set(BONITET_OBRTNIK__NAPOMENA, value);
	}

	public void setBrojZaposlenih(String value) {
		set(BONITET_OBRTNIK__BROJ_ZAPOSLENIH, value);
	}

	public void setBrojDanaBlokade(String value) {
		set(BONITET_OBRTNIK__BROJ_DANA_BLOKADE, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value, BONITET_OBRTNIK__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setIspravno(String value) {
		set(BONITET_OBRTNIK__ISPRAVNO, value);
	}

	// double
	public void setUkupniPrimici(double value) {
		set(BONITET_OBRTNIK__UKUPNI_PRIMICI, value);
	}

	public void setUkupniIzdaci(double value) {
		set(BONITET_OBRTNIK__UKUPNI_IZDACI, value);
	}

	public void setDohodak(double value) {
		set(BONITET_OBRTNIK__DOHODAK, value);
	}
}