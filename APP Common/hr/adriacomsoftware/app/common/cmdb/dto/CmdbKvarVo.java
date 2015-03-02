package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class CmdbKvarVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_KVAR__ID_KVARA = "id_kvara";
	public static String CMDB_KVAR__ID_IMOVINE = "id_imovine";
	public static String CMDB_KVAR__DATUM_PRIJAVE = "datum_prijave";
	public static String CMDB_KVAR__OSOBA_PRIJAVE = "osoba_prijave";
	public static String CMDB_KVAR__OPIS_KVARA = "opis_kvara";
	public static String CMDB_KVAR__ID_POZVIA = "id_pozvia";

	/* </ Constructors */
	public CmdbKvarVo() {
		super();
	}

	public CmdbKvarVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdKvara() {
		return getAsString(CMDB_KVAR__ID_KVARA);
	}

	public String getIdImovine() {
		return getAsString(CMDB_KVAR__ID_IMOVINE);
	}

	public Calendar getDatumPrijave() {
		return getAsCalendar(CMDB_KVAR__DATUM_PRIJAVE);
	}

	public String getOsobaPrijave() {
		return getAsString(CMDB_KVAR__OSOBA_PRIJAVE);
	}

	public String getOpisKvara() {
		return getAsString(CMDB_KVAR__OPIS_KVARA);
	}

	public String getIdPozvia() {
		return getAsString(CMDB_KVAR__ID_POZVIA);
	}

	public void setIdKvara(String value) {
		set(CMDB_KVAR__ID_KVARA, value);
	}

	public void setIdImovine(String value) {
		set(CMDB_KVAR__ID_IMOVINE, value);
	}

	public void setDatumPrijave(Calendar value) {
		setCalendarAsDateString(value, CMDB_KVAR__DATUM_PRIJAVE);
	}

	public void setOsobaPrijave(String value) {
		set(CMDB_KVAR__OSOBA_PRIJAVE, value);
	}

	public void setOpisKvara(String value) {
		set(CMDB_KVAR__OPIS_KVARA, value);
	}

	public void setIdPozvia(String value) {
		set(CMDB_KVAR__ID_POZVIA, value);
	}

	/* Getters/Setters /> */
}