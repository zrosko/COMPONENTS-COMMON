package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/************* CONSTANTS view_naplata_gr_krediti_pogled ************/

public class NaplataGrKreditiVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_PARTIJE_TEKST = "broj_partije_tekst";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__JMBG_TEKST = "jmbg_tekst";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__OIB_TEKST = "oib_tekst";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__PREZIME_IME = "prezime_ime";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__ODOBRENI_IZNOS_TEKST = "odobreni_iznos_tekst";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELI_DUG_TEKST = "dospjeli_dug_tekst";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_DANA_KASNJENJA = "broj_dana_kasnjenja";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__STATUS_PREDMETA = "status_predmeta";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__RIZICNA_SKUPINA = "rizicna_skupina";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__POSTOTAK_REZERVACIJE = "postotak_rezervacije";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__ULICA = "ulica";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__POSTANSKI_BROJ = "postanski_broj";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__MJESTO = "mjesto";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__DRZAVA = "drzava";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__TELEFON = "telefon";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_PARTIJE = "broj_partije";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__OIB = "oib";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__ODOBRENI_IZNOS = "odobreni_iznos";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__KAMATNA_STOPA = "kamatna_stopa";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_MJESECI_OTPLATE = "broj_mjeseci_otplate";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__VISINA_RATE = "visina_rate";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__DATUM_OTVARANJA_PARTIJE = "datum_otvaranja_partije";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__DATUM_DOSPIJECA = "datum_dospijeca";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__NEDOSPJELA_GLAVNICA = "nedospjela_glavnica";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__NEDOSPJELA_KAMATA = "nedospjela_kamata";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELA_GLAVNICA = "dospjela_glavnica";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELA_KAMATA = "dospjela_kamata";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELA_NAKNADA = "dospjela_naknada";
	public static String VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELI_DUG = "dospjeli_dug";

	public NaplataGrKreditiVo() {
		super();
	}

	public NaplataGrKreditiVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getBrojPartijeTekst() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_PARTIJE_TEKST);
	}

	public String getJmbgTekst() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__JMBG_TEKST);
	}

	public String getOibTekst() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__OIB_TEKST);
	}

	public String getPrezimeIme() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__PREZIME_IME);
	}

	public String getOdobreniIznosTekst() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__ODOBRENI_IZNOS_TEKST);
	}

	public String getDospjeliDugTekst() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELI_DUG_TEKST);
	}

	public String getBrojDanaKasnjenja() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_DANA_KASNJENJA);
	}

	public String getStatusPredmeta() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__STATUS_PREDMETA);
	}

	public String getRizicnaSkupina() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__RIZICNA_SKUPINA);
	}

	public String getPostotakRezervacije() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__POSTOTAK_REZERVACIJE);
	}

	public String getUlica() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__ULICA);
	}

	public String getPostanskiBroj() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__POSTANSKI_BROJ);
	}

	public String getMjesto() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__MJESTO);
	}

	public String getDrzava() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__DRZAVA);
	}

	public String getTelefon() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__TELEFON);
	}

	public String getBrojPartije() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_PARTIJE);
	}

	public String getOib() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__OIB);
	}

	public String getOdobreniIznos() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__ODOBRENI_IZNOS);
	}

	public String getKamatnaStopa() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__KAMATNA_STOPA);
	}

	public String getBrojMjeseciOtplate() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_MJESECI_OTPLATE);
	}

	public String getVisinaRate() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__VISINA_RATE);
	}

	public Calendar getDatumOtvaranjaPartije() {
		return getAsCalendar(VIEW_NAPLATA_GR_KREDITI_POGLED__DATUM_OTVARANJA_PARTIJE);
	}

	public Calendar getDatumDospijeca() {
		return getAsCalendar(VIEW_NAPLATA_GR_KREDITI_POGLED__DATUM_DOSPIJECA);
	}

	public String getNedospjelaGlavnica() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__NEDOSPJELA_GLAVNICA);
	}

	public String getNedospjelaKamata() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__NEDOSPJELA_KAMATA);
	}

	public String getDospjelaGlavnica() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELA_GLAVNICA);
	}

	public String getDospjelaKamata() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELA_KAMATA);
	}

	public String getDospjelaNaknada() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELA_NAKNADA);
	}

	public String getDospjeliDug() {
		return get(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELI_DUG);
	}

	/************* SETTERS ************/

	public void setBrojPartijeTekst(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_PARTIJE_TEKST, value);
	}

	public void setJmbgTekst(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__JMBG_TEKST, value);
	}

	public void setOibTekst(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__OIB_TEKST, value);
	}

	public void setPrezimeIme(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__PREZIME_IME, value);
	}

	public void setOdobreniIznosTekst(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__ODOBRENI_IZNOS_TEKST, value);
	}

	public void setDospjeliDugTekst(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELI_DUG_TEKST, value);
	}

	public void setBrojDanaKasnjenja(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_DANA_KASNJENJA, value);
	}

	public void setStatusPredmeta(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__STATUS_PREDMETA, value);
	}

	public void setRizicnaSkupina(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__RIZICNA_SKUPINA, value);
	}

	public void setPostotakRezervacije(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__POSTOTAK_REZERVACIJE, value);
	}

	public void setUlica(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__ULICA, value);
	}

	public void setPostanskiBroj(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__POSTANSKI_BROJ, value);
	}

	public void setMjesto(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__MJESTO, value);
	}

	public void setDrzava(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__DRZAVA, value);
	}

	public void setTelefon(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__TELEFON, value);
	}

	public void setBrojPartije(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_PARTIJE, value);
	}

	public void setOib(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__OIB, value);
	}

	public void setOdobreniIznos(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__ODOBRENI_IZNOS, value);
	}

	public void setKamatnaStopa(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__KAMATNA_STOPA, value);
	}

	public void setBrojMjeseciOtplate(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__BROJ_MJESECI_OTPLATE, value);
	}

	public void setVisinaRate(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__VISINA_RATE, value);
	}

	public void setDatumOtvaranjaPartije(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_KREDITI_POGLED__DATUM_OTVARANJA_PARTIJE);
	}

	public void setDatumDospijeca(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_KREDITI_POGLED__DATUM_DOSPIJECA);
	}

	public void setNedospjelaGlavnica(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__NEDOSPJELA_GLAVNICA, value);
	}

	public void setNedospjelaKamata(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__NEDOSPJELA_KAMATA, value);
	}

	public void setDospjelaGlavnica(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELA_GLAVNICA, value);
	}

	public void setDospjelaKamata(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELA_KAMATA, value);
	}

	public void setDospjelaNaknada(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELA_NAKNADA, value);
	}

	public void setDospjeliDug(String value) {
		set(VIEW_NAPLATA_GR_KREDITI_POGLED__DOSPJELI_DUG, value);
	}
}