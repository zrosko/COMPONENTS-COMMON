package hr.adriacomsoftware.app.common.helpdesk.dto;

import hr.as2.inf.common.data.AS2Record;

public class HelpDeskPozivPrivitakVo extends HelpDeskVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String HD_POZIV_PRIVITAK__ID_PRIVITKA = "id_privitka";
	public static String HD_POZIV_PRIVITAK__ID_POZIVA = "id_poziva";
	public static String HD_POZIV_PRIVITAK__DOKUMENT = "dokument";
	public static String HD_POZIV_PRIVITAK__NAZIV_DOKUMENTA = "naziv_dokumenta";

	/* Attributes names /> */
	/* </ Constructors */
	public HelpDeskPozivPrivitakVo() {
		super();
	}

	public HelpDeskPozivPrivitakVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdPrivitka() {
		return getAsStringOrEmpty(HD_POZIV_PRIVITAK__ID_PRIVITKA);
	}

	public String getIdPoziva() {
		return getAsStringOrEmpty(HD_POZIV_PRIVITAK__ID_POZIVA);
	}

	public String getDokument() {
		return getAsStringOrEmpty(HD_POZIV_PRIVITAK__DOKUMENT);
	}

	public String getNazivDokumenta() {
		return getAsStringOrEmpty(HD_POZIV_PRIVITAK__NAZIV_DOKUMENTA);
	}

	public void setIdPrivitka(String value) {
		set(HD_POZIV_PRIVITAK__ID_PRIVITKA, value);
	}

	public void setIdPoziva(String value) {
		set(HD_POZIV_PRIVITAK__ID_POZIVA, value);
	}

	public void setDokument(String value) {
		set(HD_POZIV_PRIVITAK__DOKUMENT, value);
	}

	public void setNazivDokumenta(String value) {
		set(HD_POZIV_PRIVITAK__NAZIV_DOKUMENTA, value);
	}

	/* Getters/Setters /> */
}