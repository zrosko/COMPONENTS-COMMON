package hr.adriacomsoftware.app.common.pranjenovca.po.dto;

import hr.as2.inf.common.core.AS2Constants;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.security.user.AS2User;

import java.util.Calendar;

/**
 * 
 */
public class PrnPravnaOsobaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String PRN_PO_UPITNIK__ID_UPITNIKA = "id_upitnika";
	public static String PRN_PO_UPITNIK__MATICNI_BROJ = "maticni_broj";
	public static String PRN_PO_UPITNIK__OIB = "oib";
	public static String PRN_PO_UPITNIK__BROJ_PARTIJE = "broj_partije";
	public static String PRN_PO_UPITNIK__DATUM_POPUNJAVANJA = "datum_popunjavanja";
	public static String PRN_PO_UPITNIK__ULICA_KORESPODENCIJE = "ulica_korespodencije";
	public static String PRN_PO_UPITNIK__MJESTO_KORESPODENCIJE = "mjesto_korespodencije";
	public static String PRN_PO_UPITNIK__POSTANSKI_BROJ_KORESPODENCIJE = "postanski_broj_korespodencije";
	public static String PRN_PO_UPITNIK__DRZAVA_KORESPODENCIJE = "drzava_korespodencije";
	public static String PRN_PO_UPITNIK__KONTAKT_OSOBA = "kontakt_osoba";
	public static String PRN_PO_UPITNIK__MOBITEL = "mobitel";
	public static String PRN_PO_UPITNIK__FAX = "fax";
	public static String PRN_PO_UPITNIK__EMAIL = "email";
	public static String PRN_PO_UPITNIK__DATUM_ZADNJE_IZMJENE = "datum_zadnje_izmjene";
	public static String PRN_PO_UPITNIK__DATUM_UNOSA = "datum_unosa";
	public static String PRN_PO_UPITNIK__OSOBA_UNOSA = "osoba_unosa";
	public static String PRN_PO_UPITNIK__OSOBA_PROMJENE = "osoba_promjene";
	public static String PRN_PO_UPITNIK__ZADNJA_PROMJENA_VRIJEME = "zadnja_promjena_vrijeme";
	public static String PRN_PO_UPITNIK__OSOBA_ZAPRIMANJA = "osoba_zaprimanja";
	public static String PRN_PO_UPITNIK__DATUM_ZAPRIMANJA = "datum_zaprimanja";
	public static String PRN_PO_UPITNIK__ORG_JEDINICA = "org_jedinica";
	public static String PRN_PO_UPITNIK__KOMENTAR_BANKE = "komentar_banke";
	public static String PRN_PO_UPITNIK__ISPRAVNO = "ispravno";

	//
	public static String PRN_PRAVNA_OSOBA__DATUM_DO = "datum_do";

	/* Attributes names /> */
	/* </ Constructors */
	public PrnPravnaOsobaVo() {
		super();
	}

	public PrnPravnaOsobaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */

	/* </ Getters */
	public String getIdUpitnika() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__ID_UPITNIKA);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__MATICNI_BROJ);
	}

	public String getOib() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__OIB);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__BROJ_PARTIJE);
	}

	public Calendar getDatumPopunjavanja() {
		return getAsCalendar(PRN_PO_UPITNIK__DATUM_POPUNJAVANJA);
	}

	public String getUlicaKorespodencije() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__ULICA_KORESPODENCIJE);
	}

	public String getMjestoKorespodencije() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__MJESTO_KORESPODENCIJE);
	}

	public String getPostanskiBrojKorespodencije() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__POSTANSKI_BROJ_KORESPODENCIJE);
	}

	public String getDrzavaKorespodencije() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__DRZAVA_KORESPODENCIJE);
	}

	public String getKontaktOsoba() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__KONTAKT_OSOBA);
	}

	public String getMobitel() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__MOBITEL);
	}

	public String getFax() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__FAX);
	}

	public String getEmail() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__EMAIL);
	}

	public Calendar getDatumZadnjeIzmjene() {
		return getAsCalendar(PRN_PO_UPITNIK__DATUM_ZADNJE_IZMJENE);
	}

	public Calendar getDatumUnosa() {
		return getAsCalendar(PRN_PO_UPITNIK__DATUM_UNOSA);
	}

	public String getOsobaUnosa() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__OSOBA_UNOSA);
	}

	public String getOsobaPromjene() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__OSOBA_PROMJENE);
	}

	public Calendar getZadnjaPromjenaVrijeme() {
		return getAsCalendar(PRN_PO_UPITNIK__ZADNJA_PROMJENA_VRIJEME);
	}

	public String getOsobaZaprimanja() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__OSOBA_ZAPRIMANJA);
	}

	public Calendar getDatumZaprimanja() {
		return getAsCalendar(PRN_PO_UPITNIK__DATUM_ZAPRIMANJA);
	}

	public String getOrgJedinica() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__ORG_JEDINICA);
	}

	public String getKomentarBanke() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__KOMENTAR_BANKE);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(PRN_PO_UPITNIK__ISPRAVNO);
	}

	public void setIdUpitnika(String value) {
		set(PRN_PO_UPITNIK__ID_UPITNIKA, value);
	}

	public void setMaticniBroj(String value) {
		set(PRN_PO_UPITNIK__MATICNI_BROJ, value);
	}

	public void setOib(String value) {
		set(PRN_PO_UPITNIK__OIB, value);
	}

	public void setBrojPartije(String value) {
		set(PRN_PO_UPITNIK__BROJ_PARTIJE, value);
	}

	public void setDatumPopunjavanja(Calendar value) {
		setCalendarAsDateString(value, PRN_PO_UPITNIK__DATUM_POPUNJAVANJA);
	}

	public void setUlicaKorespodencije(String value) {
		set(PRN_PO_UPITNIK__ULICA_KORESPODENCIJE, value);
	}

	public void setMjestoKorespodencije(String value) {
		set(PRN_PO_UPITNIK__MJESTO_KORESPODENCIJE, value);
	}

	public void setPostanskiBrojKorespodencije(String value) {
		set(PRN_PO_UPITNIK__POSTANSKI_BROJ_KORESPODENCIJE, value);
	}

	public void setDrzavaKorespodencije(String value) {
		set(PRN_PO_UPITNIK__DRZAVA_KORESPODENCIJE, value);
	}

	public void setKontaktOsoba(String value) {
		set(PRN_PO_UPITNIK__KONTAKT_OSOBA, value);
	}

	public void setMobitel(String value) {
		set(PRN_PO_UPITNIK__MOBITEL, value);
	}

	public void setFax(String value) {
		set(PRN_PO_UPITNIK__FAX, value);
	}

	public void setEmail(String value) {
		set(PRN_PO_UPITNIK__EMAIL, value);
	}

	public void setDatumZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value, PRN_PO_UPITNIK__DATUM_ZADNJE_IZMJENE);
	}

	public void setDatumUnosa(Calendar value) {
		setCalendarAsDateString(value, PRN_PO_UPITNIK__DATUM_UNOSA);
	}

	public void setOsobaUnosa(String value) {
		set(PRN_PO_UPITNIK__OSOBA_UNOSA, value);
	}

	public void setOsobaPromjene(String value) {
		set(PRN_PO_UPITNIK__OSOBA_PROMJENE, value);
	}

	public void setZadnjaPromjenaVrijeme(Calendar value) {
		setCalendarAsDateString(value, PRN_PO_UPITNIK__ZADNJA_PROMJENA_VRIJEME);
	}

	public void setOsobaZaprimanja(String value) {
		set(PRN_PO_UPITNIK__OSOBA_ZAPRIMANJA, value);
	}

	public void setDatumZaprimanja(Calendar value) {
		setCalendarAsDateString(value, PRN_PO_UPITNIK__DATUM_ZAPRIMANJA);
	}

	public void setOrgJedinica(String value) {
		set(PRN_PO_UPITNIK__ORG_JEDINICA, value);
	}

	public void setKomentarBanke(String value) {
		set(PRN_PO_UPITNIK__KOMENTAR_BANKE, value);
	}

	public void setIspravno(String value) {
		set(PRN_PO_UPITNIK__ISPRAVNO, value);
	}

	/**
     **/
	public String getKorisnik() {
		AS2User user = (AS2User) getProperty(AS2Constants.USER_OBJ);
		return user.getUserName();
	}

	/* Setters /> */
}