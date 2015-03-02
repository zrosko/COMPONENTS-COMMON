package hr.adriacomsoftware.app.common.pranjenovca.transakcija.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/**
 * 
 */
public class PrnTransakcijaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PRN_TRANSAKCIJA__PONAVLJANJE_OBRADE = "@ponavljanje_obrade";
	public static String PRN_TRANSAKCIJA__ID_TRANSAKCIJE = "id_transakcije";
	public static String PRN_TRANSAKCIJA__ID_TRANSAKCIJE_VEZA = "id_transakcije_veza";
	public static String PRN_TRANSAKCIJA__BROJ_STAVKE = "broj_stavke";
	public static String PRN_TRANSAKCIJA__VRSTA_TRANSAKCIJE = "vrsta_transakcije";
	public static String PRN_TRANSAKCIJA__JMBG_MB = "jmbg_mb";
	public static String PRN_TRANSAKCIJA__OIB = "oib";
	public static String PRN_TRANSAKCIJA__BROJ_PARTIJE = "broj_partije";
	public static String PRN_TRANSAKCIJA__BROJ_KONTA = "broj_konta";
	public static String PRN_TRANSAKCIJA__VRSTA_PROMETA = "vrsta_prometa";
	public static String PRN_TRANSAKCIJA__SIFRA_BANKE = "sifra_banke";
	public static String PRN_TRANSAKCIJA__ORGANIZACIJSKA_JEDINICA_UNOSA = "organizacijska_jedinica_unosa";
	public static String PRN_TRANSAKCIJA__DATUM_TRANSAKCIJE = "datum_transakcije";
	public static String PRN_TRANSAKCIJA__EKSTERNI_BROJ_DOKUMENTA = "eksterni_broj_dokumenta";
	public static String PRN_TRANSAKCIJA__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";
	public static String PRN_TRANSAKCIJA__DATUM_PROMETA = "datum_prometa";
	public static String PRN_TRANSAKCIJA__DATUM_VALUTIRANJA = "datum_valutiranja";
	public static String PRN_TRANSAKCIJA__SVRHA_TRANSAKCIJE = "svrha_transakcije";
	public static String PRN_TRANSAKCIJA__SVRHA_OBRAZLOZENJE = "svrha_obrazlozenje";
	public static String PRN_TRANSAKCIJA__VALUTA_TRANSAKCIJE = "valuta_transakcije";
	public static String PRN_TRANSAKCIJA__PROTUVALUTA_TRANSAKCIJE = "protuvaluta_transakcije";
	public static String PRN_TRANSAKCIJA__IZNOS_VALUTA = "iznos_valuta";
	public static String PRN_TRANSAKCIJA__STANJE_OBRASCA = "stanje_obrasca";
	public static String PRN_TRANSAKCIJA__IZNOS_PROTUVALUTA = "iznos_protuvaluta";
	public static String PRN_TRANSAKCIJA__STANJE_ISPORUCENOSTI_UREDU = "stanje_isporucenosti_uredu";
	public static String PRN_TRANSAKCIJA__DATUM_ANALIZE = "datum_analize";
	public static String PRN_TRANSAKCIJA__STATUS_TRANSAKCIJE = "status_transakcije";
	public static String PRN_TRANSAKCIJA__KANAL_TRANSAKCIJE = "kanal_transakcije";
	public static String PRN_TRANSAKCIJA__NACIN_PROVODENJA = "nacin_provodenja";
	public static String PRN_TRANSAKCIJA__PRAVNA_FIZICKA = "pravna_fizicka";
	public static String PRN_TRANSAKCIJA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String PRN_TRANSAKCIJA__UCITANO = "ucitano";
	public static String PRN_TRANSAKCIJA__DUGUJE_POTRAZUJE = "duguje_potrazuje";
	public static String PRN_TRANSAKCIJA__OZNAKA_STORNA = "oznaka_storna";
	public static String PRN_TRANSAKCIJA__OPIS_STAVKE = "opis_stavke";
	public static String PRN_TRANSAKCIJA__DATUM_POCETAK = "datum_pocetak";
	public static String PRN_TRANSAKCIJA__DATUM_KRAJ = "datum_kraj";

	/* Attributes names /> */
	/* </ Constructors */
	public PrnTransakcijaVo() {
		super();
	}

	public PrnTransakcijaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */

	/* </ Getters */
	public String getIdTransakcije() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__ID_TRANSAKCIJE);
	}

	public String getIdTransakcijeVeza() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__ID_TRANSAKCIJE_VEZA);
	}

	public String getBrojStavke() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__BROJ_STAVKE);
	}

	public String getVrstaTransakcije() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__VRSTA_TRANSAKCIJE);
	}

	public String getJmbgMb() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__JMBG_MB);
	}

	public String getOib() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__OIB);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__BROJ_PARTIJE);
	}

	public String getBrojKonta() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__BROJ_KONTA);
	}

	public String getVrstaPrometa() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__VRSTA_PROMETA);
	}

	public String getSifraBanke() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__SIFRA_BANKE);
	}

	public String getOrganizacijskaJedinicaUnosa() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__ORGANIZACIJSKA_JEDINICA_UNOSA);
	}

	public Calendar getDatumTransakcije() {
		return getAsCalendar(PRN_TRANSAKCIJA__DATUM_TRANSAKCIJE);
	}

	public String getEksterniBrojDokumenta() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__EKSTERNI_BROJ_DOKUMENTA);
	}

	public String getOperaterZadnjeIzmjene() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__OPERATER_ZADNJE_IZMJENE);
	}

	public Calendar getDatumPrometa() {
		return getAsCalendar(PRN_TRANSAKCIJA__DATUM_PROMETA);
	}

	public Calendar getVrijemePrometa() {
		return getAsCalendar(PRN_TRANSAKCIJA__DATUM_PROMETA);
	}

	public Calendar getDatumValutiranja() {
		return getAsCalendar(PRN_TRANSAKCIJA__DATUM_VALUTIRANJA);
	}

	public String getSvrhaTransakcije() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__SVRHA_TRANSAKCIJE);
	}

	public String getSvrhaObrazlozenje() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__SVRHA_OBRAZLOZENJE);
	}

	public String getValutaTransakcije() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__VALUTA_TRANSAKCIJE);
	}

	public String getProtuvalutaTransakcije() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__PROTUVALUTA_TRANSAKCIJE);
	}

	public String getIznosValuta() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__IZNOS_VALUTA);
	}

	public String getStanjeObrasca() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__STANJE_OBRASCA);
	}

	public String getIznosProtuvaluta() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__IZNOS_PROTUVALUTA);
	}

	public String getStanjeIsporucenostiUredu() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__STANJE_ISPORUCENOSTI_UREDU);
	}

	public Calendar getDatumAnalize() {
		return getAsCalendar(PRN_TRANSAKCIJA__DATUM_ANALIZE);
	}

	public String getStatusTransakcije() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__STATUS_TRANSAKCIJE);
	}

	public String getKanalTransakcije() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__KANAL_TRANSAKCIJE);
	}

	public String getNacinProvodenja() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__NACIN_PROVODENJA);
	}

	public String getPravnaFizicka() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__PRAVNA_FIZICKA);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(PRN_TRANSAKCIJA__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getUcitano() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__UCITANO);
	}

	public String getDugujePotrazuje() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__DUGUJE_POTRAZUJE);
	}

	public String getOznakaStorna() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__OZNAKA_STORNA);
	}

	public String getOpisStavke() {
		return getAsStringOrEmpty(PRN_TRANSAKCIJA__OPIS_STAVKE);
	}

	public Calendar getDatumPocetak() {
		return getAsCalendar(PRN_TRANSAKCIJA__DATUM_POCETAK);
	}

	public Calendar getDatumKraj() {
		return getAsCalendar(PRN_TRANSAKCIJA__DATUM_KRAJ);
	}

	public void setIdTransakcije(String value) {
		set(PRN_TRANSAKCIJA__ID_TRANSAKCIJE, value);
	}

	public void setIdTransakcijeVeza(String value) {
		set(PRN_TRANSAKCIJA__ID_TRANSAKCIJE_VEZA, value);
	}

	public void setBrojStavke(String value) {
		set(PRN_TRANSAKCIJA__BROJ_STAVKE, value);
	}

	public void setVrstaTransakcije(String value) {
		set(PRN_TRANSAKCIJA__VRSTA_TRANSAKCIJE, value);
	}

	public void setJmbgMb(String value) {
		set(PRN_TRANSAKCIJA__JMBG_MB, value);
	}

	public void setOib(String value) {
		set(PRN_TRANSAKCIJA__OIB, value);
	}

	public void setBrojPartije(String value) {
		set(PRN_TRANSAKCIJA__BROJ_PARTIJE, value);
	}

	public void setBrojKonta(String value) {
		set(PRN_TRANSAKCIJA__BROJ_KONTA, value);
	}

	public void setVrstaPrometa(String value) {
		set(PRN_TRANSAKCIJA__VRSTA_PROMETA, value);
	}

	public void setSifraBanke(String value) {
		set(PRN_TRANSAKCIJA__SIFRA_BANKE, value);
	}

	public void setOrganizacijskaJedinicaUnosa(String value) {
		set(PRN_TRANSAKCIJA__ORGANIZACIJSKA_JEDINICA_UNOSA, value);
	}

	public void setDatumTransakcije(Calendar value) {
		setCalendarAsDateString(value, PRN_TRANSAKCIJA__DATUM_TRANSAKCIJE);
	}

	public void setEksterniBrojDokumenta(String value) {
		set(PRN_TRANSAKCIJA__EKSTERNI_BROJ_DOKUMENTA, value);
	}

	public void setOperaterZadnjeIzmjene(String value) {
		set(PRN_TRANSAKCIJA__OPERATER_ZADNJE_IZMJENE, value);
	}

	public void setDatumPrometa(Calendar value) {
		setCalendarAsDateString(value, PRN_TRANSAKCIJA__DATUM_PROMETA);
	}

	public void setVrijemePrometa(Calendar c) {
		concatinateTimeToExistingDate(c, PRN_TRANSAKCIJA__DATUM_PROMETA);
	}

	public void setDatumValutiranja(Calendar value) {
		setCalendarAsDateString(value, PRN_TRANSAKCIJA__DATUM_VALUTIRANJA);
	}

	public void setSvrhaTransakcije(String value) {
		set(PRN_TRANSAKCIJA__SVRHA_TRANSAKCIJE, value);
	}

	public void setSvrhaObrazlozenje(String value) {
		set(PRN_TRANSAKCIJA__SVRHA_OBRAZLOZENJE, value);
	}

	public void setValutaTransakcije(String value) {
		set(PRN_TRANSAKCIJA__VALUTA_TRANSAKCIJE, value);
	}

	public void setProtuvalutaTransakcije(String value) {
		set(PRN_TRANSAKCIJA__PROTUVALUTA_TRANSAKCIJE, value);
	}

	public void setIznosValuta(String value) {
		set(PRN_TRANSAKCIJA__IZNOS_VALUTA, value);
	}

	public void setStanjeObrasca(String value) {
		set(PRN_TRANSAKCIJA__STANJE_OBRASCA, value);
	}

	public void setIznosProtuvaluta(String value) {
		set(PRN_TRANSAKCIJA__IZNOS_PROTUVALUTA, value);
	}

	public void setStanjeIsporucenostiUredu(String value) {
		set(PRN_TRANSAKCIJA__STANJE_ISPORUCENOSTI_UREDU, value);
	}

	public void setDatumAnalize(Calendar value) {
		setCalendarAsDateString(value, PRN_TRANSAKCIJA__DATUM_ANALIZE);
	}

	public void setStatusTransakcije(String value) {
		set(PRN_TRANSAKCIJA__STATUS_TRANSAKCIJE, value);
	}

	public void setKanalTransakcije(String value) {
		set(PRN_TRANSAKCIJA__KANAL_TRANSAKCIJE, value);
	}

	public void setNacinProvodenja(String value) {
		set(PRN_TRANSAKCIJA__NACIN_PROVODENJA, value);
	}

	public void setPravnaFizicka(String value) {
		set(PRN_TRANSAKCIJA__PRAVNA_FIZICKA, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value, PRN_TRANSAKCIJA__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setUcitano(String value) {
		set(PRN_TRANSAKCIJA__UCITANO, value);
	}

	public void setDugujePotrazuje(String value) {
		set(PRN_TRANSAKCIJA__DUGUJE_POTRAZUJE, value);
	}

	public void setOznakaStorna(String value) {
		set(PRN_TRANSAKCIJA__OZNAKA_STORNA, value);
	}

	public void setOpisStavke(String value) {
		set(PRN_TRANSAKCIJA__OPIS_STAVKE, value);
	}

	public void setDatumPocetak(Calendar value) {
		setCalendarAsDateString(value, PRN_TRANSAKCIJA__DATUM_POCETAK);
	}

	public void setDatumKraj(Calendar value) {
		setCalendarAsDateString(value, PRN_TRANSAKCIJA__DATUM_KRAJ);
	}

	/* Setters /> */
}