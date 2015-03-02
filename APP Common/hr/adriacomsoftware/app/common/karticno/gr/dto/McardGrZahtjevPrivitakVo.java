package hr.adriacomsoftware.app.common.karticno.gr.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class McardGrZahtjevPrivitakVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String MCARD_GR_ZAHTJEV_PRIVITAK__ID_PRIVITKA = "id_privitka";
	public static String MCARD_GR_ZAHTJEV_PRIVITAK__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String MCARD_GR_ZAHTJEV_PRIVITAK__DOKUMENT = "dokument";
	public static String MCARD_GR_ZAHTJEV_PRIVITAK__NAZIV_DOKUMENTA = "naziv_dokumenta";

	/* Attributes names /> */
	/* </ Constructors */
	public McardGrZahtjevPrivitakVo() {
		super();
	}

	public McardGrZahtjevPrivitakVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdPrivitka() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_PRIVITAK__ID_PRIVITKA);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_PRIVITAK__BROJ_ZAHTJEVA);
	}

	public String getDokument() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_PRIVITAK__DOKUMENT);
	}

	public String getNazivDokumenta() {
		return getAsStringOrEmpty(MCARD_GR_ZAHTJEV_PRIVITAK__NAZIV_DOKUMENTA);
	}

	public void setIdPrivitka(String value) {
		set(MCARD_GR_ZAHTJEV_PRIVITAK__ID_PRIVITKA, value);
	}

	public void setBrojZahtjeva(String value) {
		set(MCARD_GR_ZAHTJEV_PRIVITAK__BROJ_ZAHTJEVA, value);
	}

	public void setDokument(String value) {
		set(MCARD_GR_ZAHTJEV_PRIVITAK__DOKUMENT, value);
	}

	public void setNazivDokumenta(String value) {
		set(MCARD_GR_ZAHTJEV_PRIVITAK__NAZIV_DOKUMENTA, value);
	}

	/* Getters/Setters /> */
}