package hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KreditniZahtjevOsobaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__TIP_PUNOMOCI_DUZNIK = "1";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__TIP_PUNOMOCI_SUDUZNIK = "2";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__TIP_PUNOMOCI_JAMAC = "3";

	public final static String MJESTO_STANOVANJA_ZADANO = "63118";
	public final static String MJESTO_RODENJA_ZADANO = "63118";
	public final static String STANOVANJE_ZADANO = "1";
	public final static String ODREDENO_NEODREDENO_ZADANO = "1";
	public final static String ZAPOSLENJE_ZADANO = "1";

	/* Attributes names /> */
	/* </ Constructors */
	public KreditniZahtjevOsobaVo() {
		super();
	}

	public KreditniZahtjevOsobaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getIdOsobe() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ID_OSOBE);
	}

	public String getIdZahtjeva() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ID_ZAHTJEVA);
	}

	public String getTipPunomoci() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__TIP_PUNOMOCI);
	}

	public String getIme() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__IME);
	}

	public String getPrezime() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__PREZIME);
	}

	public String getJmbg() {
		return get(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__JMBG);
		// return
		// NumberFormat.getInstance().format(getPropertyAsDoubleOrZero(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__JMBG));
		// return new
		// Float(getPropertyAsFloatOrZero(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__JMBG)).intValue()+"";
	}

	public String getMjestoRodenja() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__MJESTO_RODENJA);
	}

	public String getImeRoditelja() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__IME_RODITELJA);
	}

	public String getMjestoStanovanja() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__MJESTO_STANOVANJA);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__POSTANSKI_BROJ);
	}

	public String getUlica() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ULICA);
	}

	public String getTelefon() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__TELEFON);
	}

	public String getMobitel() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__MOBITEL);
	}

	public String getBracnoStanje() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__BRACNO_STANJE);
	}

	public String getBrojClanova() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__BROJ_CLANOVA);
	}

	public String getBrojZaposlenih() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__BROJ_ZAPOSLENIH);
	}

	public String getStanovanje() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__STANOVANJE);
	}

	public String getOpisNekretnina() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__OPIS_NEKRETNINA);
	}

	public String getZaposlenje() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZAPOSLENJE);
	}

	public String getZanimanje() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZANIMANJE);
	}

	public String getZvanje() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZVANJE);
	}

	public String getStrucnaSprema() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__STRUCNA_SPREMA);
	}

	public String getUkupniRadniStaz() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__UKUPNI_RADNI_STAZ);
	}

	public String getKodDanasnjegPoslodavca() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__KOD_DANASNJEG_POSLODAVCA);
	}

	public String getOdredenoNeodredeno() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ODREDENO_NEODREDENO);
	}

	public Calendar getZaposlenjeOd() {
		return getAsCalendar(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZAPOSLENJE_OD);
	}

	public Calendar getZaposlenjeDo() {
		return getAsCalendar(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZAPOSLENJE_DO);
	}

	public String getNazivPoslodavca() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__NAZIV_POSLODAVCA);
	}

	public String getMaticniBrojPoslodavca() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__MATICNI_BROJ_POSLODAVCA);
	}

	public String getAdresaPoslodavca() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ADRESA_POSLODAVCA);
	}

	public String getZiroRacunPoslodavca() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZIRO_RACUN_POSLODAVCA);
	}

	public String getTelefonPoslodavca() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__TELEFON_POSLODAVCA);
	}

	public String getFaxPoslodavca() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__FAX_POSLODAVCA);
	}

	public String getEmailPoslodavca() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__EMAIL_POSLODAVCA);
	}

	public String getZadnjaNetoPlaca() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZADNJA_NETO_PLACA);
	}

	public String getDodatniMjesecniPrihod() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__DODATNI_MJESECNI_PRIHOD);
	}

	public String getVrstaDodatnogPrihoda() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__VRSTA_DODATNOG_PRIHODA);
	}

	public String getKlijentBanke() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__KLIJENT_BANKE);
	}

	public String getVrstaRacunaKodBanke() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__VRSTA_RACUNA_KOD_BANKE);
	}

	public String getKlijentDrugeBanke() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__KLIJENT_DRUGE_BANKE);
	}

	public String getVrstaRacunaKodDrugeBanke() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__VRSTA_RACUNA_KOD_DRUGE_BANKE);
	}

	public void setIdOsobe(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ID_OSOBE, value);
	}

	public void setIdZahtjeva(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ID_ZAHTJEVA, value);
	}

	public void setTipPunomoci(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__TIP_PUNOMOCI, value);
	}

	public void setIme(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__IME, value);
	}

	public void setPrezime(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__PREZIME, value);
	}

	public void setJmbg(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__JMBG, value);
	}

	public void setMjestoRodenja(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__MJESTO_RODENJA,
				value);
	}

	public void setImeRoditelja(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__IME_RODITELJA, value);
	}

	public void setMjestoStanovanja(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__MJESTO_STANOVANJA,
				value);
	}

	public void setPostanskiBroj(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__POSTANSKI_BROJ,
				value);
	}

	public void setUlica(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ULICA, value);
	}

	public void setTelefon(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__TELEFON, value);
	}

	public void setMobitel(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__MOBITEL, value);
	}

	public void setBracnoStanje(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__BRACNO_STANJE, value);
	}

	public void setBrojClanova(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__BROJ_CLANOVA, value);
	}

	public void setBrojZaposlenih(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__BROJ_ZAPOSLENIH,
				value);
	}

	public void setStanovanje(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__STANOVANJE, value);
	}

	public void setOpisNekretnina(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__OPIS_NEKRETNINA,
				value);
	}

	public void setZaposlenje(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZAPOSLENJE, value);
	}

	public void setZanimanje(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZANIMANJE, value);
	}

	public void setZvanje(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZVANJE, value);
	}

	public void setStrucnaSprema(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__STRUCNA_SPREMA,
				value);
	}

	public void setUkupniRadniStaz(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__UKUPNI_RADNI_STAZ,
				value);
	}

	public void setKodDanasnjegPoslodavca(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__KOD_DANASNJEG_POSLODAVCA,
				value);
	}

	public void setOdredenoNeodredeno(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ODREDENO_NEODREDENO,
				value);
	}

	public void setZaposlenjeOd(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZAPOSLENJE_OD);
	}

	public void setZaposlenjeDo(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZAPOSLENJE_DO);
	}

	public void setNazivPoslodavca(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__NAZIV_POSLODAVCA,
				value);
	}

	public void setMaticniBrojPoslodavca(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__MATICNI_BROJ_POSLODAVCA,
				value);
	}

	public void setAdresaPoslodavca(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ADRESA_POSLODAVCA,
				value);
	}

	public void setZiroRacunPoslodavca(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZIRO_RACUN_POSLODAVCA,
				value);
	}

	public void setTelefonPoslodavca(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__TELEFON_POSLODAVCA,
				value);
	}

	public void setFaxPoslodavca(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__FAX_POSLODAVCA,
				value);
	}

	public void setEmailPoslodavca(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__EMAIL_POSLODAVCA,
				value);
	}

	public void setZadnjaNetoPlaca(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZADNJA_NETO_PLACA,
				value);
	}

	public void setDodatniMjesecniPrihod(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__DODATNI_MJESECNI_PRIHOD,
				value);
	}

	public void setVrstaDodatnogPrihoda(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__VRSTA_DODATNOG_PRIHODA,
				value);
	}

	public void setKlijentBanke(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__KLIJENT_BANKE, value);
	}

	public void setVrstaRacunaKodBanke(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__VRSTA_RACUNA_KOD_BANKE,
				value);
	}

	public void setKlijentDrugeBanke(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__KLIJENT_DRUGE_BANKE,
				value);
	}

	public void setVrstaRacunaKodDrugeBanke(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV_OSOBA__VRSTA_RACUNA_KOD_DRUGE_BANKE,
				value);
	}

	/* Setters /> */
}