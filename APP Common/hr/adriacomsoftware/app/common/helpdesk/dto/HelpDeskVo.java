package hr.adriacomsoftware.app.common.helpdesk.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class HelpDeskVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String HD_POZIV__ID_POZIVA = "id_poziva";
	public static String HD_POZIV__STATUS = "status";
	public static String HD_POZIV__PRIORITET = "prioritet";
	public static String HD_POZIV__PRIORITET_IT = "prioritet_it";
	public final static String INDIKATOR_ONE = "1";
	public final static String INDIKATOR_ZERO = "0";
	public final static String ISPRAVNO = "ispravno";
	// status
	public static String HD_STATUS_OTVOREN = "1";
	public static String HD_STATUS_UTIJEKU = "2";
	public static String HD_STATUS_RIJESEN = "3";
	public static String HD_STATUS_PONOVNO_OTVOREN = "4";
	public static String HD_STATUS_ZATVOREN = "5";

	/* Attributes names /> */
	/* </ Constructors */
	public HelpDeskVo() {
		super();
	}

	public HelpDeskVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public void setIspravnoNE() {
		set(ISPRAVNO, INDIKATOR_ZERO);
	}

	public void setIspravnoDA() {
		set(ISPRAVNO, INDIKATOR_ONE);
	}

	/* </ Getters */
	public String getIdPoziva() {
		return getAsStringOrEmpty(HD_POZIV__ID_POZIVA);
	}

	public String getStatus() {
		return getAsStringOrEmpty(HD_POZIV__STATUS);
	}

	public String getPrioritet() {
		return getAsStringOrEmpty(HD_POZIV__PRIORITET);
	}

	public String getPrioritetIt() {
		return getAsStringOrEmpty(HD_POZIV__PRIORITET_IT);
	}

	/* Getters /> */
	/* </ Setters */
	public void setIdPoziva(String value) {
		set(HD_POZIV__ID_POZIVA, value);
	}

	public void setStatus(String value) {
		set(HD_POZIV__STATUS, value);
	}

	public void setPrioritet(String value) {
		set(HD_POZIV__PRIORITET, value);
	}

	public void setPrioritetIt(String value) {
		set(HD_POZIV__PRIORITET_IT, value);
	}
	/* Setters /> */
}