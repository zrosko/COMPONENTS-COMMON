package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class EmailVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String EMAIL__FROM = "from";
	public static String EMAIL__TO = "to";
	public static String EMAIL__SUBJECT = "subject";
	public static String EMAIL__BODY = "body";
	public static String EMAIL__IME_PREZIME = "ime_prezime";
	public static String EMAIL__APLIKACIJA = "aplikacija";
	public static String EMAIL__ID_OBJEKTA = "id_objekta"; // id objekta (npr.
															// id zahtjeva,
															// poziva, radnog
															// naloga)
	public static String EMAIL__ID_TABELE = "id_tabele";
	public static String EMAIL__ID_OSOBE = "id_osobe";
	public static String EMAIL__ORG_JEDINICA_RADA = "org_jedinica_rada";
	public static String EMAIL__GRUPA = "grupa";
	public static String EMAIL__IZBOR = "izbor";

	/* Attributes names /> */
	/* </ Constructors */
	public EmailVo() {
		super();
	}

	public EmailVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getFrom() {
		return get(EMAIL__FROM);
	}

	public String getTo() {
		return get(EMAIL__TO);
	}

	public String getSubject() {
		return get(EMAIL__SUBJECT);
	}

	public String getBody() {
		return get(EMAIL__BODY);
	}

	public String getImePrezime() {
		return get(EMAIL__IME_PREZIME);
	}

	public String getAplikacija() {
		return get(EMAIL__APLIKACIJA);
	}

	public String getIdOsobe() {
		return get(EMAIL__ID_OSOBE);
	}

	public String getIdObjekta() {
		return get(EMAIL__ID_OBJEKTA);
	}

	public String getIdTabele() {
		return get(EMAIL__ID_TABELE);
	}

	public String getOrgJedinicaRada() {
		return get(EMAIL__ORG_JEDINICA_RADA);
	}

	public String getGrupa() {
		return get(EMAIL__GRUPA);
	}

	public String getIzbor() {
		return get(EMAIL__IZBOR);
	}

	// SETTERS
	public void setFrom(String value) {
		set(EMAIL__FROM, value);
	}

	public void setTo(String value) {
		set(EMAIL__TO, value);
	}

	public void setSubject(String value) {
		set(EMAIL__SUBJECT, value);
	}

	public void setBody(String value) {
		set(EMAIL__BODY, value);
	}

	public void setImePrezime(String value) {
		set(EMAIL__IME_PREZIME, value);
	}

	public void setAplikacija(String value) {
		set(EMAIL__APLIKACIJA, value);
	}

	public void setIdOsobe(String value) {
		set(EMAIL__ID_OSOBE, value);
	}

	public void setIdObjekta(String value) {
		set(EMAIL__ID_OBJEKTA, value);
	}

	public void setIdTabele(String value) {
		set(EMAIL__ID_TABELE, value);
	}

	public void setOrgJedinicaRada(String value) {
		set(EMAIL__ORG_JEDINICA_RADA, value);
	}

	public void setGrupa(String value) {
		set(EMAIL__GRUPA, value);
	}

	public void setIzbor(String value) {
		set(EMAIL__IZBOR, value);
	}
	/* Getters/Setters /> */
}