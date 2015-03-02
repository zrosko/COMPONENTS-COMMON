package hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class MjesecneObvezeVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	/* </ Attribute names */
	/* Attributes names /> */
	/* </ Constructors */
	public MjesecneObvezeVo() {
		super();
	}

	public MjesecneObvezeVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getIdObveze() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__ID_OBVEZE);
	}

	public String getIdZahtjeva() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__ID_ZAHTJEVA);
	}

	public String getIdOsobe() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__ID_OSOBE);
	}

	public String getVrstaObveze() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__VRSTA_OBVEZE);
	}

	public String getBanka() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__BANKA);
	}

	public String getUkupniIznos() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__UKUPNI_IZNOS);
	}

	public String getRok() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__ROK);
	}

	public String getMjesecniIznos() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__MJESECNI_IZNOS);
	}

	public Calendar getDatumPocetka() {
		return getAsCalendar(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__DATUM_POCETKA);
	}

	public void setIdObveze(String value) {
		set(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__ID_OBVEZE, value);
	}

	public void setIdZahtjeva(String value) {
		set(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__ID_ZAHTJEVA, value);
	}

	public void setIdOsobe(String value) {
		set(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__ID_OSOBE, value);
	}

	public void setVrstaObveze(String value) {
		set(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__VRSTA_OBVEZE, value);
	}

	public void setBanka(String value) {
		set(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__BANKA, value);
	}

	public void setUkupniIznos(String value) {
		set(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__UKUPNI_IZNOS, value);
	}

	public void setRok(String value) {
		set(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__ROK, value);
	}

	public void setMjesecniIznos(String value) {
		set(JBDataDictionary.JB_GR_MJESECNE_OBVEZE__MJESECNI_IZNOS, value);
	}

	public void setDatumPocetka(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.JB_GR_MJESECNE_OBVEZE__DATUM_POCETKA);
	}

	/* Setters /> */
}