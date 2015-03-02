package hr.adriacomsoftware.app.common.helpdesk.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class HelpDeskPozivKomentarVo extends HelpDeskVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String HD_POZIV_KOMENTAR__ID_KOMENTARA = "id_komentara";
	public static String HD_POZIV_KOMENTAR__ID_POZIVA = "id_poziva";
	public static String HD_POZIV_KOMENTAR__DATUM_KOMENTARA = "datum_komentara";
	public static String HD_POZIV_KOMENTAR__OSOBA_PRIJAVE = "osoba_prijave";
	public static String HD_POZIV_KOMENTAR__KOMENTAR = "komentar";
	public static String HD_POZIV_KOMENTAR__OBAVJESTENA_OSOBA = "obavjestena_osoba";

	/* Attributes names /> */
	/* </ Constructors */
	public HelpDeskPozivKomentarVo() {
		super();
	}

	public HelpDeskPozivKomentarVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdKomentara() {
		return getAsStringOrEmpty(HD_POZIV_KOMENTAR__ID_KOMENTARA);
	}

	public String getIdPoziva() {
		return getAsStringOrEmpty(HD_POZIV_KOMENTAR__ID_POZIVA);
	}

	public Calendar getDatumKomentara() {
		return getAsCalendar(HD_POZIV_KOMENTAR__DATUM_KOMENTARA);
	}

	public Calendar getVrijemeKomentara() {
		return getAsCalendar(HD_POZIV_KOMENTAR__DATUM_KOMENTARA);
	}

	public String getOsobaPrijave() {
		return getAsStringOrEmpty(HD_POZIV_KOMENTAR__OSOBA_PRIJAVE);
	}

	public String getKomentar() {
		return getAsStringOrEmpty(HD_POZIV_KOMENTAR__KOMENTAR);
	}

	public String getObavjestenaOsoba() {
		return getAsStringOrEmpty(HD_POZIV_KOMENTAR__OBAVJESTENA_OSOBA);
	}

	public void setIdKomentara(String value) {
		set(HD_POZIV_KOMENTAR__ID_KOMENTARA, value);
	}

	public void setIdPoziva(String value) {
		set(HD_POZIV_KOMENTAR__ID_POZIVA, value);
	}

	public void setDatumKomentara(Calendar value) {
		setCalendarAsDateString(value, HD_POZIV_KOMENTAR__DATUM_KOMENTARA);
	}

	public void setVrijemeKomentara(Calendar value) {
		concatinateTimeToExistingDate(value, HD_POZIV_KOMENTAR__DATUM_KOMENTARA);
	}

	public void setOsobaPrijave(String value) {
		set(HD_POZIV_KOMENTAR__OSOBA_PRIJAVE, value);
	}

	public void setKomentar(String value) {
		set(HD_POZIV_KOMENTAR__KOMENTAR, value);
	}

	public void setObavjestenaOsoba(String value) {
		set(HD_POZIV_KOMENTAR__OBAVJESTENA_OSOBA, value);
	}

	/* Getters/Setters /> */
}