package hr.adriacomsoftware.app.common.pravneosobe.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KreditniProgramVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	/* </ Attribute names */
	/* Attributes names /> */
	/* </ Constructors */
	public KreditniProgramVo() {
		super();
	}

	public KreditniProgramVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getSifraGrupe() {
		return getAsStringOrEmpty(JBDataDictionary.JB_KREDITNI_PROGRAM__SIFRA_GRUPE);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(JBDataDictionary.JB_KREDITNI_PROGRAM__BROJ_PARTIJE);
	}

	public String getIdKreditnogPrograma() {
		return getAsStringOrEmpty(JBDataDictionary.JB_KREDITNI_PROGRAM__ID_KREDITNOG_PROGRAMA);
	}

	public Calendar getDatumUnosa() {
		return getAsCalendar(JBDataDictionary.JB_KREDITNI_PROGRAM__DATUM_UNOSA);
	}// za izvještaj

	public Calendar getDatumStanja() {
		return getAsCalendar(JBDataDictionary.JB_KREDITNI_PROGRAM__DATUM_STANJA);
	}

	/* Getters /> */
	/* </ Setters */
	public void setBrojPartije(String value) {
		set(JBDataDictionary.JB_KREDITNI_PROGRAM__BROJ_PARTIJE, value);
	}

	public void setSifraGrupe(String value) {
		set(JBDataDictionary.JB_KREDITNI_PROGRAM__SIFRA_GRUPE, value);
	}

	public void setIdKreditnogPrograma(String value) {
		set(
				JBDataDictionary.JB_KREDITNI_PROGRAM__ID_KREDITNOG_PROGRAMA,
				value);
	}

	public void setDatumUnosa(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.JB_KREDITNI_PROGRAM__DATUM_UNOSA);
	}

	public void setDatumStanja(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.JB_KREDITNI_PROGRAM__DATUM_STANJA);
	}

	/* Setters /> */
	// kamatna stopa
	public void setKamatnaStopa(String value) {
		value = value.replace(',', '.');
		set(JBDataDictionary.JB_KREDITNI_PROGRAM__KAMATNA_STOPA, value);
	}

	public String getKamatnaStopa() {
		String value = getAsStringOrEmpty(JBDataDictionary.JB_KREDITNI_PROGRAM__KAMATNA_STOPA);
		value = value.replace('.', ',');
		return value;
	}
}