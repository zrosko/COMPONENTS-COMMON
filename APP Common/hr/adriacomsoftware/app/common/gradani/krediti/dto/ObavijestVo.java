package hr.adriacomsoftware.app.common.gradani.krediti.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class ObavijestVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	public ObavijestVo() {
		super();
	}

	public ObavijestVo(AS2Record value) {
		super(value);
	}

	public String getVrstaObavijesti() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OBAVIJEST__VRSTA_OBAVIJESTI);
	}

	public void setVrstaObavijesti(String value) {
		set(JBDataDictionary.BI_OBAVIJEST__VRSTA_OBAVIJESTI, value);
	}
}