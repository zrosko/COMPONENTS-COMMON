package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.garancije.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.types.AS2Date;

import java.util.Calendar;
import java.util.Date;

public class GarancijaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PO_ZAH_GARANCIJA__ID_GARANCIJE = "id_garancije";
	public static String PO_ZAH_GARANCIJA__REDNI_BROJ = "redni_broj";
	public static String PO_ZAH_GARANCIJA__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String PO_ZAH_GARANCIJA__MATICNI_BROJ = "maticni_broj";
	public static String PO_ZAH_GARANCIJA__OIB = "oib";
	public static String PO_ZAH_GARANCIJA__BROJ_GARANCIJE = "broj_garancije";
	public static String PO_ZAH_GARANCIJA__IZNOS = "iznos";
	public static String PO_ZAH_GARANCIJA__SIFRA_VALUTE = "sifra_valute";
	public static String PO_ZAH_GARANCIJA__DATUM_IZDAVANJA = "datum_izdavanja";
	public static String PO_ZAH_GARANCIJA__ROK_VAZNOSTI_OD = "rok_vaznosti_od";
	public static String PO_ZAH_GARANCIJA__ROK_VAZNOSTI_DO = "rok_vaznosti_do";
	public static String PO_ZAH_GARANCIJA__TIP = "tip";
	public static String PO_ZAH_GARANCIJA__VRSTA = "vrsta";
	public static String PO_ZAH_GARANCIJA__KORISNIK = "korisnik";
	public static String PO_ZAH_GARANCIJA__OPERATER_UNOSA = "operater_unosa";
	public static String PO_ZAH_GARANCIJA__OPERATER_PROMJENE = "operater_promjene";
	public static String PO_ZAH_GARANCIJA__DATUM_UNOSA = "datum_unosa";
	public static String PO_ZAH_GARANCIJA__DATUM_PROMJENE = "datum_promjene";

	public GarancijaVo() {
		super();
	}

	public GarancijaVo(AS2Record value) {
		super(value);
	}

	// ************* NOVO ISPOD
	public Date getDatumIzdavanjaSWT() {
		return AS2Date
				.convertDateOrTimestamp(get(PO_ZAH_GARANCIJA__DATUM_IZDAVANJA));
	}

	public Date getDatumUnosaSWT() {
		return AS2Date
				.convertDateOrTimestamp(get(PO_ZAH_GARANCIJA__DATUM_UNOSA));
	}

	public Date getRokVaznostiOdSWT() {
		return AS2Date
				.convertDateOrTimestamp(get(PO_ZAH_GARANCIJA__ROK_VAZNOSTI_OD));
	}

	public Date getRokVaznostiDoSWT() {
		return AS2Date
				.convertDateOrTimestamp(get(PO_ZAH_GARANCIJA__ROK_VAZNOSTI_DO));
	}

	// ************* NOVO IZNAD
	public String getIdGarancije() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__ID_GARANCIJE);
	}

	public String getRedniBroj() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__REDNI_BROJ);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__ORGANIZACIJSKA_JEDINICA);
	}

	// public String getMaticniBroj() {
	// return getAsStringOrEmpty(PO_ZAH_GARANCIJA__MATICNI_BROJ);
	// }
	// public String getOib() {
	// return getAsStringOrEmpty(PO_ZAH_GARANCIJA__OIB);
	// }
	public String getBrojGarancije() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__BROJ_GARANCIJE);
	}

	public String getIznos() {
		return get(PO_ZAH_GARANCIJA__IZNOS);
		// Double _amount = new
		// Double(getPropertyAsDoubleOrZero(PO_ZAH_GARANCIJA__IZNOS));
		// return J2ESWTMoneyFormatter.format(_amount);
	}

	public String getSifraValute() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__SIFRA_VALUTE);
	}

	public Calendar getDatumIzdavanja() {
		return getAsCalendar(PO_ZAH_GARANCIJA__DATUM_IZDAVANJA);
	}

	public Calendar getRokVaznostiOd() {
		return getAsCalendar(PO_ZAH_GARANCIJA__ROK_VAZNOSTI_OD);
	}

	public Calendar getRokVaznostiDo() {
		return getAsCalendar(PO_ZAH_GARANCIJA__ROK_VAZNOSTI_DO);
	}

	public String getTip() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__TIP);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__VRSTA);
	}

	public String getKorisnik() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__KORISNIK);
	}

	public String getOperaterUnosa() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__OPERATER_UNOSA);
	}

	public String getOperaterPromjene() {
		return getAsStringOrEmpty(PO_ZAH_GARANCIJA__OPERATER_PROMJENE);
	}

	public Calendar getDatumUnosa() {
		return getAsCalendar(PO_ZAH_GARANCIJA__DATUM_UNOSA);
	}

	public Calendar getDatumPromjene() {
		return getAsCalendar(PO_ZAH_GARANCIJA__DATUM_PROMJENE);
	}

	// ************** SETTERS **********************
	public void setIdGarancije(String value) {
		set(PO_ZAH_GARANCIJA__ID_GARANCIJE, value);
	}

	public void setRedniBroj(String value) {
		set(PO_ZAH_GARANCIJA__REDNI_BROJ, value);
	}

	public void setRedniBroj(int value) {
		set(PO_ZAH_GARANCIJA__REDNI_BROJ, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(PO_ZAH_GARANCIJA__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setMaticniBroj(String value) {
		String oldValue = getMaticniBroj();
		set(PO_ZAH_GARANCIJA__MATICNI_BROJ, value);
		firePropertyChange(PO_ZAH_GARANCIJA__MATICNI_BROJ, oldValue, value);
	}

	public void setOib(String value) {
		String oldValue = getOib();
		set(PO_ZAH_GARANCIJA__OIB, value);
		firePropertyChange(PO_ZAH_GARANCIJA__OIB, oldValue, value);
	}

	public void setBrojGarancije(String value) {
		String oldValue = getBrojGarancije();
		set(PO_ZAH_GARANCIJA__BROJ_GARANCIJE, value);
		firePropertyChange(PO_ZAH_GARANCIJA__BROJ_GARANCIJE, oldValue, value);
	}

	public void setIznos(String value) {
		String oldValue = getIznos();
		set(PO_ZAH_GARANCIJA__IZNOS, value);
		value = getIznos();
		firePropertyChange(PO_ZAH_GARANCIJA__IZNOS, oldValue, value);
	}

	public void setSifraValute(String value) {
		set(PO_ZAH_GARANCIJA__SIFRA_VALUTE, value);
	}

	public void setDatumIzdavanja(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_GARANCIJA__DATUM_IZDAVANJA);
	}

	public void setRokVaznostiOd(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_GARANCIJA__ROK_VAZNOSTI_OD);
	}

	public void setRokVaznostiDo(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_GARANCIJA__ROK_VAZNOSTI_DO);
	}

	public void setTip(String value) {
		set(PO_ZAH_GARANCIJA__TIP, value);
	}

	public void setVrsta(String value) {
		set(PO_ZAH_GARANCIJA__VRSTA, value);
	}

	public void setKorisnik(String value) {
		String oldValue = getKorisnik();
		set(PO_ZAH_GARANCIJA__KORISNIK, value);
		firePropertyChange(PO_ZAH_GARANCIJA__KORISNIK, oldValue, value);
	}

	public void setOperaterUnosa(String value) {
		set(PO_ZAH_GARANCIJA__OPERATER_UNOSA, value);
	}

	public void setOperaterPromjene(String value) {
		set(PO_ZAH_GARANCIJA__OPERATER_PROMJENE, value);
	}

	public void setDatumUnosa(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_GARANCIJA__DATUM_UNOSA);
	}

	public void setDatumPromjene(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_GARANCIJA__DATUM_PROMJENE);
	}

	// ***** NOVO ISPOD---------------------------------
	public void setDatumUnosaSWT(Date value) {
		Date oldValue = getDatumUnosaSWT();
		set(PO_ZAH_GARANCIJA__DATUM_UNOSA, AS2Date.convert2(value));
		firePropertyChange(PO_ZAH_GARANCIJA__DATUM_UNOSA, oldValue, value);
	}

	public void setDatumIzdavanjaSWT(Date value) {
		Date oldValue = getDatumIzdavanjaSWT();
		set(PO_ZAH_GARANCIJA__DATUM_IZDAVANJA, AS2Date.convert2(value));
		firePropertyChange(PO_ZAH_GARANCIJA__DATUM_IZDAVANJA, oldValue, value);
	}

	public void setRokVaznostiOdSWT(Date value) {
		Date oldValue = getRokVaznostiOdSWT();
		set(PO_ZAH_GARANCIJA__ROK_VAZNOSTI_OD, AS2Date.convert2(value));
		firePropertyChange(PO_ZAH_GARANCIJA__ROK_VAZNOSTI_OD, oldValue, value);
	}

	public void setRokVaznostiDoSWT(Date value) {
		Date oldValue = getRokVaznostiDoSWT();
		set(PO_ZAH_GARANCIJA__ROK_VAZNOSTI_DO, AS2Date.convert2(value));
		firePropertyChange(PO_ZAH_GARANCIJA__ROK_VAZNOSTI_DO, oldValue, value);
	}
	// ****NOVO IZNAD------------------
}