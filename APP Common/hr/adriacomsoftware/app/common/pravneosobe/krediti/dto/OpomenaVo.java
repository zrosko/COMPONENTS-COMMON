package hr.adriacomsoftware.app.common.pravneosobe.krediti.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.BaznaOpomenaVo;
import hr.as2.inf.common.data.AS2Record;

public class OpomenaVo extends BaznaOpomenaVo {
	private static final long serialVersionUID = 1L;
	public static String BI_PO_VRSTA_OPOMENE_A = "A";
	public static String BI_PO_VRSTA_OPOMENE_B = "B";
	public static String BI_PO_VRSTA_OPOMENE_C = "C";
	public static String BI_PO_VRSTA_OPOMENE_O = "O";

	public OpomenaVo() {
		super();
	}

	public OpomenaVo(AS2Record value) {
		super(value);
	}

	public String getVrstaOpomene() {
		String value = getAsStringOrEmpty(JBDataDictionary.BI_OPOMENE__VRSTA_OPOMENE);
		// if(value.equals("A,B,C"))
		// value = "*";??
		return value;
	}

	public void setVrstaOpomene(String value) {
		// if(value.equals(BI_PO_VRSTA_OPOMENE_SVE))
		// value = "A,B,C";
		set(JBDataDictionary.BI_OPOMENE__VRSTA_OPOMENE, value);
	}
}