package hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto;

import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class CrnaListaOsobaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static final String UID = "id_osobe";
	public static final String LASTNAME = "prezime";
	public static final String FIRSTNAME = "ime";
	public static final String TITLE = "titula";
	public static final String SNDTYPE = "vrsta";
	public static final String REMARKS = "primjedba";
	// EU lista ispod
	public static final String ENTITY_ID = "id_osobe";
	public static final String NAME = "prezime";
	public static final String NAME_TYPE = "vrsta_imena";
	public static final String CATEGORY = "vrsta";
	// EU lista iznad
	public static String PRN_CRNA_LISTA_OSOBA__ID = "id";
	public static String PRN_CRNA_LISTA_OSOBA__ID_LISTE = "id_liste";
	public static String PRN_CRNA_LISTA_OSOBA__JMBG_MB = "jmbg_mb";
	public static String PRN_CRNA_LISTA_OSOBA__OIB = "oib";
	public static String PRN_CRNA_LISTA_OSOBA__ALIAS = "alias";
	public static String PRN_CRNA_LISTA_OSOBA__VRIJEDI_OD = "vrijedi_od";
	public static String PRN_CRNA_LISTA_OSOBA__VRSTA1 = "vrsta1";

	// zbog radiobutton-a i vassel vrste koju moramo ignorirati

	/* Attributes names /> */
	/* </ Constructors */
	public CrnaListaOsobaVo() {
		super();
	}

	public CrnaListaOsobaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getPrezime() {
		return get(LASTNAME);
	}

	public String getIme() {
		return get(FIRSTNAME);
	}

	public String getVrsta() {
		return get(SNDTYPE);
	}

	public String getTitula() {
		return get(TITLE);
	}

	public String getPrimjedba() {
		return get(REMARKS);
	}

	public String getIdOsobe() {
		return get(UID);
	}

	public String getValue(String name) {
		String value = "";
		if (name.equalsIgnoreCase("uid"))
			value = get(UID);
		else if (name.equalsIgnoreCase("lastName"))
			value = get(LASTNAME);
		else if (name.equalsIgnoreCase("firstName"))
			value = get(FIRSTNAME);
		else if (name.equalsIgnoreCase("title"))
			value = get(TITLE);
		else if (name.equalsIgnoreCase("sdnType"))
			value = get(SNDTYPE);
		else if (name.equalsIgnoreCase("remarks"))
			value = get(REMARKS);
		// EU
		else if (name.equalsIgnoreCase("ENTITY_ID"))
			value = get(ENTITY_ID);
		else if (name.equalsIgnoreCase("NAME"))
			value = get(NAME);
		else if (name.equalsIgnoreCase("NAME_TYPE"))
			value = get(NAME_TYPE);
		else if (name.equalsIgnoreCase("CATEGORY"))
			value = get(CATEGORY);
		return value;
	}

	public AS2RecordList getAdrese() {
		AS2RecordList rs;
		if (getProperty("@@adrese") == null) {
			rs = new AS2RecordList();
		} else {
			rs = (AS2RecordList) getProperty("@@adrese");
		}
		return rs;
	}

	public AS2RecordList getDokumente() {
		AS2RecordList rs;
		if (getProperty("@@dokumenti") == null) {
			rs = new AS2RecordList();
		} else {
			rs = (AS2RecordList) getProperty("@@dokumenti");
		}
		return rs;
	}

	public AS2RecordList getAliase() {
		AS2RecordList rs;
		if (getProperty("@@aliasi") == null) {
			rs = new AS2RecordList();
		} else {
			rs = (AS2RecordList) getProperty("@@aliasi");
		}
		return rs;
	}

	/* Getters /> */
	/* </ Setters */
	public void setPrezime(String value) {
		set(LASTNAME, value);
	}

	public void setIme(String value) {
		set(FIRSTNAME, value);
	}

	public void setVrsta(String value) {
		set(SNDTYPE, value);
	}

	public void setTitula(String value) {
		set(TITLE, value);
	}

	public void setPrimjedba(String value) {
		set(REMARKS, value);
	}

	public void setIdOsobe(String value) {
		set(UID, value);
	}

	public void setValue(String name, String value) {
		if (name.equalsIgnoreCase("uid") || name.equalsIgnoreCase("DATAID"))
			set(UID, value);
		else if (name.equalsIgnoreCase("lastName")
				|| name.equalsIgnoreCase("SECOND_NAME")
				|| name.equalsIgnoreCase("THIRD_NAME")
				|| name.equalsIgnoreCase("FOURTH_NAME")) {
			StringBuffer temp = new StringBuffer();
			temp.append(get(LASTNAME));
			temp.append(" ");
			temp.append(value);
			set(LASTNAME, temp.toString());
		} else if (name.equalsIgnoreCase("firstName")
				|| name.equalsIgnoreCase("FIRST_NAME"))
			set(FIRSTNAME, value);
		else if (name.equalsIgnoreCase("title"))
			set(TITLE, value);
		else if (name.equalsIgnoreCase("sdnType"))
			set(SNDTYPE, value);
		else if (name.equalsIgnoreCase("remarks")
				|| name.equalsIgnoreCase("COMMENTS1"))
			set(REMARKS, value);
		else if (name.equalsIgnoreCase("ENTITY_ID"))
			set(ENTITY_ID, value);
		else if (name.equalsIgnoreCase("NAME"))
			set(NAME, value);
		else if (name.equalsIgnoreCase("NAME_TYPE"))
			set(NAME_TYPE, value);
		else if (name.equalsIgnoreCase("CATEGORY"))
			set(CATEGORY, value);
	}

	public void setDokument(CrnaListaDokumentOsobeVo value) {
		AS2RecordList rs;
		if (getProperty("@@dokumenti") == null) {
			rs = new AS2RecordList();
			rs.addRow(value);
			set("@@dokumenti", rs);
		} else {
			rs = (AS2RecordList) getProperty("@@dokumenti");
			rs.addRow(value);
		}
	}

	public void setAlias(CrnaListaOsobaAliasVo value) {
		AS2RecordList rs;
		if (getProperty("@@aliasi") == null) {
			rs = new AS2RecordList();
			rs.addRow(value);
			set("@@aliasi", rs);
		} else {
			rs = (AS2RecordList) getProperty("@@aliasi");
			rs.addRow(value);
		}
	}

	public void setAdresa(CrnaListaAdresaOsobeVo value) {
		AS2RecordList rs;
		if (getProperty("@@adrese") == null) {
			rs = new AS2RecordList();
			rs.addRow(value);
			set("@@adrese", rs);
		} else {
			rs = (AS2RecordList) getProperty("@@adrese");
			rs.addRow(value);
		}
	}

	/*
	 * public String toString(){ return
	 * this.toString();//+getAdrese()+getDokumente(); }
	 */
	/* Setters /> */
	public String getId() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_OSOBA__ID);
	}

	public String getIdListe() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_OSOBA__ID_LISTE);
	}

	public String getJmbgMb() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_OSOBA__JMBG_MB);
	}

	public String getOib() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_OSOBA__OIB);
	}

	public String getAlias() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_OSOBA__ALIAS);
	}

	public Calendar getVrijediOd() {
		return getAsCalendar(PRN_CRNA_LISTA_OSOBA__VRIJEDI_OD);
	}

	public String getVrsta1() {
		return getAsStringOrEmpty(PRN_CRNA_LISTA_OSOBA__VRSTA1);
	}

	public void setId(String value) {
		set(PRN_CRNA_LISTA_OSOBA__ID, value);
	}

	public void setIdListe(String value) {
		set(PRN_CRNA_LISTA_OSOBA__ID_LISTE, value);
	}

	public void setJmbgMb(String value) {
		set(PRN_CRNA_LISTA_OSOBA__JMBG_MB, value);
	}

	public void setOib(String value) {
		set(PRN_CRNA_LISTA_OSOBA__OIB, value);
	}

	public void setAlias(String value) {
		set(PRN_CRNA_LISTA_OSOBA__ALIAS, value);
	}

	public void setVrijediOd(Calendar value) {
		setCalendarAsDateString(value, PRN_CRNA_LISTA_OSOBA__VRIJEDI_OD);
	}

	public void setVrsta1(String value) {
		set(PRN_CRNA_LISTA_OSOBA__VRSTA1, value);
	}
}