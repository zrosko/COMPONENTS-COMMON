package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

public class OrUzrokDogadajaVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_UZROK_DOGADAJA__ID_UZROKA = "id_uzroka";
	public static String OR_UZROK_DOGADAJA__RAZINA = "razina";
	public static String OR_UZROK_DOGADAJA__UZROK = "uzrok";
	public static String OR_UZROK_DOGADAJA__NAZIV = "naziv";
	public static String OR_UZROK_DOGADAJA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public OrUzrokDogadajaVo() {
		super();
	}

	public OrUzrokDogadajaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdUzroka() {
		return getAsStringOrEmpty(OR_UZROK_DOGADAJA__ID_UZROKA);
	}

	public String getRazina() {
		return getAsStringOrEmpty(OR_UZROK_DOGADAJA__RAZINA);
	}

	public String getUzrok() {
		return getAsStringOrEmpty(OR_UZROK_DOGADAJA__UZROK);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(OR_UZROK_DOGADAJA__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(OR_UZROK_DOGADAJA__OPIS);
	}

	public void setIdUzroka(String value) {
		set(OR_UZROK_DOGADAJA__ID_UZROKA, value);
	}

	public void setRazina(String value) {
		set(OR_UZROK_DOGADAJA__RAZINA, value);
	}

	public void setUzrok(String value) {
		set(OR_UZROK_DOGADAJA__UZROK, value);
	}

	public void setNaziv(String value) {
		set(OR_UZROK_DOGADAJA__NAZIV, value);
	}

	public void setOpis(String value) {
		set(OR_UZROK_DOGADAJA__OPIS, value);
	}

}