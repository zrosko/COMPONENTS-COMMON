package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class NaplataGrTekuciPracenjeVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_PARTIJE = "broj_partije";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__JMBG = "jmbg";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__OIB = "oib";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__NAZIV = "naziv";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__SALDO_TEKST = "saldo_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__STATUS_PARTIJE = "status_partije";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__STATUS_PRACENJA = "status_pracenja";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__PARTIJA_ZATVORENA = "partija_zatvorena";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ULICA = "ulica";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__POSTANSKI_BROJ = "postanski_broj";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__MJESTO = "mjesto";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__TELEFON = "telefon";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ORG_JED = "org_jed";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__RAZINA_OPOMENE = "razina_opomene";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__UKUPNI_BROJ_OPOMENA = "ukupni_broj_opomena";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_OPOMENE_TEKST = "datum_opomene_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_STANJA_TEKST = "datum_stanja_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__RED_CEKANJA = "red_cekanja";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ZADANI_DATUM_TEKST = "zadani_datum_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ZADANI_DATUM = "zadani_datum";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__SALDO_ZADANOG_DATUMA = "saldo_zadanog_datuma";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__MOGUCI_KREDIT = "moguci_kredit";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DOZVOLJENO_PREKORACENJE = "dozvoljeno_prekoracenje";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__NEDOZVOLJENO_PREKORACENJE = "nedozvoljeno_prekoracenje";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_DANA = "broj_dana";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_NEREALIZIRANIH_CEKOVA = "broj_nerealiziranih_cekova";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BLOKIRANA_PARTIJA = "blokirana_partija";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_NEDOZVOLJENOG_PREKORAC_TEKST = "datum_nedozvoljenog_prekorac_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_NEDOZVOLJENOG_PREKORAC = "datum_nedozvoljenog_prekorac";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_PARTIJE_IZUZETI_PRILJEVI = "broj_partije_izuzeti_priljevi";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__STANJE_IZUZETI_PRILJEVI = "stanje_izuzeti_priljevi";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__NAPOMENA = "napomena";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__SUBJEKTIVNA_RIZICNOST = "subjektivna_rizicnost";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PREBACIVANJA_TEKST = "datum_prebacivanja_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PREBACIVANJA = "datum_prebacivanja";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__OPERATER_ZADNJE_IZMJENE = "operater_zadnje_izmjene";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ISPRAVNO = "ispravno";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ID_PRACENJA = "id_pracenja";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__RAZLOG_PREBACIVANJA_NA_SSP = "razlog_prebacivanja_na_ssp";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PREBACIVANJA_SSP = "datum_prebacivanja_ssp";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_KONTAKTA_TEKST = "datum_kontakta_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__KOMENTAR_KONTAKT = "komentar_kontakt";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__KONTAKT_OSTVAREN = "kontakt_ostvaren";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DOGOVOR_POSTIGNUT = "dogovor_postignut";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__VRSTA_KONTAKTA = "vrsta_kontakta";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__REFERENT_KONTAKTA = "referent_kontakta";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_BUDUCEG_KONTAKTA_TEKST = "datum_buduceg_kontakta_tekst";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PRVE_OPOMENE = "datum_prve_opomene";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_DRUGE_OPOMENE = "datum_druge_opomene";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__UKUPNA_OCJENA = "ukupna_ocjena";
	public static String VIEW_NAPLATA_GR_TEKUCI_PRACENJE__POSTOTAK_REZERVACIJE = "postotak_rezervacije";

	public NaplataGrTekuciPracenjeVo() {
		super();
	}

	public NaplataGrTekuciPracenjeVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getBrojPartije() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_PARTIJE);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__JMBG);
	}

	public String getOib() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__OIB);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__NAZIV);
	}

	public String getSaldoTekst() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__SALDO_TEKST);
	}

	public String getStatusPartije() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__STATUS_PARTIJE);
	}

	public String getStatusPracenja() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__STATUS_PRACENJA);
	}

	public String getPartijaZatvorena() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__PARTIJA_ZATVORENA);
	}

	public String getUlica() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ULICA);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__POSTANSKI_BROJ);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__MJESTO);
	}

	public String getTelefon() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__TELEFON);
	}

	public String getOrgJed() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ORG_JED);
	}

	public String getRazinaOpomene() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__RAZINA_OPOMENE);
	}

	public String getUkupniBrojOpomena() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__UKUPNI_BROJ_OPOMENA);
	}

	public String getDatumOpomeneTekst() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_OPOMENE_TEKST);
	}

	public String getDatumStanjaTekst() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_STANJA_TEKST);
	}

	public String getRedCekanja() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__RED_CEKANJA);
	}

	public String getZadaniDatumTekst() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ZADANI_DATUM_TEKST);
	}

	public Calendar getZadaniDatum() {
		return getAsCalendar(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ZADANI_DATUM);
	}

	public String getSaldoZadanogDatuma() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__SALDO_ZADANOG_DATUMA);
	}

	public String getMoguciKredit() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__MOGUCI_KREDIT);
	}

	public String getDozvoljenoPrekoracenje() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DOZVOLJENO_PREKORACENJE);
	}

	public String getNedozvoljenoPrekoracenje() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__NEDOZVOLJENO_PREKORACENJE);
	}

	public String getBrojDana() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_DANA);
	}

	public String getBrojNerealiziranihCekova() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_NEREALIZIRANIH_CEKOVA);
	}

	public String getBlokiranaPartija() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BLOKIRANA_PARTIJA);
	}

	public String getDatumNedozvoljenogPrekoracTekst() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_NEDOZVOLJENOG_PREKORAC_TEKST);
	}

	public Calendar getDatumNedozvoljenogPrekorac() {
		return getAsCalendar(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_NEDOZVOLJENOG_PREKORAC);
	}

	public String getBrojPartijeIzuzetiPriljevi() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_PARTIJE_IZUZETI_PRILJEVI);
	}

	public String getStanjeIzuzetiPriljevi() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__STANJE_IZUZETI_PRILJEVI);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__NAPOMENA);
	}

	public String getSubjektivnaRizicnost() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__SUBJEKTIVNA_RIZICNOST);
	}

	public String getDatumPrebacivanjaTekst() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PREBACIVANJA_TEKST);
	}

	public Calendar getDatumPrebacivanja() {
		return getAsCalendar(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PREBACIVANJA);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getOperaterZadnjeIzmjene() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__OPERATER_ZADNJE_IZMJENE);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ISPRAVNO);
	}

	public String getIdPracenja() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ID_PRACENJA);
	}

	public String getRazlogPrebacivanjaNaSsp() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__RAZLOG_PREBACIVANJA_NA_SSP);
	}

	public Calendar getDatumPrebacivanjaSsp() {
		return getAsCalendar(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PREBACIVANJA_SSP);
	}

	public String getDatumKontaktaTekst() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_KONTAKTA_TEKST);
	}

	public String getKomentarKontakt() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__KOMENTAR_KONTAKT);
	}

	public String getKontaktOstvaren() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__KONTAKT_OSTVAREN);
	}

	public String getDogovorPostignut() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DOGOVOR_POSTIGNUT);
	}

	public String getVrstaKontakta() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__VRSTA_KONTAKTA);
	}

	public String getReferentKontakta() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__REFERENT_KONTAKTA);
	}

	public String getDatumBuducegKontaktaTekst() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_BUDUCEG_KONTAKTA_TEKST);
	}

	public String getDatumPrveOpomene() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PRVE_OPOMENE);
	}

	public String getDatumDrugeOpomene() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_DRUGE_OPOMENE);
	}

	public String getUkupnaOcjena() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__UKUPNA_OCJENA);
	}

	public String getPostotakRezervacije() {
		return getAsStringOrEmpty(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__POSTOTAK_REZERVACIJE);
	}

	/************* SETTERS ************/

	public void setBrojPartije(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_PARTIJE, value);
	}

	public void setJmbg(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__JMBG, value);
	}

	public void setOib(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__OIB, value);
	}

	public void setNaziv(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__NAZIV, value);
	}

	public void setSaldoTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__SALDO_TEKST, value);
	}

	public void setStatusPartije(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__STATUS_PARTIJE, value);
	}

	public void setStatusPracenja(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__STATUS_PRACENJA, value);
	}

	public void setPartijaZatvorena(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__PARTIJA_ZATVORENA, value);
	}

	public void setUlica(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ULICA, value);
	}

	public void setPostanskiBroj(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__POSTANSKI_BROJ, value);
	}

	public void setMjesto(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__MJESTO, value);
	}

	public void setTelefon(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__TELEFON, value);
	}

	public void setOrgJed(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ORG_JED, value);
	}

	public void setRazinaOpomene(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__RAZINA_OPOMENE, value);
	}

	public void setUkupniBrojOpomena(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__UKUPNI_BROJ_OPOMENA, value);
	}

	public void setDatumOpomeneTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_OPOMENE_TEKST, value);
	}

	public void setDatumStanjaTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_STANJA_TEKST, value);
	}

	public void setRedCekanja(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__RED_CEKANJA, value);
	}

	public void setZadaniDatumTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ZADANI_DATUM_TEKST, value);
	}

	public void setZadaniDatum(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ZADANI_DATUM);
	}

	public void setSaldoZadanogDatuma(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__SALDO_ZADANOG_DATUMA, value);
	}

	public void setMoguciKredit(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__MOGUCI_KREDIT, value);
	}

	public void setDozvoljenoPrekoracenje(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DOZVOLJENO_PREKORACENJE, value);
	}

	public void setNedozvoljenoPrekoracenje(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__NEDOZVOLJENO_PREKORACENJE, value);
	}

	public void setBrojDana(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_DANA, value);
	}

	public void setBrojNerealiziranihCekova(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_NEREALIZIRANIH_CEKOVA, value);
	}

	public void setBlokiranaPartija(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BLOKIRANA_PARTIJA, value);
	}

	public void setDatumNedozvoljenogPrekoracTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_NEDOZVOLJENOG_PREKORAC_TEKST,
				value);
	}

	public void setDatumNedozvoljenogPrekorac(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_NEDOZVOLJENOG_PREKORAC);
	}

	public void setBrojPartijeIzuzetiPriljevi(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__BROJ_PARTIJE_IZUZETI_PRILJEVI,
				value);
	}

	public void setStanjeIzuzetiPriljevi(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__STANJE_IZUZETI_PRILJEVI, value);
	}

	public void setNapomena(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__NAPOMENA, value);
	}

	public void setSubjektivnaRizicnost(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__SUBJEKTIVNA_RIZICNOST, value);
	}

	public void setDatumPrebacivanjaTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PREBACIVANJA_TEKST, value);
	}

	public void setDatumPrebacivanja(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PREBACIVANJA);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_TEKUCI_PRACENJE__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setOperaterZadnjeIzmjene(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__OPERATER_ZADNJE_IZMJENE, value);
	}

	public void setIspravno(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ISPRAVNO, value);
	}

	public void setIdPracenja(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__ID_PRACENJA, value);
	}

	public void setRazlogPrebacivanjaNaSsp(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__RAZLOG_PREBACIVANJA_NA_SSP, value);
	}

	public void setDatumPrebacivanjaSsp(Calendar value) {
		setCalendarAsDateString(value,
				VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PREBACIVANJA_SSP);
	}

	public void setDatumKontaktaTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_KONTAKTA_TEKST, value);
	}

	public void setKomentarKontakt(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__KOMENTAR_KONTAKT, value);
	}

	public void setKontaktOstvaren(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__KONTAKT_OSTVAREN, value);
	}

	public void setDogovorPostignut(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DOGOVOR_POSTIGNUT, value);
	}

	public void setVrstaKontakta(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__VRSTA_KONTAKTA, value);
	}

	public void setReferentKontakta(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__REFERENT_KONTAKTA, value);
	}

	public void setDatumBuducegKontaktaTekst(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_BUDUCEG_KONTAKTA_TEKST,
				value);
	}

	public void setDatumPrveOpomene(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_PRVE_OPOMENE, value);
	}

	public void setDatumDrugeOpomene(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__DATUM_DRUGE_OPOMENE, value);
	}

	public void setUkupnaOcjena(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__UKUPNA_OCJENA, value);
	}

	public void setPostotakRezervacije(String value) {
		set(VIEW_NAPLATA_GR_TEKUCI_PRACENJE__POSTOTAK_REZERVACIJE, value);
	}
}