package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class IzobrazbaVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_IZOBRAZBA__ID_IZOBRAZBE = "id_izobrazbe";
	public static String CMDB_IZOBRAZBA__NAZIV = "naziv";
	public static String CMDB_IZOBRAZBA__DATUM = "datum";
	public static String CMDB_IZOBRAZBA__BROJ_DANA = "broj_dana";
	public static String CMDB_IZOBRAZBA__URL_MATERIJALI = "url_materijali";
	public static String CMDB_IZOBRAZBA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public IzobrazbaVo() {
		super();
	}

	public IzobrazbaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdIzobrazbe() {
		return getAsString(CMDB_IZOBRAZBA__ID_IZOBRAZBE);
	}

	public String getNaziv() {
		return getAsString(CMDB_IZOBRAZBA__NAZIV);
	}

	public Calendar getDatum() {
		return getAsCalendar(CMDB_IZOBRAZBA__DATUM);
	}

	public String getBrojDana() {
		return getAsString(CMDB_IZOBRAZBA__BROJ_DANA);
	}

	public String getUrlMaterijali() {
		return getAsString(CMDB_IZOBRAZBA__URL_MATERIJALI);
	}

	public String getOpis() {
		return getAsString(CMDB_IZOBRAZBA__OPIS);
	}

	public void setIdIzobrazbe(String value) {
		set(CMDB_IZOBRAZBA__ID_IZOBRAZBE, value);
	}

	public void setNaziv(String value) {
		set(CMDB_IZOBRAZBA__NAZIV, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, CMDB_IZOBRAZBA__DATUM);
	}

	public void setBrojDana(String value) {
		set(CMDB_IZOBRAZBA__BROJ_DANA, value);
	}

	public void setUrlMaterijali(String value) {
		set(CMDB_IZOBRAZBA__URL_MATERIJALI, value);
	}

	public void setOpis(String value) {
		set(CMDB_IZOBRAZBA__OPIS, value);
	}

	/* Getters/Setters /> */
}