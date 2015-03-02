package hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto;

import hr.as2.inf.common.data.AS2Record;

public class CrnaListaDokumentOsobeVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static final String UID = "id_dokumenta";
	public static final String IDTYPE = "vrsta";
	public static final String IDNUMBER = "broj";
	public static final String IDCOUNTRY = "drzava";
	public static final String ISSUEDATE = "datum_izdavanja";
	public static final String EXPIRATIONDATE = "datum_isteka";
	public static final String NOTE = "primjedba";

	public static String PRN_CRNA_LISTA_DOKUMENT__ID = "id";
	public static String PRN_CRNA_LISTA_DOKUMENT__ID_LISTE = "id_liste";
	public static String PRN_CRNA_LISTA_DOKUMENT__ID_OSOBE = "id_osobe";

	/* Attributes names /> */
	/* </ Constructors */
	public CrnaListaDokumentOsobeVo() {
		super();
	}

	public CrnaListaDokumentOsobeVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getValue(String name) {
		String value = "";
		if (name.equalsIgnoreCase("uid"))
			value = get(UID);
		else if (name.equalsIgnoreCase("idType")
				|| name.equalsIgnoreCase("TYPE_OF_DOCUMENT"))
			value = get(IDTYPE);
		else if (name.equalsIgnoreCase("idNumber")
				|| name.equalsIgnoreCase("NUMBER"))
			value = get(IDNUMBER);
		else if (name.equalsIgnoreCase("idCountry")
				|| name.equalsIgnoreCase("ISSUING_COUNTRY"))
			value = get(IDCOUNTRY);
		else if (name.equalsIgnoreCase("issueDate")
				|| name.equalsIgnoreCase("DATE_OF_ISSUE"))
			value = get(ISSUEDATE);
		else if (name.equalsIgnoreCase("note"))
			value = get(NOTE);
		else if (name.equalsIgnoreCase("expirationDate"))
			value = get(EXPIRATIONDATE);
		return value;
	}

	public String getId() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_DOKUMENT__ID);
	}

	public String getIdListe() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_DOKUMENT__ID_LISTE);
	}

	public String getIdOsobe() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_DOKUMENT__ID_OSOBE);
	}

	public String getIdDokumenta() {
		return getAsStringOrEmpty(UID);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(IDTYPE);
	}

	public String getBroj() {
		return getAsStringOrEmpty(IDNUMBER);
	}

	public String getDrzava() {
		return getAsStringOrEmpty(IDCOUNTRY);
	}

	public String getDatumIzdavanja() {
		return getAsStringOrEmpty(ISSUEDATE);
	}

	public String getDatumIsteka() {
		return getAsStringOrEmpty(EXPIRATIONDATE);
	}

	/* Getters /> */
	/* </ Setters */
	public void setValue(String name, String value) {
		if (name.equalsIgnoreCase("uid"))
			set(UID, value);
		else if (name.equalsIgnoreCase("idType")
				|| name.equalsIgnoreCase("TYPE_OF_DOCUMENT"))
			set(IDTYPE, value);
		else if (name.equalsIgnoreCase("idNumber")
				|| name.equalsIgnoreCase("NUMBER"))
			set(IDNUMBER, value);
		else if (name.equalsIgnoreCase("idCountry")
				|| name.equalsIgnoreCase("ISSUING_COUNTRY"))
			set(IDCOUNTRY, value);
		else if (name.equalsIgnoreCase("issueDate")
				|| name.equalsIgnoreCase("DATE_OF_ISSUE"))
			set(ISSUEDATE, value);
		else if (name.equalsIgnoreCase("note"))
			set(NOTE, value);
		else if (name.equalsIgnoreCase("expirationDate"))
			set(EXPIRATIONDATE, value);
	}

	public void setId(String value) {
		set(PRN_CRNA_LISTA_DOKUMENT__ID, value);
	}

	public void setIdListe(String value) {
		set(PRN_CRNA_LISTA_DOKUMENT__ID_LISTE, value);
	}

	public void setIdOsobe(String value) {
		set(PRN_CRNA_LISTA_DOKUMENT__ID_OSOBE, value);
	}

	public void setIdDokumenta(String value) {
		set(UID, value);
	}

	public void setVrsta(String value) {
		set(IDTYPE, value);
	}

	public void setBroj(String value) {
		set(IDNUMBER, value);
	}

	public void setDrzava(String value) {
		set(IDCOUNTRY, value);
	}

	public void setDatumIzdavanja(String value) {
		set(ISSUEDATE, value);
	}

	public void setDatumIsteka(String value) {
		set(EXPIRATIONDATE, value);
	}

	/* Setters /> */
}