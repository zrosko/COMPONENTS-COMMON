package hr.adriacomsoftware.app.common.rizik.rejting.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class RejtingVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String KR_ENTITET_REJTING__ID_REJTINGA = "id_rejtinga";
	public static String KR_ENTITET_REJTING__OIB = "oib";
	public static String KR_ENTITET_REJTING__MATICNI_BROJ = "maticni_broj";
	public static String KR_ENTITET_REJTING__REJTING_AGENCIJA = "rejting_agencija";
	public static String KR_ENTITET_REJTING__DATUM = "datum";
	public static String KR_ENTITET_REJTING__MJESEC = "mjesec";
	public static String KR_ENTITET_REJTING__GODINA = "godina";
	public static String KR_ENTITET_REJTING__REJTING = "rejting";
	public static String KR_ENTITET_REJTING__REJTING_OZNAKA = "rejting_oznaka";
	public static String KR_ENTITET_REJTING__ID_ENTITETA = "id_entiteta";

	public RejtingVo() {
		super();
	}

	public RejtingVo(AS2Record value) {
		super(value);
	}

	public String getIdRejtinga() {
		return getAsStringOrEmpty(KR_ENTITET_REJTING__ID_REJTINGA);
	}

	public String getOib() {
		return getAsStringOrEmpty(KR_ENTITET_REJTING__OIB);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(KR_ENTITET_REJTING__MATICNI_BROJ);
	}

	public String getRejtingAgencija() {
		return getAsStringOrEmpty(KR_ENTITET_REJTING__REJTING_AGENCIJA);
	}

	public Calendar getDatum() {
		return getAsCalendar(KR_ENTITET_REJTING__DATUM);
	}

	public String getMjesec() {
		return getAsStringOrEmpty(KR_ENTITET_REJTING__MJESEC);
	}

	public String getGodina() {
		return getAsStringOrEmpty(KR_ENTITET_REJTING__GODINA);
	}

	public String getRejting() {
		return getAsStringOrEmpty(KR_ENTITET_REJTING__REJTING);
	}

	public String getRejtingOznaka() {
		return getAsStringOrEmpty(KR_ENTITET_REJTING__REJTING_OZNAKA);
	}

	public String getIdEntiteta() {
		return getAsStringOrEmpty(KR_ENTITET_REJTING__ID_ENTITETA);
	}

	public void setIdRejtinga(String value) {
		set(KR_ENTITET_REJTING__ID_REJTINGA, value);
	}

	public void setOib(String value) {
		set(KR_ENTITET_REJTING__OIB, value);
	}

	public void setMaticniBroj(String value) {
		set(KR_ENTITET_REJTING__MATICNI_BROJ, value);
	}

	public void setRejtingAgencija(String value) {
		set(KR_ENTITET_REJTING__REJTING_AGENCIJA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, KR_ENTITET_REJTING__DATUM);
	}

	public void setMjesec(String value) {
		set(KR_ENTITET_REJTING__MJESEC, value);
	}

	public void setGodina(String value) {
		set(KR_ENTITET_REJTING__GODINA, value);
	}

	public void setRejting(String value) {
		set(KR_ENTITET_REJTING__REJTING, value);
	}

	public void setRejtingOznaka(String value) {
		set(KR_ENTITET_REJTING__REJTING_OZNAKA, value);
	}

	public void setIdEntiteta(String value) {
		set(KR_ENTITET_REJTING__ID_ENTITETA, value);
	}
}