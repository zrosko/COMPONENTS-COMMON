package hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto;

import hr.as2.inf.common.data.AS2Record;

public class CrnaListaAdresaOsobeVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static final String UID = "id_adrese";
	public static final String ADDRESS1 = "ulica";
	public static final String ADDRESS2 = "ulica2";
	public static final String ADDRESS3 = "ulica3";
	public static final String CITY = "mjesto";
	public static final String STATEORPROVINCE = "regija";
	public static final String POSTALCODE = "postanski_broj";
	public static final String COUNTRY = "drzava";
	public static final String NOTE = "primjedba";

	public static String PRN_CRNA_LISTA_ADRESA__ID = "id";
	public static String PRN_CRNA_LISTA_ADRESA__ID_LISTE = "id_liste";
	public static String PRN_CRNA_LISTA_ADRESA__ID_OSOBE = "id_osobe";

	/* Attributes names /> */
	/* </ Constructors */
	public CrnaListaAdresaOsobeVo() {
		super();
	}

	public CrnaListaAdresaOsobeVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getValue(String name) {
		String value = "";
		if (name.equalsIgnoreCase("uid"))
			value = get(UID);
		else if (name.equalsIgnoreCase("address1"))
			value = get(ADDRESS1);
		else if (name.equalsIgnoreCase("address2"))
			value = get(ADDRESS2);
		else if (name.equalsIgnoreCase("address3"))
			value = get(ADDRESS3);
		else if (name.equalsIgnoreCase("city"))
			value = get(CITY);
		else if (name.equalsIgnoreCase("stateOrProvince"))
			value = get(STATEORPROVINCE);
		else if (name.equalsIgnoreCase("postalCode"))
			value = get(POSTALCODE);
		else if (name.equalsIgnoreCase("country"))
			value = get(COUNTRY);
		else if (name.equalsIgnoreCase("note"))
			value = get(NOTE);
		return value;
	}

	public String getId() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_ADRESA__ID);
	}

	public String getIdListe() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_ADRESA__ID_LISTE);
	}

	public String getIdOsobe() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_ADRESA__ID_OSOBE);
	}

	public String getIdAdrese() {
		return getAsStringOrEmpty(UID);
	}

	public String getUlica() {
		return getAsStringOrEmpty(ADDRESS1);
	}

	public String getUlica2() {
		return getAsStringOrEmpty(ADDRESS2);
	}

	public String getUlica3() {
		return getAsStringOrEmpty(ADDRESS3);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(CITY);
	}

	public String getRegija() {
		return getAsStringOrEmpty(STATEORPROVINCE);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(POSTALCODE);
	}

	public String getDrzava() {
		return getAsStringOrEmpty(COUNTRY);
	}

	public String getPrimjedba() {
		return getAsStringOrEmpty(NOTE);
	}

	/* Getters /> */
	/* </ Setters */
	public void setValue(String name, String value) {
		if (name.equalsIgnoreCase("uid"))
			set(UID, value);
		else if (name.equalsIgnoreCase("address1")
				|| name.equalsIgnoreCase("STREET"))
			set(ADDRESS1, value);
		else if (name.equalsIgnoreCase("address2"))
			set(ADDRESS2, value);
		else if (name.equalsIgnoreCase("address3"))
			set(ADDRESS3, value);
		else if (name.equalsIgnoreCase("city"))
			set(CITY, value);
		else if (name.equalsIgnoreCase("stateOrProvince"))
			set(STATEORPROVINCE, value);
		else if (name.equalsIgnoreCase("postalCode"))
			set(POSTALCODE, value);
		else if (name.equalsIgnoreCase("country"))
			set(COUNTRY, value);
		else if (name.equalsIgnoreCase("note"))
			set(NOTE, value);
	}

	public void setId(String value) {
		set(PRN_CRNA_LISTA_ADRESA__ID, value);
	}

	public void setIdListe(String value) {
		set(PRN_CRNA_LISTA_ADRESA__ID_LISTE, value);
	}

	public void setIdOsobe(String value) {
		set(PRN_CRNA_LISTA_ADRESA__ID_OSOBE, value);
	}

	public void setIdAdrese(String value) {
		set(UID, value);
	}

	public void setUlica(String value) {
		set(ADDRESS1, value);
	}

	public void setUlica2(String value) {
		set(ADDRESS2, value);
	}

	public void setUlica3(String value) {
		set(ADDRESS3, value);
	}

	public void setMjesto(String value) {
		set(CITY, value);
	}

	public void setRegija(String value) {
		set(STATEORPROVINCE, value);
	}

	public void setPostanskiBroj(String value) {
		set(POSTALCODE, value);
	}

	public void setDrzava(String value) {
		set(COUNTRY, value);
	}

	public void setPrimjedba(String value) {
		set(NOTE, value);
	}
	/* Setters /> */
}