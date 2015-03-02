package hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class PrihodiClanovaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	/* </ Attribute names */
	/* Attributes names /> */
	/* </ Constructors */
	public PrihodiClanovaVo() {
		super();
	}

	public PrihodiClanovaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getIdPrihoda() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__ID_PRIHODA);
	}

	public String getIdZahtjeva() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__ID_ZAHTJEVA);
	}

	public String getIdOsobe() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__ID_OSOBE);
	}

	public String getIme() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__IME);
	}

	public String getPrezime() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__PREZIME);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__JMBG);
	}

	public String getSrodstvo() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__SRODSTVO);
	}

	public String getIznosPrihoda() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__IZNOS_PRIHODA);
	}

	public void setIdPrihoda(String value) {
		set(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__ID_PRIHODA, value);
	}

	public void setIdZahtjeva(String value) {
		set(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__ID_ZAHTJEVA, value);
	}

	public void setIdOsobe(String value) {
		set(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__ID_OSOBE, value);
	}

	public void setIme(String value) {
		set(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__IME, value);
	}

	public void setPrezime(String value) {
		set(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__PREZIME, value);
	}

	public void setJmbg(String value) {
		set(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__JMBG, value);
	}

	public void setSrodstvo(String value) {
		set(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__SRODSTVO, value);
	}

	public void setIznosPrihoda(String value) {
		set(JBDataDictionary.JB_GR_PRIHODI_CLANOVA__IZNOS_PRIHODA, value);
	}
	/* Setters /> */
}