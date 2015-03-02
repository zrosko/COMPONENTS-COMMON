package hr.adriacomsoftware.app.common.karticno.gr.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class McardGrPokazateljVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String MCARD_GR_POKAZATELJ__POKAZATELJ = "pokazatelj";
	public static String MCARD_GR_POKAZATELJ__VRSTA = "vrsta";
	public static String MCARD_GR_POKAZATELJ__NAZIV = "naziv";
	public static String MCARD_GR_POKAZATELJ__PONDER = "ponder";
	public static String MCARD_GR_POKAZATELJ__PONDER_NOVI_KLIJENT = "ponder_novi_klijent";
	public static String MCARD_GR_POKAZATELJ__APLIKACIJA = "aplikacija";
	public static String MCARD_GR_POKAZATELJ__VRIJEDI_OD = "vrijedi_od";
	public static String MCARD_GR_POKAZATELJ__VRIJEDI_DO = "vrijedi_do";
	public static String MCARD_GR_POKAZATELJ__ISPRAVNO = "ispravno";

	public McardGrPokazateljVo() {
		super();
	}

	public McardGrPokazateljVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getPokazatelj() {
		return getAsStringOrEmpty(MCARD_GR_POKAZATELJ__POKAZATELJ);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(MCARD_GR_POKAZATELJ__VRSTA);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(MCARD_GR_POKAZATELJ__NAZIV);
	}

	public String getPonder() {
		return getAsStringOrEmpty(MCARD_GR_POKAZATELJ__PONDER);
	}

	public String getPonderNoviKlijent() {
		return getAsStringOrEmpty(MCARD_GR_POKAZATELJ__PONDER_NOVI_KLIJENT);
	}

	public String getAplikacija() {
		return getAsStringOrEmpty(MCARD_GR_POKAZATELJ__APLIKACIJA);
	}

	public Calendar getVrijediOd() {
		return getAsCalendar(MCARD_GR_POKAZATELJ__VRIJEDI_OD);
	}

	public Calendar getVrijediDo() {
		return getAsCalendar(MCARD_GR_POKAZATELJ__VRIJEDI_DO);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(MCARD_GR_POKAZATELJ__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setPokazatelj(String value) {
		set(MCARD_GR_POKAZATELJ__POKAZATELJ, value);
	}

	public void setVrsta(String value) {
		set(MCARD_GR_POKAZATELJ__VRSTA, value);
	}

	public void setNaziv(String value) {
		set(MCARD_GR_POKAZATELJ__NAZIV, value);
	}

	public void setPonder(String value) {
		set(MCARD_GR_POKAZATELJ__PONDER, value);
	}

	public void setPonderNoviKlijent(String value) {
		set(MCARD_GR_POKAZATELJ__PONDER_NOVI_KLIJENT, value);
	}

	public void setAplikacija(String value) {
		set(MCARD_GR_POKAZATELJ__APLIKACIJA, value);
	}

	public void setVrijediOd(Calendar value) {
		setCalendarAsDateString(value, MCARD_GR_POKAZATELJ__VRIJEDI_OD);
	}

	public void setVrijediDo(Calendar value) {
		setCalendarAsDateString(value, MCARD_GR_POKAZATELJ__VRIJEDI_DO);
	}

	public void setIspravno(String value) {
		set(MCARD_GR_POKAZATELJ__ISPRAVNO, value);
	}
}
