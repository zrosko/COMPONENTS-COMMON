package hr.adriacomsoftware.app.common.jb.dto;

import hr.as2.inf.common.data.AS2Record;

public class RacunPartijeVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	/* </ Attribute names */
	/* Attributes names /> */
	/* </ Constructors */
	public RacunPartijeVo() {
		super();
	}

	public RacunPartijeVo(AS2Record value) {
		super(value);
	}

	public String getBrojRacuna() {
		return get("broj_racuna");
	}

	public void setBrojRacuna(String value) {
		set("broj_racuna", value);
	}

	public String getBrojPartije() {
		return get("broj_partije");
	}

	public void setBrojPartije(String value) {
		set("broj_partije", value);
	}
}