package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class IsmsRizikVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_RIZIK__ID_RIZIKA = "id_rizika";
	public static String ISMS_RIZIK__ID_IMOVINE = "id_imovine";
	public static String ISMS_RIZIK__ID_RANJIVOSTI = "id_ranjivosti";
	public static String ISMS_RIZIK__ID_PRIJETNJE = "id_prijetnje";
	public static String ISMS_RIZIK__NAZIV = "naziv";
	public static String ISMS_RIZIK__VRIJEDNOST_IMOVINE = "vrijednost_imovine";
	public static String ISMS_RIZIK__DATUM_PROCJENE = "datum_procjene";
	public static String ISMS_RIZIK__VLASNIK_RIZIKA = "vlasnik_rizika";
	public static String ISMS_RIZIK__STATUS = "status";
	public static String ISMS_RIZIK__VJEROJATNOST_RIZIKA = "vjerojatnost_rizika";
	public static String ISMS_RIZIK__OPIS_VJEROJATNOSTI_RIZIKA = "opis_vjerojatnosti_rizika";
	public static String ISMS_RIZIK__UTJECAJ_RIZIKA = "utjecaj_rizika";
	public static String ISMS_RIZIK__OPIS_UTJECAJA_RIZIKA = "opis_utjecaja_rizika";
	public static String ISMS_RIZIK__VJEROJATNOST_OTKRIVANJA = "vjerojatnost_otkrivanja";
	public static String ISMS_RIZIK__OPIS_VJEROJATNOSTI_OTKRIVANJA = "opis_vjerojatnosti_otkrivanja";
	public static String ISMS_RIZIK__FAKTOR_IZLOZENOSTI = "faktor_izlozenosti";
	public static String ISMS_RIZIK__OPIS_FAKTORA_IZLOZENOSTI = "opis_faktora_izlozenosti";
	public static String ISMS_RIZIK__FINANCIJSKI_UTJECAJ = "financijski_utjecaj";
	public static String ISMS_RIZIK__OPIS_SMANJENJA = "opis_smanjenja";
	public static String ISMS_RIZIK__CIJENA_SMANJENJA = "cijena_smanjenja";
	public static String ISMS_RIZIK__OCEKIVANI_UTJECAJ_RIZIKA = "ocekivani_utjecaj_rizika";
	public static String ISMS_RIZIK__OCEKIVANA_VJEROJATNOST_RIZIKA = "ocekivana_vjerojatnost_rizika";
	public static String ISMS_RIZIK__NACIN_SMANJENJA_RIZIKA = "nacin_smanjenja_rizika";
	// DODATNE KONSTANTE ZA PRETRAZIVANJE RIZIKA
	public static String ISMS_RIZIK__RAZINA_RIZIKA_OD = "razina_rizika_od";
	public static String ISMS_RIZIK__RAZINA_RIZIKA_DO = "razina_rizika_do";
	public static String ISMS_RIZIK__NAZIV_IMOVINE = "naziv_imovine";
	public static String ISMS_RIZIK__VLASNIK = "vlasnik";// imovine
	public static String ISMS_RIZIK__ID_PROCESA = "id_procesa";
	public static String ISMS_RIZIK__ID_KATEGORIJE = "id_kategorije";
	public static String ISMS_RIZIK__POTVRDA_RAZINE_RIZIKA = "potvrda_razine_rizika";
	public static String ISMS_RIZIK__POTVRDA_RAZINE_RIZIKA_DATUM = "potvrda_razine_rizika_datum";
	public static String ISMS_RIZIK__POTVRDA_RAZINE_RIZIKA_KORISNIK = "potvrda_razine_rizika_korisnik";
	public static String ISMS_RIZIK__OZNAKA_KONTROLE = "oznaka_kontrole";
	public static String ISMS_RIZIK__NAZIV_KONTROLE = "naziv_kontrole";
	public static String ISMS_RIZIK__STATUS_KONTROLE = "status_kontrole";
	public static String ISMS_RIZIK__UTJECAJ_POVJERLJIVOST = "utjecaj_povjerljjivost";
	public static String ISMS_RIZIK__UTJECAJ_CJELOVITOST = "utjecaj_cjelovitost";
	public static String ISMS_RIZIK__UTJECAJ_RASPOLOZIVOST = "utjecaj_raspolozivost";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsRizikVo() {
		super();
	}

	public IsmsRizikVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	/* NOVO GET */
	public String getRazinaRizikaOd() {
		return getAsStringOrEmpty(ISMS_RIZIK__RAZINA_RIZIKA_OD);
	}

	public String getRazinaRizikaDo() {
		return getAsStringOrEmpty(ISMS_RIZIK__RAZINA_RIZIKA_DO);
	}

	public String getNazivImovine() {
		return getAsStringOrEmpty(ISMS_RIZIK__NAZIV_IMOVINE);
	}

	public String getVlasnik() {
		return getAsStringOrEmpty(ISMS_RIZIK__VLASNIK);
	}

	public String getIdProcesa() {
		return getAsStringOrEmpty(ISMS_RIZIK__ID_PROCESA);
	}

	public void setIdKategorije(String value) {
		set(ISMS_RIZIK__ID_KATEGORIJE, value);
	}

	public String getPotvrdaRazineRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__POTVRDA_RAZINE_RIZIKA);
	}

	public String getPotvrdaRazineRizikaKorisnik() {
		return getAsStringOrEmpty(ISMS_RIZIK__POTVRDA_RAZINE_RIZIKA_KORISNIK);
	}

	public Calendar getPotvrdaRazineRizikaDatum() {
		return getAsCalendar(ISMS_RIZIK__POTVRDA_RAZINE_RIZIKA_DATUM);
	}

	public String getOznakaKontrole() {
		return getAsStringOrEmpty(ISMS_RIZIK__OZNAKA_KONTROLE);
	}

	public String getNazivKontrole() {
		return getAsStringOrEmpty(ISMS_RIZIK__NAZIV_KONTROLE);
	}

	public String getStatusKontrole() {
		return getAsStringOrEmpty(ISMS_RIZIK__STATUS_KONTROLE);
	}

	// SET
	public void setRazinaRizikaOd(String value) {
		set(ISMS_RIZIK__RAZINA_RIZIKA_OD, value);
	}

	public void setRazinaRizikaDo(String value) {
		set(ISMS_RIZIK__RAZINA_RIZIKA_DO, value);
	}

	public void setNazivImovine(String value) {
		set(ISMS_RIZIK__NAZIV_IMOVINE, value);
	}

	public void setVlasnik(String value) {
		set(ISMS_RIZIK__VLASNIK, value);
	}

	public void setIdProcesa(String value) {
		set(ISMS_RIZIK__ID_PROCESA, value);
	}

	public String getIdKategorije() {
		return getAsStringOrEmpty(ISMS_RIZIK__ID_KATEGORIJE);
	}

	public void setPotvrdaRazineRizika(String value) {
		set(ISMS_RIZIK__POTVRDA_RAZINE_RIZIKA, value);
	}

	public void setPotvrdaRazineRizikaKorisnik(String value) {
		set(ISMS_RIZIK__POTVRDA_RAZINE_RIZIKA_KORISNIK, value);
	}

	public void setPotvrdaRazineRizikaDatum(Calendar value) {
		setCalendarAsDateString(value, ISMS_RIZIK__POTVRDA_RAZINE_RIZIKA_DATUM);
	}

	public void setOznakaKontrole(String value) {
		set(ISMS_RIZIK__OZNAKA_KONTROLE, value);
	}

	public void setNazivKontrole(String value) {
		set(ISMS_RIZIK__NAZIV_KONTROLE, value);
	}

	public void setStatusKontrole(String value) {
		set(ISMS_RIZIK__STATUS_KONTROLE, value);
	}

	/* NOVO */
	public String getIdRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__ID_RIZIKA);
	}

	public String getIdImovine() {
		return getAsStringOrEmpty(ISMS_RIZIK__ID_IMOVINE);
	}

	public String getIdRanjivosti() {
		return getAsStringOrEmpty(ISMS_RIZIK__ID_RANJIVOSTI);
	}

	public String getIdPrijetnje() {
		return getAsStringOrEmpty(ISMS_RIZIK__ID_PRIJETNJE);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS_RIZIK__NAZIV);
	}

	public String getVrijednostImovine() {
		return getAsStringOrEmpty(ISMS_RIZIK__VRIJEDNOST_IMOVINE);
	}

	public Calendar getDatumProcjene() {
		return getAsCalendar(ISMS_RIZIK__DATUM_PROCJENE);
	}

	public String getVlasnikRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__VLASNIK_RIZIKA);
	}

	public String getStatus() {
		return getAsStringOrEmpty(ISMS_RIZIK__STATUS);
	}

	public String getVjerojatnostRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__VJEROJATNOST_RIZIKA);
	}

	public String getOpisVjerojatnostiRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__OPIS_VJEROJATNOSTI_RIZIKA);
	}

	public String getUtjecajRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__UTJECAJ_RIZIKA);
	}

	public String getUtjecajPovjerljivost() {
		return getAsStringOrEmpty(ISMS_RIZIK__UTJECAJ_POVJERLJIVOST);
	}

	public String getUtjecajCjelovitost() {
		return getAsStringOrEmpty(ISMS_RIZIK__UTJECAJ_CJELOVITOST);
	}

	public String getUtjecajRaspolozivost() {
		return getAsStringOrEmpty(ISMS_RIZIK__UTJECAJ_RASPOLOZIVOST);
	}

	public String getOpisUtjecajaRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__OPIS_UTJECAJA_RIZIKA);
	}

	public String getVjerojatnostOtkrivanja() {
		return getAsStringOrEmpty(ISMS_RIZIK__VJEROJATNOST_OTKRIVANJA);
	}

	public String getOpisVjerojatnostiOtkrivanja() {
		return getAsStringOrEmpty(ISMS_RIZIK__OPIS_VJEROJATNOSTI_OTKRIVANJA);
	}

	public String getFaktorIzlozenosti() {
		return getAsStringOrEmpty(ISMS_RIZIK__FAKTOR_IZLOZENOSTI);
	}

	public String getOpisFaktoraIzlozenosti() {
		return getAsStringOrEmpty(ISMS_RIZIK__OPIS_FAKTORA_IZLOZENOSTI);
	}

	public String getFinancijskiUtjecaj() {
		return getAsStringOrEmpty(ISMS_RIZIK__FINANCIJSKI_UTJECAJ);
	}

	public String getOpisSmanjenja() {
		return getAsStringOrEmpty(ISMS_RIZIK__OPIS_SMANJENJA);
	}

	public String getCijenaSmanjenja() {
		return getAsStringOrEmpty(ISMS_RIZIK__CIJENA_SMANJENJA);
	}

	public String getOcekivaniUtjecajRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__OCEKIVANI_UTJECAJ_RIZIKA);
	}

	public String getOcekivanaVjerojatnostRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__OCEKIVANA_VJEROJATNOST_RIZIKA);
	}

	public String getNacinSmanjenjaRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK__NACIN_SMANJENJA_RIZIKA);
	}

	public void setIdRizika(String value) {
		set(ISMS_RIZIK__ID_RIZIKA, value);
	}

	public void setIdImovine(String value) {
		set(ISMS_RIZIK__ID_IMOVINE, value);
	}

	public void setIdRanjivosti(String value) {
		set(ISMS_RIZIK__ID_RANJIVOSTI, value);
	}

	public void setIdPrijetnje(String value) {
		set(ISMS_RIZIK__ID_PRIJETNJE, value);
	}

	public void setNaziv(String value) {
		set(ISMS_RIZIK__NAZIV, value);
	}

	public void setVrijednostImovine(String value) {
		set(ISMS_RIZIK__VRIJEDNOST_IMOVINE, value);
	}

	public void setDatumProcjene(Calendar value) {
		setCalendarAsDateString(value, ISMS_RIZIK__DATUM_PROCJENE);
	}

	public void setVlasnikRizika(String value) {
		set(ISMS_RIZIK__VLASNIK_RIZIKA, value);
	}

	public void setStatus(String value) {
		set(ISMS_RIZIK__STATUS, value);
	}

	public void setVjerojatnostRizika(String value) {
		set(ISMS_RIZIK__VJEROJATNOST_RIZIKA, value);
	}

	public void setOpisVjerojatnostiRizika(String value) {
		set(ISMS_RIZIK__OPIS_VJEROJATNOSTI_RIZIKA, value);
	}

	public void setUtjecajRizika(String value) {
		set(ISMS_RIZIK__UTJECAJ_RIZIKA, value);
	}

	public void setUtjecajPovjerljivost(String value) {
		set(ISMS_RIZIK__UTJECAJ_POVJERLJIVOST, value);
	}

	public void setUtjecajCjelovitost(String value) {
		set(ISMS_RIZIK__UTJECAJ_CJELOVITOST, value);
	}

	public void setUtjecajRaspolozivost(String value) {
		set(ISMS_RIZIK__UTJECAJ_RASPOLOZIVOST, value);
	}

	public void setOpisUtjecajaRizika(String value) {
		set(ISMS_RIZIK__OPIS_UTJECAJA_RIZIKA, value);
	}

	public void setVjerojatnostOtkrivanja(String value) {
		set(ISMS_RIZIK__VJEROJATNOST_OTKRIVANJA, value);
	}

	public void setOpisVjerojatnostiOtkrivanja(String value) {
		set(ISMS_RIZIK__OPIS_VJEROJATNOSTI_OTKRIVANJA, value);
	}

	public void setFaktorIzlozenosti(String value) {
		set(ISMS_RIZIK__FAKTOR_IZLOZENOSTI, value);
	}

	public void setOpisFaktoraIzlozenosti(String value) {
		set(ISMS_RIZIK__OPIS_FAKTORA_IZLOZENOSTI, value);
	}

	public void setFinancijskiUtjecaj(String value) {
		set(ISMS_RIZIK__FINANCIJSKI_UTJECAJ, value);
	}

	public void setOpisSmanjenja(String value) {
		set(ISMS_RIZIK__OPIS_SMANJENJA, value);
	}

	public void setCijenaSmanjenja(String value) {
		set(ISMS_RIZIK__CIJENA_SMANJENJA, value);
	}

	public void setOcekivaniUtjecajRizika(String value) {
		set(ISMS_RIZIK__OCEKIVANI_UTJECAJ_RIZIKA, value);
	}

	public void setOcekivanaVjerojatnostRizika(String value) {
		set(ISMS_RIZIK__OCEKIVANA_VJEROJATNOST_RIZIKA, value);
	}

	public void setNacinSmanjenjaRizika(String value) {
		set(ISMS_RIZIK__NACIN_SMANJENJA_RIZIKA, value);
	}
	/* Getters/Setters /> */
}