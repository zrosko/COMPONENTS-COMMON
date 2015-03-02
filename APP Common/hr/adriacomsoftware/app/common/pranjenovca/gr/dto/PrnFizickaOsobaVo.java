package hr.adriacomsoftware.app.common.pranjenovca.gr.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/**
 * 
 */
public class PrnFizickaOsobaVo extends OsnovniVo {// ne radi RMI
	private static final long serialVersionUID = 1L;
	public static String PRN_GR_UPITNIK__ID_UPITNIKA = "id_upitnika";
	public static String PRN_GR_UPITNIK__JMBG = "jmbg";
	public static String PRN_GR_UPITNIK__OIB = "oib";
	public static String PRN_GR_UPITNIK__BROJ_PARTIJE = "broj_partije";
	public static String PRN_GR_UPITNIK__DATUM_POPUNJAVANJA = "datum_popunjavanja";
	public static String PRN_GR_UPITNIK__BROJ_OSOBNE = "broj_osobne";
	public static String PRN_GR_UPITNIK__NAZIV_IZDAVATELJA_OSOBNE = "naziv_izdavatelja_osobne";
	public static String PRN_GR_UPITNIK__DRZAVA_IZDAVATELJA_OSOBNE = "drzava_izdavatelja_osobne";
	public static String PRN_GR_UPITNIK__BROJ_PUTOVNICE = "broj_putovnice";
	public static String PRN_GR_UPITNIK__NAZIV_IZDAVATELJA_PUTOVNICE = "naziv_izdavatelja_putovnice";
	public static String PRN_GR_UPITNIK__DRZAVA_IZDAVATELJA_PUTOVNICE = "drzava_izdavatelja_putovnice";
	public static String PRN_GR_UPITNIK__MJESTO_RODENJA = "mjesto_rodenja";
	public static String PRN_GR_UPITNIK__DRZAVA_RODENJA = "drzava_rodenja";
	public static String PRN_GR_UPITNIK__DRZAVLJANSTVO = "drzavljanstvo";
	public static String PRN_GR_UPITNIK__ULICA_KORESPODENCIJE = "ulica_korespodencije";
	public static String PRN_GR_UPITNIK__MJESTO_KORESPODENCIJE = "mjesto_korespodencije";
	public static String PRN_GR_UPITNIK__POSTANSKI_BROJ_KORESPODENCIJE = "postanski_broj_korespodencije";
	public static String PRN_GR_UPITNIK__DRZAVA_KORESPODENCIJE = "drzava_korespodencije";
	public static String PRN_GR_UPITNIK__TELEFON_POSAO = "telefon_posao";
	public static String PRN_GR_UPITNIK__MOBITEL = "mobitel";
	public static String PRN_GR_UPITNIK__FAX = "fax";
	public static String PRN_GR_UPITNIK__EMAIL = "email";
	public static String PRN_GR_UPITNIK__POLITICKA_OSOBA = "politicka_osoba";
	public static String PRN_GR_UPITNIK__POLITICKI_UPITNIK = "politicki_upitnik";
	public static String PRN_GR_UPITNIK__DATUM_UNOSA = "datum_unosa";
	public static String PRN_GR_UPITNIK__VRSTA_ZAPOSLENJA = "vrsta_zaposlenja";
	public static String PRN_GR_UPITNIK__VRSTA_POSLODAVCA = "vrsta_poslodavca";
	public static String PRN_GR_UPITNIK__NAZIV_POSLODAVCA = "naziv_poslodavca";
	public static String PRN_GR_UPITNIK__POZICIJA_ZAPOSLENJA = "pozicija_zaposlenja";
	public static String PRN_GR_UPITNIK__SVOJSTVO_POTPISNIKA = "svojstvo_potpisnika";
	public static String PRN_GR_UPITNIK__PROSJECNA_MJ_PRIMANJA = "prosjecna_mj_primanja";
	public static String PRN_GR_UPITNIK__DATUM_POCETKA_PRIMANJA = "datum_pocetka_primanja";
	public static String PRN_GR_UPITNIK__OSTALI_IZVORI_PRIHODA = "ostali_izvori_prihoda";
	public static String PRN_GR_UPITNIK__IZNOS_OSTALIH_PRIHODA = "iznos_ostalih_prihoda";
	public static String PRN_GR_UPITNIK__IZNOS_OSTALIH_PRIHODA_VALUTA = "iznos_ostalih_prihoda_valuta";
	public static String PRN_GR_UPITNIK__GODINA_IZNOSA_OSTALIH_PRIHODA = "godina_iznosa_ostalih_prihoda";
	public static String PRN_GR_UPITNIK__ZADNJA_PROMJENA_VRIJEME = "zadnja_promjena_vrijeme";
	public static String PRN_GR_UPITNIK__OSOBA_UNOSA = "osoba_unosa";
	public static String PRN_GR_UPITNIK__OSOBA_PROMJENE = "osoba_promjene";
	public static String PRN_GR_UPITNIK__OSOBA_ZAPRIMANJA = "osoba_zaprimanja";
	public static String PRN_GR_UPITNIK__DATUM_ZAPRIMANJA = "datum_zaprimanja";
	public static String PRN_GR_UPITNIK__ORG_JEDINICA = "org_jedinica";
	public static String PRN_GR_UPITNIK__KOMENTAR_BANKE = "komentar_banke";
	public static String PRN_GR_UPITNIK__ISPRAVNO = "ispravno";
	public static String PRN_GR_UPITNIK__ULICA_BORAVISTA = "ulica_boravista";
	public static String PRN_GR_UPITNIK__MJESTO_BORAVISTA = "mjesto_boravista";
	public static String PRN_GR_UPITNIK__POSTANSKI_BROJ_BORAVISTA = "postanski_broj_boravista";
	public static String PRN_GR_UPITNIK__DRZAVA_BORAVISTA = "drzava_boravista";
	public static String PRN_GR_UPITNIK__TIN = "tin";
	// public static String PRN_GR_UPITNIK__DATUM_OD_TIN = "datum_od_tin";
	// public static String PRN_GR_UPITNIK__DATUM_DO_TIN = "datum_do_tin";
	public static String PRN_GR_UPITNIK__DRZAVA_TIN = "drzava_tin";

	/* Attributes names /> */
	/* </ Constructors */
	public PrnFizickaOsobaVo() {
		super();
	}

	public PrnFizickaOsobaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */

	/* </ Getters */
	public String getIdUpitnika() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__ID_UPITNIKA);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__JMBG);
	}

	public String getOib() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__OIB);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__BROJ_PARTIJE);
	}

	public Calendar getDatumPopunjavanja() {
		return getAsCalendar(PRN_GR_UPITNIK__DATUM_POPUNJAVANJA);
	}

	public String getBrojOsobne() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__BROJ_OSOBNE);
	}

	public String getNazivIzdavateljaOsobne() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__NAZIV_IZDAVATELJA_OSOBNE);
	}

	public String getDrzavaIzdavateljaOsobne() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__DRZAVA_IZDAVATELJA_OSOBNE);
	}

	public String getBrojPutovnice() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__BROJ_PUTOVNICE);
	}

	public String getNazivIzdavateljaPutovnice() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__NAZIV_IZDAVATELJA_PUTOVNICE);
	}

	public String getDrzavaIzdavateljaPutovnice() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__DRZAVA_IZDAVATELJA_PUTOVNICE);
	}

	public String getMjestoBoravista() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__MJESTO_BORAVISTA);
	}

	public String getUlicaBoravista() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__ULICA_BORAVISTA);
	}

	public String getPostanskiBrojBoravista() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__POSTANSKI_BROJ_BORAVISTA);
	}

	public String getDrzavaBoravista() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__DRZAVA_BORAVISTA);
	}

	public String getTin() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__TIN);
	}

	public String getDrzavaTin() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__DRZAVA_TIN);
	}

	public String getMjestoRodenja() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__MJESTO_RODENJA);
	}

	public String getDrzavaRodenja() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__DRZAVA_RODENJA);
	}

	public String getDrzavljanstvo() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__DRZAVLJANSTVO);
	}

	public String getUlicaKorespodencije() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__ULICA_KORESPODENCIJE);
	}

	public String getMjestoKorespodencije() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__MJESTO_KORESPODENCIJE);
	}

	public String getPostanskiBrojKorespodencije() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__POSTANSKI_BROJ_KORESPODENCIJE);
	}

	public String getDrzavaKorespodencije() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__DRZAVA_KORESPODENCIJE);
	}

	public String getTelefonPosao() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__TELEFON_POSAO);
	}

	public String getMobitel() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__MOBITEL);
	}

	public String getFax() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__FAX);
	}

	public String getEmail() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__EMAIL);
	}

	public String getPolitickaOsoba() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__POLITICKA_OSOBA);
	}

	public String getPolitickiUpitnik() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__POLITICKI_UPITNIK);
	}

	public Calendar getDatumUnosa() {
		return getAsCalendar(PRN_GR_UPITNIK__DATUM_UNOSA);
	}

	public String getVrstaZaposlenja() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__VRSTA_ZAPOSLENJA);
	}

	public String getVrstaPoslodavca() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__VRSTA_POSLODAVCA);
	}

	public String getNazivPoslodavca() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__NAZIV_POSLODAVCA);
	}

	public String getPozicijaZaposlenja() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__POZICIJA_ZAPOSLENJA);
	}

	public String getSvojstvoPotpisnika() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__SVOJSTVO_POTPISNIKA);
	}

	public String getProsjecnaMjPrimanja() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__PROSJECNA_MJ_PRIMANJA);
	}

	// public Calendar getDatumPocetkaPrimanja() {
	// return getAsCalendar(PRN_GR_UPITNIK__DATUM_POCETKA_PRIMANJA);
	// }
	public String getOstaliIzvoriPrihoda() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__OSTALI_IZVORI_PRIHODA);
	}

	public String getIznosOstalihPrihoda() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__IZNOS_OSTALIH_PRIHODA);
	}

	public String getIznosOstalihPrihodaValuta() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__IZNOS_OSTALIH_PRIHODA_VALUTA);
	}

	public String getGodinaIznosaOstalihPrihoda() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__GODINA_IZNOSA_OSTALIH_PRIHODA);
	}

	public Calendar getZadnjaPromjenaVrijeme() {
		return getAsCalendar(PRN_GR_UPITNIK__ZADNJA_PROMJENA_VRIJEME);
	}

	public String getOsobaUnosa() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__OSOBA_UNOSA);
	}

	public String getOsobaPromjene() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__OSOBA_PROMJENE);
	}

	public String getOsobaZaprimanja() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__OSOBA_ZAPRIMANJA);
	}

	public Calendar getDatumZaprimanja() {
		return getAsCalendar(PRN_GR_UPITNIK__DATUM_ZAPRIMANJA);
	}

	public String getOrgJedinica() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__ORG_JEDINICA);
	}

	public String getKomentarBanke() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__KOMENTAR_BANKE);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK__ISPRAVNO);
	}

	public void setIdUpitnika(String value) {
		set(PRN_GR_UPITNIK__ID_UPITNIKA, value);
	}

	public void setJmbg(String value) {
		set(PRN_GR_UPITNIK__JMBG, value);
	}

	public void setOib(String value) {
		set(PRN_GR_UPITNIK__OIB, value);
	}

	public void setBrojPartije(String value) {
		set(PRN_GR_UPITNIK__BROJ_PARTIJE, value);
	}

	public void setDatumPopunjavanja(Calendar value) {
		setCalendarAsDateString(value, PRN_GR_UPITNIK__DATUM_POPUNJAVANJA);
	}

	public void setBrojOsobne(String value) {
		set(PRN_GR_UPITNIK__BROJ_OSOBNE, value);
	}

	public void setNazivIzdavateljaOsobne(String value) {
		set(PRN_GR_UPITNIK__NAZIV_IZDAVATELJA_OSOBNE, value);
	}

	public void setDrzavaIzdavateljaOsobne(String value) {
		set(PRN_GR_UPITNIK__DRZAVA_IZDAVATELJA_OSOBNE, value);
	}

	public void setBrojPutovnice(String value) {
		set(PRN_GR_UPITNIK__BROJ_PUTOVNICE, value);
	}

	public void setNazivIzdavateljaPutovnice(String value) {
		set(PRN_GR_UPITNIK__NAZIV_IZDAVATELJA_PUTOVNICE, value);
	}

	public void setDrzavaIzdavateljaPutovnice(String value) {
		set(PRN_GR_UPITNIK__DRZAVA_IZDAVATELJA_PUTOVNICE, value);
	}

	public void setUlicaBoravista(String value) {
		set(PRN_GR_UPITNIK__ULICA_BORAVISTA, value);
	}

	public void setMjestoBoravista(String value) {
		set(PRN_GR_UPITNIK__MJESTO_BORAVISTA, value);
	}

	public void setPostanskiBrojBoravista(String value) {
		set(PRN_GR_UPITNIK__POSTANSKI_BROJ_BORAVISTA, value);
	}

	public void setDrzavaBoravista(String value) {
		set(PRN_GR_UPITNIK__DRZAVA_BORAVISTA, value);
	}

	public void setTin(String value) {
		set(PRN_GR_UPITNIK__TIN, value);
	}

	public void setDrzavaTin(String value) {
		set(PRN_GR_UPITNIK__DRZAVA_TIN, value);
	}

	public void setMjestoRodenja(String value) {
		set(PRN_GR_UPITNIK__MJESTO_RODENJA, value);
	}

	public void setDrzavaRodenja(String value) {
		set(PRN_GR_UPITNIK__DRZAVA_RODENJA, value);
	}

	public void setDrzavljanstvo(String value) {
		set(PRN_GR_UPITNIK__DRZAVLJANSTVO, value);
	}

	public void setUlicaKorespodencije(String value) {
		set(PRN_GR_UPITNIK__ULICA_KORESPODENCIJE, value);
	}

	public void setMjestoKorespodencije(String value) {
		set(PRN_GR_UPITNIK__MJESTO_KORESPODENCIJE, value);
	}

	public void setPostanskiBrojKorespodencije(String value) {
		set(PRN_GR_UPITNIK__POSTANSKI_BROJ_KORESPODENCIJE, value);
	}

	public void setDrzavaKorespodencije(String value) {
		set(PRN_GR_UPITNIK__DRZAVA_KORESPODENCIJE, value);
	}

	public void setTelefonPosao(String value) {
		set(PRN_GR_UPITNIK__TELEFON_POSAO, value);
	}

	public void setMobitel(String value) {
		set(PRN_GR_UPITNIK__MOBITEL, value);
	}

	public void setFax(String value) {
		set(PRN_GR_UPITNIK__FAX, value);
	}

	public void setEmail(String value) {
		set(PRN_GR_UPITNIK__EMAIL, value);
	}

	public void setPolitickaOsoba(String value) {
		set(PRN_GR_UPITNIK__POLITICKA_OSOBA, value);
	}

	public void setPolitickiUpitnik(String value) {
		set(PRN_GR_UPITNIK__POLITICKI_UPITNIK, value);
	}

	public void setDatumUnosa(Calendar value) {
		setCalendarAsDateString(value, PRN_GR_UPITNIK__DATUM_UNOSA);
	}

	public void setVrstaZaposlenja(String value) {
		set(PRN_GR_UPITNIK__VRSTA_ZAPOSLENJA, value);
	}

	public void setVrstaPoslodavca(String value) {
		set(PRN_GR_UPITNIK__VRSTA_POSLODAVCA, value);
	}

	public void setNazivPoslodavca(String value) {
		set(PRN_GR_UPITNIK__NAZIV_POSLODAVCA, value);
	}

	public void setPozicijaZaposlenja(String value) {
		set(PRN_GR_UPITNIK__POZICIJA_ZAPOSLENJA, value);
	}

	public void setSvojstvoPotpisnika(String value) {
		set(PRN_GR_UPITNIK__SVOJSTVO_POTPISNIKA, value);
	}

	public void setProsjecnaMjPrimanja(String value) {
		set(PRN_GR_UPITNIK__PROSJECNA_MJ_PRIMANJA, value);
	}

	// public void setDatumPocetkaPrimanja(Calendar value) {
	// setCalendarAsDateString(value, PRN_GR_UPITNIK__DATUM_POCETKA_PRIMANJA);
	// }
	public void setOstaliIzvoriPrihoda(String value) {
		set(PRN_GR_UPITNIK__OSTALI_IZVORI_PRIHODA, value);
	}

	public void setIznosOstalihPrihoda(String value) {
		set(PRN_GR_UPITNIK__IZNOS_OSTALIH_PRIHODA, value);
	}

	public void setIznosOstalihPrihodaValuta(String value) {
		set(PRN_GR_UPITNIK__IZNOS_OSTALIH_PRIHODA_VALUTA, value);
	}

	public void setGodinaIznosaOstalihPrihoda(String value) {
		set(PRN_GR_UPITNIK__GODINA_IZNOSA_OSTALIH_PRIHODA, value);
	}

	public void setZadnjaPromjenaVrijeme(Calendar value) {
		setCalendarAsDateString(value, PRN_GR_UPITNIK__ZADNJA_PROMJENA_VRIJEME);
	}

	public void setOsobaUnosa(String value) {
		set(PRN_GR_UPITNIK__OSOBA_UNOSA, value);
	}

	public void setOsobaPromjene(String value) {
		set(PRN_GR_UPITNIK__OSOBA_PROMJENE, value);
	}

	public void setIspravno(String value) {
		set(PRN_GR_UPITNIK__ISPRAVNO, value);
	}

	public void setOsobaZaprimanja(String value) {
		set(PRN_GR_UPITNIK__OSOBA_ZAPRIMANJA, value);
	}

	public void setDatumZaprimanja(Calendar value) {
		setCalendarAsDateString(value, PRN_GR_UPITNIK__DATUM_ZAPRIMANJA);
	}

	public void setOrgJedinica(String value) {
		set(PRN_GR_UPITNIK__ORG_JEDINICA, value);
	}

	public void setKomentarBanke(String value) {
		set(PRN_GR_UPITNIK__KOMENTAR_BANKE, value);
	}
	/* Setters /> */
}