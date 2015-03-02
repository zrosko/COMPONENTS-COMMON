package hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class DiskontVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PO_FAKT_DISKONT__ID_DISKONTA = "id_diskonta";
	public static String PO_FAKT_DISKONT__SIFRA_VALUTE = "sifra_valute";
	public static String PO_FAKT_DISKONT__BROJ_DANA = "broj_dana";
	public static String PO_FAKT_DISKONT__NIZA_STOPA = "niza_stopa";
	public static String PO_FAKT_DISKONT__VISA_STOPA = "visa_stopa";
	public static String PO_FAKT_DISKONT__VRIJEDI_OD = "vrijedi_od";
	public static String PO_FAKT_DISKONT__VRIJEDI_DO = "vrijedi_do";

	public DiskontVo() {
		super();
	}

	public DiskontVo(AS2Record value) {
		super(value);
	}

	public String getIdDiskonta() {
		return getAsStringOrEmpty(PO_FAKT_DISKONT__ID_DISKONTA);
	}

	public String getSifraValute() {
		return getAsStringOrEmpty(PO_FAKT_DISKONT__SIFRA_VALUTE);
	}

	public String getBrojDana() {
		return getAsStringOrEmpty(PO_FAKT_DISKONT__BROJ_DANA);
	}

	public String getNizaStopa() {
		return getAsStringOrEmpty(PO_FAKT_DISKONT__NIZA_STOPA);
	}

	public String getVisaStopa() {
		return getAsStringOrEmpty(PO_FAKT_DISKONT__VISA_STOPA);
	}

	public Calendar getVrijediOd() {
		return getAsCalendar(PO_FAKT_DISKONT__VRIJEDI_OD);
	}

	public Calendar getVrijediDo() {
		return getAsCalendar(PO_FAKT_DISKONT__VRIJEDI_DO);
	}

	public void setIdDiskonta(String value) {
		set(PO_FAKT_DISKONT__ID_DISKONTA, value);
	}

	public void setSifraValute(String value) {
		set(PO_FAKT_DISKONT__SIFRA_VALUTE, value);
	}

	public void setBrojDana(String value) {
		set(PO_FAKT_DISKONT__BROJ_DANA, value);
	}

	public void setNizaStopa(String value) {
		set(PO_FAKT_DISKONT__NIZA_STOPA, value);
	}

	public void setVisaStopa(String value) {
		set(PO_FAKT_DISKONT__VISA_STOPA, value);
	}

	public void setVrijediOd(Calendar value) {
		setCalendarAsDateString(value, PO_FAKT_DISKONT__VRIJEDI_OD);
	}

	public void setVrijediDo(Calendar value) {
		setCalendarAsDateString(value, PO_FAKT_DISKONT__VRIJEDI_DO);
	}
}