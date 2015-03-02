package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/**
 * 
 */
public class OrDogadajVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_DOGADAJ__ID_DOGADAJA = "id_dogadaja";
	public static String OR_DOGADAJ__SVEOBUHVATNI = "sveobuhvatni";
	public static String OR_DOGADAJ__POTENCIJALNI = "potencijalni";
	public static String OR_DOGADAJ__PROFITNI_CENTAR = "profitni_centar";
	public static String OR_DOGADAJ__DATUM_NASTANKA = "datum_nastanka";
	public static String OR_DOGADAJ__DATUM_OTKRICA = "datum_otkrica";
	public static String OR_DOGADAJ__DATUM_ZATVARANJA = "datum_zatvaranja";
	public static String OR_DOGADAJ__STATUS_OPERATIVNOG_RIZIKA = "status_operativnog_rizika";
	public static String OR_DOGADAJ__STATUS_DOGADAJA = "status_dogadaja";
	public static String OR_DOGADAJ__VRSTA = "vrsta";
	public static String OR_DOGADAJ__ORGANIZACIJSKA_JEDINICA_UNOSA = "organizacijska_jedinica_unosa";
	public static String OR_DOGADAJ__ORGANIZACIJSKA_JEDINICA_DOGADAJA = "organizacijska_jedinica_dogadaja";
	public static String OR_DOGADAJ__VRSTA_KANALA = "vrsta_kanala";
	public static String OR_DOGADAJ__NAZIV_DOGADAJA = "naziv_dogadaja";
	public static String OR_DOGADAJ__OPIS_DOGADAJA = "opis_dogadaja";
	public static String OR_DOGADAJ__KOMENTAR = "komentar";
	public static String OR_DOGADAJ__ANONIMIZACIJA = "anonimizacija";
	public static String OR_DOGADAJ__KOREKTIVNA_AKCIJA = "korektivna_akcija";
	public static String OR_DOGADAJ__TRAJANJE = "trajanje";
	public static String OR_DOGADAJ__INTERNA_KONTROLA = "interna_kontrola";
	public static String OR_DOGADAJ__ODOBRENO = "odobreno";
	public static String OR_DOGADAJ__IZVOR_INFORMACIJA = "izvor_informacija";
	public static String OR_DOGADAJ__VRSTA_PRIJETNJE = "vrsta_prijetnje";
	public static String OR_DOGADAJ__KREDITNI_RIZIK = "kreditni_rizik";
	public static String OR_DOGADAJ__PRAVNI_RIZIK = "pravni_rizik";
	public static String OR_DOGADAJ__TRZISNI_RIZIK = "trzisni_rizik";
	public static String OR_DOGADAJ__UMJESAN_VANJSKI_FAKTOR = "umjesan_vanjski_faktor";
	public static String OR_DOGADAJ__POVJERLJIVOST = "povjerljivost";
	public static String OR_DOGADAJ__OCJENA_IZNOS = "ocjena_iznos";
	public static String OR_DOGADAJ__OCJENA_UCINAK = "ocjena_ucinak";
	public static String OR_DOGADAJ__OCJENA_UCESTALOST = "ocjena_ucestalost";
	public static String OR_DOGADAJ__OCJENA_VISINA_RIZIKA = "ocjena_visina_rizika";
	public static String OR_DOGADAJ__PRIJEDLOG_MJERA = "prijedlog_mjera";
	public static String OR_DOGADAJ__DOGADAJ_OSIGURAN = "dogadaj_osiguran";
	public static String OR_DOGADAJ__ID_ZGRADE = "id_zgrade";
	public static String OR_DOGADAJ__KAT = "kat";
	public static String OR_DOGADAJ__OZNAKA_SOBE = "oznaka_sobe";
	public static String OR_DOGADAJ__DJELATNIK = "djelatnik";
	public static String OR_DOGADAJ__SLIKA = "slika";
	public static String OR_DOGADAJ__PRILOG = "prilog";
	public static String OR_DOGADAJ__OPERATER_UNOSA = "operater_unosa";
	public static String OR_DOGADAJ__OPERATER_PROMJENE = "operater_promjene";
	public static String OR_DOGADAJ__VRIJEME_UNOSA = "vrijeme_unosa";
	public static String OR_DOGADAJ__VRIJEME_PROMJENE = "vrijeme_promjene";
	public static String OR_DOGADAJ__PROIZVOD = "proizvod";
	public static String OR_DOGADAJ__LINIJA = "linija";
	public static String OR_DOGADAJ__ID_FUNKCIJE = "id_funkcije";
	public static String OR_DOGADAJ__ID_PROCESA = "id_procesa";
	public static String OR_DOGADAJ__KATEGORIJA = "kategorija";
	public static String OR_DOGADAJ__UZROK = "uzrok";

	/* Attributes names /> */
	/* </ Constructors */
	public OrDogadajVo() {
		super();
	}

	public OrDogadajVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdDogadaja() {
		return get(OR_DOGADAJ__ID_DOGADAJA);
	}

	public String getSveobuhvatni() {
		return get(OR_DOGADAJ__SVEOBUHVATNI);
	}

	public String getPotencijalni() {
		return get(OR_DOGADAJ__POTENCIJALNI);
	}

	public String getProfitniCentar() {
		return get(OR_DOGADAJ__PROFITNI_CENTAR);
	}

	// public Calendar getDatumNastanka() {
	// return getAsCalendar(OR_DOGADAJ__DATUM_NASTANKA);
	// }
	// public Calendar getDatumOtkrica() {
	// return getAsCalendar(OR_DOGADAJ__DATUM_OTKRICA);
	// }
	// public Calendar getDatumZatvaranja() {
	// return getAsCalendar(OR_DOGADAJ__DATUM_ZATVARANJA);
	// }
	public String getStatusOperativnogRizika() {
		return get(OR_DOGADAJ__STATUS_OPERATIVNOG_RIZIKA);
	}

	public String getStatusDogadaja() {
		return get(OR_DOGADAJ__STATUS_DOGADAJA);
	}

	public String getVrsta() {
		return get(OR_DOGADAJ__VRSTA);
	}

	public String getOrganizacijskaJedinicaUnosa() {
		return get(OR_DOGADAJ__ORGANIZACIJSKA_JEDINICA_UNOSA);
	}

	public String getOrganizacijskaJedinicaDogadaja() {
		return get(OR_DOGADAJ__ORGANIZACIJSKA_JEDINICA_DOGADAJA);
	}

	public String getVrstaKanala() {
		return get(OR_DOGADAJ__VRSTA_KANALA);
	}

	public String getNazivDogadaja() {
		return get(OR_DOGADAJ__NAZIV_DOGADAJA);
	}

	public String getOpisDogadaja() {
		return get(OR_DOGADAJ__OPIS_DOGADAJA);
	}

	public String getKomentar() {
		return get(OR_DOGADAJ__KOMENTAR);
	}

	public String getAnonimizacija() {
		return get(OR_DOGADAJ__ANONIMIZACIJA);
	}

	public String getKorektivnaAkcija() {
		return get(OR_DOGADAJ__KOREKTIVNA_AKCIJA);
	}

	public String getTrajanje() {
		return get(OR_DOGADAJ__TRAJANJE);
	}

	public String getInternaKontrola() {
		return get(OR_DOGADAJ__INTERNA_KONTROLA);
	}

	public String getOdobreno() {
		return get(OR_DOGADAJ__ODOBRENO);
	}

	public String getIzvorInformacija() {
		return get(OR_DOGADAJ__IZVOR_INFORMACIJA);
	}

	public String getVrstaPrijetnje() {
		return get(OR_DOGADAJ__VRSTA_PRIJETNJE);
	}

	public String getKreditniRizik() {
		return get(OR_DOGADAJ__KREDITNI_RIZIK);
	}

	public String getPravniRizik() {
		return get(OR_DOGADAJ__PRAVNI_RIZIK);
	}

	public String getTrzisniRizik() {
		return get(OR_DOGADAJ__TRZISNI_RIZIK);
	}

	public String getUmjesanVanjskiFaktor() {
		return get(OR_DOGADAJ__UMJESAN_VANJSKI_FAKTOR);
	}

	public String getPovjerljivost() {
		return get(OR_DOGADAJ__POVJERLJIVOST);
	}

	public String getOcjenaIznos() {
		return get(OR_DOGADAJ__OCJENA_IZNOS);
	}

	public String getOcjenaUcinak() {
		return get(OR_DOGADAJ__OCJENA_UCINAK);
	}

	public String getOcjenaUcestalost() {
		return get(OR_DOGADAJ__OCJENA_UCESTALOST);
	}

	public String getOcjenaVisinaRizika() {
		return get(OR_DOGADAJ__OCJENA_VISINA_RIZIKA);
	}

	public String getPrijedlogMjera() {
		return get(OR_DOGADAJ__PRIJEDLOG_MJERA);
	}

	public String getDogadajOsiguran() {
		return get(OR_DOGADAJ__DOGADAJ_OSIGURAN);
	}

	public String getIdZgrade() {
		return get(OR_DOGADAJ__ID_ZGRADE);
	}

	public String getKat() {
		return get(OR_DOGADAJ__KAT);
	}

	public String getOznakaSobe() {
		return get(OR_DOGADAJ__OZNAKA_SOBE);
	}

	public String getDjelatnik() {
		return get(OR_DOGADAJ__DJELATNIK);
	}

	public String getSlika() {
		return get(OR_DOGADAJ__SLIKA);
	}

	public String getPrilog() {
		return get(OR_DOGADAJ__PRILOG);
	}

	public String getOperaterUnosa() {
		return get(OR_DOGADAJ__OPERATER_UNOSA);
	}

	public String getOperaterPromjene() {
		return get(OR_DOGADAJ__OPERATER_PROMJENE);
	}

	public Calendar getVrijemeUnosa() {
		return getAsCalendar(OR_DOGADAJ__VRIJEME_UNOSA);
	}

	public Calendar getVrijemePromjene() {
		return getAsCalendar(OR_DOGADAJ__VRIJEME_PROMJENE);
	}

	public String getProizvod() {
		return get(OR_DOGADAJ__PROIZVOD);
	}

	public String getLinija() {
		return get(OR_DOGADAJ__LINIJA);
	}

	public String getIdFunkcije() {
		return get(OR_DOGADAJ__ID_FUNKCIJE);
	}

	public String getIdProcesa() {
		return get(OR_DOGADAJ__ID_PROCESA);
	}

	public String getKategorija() {
		return get(OR_DOGADAJ__KATEGORIJA);
	}

	public String getUzrok() {
		return get(OR_DOGADAJ__UZROK);
	}

	public void setIdDogadaja(String value) {
		set(OR_DOGADAJ__ID_DOGADAJA, value);
	}

	public void setSveobuhvatni(String value) {
		set(OR_DOGADAJ__SVEOBUHVATNI, value);
	}

	public void setPotencijalni(String value) {
		set(OR_DOGADAJ__POTENCIJALNI, value);
	}

	public void setProfitniCentar(String value) {
		set(OR_DOGADAJ__PROFITNI_CENTAR, value);
	}

	// public void setDatumNastanka(Calendar value) {
	// setCalendarAsDateString(value, OR_DOGADAJ__DATUM_NASTANKA);
	// }
	// public void setDatumOtkrica(Calendar value) {
	// setCalendarAsDateString(value, OR_DOGADAJ__DATUM_OTKRICA);
	// }
	// public void setDatumZatvaranja(Calendar value) {
	// setCalendarAsDateString(value, OR_DOGADAJ__DATUM_ZATVARANJA);
	// }
	public void setStatusOperativnogRizika(String value) {
		set(OR_DOGADAJ__STATUS_OPERATIVNOG_RIZIKA, value);
	}

	public void setStatusDogadaja(String value) {
		set(OR_DOGADAJ__STATUS_DOGADAJA, value);
	}

	public void setVrsta(String value) {
		set(OR_DOGADAJ__VRSTA, value);
	}

	public void setOrganizacijskaJedinicaUnosa(String value) {
		set(OR_DOGADAJ__ORGANIZACIJSKA_JEDINICA_UNOSA, value);
	}

	public void setOrganizacijskaJedinicaDogadaja(String value) {
		set(OR_DOGADAJ__ORGANIZACIJSKA_JEDINICA_DOGADAJA, value);
	}

	public void setVrstaKanala(String value) {
		set(OR_DOGADAJ__VRSTA_KANALA, value);
	}

	public void setNazivDogadaja(String value) {
		set(OR_DOGADAJ__NAZIV_DOGADAJA, value);
	}

	public void setOpisDogadaja(String value) {
		set(OR_DOGADAJ__OPIS_DOGADAJA, value);
	}

	public void setKomentar(String value) {
		set(OR_DOGADAJ__KOMENTAR, value);
	}

	public void setAnonimizacija(String value) {
		set(OR_DOGADAJ__ANONIMIZACIJA, value);
	}

	public void setKorektivnaAkcija(String value) {
		set(OR_DOGADAJ__KOREKTIVNA_AKCIJA, value);
	}

	public void setTrajanje(String value) {
		set(OR_DOGADAJ__TRAJANJE, value);
	}

	public void setInternaKontrola(String value) {
		set(OR_DOGADAJ__INTERNA_KONTROLA, value);
	}

	public void setOdobreno(String value) {
		set(OR_DOGADAJ__ODOBRENO, value);
	}

	public void setIzvorInformacija(String value) {
		set(OR_DOGADAJ__IZVOR_INFORMACIJA, value);
	}

	public void setVrstaPrijetnje(String value) {
		set(OR_DOGADAJ__VRSTA_PRIJETNJE, value);
	}

	public void setKreditniRizik(String value) {
		set(OR_DOGADAJ__KREDITNI_RIZIK, value);
	}

	public void setPravniRizik(String value) {
		set(OR_DOGADAJ__PRAVNI_RIZIK, value);
	}

	public void setTrzisniRizik(String value) {
		set(OR_DOGADAJ__TRZISNI_RIZIK, value);
	}

	public void setUmjesanVanjskiFaktor(String value) {
		set(OR_DOGADAJ__UMJESAN_VANJSKI_FAKTOR, value);
	}

	public void setPovjerljivost(String value) {
		set(OR_DOGADAJ__POVJERLJIVOST, value);
	}

	public void setOcjenaIznos(String value) {
		set(OR_DOGADAJ__OCJENA_IZNOS, value);
	}

	public void setOcjenaUcinak(String value) {
		set(OR_DOGADAJ__OCJENA_UCINAK, value);
	}

	public void setOcjenaUcestalost(String value) {
		set(OR_DOGADAJ__OCJENA_UCESTALOST, value);
	}

	public void setOcjenaVisinaRizika(String value) {
		set(OR_DOGADAJ__OCJENA_VISINA_RIZIKA, value);
	}

	public void setPrijedlogMjera(String value) {
		set(OR_DOGADAJ__PRIJEDLOG_MJERA, value);
	}

	public void setDogadajOsiguran(String value) {
		set(OR_DOGADAJ__DOGADAJ_OSIGURAN, value);
	}

	public void setIdZgrade(String value) {
		set(OR_DOGADAJ__ID_ZGRADE, value);
	}

	public void setKat(String value) {
		set(OR_DOGADAJ__KAT, value);
	}

	public void setOznakaSobe(String value) {
		set(OR_DOGADAJ__OZNAKA_SOBE, value);
	}

	public void setDjelatnik(String value) {
		set(OR_DOGADAJ__DJELATNIK, value);
	}

	public void setSlika(String value) {
		set(OR_DOGADAJ__SLIKA, value);
	}

	public void setPrilog(String value) {
		set(OR_DOGADAJ__PRILOG, value);
	}

	public void setOperaterUnosa(String value) {
		set(OR_DOGADAJ__OPERATER_UNOSA, value);
	}

	public void setOperaterPromjene(String value) {
		set(OR_DOGADAJ__OPERATER_PROMJENE, value);
	}

	public void setVrijemeUnosa(Calendar value) {
		setCalendarAsDateString(value, OR_DOGADAJ__VRIJEME_UNOSA);
	}

	public void setVrijemePromjene(Calendar value) {
		setCalendarAsDateString(value, OR_DOGADAJ__VRIJEME_PROMJENE);
	}

	public void setProizvod(String value) {
		set(OR_DOGADAJ__PROIZVOD, value);
	}

	public void setLinija(String value) {
		set(OR_DOGADAJ__LINIJA, value);
	}

	public void setIdFunkcije(String value) {
		set(OR_DOGADAJ__ID_FUNKCIJE, value);
	}

	public void setIdProcesa(String value) {
		set(OR_DOGADAJ__ID_PROCESA, value);
	}

	public void setKategorija(String value) {
		set(OR_DOGADAJ__KATEGORIJA, value);
	}

	public void setUzrok(String value) {
		set(OR_DOGADAJ__UZROK, value);
	}

}