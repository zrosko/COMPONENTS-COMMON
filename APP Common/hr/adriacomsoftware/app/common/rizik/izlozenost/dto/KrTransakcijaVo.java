package hr.adriacomsoftware.app.common.rizik.izlozenost.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KrTransakcijaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	// constants start
	public static String KR_TRANSAKCIJA__VRSTA_TRANSAKCIJE = "vrsta_transakcije";
	public static String KR_TRANSAKCIJA__DATUM = "datum";

	// constants end

	public KrTransakcijaVo() {
		super();
	}

	public KrTransakcijaVo(AS2Record value) {
		super(value);
	}

	// getters and setters start
	// GETTERS
	public String getVrstaTransakcije() {
		return getAsStringOrEmpty(KR_TRANSAKCIJA__VRSTA_TRANSAKCIJE);
	}

	public Calendar getDatum() {
		return getAsCalendar(KR_TRANSAKCIJA__DATUM);
	}

	// SETTERS
	public void setVrstaTransakcije(String value) {
		set(KR_TRANSAKCIJA__VRSTA_TRANSAKCIJE, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, KR_TRANSAKCIJA__DATUM);
	}
	// getters and setters end
}