package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class OrPoslovnaFunkcijaVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	public static String OR_POSLOVNA_FUNKCIJA__ID_FUNKCIJE = "id_funkcije";
	public static String OR_POSLOVNA_FUNKCIJA__RAZINA = "razina";
	public static String OR_POSLOVNA_FUNKCIJA__KATEGORIJA = "kategorija";
	public static String OR_POSLOVNA_FUNKCIJA__NAZIV = "naziv";
	public static String OR_POSLOVNA_FUNKCIJA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public OrPoslovnaFunkcijaVo() {
		super();
	}

	public OrPoslovnaFunkcijaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdFunkcije() {
		return get(OR_POSLOVNA_FUNKCIJA__ID_FUNKCIJE);
	}

	public String getRazina() {
		return get(OR_POSLOVNA_FUNKCIJA__RAZINA);
	}

	public String getKategorija() {
		return get(OR_POSLOVNA_FUNKCIJA__KATEGORIJA);
	}

	public String getNaziv() {
		return get(OR_POSLOVNA_FUNKCIJA__NAZIV);
	}

	public String getOpis() {
		return get(OR_POSLOVNA_FUNKCIJA__OPIS);
	}

	public void setIdFunkcije(String value) {
		set(OR_POSLOVNA_FUNKCIJA__ID_FUNKCIJE, value);
	}

	public void setRazina(String value) {
		set(OR_POSLOVNA_FUNKCIJA__RAZINA, value);
	}

	public void setKategorija(String value) {
		set(OR_POSLOVNA_FUNKCIJA__KATEGORIJA, value);
	}

	public void setNaziv(String value) {
		set(OR_POSLOVNA_FUNKCIJA__NAZIV, value);
	}

	public void setOpis(String value) {
		set(OR_POSLOVNA_FUNKCIJA__OPIS, value);
	}

}