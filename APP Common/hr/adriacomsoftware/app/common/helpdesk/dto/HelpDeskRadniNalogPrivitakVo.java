package hr.adriacomsoftware.app.common.helpdesk.dto;

import hr.as2.inf.common.data.AS2Record;

public class HelpDeskRadniNalogPrivitakVo extends HelpDeskVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String HD_RADNI_NALOG_PRIVITAK__ID_PRIVITKA = "id_privitka";
	public static String HD_RADNI_NALOG_PRIVITAK__ID_RADNOG_NALOGA = "id_radnog_naloga";
	public static String HD_RADNI_NALOG_PRIVITAK__DOKUMENT = "dokument";
	public static String HD_RADNI_NALOG_PRIVITAK__NAZIV_DOKUMENTA = "naziv_dokumenta";

	/* Attributes names /> */
	/* </ Constructors */
	public HelpDeskRadniNalogPrivitakVo() {
		super();
	}

	public HelpDeskRadniNalogPrivitakVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdPrivitka() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_PRIVITAK__ID_PRIVITKA);
	}

	public String getIdRadnogNaloga() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_PRIVITAK__ID_RADNOG_NALOGA);
	}

	public String getDokument() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_PRIVITAK__DOKUMENT);
	}

	public String getNazivDokumenta() {
		return getAsStringOrEmpty(HD_RADNI_NALOG_PRIVITAK__NAZIV_DOKUMENTA);
	}

	public void setIdPrivitka(String value) {
		set(HD_RADNI_NALOG_PRIVITAK__ID_PRIVITKA, value);
	}

	public void setIdRadnogNaloga(String value) {
		set(HD_RADNI_NALOG_PRIVITAK__ID_RADNOG_NALOGA, value);
	}

	public void setDokument(String value) {
		set(HD_RADNI_NALOG_PRIVITAK__DOKUMENT, value);
	}

	public void setNazivDokumenta(String value) {
		set(HD_RADNI_NALOG_PRIVITAK__NAZIV_DOKUMENTA, value);
	}

	/* Getters/Setters /> */
}