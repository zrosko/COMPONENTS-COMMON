package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class OrKategorijaDogadajaVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_KATEGORIJA_DOGADAJA__ID_KATEGORIJE = "id_kategorije";
	public static String OR_KATEGORIJA_DOGADAJA__RAZINA = "razina";
	public static String OR_KATEGORIJA_DOGADAJA__KATEGORIJA = "kategorija";
	public static String OR_KATEGORIJA_DOGADAJA__NAZIV = "naziv";
	public static String OR_KATEGORIJA_DOGADAJA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public OrKategorijaDogadajaVo() {
		super();
	}

	public OrKategorijaDogadajaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdKategorije() {
		return getAsStringOrEmpty(OR_KATEGORIJA_DOGADAJA__ID_KATEGORIJE);
	}

	public String getRazina() {
		return getAsStringOrEmpty(OR_KATEGORIJA_DOGADAJA__RAZINA);
	}

	public String getKategorija() {
		return getAsStringOrEmpty(OR_KATEGORIJA_DOGADAJA__KATEGORIJA);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(OR_KATEGORIJA_DOGADAJA__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(OR_KATEGORIJA_DOGADAJA__OPIS);
	}

	public void setIdKategorije(String value) {
		set(OR_KATEGORIJA_DOGADAJA__ID_KATEGORIJE, value);
	}

	public void setRazina(String value) {
		set(OR_KATEGORIJA_DOGADAJA__RAZINA, value);
	}

	public void setKategorija(String value) {
		set(OR_KATEGORIJA_DOGADAJA__KATEGORIJA, value);
	}

	public void setNaziv(String value) {
		set(OR_KATEGORIJA_DOGADAJA__NAZIV, value);
	}

	public void setOpis(String value) {
		set(OR_KATEGORIJA_DOGADAJA__OPIS, value);
	}
}