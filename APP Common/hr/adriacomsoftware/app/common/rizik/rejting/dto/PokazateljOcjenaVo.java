package hr.adriacomsoftware.app.common.rizik.rejting.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class PokazateljOcjenaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String KR_POKAZATELJ_OCJENA__POKAZATELJ_OCJENA = "pokazatelj_ocjena";
	public static String KR_POKAZATELJ_OCJENA__POKAZATELJ = "pokazatelj";
	public static String KR_POKAZATELJ_OCJENA__OCJENA = "ocjena";
	public static String KR_POKAZATELJ_OCJENA__VRIJEDNOST_OD = "vrijednost_od";
	public static String KR_POKAZATELJ_OCJENA__VRIJEDNOST_DO = "vrijednost_do";
	public static String KR_POKAZATELJ_OCJENA__VRIJEDI_OD = "vrijedi_od";
	public static String KR_POKAZATELJ_OCJENA__VRIJEDI_DO = "vrijedi_do";

	public PokazateljOcjenaVo() {
		super();
	}

	public PokazateljOcjenaVo(AS2Record value) {
		super(value);
	}

	public String getPokazateljOcjena() {
		return getAsStringOrEmpty(KR_POKAZATELJ_OCJENA__POKAZATELJ_OCJENA);
	}

	public String getPokazatelj() {
		return getAsStringOrEmpty(KR_POKAZATELJ_OCJENA__POKAZATELJ);
	}

	public String getOcjena() {
		return getAsStringOrEmpty(KR_POKAZATELJ_OCJENA__OCJENA);
	}

	public String getVrijednostOd() {
		return getAsStringOrEmpty(KR_POKAZATELJ_OCJENA__VRIJEDNOST_OD);
	}

	public String getVrijednostDo() {
		return getAsStringOrEmpty(KR_POKAZATELJ_OCJENA__VRIJEDNOST_DO);
	}

	public Calendar getVrijediOd() {
		return getAsCalendar(KR_POKAZATELJ_OCJENA__VRIJEDI_OD);
	}

	public Calendar getVrijediDo() {
		return getAsCalendar(KR_POKAZATELJ_OCJENA__VRIJEDI_OD);
	}

	// setteri
	public void setPokazateljOcjena(String value) {
		set(KR_POKAZATELJ_OCJENA__POKAZATELJ_OCJENA, value);
	}

	public void setPokazatelj(String value) {
		set(KR_POKAZATELJ_OCJENA__POKAZATELJ, value);
	}

	public void setOcjena(String value) {
		set(KR_POKAZATELJ_OCJENA__OCJENA, value);
	}

	public void setVrijednostOd(String value) {
		set(KR_POKAZATELJ_OCJENA__VRIJEDNOST_OD, value);
	}

	public void setVrijednostDo(String value) {
		set(KR_POKAZATELJ_OCJENA__VRIJEDNOST_DO, value);
	}

	public void setVrijediOd(Calendar value) {
		setCalendarAsDateString(value, KR_POKAZATELJ_OCJENA__VRIJEDI_OD);
	}

	public void setVrijediDo(Calendar value) {
		setCalendarAsDateString(value, KR_POKAZATELJ_OCJENA__VRIJEDI_DO);
	}
}