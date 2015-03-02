package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/************* CONSTANTS naplata_gr_ssp ************/

public class NaplataGrSspVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String NAPLATA_GR_SSP__ID_BILJESKE = "id_biljeske";
	public static String NAPLATA_GR_SSP__OIB = "oib";
	public static String NAPLATA_GR_SSP__BROJ_PARTIJE = "broj_partije";
	public static String NAPLATA_GR_SSP__VRSTA = "vrsta";
	public static String NAPLATA_GR_SSP__TIP = "tip";
	public static String NAPLATA_GR_SSP__DATUM_DOGADAJA = "datum_dogadaja";
	public static String NAPLATA_GR_SSP__OPIS_SITUACIJE = "opis_situacije";
	public static String NAPLATA_GR_SSP__ODGOVOR_KLIJENTA = "odgovor_klijenta";
	public static String NAPLATA_GR_SSP__PREPORUKA_SLUZBE = "preporuka_sluzbe";
	public static String NAPLATA_GR_SSP__ODLUKA_UPRAVE = "odluka_uprave";
	public static String NAPLATA_GR_SSP__DATUM_SSP = "datum_ssp";
	public static String NAPLATA_GR_SSP__REFERENT = "referent";
	public static String NAPLATA_GR_SSP__ULICA = "ulica";
	public static String NAPLATA_GR_SSP__POSTANSKI_BROJ = "postanski_broj";
	public static String NAPLATA_GR_SSP__MJESTO = "mjesto";
	public static String NAPLATA_GR_SSP__STATUS_PREDMETA = "status_predmeta";
	public static String NAPLATA_GR_SSP__REFERENT_DUZNIKOV = "referent_duznikov";
	public static String NAPLATA_GR_SSP__RADNI_ODNOS = "radni_odnos";
	public static String NAPLATA_GR_SSP__POSLODAVAC = "poslodavac";
	public static String NAPLATA_GR_SSP__NOVCANA_NAKNADA = "novcana_naknada";
	public static String NAPLATA_GR_SSP__SIFRA_AKTIVNOSTI = "sifra_aktivnosti";
	public static String NAPLATA_GR_SSP__OPIS_AKTIVNOSTI = "opis_aktivnosti";
	public static String NAPLATA_GR_SSP__KONTAKT_OSTVAREN = "kontakt_ostvaren";
	public static String NAPLATA_GR_SSP__DOGOVOR_OSTVAREN = "dogovor_ostvaren";
	public static String NAPLATA_GR_SSP__KOMENTAR = "komentar";
	public static String NAPLATA_GR_SSP__VRSTA_KONTAKTA = "vrsta_kontakta";
	public static String NAPLATA_GR_SSP__DATUM_UPLATE = "datum_uplate";
	public static String NAPLATA_GR_SSP__IZNOS = "iznos";
	public static String NAPLATA_GR_SSP__IZNOS_DJELOMICNO = "iznos_djelomicno";
	public static String NAPLATA_GR_SSP__DATUM_BUDUCEG_KONTAKTA = "datum_buduceg_kontakta";
	public static String NAPLATA_GR_SSP__PERIODIKA = "periodika";
	public static String NAPLATA_GR_SSP__IZNOS_RATE = "iznos_rate";
	public static String NAPLATA_GR_SSP__BROJ_RATA = "broj_rata";
	public static String NAPLATA_GR_SSP__DATUM_PREDAJE_SPISA = "datum_predaje_spisa";
	public static String NAPLATA_GR_SSP__DATUM_PODNOSENJA = "datum_podnosenja";
	public static String NAPLATA_GR_SSP__VRSTA_OVRHE = "vrsta_ovrhe";
	public static String NAPLATA_GR_SSP__JAVNI_BILJEZNIK = "javni_biljeznik";
	public static String NAPLATA_GR_SSP__SUD = "sud";
	public static String NAPLATA_GR_SSP__DATUM_POTVRDE = "datum_potvrde";
	public static String NAPLATA_GR_SSP__BROJ_OVRHE = "broj_ovrhe";
	public static String NAPLATA_GR_SSP__BROJ_OVRHE_PREFIKS = "broj_ovrhe_prefiks";
	public static String NAPLATA_GR_SSP__BROJ_OVRHE_BROJ = "broj_ovrhe_broj";
	public static String NAPLATA_GR_SSP__BROJ_OVRHE_GODINA = "broj_ovrhe_godina";
	public static String NAPLATA_GR_SSP__IZNOS_UTUZENJA = "iznos_utuzenja";
	public static String NAPLATA_GR_SSP__TROSAK_OVRHE = "trosak_ovrhe";
	public static String NAPLATA_GR_SSP__DATUM_OVRHE = "datum_ovrhe";
	public static String NAPLATA_GR_SSP__DATUM_PRAVOMOCNOSTI = "datum_pravomocnosti";
	public static String NAPLATA_GR_SSP__DATUM_PRIMITKA_PRAVOMOCNOSTI = "datum_primitka_pravomocnosti";
	public static String NAPLATA_GR_SSP__DATUM_FINA = "datum_fina";
	public static String NAPLATA_GR_SSP__DATUM_PRIMITKA_OVRV = "datum_primitka_ovrv";
	public static String NAPLATA_GR_SSP__DATUM_POVLACENJA_FINA = "datum_povlacenja_fina";
	public static String NAPLATA_GR_SSP__DATUM_POVLACENJA_JB = "datum_povlacenja_jb";
	public static String NAPLATA_GR_SSP__PRIMATELJ = "primatelj";
	public static String NAPLATA_GR_SSP__PRIMATELJ_NAZIV = "primatelj_naziv";
	public static String NAPLATA_GR_SSP__VRSTA_TROSKA = "vrsta_troska";
	public static String NAPLATA_GR_SSP__PODNOSITELJ = "podnositelj";
	public static String NAPLATA_GR_SSP__PLACENO = "placeno";
	public static String NAPLATA_GR_SSP__VRSTA_VEZA_BRISATI = "vrsta_veza_brisati";
	public static String NAPLATA_GR_SSP__DOPIS_NAZIV = "dopis_naziv";
	public static String NAPLATA_GR_SSP__DATUM_IZDAVANJA = "datum_izdavanja";
	public static String NAPLATA_GR_SSP__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";
	public static String NAPLATA_GR_SSP__KORISTI_ALT_ADRESU = "koristi_alt_adresu";
	public static String NAPLATA_GR_SSP__KLIJENT_POKOJNI = "klijent_pokojni";
	public static String NAPLATA_GR_SSP__DATUM_SMRTI_KLIJENTA = "datum_smrti_klijenta";
	public static String NAPLATA_GR_SSP__DATUM_RJESENJA = "datum_rjesenja";
	public static String NAPLATA_GR_SSP__DATUM_PRAVOMOCNOSTI_RJESENJA = "datum_pravomocnosti_rjesenja";
	public static String NAPLATA_GR_SSP__BROJ_RJESENJA = "broj_rjesenja";
	public static String NAPLATA_GR_SSP__OIB_NASLJEDNIKA = "oib_nasljednika";
	public static String NAPLATA_GR_SSP__NAZIV_NASLJEDNIKA = "naziv_nasljednika";
	public static String NAPLATA_GR_SSP__DATUM_NAGODBE = "datum_nagodbe";
	public static String NAPLATA_GR_SSP__STANJE_NA_DAN_NAGODBE = "stanje_na_dan_nagodbe";
	public static String NAPLATA_GR_SSP__POTPISNIK_NAGODBE = "potpisnik_nagodbe";
	public static String NAPLATA_GR_SSP__VALJANOST_NAGODBE = "valjanost_nagodbe";
	public static String NAPLATA_GR_SSP__ZA_SLUZBU = "za_sluzbu";
	public static String NAPLATA_GR_SSP__ID_BILJESKE_VEZA = "id_biljeske_veza";
	public static String NAPLATA_GR_SSP__ISPRAVNO = "ispravno";
	public static String NAPLATA_GR_SSP__ID_TEMP = "id_temp";
	public static String NAPLATA_GR_SSP__DATUM_OTPLATNOG_PLANA = "datum_otplatnog_plana";
	public static String NAPLATA_GR_SSP__KOMENTAR_PLANA_OTPLATE = "komentar_plana_otplate";
	public static String NAPLATA_GR_SSP__BROJ = "broj";

	public NaplataGrSspVo() {
		super();
	}

	public NaplataGrSspVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdBiljeske() {
		return get(NAPLATA_GR_SSP__ID_BILJESKE);
	}

	public String getOib() {
		return get(NAPLATA_GR_SSP__OIB);
	}

	public String getBrojPartije() {
		return get(NAPLATA_GR_SSP__BROJ_PARTIJE);
	}

	public String getVrsta() {
		return get(NAPLATA_GR_SSP__VRSTA);
	}

	public String getTip() {
		return get(NAPLATA_GR_SSP__TIP);
	}

	public Calendar getDatumDogadaja() {
		return getAsCalendar(NAPLATA_GR_SSP__DATUM_DOGADAJA);
	}

	public String getOpisSituacije() {
		return get(NAPLATA_GR_SSP__OPIS_SITUACIJE);
	}

	public String getOdgovorKlijenta() {
		return get(NAPLATA_GR_SSP__ODGOVOR_KLIJENTA);
	}

	public String getPreporukaSluzbe() {
		return get(NAPLATA_GR_SSP__PREPORUKA_SLUZBE);
	}

	public String getOdlukaUprave() {
		return get(NAPLATA_GR_SSP__ODLUKA_UPRAVE);
	}

	public Calendar getDatumSsp() {
		return getAsCalendar(NAPLATA_GR_SSP__DATUM_SSP);
	}

	public String getReferent() {
		return get(NAPLATA_GR_SSP__REFERENT);
	}

	public String getUlica() {
		return get(NAPLATA_GR_SSP__ULICA);
	}

	public String getPostanskiBroj() {
		return get(NAPLATA_GR_SSP__POSTANSKI_BROJ);
	}

	public String getMjesto() {
		return get(NAPLATA_GR_SSP__MJESTO);
	}

	public String getStatusPredmeta() {
		return get(NAPLATA_GR_SSP__STATUS_PREDMETA);
	}

	public String getReferentDuznikov() {
		return get(NAPLATA_GR_SSP__REFERENT_DUZNIKOV);
	}

	public String getRadniOdnos() {
		return get(NAPLATA_GR_SSP__RADNI_ODNOS);
	}

	public String getPoslodavac() {
		return get(NAPLATA_GR_SSP__POSLODAVAC);
	}

	public String getNovcanaNaknada() {
		return get(NAPLATA_GR_SSP__NOVCANA_NAKNADA);
	}

	public String getSifraAktivnosti() {
		return get(NAPLATA_GR_SSP__SIFRA_AKTIVNOSTI);
	}

	public String getOpisAktivnosti() {
		return get(NAPLATA_GR_SSP__OPIS_AKTIVNOSTI);
	}

	public String getKontaktOstvaren() {
		return get(NAPLATA_GR_SSP__KONTAKT_OSTVAREN);
	}

	public String getDogovorOstvaren() {
		return get(NAPLATA_GR_SSP__DOGOVOR_OSTVAREN);
	}

	public String getKomentar() {
		return get(NAPLATA_GR_SSP__KOMENTAR);
	}

	public String getVrstaKontakta() {
		return get(NAPLATA_GR_SSP__VRSTA_KONTAKTA);
	}

	// public Calendar getDatumUplate() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_UPLATE);
	// }

	public String getIznos() {
		return get(NAPLATA_GR_SSP__IZNOS);
	}

	public String getIznosDjelomicno() {
		return get(NAPLATA_GR_SSP__IZNOS_DJELOMICNO);
	}

	// public Calendar getDatumBuducegKontakta() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_BUDUCEG_KONTAKTA);
	// }

	public String getPeriodika() {
		return get(NAPLATA_GR_SSP__PERIODIKA);
	}

	public String getIznosRate() {
		return get(NAPLATA_GR_SSP__IZNOS_RATE);
	}

	public String getBrojRata() {
		return get(NAPLATA_GR_SSP__BROJ_RATA);
	}

	// public Calendar getDatumPredajeSpisa() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_PREDAJE_SPISA);
	// }

	// public Calendar getDatumPodnosenja() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_PODNOSENJA);
	// }

	public String getVrstaOvrhe() {
		return get(NAPLATA_GR_SSP__VRSTA_OVRHE);
	}

	public String getJavniBiljeznik() {
		return get(NAPLATA_GR_SSP__JAVNI_BILJEZNIK);
	}

	public String getSud() {
		return get(NAPLATA_GR_SSP__SUD);
	}

	// public Calendar getDatumPotvrde() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_POTVRDE);
	// }

	public String getBrojOvrhe() {
		return get(NAPLATA_GR_SSP__BROJ_OVRHE);
	}

	public String getBrojOvrhePrefiks() {
		return get(NAPLATA_GR_SSP__BROJ_OVRHE_PREFIKS);
	}

	public String getBrojOvrheBroj() {
		return get(NAPLATA_GR_SSP__BROJ_OVRHE_BROJ);
	}

	public String getBrojOvrheGodina() {
		return get(NAPLATA_GR_SSP__BROJ_OVRHE_GODINA);
	}

	public String getIznosUtuzenja() {
		return get(NAPLATA_GR_SSP__IZNOS_UTUZENJA);
	}

	public String getTrosakOvrhe() {
		return get(NAPLATA_GR_SSP__TROSAK_OVRHE);
	}

	// public Calendar getDatumOvrhe() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_OVRHE);
	// }

	// public Calendar getDatumPravomocnosti() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_PRAVOMOCNOSTI);
	// }

	// public Calendar getDatumPrimitkaPravomocnosti() {
	// return
	// getAsCalendar(NAPLATA_GR_SSP__DATUM_PRIMITKA_PRAVOMOCNOSTI);
	// }

	// public Calendar getDatumFina() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_FINA);
	// }

	// public Calendar getDatumPrimitkaOvrv() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_PRIMITKA_OVRV);
	// }

	// public Calendar getDatumPovlacenjaFina() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_POVLACENJA_FINA);
	// }

	public String getPrimatelj() {
		return get(NAPLATA_GR_SSP__PRIMATELJ);
	}

	public String getPrimateljNaziv() {
		return get(NAPLATA_GR_SSP__PRIMATELJ_NAZIV);
	}

	public String getVrstaTroska() {
		return get(NAPLATA_GR_SSP__VRSTA_TROSKA);
	}

	public String getPodnositelj() {
		return get(NAPLATA_GR_SSP__PODNOSITELJ);
	}

	public String getPlaceno() {
		return get(NAPLATA_GR_SSP__PLACENO);
	}

	public String getVrstaVezaBrisati() {
		return get(NAPLATA_GR_SSP__VRSTA_VEZA_BRISATI);
	}

	public String getDopisNaziv() {
		return get(NAPLATA_GR_SSP__DOPIS_NAZIV);
	}

	public Calendar getDatumIzdavanja() {
		return getAsCalendar(NAPLATA_GR_SSP__DATUM_IZDAVANJA);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(NAPLATA_GR_SSP__VRIJEME_ZADNJE_IZMJENE);
	}

	public String getKoristiAltAdresu() {
		return get(NAPLATA_GR_SSP__KORISTI_ALT_ADRESU);
	}

	public String getKlijentPokojni() {
		return get(NAPLATA_GR_SSP__KLIJENT_POKOJNI);
	}

	// public Calendar getDatumSmrtiKlijenta() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_SMRTI_KLIJENTA);
	// }
	//
	// public Calendar getDatumRjesenja() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_RJESENJA);
	// }

	// public Calendar getDatumPravomocnostiRjesenja() {
	// return
	// getAsCalendar(NAPLATA_GR_SSP__DATUM_PRAVOMOCNOSTI_RJESENJA);
	// }

	public String getBrojRjesenja() {
		return get(NAPLATA_GR_SSP__BROJ_RJESENJA);
	}

	public String getOibNasljednika() {
		return get(NAPLATA_GR_SSP__OIB_NASLJEDNIKA);
	}

	public String getNazivNasljednika() {
		return get(NAPLATA_GR_SSP__NAZIV_NASLJEDNIKA);
	}

	// public Calendar getDatumNagodbe() {
	// return getAsCalendar(NAPLATA_GR_SSP__DATUM_NAGODBE);
	// }

	public String getStanjeNaDanNagodbe() {
		return get(NAPLATA_GR_SSP__STANJE_NA_DAN_NAGODBE);
	}

	public String getPotpisnikNagodbe() {
		return get(NAPLATA_GR_SSP__POTPISNIK_NAGODBE);
	}

	public String getValjanostNagodbe() {
		return get(NAPLATA_GR_SSP__VALJANOST_NAGODBE);
	}

	public String getZaSluzbu() {
		return get(NAPLATA_GR_SSP__ZA_SLUZBU);
	}

	public String getIdBiljeskeVeza() {
		return get(NAPLATA_GR_SSP__ID_BILJESKE_VEZA);
	}

	public String getIspravno() {
		return get(NAPLATA_GR_SSP__ISPRAVNO);
	}

	public Calendar getIdTemp() {
		return getAsCalendar(NAPLATA_GR_SSP__ID_TEMP);
	}

	public Calendar getDatumOtplatnogPlana() {
		return getAsCalendar(NAPLATA_GR_SSP__DATUM_OTPLATNOG_PLANA);
	}

	public String getKomentarPlanaOtplate() {
		return get(NAPLATA_GR_SSP__KOMENTAR_PLANA_OTPLATE);
	}

	public String getBroj() {
		return get(NAPLATA_GR_SSP__BROJ);
	}

	/************* SETTERS ************/

	public void setIdBiljeske(String value) {
		set(NAPLATA_GR_SSP__ID_BILJESKE, value);
	}

	public void setOib(String value) {
		set(NAPLATA_GR_SSP__OIB, value);
	}

	public void setBrojPartije(String value) {
		set(NAPLATA_GR_SSP__BROJ_PARTIJE, value);
	}

	public void setVrsta(String value) {
		set(NAPLATA_GR_SSP__VRSTA, value);
	}

	public void setTip(String value) {
		set(NAPLATA_GR_SSP__TIP, value);
	}

	public void setDatumDogadaja(Calendar value) {
		setCalendarAsDateString(value, NAPLATA_GR_SSP__DATUM_DOGADAJA);
	}

	public void setOpisSituacije(String value) {
		set(NAPLATA_GR_SSP__OPIS_SITUACIJE, value);
	}

	public void setOdgovorKlijenta(String value) {
		set(NAPLATA_GR_SSP__ODGOVOR_KLIJENTA, value);
	}

	public void setPreporukaSluzbe(String value) {
		set(NAPLATA_GR_SSP__PREPORUKA_SLUZBE, value);
	}

	public void setOdlukaUprave(String value) {
		set(NAPLATA_GR_SSP__ODLUKA_UPRAVE, value);
	}

	public void setDatumSsp(Calendar value) {
		setCalendarAsDateString(value, NAPLATA_GR_SSP__DATUM_SSP);
	}

	public void setReferent(String value) {
		set(NAPLATA_GR_SSP__REFERENT, value);
	}

	public void setUlica(String value) {
		set(NAPLATA_GR_SSP__ULICA, value);
	}

	public void setPostanskiBroj(String value) {
		set(NAPLATA_GR_SSP__POSTANSKI_BROJ, value);
	}

	public void setMjesto(String value) {
		set(NAPLATA_GR_SSP__MJESTO, value);
	}

	public void setStatusPredmeta(String value) {
		set(NAPLATA_GR_SSP__STATUS_PREDMETA, value);
	}

	public void setReferentDuznikov(String value) {
		set(NAPLATA_GR_SSP__REFERENT_DUZNIKOV, value);
	}

	public void setRadniOdnos(String value) {
		set(NAPLATA_GR_SSP__RADNI_ODNOS, value);
	}

	public void setPoslodavac(String value) {
		set(NAPLATA_GR_SSP__POSLODAVAC, value);
	}

	public void setNovcanaNaknada(String value) {
		set(NAPLATA_GR_SSP__NOVCANA_NAKNADA, value);
	}

	public void setSifraAktivnosti(String value) {
		set(NAPLATA_GR_SSP__SIFRA_AKTIVNOSTI, value);
	}

	public void setOpisAktivnosti(String value) {
		set(NAPLATA_GR_SSP__OPIS_AKTIVNOSTI, value);
	}

	public void setKontaktOstvaren(String value) {
		set(NAPLATA_GR_SSP__KONTAKT_OSTVAREN, value);
	}

	public void setDogovorOstvaren(String value) {
		set(NAPLATA_GR_SSP__DOGOVOR_OSTVAREN, value);
	}

	public void setKomentar(String value) {
		set(NAPLATA_GR_SSP__KOMENTAR, value);
	}

	public void setVrstaKontakta(String value) {
		set(NAPLATA_GR_SSP__VRSTA_KONTAKTA, value);
	}

	// public void setDatumUplate(Calendar value) {
	// setCalendarAsDateString(value, NAPLATA_GR_SSP__DATUM_UPLATE);
	// }

	public void setIznos(String value) {
		set(NAPLATA_GR_SSP__IZNOS, value);
	}

	public void setIznosDjelomicno(String value) {
		set(NAPLATA_GR_SSP__IZNOS_DJELOMICNO, value);
	}

	// public void setDatumBuducegKontakta(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_GR_SSP__DATUM_BUDUCEG_KONTAKTA);
	// }

	public void setPeriodika(String value) {
		set(NAPLATA_GR_SSP__PERIODIKA, value);
	}

	public void setIznosRate(String value) {
		set(NAPLATA_GR_SSP__IZNOS_RATE, value);
	}

	public void setBrojRata(String value) {
		set(NAPLATA_GR_SSP__BROJ_RATA, value);
	}

	// public void setDatumPredajeSpisa(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_GR_SSP__DATUM_PREDAJE_SPISA);
	// }

	// public void setDatumPodnosenja(Calendar value) {
	// setCalendarAsDateString(value, NAPLATA_GR_SSP__DATUM_PODNOSENJA);
	// }

	public void setVrstaOvrhe(String value) {
		set(NAPLATA_GR_SSP__VRSTA_OVRHE, value);
	}

	public void setJavniBiljeznik(String value) {
		set(NAPLATA_GR_SSP__JAVNI_BILJEZNIK, value);
	}

	public void setSud(String value) {
		set(NAPLATA_GR_SSP__SUD, value);
	}

	// public void setDatumPotvrde(Calendar value) {
	// setCalendarAsDateString(value, NAPLATA_GR_SSP__DATUM_POTVRDE);
	// }

	public void setBrojOvrhe(String value) {
		set(NAPLATA_GR_SSP__BROJ_OVRHE, value);
	}

	public void setBrojOvrhePrefiks(String value) {
		set(NAPLATA_GR_SSP__BROJ_OVRHE_PREFIKS, value);
	}

	public void setBrojOvrheBroj(String value) {
		set(NAPLATA_GR_SSP__BROJ_OVRHE_BROJ, value);
	}

	public void setBrojOvrheGodina(String value) {
		set(NAPLATA_GR_SSP__BROJ_OVRHE_GODINA, value);
	}

	public void setIznosUtuzenja(String value) {
		set(NAPLATA_GR_SSP__IZNOS_UTUZENJA, value);
	}

	public void setTrosakOvrhe(String value) {
		set(NAPLATA_GR_SSP__TROSAK_OVRHE, value);
	}

	// public void setDatumOvrhe(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_GR_SSP__DATUM_OVRHE);
	// }

	// public void setDatumPravomocnosti(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_GR_SSP__DATUM_PRAVOMOCNOSTI);
	// }

	// public void setDatumPrimitkaPravomocnosti(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_GR_SSP__DATUM_PRIMITKA_PRAVOMOCNOSTI);
	// }

	// public void setDatumFina(Calendar value) {
	// setCalendarAsDateString(value, NAPLATA_GR_SSP__DATUM_FINA);
	// }

	// public void setDatumPrimitkaOvrv(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_GR_SSP__DATUM_PRIMITKA_OVRV);
	// }

	// public void setDatumPovlacenjaFina(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_GR_SSP__DATUM_POVLACENJA_FINA);
	// }

	public void setPrimatelj(String value) {
		set(NAPLATA_GR_SSP__PRIMATELJ, value);
	}

	public void setPrimateljNaziv(String value) {
		set(NAPLATA_GR_SSP__PRIMATELJ_NAZIV, value);
	}

	public void setVrstaTroska(String value) {
		set(NAPLATA_GR_SSP__VRSTA_TROSKA, value);
	}

	public void setPodnositelj(String value) {
		set(NAPLATA_GR_SSP__PODNOSITELJ, value);
	}

	public void setPlaceno(String value) {
		set(NAPLATA_GR_SSP__PLACENO, value);
	}

	public void setVrstaVezaBrisati(String value) {
		set(NAPLATA_GR_SSP__VRSTA_VEZA_BRISATI, value);
	}

	public void setDopisNaziv(String value) {
		set(NAPLATA_GR_SSP__DOPIS_NAZIV, value);
	}

	public void setDatumIzdavanja(Calendar value) {
		setCalendarAsDateString(value, NAPLATA_GR_SSP__DATUM_IZDAVANJA);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_GR_SSP__VRIJEME_ZADNJE_IZMJENE);
	}

	public void setKoristiAltAdresu(String value) {
		set(NAPLATA_GR_SSP__KORISTI_ALT_ADRESU, value);
	}

	public void setKlijentPokojni(String value) {
		set(NAPLATA_GR_SSP__KLIJENT_POKOJNI, value);
	}

	// public void setDatumSmrtiKlijenta(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_GR_SSP__DATUM_SMRTI_KLIJENTA);
	// }
	//
	// public void setDatumRjesenja(Calendar value) {
	// setCalendarAsDateString(value, NAPLATA_GR_SSP__DATUM_RJESENJA);
	// }

	// public void setDatumPravomocnostiRjesenja(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_GR_SSP__DATUM_PRAVOMOCNOSTI_RJESENJA);
	// }

	public void setBrojRjesenja(String value) {
		set(NAPLATA_GR_SSP__BROJ_RJESENJA, value);
	}

	public void setOibNasljednika(String value) {
		set(NAPLATA_GR_SSP__OIB_NASLJEDNIKA, value);
	}

	public void setNazivNasljednika(String value) {
		set(NAPLATA_GR_SSP__NAZIV_NASLJEDNIKA, value);
	}

	// public void setDatumNagodbe(Calendar value) {
	// setCalendarAsDateString(value, NAPLATA_GR_SSP__DATUM_NAGODBE);
	// }

	public void setStanjeNaDanNagodbe(String value) {
		set(NAPLATA_GR_SSP__STANJE_NA_DAN_NAGODBE, value);
	}

	public void setPotpisnikNagodbe(String value) {
		set(NAPLATA_GR_SSP__POTPISNIK_NAGODBE, value);
	}

	public void setValjanostNagodbe(String value) {
		set(NAPLATA_GR_SSP__VALJANOST_NAGODBE, value);
	}

	public void setZaSluzbu(String value) {
		set(NAPLATA_GR_SSP__ZA_SLUZBU, value);
	}

	public void setIdBiljeskeVeza(String value) {
		set(NAPLATA_GR_SSP__ID_BILJESKE_VEZA, value);
	}

	public void setIspravno(String value) {
		set(NAPLATA_GR_SSP__ISPRAVNO, value);
	}

	public void setIdTemp(Calendar value) {
		setCalendarAsDateString(value, NAPLATA_GR_SSP__ID_TEMP);
	}

	public void setDatumOtplatnogPlana(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_GR_SSP__DATUM_OTPLATNOG_PLANA);
	}

	public void setKomentarPlanaOtplate(String value) {
		set(NAPLATA_GR_SSP__KOMENTAR_PLANA_OTPLATE, value);
	}

	public void setBroj(String value) {
		set(NAPLATA_GR_SSP__BROJ, value);
	}
}