package hr.adriacomsoftware.app.common.jb.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.as2.inf.common.data.AS2Record;

public class RadnikVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	/* </ Attribute names */
	/* Attributes names /> */
	/* </ Constructors */
	public RadnikVo() {
		super();
	}

	public RadnikVo(AS2Record value) {
		super(value);
	}

	public String getIdRadnika() {
		return getAsStringOrEmpty(JBDataDictionary.BI_RADNIK__ID_RADNIKA);
	}

	public String getImePrezime() {
		StringBuffer sb = new StringBuffer();
		sb.append(get(JBDataDictionary.BI_RADNIK__IME));
		sb.append(" ");
		sb.append(get(JBDataDictionary.BI_RADNIK__PREZIME));
		return sb.toString();
	}

	public String getIme() {
		return getAsStringOrEmpty(JBDataDictionary.BI_RADNIK__IME);
	}

	public String getPrezime() {
		return getAsStringOrEmpty(JBDataDictionary.BI_RADNIK__PREZIME);
	}

	/* </ Setters */
	public void setIdRadnika(String value) {
		set(JBDataDictionary.BI_RADNIK__ID_RADNIKA, value);
	}

	public void setIme(String value) {
		set(JBDataDictionary.BI_RADNIK__IME, value);
	}

	public void setPrezime(String value) {
		set(JBDataDictionary.BI_RADNIK__PREZIME, value);
	}
	/* Setters /> */
}