package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class ZaduzenostVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;

	public ZaduzenostVo() {
		super();
	}

	public ZaduzenostVo(AS2Record value) {
		super(value);
	}

	// POCETAK UKUPNO
	public String getValutnaKlauzula() {
		return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST__VALUTNA_KLAUZULA);
	}

	public String getUkupnoZaduzenost() {
		return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST__UKUPNO_ZADUZENOST);
	}

	public String getUkupnoMjesecneRate() {
		return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST__UKUPNO_MJESECNE_RATE);
	}

	public String getUkupnoSaldo() {
		return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST__UKUPNO_SALDO);
	}

	public String getUkupnoKolaterali() {
		return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST__UKUPNO_KOLATERALI);
	}

	// SET
	public void setValutnaKlauzula(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__VALUTNA_KLAUZULA, value);
	}

	public void setUkupnoZaduzenost(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__UKUPNO_ZADUZENOST, value);
	}

	public void setUkupnoMjesecneRate(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__UKUPNO_MJESECNE_RATE, value);
	}

	public void setUkupnoSaldo(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__UKUPNO_SALDO, value);
	}

	public void setUkupnoKolaterali(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__UKUPNO_KOLATERALI, value);
	}

	// KRAJ
	public String getIdZaduzenosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__ID_ZADUZENOSTI);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__BROJ_ZAHTJEVA);
	}

	public String getVrstaDuga() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__VRSTA_DUGA);
	}

	public String getNazivKreditora() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__NAZIV_KREDITORA);
	}

	public String getOdobreniIznos() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__ODOBRENI_IZNOS);
	}

	public Calendar getDatumOdobrenja() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZADUZENOST__DATUM_ODOBRENJA);
	}

	public Calendar getDatumAnalize() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZADUZENOST__DATUM_ANALIZE);
	}

	public String getRokOtplate() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__ROK_OTPLATE);
	}

	public String getPocek() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__POCEK);
	}

	public String getKamatnaStopa() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__KAMATNA_STOPA);
	}

	public String getMjesecnaRata() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__MJESECNA_RATA);
	}

	public String getSaldo() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__SALDO);
	}

	public String getOpisKolaterala() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__OPIS_KOLATERALA);
	}

	public String getVrijednostKolaterala() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST__VRIJEDNOST_KOLATERALA);
	}

	public void setIdZaduzenosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__ID_ZADUZENOSTI, value);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__BROJ_ZAHTJEVA, value);
	}

	public void setVrstaDuga(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__VRSTA_DUGA, value);
	}

	public void setNazivKreditora(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__NAZIV_KREDITORA, value);
	}

	public void setOdobreniIznos(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__ODOBRENI_IZNOS, value);
	}

	public void setDatumOdobrenja(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_ZADUZENOST__DATUM_ODOBRENJA);
	}

	public void setDatumAnalize(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_ZADUZENOST__DATUM_ANALIZE);
	}

	public void setRokOtplate(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__ROK_OTPLATE, value);
	}

	public void setPocek(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__POCEK, value);
	}

	public void setKamatnaStopa(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__KAMATNA_STOPA, value);
	}

	public void setMjesecnaRata(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__MJESECNA_RATA, value);
	}

	public void setSaldo(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__SALDO, value);
	}

	public void setOpisKolaterala(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__OPIS_KOLATERALA, value);
	}

	public void setVrijednostKolaterala(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZADUZENOST__VRIJEDNOST_KOLATERALA, value);
	}
}