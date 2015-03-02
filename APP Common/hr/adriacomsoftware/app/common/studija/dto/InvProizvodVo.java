package hr.adriacomsoftware.app.common.studija.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 *
 */
public class InvProizvodVo extends InvVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ID_PROIZVODA = "id_proizvoda";
	public static String BROJ = "broj";
	public static String NAZIV = "naziv";
	public static String DATUM = "datum";
	public static String IZNOS = "jedinicna_cijena";
	public static String JEDINICA_MJERE = "jedinica_mjere";
	public static String OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public InvProizvodVo() {
		super();
	}

	public InvProizvodVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdProizvoda() {
		return get(ID_PROIZVODA);
	}

	public String getBroj() {
		return get(BROJ);
	}

	public String getNaziv() {
		return get(NAZIV);
	}

	public String getDatum() {
		return get(DATUM);
	}

	public String getIznos() {
		return get(IZNOS);
	}

	public String getJedinicaMjere() {
		return get(JEDINICA_MJERE);
	}

	public String getOpis() {
		return get(OPIS);
	}

	// public String getDatum() {
	// return getDateAsStringOrCurrenDate(DATUM);
	// }
	public void setIdProizvoda(String value) {
		set(ID_PROIZVODA, value);
	}

	public void setBroj(String value) {
		set(BROJ, value);
	}

	public void setNaziv(String value) {
		set(NAZIV, value);
	}

	public void setDatum(String value) {
		set(DATUM, value);
	}

	public void setIznos(String value) {
		set(IZNOS, value);
	}

	public void setJedinicaMjere(String value) {
		set(JEDINICA_MJERE, value);
	}

	public void setOpis(String value) {
		set(OPIS, value);
	}

}