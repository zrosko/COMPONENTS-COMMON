package hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto;

import hr.as2.inf.common.data.AS2Record;

public class CrnaListaOsobaAliasVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static final String NAME = "alias";

	public static String PRN_CRNA_LISTA_OSOBA_ALIAS__ID = "id";
	public static String PRN_CRNA_LISTA_OSOBA_ALIAS__ID_LISTE = "id_liste";
	public static String PRN_CRNA_LISTA_OSOBA_ALIAS__ID_OSOBE = "id_osobe";

	/* Attributes names /> */
	/* </ Constructors */
	public CrnaListaOsobaAliasVo() {
		super();
	}

	public CrnaListaOsobaAliasVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getAlias() {
		return get(NAME);
	}

	public String getValue(String name) {
		String value = "";
		if (name.equalsIgnoreCase("name"))
			value = get(NAME);
		return value;
	}

	public String getId() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_OSOBA_ALIAS__ID);
	}

	public String getIdListe() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_OSOBA_ALIAS__ID_LISTE);
	}

	public String getIdOsobe() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_OSOBA_ALIAS__ID_OSOBE);
	}

	/* Getters /> */
	/* </ Setters */
	public void setAlias(String value) {
		set(NAME, value);
	}

	public void setValue(String name, String value) {
		if (name.equalsIgnoreCase("name")
				|| name.equalsIgnoreCase("ALIAS_NAME"))
			set(NAME, value);
	}

	/* Setters /> */

	public void setId(String value) {
		set(PRN_CRNA_LISTA_OSOBA_ALIAS__ID, value);
	}

	public void setIdListe(String value) {
		set(PRN_CRNA_LISTA_OSOBA_ALIAS__ID_LISTE, value);
	}

	public void setIdOsobe(String value) {
		set(PRN_CRNA_LISTA_OSOBA_ALIAS__ID_OSOBE, value);
	}
}