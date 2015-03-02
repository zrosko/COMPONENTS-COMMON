package hr.adriacomsoftware.app.common.helpdesk.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class HelpDeskPozivVo extends HelpDeskVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String HD_POZIV__ID_POZIVA = "id_poziva";
	public static String HD_POZIV__ID_POZIVA_VEZA = "id_poziva_veza";
	public static String HD_POZIV__VRSTA = "vrsta";
	public static String HD_POZIV__KANAL_POZIVA = "kanal_poziva";
	public static String HD_POZIV__BROJ_POZIVA = "broj_poziva";
	public static String HD_POZIV__DATUM_POZIVA = "datum_poziva";
	public static String HD_POZIV__DATUM_ZATVARANJA = "datum_zatvaranja";
	public static String HD_POZIV__DATUM_RJESENJA = "datum_rjesenja";
	public static String HD_POZIV__MJESTO_TROSKA = "mjesto_troska";
	public static String HD_POZIV__NAZIV = "naziv";
	public static String HD_POZIV__OPIS_STO = "opis_sto";
	public static String HD_POZIV__OPIS_TKO = "opis_tko";
	public static String HD_POZIV__OPIS_SADA = "opis_sada";
	public static String HD_POZIV__OPIS_KAKO = "opis_kako";
	public static String HD_POZIV__TIP = "tip";
	public static String HD_POZIV__RAZLOG_PROMJENE = "razlog_promjene";
	public static String HD_POZIV__ROK = "rok";
	// public static String HD_POZIV__STATUS = "status";
	public static String HD_POZIV__RJESENJE = "rjesenje";
	// public static String HD_POZIV__PRIORITET = "prioritet";
	public static String HD_POZIV__PRIORITET_RAZLOG = "prioritet_razlog";
	public static String HD_POZIV__OSOBA_RASPOREDA = "osoba_rasporeda";
	public static String HD_POZIV__OSOBA_PRIJAVE = "osoba_prijave";
	public static String HD_POZIV__ODGOVORNA_OSOBA = "odgovorna_osoba";
	public static String HD_POZIV__DATUM_OBAVIJESTI = "datum_obavijesti";
	public static String HD_POZIV__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String HD_POZIV__PROJEKT = "projekt";
	public static String HD_POZIV__KONTAKT = "kontakt";
	public static String HD_POZIV__APLIKACIJA = "aplikacija";
	public static String HD_POZIV__NAZIV_PROGRAMA = "aplikacija";// ISTO KAO I
																	// APLIKACIJA
																	// (PROBLEM
																	// liaste)
	public static String HD_POZIV__APLIKACIJA_PARAMETRI = "aplikacija_parametri";
	public static String HD_POZIV__MODUL = "modul";
	public static String HD_POZIV__MODUL_INACICA = "modul_inacica";
	public static String HD_POZIV__NAZIV_OPCIJE = "naziv_opcije";
	public static String HD_POZIV__KOD_GRESKE = "kod_greske";
	public static String HD_POZIV__RADNA_STANICA = "radna_stanica";
	public static String HD_POZIV__SIFRA_KORISNIKA = "sifra_korisnika";
	public static String HD_POZIV__BROJ_BLAGAJNE = "broj_blagajne";
	public static String HD_POZIV__DATUM_RADA_PRIJAVE = "datum_rada_prijave";
	public static String HD_POZIV__DATUM_GRESKE = "datum_greske";
	public static String HD_POZIV__OPIS_GRESKE = "opis_greske";
	public static String HD_POZIV__OPIS_ZADNJE_ISPRAVNO = "opis_zadnje_ispravno";
	public static String HD_POZIV__VRIJEME_POJAVLJIVANJA_GRESKE = "vrijeme_pojavljivanja_greske";
	public static String HD_POZIV__TESTNI_ISPIS = "testni_ispis";
	public static String HD_POZIV__TESTNI_ISPIS_RADNA_STANICA = "testni_ispis_radna_stanica";
	public static String HD_POZIV__TESTNI_ISPIS_SIFRA_KORISNIKA = "testni_ispis_sifra_korisnika";
	public static String HD_POZIV__TESTNI_ISPIS_VRIJEME = "testni_ispis_vrijeme";
	public static String HD_POZIV__TESTNI_ISPIS_TESTNA_BAZA = "testni_ispis_testna_baza";
	public static String HD_POZIV__PREDMET_ZA = "predmet_za";
	public static String HD_POZIV__POVOD = "povod";
	public static String HD_POZIV__VAS_ZNAK = "vas_znak";
	public static String HD_POZIV__ISPRAVNO = "ispravno";
	// dodatak
	public static String HD_POZIV__IME_PREZIME = "ime_prezime";
	public static String HD_POZIV__DATUM_ZATVARANJA_DO = "datum_zatvaranja_do";
	public static String HD_POZIV__DOPUSTENA_OSOBA = "dopustena_osoba";
	public static String HD_POZIV__ID_STAVKE = "id_stavke";
	public static String HD_POZIV__OSOBA_DODJELA_PRAVA = "osoba_dodjela_prava";
	public static String HD_POZIV__TRAZENA_ULOGA = "trazena_uloga";
	public static String HD_POZIV__BUILD_ID = "build_id";
	public static String HD_POZIV__UTJECAJ = "utjecaj";
	public static String HD_POZIV__REALIZIRANO = "realizirano";
	public static String HD_POZIV__BROJ_SATI_PLAN = "broj_sati_plan";
	public static String HD_POZIV__BROJ_SATI_RAD = "broj_sati_rad";
	public static String HD_POZIV__ANALIZA = "analiza";
	public static String HD_POZIV__ZADUZENA_OSOBA_IT = "zaduzena_osoba_it";
	public static String HD_POZIV__GRESKU_PRIJAVIO = "gresku_prijavio";
	public static String HD_POZIV__ZADUZENA_OSOBA_VANJSKA = "zaduzena_osoba_vanjska";
	public static String HD_POZIV__BROJ_ZAHTJEVA_JBS = "broj_zahtjeva_jbs";
	public static String HD_POZIV__PODNOSITELJ = "podnositelj";
	public static String HD_POZIV__DATUM_RJESAVANJA_BSA = "datum_rjesavanja_bsa";
	public static String HD_POZIV__KATEGORIJA_PROMJENE = "kategorija_promjene";
	public static String HD_POZIV__OPIS_IZVRSENIH_PROMJENA = "opis_izvrsenih_promjena";
	public static String HD_POZIV__KORISNICKO_IME = "korisnicko_ime";
	public static String HD_POZIV__PROCEDURA_ZADOVOLJENA = "procedura_zadovoljena";

	public static String HD_POZIV__AND_OR = "and_or";

	/* Attributes names /> */
	/* </ Constructors */
	public HelpDeskPozivVo() {
		super();
	}

	public HelpDeskPozivVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getAndOr() {
		return getAsStringOrEmpty(HD_POZIV__AND_OR);
	}

	public String getZaduzenaOsobaVanjska() {
		return getAsStringOrEmpty(HD_POZIV__ZADUZENA_OSOBA_VANJSKA);
	}

	public String getGreskuPrijavio() {
		return getAsStringOrEmpty(HD_POZIV__GRESKU_PRIJAVIO);
	}

	public String getZaduzenaOsobaIt() {
		return getAsStringOrEmpty(HD_POZIV__ZADUZENA_OSOBA_IT);
	}

	public String getBrojZahtjevaJbs() {
		return getAsStringOrEmpty(HD_POZIV__BROJ_ZAHTJEVA_JBS);
	}

	public String getPodnositelj() {
		return getAsStringOrEmpty(HD_POZIV__PODNOSITELJ);
	}

	public Calendar getDatumRjesavanjaBsa() {
		return getAsCalendar(HD_POZIV__DATUM_RJESAVANJA_BSA);
	}

	public String getKategorijaPromjene() {
		return getAsStringOrEmpty(HD_POZIV__KATEGORIJA_PROMJENE);
	}

	public String getOpisIzvrsenihPromjena() {
		return getAsStringOrEmpty(HD_POZIV__OPIS_IZVRSENIH_PROMJENA);
	}

	public String getKorisnickoIme() {
		return getAsStringOrEmpty(HD_POZIV__KORISNICKO_IME);
	}

	public String getProceduraZadovoljena() {
		return getAsStringOrEmpty(HD_POZIV__PROCEDURA_ZADOVOLJENA);
	}

	public String getImePrezime() {
		return getAsStringOrEmpty(HD_POZIV__IME_PREZIME);
	}

	public String getIdPoziva() {
		return getAsStringOrEmpty(HD_POZIV__ID_POZIVA);
	}

	public String getIdPozivaVeza() {
		return getAsStringOrEmpty(HD_POZIV__ID_POZIVA_VEZA);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(HD_POZIV__VRSTA);
	}

	public String getKanalPoziva() {
		return getAsStringOrEmpty(HD_POZIV__KANAL_POZIVA);
	}

	public String getBrojPoziva() {
		return getAsStringOrEmpty(HD_POZIV__BROJ_POZIVA);
	}

	public Calendar getVrijemePoziva() {
		return getAsCalendar(HD_POZIV__DATUM_POZIVA);
	}

	public Calendar getDatumPoziva() {
		return getAsCalendar(HD_POZIV__DATUM_POZIVA);
	}

	public Calendar getDatumZatvaranja() {
		return getAsCalendar(HD_POZIV__DATUM_ZATVARANJA);
	}

	public Calendar getVrijemeZatvaranja() {
		return getAsCalendar(HD_POZIV__DATUM_ZATVARANJA);
	}

	public Calendar getDatumRjesenja() {
		return getAsCalendar(HD_POZIV__DATUM_RJESENJA);
	}

	public Calendar getVrijemeRjesenja() {
		return getAsCalendar(HD_POZIV__DATUM_RJESENJA);
	}

	public Calendar getDatumZatvaranjaDo() {
		return getAsCalendar(HD_POZIV__DATUM_ZATVARANJA_DO);
	}

	public String getMjestoTroska() {
		return getAsStringOrEmpty(HD_POZIV__MJESTO_TROSKA);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(HD_POZIV__NAZIV);
	}

	public String getOpisSto() {
		return getAsStringOrEmpty(HD_POZIV__OPIS_STO);
	}

	public String getOpisTko() {
		return getAsStringOrEmpty(HD_POZIV__OPIS_TKO);
	}

	public String getOpisSada() {
		return getAsStringOrEmpty(HD_POZIV__OPIS_SADA);
	}

	public String getOpisKako() {
		return getAsStringOrEmpty(HD_POZIV__OPIS_KAKO);
	}

	public String getTip() {
		return getAsStringOrEmpty(HD_POZIV__TIP);
	}

	public String getRazlogPromjene() {
		return getAsStringOrEmpty(HD_POZIV__RAZLOG_PROMJENE);
	}

	public Calendar getRok() {
		return getAsCalendar(HD_POZIV__ROK);
	}

	// public String getStatus() {
	// return getAsStringOrEmpty(HD_POZIV__STATUS);
	// }
	public String getRjesenje() {
		return getAsStringOrEmpty(HD_POZIV__RJESENJE);
	}

	// public String getPrioritet() {
	// return getAsStringOrEmpty(HD_POZIV__PRIORITET);
	// }
	public String getPrioritetRazlog() {
		return getAsStringOrEmpty(HD_POZIV__PRIORITET_RAZLOG);
	}

	public String getOsobaRasporeda() {
		return getAsStringOrEmpty(HD_POZIV__OSOBA_RASPOREDA);
	}

	public String getOsobaPrijave() {
		return getAsStringOrEmpty(HD_POZIV__OSOBA_PRIJAVE);
	}

	public String getOdgovornaOsoba() {
		return getAsStringOrEmpty(HD_POZIV__ODGOVORNA_OSOBA);
	}

	public String getDopustenaOsoba() {
		return getAsStringOrEmpty(HD_POZIV__DOPUSTENA_OSOBA);
	}

	public String getOsobaDodjelaPrava() {
		return getAsStringOrEmpty(HD_POZIV__OSOBA_DODJELA_PRAVA);
	}

	public String getTrazenaUloga() {
		return getAsStringOrEmpty(HD_POZIV__TRAZENA_ULOGA);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(HD_POZIV__ORGANIZACIJSKA_JEDINICA);
	}

	public String getProjekt() {
		return getAsStringOrEmpty(HD_POZIV__PROJEKT);
	}

	public String getKontakt() {
		return getAsStringOrEmpty(HD_POZIV__KONTAKT);
	}

	public String getAplikacija() {
		return getAsStringOrEmpty(HD_POZIV__APLIKACIJA);
	}

	public String getNazivPrograma() {
		return getAsStringOrEmpty(HD_POZIV__NAZIV_PROGRAMA);
	}

	public String getAplikacijaParametri() {
		return getAsStringOrEmpty(HD_POZIV__APLIKACIJA_PARAMETRI);
	}

	public String getModul() {
		return getAsStringOrEmpty(HD_POZIV__MODUL);
	}

	public String getModulInacica() {
		return getAsStringOrEmpty(HD_POZIV__MODUL_INACICA);
	}

	public String getNazivOpcije() {
		return getAsStringOrEmpty(HD_POZIV__NAZIV_OPCIJE);
	}

	public String getKodGreske() {
		return getAsStringOrEmpty(HD_POZIV__KOD_GRESKE);
	}

	public String getRadnaStanica() {
		return getAsStringOrEmpty(HD_POZIV__RADNA_STANICA);
	}

	public String getSifraKorisnika() {
		return getAsStringOrEmpty(HD_POZIV__SIFRA_KORISNIKA);
	}

	public String getBrojBlagajne() {
		return getAsStringOrEmpty(HD_POZIV__BROJ_BLAGAJNE);
	}

	public Calendar getDatumRadaPrijave() {
		return getAsCalendar(HD_POZIV__DATUM_RADA_PRIJAVE);
	}

	public Calendar getDatumObavijesti() {
		return getAsCalendar(HD_POZIV__DATUM_OBAVIJESTI);
	}

	public Calendar getDatumGreske() {
		return getAsCalendar(HD_POZIV__DATUM_GRESKE);
	}

	public String getOpisGreske() {
		return getAsStringOrEmpty(HD_POZIV__OPIS_GRESKE);
	}

	public String getOpisZadnjeIspravno() {
		return getAsStringOrEmpty(HD_POZIV__OPIS_ZADNJE_ISPRAVNO);
	}

	public String getVrijemePojavljivanjaGreske() {
		return getAsStringOrEmpty(HD_POZIV__VRIJEME_POJAVLJIVANJA_GRESKE);
	}

	public String getTestniIspis() {
		return getAsStringOrEmpty(HD_POZIV__TESTNI_ISPIS);
	}

	public String getTestniIspisRadnaStanica() {
		return getAsStringOrEmpty(HD_POZIV__TESTNI_ISPIS_RADNA_STANICA);
	}

	public String getTestniIspisSifraKorisnika() {
		return getAsStringOrEmpty(HD_POZIV__TESTNI_ISPIS_SIFRA_KORISNIKA);
	}

	public String getTestniIspisVrijeme() {
		return getAsStringOrEmpty(HD_POZIV__TESTNI_ISPIS_VRIJEME);
	}

	public String getTestniIspisTestnaBaza() {
		return getAsStringOrEmpty(HD_POZIV__TESTNI_ISPIS_TESTNA_BAZA);
	}

	public String getPredmetZa() {
		return getAsStringOrEmpty(HD_POZIV__PREDMET_ZA);
	}

	public String getPovod() {
		return getAsStringOrEmpty(HD_POZIV__POVOD);
	}

	public String getVasZnak() {
		return getAsStringOrEmpty(HD_POZIV__VAS_ZNAK);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(HD_POZIV__ISPRAVNO);
	}

	public String getIdStavke() {
		return getAsStringOrEmpty(HD_POZIV__ID_STAVKE);
	}

	public String getBuildId() {
		return getAsStringOrEmpty(HD_POZIV__BUILD_ID);
	}

	public String getUtjecaj() {
		return getAsStringOrEmpty(HD_POZIV__UTJECAJ);
	}

	public String getRealizirano() {
		return getAsStringOrEmpty(HD_POZIV__REALIZIRANO);
	}

	public String getBrojSatiPlan() {
		return getAsStringOrEmpty(HD_POZIV__BROJ_SATI_PLAN);
	}

	public String getBrojSatiRad() {
		return getAsStringOrEmpty(HD_POZIV__BROJ_SATI_RAD);
	}

	public String getAnaliza() {
		return getAsStringOrEmpty(HD_POZIV__ANALIZA);
	}

	public void setIdPoziva(String value) {
		set(HD_POZIV__ID_POZIVA, value);
	}

	public void setIdPozivaVeza(String value) {
		set(HD_POZIV__ID_POZIVA_VEZA, value);
	}

	public void setVrsta(String value) {
		set(HD_POZIV__VRSTA, value);
	}

	public void setKanalPoziva(String value) {
		set(HD_POZIV__KANAL_POZIVA, value);
	}

	public void setBrojPoziva(String value) {
		set(HD_POZIV__BROJ_POZIVA, value);
	}

	public void setDatumPoziva(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV__DATUM_POZIVA);
	}

	public void setVrijemePoziva(Calendar c) {
		concatinateTimeToExistingDate(c, HD_POZIV__DATUM_POZIVA);
	}

	public void setDatumZatvaranja(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV__DATUM_ZATVARANJA);
	}

	public void setVrijemeZatvaranja(Calendar c) {
		concatinateTimeToExistingDate(c, HD_POZIV__DATUM_ZATVARANJA);
	}

	public void setDatumRjesenja(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV__DATUM_RJESENJA);
	}

	public void setVrijemeRjesenja(Calendar c) {
		concatinateTimeToExistingDate(c, HD_POZIV__DATUM_RJESENJA);
	}

	public void setDatumZatvaranjaDo(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV__DATUM_ZATVARANJA_DO);
	}

	public void setMjestoTroska(String value) {
		set(HD_POZIV__MJESTO_TROSKA, value);
	}

	public void setNaziv(String value) {
		set(HD_POZIV__NAZIV, value);
	}

	public void setOpisSto(String value) {
		set(HD_POZIV__OPIS_STO, value);
	}

	public void setOpisTko(String value) {
		set(HD_POZIV__OPIS_TKO, value);
	}

	public void setOpisSada(String value) {
		set(HD_POZIV__OPIS_SADA, value);
	}

	public void setOpisKako(String value) {
		set(HD_POZIV__OPIS_KAKO, value);
	}

	public void setTip(String value) {
		set(HD_POZIV__TIP, value);
	}

	public void setRazlogPromjene(String value) {
		set(HD_POZIV__RAZLOG_PROMJENE, value);
	}

	public void setRok(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV__ROK);
	}

	// public void setStatus(String value) {
	// set(HD_POZIV__STATUS, value);
	// }
	public void setRjesenje(String value) {
		set(HD_POZIV__RJESENJE, value);
	}

	// public void setPrioritet(String value) {
	// set(HD_POZIV__PRIORITET, value);
	// }
	public void setPrioritetRazlog(String value) {
		set(HD_POZIV__PRIORITET_RAZLOG, value);
	}

	public void setOsobaRasporeda(String value) {
		set(HD_POZIV__OSOBA_RASPOREDA, value);
	}

	public void setDopustenaOsoba(String value) {
		set(HD_POZIV__DOPUSTENA_OSOBA, value);
	}

	public void setOsobaDodjelaPrava(String value) {
		set(HD_POZIV__OSOBA_DODJELA_PRAVA, value);
	}

	public void setTrazenaUloga(String value) {
		set(HD_POZIV__TRAZENA_ULOGA, value);
	}

	public void setOsobaPrijave(String value) {
		set(HD_POZIV__OSOBA_PRIJAVE, value);
	}

	public void setOdgovornaOsoba(String value) {
		set(HD_POZIV__ODGOVORNA_OSOBA, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(HD_POZIV__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setProjekt(String value) {
		set(HD_POZIV__PROJEKT, value);
	}

	public void setKontakt(String value) {
		set(HD_POZIV__KONTAKT, value);
	}

	public void setAplikacija(String value) {
		set(HD_POZIV__APLIKACIJA, value);
	}

	public void setNazivPrograma(String value) {
		set(HD_POZIV__NAZIV_PROGRAMA, value);
	}

	public void setAplikacijaParametri(String value) {
		set(HD_POZIV__APLIKACIJA_PARAMETRI, value);
	}

	public void setModul(String value) {
		set(HD_POZIV__MODUL, value);
	}

	public void setModulInacica(String value) {
		set(HD_POZIV__MODUL_INACICA, value);
	}

	public void setNazivOpcije(String value) {
		set(HD_POZIV__NAZIV_OPCIJE, value);
	}

	public void setKodGreske(String value) {
		set(HD_POZIV__KOD_GRESKE, value);
	}

	public void setRadnaStanica(String value) {
		set(HD_POZIV__RADNA_STANICA, value);
	}

	public void setSifraKorisnika(String value) {
		set(HD_POZIV__SIFRA_KORISNIKA, value);
	}

	public void setBrojBlagajne(String value) {
		set(HD_POZIV__BROJ_BLAGAJNE, value);
	}

	public void setDatumRadaPrijave(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV__DATUM_RADA_PRIJAVE);
	}

	public void setDatumGreske(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV__DATUM_GRESKE);
	}

	public void setDatumObavijesti(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV__DATUM_OBAVIJESTI);
	}

	public void setOpisGreske(String value) {
		set(HD_POZIV__OPIS_GRESKE, value);
	}

	public void setOpisZadnjeIspravno(String value) {
		set(HD_POZIV__OPIS_ZADNJE_ISPRAVNO, value);
	}

	public void setVrijemePojavljivanjaGreske(String value) {
		set(HD_POZIV__VRIJEME_POJAVLJIVANJA_GRESKE, value);
	}

	public void setTestniIspis(String value) {
		set(HD_POZIV__TESTNI_ISPIS, value);
	}

	public void setTestniIspisRadnaStanica(String value) {
		set(HD_POZIV__TESTNI_ISPIS_RADNA_STANICA, value);
	}

	public void setTestniIspisSifraKorisnika(String value) {
		set(HD_POZIV__TESTNI_ISPIS_SIFRA_KORISNIKA, value);
	}

	public void setTestniIspisVrijeme(String value) {
		set(HD_POZIV__TESTNI_ISPIS_VRIJEME, value);
	}

	public void setTestniIspisTestnaBaza(String value) {
		set(HD_POZIV__TESTNI_ISPIS_TESTNA_BAZA, value);
	}

	public void setIspravno(String value) {
		set(HD_POZIV__ISPRAVNO, value);
	}

	public void setImePrezime(String value) {
		set(HD_POZIV__IME_PREZIME, value);
	}

	public void setPredmetZa(String value) {
		set(HD_POZIV__PREDMET_ZA, value);
	}

	public void setPovod(String value) {
		set(HD_POZIV__POVOD, value);
	}

	public void setVasZnak(String value) {
		set(HD_POZIV__VAS_ZNAK, value);
	}

	public void setIdStavke(String value) {
		set(HD_POZIV__ID_STAVKE, value);
	}

	public void setBuildId(String value) {
		set(HD_POZIV__BUILD_ID, value);
	}

	public void setUtjecaj(String value) {
		set(HD_POZIV__UTJECAJ, value);
	}

	public void setRealizirano(String value) {
		set(HD_POZIV__REALIZIRANO, value);
	}

	public void setBrojSatiPlan(String value) {
		set(HD_POZIV__BROJ_SATI_PLAN, value);
	}

	public void setBrojSatiRad(String value) {
		set(HD_POZIV__BROJ_SATI_RAD, value);
	}

	public void setAnaliza(String value) {
		set(HD_POZIV__ANALIZA, value);
	}

	public void setZaduzenaOsobaIt(String value) {
		set(HD_POZIV__ZADUZENA_OSOBA_IT, value);
	}

	public void setGreskuPrijavio(String value) {
		set(HD_POZIV__GRESKU_PRIJAVIO, value);
	}

	public void setZaduzenaOsobaVanjska(String value) {
		set(HD_POZIV__ZADUZENA_OSOBA_VANJSKA, value);
	}

	public void setBrojZahtjevaJbs(String value) {
		set(HD_POZIV__BROJ_ZAHTJEVA_JBS, value);
	}

	public void setPodnositelj(String value) {
		set(HD_POZIV__PODNOSITELJ, value);
	}

	public void setDatumRjesavanjaBsa(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV__DATUM_RJESAVANJA_BSA);
	}

	public void setKategorijaPromjene(String value) {
		set(HD_POZIV__KATEGORIJA_PROMJENE, value);
	}

	public void setOpisIzvrsenihPromjena(String value) {
		set(HD_POZIV__OPIS_IZVRSENIH_PROMJENA, value);
	}

	public void setKorisnickoIme(String value) {
		set(HD_POZIV__KORISNICKO_IME, value);
	}

	public void setProceduraZadovoljena(String value) {
		set(HD_POZIV__PROCEDURA_ZADOVOLJENA, value);
	}

	public void setAndOr(String value) {
		set(HD_POZIV__AND_OR, value);
	}
	/* Getters/Setters /> */
}