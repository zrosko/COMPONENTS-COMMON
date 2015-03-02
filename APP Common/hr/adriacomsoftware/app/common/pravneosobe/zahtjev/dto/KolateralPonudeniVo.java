package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KolateralPonudeniVo extends BankarskiProizvodVo {
	private static final long serialVersionUID = 1L;

	public KolateralPonudeniVo() {
		super();
	}

	public KolateralPonudeniVo(AS2Record value) {
		super(value);
	}

	// POCETAK UKUPNO
	public void setUcitano(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__UCITANO, value);
	}

	public String getUkupnoTeretiHrk() {
		// return
		// getAmountFormated(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_TERETI_HRK);
		return get(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_TERETI_HRK);
	}

	public String getUkupnoProcjenjenaVrijednostHrk() {
		// return
		// getAmountFormated(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_PROCJENJENA_VRIJEDNOST_HRK);
		return get(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_PROCJENJENA_VRIJEDNOST_HRK);
	}

	public String getOmjerTrazeniIznosKolaterali() {
		// return
		// getAmountFormated(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__OMJER_TRAZENI_IZNOS_KOLATERALI);
		return get(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__OMJER_TRAZENI_IZNOS_KOLATERALI);
	}

	public void setUkupnoTeretiHrk(String value) {
		// setReplaceComma(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_TERETI_HRK,
		// value);
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_TERETI_HRK,
				value);
	}

	public void setUkupnoProcjenjenaVrijednostHrk(String value) {
		// setReplaceComma(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_PROCJENJENA_VRIJEDNOST_HRK,
		// value);
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_PROCJENJENA_VRIJEDNOST_HRK,
				value);
	}

	public void setOmjerTrazeniIznosKolaterali(String value) {
		// setReplaceComma(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__OMJER_TRAZENI_IZNOS_KOLATERALI,
		// value);
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__OMJER_TRAZENI_IZNOS_KOLATERALI,
				value);
	}

	// KRAJ UKUPNO setOmjerTrazeniIznosKolaterali
	public String getIdKolaterala() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__ID_KOLATERALA);
	}

	public String getIdKolateralaVeza() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__ID_KOLATERALA_VEZA);
	}

	public String getIdBankarskogProizvoda() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__ID_BANKARSKOG_PROIZVODA);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__BROJ_ZAHTJEVA);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__VRSTA);
	}

	public String getLokacija() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__LOKACIJA);
	}

	public String getPovrsinaObjekta() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__POVRSINA_OBJEKTA);
	}

	public String getPovrsinaZemljista() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__POVRSINA_ZEMLJISTA);
	}

	public String getVlasnik() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__VLASNIK);
	}

	public String getProcjenjenaVrijednost() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__PROCJENJENA_VRIJEDNOST);
	}

	public String getValutaProcjene() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__VALUTA_PROCJENE);
	}

	public Calendar getDatumProcjene() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__DATUM_PROCJENE);
	}

	public String getProcjenitelj() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__PROCJENITELJ);
	}

	public String getTereti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__TERETI);
	}

	public String getValutaTereti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__VALUTA_TERETI);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__NAPOMENA);
	}

	public void setIdKolaterala(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__ID_KOLATERALA, value);
	}

	public void setIdKolateralaVeza(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__ID_KOLATERALA_VEZA,
				value);
	}

	public void setIdBankarskogProizvoda(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__ID_BANKARSKOG_PROIZVODA,
				value);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__BROJ_ZAHTJEVA, value);
	}

	public void setVrsta(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__VRSTA, value);
	}

	public void setLokacija(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__LOKACIJA, value);
	}

	public void setPovrsinaObjekta(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__POVRSINA_OBJEKTA,
				value);
	}

	public void setPovrsinaZemljista(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__POVRSINA_ZEMLJISTA,
				value);
	}

	public void setVlasnik(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__VLASNIK, value);
	}

	public void setProcjenjenaVrijednost(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__PROCJENJENA_VRIJEDNOST,
				value);
	}

	public void setValutaProcjene(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__VALUTA_PROCJENE, value);
	}

	public void setDatumProcjene(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__DATUM_PROCJENE);
	}

	public void setProcjenitelj(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__PROCJENITELJ, value);
	}

	public void setTereti(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__TERETI, value);
	}

	public void setValutaTereti(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__VALUTA_TERETI, value);
	}

	public void setNapomena(String value) {
		set(ZAHDataDictionary.PO_ZAH_KOLATERAL_PONUDENI__NAPOMENA, value);
	}
}