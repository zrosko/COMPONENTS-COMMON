package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class CmdbImovinaDodatakVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_IMOVINA_DODATAK__ID_DODATKA = "id_dodatka";
	public static String CMDB_IMOVINA_DODATAK__ID_IMOVINE = "id_imovine";
	public static String CMDB_IMOVINA_DODATAK__NAZIV = "naziv";
	public static String CMDB_IMOVINA_DODATAK__DATUM_PORIJEKLA = "datum_porijekla";
	public static String CMDB_IMOVINA_DODATAK__STATUS = "status";

	/* </ Constructors */
	public CmdbImovinaDodatakVo() {
		super();
	}

	public CmdbImovinaDodatakVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdDodatka() {
		return getAsString(CMDB_IMOVINA_DODATAK__ID_DODATKA);
	}

	public String getIdImovine() {
		return getAsString(CMDB_IMOVINA_DODATAK__ID_IMOVINE);
	}

	public String getNaziv() {
		return getAsString(CMDB_IMOVINA_DODATAK__NAZIV);
	}

	public Calendar getDatumPorijekla() {
		return getAsCalendar(CMDB_IMOVINA_DODATAK__DATUM_PORIJEKLA);
	}

	public String getStatus() {
		return getAsString(CMDB_IMOVINA_DODATAK__STATUS);
	}

	public void setIdDodatka(String value) {
		set(CMDB_IMOVINA_DODATAK__ID_DODATKA, value);
	}

	public void setIdImovine(String value) {
		set(CMDB_IMOVINA_DODATAK__ID_IMOVINE, value);
	}

	public void setNaziv(String value) {
		set(CMDB_IMOVINA_DODATAK__NAZIV, value);
	}

	public void setDatumPorijekla(Calendar value) {
		setCalendarAsDateString(value, CMDB_IMOVINA_DODATAK__DATUM_PORIJEKLA);
	}

	public void setStatus(String value) {
		set(CMDB_IMOVINA_DODATAK__STATUS, value);
	}

	/* Getters/Setters /> */
}