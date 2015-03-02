package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class VjestinaVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_VJESTINA__ID_VJESTINE = "id_vjestine";
	public static String CMDB_VJESTINA__NAZIV = "naziv";
	public static String CMDB_VJESTINA__OPIS = "opis";
	public static String CMDB_VJESTINA__URL_MATERIJALI = "url_materijali";

	/* Attributes names /> */
	/* </ Constructors */
	public VjestinaVo() {
		super();
	}

	public VjestinaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdVjestine() {
		return getAsString(CMDB_VJESTINA__ID_VJESTINE);
	}

	public String getNaziv() {
		return getAsString(CMDB_VJESTINA__NAZIV);
	}

	public String getOpis() {
		return getAsString(CMDB_VJESTINA__OPIS);
	}

	public String getUrlMaterijali() {
		return getAsString(CMDB_VJESTINA__URL_MATERIJALI);
	}

	public void setIdVjestine(String value) {
		set(CMDB_VJESTINA__ID_VJESTINE, value);
	}

	public void setNaziv(String value) {
		set(CMDB_VJESTINA__NAZIV, value);
	}

	public void setOpis(String value) {
		set(CMDB_VJESTINA__OPIS, value);
	}

	public void setUrlMaterijali(String value) {
		set(CMDB_VJESTINA__URL_MATERIJALI, value);
	}

	/* Getters/Setters /> */
}