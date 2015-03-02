package hr.adriacomsoftware.app.common.pranjenovca.po.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/**
 * 
 */
public class PrnPoPovezanaOsobaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PRN_PO_POVEZANA_OSOBA__ID_POVEZANE_OSOBE = "id_povezane_osobe";
	public static String PRN_PO_POVEZANA_OSOBA__ID_UPITNIKA = "id_upitnika";
	public static String PRN_PO_POVEZANA_OSOBA__JMBG_MB = "jmbg_mb";
	public static String PRN_PO_POVEZANA_OSOBA__JMBG_MATICNI_BROJ_VEZA = "jmbg_maticni_broj_veza";
	public static String PRN_PO_POVEZANA_OSOBA__OIB = "oib";
	public static String PRN_PO_POVEZANA_OSOBA__IME = "ime";
	public static String PRN_PO_POVEZANA_OSOBA__PREZIME = "prezime";
	public static String PRN_PO_POVEZANA_OSOBA__POSTOTAK_UDJELA = "postotak_udjela";
	public static String PRN_PO_POVEZANA_OSOBA__ULICA = "ulica";
	public static String PRN_PO_POVEZANA_OSOBA__POSTANSKI_BROJ = "postanski_broj";
	public static String PRN_PO_POVEZANA_OSOBA__MJESTO = "mjesto";
	public static String PRN_PO_POVEZANA_OSOBA__DRZAVA = "drzava";
	public static String PRN_PO_POVEZANA_OSOBA__MJESTO_RODENJA = "mjesto_rodenja";
	public static String PRN_PO_POVEZANA_OSOBA__POSTANSKI_BROJ_RODENJA = "postanski_broj_rodenja";
	public static String PRN_PO_POVEZANA_OSOBA__DRZAVA_RODENJA = "drzava_rodenja";
	public static String PRN_PO_POVEZANA_OSOBA__DATUM_RODENJA = "datum_rodenja";
	public static String PRN_PO_POVEZANA_OSOBA__NAZIV_IDENTIFIKACIJSKE_ISPRAVE = "naziv_identifikacijske_isprave";
	public static String PRN_PO_POVEZANA_OSOBA__BROJ_IDENTIFIKACIJSKE_ISPRAVE = "broj_identifikacijske_isprave";
	public static String PRN_PO_POVEZANA_OSOBA__TIP_VEZE = "tip_veze";
	public static String PRN_PO_POVEZANA_OSOBA__VRSTA_UNOSA = "vrsta_unosa";
	public static String PRN_PO_POVEZANA_OSOBA__DRZAVLJANSTVO = "drzavljanstvo";
	public static String PRN_PO_POVEZANA_OSOBA__VRSTA_VLASNIKA = "vrsta_vlasnika";
	public static String PRN_PO_POVEZANA_OSOBA__TIP_VLASNISTVA = "tip_vlasnistva";
	public static String PRN_PO_POVEZANA_OSOBA__VRSTA_UTJECAJA = "vrsta_utjecaja";
	public static String PRN_PO_POVEZANA_OSOBA__CLAN_OBITELJI = "clan_obitelji";
	public static String PRN_PO_POVEZANA_OSOBA__CLAN_OBITELJI_NAZIV = "clan_obitelji_naziv";
	public static String PRN_PO_POVEZANA_OSOBA__UCITANO = "ucitano";

	/* Attributes names /> */
	/* </ Constructors */
	public PrnPoPovezanaOsobaVo() {
		super();
	}

	public PrnPoPovezanaOsobaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */

	/* </ Getters */
	public String getIdPovezaneOsobe() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__ID_POVEZANE_OSOBE);
	}

	public String getIdUpitnika() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__ID_UPITNIKA);
	}

	public String getJmbgMb() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__JMBG_MB);
	}

	public String getJmbgMaticniBrojVeza() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__JMBG_MATICNI_BROJ_VEZA);
	}

	public String getOib() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__OIB);
	}

	public String getIme() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__IME);
	}

	public String getPrezime() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__PREZIME);
	}

	public String getPostotakUdjela() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__POSTOTAK_UDJELA);
	}

	public String getUlica() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__ULICA);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__POSTANSKI_BROJ);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__MJESTO);
	}

	public String getDrzava() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__DRZAVA);
	}

	public String getMjestoRodenja() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__MJESTO_RODENJA);
	}

	public String getPostanskiBrojRodenja() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__POSTANSKI_BROJ_RODENJA);
	}

	public String getDrzavaRodenja() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__DRZAVA_RODENJA);
	}

	public Calendar getDatumRodenja() {
		return getAsCalendar(PRN_PO_POVEZANA_OSOBA__DATUM_RODENJA);
	}

	public String getNazivIdentifikacijskeIsprave() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__NAZIV_IDENTIFIKACIJSKE_ISPRAVE);
	}

	public String getBrojIdentifikacijskeIsprave() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__BROJ_IDENTIFIKACIJSKE_ISPRAVE);
	}

	public String getTipVeze() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__TIP_VEZE);
	}

	public String getVrstaUnosa() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__VRSTA_UNOSA);
	}

	public String getDrzavljanstvo() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__DRZAVLJANSTVO);
	}

	public String getVrstaVlasnika() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__VRSTA_VLASNIKA);
	}

	public String getTipVlasnistva() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__TIP_VLASNISTVA);
	}

	public String getVrstaUtjecaja() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__VRSTA_UTJECAJA);
	}

	public String getClanObitelji() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__CLAN_OBITELJI);
	}

	public String getClanObiteljiNaziv() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__CLAN_OBITELJI_NAZIV);
	}

	public String getUcitano() {
		return getAsStringOrEmpty(PRN_PO_POVEZANA_OSOBA__UCITANO);
	}

	public void setIdPovezaneOsobe(String value) {
		set(PRN_PO_POVEZANA_OSOBA__ID_POVEZANE_OSOBE, value);
	}

	public void setIdUpitnika(String value) {
		set(PRN_PO_POVEZANA_OSOBA__ID_UPITNIKA, value);
	}

	public void setJmbgMb(String value) {
		set(PRN_PO_POVEZANA_OSOBA__JMBG_MB, value);
	}

	public void setJmbgMaticniBrojVeza(String value) {
		set(PRN_PO_POVEZANA_OSOBA__JMBG_MATICNI_BROJ_VEZA, value);
	}

	public void setOib(String value) {
		set(PRN_PO_POVEZANA_OSOBA__OIB, value);
	}

	public void setIme(String value) {
		set(PRN_PO_POVEZANA_OSOBA__IME, value);
	}

	public void setPrezime(String value) {
		set(PRN_PO_POVEZANA_OSOBA__PREZIME, value);
	}

	public void setPostotakUdjela(String value) {
		set(PRN_PO_POVEZANA_OSOBA__POSTOTAK_UDJELA, value);
	}

	public void setUlica(String value) {
		set(PRN_PO_POVEZANA_OSOBA__ULICA, value);
	}

	public void setPostanskiBroj(String value) {
		set(PRN_PO_POVEZANA_OSOBA__POSTANSKI_BROJ, value);
	}

	public void setMjesto(String value) {
		set(PRN_PO_POVEZANA_OSOBA__MJESTO, value);
	}

	public void setDrzava(String value) {
		set(PRN_PO_POVEZANA_OSOBA__DRZAVA, value);
	}

	public void setMjestoRodenja(String value) {
		set(PRN_PO_POVEZANA_OSOBA__MJESTO_RODENJA, value);
	}

	public void setPostanskiBrojRodenja(String value) {
		set(PRN_PO_POVEZANA_OSOBA__POSTANSKI_BROJ_RODENJA, value);
	}

	public void setDrzavaRodenja(String value) {
		set(PRN_PO_POVEZANA_OSOBA__DRZAVA_RODENJA, value);
	}

	public void setDatumRodenja(Calendar value) {
		setCalendarAsDateString(value, PRN_PO_POVEZANA_OSOBA__DATUM_RODENJA);
	}

	public void setNazivIdentifikacijskeIsprave(String value) {
		set(PRN_PO_POVEZANA_OSOBA__NAZIV_IDENTIFIKACIJSKE_ISPRAVE, value);
	}

	public void setBrojIdentifikacijskeIsprave(String value) {
		set(PRN_PO_POVEZANA_OSOBA__BROJ_IDENTIFIKACIJSKE_ISPRAVE, value);
	}

	public void setTipVeze(String value) {
		set(PRN_PO_POVEZANA_OSOBA__TIP_VEZE, value);
	}

	public void setVrstaUnosa(String value) {
		set(PRN_PO_POVEZANA_OSOBA__VRSTA_UNOSA, value);
	}

	public void setDrzavljanstvo(String value) {
		set(PRN_PO_POVEZANA_OSOBA__DRZAVLJANSTVO, value);
	}

	public void setVrstaVlasnika(String value) {
		set(PRN_PO_POVEZANA_OSOBA__VRSTA_VLASNIKA, value);
	}

	public void setTipVlasnistva(String value) {
		set(PRN_PO_POVEZANA_OSOBA__TIP_VLASNISTVA, value);
	}

	public void setVrstaUtjecaja(String value) {
		set(PRN_PO_POVEZANA_OSOBA__VRSTA_UTJECAJA, value);
	}

	public void setClanObitelji(String value) {
		set(PRN_PO_POVEZANA_OSOBA__CLAN_OBITELJI, value);
	}

	public void setClanObiteljiNaziv(String value) {
		set(PRN_PO_POVEZANA_OSOBA__CLAN_OBITELJI_NAZIV, value);
	}

	public void setUcitano(String value) {
		set(PRN_PO_POVEZANA_OSOBA__UCITANO, value);
	}

	/* Setters /> */
}