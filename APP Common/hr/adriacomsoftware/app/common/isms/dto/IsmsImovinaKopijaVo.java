package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class IsmsImovinaKopijaVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_IMOVINA_KOPIJA__ID_KOPIJE = "id_kopije";
	public static String ISMS_IMOVINA_KOPIJA__ID_IMOVINE = "id_imovine";
	public static String ISMS_IMOVINA_KOPIJA__ID_LOKACIJE = "id_lokacije";
	public static String ISMS_IMOVINA_KOPIJA__DATUM_KOPIRANJA = "datum_kopiranja";
	public static String ISMS_IMOVINA_KOPIJA__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String ISMS_IMOVINA_KOPIJA__JMBG = "jmbg";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsImovinaKopijaVo() {
		super();
	}

	public IsmsImovinaKopijaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdKopije() {
		return getAsStringOrEmpty(ISMS_IMOVINA_KOPIJA__ID_KOPIJE);
	}

	public String getIdImovine() {
		return getAsStringOrEmpty(ISMS_IMOVINA_KOPIJA__ID_IMOVINE);
	}

	public String getIdLokacije() {
		return getAsStringOrEmpty(ISMS_IMOVINA_KOPIJA__ID_LOKACIJE);
	}

	public Calendar getDatumKopiranja() {
		return getAsCalendar(ISMS_IMOVINA_KOPIJA__DATUM_KOPIRANJA);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(ISMS_IMOVINA_KOPIJA__ORGANIZACIJSKA_JEDINICA);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(ISMS_IMOVINA_KOPIJA__JMBG);
	}

	public void setIdKopije(String value) {
		set(ISMS_IMOVINA_KOPIJA__ID_KOPIJE, value);
	}

	public void setIdImovine(String value) {
		set(ISMS_IMOVINA_KOPIJA__ID_IMOVINE, value);
	}

	public void setIdLokacije(String value) {
		set(ISMS_IMOVINA_KOPIJA__ID_LOKACIJE, value);
	}

	public void setDatumKopiranja(Calendar value) {
		setCalendarAsDateString(value, ISMS_IMOVINA_KOPIJA__DATUM_KOPIRANJA);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(ISMS_IMOVINA_KOPIJA__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setJmbg(String value) {
		set(ISMS_IMOVINA_KOPIJA__JMBG, value);
	}
	/* Getters/Setters /> */
}