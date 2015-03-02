package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class RizikKomentarVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String RIZIK_KOMENTAR__ID_KOMENTARA = "id_komentara";
	public static String RIZIK_KOMENTAR__ID_RIZIKA = "id_rizika";
	public static String RIZIK_KOMENTAR__DATUM_KOMENTARA = "datum_komentara";
	public static String RIZIK_KOMENTAR__OSOBA_PRIJAVE = "osoba_prijave";
	public static String RIZIK_KOMENTAR__KOMENTAR = "komentar";
	public static String RIZIK_KOMENTAR__OBAVJESTENA_OSOBA = "obavjestena_osoba";

	/* Attributes names /> */
	/* </ Constructors */
	public RizikKomentarVo() {
		super();
	}

	public RizikKomentarVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdKomentara() {
		return getAsStringOrEmpty(RIZIK_KOMENTAR__ID_KOMENTARA);
	}

	public String getIdRizika() {
		return getAsStringOrEmpty(RIZIK_KOMENTAR__ID_RIZIKA);
	}

	public Calendar getDatumKomentara() {
		return getAsCalendar(RIZIK_KOMENTAR__DATUM_KOMENTARA);
	}

	public Calendar getVrijemeKomentara() {
		return getAsCalendar(RIZIK_KOMENTAR__DATUM_KOMENTARA);
	}

	public String getOsobaPrijave() {
		return getAsStringOrEmpty(RIZIK_KOMENTAR__OSOBA_PRIJAVE);
	}

	public String getKomentar() {
		return getAsStringOrEmpty(RIZIK_KOMENTAR__KOMENTAR);
	}

	public String getObavjestenaOsoba() {
		return getAsStringOrEmpty(RIZIK_KOMENTAR__OBAVJESTENA_OSOBA);
	}

	public void setIdKomentara(String value) {
		set(RIZIK_KOMENTAR__ID_KOMENTARA, value);
	}

	public void setIdRizika(String value) {
		set(RIZIK_KOMENTAR__ID_RIZIKA, value);
	}

	public void setDatumKomentara(Calendar value) {
		setCalendarAsDateString(value, RIZIK_KOMENTAR__DATUM_KOMENTARA);
	}

	public void setVrijemeKomentara(Calendar value) {
		concatinateTimeToExistingDate(value, RIZIK_KOMENTAR__DATUM_KOMENTARA);
	}

	public void setOsobaPrijave(String value) {
		set(RIZIK_KOMENTAR__OSOBA_PRIJAVE, value);
	}

	public void setKomentar(String value) {
		set(RIZIK_KOMENTAR__KOMENTAR, value);
	}

	public void setObavjestenaOsoba(String value) {
		set(RIZIK_KOMENTAR__OBAVJESTENA_OSOBA, value);
	}

	/* Getters/Setters /> */
}