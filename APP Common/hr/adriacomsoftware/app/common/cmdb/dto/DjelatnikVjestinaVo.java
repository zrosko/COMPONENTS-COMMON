package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class DjelatnikVjestinaVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_DJELATNIK_VJESTINA__ID_VJESTINE = "id_vjestine";
	public static String CMDB_DJELATNIK_VJESTINA__JMBG = "jmbg";
	public static String CMDB_DJELATNIK_VJESTINA__OCJENA = "ocjena";
	public static String CMDB_DJELATNIK_VJESTINA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public DjelatnikVjestinaVo() {
		super();
	}

	public DjelatnikVjestinaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdVjestine() {
		return getAsString(CMDB_DJELATNIK_VJESTINA__ID_VJESTINE);
	}

	public String getJmbg() {
		return getAsString(CMDB_DJELATNIK_VJESTINA__JMBG);
	}

	public String getOcjena() {
		return getAsString(CMDB_DJELATNIK_VJESTINA__OCJENA);
	}

	public String getOpis() {
		return getAsString(CMDB_DJELATNIK_VJESTINA__OPIS);
	}

	public void setIdVjestine(String value) {
		set(CMDB_DJELATNIK_VJESTINA__ID_VJESTINE, value);
	}

	public void setJmbg(String value) {
		set(CMDB_DJELATNIK_VJESTINA__JMBG, value);
	}

	public void setOcjena(String value) {
		set(CMDB_DJELATNIK_VJESTINA__OCJENA, value);
	}

	public void setOpis(String value) {
		set(CMDB_DJELATNIK_VJESTINA__OPIS, value);
	}

	/* Getters/Setters /> */
}