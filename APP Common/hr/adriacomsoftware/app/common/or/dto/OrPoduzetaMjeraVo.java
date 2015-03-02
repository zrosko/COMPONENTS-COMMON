package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

public class OrPoduzetaMjeraVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_PODUZETA_MJERA__ID_MJERE = "id_mjere";
	public static String OR_PODUZETA_MJERA__ID_DOGADAJA = "id_dogadaja";
	public static String OR_PODUZETA_MJERA__DATUM = "datum";
	public static String OR_PODUZETA_MJERA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public OrPoduzetaMjeraVo() {
		super();
	}

	public OrPoduzetaMjeraVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdMjere() {
		return getAsStringOrEmpty(OR_PODUZETA_MJERA__ID_MJERE);
	}

	public String getIdDogadaja() {
		return getAsStringOrEmpty(OR_PODUZETA_MJERA__ID_DOGADAJA);
	}

	// public Calendar getDatum() {
	// return getAsCalendar(OR_PODUZETA_MJERA__DATUM);
	// }
	public String getOpis() {
		return getAsStringOrEmpty(OR_PODUZETA_MJERA__OPIS);
	}

	public void setIdMjere(String value) {
		set(OR_PODUZETA_MJERA__ID_MJERE, value);
	}

	public void setIdDogadaja(String value) {
		set(OR_PODUZETA_MJERA__ID_DOGADAJA, value);
	}

	// public void setDatum(Calendar value) {
	// setCalendarAsDateString(value, OR_PODUZETA_MJERA__DATUM);
	// }
	public void setOpis(String value) {
		set(OR_PODUZETA_MJERA__OPIS, value);
	}
}