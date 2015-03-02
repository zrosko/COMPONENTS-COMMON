package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class OrKategorijaGubitkaVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_KATEGORIJA_GUBITKA__ID_KATEGORIJE_GUBITKA = "id_kategorije_gubitka";
	public static String OR_KATEGORIJA_GUBITKA__KATEGORIJA = "kategorija";
	public static String OR_KATEGORIJA_GUBITKA__NAZIV = "naziv";
	public static String OR_KATEGORIJA_GUBITKA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public OrKategorijaGubitkaVo() {
		super();
	}

	public OrKategorijaGubitkaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdKategorijeGubitka() {
		return get(OR_KATEGORIJA_GUBITKA__ID_KATEGORIJE_GUBITKA);
	}

	public String getKategorija() {
		return get(OR_KATEGORIJA_GUBITKA__KATEGORIJA);
	}

	public String getNaziv() {
		return get(OR_KATEGORIJA_GUBITKA__NAZIV);
	}

	public String getOpis() {
		return get(OR_KATEGORIJA_GUBITKA__OPIS);
	}

	public void setIdKategorijeGubitka(String value) {
		set(OR_KATEGORIJA_GUBITKA__ID_KATEGORIJE_GUBITKA, value);
	}

	public void setKategorija(String value) {
		set(OR_KATEGORIJA_GUBITKA__KATEGORIJA, value);
	}

	public void setNaziv(String value) {
		set(OR_KATEGORIJA_GUBITKA__NAZIV, value);
	}

	public void setOpis(String value) {
		set(OR_KATEGORIJA_GUBITKA__OPIS, value);
	}

}