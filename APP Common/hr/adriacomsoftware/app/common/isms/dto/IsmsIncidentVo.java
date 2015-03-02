package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class IsmsIncidentVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_INCIDENT__ID_INCIDENTA = "id_incidenta";
	public static String ISMS_INCIDENT__ID_PRIJETNJE = "id_prijetnje";
	public static String ISMS_INCIDENT__ID_KATEGORIJE = "id_kategorije";
	public static String ISMS_INCIDENT__ID_PROCESA = "id_procesa";
	public static String ISMS_INCIDENT__NAZIV = "naziv";
	public static String ISMS_INCIDENT__DATUM_PRIJAVE = "datum_prijave";
	public static String ISMS_INCIDENT__DATUM_INCIDENTA = "datum_incidenta";
	public static String ISMS_INCIDENT__DATUM_ZATVARANJA = "datum_zatvaranja";
	public static String ISMS_INCIDENT__TIP = "tip";
	public static String ISMS_INCIDENT__OPIS_INCIDENTA = "opis_incidenta";
	public static String ISMS_INCIDENT__OPIS_RJESENJA = "opis_rjesenja";
	public static String ISMS_INCIDENT__PRIJEDLOG_RJESENJA_OSOBA_PRIJAVE = "prijedlog_rjesenja_osoba_prijave";
	public static String ISMS_INCIDENT__PRIJEDLOG_RJESENJA_VODITELJ_SIGURNOSTI = "prijedlog_rjesenja_voditelj_sigurnosti";
	public static String ISMS_INCIDENT__UTJECAJ = "utjecaj";
	public static String ISMS_INCIDENT__OSOBA_PRIJAVE = "osoba_prijave";
	public static String ISMS_INCIDENT__ID_LOKACIJE = "id_lokacije";
	public static String ISMS_INCIDENT__ID_ZGRADE = "id_zgrade";
	public static String ISMS_INCIDENT__KAT = "kat";
	public static String ISMS_INCIDENT__OZNAKA_SOBE = "oznaka_sobe";
	public static String ISMS_INCIDENT__ORMAR = "ormar";
	public static String ISMS_INCIDENT__HITNOST = "prioritet";
	public static String ISMS_INCIDENT__STATUS = "status";
	public static String ISMS_INCIDENT__ID_POZIVA = "id_poziva";
	public static String ISMS_INCIDENT__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsIncidentVo() {
		super();
	}

	public IsmsIncidentVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdIncidenta() {
		return getAsStringOrEmpty(ISMS_INCIDENT__ID_INCIDENTA);
	}

	public String getIdPoziva() {
		return getAsStringOrEmpty(ISMS_INCIDENT__ID_POZIVA);
	}

	public String getIdPrijetnje() {
		return getAsStringOrEmpty(ISMS_INCIDENT__ID_PRIJETNJE);
	}

	public String getIdProcesa() {
		return getAsStringOrEmpty(ISMS_INCIDENT__ID_PROCESA);
	}

	public String getIdKategorije() {
		return getAsStringOrEmpty(ISMS_INCIDENT__ID_KATEGORIJE);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS_INCIDENT__NAZIV);
	}

	public Calendar getDatumPrijave() {
		return getAsCalendar(ISMS_INCIDENT__DATUM_PRIJAVE);
	}

	public Calendar getDatumIncidenta() {
		return getAsCalendar(ISMS_INCIDENT__DATUM_INCIDENTA);
	}

	public Calendar getDatumZatvaranja() {
		return getAsCalendar(ISMS_INCIDENT__DATUM_ZATVARANJA);
	}

	public String getTip() {
		return getAsStringOrEmpty(ISMS_INCIDENT__TIP);
	}

	public String getOpisIncidenta() {
		return getAsStringOrEmpty(ISMS_INCIDENT__OPIS_INCIDENTA);
	}

	public String getOpisRjesenja() {
		return getAsStringOrEmpty(ISMS_INCIDENT__OPIS_RJESENJA);
	}

	public String getPrijedlogRjesenjaOsobaPrijave() {
		return getAsStringOrEmpty(ISMS_INCIDENT__PRIJEDLOG_RJESENJA_OSOBA_PRIJAVE);
	}

	public String getPrijedlogRjesenjaVoditeljSigurnosti() {
		return getAsStringOrEmpty(ISMS_INCIDENT__PRIJEDLOG_RJESENJA_VODITELJ_SIGURNOSTI);
	}

	public String getUtjecaj() {
		return getAsStringOrEmpty(ISMS_INCIDENT__UTJECAJ);
	}

	public String getOsobaPrijave() {
		return getAsStringOrEmpty(ISMS_INCIDENT__OSOBA_PRIJAVE);
	}

	public String getIdLokacije() {
		return getAsStringOrEmpty(ISMS_INCIDENT__ID_LOKACIJE);
	}

	public String getIdZgrade() {
		return getAsStringOrEmpty(ISMS_INCIDENT__ID_ZGRADE);
	}

	public String getKat() {
		return getAsStringOrEmpty(ISMS_INCIDENT__KAT);
	}

	public String getOznakaSobe() {
		return getAsStringOrEmpty(ISMS_INCIDENT__OZNAKA_SOBE);
	}

	public String getOrmar() {
		return getAsStringOrEmpty(ISMS_INCIDENT__ORMAR);
	}

	public String getHitnost() {
		return getAsStringOrEmpty(ISMS_INCIDENT__HITNOST);
	}

	public String getStatus() {
		return getAsStringOrEmpty(ISMS_INCIDENT__STATUS);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(ISMS_INCIDENT__ISPRAVNO);
	}

	public void setIdIncidenta(String value) {
		set(ISMS_INCIDENT__ID_INCIDENTA, value);
	}

	public void setIdPoziva(String value) {
		set(ISMS_INCIDENT__ID_POZIVA, value);
	}

	public void setIdProcesa(String value) {
		set(ISMS_INCIDENT__ID_PROCESA, value);
	}

	public void setIdPrijetnje(String value) {
		set(ISMS_INCIDENT__ID_PRIJETNJE, value);
	}

	public void setIdKategorije(String value) {
		set(ISMS_INCIDENT__ID_KATEGORIJE, value);
	}

	public void setNaziv(String value) {
		set(ISMS_INCIDENT__NAZIV, value);
	}

	public void setDatumPrijave(Calendar value) {
		setCalendarAsDateString(value, ISMS_INCIDENT__DATUM_PRIJAVE);
	}

	public void setDatumIncidenta(Calendar value) {
		setCalendarAsDateString(value, ISMS_INCIDENT__DATUM_INCIDENTA);
	}

	public void setDatumZatvaranja(Calendar value) {
		setCalendarAsDateString(value, ISMS_INCIDENT__DATUM_ZATVARANJA);
	}

	public void setTip(String value) {
		set(ISMS_INCIDENT__TIP, value);
	}

	public void setOpisIncidenta(String value) {
		set(ISMS_INCIDENT__OPIS_INCIDENTA, value);
	}

	public void setOpisRjesenja(String value) {
		set(ISMS_INCIDENT__OPIS_RJESENJA, value);
	}

	public void setPrijedlogRjesenjaOsobaPrijave(String value) {
		set(ISMS_INCIDENT__PRIJEDLOG_RJESENJA_OSOBA_PRIJAVE, value);
	}

	public void setPrijedlogRjesenjaVoditeljSigurnosti(String value) {
		set(ISMS_INCIDENT__PRIJEDLOG_RJESENJA_VODITELJ_SIGURNOSTI, value);
	}

	public void setUtjecaj(String value) {
		set(ISMS_INCIDENT__UTJECAJ, value);
	}

	public void setOsobaPrijave(String value) {
		set(ISMS_INCIDENT__OSOBA_PRIJAVE, value);
	}

	public void setIdLokacije(String value) {
		set(ISMS_INCIDENT__ID_LOKACIJE, value);
	}

	public void setIdZgrade(String value) {
		set(ISMS_INCIDENT__ID_ZGRADE, value);
	}

	public void setKat(String value) {
		set(ISMS_INCIDENT__KAT, value);
	}

	public void setOznakaSobe(String value) {
		set(ISMS_INCIDENT__OZNAKA_SOBE, value);
	}

	public void setOrmar(String value) {
		set(ISMS_INCIDENT__ORMAR, value);
	}

	public void setHitnost(String value) {
		set(ISMS_INCIDENT__HITNOST, value);
	}

	public void setStatus(String value) {
		set(ISMS_INCIDENT__STATUS, value);
	}

	public void setIspravno(String value) {
		set(ISMS_INCIDENT__ISPRAVNO, value);
	}
	/* Getters/Setters /> */
}