package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class IsmsImovinaVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_IMOVINA__ID_IMOVINE = "id_imovine";
	public static String ISMS_IMOVINA__ID_KATEGORIJE = "id_kategorije";
	public static String ISMS_IMOVINA__POVJERLJIVOST = "povjerljivost";
	public static String ISMS_IMOVINA__CJELOVITOST = "cjelovitost";
	public static String ISMS_IMOVINA__VAZNOST = "vaznost";
	public static String ISMS_IMOVINA__ODGOVORNOST = "odgovornost";
	public static String ISMS_IMOVINA__DOKAZIVOST = "dokazivost";
	public static String ISMS_IMOVINA__RASPOLOZIVOST = "raspolozivost";
	public static String ISMS_IMOVINA__ID_LOKACIJE = "id_lokacije";
	public static String ISMS_IMOVINA__ID_ZGRADE = "id_zgrade";
	public static String ISMS_IMOVINA__ID_PROCESA = "id_procesa";
	public static String ISMS_IMOVINA__STATUS = "status";
	public static String ISMS_IMOVINA__VAZNOST_OBJASNJENJE = "vaznost_objasnjenje";
	public static String ISMS_IMOVINA__NAZIV = "naziv";
	public static String ISMS_IMOVINA__JEDINSTVENA_OZNAKA = "jedinstvena_oznaka";
	public static String ISMS_IMOVINA__DATUM_PORIJEKLA = "datum_porijekla";
	public static String ISMS_IMOVINA__OPIS = "opis";
	public static String ISMS_IMOVINA__VLASNIK = "vlasnik";
	public static String ISMS_IMOVINA__ODGOVORNA_OSOBA = "odgovorna_osoba";
	public static String ISMS_IMOVINA__ZADUZENA_OSOBA = "zaduzena_osoba";
	public static String ISMS_IMOVINA__ZAMJENIK_ZADUZENE_OSOBE = "zamjenik_zaduzene_osobe";
	public static String ISMS_IMOVINA__VRIJEDNOST_KNJIGOVODSTVENA = "vrijednost_knjigovodstvena";
	public static String ISMS_IMOVINA__VRIJEDNOST_AMORTIZIRANA = "vrijednost_amortizirana";
	public static String ISMS_IMOVINA__VRIJEDNOST_PROCJENJENA = "vrijednost_procjenjena";
	public static String ISMS_IMOVINA__VALUTA_PROCJENE = "valuta_procjene";
	public static String ISMS_IMOVINA__DOVOLJNA_ZASTITA = "dovoljna_zastita";
	public static String ISMS_IMOVINA__SERIJSKI_BROJ = "serijski_broj";
	public static String ISMS_IMOVINA__INVENTURNI_BROJ = "inventurni_broj";
	public static String ISMS_IMOVINA__TIP_MODEL = "tip_model";
	public static String ISMS_IMOVINA__INACICA = "inacica";
	public static String ISMS_IMOVINA__REGULATOR_PAZNJA = "regulator_paznja";
	public static String ISMS_IMOVINA__REGULATOR_RAZLOG = "regulator_razlog";
	public static String ISMS_IMOVINA__VRIJEDNOST_IMOVINE = "vrijednost_imovine";
	public static String ISMS_IMOVINA__POTVRDA_VRIJEDNOSTI = "potvrda_vrijednosti";
	public static String ISMS_IMOVINA__KAT = "kat";
	public static String ISMS_IMOVINA__OZNAKA_SOBE = "oznaka_sobe";
	public static String ISMS_IMOVINA__ORMAR = "ormar";
	public static String ISMS_IMOVINA__ISPRAVNO = "ispravno";
	public static String ISMS_IMOVINA__POTVRDA_VRIJEDNOSTI_DATUM = "potvrda_vrijednosti_datum";
	public static String ISMS_IMOVINA__POTVRDA_VRIJEDNOSTI_KORISNIK = "potvrda_vrijednosti_korisnik";
	public static String ISMS_IMOVINA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String ISMS_IMOVINA__KORISNIK_ZADNJE_IZMJENE = "korisnik_zadnje_izmjene";
	public static String ISMS_IMOVINA__ROK_BANKA = "rok_banka";
	public static String ISMS_IMOVINA__ROK_ZAKON = "rok_zakon";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsImovinaVo() {
		super();
	}

	public IsmsImovinaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	// NOVO
	public String getRokBanka() {
		return get(ISMS_IMOVINA__ROK_BANKA);
	}

	public String getRokZakon() {
		return get(ISMS_IMOVINA__ROK_ZAKON);
	}

	public String getPotvrdaVrijednostiKorisnik() {
		return getAsStringOrEmpty(ISMS_IMOVINA__POTVRDA_VRIJEDNOSTI_KORISNIK);
	}

	public Calendar getPotvrdaVrijednostiDatum() {
		return getAsCalendar(ISMS_IMOVINA__POTVRDA_VRIJEDNOSTI_DATUM);
	}

	public void setPotvrdaVrijednostiKorisnik(String value) {
		set(ISMS_IMOVINA__POTVRDA_VRIJEDNOSTI_KORISNIK, value);
	}

	public void setPotvrdaVrijednostiDatum(Calendar value) {
		setCalendarAsDateString(value, ISMS_IMOVINA__POTVRDA_VRIJEDNOSTI_DATUM);
	}

	public void setRokBanka(String value) {
		set(ISMS_IMOVINA__ROK_BANKA, value);
	}

	public void setRokZakon(String value) {
		set(ISMS_IMOVINA__ROK_ZAKON, value);
	}

	// NOVO
	public String getIdImovine() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ID_IMOVINE);
	}

	public String getIdKategorije() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ID_KATEGORIJE);
	}

	public String getPovjerljivost() {
		return getAsStringOrEmpty(ISMS_IMOVINA__POVJERLJIVOST);
	}

	public String getCjelovitost() {
		return getAsStringOrEmpty(ISMS_IMOVINA__CJELOVITOST);
	}

	public String getVaznost() {
		return getAsStringOrEmpty(ISMS_IMOVINA__VAZNOST);
	}

	public String getRaspolozivost() {
		return getAsStringOrEmpty(ISMS_IMOVINA__RASPOLOZIVOST);
	}

	public String getOdgovornost() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ODGOVORNOST);
	}

	public String getDokazivost() {
		return getAsStringOrEmpty(ISMS_IMOVINA__DOKAZIVOST);
	}

	public String getIdLokacije() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ID_LOKACIJE);
	}

	public String getIdProcesa() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ID_PROCESA);
	}

	public String getStatus() {
		return getAsStringOrEmpty(ISMS_IMOVINA__STATUS);
	}

	public String getVaznostObjasnjenje() {
		return getAsStringOrEmpty(ISMS_IMOVINA__VAZNOST_OBJASNJENJE);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS_IMOVINA__NAZIV);
	}

	public String getJedinstvenaOznaka() {
		return getAsStringOrEmpty(ISMS_IMOVINA__JEDINSTVENA_OZNAKA);
	}

	public Calendar getDatumPorijekla() {
		return getAsCalendar(ISMS_IMOVINA__DATUM_PORIJEKLA);
	}

	public String getOpis() {
		return getAsStringOrEmpty(ISMS_IMOVINA__OPIS);
	}

	public String getVlasnik() {
		return getAsStringOrEmpty(ISMS_IMOVINA__VLASNIK);
	}

	public String getOdgovornaOsoba() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ODGOVORNA_OSOBA);
	}

	public String getZaduzenaOsoba() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ZADUZENA_OSOBA);
	}

	public String getZamjenikZaduzeneOsobe() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ZAMJENIK_ZADUZENE_OSOBE);
	}

	public String getVrijednostKnjigovodstvena() {
		return getAsStringOrEmpty(ISMS_IMOVINA__VRIJEDNOST_KNJIGOVODSTVENA)
				.replace('.', ',');
	}

	public String getVrijednostAmortizirana() {
		return getAsStringOrEmpty(ISMS_IMOVINA__VRIJEDNOST_AMORTIZIRANA)
				.replace('.', ',');
	}

	public String getVrijednostProcjenjena() {
		return getAsStringOrEmpty(ISMS_IMOVINA__VRIJEDNOST_PROCJENJENA)
				.replace('.', ',');
	}

	public String getValutaProcjene() {
		return getAsStringOrEmpty(ISMS_IMOVINA__VALUTA_PROCJENE);
	}

	public String getDovoljnaZastita() {
		return getAsStringOrEmpty(ISMS_IMOVINA__DOVOLJNA_ZASTITA);
	}

	public String getSerijskiBroj() {
		return getAsStringOrEmpty(ISMS_IMOVINA__SERIJSKI_BROJ);
	}

	public String getInventurniBroj() {
		return getAsStringOrEmpty(ISMS_IMOVINA__INVENTURNI_BROJ);
	}

	public String getTipModel() {
		return getAsStringOrEmpty(ISMS_IMOVINA__TIP_MODEL);
	}

	public String getInacica() {
		return getAsStringOrEmpty(ISMS_IMOVINA__INACICA);
	}

	public String getRegulatorPaznja() {
		return getAsStringOrEmpty(ISMS_IMOVINA__REGULATOR_PAZNJA);
	}

	public String getPotvrdaVrijednosti() {
		return getAsStringOrEmpty(ISMS_IMOVINA__POTVRDA_VRIJEDNOSTI);
	}

	public String getRegulatorRazlog() {
		return getAsStringOrEmpty(ISMS_IMOVINA__REGULATOR_RAZLOG);
	}

	public String getVrijednostImovine() {
		return getAsStringOrEmpty(ISMS_IMOVINA__VRIJEDNOST_IMOVINE);
	}

	public String getIdZgrade() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ID_ZGRADE);
	}

	public String getKat() {
		return getAsStringOrEmpty(ISMS_IMOVINA__KAT);
	}

	public String getOznakaSobe() {
		return getAsStringOrEmpty(ISMS_IMOVINA__OZNAKA_SOBE);
	}

	public String getOrmar() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ORMAR);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(ISMS_IMOVINA__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getKorisnikZadnjeIzmjene() {
		return getAsStringOrEmpty(ISMS_IMOVINA__KORISNIK_ZADNJE_IZMJENE);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(ISMS_IMOVINA__ISPRAVNO);
	}

	/* Getters /> */
	/* </ Setters */
	public void setIdImovine(String value) {
		set(ISMS_IMOVINA__ID_IMOVINE, value);
	}

	public void setIdKategorije(String value) {
		set(ISMS_IMOVINA__ID_KATEGORIJE, value);
	}

	public void setPovjerljivost(String value) {
		set(ISMS_IMOVINA__POVJERLJIVOST, value);
	}

	public void setCjelovitost(String value) {
		set(ISMS_IMOVINA__CJELOVITOST, value);
	}

	public void setVaznost(String value) {
		set(ISMS_IMOVINA__VAZNOST, value);
	}

	public void setOdgovornost(String value) {
		set(ISMS_IMOVINA__ODGOVORNOST, value);
	}

	public void setDokazivost(String value) {
		set(ISMS_IMOVINA__DOKAZIVOST, value);
	}

	public void setRaspolozivost(String value) {
		set(ISMS_IMOVINA__RASPOLOZIVOST, value);
	}

	public void setIdLokacije(String value) {
		set(ISMS_IMOVINA__ID_LOKACIJE, value);
	}

	public void setIdProcesa(String value) {
		set(ISMS_IMOVINA__ID_PROCESA, value);
	}

	public void setStatus(String value) {
		set(ISMS_IMOVINA__STATUS, value);
	}

	public void setVaznostObjasnjenje(String value) {
		set(ISMS_IMOVINA__VAZNOST_OBJASNJENJE, value);
	}

	public void setNaziv(String value) {
		set(ISMS_IMOVINA__NAZIV, value);
	}

	public void setJedinstvenaOznaka(String value) {
		set(ISMS_IMOVINA__JEDINSTVENA_OZNAKA, value);
	}

	public void setDatumPorijekla(Calendar value) {
		setCalendarAsDateString(value, ISMS_IMOVINA__DATUM_PORIJEKLA);
	}

	public void setOpis(String value) {
		set(ISMS_IMOVINA__OPIS, value);
	}

	public void setVlasnik(String value) {
		set(ISMS_IMOVINA__VLASNIK, value);
	}

	public void setOdgovornaOsoba(String value) {
		set(ISMS_IMOVINA__ODGOVORNA_OSOBA, value);
	}

	public void setZaduzenaOsoba(String value) {
		set(ISMS_IMOVINA__ZADUZENA_OSOBA, value);
	}

	public void setZamjenikZaduzeneOsobe(String value) {
		set(ISMS_IMOVINA__ZAMJENIK_ZADUZENE_OSOBE, value);
	}

	public void setVrijednostKnjigovodstvena(String value) {
		value = value.replace(',', '.');
		setReplaceComma(ISMS_IMOVINA__VRIJEDNOST_KNJIGOVODSTVENA, value);
	}

	public void setVrijednostAmortizirana(String value) {
		value = value.replace(',', '.');
		setReplaceComma(ISMS_IMOVINA__VRIJEDNOST_AMORTIZIRANA, value);
	}

	public void setVrijednostProcjenjena(String value) {
		value = value.replace(',', '.');
		setReplaceComma(ISMS_IMOVINA__VRIJEDNOST_PROCJENJENA, value);
	}

	public void setValutaProcjene(String value) {
		set(ISMS_IMOVINA__VALUTA_PROCJENE, value);
	}

	public void setDovoljnaZastita(String value) {
		set(ISMS_IMOVINA__DOVOLJNA_ZASTITA, value);
	}

	public void setSerijskiBroj(String value) {
		set(ISMS_IMOVINA__SERIJSKI_BROJ, value);
	}

	public void setInventurniBroj(String value) {
		set(ISMS_IMOVINA__INVENTURNI_BROJ, value);
	}

	public void setTipModel(String value) {
		set(ISMS_IMOVINA__TIP_MODEL, value);
	}

	public void setInacica(String value) {
		set(ISMS_IMOVINA__INACICA, value);
	}

	public void setRegulatorPaznja(String value) {
		set(ISMS_IMOVINA__REGULATOR_PAZNJA, value);
	}

	public void setPotvrdaVrijednosti(String value) {
		set(ISMS_IMOVINA__POTVRDA_VRIJEDNOSTI, value);
	}

	public void setRegulatorRazlog(String value) {
		set(ISMS_IMOVINA__REGULATOR_RAZLOG, value);
	}

	public void setIdZgrade(String value) {
		set(ISMS_IMOVINA__ID_ZGRADE, value);
	}

	public void setKat(String value) {
		set(ISMS_IMOVINA__KAT, value);
	}

	public void setOznakaSobe(String value) {
		set(ISMS_IMOVINA__OZNAKA_SOBE, value);
	}

	public void setOrmar(String value) {
		set(ISMS_IMOVINA__ORMAR, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value, ISMS_IMOVINA__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setKorisnikZadnjeIzmjene(String value) {
		set(ISMS_IMOVINA__KORISNIK_ZADNJE_IZMJENE, value);
	}

	public void setIspravno(String value) {
		set(ISMS_IMOVINA__ISPRAVNO, value);
	}
	/* Setters /> */
}