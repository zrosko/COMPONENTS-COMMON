package hr.adriacomsoftware.app.common.karticno.gr.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class McardGrZahtjevOcjenaVo extends OsnovniVo {// J2EEValueObject {
	private static final long serialVersionUID = 1L;
	public static String MCARD_GR_ZAHTJEV_OCJENA__ID_OCJENE = "id_ocjene";
	public static String MCARD_GR_ZAHTJEV_OCJENA__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String MCARD_GR_ZAHTJEV_OCJENA__DATUM_OCJENE = "datum_ocjene";
	public static String MCARD_GR_ZAHTJEV_OCJENA__POKAZATELJ = "pokazatelj";
	public static String MCARD_GR_ZAHTJEV_OCJENA__NAZIV = "naziv";
	public static String MCARD_GR_ZAHTJEV_OCJENA__PONDER = "ponder";
	public static String MCARD_GR_ZAHTJEV_OCJENA__VRSTA = "vrsta";
	public static String MCARD_GR_ZAHTJEV_OCJENA__NAZIV_VRSTE = "naziv_vrste";
	public static String MCARD_GR_ZAHTJEV_OCJENA__PONDER_VRSTE = "ponder_vrste";
	public static String MCARD_GR_ZAHTJEV_OCJENA__OCJENA = "ocjena";
	public static String MCARD_GR_ZAHTJEV_OCJENA__VRIJEDNOST_POKAZATELJA = "vrijednost_pokazatelja";
	// dodatak
	public static String MCARD_GR_ZAHTJEV_OCJENA__REJTING = "rejting";
	public static String MCARD_GR_ZAHTJEV_OCJENA__SVEUKUPNA_OCJENA = "sveukupna_ocjena";
	public static String MCARD_GR_ZAHTJEV_OCJENA__PONDERIRANA_OCJENA = "ponderirana_ocjena";
	public static String MCARD_GR_ZAHTJEV_OCJENA__UKUPNO_OCJENA = "ukupno_ocjena";
	public static String MCARD_GR_ZAHTJEV_OCJENA__UKUPNO_PONDER = "ukupno_ponder";
	public static String MCARD_GR_ZAHTJEV_OCJENA__UKUPNO_PONDERIRANA_OCJENA = "ukupno_ponderirana_ocjena";
	public static String MCARD_GR_ZAHTJEV_OCJENA__TIP_ENTITETA = "tip_entiteta";
	public static String MCARD_GR_ZAHTJEV_OCJENA__VRSTA_KLIJENTA = "vrsta_klijenta";
	public static String MCARD_GR_ZAHTJEV_OCJENA__IME_PREZIME = "ime_prezime";

	public McardGrZahtjevOcjenaVo() {
		super();
	}

	public McardGrZahtjevOcjenaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdOcjene() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__ID_OCJENE);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__BROJ_ZAHTJEVA);
	}

	public Calendar getDatumOcjene() {
		return getAsCalendar(MCARD_GR_ZAHTJEV_OCJENA__DATUM_OCJENE);
	}

	public String getPokazatelj() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__POKAZATELJ);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__NAZIV);
	}

	public String getPonder() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__PONDER);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__VRSTA);
	}

	public String getNazivVrste() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__NAZIV_VRSTE);
	}

	public String getPonderVrste() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__PONDER_VRSTE);
	}

	public String getOcjena() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__OCJENA);
	}

	public String getVrijednostPokazatelja() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__VRIJEDNOST_POKAZATELJA);
	}

	// dodatak ispod
	public String getRejting() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__REJTING);
	}

	public String getSveukupnaOcjena() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__SVEUKUPNA_OCJENA);
	}

	public String getUkupnoOcjena() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__UKUPNO_OCJENA);
	}

	public String getPonderiranaOcjena() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__PONDERIRANA_OCJENA);
	}

	public String getUkupnoPonderiranaOcjena() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__UKUPNO_PONDERIRANA_OCJENA);
	}

	public String getUkupnoPonder() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__UKUPNO_PONDER);
	}

	public String getImePrezime() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_OCJENA__IME_PREZIME);
	}

	public String getTipEntiteta() {
		return getAsString(MCARD_GR_ZAHTJEV_OCJENA__TIP_ENTITETA);
	}

	public String getVrstaKlijenta() {
		return getAsString(MCARD_GR_ZAHTJEV_OCJENA__VRSTA_KLIJENTA);
	}

	/************* SETTERS ************/
	public void setRejting(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__REJTING, value);
	}

	public void setSveukupnaOcjena(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__SVEUKUPNA_OCJENA, value);
	}

	public void setUkupnoOcjena(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__UKUPNO_OCJENA, value);
	}

	public void setPonderiranaOcjena(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__PONDERIRANA_OCJENA, value);
	}

	public void setUkupnoPonderiranaOcjena(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__UKUPNO_PONDERIRANA_OCJENA, value);
	}

	public void setUkupnoPonder(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__UKUPNO_PONDER, value);
	}

	public void setImePrezime(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__IME_PREZIME, value);
	}

	public void setTipEntiteta(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__TIP_ENTITETA, value);
	}

	public void setVrstaKlijenta(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__VRSTA_KLIJENTA, value);
	}

	// dodatak iznad
	public void setIdOcjene(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__ID_OCJENE, value);
	}

	public void setBrojZahtjeva(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__BROJ_ZAHTJEVA, value);
	}

	public void setDatumOcjene(Calendar value) {
		setCalendarAsDateString(value, MCARD_GR_ZAHTJEV_OCJENA__DATUM_OCJENE);
	}

	public void setPokazatelj(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__POKAZATELJ, value);
	}

	public void setNaziv(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__NAZIV, value);
	}

	public void setPonder(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__PONDER, value);
	}

	public void setVrsta(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__VRSTA, value);
	}

	public void setNazivVrste(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__NAZIV_VRSTE, value);
	}

	public void setPonderVrste(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__PONDER_VRSTE, value);
	}

	public void setOcjena(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__OCJENA, value);
	}

	public void setVrijednostPokazatelja(String value) {
		set(MCARD_GR_ZAHTJEV_OCJENA__VRIJEDNOST_POKAZATELJA, value);
	}
}
