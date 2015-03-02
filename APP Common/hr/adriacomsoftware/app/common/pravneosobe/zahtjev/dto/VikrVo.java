package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

public class VikrVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;

	public VikrVo() {
		super();
	}

	public VikrVo(AS2Record value) {
		super(value);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_VIKR__BROJ_ZAHTJEVA);
	}

	public String getSifraValute() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_VIKR__SIFRA_VALUTE);
	}

	public String getIzvoznik() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_VIKR__IZVOZNIK);
	}

	public String getZastita() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_VIKR__ZASTITA);
	}

	public String getPostotakZastite() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_VIKR__POSTOTAK_ZASTITE);
	}

	public String getUkupnoObveze() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_VIKR__UKUPNO_OBVEZE);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_VIKR__NAPOMENA);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_VIKR__BROJ_ZAHTJEVA, value);
	}

	public void setSifraValute(String value) {
		set(ZAHDataDictionary.PO_ZAH_VIKR__SIFRA_VALUTE, value);
	}

	public void setIzvoznik(String value) {
		set(ZAHDataDictionary.PO_ZAH_VIKR__IZVOZNIK, value);
	}

	public void setZastita(String value) {
		set(ZAHDataDictionary.PO_ZAH_VIKR__ZASTITA, value);
	}

	public void setPostotakZastite(String value) {
		set(ZAHDataDictionary.PO_ZAH_VIKR__POSTOTAK_ZASTITE, value);
	}

	public void setUkupnoObveze(String value) {
		set(ZAHDataDictionary.PO_ZAH_VIKR__UKUPNO_OBVEZE, value);
	}

	public void setNapomena(String value) {
		set(ZAHDataDictionary.PO_ZAH_VIKR__NAPOMENA, value);
	}

}