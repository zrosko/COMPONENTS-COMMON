package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

public class IsmsRanjivostVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_RANJIVOST__ID_RANJIVOSTI = "id_ranjivosti";
	public static String ISMS_RANJIVOST__AKTIVNO = "aktivno";
	public static String ISMS_RANJIVOST__VRSTA_RANJIVOSTI = "vrsta_ranjivosti";
	public static String ISMS_RANJIVOST__NAZIV = "naziv";
	public static String ISMS_RANJIVOST__OPIS = "opis";
	public static String ISMS_RANJIVOST__POSLJEDICA = "posljedica";
	public static String ISMS_RANJIVOST__PRIMJER_PRIJETNJE = "primjer_prijetnje";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsRanjivostVo() {
		super();
	}

	public IsmsRanjivostVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdRanjivosti() {
		return getAsStringOrEmpty(ISMS_RANJIVOST__ID_RANJIVOSTI);
	}

	public String getAktivno() {
		return getAsStringOrEmpty(ISMS_RANJIVOST__AKTIVNO);
	}

	public String getVrstaRanjivosti() {
		return getAsStringOrEmpty(ISMS_RANJIVOST__VRSTA_RANJIVOSTI);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS_RANJIVOST__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(ISMS_RANJIVOST__OPIS);
	}

	public String getPosljedica() {
		return getAsStringOrEmpty(ISMS_RANJIVOST__POSLJEDICA);
	}

	public String getPrimjerPrijetnje() {
		return getAsStringOrEmpty(ISMS_RANJIVOST__PRIMJER_PRIJETNJE);
	}

	public void setIdRanjivosti(String value) {
		set(ISMS_RANJIVOST__ID_RANJIVOSTI, value);
	}

	public void setAktivno(String value) {
		set(ISMS_RANJIVOST__AKTIVNO, value);
	}

	public void setVrstaRanjivosti(String value) {
		set(ISMS_RANJIVOST__VRSTA_RANJIVOSTI, value);
	}

	public void setNaziv(String value) {
		set(ISMS_RANJIVOST__NAZIV, value);
	}

	public void setOpis(String value) {
		set(ISMS_RANJIVOST__OPIS, value);
	}

	public void setPosljedica(String value) {
		set(ISMS_RANJIVOST__POSLJEDICA, value);
	}

	public void setPrimjerPrijetnje(String value) {
		set(ISMS_RANJIVOST__PRIMJER_PRIJETNJE, value);
	}
	/* Getters/Setters /> */
}