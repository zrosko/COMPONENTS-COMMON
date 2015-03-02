package hr.adriacomsoftware.app.common.pranjenovca.gr.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class PrnPrivitakVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String PRN_GR_PRIVITAK__ID_PRIVITKA = "id_privitka";
	public static String PRN_GR_PRIVITAK__ID_UPITNIKA = "id_upitnika";
	public static String PRN_GR_PRIVITAK__DOKUMENT = "dokument";
	public static String PRN_GR_PRIVITAK__NAZIV_DOKUMENTA = "naziv_dokumenta";

	/* Attributes names /> */
	/* </ Constructors */
	public PrnPrivitakVo() {
		super();
	}

	public PrnPrivitakVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */

	/* </ Getters */
	public String getIdPrivitka() {
		return getAsStringOrEmpty(PRN_GR_PRIVITAK__ID_PRIVITKA);
	}

	public String getIdUpitnika() {
		return getAsStringOrEmpty(PRN_GR_PRIVITAK__ID_UPITNIKA);
	}

	public String getDokument() {
		return getAsStringOrEmpty(PRN_GR_PRIVITAK__DOKUMENT);
	}

	public String getNazivDokumenta() {
		return getAsStringOrEmpty(PRN_GR_PRIVITAK__NAZIV_DOKUMENTA);
	}

	public void setIdPrivitka(String value) {
		set(PRN_GR_PRIVITAK__ID_PRIVITKA, value);
	}

	public void setIdUpitika(String value) {
		set(PRN_GR_PRIVITAK__ID_UPITNIKA, value);
	}

	public void setDokument(String value) {
		set(PRN_GR_PRIVITAK__DOKUMENT, value);
	}

	public void setNazivDokumenta(String value) {
		set(PRN_GR_PRIVITAK__NAZIV_DOKUMENTA, value);
	}

	/* Setters /> */
}