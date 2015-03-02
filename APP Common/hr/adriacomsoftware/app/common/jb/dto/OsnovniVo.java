package hr.adriacomsoftware.app.common.jb.dto;

import hr.adriacomsoftware.app.common.datadictionary.J2EEDataDictionary;
import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.BankaConstants;
import hr.as2.inf.common.core.AS2Constants;
import hr.as2.inf.common.core.AS2Helper;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.security.user.AS2User;
import hr.as2.inf.common.types.AS2Date;

import java.util.Calendar;
import java.util.Date;

/**
 */
public class OsnovniVo extends AS2Record implements BankaConstants {
	static final long serialVersionUID = 8878435581765500759L;
	/* </ Attribute names */
	public final static String FORM_FIELD_EMPTY = "";
	public final static String OPTION_DA = "Da";
	public final static String OPTION_NE = "Ne";
	public final static String STATUS_AKTIVAN = "A";
	public final static String STATUS_NEAKTIVAN = "N";
	public final static String STATUS_AKTIVAN_NAZIV = "Aktivan";
	public final static String STATUS_NEAKTIVAN_NAZIV = "Neaktivan";
	public final static String INDIKATOR_ONE = "1";
	public final static String INDIKATOR_ZERO = "0";
	public final static String IZBOR_NAZIV = "@izbor";
	public final static String IZBOR_A_NAZIV = "@izbor_a";
	public final static String IZBOR_B_NAZIV = "@izbor_b";
	public final static String IZBOR_C_NAZIV = "@izbor_c";
	public final static String IZBOR_D_NAZIV = "@izbor_d";
	public final static String IZBOR_A = "A";
	public final static String IZBOR_B = "B";
	public final static String IZBOR_C = "C";
	public final static String IZBOR_D = "D";
	public final static String ISPRAVNO = "ispravno";
	public final static String BROJAC = "brojac";
	public final static String PROFITNI_CENTAR = "profitni_centar";
	public final static String NAZIV = "naziv";

	/* Attributes names /> */
	/* </ Constructors */
	public OsnovniVo() {
		super();
	}

	public OsnovniVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getNaziv() {
		return getAsStringOrEmpty(NAZIV);
	}

	public String getProfitniCentar() {
		return getAsStringOrEmpty(PROFITNI_CENTAR);
	}

	public String getBrojac() {
		return getAsStringOrEmpty(BROJAC);
	}

	public String getPoFo() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PO_FO);
	}

	public void setPoFo(String value) {
		set(JBDataDictionary.BI_PO_FO, value);
	}

	public String getIznosKredita() {
		return getAsStringOrEmpty(
				JBDataDictionary.BI_OTPLATNI_PLAN__IZNOS_KREDITA).replace('.',
				',');
	}

	public void setIznosKredita(String value) {
		value = value.replace(',', '.');
		set(JBDataDictionary.BI_OTPLATNI_PLAN__IZNOS_KREDITA, value);
	}

	public String getValutaProtuvaluta() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PARTIJA__VALUTA_PROTUVALUTA);
	}

	public Calendar getDatum() {
		return getAsCalendar(J2EEDataDictionary.DATUM);
	}

	public Calendar getZadaniDatum() {
		return getAsCalendar(J2EEDataDictionary.ZADANI_DATUM);
	}

	public Calendar getDatumOd() {
		return getAsCalendar(J2EEDataDictionary.DATUM_OD);
	}

	public Calendar getDatumDo() {
		return getAsCalendar(J2EEDataDictionary.DATUM_DO);
	}

	public double getPrviUnosUserId() {
		return getAsDouble(J2EEDataDictionary.PRVI_UNOS_USER_ID);
	}

	public String getPrviUnosUser() {
		return getAsStringOrEmpty(J2EEDataDictionary.PRVI_UNOS_USER_ID);
	}

	// u select se radi JOIN sa ts_user tabelom za dobiti ime i prezime
	public String getUserName() {
		String ime = getAsStringOrEmpty(J2EEDataDictionary.USER_FIRST_NAME);
		String prezime = getAsStringOrEmpty(J2EEDataDictionary.USER_LAST_NAME);
		return ime + prezime;
	}

	public double getZadnjaPromjenaUserId() {
		return getAsDouble(J2EEDataDictionary.ZADNJA_PROMJENA_USER_ID);
	}

	public String getZadnjaPromjenaUser() {
		return getAsStringOrEmpty(J2EEDataDictionary.ZADNJA_PROMJENA_USER_ID);
	}

	public String getZadnjaPromjenaUserName() {
		String ime = getAsStringOrEmpty(J2EEDataDictionary.USER_FIRST_NAME);
		String prezime = getAsStringOrEmpty(J2EEDataDictionary.USER_LAST_NAME);
		return ime + " " + prezime;
	}

	public Calendar getPrviUnosVrijeme() {
		Date temp1 = getAsSqlDate(J2EEDataDictionary.PRVI_UNOS_VRIJEME);
		return AS2Date.convertDateStringToCalendar(temp1.toString());
	}

	public Calendar getZadnjaPromjenaVrijeme() {
		Date temp1 = getAsSqlDate(J2EEDataDictionary.ZADNJA_PROMJENA_VRIJEME);
		return AS2Date.convertDateStringToCalendar(temp1.toString());
	}

	public String getValidInd() {
		return getAsStringOrEmpty(J2EEDataDictionary.VALID_IND);
	}

	public String getAkcija() {
		return getAsStringOrEmpty(AKCIJA);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PARTIJA__BROJ_PARTIJE);
	}

	public String getImePrezime() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OSOBA__IME_PREZIME);
	}

	public String getImePrezimeNaziv() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OSOBA__IME_PREZIME_NAZIV);
	}

	public String getNazivPravneOsobe() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PRAVNA_OSOBA__NAZIV);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OSOBA__JMBG);
	}

	public String getJmbgMb() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OSOBA__JMBG_MB);
	}

	public String getOib() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OSOBA__OIB);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PRAVNA_OSOBA__MATICNI_BROJ);
	}

	public String getStanjePartijeOd() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PARTIJA__STANJE_PARTIJE_OD);
	}

	public String getStanjePartijeDo() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PARTIJA__STANJE_PARTIJE_DO);
	}

	public String getOrderBy() {
		return getAsStringOrEmpty(ORDER_BY);
	}

	public String getIskljucenePartije() {
		return getAsStringOrEmpty(JBDataDictionary.BI_DOMENA__ISKLJUCENE_PARTIJE);
	}

	/* Getters /> */
	/* </ Setters */
	public void setValutaProtuvaluta(String value) {
		set(JBDataDictionary.BI_PARTIJA__VALUTA_PROTUVALUTA, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, J2EEDataDictionary.DATUM);
	}

	public void setZadaniDatum(Calendar value) {
		setCalendarAsDateString(value, J2EEDataDictionary.ZADANI_DATUM);
	}

	public void setDatumOd(Calendar value) {
		setCalendarAsDateString(value, J2EEDataDictionary.DATUM_OD);
	}

	public void setDatumDo(Calendar value) {
		setCalendarAsDateString(value, J2EEDataDictionary.DATUM_DO);
	}

	public void setTrenutnoVrijeme(String naziv) {
		try {
			Object o = AS2Helper.generateReversedTimestampKey();
			set(naziv, o.toString());
		} catch (Exception e) {
			set(naziv, System.currentTimeMillis() + "");
		}
	}

	public void setPrviUnosUserId(String value) {
		set(J2EEDataDictionary.PRVI_UNOS_USER_ID, value);
	}

	public void setPrviUnosUserId(double value) {
		set(J2EEDataDictionary.PRVI_UNOS_USER_ID, value);
	}

	public void setZadnjaPromjenaUserId(String value) {
		set(J2EEDataDictionary.ZADNJA_PROMJENA_USER_ID, value);
	}

	public void setZadnjaPromjenaUserId(double value) {
		set(J2EEDataDictionary.ZADNJA_PROMJENA_USER_ID, value);
	}

	public void setPrviUnosVrijeme(Calendar c) {
		set(J2EEDataDictionary.PRVI_UNOS_VRIJEME,
				AS2Date.convertCalendarDateToString(c));
	}

	public void setZadnjaPromjenaVrijeme(Calendar c) {
		set(J2EEDataDictionary.ZADNJA_PROMJENA_VRIJEME,
				AS2Date.convertCalendarDateToString(c));
	}

	public void setValidInd(String value) {
		set(J2EEDataDictionary.VALID_IND, value);
	}

	public void setValidIndToValid() {
		set(J2EEDataDictionary.VALID_IND, VALID_IND_DA);
	}

	public void setValidIndToNotValid() {
		set(J2EEDataDictionary.VALID_IND, VALID_IND_NE);
	}

	public void setIspravnoNE() {
		set(ISPRAVNO, INDIKATOR_ZERO);
	}

	public void setIspravnoDA() {
		set(ISPRAVNO, INDIKATOR_ONE);
	}



	public void setAkcija(String value) {
		set(AKCIJA, value);
	}

	public void setBrojPartije(String value) {
		value = value.trim();
		set(JBDataDictionary.BI_PARTIJA__BROJ_PARTIJE, value);
	}

	public void setImePrezime(String value) {
		set(JBDataDictionary.BI_OSOBA__IME_PREZIME, value);
	}

	public void setImePrezimeNaziv(String value) {
		set(JBDataDictionary.BI_OSOBA__IME_PREZIME_NAZIV, value);
	}

	public void setNazivPravneOsobe(String value) {
		set(JBDataDictionary.BI_PRAVNA_OSOBA__NAZIV, value);
	}

	public void setJmbg(String value) {
		value = value.trim();
		set(JBDataDictionary.BI_OSOBA__JMBG, value);
	}

	public void setJmbgMb(String value) {
		value = value.trim();
		set(JBDataDictionary.BI_OSOBA__JMBG_MB, value);
	}

	public void setOib(String value) {
		value = value.trim();
		String oldValue = getOib();
		set(JBDataDictionary.BI_OSOBA__OIB, value);
		firePropertyChange(JBDataDictionary.BI_OSOBA__OIB, oldValue, value);
		// set(JBDataDictionary.BI_OSOBA__OIB, value);
	}

	public void setMaticniBroj(String value) {
		value = value.trim();
		String oldValue = getMaticniBroj();
		set(JBDataDictionary.BI_PRAVNA_OSOBA__MATICNI_BROJ, value);
		firePropertyChange(JBDataDictionary.BI_PRAVNA_OSOBA__MATICNI_BROJ,
				oldValue, value);
		// set(JBDataDictionary.BI_PRAVNA_OSOBA__MATICNI_BROJ, value);
	}

	public void setStanjePartijeOd(String value) {
		set(JBDataDictionary.BI_PARTIJA__STANJE_PARTIJE_OD, value);
	}

	public void setStanjePartijeDo(String value) {
		set(JBDataDictionary.BI_PARTIJA__STANJE_PARTIJE_DO, value);
	}

	public void setOrderBy(String value) {
		set(ORDER_BY, value);
	}

	public void setIskljucenePartije(String value) {
		StringBuffer sb = new StringBuffer(
				get(JBDataDictionary.BI_DOMENA__ISKLJUCENE_PARTIJE));
		if (sb.length() == 0)
			sb.append(value);
		else {
			sb.append(",");
			sb.append(value);
		}
		set(JBDataDictionary.BI_DOMENA__ISKLJUCENE_PARTIJE, sb.toString());
	}

	public void setBrojac(String value) {
		set(BROJAC, value);
	}

	public void setProfitniCentar(String value) {
		set(PROFITNI_CENTAR, value);
	}

	public void setNaziv(String value) {
		String oldValue = getNaziv();
		set(NAZIV, value);
		firePropertyChange(NAZIV, oldValue, value);
	}

	public String getKorisnik() {
		AS2User user = (AS2User) getAsObject(AS2Constants.USER_OBJ);
		return user.getUserName();
	}

	public Date getDatumSWT() {
		return AS2Date.convertDateOrTimestamp(get("datum"));
	}

	public void setDatumSWT(Date value) {
		Date oldValue = getDatumSWT();
		set("datum", AS2Date.convert2(value));
		if (value == null)
			delete("datum");
		firePropertyChange("datum", oldValue, value);
	}
	/* Setters /> */
}