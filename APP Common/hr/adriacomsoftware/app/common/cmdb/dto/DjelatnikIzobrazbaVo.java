package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class DjelatnikIzobrazbaVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_DJELATNIK_IZOBRAZBA__ID_IZOBRAZBE = "id_izobrazbe";
	public static String CMDB_DJELATNIK_IZOBRAZBA__JMBG = "jmbg";
	public static String CMDB_DJELATNIK_IZOBRAZBA__OCJENA = "ocjena";
	public static String CMDB_DJELATNIK_IZOBRAZBA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public DjelatnikIzobrazbaVo() {
		super();
	}

	public DjelatnikIzobrazbaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdIzobrazbe() {
		return getAsString(CMDB_DJELATNIK_IZOBRAZBA__ID_IZOBRAZBE);
	}

	public String getJmbg() {
		return getAsString(CMDB_DJELATNIK_IZOBRAZBA__JMBG);
	}

	public String getOcjena() {
		return getAsString(CMDB_DJELATNIK_IZOBRAZBA__OCJENA);
	}

	public String getOpis() {
		return getAsString(CMDB_DJELATNIK_IZOBRAZBA__OPIS);
	}

	public void setIdIzobrazbe(String value) {
		set(CMDB_DJELATNIK_IZOBRAZBA__ID_IZOBRAZBE, value);
	}

	public void setJmbg(String value) {
		set(CMDB_DJELATNIK_IZOBRAZBA__JMBG, value);
	}

	public void setOcjena(String value) {
		set(CMDB_DJELATNIK_IZOBRAZBA__OCJENA, value);
	}

	public void setOpis(String value) {
		set(CMDB_DJELATNIK_IZOBRAZBA__OPIS, value);
	}

	/* Getters/Setters /> */
}