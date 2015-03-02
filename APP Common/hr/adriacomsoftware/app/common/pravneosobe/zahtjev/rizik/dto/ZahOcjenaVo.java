package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.rizik.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class ZahOcjenaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PO_ZAH_OCJENA__ID_OCJENE = "id_ocjene";
	public static String PO_ZAH_OCJENA__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_OCJENA__DATUM_OCJENE = "datum_ocjene";
	public static String PO_ZAH_OCJENA__POKAZATELJ = "pokazatelj";
	public static String PO_ZAH_OCJENA__NAZIV = "naziv";
	public static String PO_ZAH_OCJENA__PONDER = "ponder";
	public static String PO_ZAH_OCJENA__VRSTA = "vrsta";
	public static String PO_ZAH_OCJENA__NAZIV_VRSTE = "naziv_vrste";
	public static String PO_ZAH_OCJENA__PONDER_VRSTE = "ponder_vrste";
	public static String PO_ZAH_OCJENA__OCJENA = "ocjena";
	public static String PO_ZAH_OCJENA__VRIJEDNOST_POKAZATELJA = "vrijednost_pokazatelja";
	// dodatak
	public static String PO_ZAH_OCJENA__NAZIV_KLIJENTA = "naziv_klijenta";
	public static String PO_ZAH_OCJENA__REJTING = "rejting";
	public static String PO_ZAH_OCJENA__PRETHODNI_REJTING = "prethodni_rejting";
	public static String PO_ZAH_OCJENA__SVEUKUPNA_OCJENA = "sveukupna_ocjena";
	public static String PO_ZAH_OCJENA__PRETHODNA_SVEUKUPNA_OCJENA = "prethodna_sveukupna_ocjena";
	public static String PO_ZAH_OCJENA__PONDERIRANA_OCJENA = "ponderirana_ocjena";
	public static String PO_ZAH_OCJENA__UKUPNO_OCJENA = "ukupno_ocjena";
	public static String PO_ZAH_OCJENA__UKUPNO_PONDER = "ukupno_ponder";
	public static String PO_ZAH_OCJENA__UKUPNO_PONDERIRANA_OCJENA = "ukupno_ponderirana_ocjena";
	public static String KR_SKORING__TIP_ENTITETA = "tip_entiteta";
	public static String KR_SKORING__VRSTA_KLIJENTA = "vrsta_klijenta";

	public ZahOcjenaVo() {
		super();
	}

	public ZahOcjenaVo(AS2Record value) {
		super(value);
	}

	public String getTipEntiteta() {
		return getAsString(KR_SKORING__TIP_ENTITETA);
	}

	public String getVrstaKlijenta() {
		return getAsString(KR_SKORING__VRSTA_KLIJENTA);
	}

	public String getUkupnoPonderiranaOcjena() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__UKUPNO_PONDERIRANA_OCJENA);
	}

	public String getUkupnoPonder() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__UKUPNO_PONDER);
	}

	public String getUkupnoOcjena() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__UKUPNO_OCJENA);
	}

	public String getPonderiranaOcjena() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__PONDERIRANA_OCJENA);
	}

	public String getNazivKlijenta() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__NAZIV_KLIJENTA);
	}

	public String getSveukupnaOcjena() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__SVEUKUPNA_OCJENA);
	}

	public String getPrethodnaSveukupnaOcjena() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__PRETHODNA_SVEUKUPNA_OCJENA);
	}

	public String getRejting() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__REJTING);
	}

	public String getPrethodniRejting() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__PRETHODNI_REJTING);
	}

	public String getIdOcjene() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__ID_OCJENE);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__BROJ_ZAHTJEVA);
	}

	public Calendar getDatumOcjene() {
		return getAsCalendar(PO_ZAH_OCJENA__DATUM_OCJENE);
	}

	public String getPokazatelj() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__POKAZATELJ);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__NAZIV);
	}

	public String getPonder() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__PONDER);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__VRSTA);
	}

	public String getNazivVrste() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__NAZIV_VRSTE);
	}

	public String getPonderVrste() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__PONDER_VRSTE);
	}

	public String getOcjena() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__OCJENA);
	}

	public String getVrijednostPokazatelja() {
		return getAsStringOrEmpty(PO_ZAH_OCJENA__VRIJEDNOST_POKAZATELJA);
	}

	public void setIdOcjene(String value) {
		set(PO_ZAH_OCJENA__ID_OCJENE, value);
	}

	public void setBrojZahtjeva(String value) {
		set(PO_ZAH_OCJENA__BROJ_ZAHTJEVA, value);
	}

	public void setDatumOcjene(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_OCJENA__DATUM_OCJENE);
	}

	public void setPokazatelj(String value) {
		set(PO_ZAH_OCJENA__POKAZATELJ, value);
	}

	public void setNaziv(String value) {
		set(PO_ZAH_OCJENA__NAZIV, value);
	}

	public void setPonder(String value) {
		set(PO_ZAH_OCJENA__PONDER, value);
	}

	public void setVrsta(String value) {
		set(PO_ZAH_OCJENA__VRSTA, value);
	}

	public void setNazivVrste(String value) {
		set(PO_ZAH_OCJENA__NAZIV_VRSTE, value);
	}

	public void setPonderVrste(String value) {
		set(PO_ZAH_OCJENA__PONDER_VRSTE, value);
	}

	public void setOcjena(String value) {
		set(PO_ZAH_OCJENA__OCJENA, value);
	}

	public void setVrijednostPokazatelja(String value) {
		set(PO_ZAH_OCJENA__VRIJEDNOST_POKAZATELJA, value);
	}

	public void setRejting(String value) {
		set(PO_ZAH_OCJENA__REJTING, value);
	}

	public void setPrethodniRejting(String value) {
		set(PO_ZAH_OCJENA__PRETHODNI_REJTING, value);
	}

	public void setSveukupnaOcjena(String value) {
		set(PO_ZAH_OCJENA__SVEUKUPNA_OCJENA, value);
	}

	public void setPrethodnaSveukupnaOcjena(String value) {
		set(PO_ZAH_OCJENA__PRETHODNA_SVEUKUPNA_OCJENA, value);
	}

	public void setNazivKlijenta(String value) {
		set(PO_ZAH_OCJENA__NAZIV_KLIJENTA, value);
	}

	public void setPonderiranaOcjena(String value) {
		set(PO_ZAH_OCJENA__PONDERIRANA_OCJENA, value);
	}

	public void setUkupnoOcjena(String value) {
		set(PO_ZAH_OCJENA__UKUPNO_OCJENA, value);
	}

	public void setUkupnoPonder(String value) {
		set(PO_ZAH_OCJENA__UKUPNO_PONDER, value);
	}

	public void setUkupnoPonderiranaOcjena(String value) {
		set(PO_ZAH_OCJENA__UKUPNO_PONDERIRANA_OCJENA, value);
	}

	public void setTipEntiteta(String value) {
		set(KR_SKORING__TIP_ENTITETA, value);
	}

	public void setVrstaKlijenta(String value) {
		set(KR_SKORING__VRSTA_KLIJENTA, value);
	}
}