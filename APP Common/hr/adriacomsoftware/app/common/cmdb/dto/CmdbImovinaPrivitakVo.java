package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class CmdbImovinaPrivitakVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_IMOVINA_PRIVITAK__ID_PRIVITKA = "id_privitka";
	public static String CMDB_IMOVINA_PRIVITAK__DOKUMENT = "dokument";
	public static String CMDB_IMOVINA_PRIVITAK__NAZIV_DOKUMENTA = "naziv_dokumenta";
	public static String CMDB_IMOVINA_PRIVITAK__ID_IMOVINE = "id_imovine";

	/* </ Constructors */
	public CmdbImovinaPrivitakVo() {
		super();
	}

	public CmdbImovinaPrivitakVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdPrivitka() {
		return getAsString(CMDB_IMOVINA_PRIVITAK__ID_PRIVITKA);
	}

	public String getDokument() {
		return getAsString(CMDB_IMOVINA_PRIVITAK__DOKUMENT);
	}

	public String getNazivDokumenta() {
		return getAsString(CMDB_IMOVINA_PRIVITAK__NAZIV_DOKUMENTA);
	}

	public String getIdImovine() {
		return getAsString(CMDB_IMOVINA_PRIVITAK__ID_IMOVINE);
	}

	public void setIdPrivitka(String value) {
		set(CMDB_IMOVINA_PRIVITAK__ID_PRIVITKA, value);
	}

	public void setDokument(String value) {
		set(CMDB_IMOVINA_PRIVITAK__DOKUMENT, value);
	}

	public void setNazivDokumenta(String value) {
		set(CMDB_IMOVINA_PRIVITAK__NAZIV_DOKUMENTA, value);
	}

	public void setIdImovine(String value) {
		set(CMDB_IMOVINA_PRIVITAK__ID_IMOVINE, value);
	}
	/* Getters/Setters /> */
}