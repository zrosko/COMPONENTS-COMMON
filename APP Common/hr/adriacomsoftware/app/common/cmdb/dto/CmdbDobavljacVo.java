package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class CmdbDobavljacVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_DOBAVLJAC__ID_DOBAVLJACA = "id_dobavljaca";
	public static String CMDB_DOBAVLJAC__NAZIV = "naziv";
	public static String CMDB_DOBAVLJAC__ULICA = "ulica";
	public static String CMDB_DOBAVLJAC__MJESTO = "mjesto";
	public static String CMDB_DOBAVLJAC__POSTANSKI_BROJ = "postanski_broj";
	public static String CMDB_DOBAVLJAC__DRZAVA = "drzava";
	public static String CMDB_DOBAVLJAC__TELEFON = "telefon";
	public static String CMDB_DOBAVLJAC__FAX = "fax";
	public static String CMDB_DOBAVLJAC__EMAIL = "email";
	public static String CMDB_DOBAVLJAC__KONTAKT_OSOBA = "kontakt_osoba";
	public static String CMDB_DOBAVLJAC__SERIVSER = "serivser";
	public static String CMDB_DOBAVLJAC__BROJ_UGOVORA_ODRZAVANJA = "broj_ugovora_odrzavanja";
	public static String CMDB_DOBAVLJAC__STATUS = "status";

	/* </ Constructors */
	public CmdbDobavljacVo() {
		super();
	}

	public CmdbDobavljacVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdDobavljaca() {
		return getAsString(CMDB_DOBAVLJAC__ID_DOBAVLJACA);
	}

	public String getNaziv() {
		return getAsString(CMDB_DOBAVLJAC__NAZIV);
	}

	public String getUlica() {
		return getAsString(CMDB_DOBAVLJAC__ULICA);
	}

	public String getMjesto() {
		return getAsString(CMDB_DOBAVLJAC__MJESTO);
	}

	public String getPostanskiBroj() {
		return getAsString(CMDB_DOBAVLJAC__POSTANSKI_BROJ);
	}

	public String getDrzava() {
		return getAsString(CMDB_DOBAVLJAC__DRZAVA);
	}

	public String getTelefon() {
		return getAsString(CMDB_DOBAVLJAC__TELEFON);
	}

	public String getFax() {
		return getAsString(CMDB_DOBAVLJAC__FAX);
	}

	public String getEmail() {
		return getAsString(CMDB_DOBAVLJAC__EMAIL);
	}

	public String getKontaktOsoba() {
		return getAsString(CMDB_DOBAVLJAC__KONTAKT_OSOBA);
	}

	public String getSerivser() {
		return getAsString(CMDB_DOBAVLJAC__SERIVSER);
	}

	public String getBrojUgovoraOdrzavanja() {
		return getAsString(CMDB_DOBAVLJAC__BROJ_UGOVORA_ODRZAVANJA);
	}

	public String getStatus() {
		return getAsString(CMDB_DOBAVLJAC__STATUS);
	}

	public void setIdDobavljaca(String value) {
		set(CMDB_DOBAVLJAC__ID_DOBAVLJACA, value);
	}

	public void setNaziv(String value) {
		set(CMDB_DOBAVLJAC__NAZIV, value);
	}

	public void setUlica(String value) {
		set(CMDB_DOBAVLJAC__ULICA, value);
	}

	public void setMjesto(String value) {
		set(CMDB_DOBAVLJAC__MJESTO, value);
	}

	public void setPostanskiBroj(String value) {
		set(CMDB_DOBAVLJAC__POSTANSKI_BROJ, value);
	}

	public void setDrzava(String value) {
		set(CMDB_DOBAVLJAC__DRZAVA, value);
	}

	public void setTelefon(String value) {
		set(CMDB_DOBAVLJAC__TELEFON, value);
	}

	public void setFax(String value) {
		set(CMDB_DOBAVLJAC__FAX, value);
	}

	public void setEmail(String value) {
		set(CMDB_DOBAVLJAC__EMAIL, value);
	}

	public void setKontaktOsoba(String value) {
		set(CMDB_DOBAVLJAC__KONTAKT_OSOBA, value);
	}

	public void setSerivser(String value) {
		set(CMDB_DOBAVLJAC__SERIVSER, value);
	}

	public void setBrojUgovoraOdrzavanja(String value) {
		set(CMDB_DOBAVLJAC__BROJ_UGOVORA_ODRZAVANJA, value);
	}

	public void setStatus(String value) {
		set(CMDB_DOBAVLJAC__STATUS, value);
	}
	/* Getters/Setters /> */
}