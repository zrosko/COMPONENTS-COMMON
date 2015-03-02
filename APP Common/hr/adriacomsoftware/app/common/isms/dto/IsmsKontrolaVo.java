package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class IsmsKontrolaVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_KONTROLA__ID_KONTROLE = "id_kontrole";
	public static String ISMS_KONTROLA__AKTIVNO = "aktivno";
	public static String ISMS_KONTROLA__VRSTA = "vrsta";
	public static String ISMS_KONTROLA__TIP = "tip";
	public static String ISMS_KONTROLA__OCJENA_DJELOTVORNOSTI = "ocjena_djelotvornosti";
	public static String ISMS_KONTROLA__OZNAKA = "oznaka";
	public static String ISMS_KONTROLA__ODGOVORNA_OSOBA = "odgovorna_osoba";
	public static String ISMS_KONTROLA__NAZIV = "naziv";
	public static String ISMS_KONTROLA__OPIS = "opis";
	public static String ISMS_KONTROLA__ROK_PROVEDBE = "rok_provedbe";
	public static String ISMS_KONTROLA__ROK_PROVEDBE_DO = "rok_provedbe_do";
	public static String ISMS_KONTROLA__OPIS_PROVEDBE = "opis_provedbe";
	public static String ISMS_KONTROLA__PODSJETNIK = "podsjetnik";
	public static String ISMS_KONTROLA__DATUM_PROVEDBE = "datum_provedbe";
	public static String ISMS_KONTROLA__DATUM_PROVEDBE_DO = "datum_provedbe_do";
	public static String ISMS_KONTROLA__EVIDENCIJA = "evidencija";
	public static String ISMS_KONTROLA__CIJENA_HARDVER = "cijena_hardver";
	public static String ISMS_KONTROLA__CIJENA_SOFTVER = "cijena_softver";
	public static String ISMS_KONTROLA__CIJENA_SERVIS = "cijena_servis";
	public static String ISMS_KONTROLA__CIJENA_LJUDI = "cijena_ljudi";
	public static String ISMS_KONTROLA__CIJENA_EDUKACIJA = "cijena_edukacija";
	public static String ISMS_KONTROLA__SMJERNICE_PRIMJENE = "smjernice_primjene";
	public static String ISMS_KONTROLA__STANJE = "stanje";
	public static String ISMS_KONTROLA__TESTIRANJE = "testiranje";
	public static String ISMS_KONTROLA__RIZICI = "rizici";
	public static String ISMS_KONTROLA__RAZINA_RIZIKA = "razina_rizika";
	public static String ISMS_KONTROLA__PREPORUKE = "preporuke";
	public static String ISMS_KONTROLA__SUKLADNOST = "sukladnost";
	public static String ISMS_KONTROLA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String ISMS_KONTROLA__KORISNIK_ZADNJE_IZMJENE = "korisnik_zadnje_izmjene";
	public static String ISMS_KONTROLA__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsKontrolaVo() {
		super();
	}

	public IsmsKontrolaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdKontrole() {
		return getAsStringOrEmpty(ISMS_KONTROLA__ID_KONTROLE);
	}

	public String getAktivno() {
		return getAsStringOrEmpty(ISMS_KONTROLA__AKTIVNO);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(ISMS_KONTROLA__VRSTA);
	}

	public String getTip() {
		return getAsStringOrEmpty(ISMS_KONTROLA__TIP);
	}

	public String getOcjenaDjelotvornosti() {
		return getAsStringOrEmpty(ISMS_KONTROLA__OCJENA_DJELOTVORNOSTI);
	}

	public String getOznaka() {
		return getAsStringOrEmpty(ISMS_KONTROLA__OZNAKA);
	}

	public String getOdgovornaOsoba() {
		return getAsStringOrEmpty(ISMS_KONTROLA__ODGOVORNA_OSOBA);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS_KONTROLA__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(ISMS_KONTROLA__OPIS);
	}

	public Calendar getRokProvedbe() {
		return getAsCalendar(ISMS_KONTROLA__ROK_PROVEDBE);
	}

	public Calendar getRokProvedbeDo() {
		return getAsCalendar(ISMS_KONTROLA__ROK_PROVEDBE_DO);
	}

	public String getOpisProvedbe() {
		return get(ISMS_KONTROLA__OPIS_PROVEDBE);
	}

	public String getPodsjetnik() {
		return getAsStringOrEmpty(ISMS_KONTROLA__PODSJETNIK);
	}

	public Calendar getDatumProvedbe() {
		return getAsCalendar(ISMS_KONTROLA__DATUM_PROVEDBE);
	}

	public Calendar getDatumProvedbeDo() {
		return getAsCalendar(ISMS_KONTROLA__DATUM_PROVEDBE_DO);
	}

	public String getEvidencija() {
		return getAsStringOrEmpty(ISMS_KONTROLA__EVIDENCIJA);
	}

	public String getCijenaHardver() {
		return getAsStringOrEmpty(ISMS_KONTROLA__CIJENA_HARDVER);
	}

	public String getCijenaSoftver() {
		return getAsStringOrEmpty(ISMS_KONTROLA__CIJENA_SOFTVER);
	}

	public String getCijenaServis() {
		return getAsStringOrEmpty(ISMS_KONTROLA__CIJENA_SERVIS);
	}

	public String getCijenaLjudi() {
		return getAsStringOrEmpty(ISMS_KONTROLA__CIJENA_LJUDI);
	}

	public String getCijenaEdukacija() {
		return getAsStringOrEmpty(ISMS_KONTROLA__CIJENA_EDUKACIJA);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(ISMS_KONTROLA__ISPRAVNO);
	}

	public String getSmjernicePrimjene() {
		return getAsStringOrEmpty(ISMS_KONTROLA__SMJERNICE_PRIMJENE);
	}

	public String getStanje() {
		return getAsStringOrEmpty(ISMS_KONTROLA__STANJE);
	}

	public String getTestiranje() {
		return getAsStringOrEmpty(ISMS_KONTROLA__TESTIRANJE);
	}

	public String getRizici() {
		return getAsStringOrEmpty(ISMS_KONTROLA__RIZICI);
	}

	public String getRazinaRizika() {
		return getAsStringOrEmpty(ISMS_KONTROLA__RAZINA_RIZIKA);
	}

	public String getPreporuke() {
		return getAsStringOrEmpty(ISMS_KONTROLA__PREPORUKE);
	}

	public String getSukladnost() {
		return getAsStringOrEmpty(ISMS_KONTROLA__SUKLADNOST);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(ISMS_KONTROLA__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getKorisnikZadnjeIzmjene() {
		return getAsStringOrEmpty(ISMS_KONTROLA__KORISNIK_ZADNJE_IZMJENE);
	}

	public void setIdKontrole(String value) {
		set(ISMS_KONTROLA__ID_KONTROLE, value);
	}

	public void setAktivno(String value) {
		set(ISMS_KONTROLA__AKTIVNO, value);
	}

	public void setVrsta(String value) {
		set(ISMS_KONTROLA__VRSTA, value);
	}

	public void setTip(String value) {
		set(ISMS_KONTROLA__TIP, value);
	}

	public void setOcjenaDjelotvornosti(String value) {
		set(ISMS_KONTROLA__OCJENA_DJELOTVORNOSTI, value);
	}

	public void setOznaka(String value) {
		set(ISMS_KONTROLA__OZNAKA, value);
	}

	public void setOdgovornaOsoba(String value) {
		set(ISMS_KONTROLA__ODGOVORNA_OSOBA, value);
	}

	public void setNaziv(String value) {
		set(ISMS_KONTROLA__NAZIV, value);
	}

	public void setOpis(String value) {
		set(ISMS_KONTROLA__OPIS, value);
	}

	public void setRokProvedbe(Calendar value) {
		setCalendarAsDateString(value, ISMS_KONTROLA__ROK_PROVEDBE);
	}

	public void setRokProvedbeDo(Calendar value) {
		setCalendarAsDateString(value, ISMS_KONTROLA__ROK_PROVEDBE_DO);
	}

	public void setOpisProvedbe(String value) {
		set(ISMS_KONTROLA__OPIS_PROVEDBE, value);
	}

	public void setPodsjetnik(String value) {
		set(ISMS_KONTROLA__PODSJETNIK, value);
	}

	public void setDatumProvedbe(Calendar value) {
		setCalendarAsDateString(value, ISMS_KONTROLA__DATUM_PROVEDBE);
	}

	public void setDatumProvedbeDo(Calendar value) {
		setCalendarAsDateString(value, ISMS_KONTROLA__DATUM_PROVEDBE_DO);
	}

	public void setEvidencija(String value) {
		set(ISMS_KONTROLA__EVIDENCIJA, value);
	}

	public void setCijenaHardver(String value) {
		set(ISMS_KONTROLA__CIJENA_HARDVER, value);
	}

	public void setCijenaSoftver(String value) {
		set(ISMS_KONTROLA__CIJENA_SOFTVER, value);
	}

	public void setCijenaServis(String value) {
		set(ISMS_KONTROLA__CIJENA_SERVIS, value);
	}

	public void setCijenaLjudi(String value) {
		set(ISMS_KONTROLA__CIJENA_LJUDI, value);
	}

	public void setCijenaEdukacija(String value) {
		set(ISMS_KONTROLA__CIJENA_EDUKACIJA, value);
	}

	public void setSmjernicePrimjene(String value) {
		set(ISMS_KONTROLA__SMJERNICE_PRIMJENE, value);
	}

	public void setStanje(String value) {
		set(ISMS_KONTROLA__STANJE, value);
	}

	public void setTestiranje(String value) {
		set(ISMS_KONTROLA__TESTIRANJE, value);
	}

	public void setRizici(String value) {
		set(ISMS_KONTROLA__RIZICI, value);
	}

	public void setRazinaRizika(String value) {
		set(ISMS_KONTROLA__RAZINA_RIZIKA, value);
	}

	public void setPreporuke(String value) {
		set(ISMS_KONTROLA__PREPORUKE, value);
	}

	public void setSukladnost(String value) {
		set(ISMS_KONTROLA__SUKLADNOST, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value, ISMS_KONTROLA__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setKorisnikZadnjeIzmjene(String value) {
		set(ISMS_KONTROLA__KORISNIK_ZADNJE_IZMJENE, value);
	}

	public void setIspravno(String value) {
		set(ISMS_KONTROLA__ISPRAVNO, value);
	}

	/* Getters/Setters /> */
}