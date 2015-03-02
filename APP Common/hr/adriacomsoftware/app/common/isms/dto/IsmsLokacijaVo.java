package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

public class IsmsLokacijaVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_LOKACIJA__ID_LOKACIJE = "id_lokacije";
	public static String ISMS_LOKACIJA__ID_ZGRADE = "id_zgrade";
	public static String ISMS_LOKACIJA__NAZIV = "naziv";
	public static String ISMS_LOKACIJA__KAT = "kat";
	public static String ISMS_LOKACIJA__OZNAKA_SOBE = "oznaka_sobe";
	public static String ISMS_LOKACIJA__SERIJSKI_BROJ = "serijski_broj";
	public static String ISMS_LOKACIJA__STATUS = "status";
	public static String ISMS_LOKACIJA__ORG_JEDINICA = "org_jedinica";
	public static String ISMS_LOKACIJA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsLokacijaVo() {
		super();
	}

	public IsmsLokacijaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdLokacije() {
		return getAsStringOrEmpty(ISMS_LOKACIJA__ID_LOKACIJE);
	}

	public String getIdZgrade() {
		return getAsStringOrEmpty(ISMS_LOKACIJA__ID_ZGRADE);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS_LOKACIJA__NAZIV);
	}

	public String getKat() {
		return getAsStringOrEmpty(ISMS_LOKACIJA__KAT);
	}

	public String getOznakaSobe() {
		return getAsStringOrEmpty(ISMS_LOKACIJA__OZNAKA_SOBE);
	}

	public String getSerijskiBroj() {
		return getAsStringOrEmpty(ISMS_LOKACIJA__SERIJSKI_BROJ);
	}

	public String getStatus() {
		return getAsStringOrEmpty(ISMS_LOKACIJA__STATUS);
	}

	public String getOrgJedinica() {
		return getAsStringOrEmpty(ISMS_LOKACIJA__ORG_JEDINICA);
	}

	public String getOpis() {
		return getAsStringOrEmpty(ISMS_LOKACIJA__OPIS);
	}

	public void setIdLokacije(String value) {
		set(ISMS_LOKACIJA__ID_LOKACIJE, value);
	}

	public void setIdZgrade(String value) {
		set(ISMS_LOKACIJA__ID_ZGRADE, value);
	}

	public void setNaziv(String value) {
		set(ISMS_LOKACIJA__NAZIV, value);
	}

	public void setKat(String value) {
		set(ISMS_LOKACIJA__KAT, value);
	}

	public void setOznakaSobe(String value) {
		set(ISMS_LOKACIJA__OZNAKA_SOBE, value);
	}

	public void setSerijskiBroj(String value) {
		set(ISMS_LOKACIJA__SERIJSKI_BROJ, value);
	}

	public void setStatus(String value) {
		set(ISMS_LOKACIJA__STATUS, value);
	}

	public void setOrgJedinica(String value) {
		set(ISMS_LOKACIJA__ORG_JEDINICA, value);
	}

	public void setOpis(String value) {
		set(ISMS_LOKACIJA__OPIS, value);
	}
	/* Getters/Setters /> */
}