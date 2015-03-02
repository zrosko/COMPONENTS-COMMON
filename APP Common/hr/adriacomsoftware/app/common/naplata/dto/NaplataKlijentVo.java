package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class NaplataKlijentVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String NAPLATA_KLIJENT__OIB = "oib";
	public static String NAPLATA_KLIJENT__MATICNI_BROJ = "maticni_broj";
	public static String NAPLATA_KLIJENT__JMBG = "jmbg";
	public static String NAPLATA_KLIJENT__VRSTA = "vrsta";
	public static String NAPLATA_KLIJENT__AKTIVNOST = "aktivnost";
	public static String NAPLATA_KLIJENT__DATUM_POCETAK = "datum_pocetak";
	public static String NAPLATA_KLIJENT__NAZIV = "naziv";
	public static String NAPLATA_KLIJENT__ULICA = "ulica";
	public static String NAPLATA_KLIJENT__MJESTO = "mjesto";
	public static String NAPLATA_KLIJENT__POSTANSKI_BROJ = "postanski_broj";
	public static String NAPLATA_KLIJENT__OTPISAN = "otpisan";
	public static String NAPLATA_KLIJENT__RIZICNA_SKUPINA = "rizicna_skupina";
	public static String NAPLATA_KLIJENT__BROJ_DANA_KASNJENJA = "broj_dana_kasnjenja";
	public static String NAPLATA_KLIJENT__NAPOMENA = "napomena";
	public static String NAPLATA_KLIJENT__STATUS_KLIJENTA = "status_klijenta";
	// dodatak
	public static String NAPLATA_KLIJENT__KONTAKT_OSOBA = "kontakt_osoba";// izvedeno
																			// iz
																			// ime
																			// i
																			// prezime
	public static String NAPLATA_KLIJENT__VRSTA_TRANSAKCIJE = "vrsta_transakcije";
	public static String NAPLATA_KLIJENT__IZLOZENOST_BRUTO = "izlozenost_bruto";
	public static String NAPLATA_KLIJENT__DOSPJELI_DUG = "dospjeli_dug";
	public static String NAPLATA_KLIJENT__PRAVNE_GRADANI = "pravne_gradani";
	// KONTAKT
	public static String NAPLATA_KLIJENT_KONTAKT__ID_KONTATKA = "id_kontatka";
	public static String NAPLATA_KLIJENT_KONTAKT__OIB = "oib";
	public static String NAPLATA_KLIJENT_KONTAKT__IME = "ime";
	public static String NAPLATA_KLIJENT_KONTAKT__PREZIME = "prezime";
	public static String NAPLATA_KLIJENT_KONTAKT__JMBG = "jmbg";
	public static String NAPLATA_KLIJENT_KONTAKT__OIB_KONTATKA = "oib_kontatka";
	public static String NAPLATA_KLIJENT_KONTAKT__OPIS_KONTAKTA = "opis_kontakta";
	public static String NAPLATA_KLIJENT_KONTAKT__TELEFON = "telefon";
	public static String NAPLATA_KLIJENT_KONTAKT__MOBITEL = "mobitel";
	public static String NAPLATA_KLIJENT_KONTAKT__FAX = "fax";
	public static String NAPLATA_KLIJENT_KONTAKT__EMAIL = "email";
	public static String NAPLATA_KLIJENT_KONTAKT__ULICA = "ulica";
	public static String NAPLATA_KLIJENT_KONTAKT__MJESTO = "mjesto";
	public static String NAPLATA_KLIJENT_KONTAKT__POSTANSKI_BROJ = "postanski_broj";
	public static String NAPLATA_KLIJENT_KONTAKT__STATUS = "status";
	// BILJESKA
	public static String NAPLATA_KLIJENT_BILJESKA__ID_BILJESKE = "id_biljeske";
	public static String NAPLATA_KLIJENT_BILJESKA__OIB = "oib";
	public static String NAPLATA_KLIJENT_BILJESKA__BROJ_PARTIJE = "broj_partije";
	public static String NAPLATA_KLIJENT_BILJESKA__VRSTA = "vrsta";
	public static String NAPLATA_KLIJENT_BILJESKA__DATUM_DOGADAJA = "datum_dogadaja";
	public static String NAPLATA_KLIJENT_BILJESKA__OPIS_SITUACIJE = "opis_situacije";
	public static String NAPLATA_KLIJENT_BILJESKA__ODGOVOR_KLIJENTA = "odgovor_klijenta";
	public static String NAPLATA_KLIJENT_BILJESKA__PREPORUKA_SLUZBE = "preporuka_sluzbe";
	public static String NAPLATA_KLIJENT_BILJESKA__ODLUKA_UPRAVE = "odluka_uprave";
	// ispis
	public static String NAPLATA_KLIJENT__OPCIJE_ISPISA = "opcije_ispisa";
	public static String NAPLATA_KLIJENT__DATUM = "datum"; // koristi se za
															// izvjestajSpis
	// ssp
	// public static String NAPLATA_SSP__BROJ_PARTIJE = "broj_partije";
	// public static String NAPLATA_SSP__NAZIV = "naziv";
	// public static String NAPLATA_SSP__JMBG = "jmbg";
	// public static String NAPLATA_SSP__OIB = "oib";
	public static String NAPLATA_SSP__OPERATER_UNOSA = "operater_unosa";
	public static String NAPLATA_SSP__DATUM_ULASKA_ = "datum_ulaska_";
	public static String NAPLATA_SSP__DATUM_IZLASKA_ = "datum_izlaska_";
	public static String NAPLATA_SSP__STATUS_PARTIJE = "status_partije";
	public static String NAPLATA_SSP__PARTIJA_ZATVORENA = "partija_zatvorena";
	public static String NAPLATA_SSP__DATUM_STANJA = "datum_stanja";
	public static String NAPLATA_SSP__TELEFON = "telefon";
	public static String NAPLATA_SSP__PROFITNI_CENTAR = "profitni_centar";
	public static String NAPLATA_SSP__ULICA = "ulica";
	public static String NAPLATA_SSP__POSTANSKI_BROJ = "postanski_broj";
	public static String NAPLATA_SSP__MJESTO = "mjesto";
	public static String NAPLATA_SSP__RADNI_ODNOS = "radni_odnos";
	public static String NAPLATA_SSP__DATUM_ZADNJE_PROVJERE_RADNOG_ODNOSA = "datum_zadnje_provjere_radnog_odnosa";
	public static String NAPLATA_SSP__DATUM_ULASKA = "datum_ulaska";
	public static String NAPLATA_SSP__DATUM_IZLASKA = "datum_izlaska";

	/* Attributes names /> */
	/* </ Constructors */
	public NaplataKlijentVo() {
		super();
	}

	public NaplataKlijentVo(AS2Record value) {
		super(value);
	}

	// dodatak
	public Calendar getDatum() {
		return getAsCalendar(NAPLATA_KLIJENT__DATUM);
	}

	public String getOpcijeIspisa() {
		return get(NAPLATA_KLIJENT__OPCIJE_ISPISA);
	}

	public void setOpcijeIspisa(String value) {
		set(NAPLATA_KLIJENT__OPCIJE_ISPISA, value);
	}

	public String getVrstaBiljeske() {
		return getAsStringOrEmpty("vrsta_biljeske");
	}

	public String getOpisSituacije() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_BILJESKA__OPIS_SITUACIJE);
	}

	public Calendar getDatumDogadaja() {
		return getAsCalendar(NAPLATA_KLIJENT_BILJESKA__DATUM_DOGADAJA);
	}

	public String getVrstaTransakcije() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__VRSTA_TRANSAKCIJE);
	}

	public String getIzlozenostBruto() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__IZLOZENOST_BRUTO);
	}

	public String getDospjeliDug() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__DOSPJELI_DUG);
	}

	public String getPravneGradani() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__PRAVNE_GRADANI);
	}

	// dodatak
	public String getOib() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__OIB);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__MATICNI_BROJ);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__JMBG);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__VRSTA);
	}

	public String getAktivnost() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__AKTIVNOST);
	}

	public Calendar getDatumPocetak() {
		return getAsCalendar(NAPLATA_KLIJENT__DATUM_POCETAK);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__NAZIV);
	}

	public String getUlica() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__ULICA);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__MJESTO);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__POSTANSKI_BROJ);
	}

	public String getOtpisan() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__OTPISAN);
	}

	public String getRizicnaSkupina() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__RIZICNA_SKUPINA);
	}

	public String getBrojDanaKasnjenja() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__BROJ_DANA_KASNJENJA);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__NAPOMENA);
	}

	public String getStatusKlijenta() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__STATUS_KLIJENTA);
	}

	public String getKontaktOsoba() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT__KONTAKT_OSOBA);
	}

	public void setOib(String value) {
		set(NAPLATA_KLIJENT__OIB, value);
	}

	public void setMaticniBroj(String value) {
		set(NAPLATA_KLIJENT__MATICNI_BROJ, value);
	}

	public void setJmbg(String value) {
		set(NAPLATA_KLIJENT__JMBG, value);
	}

	public void setVrsta(String value) {
		set(NAPLATA_KLIJENT__VRSTA, value);
	}

	public void setAktivnost(String value) {
		set(NAPLATA_KLIJENT__AKTIVNOST, value);
	}

	public void setDatumPocetak(Calendar value) {
		setCalendarAsDateString(value, NAPLATA_KLIJENT__DATUM_POCETAK);
	}

	public void setNaziv(String value) {
		set(NAPLATA_KLIJENT__NAZIV, value);
	}

	public void setUlica(String value) {
		set(NAPLATA_KLIJENT__ULICA, value);
	}

	public void setMjesto(String value) {
		set(NAPLATA_KLIJENT__MJESTO, value);
	}

	public void setPostanskiBroj(String value) {
		set(NAPLATA_KLIJENT__POSTANSKI_BROJ, value);
	}

	public void setOtpisan(String value) {
		set(NAPLATA_KLIJENT__OTPISAN, value);
	}

	public void setRizicnaSkupina(String value) {
		set(NAPLATA_KLIJENT__RIZICNA_SKUPINA, value);
	}

	public void setBrojDanaKasnjenja(String value) {
		set(NAPLATA_KLIJENT__BROJ_DANA_KASNJENJA, value);
	}

	public void setNapomena(String value) {
		set(NAPLATA_KLIJENT__NAPOMENA, value);
	}

	public void setStatusKlijenta(String value) {
		set(NAPLATA_KLIJENT__STATUS_KLIJENTA, value);
	}

	// KONTAKT
	public String getIdKontatka() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__ID_KONTATKA);
	}

	public String getIme() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__IME);
	}

	public String getPrezime() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__PREZIME);
	}

	public String getOibKontatka() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_KONTAKT__OIB_KONTATKA);
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

	public void setIdKontatka(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__ID_KONTATKA, value);
	}

	public void setIme(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__IME, value);
	}

	public void setPrezime(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__PREZIME, value);
	}

	public void setOibKontatka(String value) {
		set(NAPLATA_KLIJENT_KONTAKT__OIB_KONTATKA, value);
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

	public void setKontaktOsoba(String value) {
		set(NAPLATA_KLIJENT__KONTAKT_OSOBA, value);
	}

	// dodatak
	public void setVrstaTransakcije(String value) {
		set(NAPLATA_KLIJENT__VRSTA_TRANSAKCIJE, value);
	}

	public void setIzlozenostBruto(String value) {
		set(NAPLATA_KLIJENT__IZLOZENOST_BRUTO, value);
	}

	public void setDospjeliDug(String value) {
		set(NAPLATA_KLIJENT__DOSPJELI_DUG, value);
	}

	public void setPravneGradani(String value) {
		set(NAPLATA_KLIJENT__PRAVNE_GRADANI, value);
	}

	public void setVrstaBiljeske(String value) {
		set("vrsta_biljeske", value);
	}

	public void setOpisSituacije(String value) {
		set(NAPLATA_KLIJENT_BILJESKA__OPIS_SITUACIJE, value);
	}

	public void setDatumDogadaja(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_KLIJENT_BILJESKA__DATUM_DOGADAJA);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, NAPLATA_KLIJENT__DATUM);
	}
	// dodatak
}