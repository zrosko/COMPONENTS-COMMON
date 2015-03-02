package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class CmdbImovinaVezaVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_IMOVINA_VEZA__ID = "id";
	public static String CMDB_IMOVINA_VEZA__ID_IMOVINE = "id_imovine";
	public static String CMDB_IMOVINA_VEZA__ID_IMOVNE_VEZA = "id_imovne_veza";
	public static String CMDB_IMOVINA_VEZA__DATUM = "datum";

	/* </ Constructors */
	public CmdbImovinaVezaVo() {
		super();
	}

	public CmdbImovinaVezaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getId() {
		return getAsString(CMDB_IMOVINA_VEZA__ID);
	}

	public String getIdImovine() {
		return getAsString(CMDB_IMOVINA_VEZA__ID_IMOVINE);
	}

	public String getIdImovneVeza() {
		return getAsString(CMDB_IMOVINA_VEZA__ID_IMOVNE_VEZA);
	}

	public Calendar getDatum() {
		return getAsCalendar(CMDB_IMOVINA_VEZA__DATUM);
	}

	public void setId(String value) {
		set(CMDB_IMOVINA_VEZA__ID, value);
	}

	public void setIdImovine(String value) {
		set(CMDB_IMOVINA_VEZA__ID_IMOVINE, value);
	}

	public void setIdImovneVeza(String value) {
		set(CMDB_IMOVINA_VEZA__ID_IMOVNE_VEZA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, CMDB_IMOVINA_VEZA__DATUM);
	}
	/* Getters/Setters /> */
}