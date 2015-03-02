package hr.adriacomsoftware.app.common.gradani.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class OsobaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_OSOBA__IME_PREZIME = "ime_prezime";
	public static String BI_OSOBA__JMBG = "jmbg";
	public static String BI_OSOBA__OIB = "oib";

	/* Attributes names /> */
	/* </ Constructors */
	public OsobaVo() {
		super();
	}

	public OsobaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getImePrezime() {
		return getAsStringOrEmpty(BI_OSOBA__IME_PREZIME);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(BI_OSOBA__JMBG);
	}

	public String getOib() {
		return getAsStringOrEmpty(BI_OSOBA__OIB);
	}

	/* Getters /> */
	/* </ Setters */
	public void setImePrezime(String value) {
		set(BI_OSOBA__IME_PREZIME, value);
	}

	public void setJmbg(String value) {
		set(BI_OSOBA__JMBG, value);
	}

	public void setOib(String value) {
		set(BI_OSOBA__OIB, value);
	}
	/* Setters /> */
}