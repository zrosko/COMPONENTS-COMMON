package hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KupacLimitVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PO_FAKT_KUPAC_LIMIT__ID_LIMITA = "id_limita";
	public static String PO_FAKT_KUPAC_LIMIT__MATICNI_BROJ_KUPCA = "maticni_broj_kupca";
	public static String PO_FAKT_KUPAC_LIMIT__OIB_KUPCA = "oib_kupca";
	public static String PO_FAKT_KUPAC_LIMIT__LIMIT = "limit";
	public static String PO_FAKT_KUPAC_LIMIT__VIPKR = "vipkr";
	public static String PO_FAKT_KUPAC_LIMIT__VRIJEDI_OD = "vrijedi_od";
	public static String PO_FAKT_KUPAC_LIMIT__VRIJEDI_DO = "vrijedi_do";

	public KupacLimitVo() {
		super();
	}

	public KupacLimitVo(AS2Record value) {
		super(value);
	}

	public String getIdLimita() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC_LIMIT__ID_LIMITA);
	}

	public String getMaticniBrojKupca() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC_LIMIT__MATICNI_BROJ_KUPCA);
	}

	public String getOibKupca() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC_LIMIT__OIB_KUPCA);
	}

	public String getLimit() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC_LIMIT__LIMIT);
	}

	public String getVipkr() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC_LIMIT__VIPKR);
	}

	public Calendar getVrijediOd() {
		return getAsCalendar(PO_FAKT_KUPAC_LIMIT__VRIJEDI_OD);
	}

	public Calendar getVrijediDo() {
		return getAsCalendar(PO_FAKT_KUPAC_LIMIT__VRIJEDI_DO);
	}

	public void setIdLimita(String value) {
		set(PO_FAKT_KUPAC_LIMIT__ID_LIMITA, value);
	}

	public void setMaticniBrojKupca(String value) {
		set(PO_FAKT_KUPAC_LIMIT__MATICNI_BROJ_KUPCA, value);
	}

	public void setOibKupca(String value) {
		set(PO_FAKT_KUPAC_LIMIT__OIB_KUPCA, value);
	}

	public void setLimit(String value) {
		set(PO_FAKT_KUPAC_LIMIT__LIMIT, value);
	}

	public void setVipkr(String value) {
		set(PO_FAKT_KUPAC_LIMIT__VIPKR, value);
	}

	public void setVrijediOd(Calendar value) {
		setCalendarAsDateString(value, PO_FAKT_KUPAC_LIMIT__VRIJEDI_OD);
	}

	public void setVrijediDo(Calendar value) {
		setCalendarAsDateString(value, PO_FAKT_KUPAC_LIMIT__VRIJEDI_DO);
	}
}