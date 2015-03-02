package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class CmdbImovinaVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_IMOVINA__ID_IMOVINE = "id_imovine";
	public static String CMDB_IMOVINA__ID_KATEGORIJE = "id_kategorije";
	public static String CMDB_IMOVINA__ID_DOBAVLJACA = "id_dobavljaca";
	public static String CMDB_IMOVINA__VRSTA = "vrsta";
	public static String CMDB_IMOVINA__NAZIV = "naziv";
	public static String CMDB_IMOVINA__ID_LOKACIJE = "id_lokacije";
	public static String CMDB_IMOVINA__ID_ZGRADE = "id_zgrade";
	public static String CMDB_IMOVINA__KAT = "kat";
	public static String CMDB_IMOVINA__OZNAKA_SOBE = "oznaka_sobe";
	public static String CMDB_IMOVINA__ORMAR = "ormar";
	public static String CMDB_IMOVINA__ZADUZENA_OSOBA = "zaduzena_osoba";
	public static String CMDB_IMOVINA__ZADUZENA_OSOBA_NAZIV = "zaduzena_osoba_naziv";
	public static String CMDB_IMOVINA__ODGOVORNA_OSOBA = "odgovorna_osoba";
	public static String CMDB_IMOVINA__MODEL = "model";
	public static String CMDB_IMOVINA__SERIJSKI_BROJ = "serijski_broj";
	public static String CMDB_IMOVINA__SERIJSKI_BROJ2 = "serijski_broj2";
	public static String CMDB_IMOVINA__INVENTURNI_BROJ = "inventurni_broj";
	public static String CMDB_IMOVINA__DATUM_PORIJEKLA = "datum_porijekla";
	public static String CMDB_IMOVINA__JEDINSTVENA_OZNAKA = "jedinstvena_oznaka";
	public static String CMDB_IMOVINA__OPIS = "opis";
	public static String CMDB_IMOVINA__VRIJEDNOST_KNJIGOVODSTVENA = "vrijednost_knjigovodstvena";
	public static String CMDB_IMOVINA__VRIJEDNOST_AMORTIZIRANA = "vrijednost_amortizirana";
	public static String CMDB_IMOVINA__VRIJEDNOST_PROCJENJENA = "vrijednost_procjenjena";
	public static String CMDB_IMOVINA__VALUTA_PROCJENE = "valuta_procjene";
	public static String CMDB_IMOVINA__INACICA = "inacica";
	public static String CMDB_IMOVINA__IP_ADRESA_PRIVATNA = "ip_adresa_privatna";
	public static String CMDB_IMOVINA__IP_ADRESA_JAVNA = "ip_adresa_javna";
	public static String CMDB_IMOVINA__DOMENA = "domena";
	public static String CMDB_IMOVINA__HARDVER_HOST = "hardver_host";
	public static String CMDB_IMOVINA__HARDVER_OPERATIVNI_SUSTAV = "hardver_operativni_sustav";
	public static String CMDB_IMOVINA__HARDVER_SOFTVER = "hardver_softver";
	public static String CMDB_IMOVINA__HARDVER_DOMENA = "hardver_domena";
	public static String CMDB_IMOVINA__HARDVER_OTVORNI_PORTOVI = "hardver_otvorni_portovi";
	public static String CMDB_IMOVINA__HARDVER_RANJIVOSTI = "hardver_ranjivosti";
	public static String CMDB_IMOVINA__HARDVER_LICENCA = "hardver_licenca";
	public static String CMDB_IMOVINA__HARDVER_OS_VRSTA = "hardver_os_vrsta";
	public static String CMDB_IMOVINA__BROJ_KORISNIKA = "broj_korisnika";
	public static String CMDB_IMOVINA__KORISNICI = "korisnici";
	public static String CMDB_IMOVINA__DOWNLOAD_LOKACIJA = "download_lokacija";
	public static String CMDB_IMOVINA__LICENCA = "licenca";
	public static String CMDB_IMOVINA__AKT_AUTOR = "akt_autor";
	public static String CMDB_IMOVINA__AKT_FRENKVENCIJA_OSVJEZAVANJA = "akt_frenkvencija_osvjezavanja";
	public static String CMDB_IMOVINA__AKT_ZADNJE_OSVJEZENJE = "akt_zadnje_osvjezenje";
	public static String CMDB_IMOVINA__AKT_POCETAK_PRIMJENE = "akt_pocetak_primjene";
	public static String CMDB_IMOVINA__AKT_DATUM_UKIDANJA = "akt_datum_ukidanja";
	public static String CMDB_IMOVINA__AKT_KONZULTIRA_SE = "akt_konzultira_se";
	public static String CMDB_IMOVINA__AKT_INFORMAIRA_SE = "akt_informaira_se";
	public static String CMDB_IMOVINA__AKT_HTTP_LINK = "akt_http_link";
	public static String CMDB_IMOVINA__AKT_POTPISIK = "akt_potpisik";
	public static String CMDB_IMOVINA__AKT_IME_PREZIME = "akt_ime_prezime";
	public static String CMDB_IMOVINA__AKT_ZADUZENA_OSOBA = "akt_zaduzena_osoba";
	public static String CMDB_IMOVINA__AKT_ZADUZENA_OSOBA_IME_PREZIME = "akt_zaduzena_osoba_ime_prezime";
	public static String CMDB_IMOVINA__AKT_ZADUZEMA_OSOBA_ZAMJENA = "akt_zaduzema_osoba_zamjena";
	public static String CMDB_IMOVINA__AKT_ZADUZENA_OSOBA_ZAMJENA_IME_PREZIME = "akt_zaduzena_osoba_zamjena_ime_prezime";
	public static String CMDB_IMOVINA__AKT_TIP = "akt_tip";
	public static String CMDB_IMOVINA__AKT_ID_AKTA = "akt_id_akta";
	public static String CMDB_IMOVINA__AKT_POVJERLJIVOST = "akt_povjerljivost";
	public static String CMDB_IMOVINA__STATUS = "status";
	public static String CMDB_IMOVINA__VRIJEME_UNOSA = "vrijeme_unosa";
	public static String CMDB_IMOVINA__ISPRAVNO = "ispravno";
	public static String CMDB_IMOVINA__OZNAKA_RADNIKA = "oznaka_radnika";
	public static String CMDB_IMOVINA__AKCIJA = "akcija";
	public static String CMDB_IMOVINA__DATUM_AKCIJE = "datum_akcije";
	public static String CMDB_IMOVINA__VEZA_ZAHTJEV = "veza_zahtjev";
	public static String CMDB_IMOVINA__ID_POVIJESTI = "id_povijesti";
	public static String CMDB_IMOVINA__KONTAKT_OSOBA = "kontakt_osoba";
	public static String CMDB_IMOVINA__OSOBA_PRIJAVE = "osoba_prijave";
	public static String CMDB_IMOVINA__IZVRSENI_RADOVI = "izvrseni_radovi";
	public static String CMDB_IMOVINA__UTROSEN_MATERIJAL = "utrosen_materijal";
	public static String CMDB_IMOVINA__ZAPAZANJA = "zapazanja";
	public static String CMDB_IMOVINA__KVAR_OTKLONJEN = "kvar_otklonjen";
	public static String CMDB_IMOVINA__DATUM_OTKLANJANJA = "datum_otklanjanja";
	public static String CMDB_IMOVINA__TEHNICAR = "tehnicar";
	public static String CMDB_IMOVINA__ZAHTJEVI = "zahtjevi";

	/* Attributes names /> */
	/* </ Constructors */
	public CmdbImovinaVo() {
		super();
	}

	public CmdbImovinaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getZahtjevi() {
		return getAsString(CMDB_IMOVINA__ZAHTJEVI);
	}

	public String getIdImovine() {
		return getAsString(CMDB_IMOVINA__ID_IMOVINE);
	}

	public String getIdKategorije() {
		return getAsString(CMDB_IMOVINA__ID_KATEGORIJE);
	}

	public String getIdDobavljaca() {
		return getAsString(CMDB_IMOVINA__ID_DOBAVLJACA);
	}

	public String getVrsta() {
		return getAsString(CMDB_IMOVINA__VRSTA);
	}

	public String getNaziv() {
		return getAsString(CMDB_IMOVINA__NAZIV);
	}

	public String getIdLokacije() {
		return getAsString(CMDB_IMOVINA__ID_LOKACIJE);
	}

	public String getIdZgrade() {
		return getAsString(CMDB_IMOVINA__ID_ZGRADE);
	}

	public String getKat() {
		return getAsString(CMDB_IMOVINA__KAT);
	}

	public String getOznakaSobe() {
		return getAsString(CMDB_IMOVINA__OZNAKA_SOBE);
	}

	public String getOrmar() {
		return getAsString(CMDB_IMOVINA__ORMAR);
	}

	public String getZaduzenaOsoba() {
		return getAsString(CMDB_IMOVINA__ZADUZENA_OSOBA);
	}

	public String getZaduzenaOsobaNaziv() {
		return getAsString(CMDB_IMOVINA__ZADUZENA_OSOBA_NAZIV);
	}

	public String getOdgovornaOsoba() {
		return getAsString(CMDB_IMOVINA__ODGOVORNA_OSOBA);
	}

	public String getModel() {
		return getAsString(CMDB_IMOVINA__MODEL);
	}

	public String getSerijskiBroj() {
		return getAsString(CMDB_IMOVINA__SERIJSKI_BROJ);
	}

	public String getSerijskiBroj2() {
		return getAsString(CMDB_IMOVINA__SERIJSKI_BROJ2);
	}

	public String getInventurniBroj() {
		return getAsString(CMDB_IMOVINA__INVENTURNI_BROJ);
	}

	public Calendar getDatumPorijekla() {
		return getAsCalendar(CMDB_IMOVINA__DATUM_PORIJEKLA);
	}

	public String getJedinstvenaOznaka() {
		return getAsString(CMDB_IMOVINA__JEDINSTVENA_OZNAKA);
	}

	public String getOpis() {
		return getAsString(CMDB_IMOVINA__OPIS);
	}

	public String getVrijednostKnjigovodstvena() {
		return getAsString(CMDB_IMOVINA__VRIJEDNOST_KNJIGOVODSTVENA);
	}

	public String getVrijednostAmortizirana() {
		return getAsString(CMDB_IMOVINA__VRIJEDNOST_AMORTIZIRANA);
	}

	public String getVrijednostProcjenjena() {
		return getAsString(CMDB_IMOVINA__VRIJEDNOST_PROCJENJENA);
	}

	public String getValutaProcjene() {
		return getAsString(CMDB_IMOVINA__VALUTA_PROCJENE);
	}

	public String getInacica() {
		return getAsString(CMDB_IMOVINA__INACICA);
	}

	public String getIpAdresaPrivatna() {
		return getAsString(CMDB_IMOVINA__IP_ADRESA_PRIVATNA);
	}

	public String getIpAdresaJavna() {
		return getAsString(CMDB_IMOVINA__IP_ADRESA_JAVNA);
	}

	public String getDomena() {
		return getAsString(CMDB_IMOVINA__DOMENA);
	}

	public String getHardverHost() {
		return getAsString(CMDB_IMOVINA__HARDVER_HOST);
	}

	public String getHardverOperativniSustav() {
		return getAsString(CMDB_IMOVINA__HARDVER_OPERATIVNI_SUSTAV);
	}

	public String getHardverSoftver() {
		return getAsString(CMDB_IMOVINA__HARDVER_SOFTVER);
	}

	public String getHardverDomena() {
		return getAsString(CMDB_IMOVINA__HARDVER_DOMENA);
	}

	public String getHardverOtvorniPortovi() {
		return getAsString(CMDB_IMOVINA__HARDVER_OTVORNI_PORTOVI);
	}

	public String getHardverRanjivosti() {
		return getAsString(CMDB_IMOVINA__HARDVER_RANJIVOSTI);
	}

	public String getHardverLicenca() {
		return getAsString(CMDB_IMOVINA__HARDVER_LICENCA);
	}

	public String getHardverOsVrsta() {
		return getAsString(CMDB_IMOVINA__HARDVER_OS_VRSTA);
	}

	public String getBrojKorisnika() {
		return getAsString(CMDB_IMOVINA__BROJ_KORISNIKA);
	}

	public String getKorisnici() {
		return getAsString(CMDB_IMOVINA__KORISNICI);
	}

	public String getDownloadLokacija() {
		return getAsString(CMDB_IMOVINA__DOWNLOAD_LOKACIJA);
	}

	public String getLicenca() {
		return getAsString(CMDB_IMOVINA__LICENCA);
	}

	public String getAktAutor() {
		return getAsString(CMDB_IMOVINA__AKT_AUTOR);
	}

	public String getAktFrenkvencijaOsvjezavanja() {
		return getAsString(CMDB_IMOVINA__AKT_FRENKVENCIJA_OSVJEZAVANJA);
	}

	public Calendar getAktZadnjeOsvjezenje() {
		return getAsCalendar(CMDB_IMOVINA__AKT_ZADNJE_OSVJEZENJE);
	}

	public Calendar getAktPocetakPrimjene() {
		return getAsCalendar(CMDB_IMOVINA__AKT_POCETAK_PRIMJENE);
	}

	public Calendar getAktDatumUkidanja() {
		return getAsCalendar(CMDB_IMOVINA__AKT_DATUM_UKIDANJA);
	}

	public String getAktKonzultiraSe() {
		return getAsString(CMDB_IMOVINA__AKT_KONZULTIRA_SE);
	}

	public String getAktInformairaSe() {
		return getAsString(CMDB_IMOVINA__AKT_INFORMAIRA_SE);
	}

	public String getAktHttpLink() {
		return getAsString(CMDB_IMOVINA__AKT_HTTP_LINK);
	}

	public String getAktPotpisik() {
		return getAsString(CMDB_IMOVINA__AKT_POTPISIK);
	}

	public String getAktImePrezime() {
		return getAsString(CMDB_IMOVINA__AKT_IME_PREZIME);
	}

	public String getAktZaduzenaOsoba() {
		return getAsString(CMDB_IMOVINA__AKT_ZADUZENA_OSOBA);
	}

	public String getAktZaduzenaOsobaImePrezime() {
		return getAsString(CMDB_IMOVINA__AKT_ZADUZENA_OSOBA_IME_PREZIME);
	}

	public String getAktZaduzemaOsobaZamjena() {
		return getAsString(CMDB_IMOVINA__AKT_ZADUZEMA_OSOBA_ZAMJENA);
	}

	public String getAktZaduzenaOsobaZamjenaImePrezime() {
		return getAsString(CMDB_IMOVINA__AKT_ZADUZENA_OSOBA_ZAMJENA_IME_PREZIME);
	}

	public String getAktTip() {
		return getAsString(CMDB_IMOVINA__AKT_TIP);
	}

	public String getAktIdAkta() {
		return getAsString(CMDB_IMOVINA__AKT_ID_AKTA);
	}

	public String getAktPovjerljivost() {
		return getAsString(CMDB_IMOVINA__AKT_POVJERLJIVOST);
	}

	public String getStatus() {
		return getAsString(CMDB_IMOVINA__STATUS);
	}

	public Calendar getVrijemeUnosa() {
		return getAsCalendar(CMDB_IMOVINA__VRIJEME_UNOSA);
	}

	public String getIspravno() {
		return getAsString(CMDB_IMOVINA__ISPRAVNO);
	}

	public String getOznakaRadnika() {
		return getAsString(CMDB_IMOVINA__OZNAKA_RADNIKA);
	}

	public String getAkcija() {
		return getAsString(CMDB_IMOVINA__AKCIJA);
	}

	public Calendar getDatumAkcije() {
		return getAsCalendar(CMDB_IMOVINA__DATUM_AKCIJE);
	}

	public String getVezaZahtjev() {
		return getAsString(CMDB_IMOVINA__VEZA_ZAHTJEV);
	}

	public String getIdPovijesti() {
		return getAsString(CMDB_IMOVINA__ID_POVIJESTI);
	}

	public String getKontaktOsoba() {
		return getAsString(CMDB_IMOVINA__KONTAKT_OSOBA);
	}

	public String getOsobaPrijave() {
		return getAsString(CMDB_IMOVINA__OSOBA_PRIJAVE);
	}

	public String getIzvrseniRadovi() {
		return getAsString(CMDB_IMOVINA__IZVRSENI_RADOVI);
	}

	public String getUtroseniMaterijal() {
		return getAsString(CMDB_IMOVINA__UTROSEN_MATERIJAL);
	}

	public String getZapazanja() {
		return getAsString(CMDB_IMOVINA__ZAPAZANJA);
	}

	public String getKvarOtklonjen() {
		return getAsString(CMDB_IMOVINA__KVAR_OTKLONJEN);
	}

	public Calendar getDatumOtklanjanja() {
		return getAsCalendar(CMDB_IMOVINA__DATUM_OTKLANJANJA);
	}

	public String getTehnicar() {
		return getAsString(CMDB_IMOVINA__TEHNICAR);
	}

	public void setIdImovine(String value) {
		set(CMDB_IMOVINA__ID_IMOVINE, value);
	}

	public void setIdKategorije(String value) {
		set(CMDB_IMOVINA__ID_KATEGORIJE, value);
	}

	public void setIdDobavljaca(String value) {
		set(CMDB_IMOVINA__ID_DOBAVLJACA, value);
	}

	public void setVrsta(String value) {
		set(CMDB_IMOVINA__VRSTA, value);
	}

	public void setNaziv(String value) {
		set(CMDB_IMOVINA__NAZIV, value);
	}

	public void setIdLokacije(String value) {
		set(CMDB_IMOVINA__ID_LOKACIJE, value);
	}

	public void setIdZgrade(String value) {
		set(CMDB_IMOVINA__ID_ZGRADE, value);
	}

	public void setKat(String value) {
		set(CMDB_IMOVINA__KAT, value);
	}

	public void setOznakaSobe(String value) {
		set(CMDB_IMOVINA__OZNAKA_SOBE, value);
	}

	public void setOrmar(String value) {
		set(CMDB_IMOVINA__ORMAR, value);
	}

	public void setZaduzenaOsoba(String value) {
		set(CMDB_IMOVINA__ZADUZENA_OSOBA, value);
	}

	public void setZaduzenaOsobaNaziv(String value) {
		set(CMDB_IMOVINA__ZADUZENA_OSOBA_NAZIV, value);
	}

	public void setOdgovornaOsoba(String value) {
		set(CMDB_IMOVINA__ODGOVORNA_OSOBA, value);
	}

	public void setModel(String value) {
		set(CMDB_IMOVINA__MODEL, value);
	}

	public void setSerijskiBroj(String value) {
		set(CMDB_IMOVINA__SERIJSKI_BROJ, value);
	}

	public void setSerijskiBroj2(String value) {
		set(CMDB_IMOVINA__SERIJSKI_BROJ2, value);
	}

	public void setInventurniBroj(String value) {
		set(CMDB_IMOVINA__INVENTURNI_BROJ, value);
	}

	public void setDatumPorijekla(Calendar value) {
		setCalendarAsDateString(value, CMDB_IMOVINA__DATUM_PORIJEKLA);
	}

	public void setJedinstvenaOznaka(String value) {
		set(CMDB_IMOVINA__JEDINSTVENA_OZNAKA, value);
	}

	public void setOpis(String value) {
		set(CMDB_IMOVINA__OPIS, value);
	}

	public void setVrijednostKnjigovodstvena(String value) {
		set(CMDB_IMOVINA__VRIJEDNOST_KNJIGOVODSTVENA, value);
	}

	public void setVrijednostAmortizirana(String value) {
		set(CMDB_IMOVINA__VRIJEDNOST_AMORTIZIRANA, value);
	}

	public void setVrijednostProcjenjena(String value) {
		set(CMDB_IMOVINA__VRIJEDNOST_PROCJENJENA, value);
	}

	public void setValutaProcjene(String value) {
		set(CMDB_IMOVINA__VALUTA_PROCJENE, value);
	}

	public void setInacica(String value) {
		set(CMDB_IMOVINA__INACICA, value);
	}

	public void setIpAdresaPrivatna(String value) {
		set(CMDB_IMOVINA__IP_ADRESA_PRIVATNA, value);
	}

	public void setIpAdresaJavna(String value) {
		set(CMDB_IMOVINA__IP_ADRESA_JAVNA, value);
	}

	public void setDomena(String value) {
		set(CMDB_IMOVINA__DOMENA, value);
	}

	public void setHardverHost(String value) {
		set(CMDB_IMOVINA__HARDVER_HOST, value);
	}

	public void setHardverOperativniSustav(String value) {
		set(CMDB_IMOVINA__HARDVER_OPERATIVNI_SUSTAV, value);
	}

	public void setHardverSoftver(String value) {
		set(CMDB_IMOVINA__HARDVER_SOFTVER, value);
	}

	public void setHardverDomena(String value) {
		set(CMDB_IMOVINA__HARDVER_DOMENA, value);
	}

	public void setHardverOtvorniPortovi(String value) {
		set(CMDB_IMOVINA__HARDVER_OTVORNI_PORTOVI, value);
	}

	public void setHardverRanjivosti(String value) {
		set(CMDB_IMOVINA__HARDVER_RANJIVOSTI, value);
	}

	public void setHardverLicenca(String value) {
		set(CMDB_IMOVINA__HARDVER_LICENCA, value);
	}

	public void setHardverOsVrsta(String value) {
		set(CMDB_IMOVINA__HARDVER_OS_VRSTA, value);
	}

	public void setBrojKorisnika(String value) {
		set(CMDB_IMOVINA__BROJ_KORISNIKA, value);
	}

	public void setKorisnici(String value) {
		set(CMDB_IMOVINA__KORISNICI, value);
	}

	public void setDownloadLokacija(String value) {
		set(CMDB_IMOVINA__DOWNLOAD_LOKACIJA, value);
	}

	public void setLicenca(String value) {
		set(CMDB_IMOVINA__LICENCA, value);
	}

	public void setAktAutor(String value) {
		set(CMDB_IMOVINA__AKT_AUTOR, value);
	}

	public void setAktFrenkvencijaOsvjezavanja(String value) {
		set(CMDB_IMOVINA__AKT_FRENKVENCIJA_OSVJEZAVANJA, value);
	}

	public void setAktZadnjeOsvjezenje(Calendar value) {
		setCalendarAsDateString(value, CMDB_IMOVINA__AKT_ZADNJE_OSVJEZENJE);
	}

	public void setAktPocetakPrimjene(Calendar value) {
		setCalendarAsDateString(value, CMDB_IMOVINA__AKT_POCETAK_PRIMJENE);
	}

	public void setAktDatumUkidanja(Calendar value) {
		setCalendarAsDateString(value, CMDB_IMOVINA__AKT_DATUM_UKIDANJA);
	}

	public void setAktKonzultiraSe(String value) {
		set(CMDB_IMOVINA__AKT_KONZULTIRA_SE, value);
	}

	public void setAktInformairaSe(String value) {
		set(CMDB_IMOVINA__AKT_INFORMAIRA_SE, value);
	}

	public void setAktHttpLink(String value) {
		set(CMDB_IMOVINA__AKT_HTTP_LINK, value);
	}

	public void setAktPotpisik(String value) {
		set(CMDB_IMOVINA__AKT_POTPISIK, value);
	}

	public void setAktImePrezime(String value) {
		set(CMDB_IMOVINA__AKT_IME_PREZIME, value);
	}

	public void setAktZaduzenaOsoba(String value) {
		set(CMDB_IMOVINA__AKT_ZADUZENA_OSOBA, value);
	}

	public void setAktZaduzenaOsobaImePrezime(String value) {
		set(CMDB_IMOVINA__AKT_ZADUZENA_OSOBA_IME_PREZIME, value);
	}

	public void setAktZaduzemaOsobaZamjena(String value) {
		set(CMDB_IMOVINA__AKT_ZADUZEMA_OSOBA_ZAMJENA, value);
	}

	public void setAktZaduzenaOsobaZamjenaImePrezime(String value) {
		set(CMDB_IMOVINA__AKT_ZADUZENA_OSOBA_ZAMJENA_IME_PREZIME, value);
	}

	public void setAktTip(String value) {
		set(CMDB_IMOVINA__AKT_TIP, value);
	}

	public void setAktIdAkta(String value) {
		set(CMDB_IMOVINA__AKT_ID_AKTA, value);
	}

	public void setAktPovjerljivost(String value) {
		set(CMDB_IMOVINA__AKT_POVJERLJIVOST, value);
	}

	public void setStatus(String value) {
		set(CMDB_IMOVINA__STATUS, value);
	}

	public void setVrijemeUnosa(Calendar value) {
		setCalendarAsDateString(value, CMDB_IMOVINA__VRIJEME_UNOSA);
	}

	public void setIspravno(String value) {
		set(CMDB_IMOVINA__ISPRAVNO, value);
	}

	public void setOznakaRadnika(String value) {
		set(CMDB_IMOVINA__OZNAKA_RADNIKA, value);
	}

	public void setAkcija(String value) {
		set(CMDB_IMOVINA__AKCIJA, value);
	}

	public void setDatumAkcije(Calendar value) {
		setCalendarAsDateString(value, CMDB_IMOVINA__DATUM_AKCIJE);
	}

	public void setVezaZahtjev(String value) {
		set(CMDB_IMOVINA__VEZA_ZAHTJEV, value);
	}

	public void setIdPovijesti(String value) {
		set(CMDB_IMOVINA__ID_POVIJESTI, value);
	}

	public void setKontaktOsoba(String value) {
		set(CMDB_IMOVINA__KONTAKT_OSOBA, value);
	}

	public void setOsobaPrijave(String value) {
		set(CMDB_IMOVINA__OSOBA_PRIJAVE, value);
	}

	public void setIzvrseniRadovi(String value) {
		set(CMDB_IMOVINA__IZVRSENI_RADOVI, value);
	}

	public void setUtrosenMaterijal(String value) {
		set(CMDB_IMOVINA__UTROSEN_MATERIJAL, value);
	}

	public void setZapazanja(String value) {
		set(CMDB_IMOVINA__ZAPAZANJA, value);
	}

	public void setKvarOtklonjen(String value) {
		set(CMDB_IMOVINA__KVAR_OTKLONJEN, value);
	}

	public void setDatumOtklanjanja(Calendar value) {
		setCalendarAsDateString(value, CMDB_IMOVINA__DATUM_OTKLANJANJA);
	}

	public void setTehnicar(String value) {
		set(CMDB_IMOVINA__TEHNICAR, value);
	}

	public void setZahtjevi(String value) {
		set(CMDB_IMOVINA__ZAHTJEVI, value);
	}
	/* Getters/Setters /> */
}