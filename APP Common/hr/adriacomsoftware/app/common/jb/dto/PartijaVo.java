package hr.adriacomsoftware.app.common.jb.dto;

import hr.as2.inf.common.data.AS2Record;

public class PartijaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_PARTIJA__BROJ_PARTIJE = "broj_partije";
	public static String BI_PARTIJA__BROJ_PARTIJE_ = "broj_partije_";

	/* Attributes names /> */
	/* </ Constructors */

	public PartijaVo() {
		super();
	}

	public PartijaVo(AS2Record value) {
		super(value);
	}

	public String getBrojPartije() {
		return get("broj_partije");
	}

	public void setBrojPartije(String value) {
		set("broj_partije", value);
	}

	public String getMaticniBroj() {
		return get("maticni_broj");
	}

	public void setMaticniBroj(String value) {
		set("maticni_broj", value);
	}
}