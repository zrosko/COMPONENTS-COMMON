package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class OrNadoknadaVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_NADOKNADA__ID_NADOKNADE = "id_nadoknade";
	public static String OR_NADOKNADA__ID_DOGADAJA = "id_dogadaja";
	public static String OR_NADOKNADA__DATUM_NADOKNADE = "datum_nadoknade";
	public static String OR_NADOKNADA__IZNOS_NADOKNADE = "iznos_nadoknade";
	public static String OR_NADOKNADA__VALUTA_NADOKNADE = "valuta_nadoknade";
	public static String OR_NADOKNADA__IZVOR_NADOKNADE = "izvor_nadoknade";
	public static String OR_NADOKNADA__OPIS_NADOKNADE = "opis_nadoknade";

	/* Attributes names /> */
	/* </ Constructors */
	public OrNadoknadaVo() {
		super();
	}

	public OrNadoknadaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdNadoknade() {
		return getAsStringOrEmpty(OR_NADOKNADA__ID_NADOKNADE);
	}

	public String getIdDogadaja() {
		return getAsStringOrEmpty(OR_NADOKNADA__ID_DOGADAJA);
	}

	// public Calendar getDatumNadoknade() {
	// return getAsCalendar(OR_NADOKNADA__DATUM_NADOKNADE);
	// }
	public String getIznosNadoknade() {
		return getAsStringOrEmpty(OR_NADOKNADA__IZNOS_NADOKNADE);
	}

	public String getValutaNadoknade() {
		return getAsStringOrEmpty(OR_NADOKNADA__VALUTA_NADOKNADE);
	}

	public String getIzvorNadoknade() {
		return getAsStringOrEmpty(OR_NADOKNADA__IZVOR_NADOKNADE);
	}

	public String getOpisNadoknade() {
		return getAsStringOrEmpty(OR_NADOKNADA__OPIS_NADOKNADE);
	}

	public void setIdNadoknade(String value) {
		set(OR_NADOKNADA__ID_NADOKNADE, value);
	}

	public void setIdDogadaja(String value) {
		set(OR_NADOKNADA__ID_DOGADAJA, value);
	}

	// public void setDatumNadoknade(Calendar value) {
	// setCalendarAsDateString(value, OR_NADOKNADA__DATUM_NADOKNADE);
	// }
	public void setIznosNadoknade(String value) {
		set(OR_NADOKNADA__IZNOS_NADOKNADE, value);
	}

	public void setValutaNadoknade(String value) {
		set(OR_NADOKNADA__VALUTA_NADOKNADE, value);
	}

	public void setIzvorNadoknade(String value) {
		set(OR_NADOKNADA__IZVOR_NADOKNADE, value);
	}

	public void setOpisNadoknade(String value) {
		set(OR_NADOKNADA__OPIS_NADOKNADE, value);
	}

}