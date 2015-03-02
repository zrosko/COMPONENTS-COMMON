package hr.adriacomsoftware.app.common.karticno.gr.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class McardGrZahtjevVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String MCARD_GR_ZAHTJEV__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String MCARD_GR_ZAHTJEV__DATUM_ZAPRIMANJA = "datum_zaprimanja";
	public static String MCARD_GR_ZAHTJEV__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String MCARD_GR_ZAHTJEV__PROFITNI_CENTAR = "profitni_centar";
	public static String MCARD_GR_ZAHTJEV__ZAPRIMATELJ = "zaprimatelj";
	public static String MCARD_GR_ZAHTJEV__IME_PREZIME = "ime_prezime";
	public static String MCARD_GR_ZAHTJEV__OIB = "oib";
	public static String MCARD_GR_ZAHTJEV__JMBG = "jmbg";
	public static String MCARD_GR_ZAHTJEV__IME_OCA_MAJKE = "ime_oca_majke";
	public static String MCARD_GR_ZAHTJEV__ULICA = "ulica";
	public static String MCARD_GR_ZAHTJEV__MJESTO = "mjesto";
	public static String MCARD_GR_ZAHTJEV__POSTANSKI_BROJ = "postanski_broj";
	public static String MCARD_GR_ZAHTJEV__DRZAVA = "drzava";
	public static String MCARD_GR_ZAHTJEV__TELEFON = "telefon";
	public static String MCARD_GR_ZAHTJEV__MOBITEL = "mobitel";
	public static String MCARD_GR_ZAHTJEV__EMAIL = "email";
	public static String MCARD_GR_ZAHTJEV__NAZIV_ISPRAVE = "naziv_isprave";
	public static String MCARD_GR_ZAHTJEV__IZDAVATELJ_ISPRAVE = "izdavatelj_isprave";
	public static String MCARD_GR_ZAHTJEV__BROJ_ISPRAVE = "broj_isprave";
	public static String MCARD_GR_ZAHTJEV__DRZAVA_ISPRAVE = "drzava_isprave";
	public static String MCARD_GR_ZAHTJEV__DATUM_RODENJA = "datum_rodenja";
	public static String MCARD_GR_ZAHTJEV__MJESTO_RODENJA = "mjesto_rodenja";
	public static String MCARD_GR_ZAHTJEV__DRZAVLJANSTVO = "drzavljanstvo";
	public static String MCARD_GR_ZAHTJEV__BRACNO_STANJE = "bracno_stanje";
	public static String MCARD_GR_ZAHTJEV__BROJ_UZDRZAVANIH = "broj_uzdrzavanih";
	public static String MCARD_GR_ZAHTJEV__NETO_PLACA = "neto_placa";
	public static String MCARD_GR_ZAHTJEV__PROSJECNA_NETO_PLACA = "prosjecna_neto_placa";
	public static String MCARD_GR_ZAHTJEV__MJESECNA_OBITELJSKA_PRIMANJA = "mjesecna_obiteljska_primanja";
	public static String MCARD_GR_ZAHTJEV__MJESECNI_IZVANREDNI_PRIHODI = "mjesecni_izvanredni_prihodi";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_NAZIV = "poslodavac_naziv";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_ULICA = "poslodavac_ulica";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_MJESTO = "poslodavac_mjesto";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_DRZAVA = "poslodavac_drzava";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_POSTANSKI_BROJ = "poslodavac_postanski_broj";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_OIB = "poslodavac_oib";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_MATICNI_BROJ = "poslodavac_maticni_broj";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_TELEFON = "poslodavac_telefon";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_RADNI_STAZ_GODINA = "poslodavac_radni_staz_godina";
	public static String MCARD_GR_ZAHTJEV__POSLODAVAC_RADNI_STAZ_MJESEC = "poslodavac_radni_staz_mjesec";
	public static String MCARD_GR_ZAHTJEV__UKUPNI_RADNI_STAZ_GODINA = "ukupni_radni_staz_godina";
	public static String MCARD_GR_ZAHTJEV__UKUPNI_RADNI_STAZ_MJESEC = "ukupni_radni_staz_mjesec";
	public static String MCARD_GR_ZAHTJEV__RADNI_ODNOS = "radni_odnos";
	public static String MCARD_GR_ZAHTJEV__STRUCNA_SPREMA = "strucna_sprema";
	public static String MCARD_GR_ZAHTJEV__STATUS_ZAPOSLENJA = "status_zaposlenja";
	public static String MCARD_GR_ZAHTJEV__VRSTA_POSLODAVCA = "vrsta_poslodavca";
	public static String MCARD_GR_ZAHTJEV__POTVRDA_POSLODAVCA = "potvrda_poslodavca";
	public static String MCARD_GR_ZAHTJEV__VRSTA_KARTICE = "vrsta_kartice";
	public static String MCARD_GR_ZAHTJEV__NACIN_PODMIRENJA_OBVEZA = "nacin_podmirenja_obveza";
	public static String MCARD_GR_ZAHTJEV__BROJ_PARTIJE_TEKUCEG = "broj_partije_tekuceg";
	public static String MCARD_GR_ZAHTJEV__VISINA_TERETA = "visina_tereta";
	public static String MCARD_GR_ZAHTJEV__OSIGURANO_DEPOZITOM = "osigurano_depozitom";
	public static String MCARD_GR_ZAHTJEV__NACIN_KORISTENJA = "nacin_koristenja";
	public static String MCARD_GR_ZAHTJEV__IZVOR_SREDSTAVA = "izvor_sredstava";
	public static String MCARD_GR_ZAHTJEV__OCEKIVANA_POTROSNJA = "ocekivana_potrosnja";
	public static String MCARD_GR_ZAHTJEV__NACIN_PRIMANJA_IZVATKA = "nacin_primanja_izvatka";
	public static String MCARD_GR_ZAHTJEV__IZVADAK_ULICA = "izvadak_ulica";
	public static String MCARD_GR_ZAHTJEV__IZVADAK_MJESTO = "izvadak_mjesto";
	public static String MCARD_GR_ZAHTJEV__IZVADAK_POSTANSKI_BROJ = "izvadak_postanski_broj";
	public static String MCARD_GR_ZAHTJEV__IZVADAK_DRZAVA = "izvadak_drzava";
	public static String MCARD_GR_ZAHTJEV__IZVADAK_EMAIL = "izvadak_email";
	public static String MCARD_GR_ZAHTJEV__PREPORUCENI_ODOBREN_IZNOS = "preporuceni_odobren_iznos";
	public static String MCARD_GR_ZAHTJEV__ZAHTJEV_OBRADIO = "zahtjev_obradio";
	public static String MCARD_GR_ZAHTJEV__DATUM_OBRADE = "datum_obrade";
	public static String MCARD_GR_ZAHTJEV__ODOBRENI_IZNOS = "odobreni_iznos";
	public static String MCARD_GR_ZAHTJEV__HROK_RATE_KREDITA = "hrok_rate_kredita";
	public static String MCARD_GR_ZAHTJEV__DATUM_ODOBRAVANJA = "datum_odobravanja";
	public static String MCARD_GR_ZAHTJEV__OSOBA_ODOBRAVANJA = "osoba_odobravanja";
	public static String MCARD_GR_ZAHTJEV__STATUS_ODOBRENJA = "status_odobrenja";
	public static String MCARD_GR_ZAHTJEV__KOMENTAR = "komentar";
	public static String MCARD_GR_ZAHTJEV__UKUPNA_OCJENA = "ukupna_ocjena";
	public static String MCARD_GR_ZAHTJEV__STATUS_ZAHTJEVA = "status_zahtjeva";
	public static String MCARD_GR_ZAHTJEV__OPERATER_IZMJENE = "operater_izmjene";
	public static String MCARD_GR_ZAHTJEV__VRIJEME_IZMJENE = "vrijeme_izmjene";
	public static String MCARD_GR_ZAHTJEV__ISPRAVNO = "ispravno";
	public static String MCARD_GR_ZAHTJEV__OIB_VEZA = "oib_veza";
	public static String MCARD_GR_ZAHTJEV__VRSTA_ZAHTJEVA = "vrsta_zahtjeva";
	public static String MCARD_GR_ZAHTJEV__BROJ_KARTICE = "broj_kartice";
	public static String MCARD_GR_ZAHTJEV__POKRENUTA_OVRHA = "pokrenuta_ovrha";
	// dodatak
	public static String MCARD_GR_ZAHTJEV__BROJ_GODINE_ZIVOTA = "godine_zivota";// izračunato
	public static String MCARD_GR_ZAHTJEV__DOSPJELI_DUG = "dospjeli_dug";
	public static String MCARD_GR_ZAHTJEV__BROJ_DANA_KASNJENJA = "broj_dana_kasnjenja";
	public static String MCARD_GR_ZAHTJEV__STANJE_TEKUCI_RACUN = "stanje_tekuci_racun";
	public static String MCARD_GR_ZAHTJEV__BROJ_MJESECI_TEKUCI_RACUN = "broj_mjeseci_tekuci_racun";
	public static String MCARD_GR_ZAHTJEV__SRODSTVO = "srodstvo";
	public static String MCARD_GR_ZAHTJEV__BROJ_PARTIJE_MCARD = "broj_partije_mcard";
	public static String MCARD_GR_ZAHTJEV__PARTIJA_DEPOZITA = "partija_depozita";
	public static String MCARD_GR_ZAHTJEV__STANJE_DEPOZITA = "stanje_depozita";
	public static String MCARD_GR_ZAHTJEV__SALDO_TEKUCI_RACUN = "saldo_tekuci_racun";

	public McardGrZahtjevVo() {
		super();
	}

	public McardGrZahtjevVo(AS2Record value) {
		super(value);
	}

	/************* DODATAK ************/
	public String getPokrenutaOvrha() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POKRENUTA_OVRHA);
	}

	public void setPokrenutaOvrha(String value) {
		set(MCARD_GR_ZAHTJEV__POKRENUTA_OVRHA, value);
	}

	public String getVrstaZahtjeva() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__VRSTA_ZAHTJEVA);
	}

	public String getBrojKartice() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BROJ_KARTICE);
	}

	public void setBrojKartice(String value) {
		set(MCARD_GR_ZAHTJEV__BROJ_KARTICE, value);
	}

	public void setVrstaZahtjeva(String value) {
		set(MCARD_GR_ZAHTJEV__VRSTA_ZAHTJEVA, value);
	}

	public String getOibVeza() {
		return get(MCARD_GR_ZAHTJEV__OIB_VEZA);
	}

	public void setOibVeza(String value) {
		set(MCARD_GR_ZAHTJEV__OIB_VEZA, value);
	}

	public String getGodineZivota() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BROJ_GODINE_ZIVOTA);
	}

	public void setGodineZivota(String value) {
		set(MCARD_GR_ZAHTJEV__BROJ_GODINE_ZIVOTA, value);
	}

	public String getDospjeliDug() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__DOSPJELI_DUG);
	}

	public void setDospjeliDug(String value) {
		set(MCARD_GR_ZAHTJEV__DOSPJELI_DUG, value);
	}

	public String getBrojDanaKasnjenja() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BROJ_DANA_KASNJENJA);
	}

	public void setBrojDanaKasnjenja(String value) {
		set(MCARD_GR_ZAHTJEV__BROJ_DANA_KASNJENJA, value);
	}

	public String getStanjeTekuciRacun() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__STANJE_TEKUCI_RACUN);
	}

	public void setStanjeTekuciRacun(String value) {
		set(MCARD_GR_ZAHTJEV__STANJE_TEKUCI_RACUN, value);
	}

	public String getSaldoTekuciRacun() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__SALDO_TEKUCI_RACUN);
	}

	public void setSaldoTekuciRacun(String value) {
		set(MCARD_GR_ZAHTJEV__SALDO_TEKUCI_RACUN, value);
	}

	public String getBrojMjeseciTekuciRacun() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BROJ_MJESECI_TEKUCI_RACUN);
	}

	public void setBrojMjeseciTekuciRacun(String value) {
		set(MCARD_GR_ZAHTJEV__BROJ_MJESECI_TEKUCI_RACUN, value);
	}

	public String getSrodstvo() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__SRODSTVO);
	}

	public void setSrodstvo(String value) {
		set(MCARD_GR_ZAHTJEV__SRODSTVO, value);
	}

	public String getBrojPartijeMcard() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BROJ_PARTIJE_MCARD);
	}

	public void setBrojPartijeMcard(String value) {
		set(MCARD_GR_ZAHTJEV__BROJ_PARTIJE_MCARD, value);
	}

	public String getPartijaDepozita() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__PARTIJA_DEPOZITA);
	}

	public void setPartijaDepozita(String value) {
		set(MCARD_GR_ZAHTJEV__PARTIJA_DEPOZITA, value);
	}

	public String getStanjeDepozita() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__STANJE_DEPOZITA);
	}

	public void setStanjeDepozita(String value) {
		set(MCARD_GR_ZAHTJEV__STANJE_DEPOZITA, value);
	}

	/************* GETTERS ************/

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BROJ_ZAHTJEVA);
	}

	public Calendar getDatumZaprimanja() {
		return getAsCalendar(MCARD_GR_ZAHTJEV__DATUM_ZAPRIMANJA);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__ORGANIZACIJSKA_JEDINICA);
	}

	public String getProfitniCentar() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__PROFITNI_CENTAR);
	}

	public String getZaprimatelj() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__ZAPRIMATELJ);
	}

	public String getImePrezime() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__IME_PREZIME);
	}

	public String getOib() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__OIB);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__JMBG);
	}

	public String getImeOcaMajke() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__IME_OCA_MAJKE);
	}

	public String getUlica() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__ULICA);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__MJESTO);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSTANSKI_BROJ);
	}

	public String getDrzava() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__DRZAVA);
	}

	public String getTelefon() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__TELEFON);
	}

	public String getMobitel() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__MOBITEL);
	}

	public String getEmail() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__EMAIL);
	}

	public String getNazivIsprave() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__NAZIV_ISPRAVE);
	}

	public String getIzdavateljIsprave() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__IZDAVATELJ_ISPRAVE);
	}

	public String getBrojIsprave() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BROJ_ISPRAVE);
	}

	public String getDrzavaIsprave() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__DRZAVA_ISPRAVE);
	}

	public Calendar getDatumRodenja() {
		return getAsCalendar(MCARD_GR_ZAHTJEV__DATUM_RODENJA);
	}

	public String getMjestoRodenja() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__MJESTO_RODENJA);
	}

	public String getDrzavljanstvo() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__DRZAVLJANSTVO);
	}

	public String getBracnoStanje() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BRACNO_STANJE);
	}

	public String getBrojUzdrzavanih() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BROJ_UZDRZAVANIH);
	}

	public String getNetoPlaca() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__NETO_PLACA);
	}

	public String getProsjecnaNetoPlaca() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__PROSJECNA_NETO_PLACA);
	}

	public String getMjesecnaObiteljskaPrimanja() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__MJESECNA_OBITELJSKA_PRIMANJA);
	}

	public String getMjesecniIzvanredniPrihodi() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__MJESECNI_IZVANREDNI_PRIHODI);
	}

	public String getPoslodavacNaziv() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_NAZIV);
	}

	public String getPoslodavacUlica() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_ULICA);
	}

	public String getPoslodavacMjesto() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_MJESTO);
	}

	public String getPoslodavacDrzava() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_DRZAVA);
	}

	public String getPoslodavacPostanskiBroj() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_POSTANSKI_BROJ);
	}

	public String getPoslodavacOib() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_OIB);
	}

	public String getPoslodavacMaticniBroj() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_MATICNI_BROJ);
	}

	public String getPoslodavacTelefon() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_TELEFON);
	}

	public String getPoslodavacRadniStazGodina() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_RADNI_STAZ_GODINA);
	}

	public String getPoslodavacRadniStazMjesec() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POSLODAVAC_RADNI_STAZ_MJESEC);
	}

	public String getUkupniRadniStazGodina() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__UKUPNI_RADNI_STAZ_GODINA);
	}

	public String getUkupniRadniStazMjesec() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__UKUPNI_RADNI_STAZ_MJESEC);
	}

	public String getRadniOdnos() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__RADNI_ODNOS);
	}

	public String getStrucnaSprema() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__STRUCNA_SPREMA);
	}

	public String getStatusZaposlenja() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__STATUS_ZAPOSLENJA);
	}

	public String getVrstaPoslodavca() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__VRSTA_POSLODAVCA);
	}

	public String getPotvrdaPoslodavca() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__POTVRDA_POSLODAVCA);
	}

	public String getVrstaKartice() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__VRSTA_KARTICE);
	}

	public String getNacinPodmirenjaObveza() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__NACIN_PODMIRENJA_OBVEZA);
	}

	public String getBrojPartijeTekuceg() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__BROJ_PARTIJE_TEKUCEG);
	}

	public String getVisinaTereta() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__VISINA_TERETA);
	}

	public String getOsiguranoDepozitom() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__OSIGURANO_DEPOZITOM);
	}

	public String getNacinKoristenja() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__NACIN_KORISTENJA);
	}

	public String getIzvorSredstava() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__IZVOR_SREDSTAVA);
	}

	public String getOcekivanaPotrosnja() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__OCEKIVANA_POTROSNJA);
	}

	public String getNacinPrimanjaIzvatka() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__NACIN_PRIMANJA_IZVATKA);
	}

	public String getIzvadakUlica() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__IZVADAK_ULICA);
	}

	public String getIzvadakMjesto() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__IZVADAK_MJESTO);
	}

	public String getIzvadakPostanskiBroj() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__IZVADAK_POSTANSKI_BROJ);
	}

	public String getIzvadakDrzava() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__IZVADAK_DRZAVA);
	}

	public String getIzvadakEmail() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__IZVADAK_EMAIL);
	}

	public String getPreporuceniOdobrenIznos() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__PREPORUCENI_ODOBREN_IZNOS);
	}

	public String getZahtjevObradio() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__ZAHTJEV_OBRADIO);
	}

	public Calendar getDatumObrade() {
		return getAsCalendar(MCARD_GR_ZAHTJEV__DATUM_OBRADE);
	}

	public String getOdobreniIznos() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__ODOBRENI_IZNOS);
	}

	public String getHrokRateKredita() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__HROK_RATE_KREDITA);
	}

	public Calendar getDatumOdobravanja() {
		return getAsCalendar(MCARD_GR_ZAHTJEV__DATUM_ODOBRAVANJA);
	}

	public String getOsobaOdobravanja() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__OSOBA_ODOBRAVANJA);
	}

	public String getStatusOdobrenja() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__STATUS_ODOBRENJA);
	}

	public String getKomentar() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__KOMENTAR);
	}

	public String getUkupnaOcjena() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__UKUPNA_OCJENA);
	}

	public String getOperaterIzmjene() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__OPERATER_IZMJENE);
	}

	public String getStatusZahtjeva() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__STATUS_ZAHTJEVA);
	}

	public Calendar getVrijemeIzmjene() {
		return getAsCalendar(MCARD_GR_ZAHTJEV__VRIJEME_IZMJENE);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setBrojZahtjeva(String value) {
		set(MCARD_GR_ZAHTJEV__BROJ_ZAHTJEVA, value);
	}

	public void setDatumZaprimanja(Calendar value) {
		setCalendarAsDateString(value, MCARD_GR_ZAHTJEV__DATUM_ZAPRIMANJA);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(MCARD_GR_ZAHTJEV__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setProfitniCentar(String value) {
		set(MCARD_GR_ZAHTJEV__PROFITNI_CENTAR, value);
	}

	public void setZaprimatelj(String value) {
		set(MCARD_GR_ZAHTJEV__ZAPRIMATELJ, value);
	}

	public void setImePrezime(String value) {
		set(MCARD_GR_ZAHTJEV__IME_PREZIME, value);
	}

	public void setOib(String value) {
		set(MCARD_GR_ZAHTJEV__OIB, value);
	}

	public void setJmbg(String value) {
		set(MCARD_GR_ZAHTJEV__JMBG, value);
	}

	public void setImeOcaMajke(String value) {
		set(MCARD_GR_ZAHTJEV__IME_OCA_MAJKE, value);
	}

	public void setUlica(String value) {
		set(MCARD_GR_ZAHTJEV__ULICA, value);
	}

	public void setMjesto(String value) {
		set(MCARD_GR_ZAHTJEV__MJESTO, value);
	}

	public void setPostanskiBroj(String value) {
		set(MCARD_GR_ZAHTJEV__POSTANSKI_BROJ, value);
	}

	public void setDrzava(String value) {
		set(MCARD_GR_ZAHTJEV__DRZAVA, value);
	}

	public void setTelefon(String value) {
		set(MCARD_GR_ZAHTJEV__TELEFON, value);
	}

	public void setMobitel(String value) {
		set(MCARD_GR_ZAHTJEV__MOBITEL, value);
	}

	public void setEmail(String value) {
		set(MCARD_GR_ZAHTJEV__EMAIL, value);
	}

	public void setNazivIsprave(String value) {
		set(MCARD_GR_ZAHTJEV__NAZIV_ISPRAVE, value);
	}

	public void setIzdavateljIsprave(String value) {
		set(MCARD_GR_ZAHTJEV__IZDAVATELJ_ISPRAVE, value);
	}

	public void setBrojIsprave(String value) {
		set(MCARD_GR_ZAHTJEV__BROJ_ISPRAVE, value);
	}

	public void setDrzavaIsprave(String value) {
		set(MCARD_GR_ZAHTJEV__DRZAVA_ISPRAVE, value);
	}

	public void setDatumRodenja(Calendar value) {
		setCalendarAsDateString(value, MCARD_GR_ZAHTJEV__DATUM_RODENJA);
	}

	public void setMjestoRodenja(String value) {
		set(MCARD_GR_ZAHTJEV__MJESTO_RODENJA, value);
	}

	public void setDrzavljanstvo(String value) {
		set(MCARD_GR_ZAHTJEV__DRZAVLJANSTVO, value);
	}

	public void setBracnoStanje(String value) {
		set(MCARD_GR_ZAHTJEV__BRACNO_STANJE, value);
	}

	public void setBrojUzdrzavanih(String value) {
		set(MCARD_GR_ZAHTJEV__BROJ_UZDRZAVANIH, value);
	}

	public void setNetoPlaca(String value) {
		set(MCARD_GR_ZAHTJEV__NETO_PLACA, value);
	}

	public void setProsjecnaNetoPlaca(String value) {
		set(MCARD_GR_ZAHTJEV__PROSJECNA_NETO_PLACA, value);
	}

	public void setMjesecnaObiteljskaPrimanja(String value) {
		set(MCARD_GR_ZAHTJEV__MJESECNA_OBITELJSKA_PRIMANJA, value);
	}

	public void setMjesecniIzvanredniPrihodi(String value) {
		set(MCARD_GR_ZAHTJEV__MJESECNI_IZVANREDNI_PRIHODI, value);
	}

	public void setPoslodavacNaziv(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_NAZIV, value);
	}

	public void setPoslodavacUlica(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_ULICA, value);
	}

	public void setPoslodavacMjesto(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_MJESTO, value);
	}

	public void setPoslodavacDrzava(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_DRZAVA, value);
	}

	public void setPoslodavacPostanskiBroj(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_POSTANSKI_BROJ, value);
	}

	public void setPoslodavacOib(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_OIB, value);
	}

	public void setPoslodavacMaticniBroj(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_MATICNI_BROJ, value);
	}

	public void setPoslodavacTelefon(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_TELEFON, value);
	}

	public void setPoslodavacRadniStazGodina(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_RADNI_STAZ_GODINA, value);
	}

	public void setPoslodavacRadniStazMjesec(String value) {
		set(MCARD_GR_ZAHTJEV__POSLODAVAC_RADNI_STAZ_MJESEC, value);
	}

	public void setUkupniRadniStazGodina(String value) {
		set(MCARD_GR_ZAHTJEV__UKUPNI_RADNI_STAZ_GODINA, value);
	}

	public void setUkupniRadniStazMjesec(String value) {
		set(MCARD_GR_ZAHTJEV__UKUPNI_RADNI_STAZ_MJESEC, value);
	}

	public void setRadniOdnos(String value) {
		set(MCARD_GR_ZAHTJEV__RADNI_ODNOS, value);
	}

	public void setStrucnaSprema(String value) {
		set(MCARD_GR_ZAHTJEV__STRUCNA_SPREMA, value);
	}

	public void setStatusZaposlenja(String value) {
		set(MCARD_GR_ZAHTJEV__STATUS_ZAPOSLENJA, value);
	}

	public void setVrstaPoslodavca(String value) {
		set(MCARD_GR_ZAHTJEV__VRSTA_POSLODAVCA, value);
	}

	public void setPotvrdaPoslodavca(String value) {
		set(MCARD_GR_ZAHTJEV__POTVRDA_POSLODAVCA, value);
	}

	public void setVrstaKartice(String value) {
		set(MCARD_GR_ZAHTJEV__VRSTA_KARTICE, value);
	}

	public void setNacinPodmirenjaObveza(String value) {
		set(MCARD_GR_ZAHTJEV__NACIN_PODMIRENJA_OBVEZA, value);
	}

	public void setBrojPartijeTekuceg(String value) {
		set(MCARD_GR_ZAHTJEV__BROJ_PARTIJE_TEKUCEG, value);
	}

	public void setVisinaTereta(String value) {
		set(MCARD_GR_ZAHTJEV__VISINA_TERETA, value);
	}

	public void setOsiguranoDepozitom(String value) {
		set(MCARD_GR_ZAHTJEV__OSIGURANO_DEPOZITOM, value);
	}

	public void setNacinKoristenja(String value) {
		set(MCARD_GR_ZAHTJEV__NACIN_KORISTENJA, value);
	}

	public void setIzvorSredstava(String value) {
		set(MCARD_GR_ZAHTJEV__IZVOR_SREDSTAVA, value);
	}

	public void setOcekivanaPotrosnja(String value) {
		set(MCARD_GR_ZAHTJEV__OCEKIVANA_POTROSNJA, value);
	}

	public void setNacinPrimanjaIzvatka(String value) {
		set(MCARD_GR_ZAHTJEV__NACIN_PRIMANJA_IZVATKA, value);
	}

	public void setIzvadakUlica(String value) {
		set(MCARD_GR_ZAHTJEV__IZVADAK_ULICA, value);
	}

	public void setIzvadakMjesto(String value) {
		set(MCARD_GR_ZAHTJEV__IZVADAK_MJESTO, value);
	}

	public void setIzvadakPostanskiBroj(String value) {
		set(MCARD_GR_ZAHTJEV__IZVADAK_POSTANSKI_BROJ, value);
	}

	public void setIzvadakDrzava(String value) {
		set(MCARD_GR_ZAHTJEV__IZVADAK_DRZAVA, value);
	}

	public void setIzvadakEmail(String value) {
		set(MCARD_GR_ZAHTJEV__IZVADAK_EMAIL, value);
	}

	public void setPreporuceniOdobrenIznos(String value) {
		set(MCARD_GR_ZAHTJEV__PREPORUCENI_ODOBREN_IZNOS, value);
	}

	public void setZahtjevObradio(String value) {
		set(MCARD_GR_ZAHTJEV__ZAHTJEV_OBRADIO, value);
	}

	public void setDatumObrade(Calendar value) {
		setCalendarAsDateString(value, MCARD_GR_ZAHTJEV__DATUM_OBRADE);
	}

	public void setOdobreniIznos(String value) {
		set(MCARD_GR_ZAHTJEV__ODOBRENI_IZNOS, value);
	}

	public void setHrokRateKredita(String value) {
		set(MCARD_GR_ZAHTJEV__HROK_RATE_KREDITA, value);
	}

	public void setDatumOdobravanja(Calendar value) {
		setCalendarAsDateString(value, MCARD_GR_ZAHTJEV__DATUM_ODOBRAVANJA);
	}

	public void setOsobaOdobravanja(String value) {
		set(MCARD_GR_ZAHTJEV__OSOBA_ODOBRAVANJA, value);
	}

	public void setStatusOdobrenja(String value) {
		set(MCARD_GR_ZAHTJEV__STATUS_ODOBRENJA, value);
	}

	public void setKomentar(String value) {
		set(MCARD_GR_ZAHTJEV__KOMENTAR, value);
	}

	public void setUkupnaOcjena(String value) {
		set(MCARD_GR_ZAHTJEV__UKUPNA_OCJENA, value);
	}

	public void setOperaterIzmjene(String value) {
		set(MCARD_GR_ZAHTJEV__OPERATER_IZMJENE, value);
	}

	public void setStatusZahtjeva(String value) {
		set(MCARD_GR_ZAHTJEV__STATUS_ZAHTJEVA, value);
	}

	public void setVrijemeIzmjene(Calendar value) {
		setCalendarAsDateString(value, MCARD_GR_ZAHTJEV__VRIJEME_IZMJENE);
	}

	public void setIspravno(String value) {
		set(MCARD_GR_ZAHTJEV__ISPRAVNO, value);
	}
}
