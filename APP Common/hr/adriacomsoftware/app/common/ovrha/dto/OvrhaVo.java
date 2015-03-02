package hr.adriacomsoftware.app.common.ovrha.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class OvrhaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String PONS_OVRHA__ID_OVRHE = "id_ovrhe";
	public static String PONS_OVRHA__REDNI_BROJ = "redni_broj";
	public static String PONS_OVRHA__INTERNI_BROJ = "interni_broj";
	public static String PONS_OVRHA__RACUN_OVRSENIKA = "racun_ovrsenika";
	public static String PONS_OVRHA__SIFRA_VRSTE_SREDSTAVA = "sifra_vrste_sredstava";
	public static String PONS_OVRHA__OIB = "oib";
	public static String PONS_OVRHA__JMBG = "jmbg";
	public static String PONS_OVRHA__BROJ_OSNOVE = "broj_osnove";
	public static String PONS_OVRHA__SIFRA_VRSTE_OSNOVE = "sifra_vrste_osnove";
	public static String PONS_OVRHA__DODATNA_OBILJEZJA_RJESENJA = "dodatna_obiljezja_rjesenja";
	public static String PONS_OVRHA__DATUM_PRIMITKA = "datum_primitka";
	public static String PONS_OVRHA__VRIJEME_PRIMITKA = "vrijeme_primitka";
	public static String PONS_OVRHA__SIFRA_VRSTE_DUGA = "sifra_vrste_duga";
	public static String PONS_OVRHA__VISINA_KAMATNE_STOPE = "visina_kamatne_stope";
	public static String PONS_OVRHA__OSTATAK_GLAVNOG_DUGA_KN = "ostatak_glavnog_duga_kn";
	public static String PONS_OVRHA__OSTATAK_KAMATE_KN = "ostatak_kamate_kn";
	public static String PONS_OVRHA__OSTATAK_GLAVNOG_DUGA_VAL = "ostatak_glavnog_duga_val";
	public static String PONS_OVRHA__OSTATAK_KAMATE_VAL = "ostatak_kamate_val";
	public static String PONS_OVRHA__OZNAKA_STRANE_VAL = "oznaka_strane_val";
	public static String PONS_OVRHA__SIFRA_VRSTE_ISPLATE = "sifra_vrste_isplate";
	public static String PONS_OVRHA__RACUN_ODOBRENJA = "racun_odobrenja";
	public static String PONS_OVRHA__SIFRA_PRAVOMOCNOSTI = "sifra_pravomocnosti";
	public static String PONS_OVRHA__IZNOS_ZAPLIJENJENIH_SREDSTAVA_GLAVNICA = "iznos_zaplijenjenih_sredstava_glavnica";
	public static String PONS_OVRHA__IZNOS_ZAPLIJENJENIH_SREDSTAVA_KAMATA = "iznos_zaplijenjenih_sredstava_kamata";
	public static String PONS_OVRHA__MODEL_PBO = "model_pbo";
	public static String PONS_OVRHA__PBO = "pbo";
	public static String PONS_OVRHA__SIFRA_IZDAVATELJA_OSNOVE = "sifra_izdavatelja_osnove";
	public static String PONS_OVRHA__MJESTO_IZDAVATELJA_OSNOVE = "mjesto_izdavatelja_osnove";
	public static String PONS_OVRHA__PRIMJEDBA = "primjedba";
	public static String PONS_OVRHA__OPERATER_UNOSA = "operater_unosa";
	public static String PONS_OVRHA__VRIJEME_UNOSA = "vrijeme_unosa";
	public static String PONS_OVRHA__OPERATER_POSLJEDNJE_IZMJENE = "operater_posljednje_izmjene";
	public static String PONS_OVRHA__DATUM_POSLJEDNJE_IZMJENE = "datum_posljednje_izmjene";
	public static String PONS_OVRHA__KORISNIK = "korisnik";
	public static String PONS_OVRHA__RAZINA_BLOKADE = "razina_blokade";
	public static String PONS_OVRHA__DATUM_ZADNJE_OBRACUNATE_KAMATE = "datum_zadnje_obracunate_kamate";
	public static String PONS_OVRHA__BROJ_PAKETA = "broj_paketa";
	public static String PONS_OVRHA__ISPRAVNO = "ispravno";

	public static String PONS_OVRHA__TIP = "tip";
	public static String PONS_OVRHA__IZNOS = "iznos";
	public static String PONS_OVRHA__IZNOS_ZAPLJENE = "iznos_zapljene";
	public static String PONS_OVRHA__DATUM_POCETKA_VAZENJA = "datum_pocetka_vazenja";
	public static String PONS_OVRHA__DATUM_PRESTANKA_VAZENJA = "datum_prestanka_vazenja";
	public static String PONS_OVRHA__RACUN_OVRSENIKA_DODATNO = "racun_ovrsenika_dodatno";
	public static String PONS_OVRHA__TIP_PODATAKA = "tip_podataka";
	public static String PONS_OVRHA__RACUN_TERECENJA = "racun_terecenja";
	public static String PONS_OVRHA__ID_RACUNA = "id_racuna";

	/* Attributes names /> */
	/* </ Constructors */
	public OvrhaVo() {
		super();
	}

	public OvrhaVo(AS2Record value) {
		super(value);
	}

	public String getIdOvrhe() {
		return getAsStringOrEmpty(PONS_OVRHA__ID_OVRHE);
	}

	public String getRedniBroj() {
		return getAsStringOrEmpty(PONS_OVRHA__REDNI_BROJ);
	}

	public String getInterniBroj() {
		return getAsStringOrEmpty(PONS_OVRHA__INTERNI_BROJ);
	}

	public String getRacunOvrsenika() {
		return getAsStringOrEmpty(PONS_OVRHA__RACUN_OVRSENIKA);
	}

	public String getSifraVrsteSredstava() {
		return getAsStringOrEmpty(PONS_OVRHA__SIFRA_VRSTE_SREDSTAVA);
	}

	public String getOib() {
		return getAsStringOrEmpty(PONS_OVRHA__OIB);
	}

	public String getJmbg() {
		return getAsStringOrEmpty(PONS_OVRHA__JMBG);
	}

	public String getBrojOsnove() {
		return getAsStringOrEmpty(PONS_OVRHA__BROJ_OSNOVE);
	}

	public String getSifraVrsteOsnove() {
		return getAsStringOrEmpty(PONS_OVRHA__SIFRA_VRSTE_OSNOVE);
	}

	public String getDodatnaObiljezjaRjesenja() {
		return getAsStringOrEmpty(PONS_OVRHA__DODATNA_OBILJEZJA_RJESENJA);
	}

	public Calendar getDatumPrimitka() {
		return getAsCalendar(PONS_OVRHA__DATUM_PRIMITKA);
	}

	public Calendar getVrijemePrimitka() {
		return getAsCalendar(PONS_OVRHA__DATUM_PRIMITKA);
	}

	public String getSifraVrsteDuga() {
		return getAsStringOrEmpty(PONS_OVRHA__SIFRA_VRSTE_DUGA);
	}

	public String getVisinaKamatneStope() {
		return getAsStringOrEmpty(PONS_OVRHA__VISINA_KAMATNE_STOPE);
	}

	public String getOstatakGlavnogDugaKn() {
		return getAsStringOrEmpty(PONS_OVRHA__OSTATAK_GLAVNOG_DUGA_KN);
	}

	public String getOstatakKamateKn() {
		return getAsStringOrEmpty(PONS_OVRHA__OSTATAK_KAMATE_KN);
	}

	public String getOstatakGlavnogDugaVal() {
		return getAsStringOrEmpty(PONS_OVRHA__OSTATAK_GLAVNOG_DUGA_VAL);
	}

	public String getOstatakKamateVal() {
		return getAsStringOrEmpty(PONS_OVRHA__OSTATAK_KAMATE_VAL);
	}

	public String getOznakaStraneVal() {
		return getAsStringOrEmpty(PONS_OVRHA__OZNAKA_STRANE_VAL);
	}

	public String getSifraVrsteIsplate() {
		return getAsStringOrEmpty(PONS_OVRHA__SIFRA_VRSTE_ISPLATE);
	}

	public String getRacunOdobrenja() {
		return getAsStringOrEmpty(PONS_OVRHA__RACUN_ODOBRENJA);
	}

	public String getSifraPravomocnosti() {
		return getAsStringOrEmpty(PONS_OVRHA__SIFRA_PRAVOMOCNOSTI);
	}

	public String getIznosZaplijenjenihSredstavaGlavnica() {
		return getAsStringOrEmpty(PONS_OVRHA__IZNOS_ZAPLIJENJENIH_SREDSTAVA_GLAVNICA);
	}

	public String getIznosZaplijenjenihSredstavaKamata() {
		return getAsStringOrEmpty(PONS_OVRHA__IZNOS_ZAPLIJENJENIH_SREDSTAVA_KAMATA);
	}

	public String getModelPbo() {
		return getAsStringOrEmpty(PONS_OVRHA__MODEL_PBO);
	}

	public String getPbo() {
		return getAsStringOrEmpty(PONS_OVRHA__PBO);
	}

	public String getSifraIzdavateljaOsnove() {
		return getAsStringOrEmpty(PONS_OVRHA__SIFRA_IZDAVATELJA_OSNOVE);
	}

	public String getMjestoIzdavateljaOsnove() {
		return getAsStringOrEmpty(PONS_OVRHA__MJESTO_IZDAVATELJA_OSNOVE);
	}

	public String getPrimjedba() {
		return getAsStringOrEmpty(PONS_OVRHA__PRIMJEDBA);
	}

	public String getOperaterUnosa() {
		return getAsStringOrEmpty(PONS_OVRHA__OPERATER_UNOSA);
	}

	public Calendar getVrijemeUnosa() {
		return getAsCalendar(PONS_OVRHA__VRIJEME_UNOSA);
	}

	public String getOperaterPosljednjeIzmjene() {
		return getAsStringOrEmpty(PONS_OVRHA__OPERATER_POSLJEDNJE_IZMJENE);
	}

	public Calendar getDatumPosljednjeIzmjene() {
		return getAsCalendar(PONS_OVRHA__DATUM_POSLJEDNJE_IZMJENE);
	}

	public String getKorisnik() {
		return getAsStringOrEmpty(PONS_OVRHA__KORISNIK);
	}

	public String getRazinaBlokade() {
		return getAsStringOrEmpty(PONS_OVRHA__RAZINA_BLOKADE);
	}

	public Calendar getDatumZadnjeObracunateKamate() {
		return getAsCalendar(PONS_OVRHA__DATUM_ZADNJE_OBRACUNATE_KAMATE);
	}

	public String getTip() {
		return getAsStringOrEmpty(PONS_OVRHA__TIP);
	}

	public String getIznos() {
		return getAsStringOrEmpty(PONS_OVRHA__IZNOS);
	}

	public String getIznosZapljene() {
		return getAsStringOrEmpty(PONS_OVRHA__IZNOS_ZAPLJENE);
	}

	public Calendar getDatumPocetkaVazenja() {
		return getAsCalendar(PONS_OVRHA__DATUM_POCETKA_VAZENJA);
	}

	public Calendar getDatumPrestankaVazenja() {
		return getAsCalendar(PONS_OVRHA__DATUM_PRESTANKA_VAZENJA);
	}

	public String getRacunOvrsenikaDodatno() {
		return getAsStringOrEmpty(PONS_OVRHA__RACUN_OVRSENIKA_DODATNO);
	}

	public String getTipPodataka() {
		return getAsStringOrEmpty(PONS_OVRHA__TIP_PODATAKA);
	}

	public String getRacunTerecenja() {
		return getAsStringOrEmpty(PONS_OVRHA__RACUN_TERECENJA);
	}

	public String getIdRacuna() {
		return getAsStringOrEmpty(PONS_OVRHA__ID_RACUNA);
	}

	public String getBrojPaketa() {
		return getAsStringOrEmpty(PONS_OVRHA__BROJ_PAKETA);
	}

	public String getIdIspravno() {
		return getAsStringOrEmpty(PONS_OVRHA__ISPRAVNO);
	}

	public void setIdOvrhe(String value) {
		set(PONS_OVRHA__ID_OVRHE, value);
	}

	public void setRedniBroj(String value) {
		set(PONS_OVRHA__REDNI_BROJ, value);
	}

	public void setInterniBroj(String value) {
		set(PONS_OVRHA__INTERNI_BROJ, value);
	}

	public void setRacunOvrsenika(String value) {
		set(PONS_OVRHA__RACUN_OVRSENIKA, value);
	}

	public void setSifraVrsteSredstava(String value) {
		set(PONS_OVRHA__SIFRA_VRSTE_SREDSTAVA, value);
	}

	public void setOib(String value) {
		set(PONS_OVRHA__OIB, value);
	}

	public void setJmbg(String value) {
		set(PONS_OVRHA__JMBG, value);
	}

	public void setBrojOsnove(String value) {
		set(PONS_OVRHA__BROJ_OSNOVE, value);
	}

	public void setSifraVrsteOsnove(String value) {
		set(PONS_OVRHA__SIFRA_VRSTE_OSNOVE, value);
	}

	public void setDodatnaObiljezjaRjesenja(String value) {
		set(PONS_OVRHA__DODATNA_OBILJEZJA_RJESENJA, value);
	}

	public void setDatumPrimitka(Calendar value) {
		setCalendarAsDateString(value, PONS_OVRHA__DATUM_PRIMITKA);
	}

	public void setVrijemePrimitka(Calendar value) {
		concatinateTimeToExistingDate(value, PONS_OVRHA__DATUM_PRIMITKA);
	}

	public void setSifraVrsteDuga(String value) {
		set(PONS_OVRHA__SIFRA_VRSTE_DUGA, value);
	}

	public void setVisinaKamatneStope(String value) {
		set(PONS_OVRHA__VISINA_KAMATNE_STOPE, value);
	}

	public void setOstatakGlavnogDugaKn(String value) {
		set(PONS_OVRHA__OSTATAK_GLAVNOG_DUGA_KN, value);
	}

	public void setOstatakKamateKn(String value) {
		set(PONS_OVRHA__OSTATAK_KAMATE_KN, value);
	}

	public void setOstatakGlavnogDugaVal(String value) {
		set(PONS_OVRHA__OSTATAK_GLAVNOG_DUGA_VAL, value);
	}

	public void setOstatakKamateVal(String value) {
		set(PONS_OVRHA__OSTATAK_KAMATE_VAL, value);
	}

	public void setOznakaStraneVal(String value) {
		set(PONS_OVRHA__OZNAKA_STRANE_VAL, value);
	}

	public void setSifraVrsteIsplate(String value) {
		set(PONS_OVRHA__SIFRA_VRSTE_ISPLATE, value);
	}

	public void setRacunOdobrenja(String value) {
		set(PONS_OVRHA__RACUN_ODOBRENJA, value);
	}

	public void setSifraPravomocnosti(String value) {
		set(PONS_OVRHA__SIFRA_PRAVOMOCNOSTI, value);
	}

	public void setIznosZaplijenjenihSredstavaGlavnica(String value) {
		set(PONS_OVRHA__IZNOS_ZAPLIJENJENIH_SREDSTAVA_GLAVNICA, value);
	}

	public void setIznosZaplijenjenihSredstavaKamata(String value) {
		set(PONS_OVRHA__IZNOS_ZAPLIJENJENIH_SREDSTAVA_KAMATA, value);
	}

	public void setModelPbo(String value) {
		set(PONS_OVRHA__MODEL_PBO, value);
	}

	public void setPbo(String value) {
		set(PONS_OVRHA__PBO, value);
	}

	public void setSifraIzdavateljaOsnove(String value) {
		set(PONS_OVRHA__SIFRA_IZDAVATELJA_OSNOVE, value);
	}

	public void setMjestoIzdavateljaOsnove(String value) {
		set(PONS_OVRHA__MJESTO_IZDAVATELJA_OSNOVE, value);
	}

	public void setPrimjedba(String value) {
		set(PONS_OVRHA__PRIMJEDBA, value);
	}

	public void setOperaterUnosa(String value) {
		set(PONS_OVRHA__OPERATER_UNOSA, value);
	}

	public void setVrijemeUnosa(Calendar value) {
		setCalendarAsDateString(value, PONS_OVRHA__VRIJEME_UNOSA);
	}

	public void setOperaterPosljednjeIzmjene(String value) {
		set(PONS_OVRHA__OPERATER_POSLJEDNJE_IZMJENE, value);
	}

	public void setDatumPosljednjeIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				PONS_OVRHA__DATUM_POSLJEDNJE_IZMJENE);
	}

	public void setKorisnik(String value) {
		set(PONS_OVRHA__KORISNIK, value);
	}

	public void setRazinaBlokade(String value) {
		set(PONS_OVRHA__RAZINA_BLOKADE, value);
	}

	public void setDatumZadnjeObracunateKamate(Calendar value) {
		setCalendarAsDateString(value,
				PONS_OVRHA__DATUM_ZADNJE_OBRACUNATE_KAMATE);
	}

	public void setTip(String value) {
		set(PONS_OVRHA__TIP, value);
	}

	public void setIznos(String value) {
		set(PONS_OVRHA__IZNOS, value);
	}

	public void setIznosZapljene(String value) {
		set(PONS_OVRHA__IZNOS_ZAPLJENE, value);
	}

	public void setDatumPocetkaVazenja(Calendar value) {
		setCalendarAsDateString(value,
				PONS_OVRHA__DATUM_POCETKA_VAZENJA);
	}

	public void setDatumPrestankaVazenja(Calendar value) {
		setCalendarAsDateString(value,
				PONS_OVRHA__DATUM_PRESTANKA_VAZENJA);
	}

	public void setRacunOvrsenikaDodatno(String value) {
		set(PONS_OVRHA__RACUN_OVRSENIKA_DODATNO, value);
	}

	public void setTipPodataka(String value) {
		set(PONS_OVRHA__TIP_PODATAKA, value);
	}

	public void setRacunTerecenja(String value) {
		set(PONS_OVRHA__RACUN_TERECENJA, value);
	}

	public void setIdRacuna(String value) {
		set(PONS_OVRHA__ID_RACUNA, value);
	}

	public void setBrojPaketa(String value) {
		set(PONS_OVRHA__BROJ_PAKETA, value);
	}

	public void setIspravno(String value) {
		set(PONS_OVRHA__ISPRAVNO, value);
	}
}