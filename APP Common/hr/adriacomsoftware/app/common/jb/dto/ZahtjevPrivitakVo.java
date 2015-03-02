package hr.adriacomsoftware.app.common.jb.dto;

import hr.as2.inf.common.data.AS2Record;

public class ZahtjevPrivitakVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String PRIVITAK__ID_PRIVITKA = "id_privitka";
	public static String PRIVITAK__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PRIVITAK__DOKUMENT = "dokument";
	public static String PRIVITAK__NAZIV_DOKUMENTA = "naziv_dokumenta";

	/* Attributes names /> */
	/* </ Constructors */
	public ZahtjevPrivitakVo() {
		super();
	}

	public ZahtjevPrivitakVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdPrivitka() {
		return getAsStringOrEmpty(PRIVITAK__ID_PRIVITKA);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(PRIVITAK__BROJ_ZAHTJEVA);
	}

	public String getDokument() {
		return getAsStringOrEmpty(PRIVITAK__DOKUMENT);
	}

	public String getNazivDokumenta() {
		return getAsStringOrEmpty(PRIVITAK__NAZIV_DOKUMENTA);
	}

	public void setIdPrivitka(String value) {
		set(PRIVITAK__ID_PRIVITKA, value);
	}

	public void setBrojZahtjeva(String value) {
		set(PRIVITAK__BROJ_ZAHTJEVA, value);
	}

	public void setDokument(String value) {
		set(PRIVITAK__DOKUMENT, value);
	}

	public void setNazivDokumenta(String value) {
		set(PRIVITAK__NAZIV_DOKUMENTA, value);
	}

	/* Getters/Setters /> */
}