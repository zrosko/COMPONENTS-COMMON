package hr.adriacomsoftware.app.common.rizik.rejting.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class SkoringVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String KR_SKORING__ID_SKORINGA = "id_skoringa";
	public static String KR_SKORING__MATICNI_BROJ = "maticni_broj";
	public static String KR_SKORING__OIB = "oib";
	public static String KR_SKORING__VBDI = "vbdi";
	public static String KR_SKORING__DATUM = "datum";
	public static String KR_SKORING__MJESEC = "mjesec";
	public static String KR_SKORING__GODINA = "godina";
	public static String KR_SKORING__GODINA_IZVJESCA = "godina_izvjesca";
	public static String KR_SKORING__POKAZATELJ = "pokazatelj";
	public static String KR_SKORING__VRSTA = "vrsta";
	public static String KR_SKORING__OCJENA = "ocjena";
	public static String KR_SKORING__VRIJEDNOST_POKAZATELJA = "vrijednost_pokazatelja";
	public static String KR_SKORING__ID_ENTITETA = "id_entiteta";
	// dodatak
	public static String KR_SKORING__NAZIV_VRSTE = "naziv_vrste";
	public static String KR_SKORING__PONDER = "ponder";
	public static String KR_SKORING__NAZIV_KLIJENTA = "naziv_klijenta";
	public static String KR_SKORING__REJTING = "rejting";
	public static String KR_SKORING__PRETHODNI_REJTING = "prethodni_rejting";
	public static String KR_SKORING__SVEUKUPNA_OCJENA = "sveukupna_ocjena";
	public static String KR_SKORING__PRETHODNA_SVEUKUPNA_OCJENA = "prethodna_sveukupna_ocjena";
	public static String KR_SKORING__PONDERIRANA_OCJENA = "ponderirana_ocjena";
	public static String KR_SKORING__UKUPNO_OCJENA = "ukupno_ocjena";
	public static String KR_SKORING__UKUPNO_PONDER = "ukupno_ponder";
	public static String KR_SKORING__UKUPNO_PONDERIRANA_OCJENA = "ukupno_ponderirana_ocjena";
	public static String KR_SKORING__TIP_ENTITETA = "tip_entiteta";
	public static String KR_SKORING__VRSTA_KLIJENTA = "vrsta_klijenta";
	public static String KR_SKORING__KREDITNA_SPOSOBNOST = "kreditna_sposobnost";
	// zr. 27.9.2012.
	public static String KR_SKORING__DATUM_IZMJENE = "datum_izmjene";
	public static String KR_SKORING__IZMJENA_KROZ_APLIKACIJU = "izmjena_kroz_aplikaciju";
	public static String KR_SKORING__PROSJEK = "prosjek";
	// zr. 21.6.2013.
	public static String KR_SKORING__DATUM_OBRADE = "datum_obrade";
	public static String KR_SKORING__OSVJEZI_OBRADU = "osvjezi_obradu";

	public SkoringVo() {
		super();
	}

	public String getProsjek() {
		return getAsString(KR_SKORING__PROSJEK);
	}

	public Calendar getDatumIzmjene() {
		return getAsCalendar(KR_SKORING__DATUM_IZMJENE);
	}

	public String getIzmjenaKrozAplikaciju() {
		return getAsString(KR_SKORING__IZMJENA_KROZ_APLIKACIJU);
	}

	public String getTipEntiteta() {
		return getAsString(KR_SKORING__TIP_ENTITETA);
	}

	public String getVrstaKlijenta() {
		return getAsString(KR_SKORING__VRSTA_KLIJENTA);
	}

	public String getNazivVrste() {
		return getAsStringOrEmpty(KR_SKORING__NAZIV_VRSTE);
	}

	public String getUkupnoPonderiranaOcjena() {
		return getAsStringOrEmpty(KR_SKORING__UKUPNO_PONDERIRANA_OCJENA);
	}

	public String getUkupnoPonder() {
		return getAsStringOrEmpty(KR_SKORING__UKUPNO_PONDER);
	}

	public String getUkupnoOcjena() {
		return getAsStringOrEmpty(KR_SKORING__UKUPNO_OCJENA);
	}

	public String getPonderiranaOcjena() {
		return getAsStringOrEmpty(KR_SKORING__PONDERIRANA_OCJENA);
	}

	public String getNazivKlijenta() {
		return getAsStringOrEmpty(KR_SKORING__NAZIV_KLIJENTA);
	}

	public String getSveukupnaOcjena() {
		return getAsStringOrEmpty(KR_SKORING__SVEUKUPNA_OCJENA);
	}

	public String getPrethodnaSveukupnaOcjena() {
		return getAsStringOrEmpty(KR_SKORING__PRETHODNA_SVEUKUPNA_OCJENA);
	}

	public String getRejting() {
		return getAsStringOrEmpty(KR_SKORING__REJTING);
	}

	public String getPrethodniRejting() {
		return getAsStringOrEmpty(KR_SKORING__PRETHODNI_REJTING);
	}

	public String getOsvjeziObradu() {
		return getAsStringOrEmpty(KR_SKORING__OSVJEZI_OBRADU);
	}

	public Calendar getDatumObrade() {
		return getAsCalendar(KR_SKORING__DATUM_OBRADE);
	}

	// iznad dodatak
	public SkoringVo(AS2Record value) {
		super(value);
	}

	public String getIdSkoringa() {
		return getAsStringOrEmpty(KR_SKORING__ID_SKORINGA);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(KR_SKORING__MATICNI_BROJ);
	}

	public String getOib() {
		return getAsStringOrEmpty(KR_SKORING__OIB);
	}

	public String getVbdi() {
		return getAsStringOrEmpty(KR_SKORING__VBDI);
	}

	public Calendar getDatum() {
		return getAsCalendar(KR_SKORING__DATUM);
	}

	public String getMjesec() {
		return getAsStringOrEmpty(KR_SKORING__MJESEC);
	}

	public String getGodina() {
		return getAsStringOrEmpty(KR_SKORING__GODINA);
	}

	public String getGodinaIzvjesca() {
		return getAsStringOrEmpty(KR_SKORING__GODINA_IZVJESCA);
	}

	public String getPokazatelj() {
		return getAsStringOrEmpty(KR_SKORING__POKAZATELJ);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(KR_SKORING__VRSTA);
	}

	public String getOcjena() {
		return getAsStringOrEmpty(KR_SKORING__OCJENA);
	}

	public String getVrijednostPokazatelja() {
		return getAsStringOrEmpty(KR_SKORING__VRIJEDNOST_POKAZATELJA);
	}

	public String getKreditnaSposobnost() {
		return getAsStringOrEmpty(KR_SKORING__KREDITNA_SPOSOBNOST);
	}

	public String getIdEntiteta() {
		return getAsStringOrEmpty(KR_SKORING__ID_ENTITETA);
	}

	public void setIdSkoringa(String value) {
		set(KR_SKORING__ID_SKORINGA, value);
	}

	public void setMaticniBroj(String value) {
		set(KR_SKORING__MATICNI_BROJ, value);
	}

	public void setOib(String value) {
		set(KR_SKORING__OIB, value);
	}

	public void setVbdi(String value) {
		set(KR_SKORING__VBDI, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, KR_SKORING__DATUM);
	}

	public void setMjesec(String value) {
		set(KR_SKORING__MJESEC, value);
	}

	public void setGodina(String value) {
		set(KR_SKORING__GODINA, value);
	}

	public void setGodinaIzvjesca(String value) {
		set(KR_SKORING__GODINA_IZVJESCA, value);
	}

	public void setPokazatelj(String value) {
		set(KR_SKORING__POKAZATELJ, value);
	}

	public void setVrsta(String value) {
		set(KR_SKORING__VRSTA, value);
	}

	public void setOcjena(String value) {
		set(KR_SKORING__OCJENA, value);
	}

	public void setVrijednostPokazatelja(String value) {
		set(KR_SKORING__VRIJEDNOST_POKAZATELJA, value);
	}

	public void setIdEntiteta(String value) {
		set(KR_SKORING__ID_ENTITETA, value);
	}

	// ispod dodatak
	public void setProsjek(String value) {
		set(KR_SKORING__PROSJEK, value);
	}

	public void setDatumIzmjene(Calendar value) {
		setCalendarAsDateString(value, KR_SKORING__DATUM_IZMJENE);
	}

	public void setIzmjenaKrozAplikaciju(String value) {
		set(KR_SKORING__IZMJENA_KROZ_APLIKACIJU, value);
	}

	public void setRejting(String value) {
		set(KR_SKORING__REJTING, value);
	}

	public void setPrethodniRejting(String value) {
		set(KR_SKORING__PRETHODNI_REJTING, value);
	}

	public void setSveukupnaOcjena(String value) {
		set(KR_SKORING__SVEUKUPNA_OCJENA, value);
	}

	public void setPrethodnaSveukupnaOcjena(String value) {
		set(KR_SKORING__PRETHODNA_SVEUKUPNA_OCJENA, value);
	}

	public void setNazivKlijenta(String value) {
		set(KR_SKORING__NAZIV_KLIJENTA, value);
	}

	public void setPonderiranaOcjena(String value) {
		set(KR_SKORING__PONDERIRANA_OCJENA, value);
	}

	public void setUkupnoOcjena(String value) {
		set(KR_SKORING__UKUPNO_OCJENA, value);
	}

	public void setUkupnoPonder(String value) {
		set(KR_SKORING__UKUPNO_PONDER, value);
	}

	public void setUkupnoPonderiranaOcjena(String value) {
		set(KR_SKORING__UKUPNO_PONDERIRANA_OCJENA, value);
	}

	public void setNazivVrste(String value) {
		set(KR_SKORING__NAZIV_VRSTE, value);
	}

	public void setTipEntiteta(String value) {
		set(KR_SKORING__TIP_ENTITETA, value);
	}

	public void setVrstaKlijenta(String value) {
		set(KR_SKORING__VRSTA_KLIJENTA, value);
	}

	public void setKreditnaSposobnost(String value) {
		set(KR_SKORING__KREDITNA_SPOSOBNOST, value);
	}

	public void setDatumObrade(Calendar value) {
		setCalendarAsDateString(value, KR_SKORING__DATUM_OBRADE);
	}

	public void setOsvjeziObradu(String value) {
		set(KR_SKORING__OSVJEZI_OBRADU, value);
	}
}