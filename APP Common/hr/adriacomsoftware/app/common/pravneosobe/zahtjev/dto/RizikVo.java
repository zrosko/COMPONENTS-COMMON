package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class RizikVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;
	// constants start
	public static String PO_ZAH_RIZIK__ID_RIZIKA = "id_rizika";
	public static String PO_ZAH_RIZIK__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_RIZIK__DATUM_RIZIKA = "datum_rizika";
	public static String PO_ZAH_RIZIK__JMBG_MB = "jmbg_mb";
	public static String PO_ZAH_RIZIK__OIB = "oib";
	public static String PO_ZAH_RIZIK__OPIS_ZAHTJEVA = "opis_zahtjeva";
	public static String PO_ZAH_RIZIK__IZNOS = "iznos";
	public static String PO_ZAH_RIZIK__OCJENA = "ocjena";
	public static String PO_ZAH_RIZIK__RIZIK = "rizik";
	public static String PO_ZAH_RIZIK__NAZIV = "naziv";
	public static String PO_ZAH_RIZIK__UKUPNA_AKTIVA1 = "ukupna_aktiva1";
	public static String PO_ZAH_RIZIK__UKUPNA_AKTIVA2 = "ukupna_aktiva2";
	public static String PO_ZAH_RIZIK__UKUPNI_PRIHODI1 = "ukupni_prihodi1";
	public static String PO_ZAH_RIZIK__UKUPNI_PRIHODI2 = "ukupni_prihodi2";
	public static String PO_ZAH_RIZIK__NETO_DOBIT_GUBITAK1 = "neto_dobit_gubitak1";
	public static String PO_ZAH_RIZIK__NETO_DOBIT_GUBITAK2 = "neto_dobit_gubitak2";
	public static String PO_ZAH_RIZIK__UKUPNI_PRIHODI_3M1 = "ukupni_prihodi_3m1";
	public static String PO_ZAH_RIZIK__UKUPNI_PRIHODI_3M2 = "ukupni_prihodi_3m2";
	public static String PO_ZAH_RIZIK__RAZLIKA_PRIHODA_RASHODA_3M1 = "razlika_prihoda_rashoda_3m1";
	public static String PO_ZAH_RIZIK__RAZLIKA_PRIHODA_RASHODA_3M2 = "razlika_prihoda_rashoda_3m2";
	public static String PO_ZAH_RIZIK__KREDITNA_SPOSOBNOST = "kreditna_sposobnost";
	public static String PO_ZAH_RIZIK__UREDNOST = "urednost";
	public static String PO_ZAH_RIZIK__OSIGURANJE_PLASMANA = "osiguranje_plasmana";
	public static String PO_ZAH_RIZIK__VALUTNI_RIZIK = "valutni_rizik";
	public static String PO_ZAH_RIZIK__UPRAVLJACKI_RIZIK = "upravljacki_rizik";
	public static String PO_ZAH_RIZIK__PROIZVODNI_RIZIK = "proizvodni_rizik";
	public static String PO_ZAH_RIZIK__PRODAJNI_RIZIK = "prodajni_rizik";
	public static String PO_ZAH_RIZIK__RIZIK_NABAVE = "rizik_nabave";
	public static String PO_ZAH_RIZIK__KONCENTRACIJSKI_RIZIK = "koncentracijski_rizik";
	public static String PO_ZAH_RIZIK__OBRAZLOZENJE_ZAHTJEVA = "obrazlozenje_zahtjeva";
	public static String PO_ZAH_RIZIK__OCJENA_MENADZMENTA = "ocjena_menadzmenta";
	public static String PO_ZAH_RIZIK__OCJENA_PLANA = "ocjena_plana";
	public static String PO_ZAH_RIZIK__POVEZANE_OSOBE_KOMENTAR = "povezane_osobe_komentar";
	public static String PO_ZAH_RIZIK__POSLOVNI_ODNOS_JBS = "poslovni_odnos_jbs";
	public static String PO_ZAH_RIZIK__SWOT_SNAGE = "swot_snage";
	public static String PO_ZAH_RIZIK__SWOT_SLABOSTI = "swot_slabosti";
	public static String PO_ZAH_RIZIK__SWOT_PRILIKE = "swot_prilike";
	public static String PO_ZAH_RIZIK__SWOT_PRIJETNJE = "swot_prijetnje";
	public static String PO_ZAH_RIZIK__ZAKLJUCAK = "zakljucak";
	public static String PO_ZAH_RIZIK__MAX_BROJ_DANA_KASNJENJA = "max_broj_dana_kasnjenja";
	public static String PO_ZAH_RIZIK__DOSPJELI_DUG = "dospjeli_dug";
	public static String PO_ZAH_RIZIK__ODNOS_ZADUZENOSTI_OSIGURANJA = "odnos_zaduzenosti_osiguranja";
	// faktori
	public static String PO_ZAH_RIZIK__POZITIVNI_FAKTORI = "pozitivni_faktori";
	public static String PO_ZAH_RIZIK__NEGATIVNI_FAKTORI = "negativni_faktori";
	public static String PO_ZAH_RIZIK__STATUS_PROCJENE = "status_procjene";
	public static String PO_ZAH_RIZIK__KREDITNI_REJTING = "kreditni_rejting";
	public static String PO_ZAH_RIZIK__OPERATER = "operater";
	public static String PO_ZAH_RIZIK__NADLEZNOST = "nadleznost";
	public static String PO_ZAH_RIZIK__VRACENO = "vraceno";
	public static String PO_ZAH_RIZIK__UVJET = "uvjet";
	public static String PO_ZAH_RIZIK__SEF_SLUZBE = "sef_sluzbe";

	// constants end

	public RizikVo() {
		super();
	}

	public RizikVo(AS2Record value) {
		super(value);
	}

	// getters and setters start
	public String getOperater() {
		return get(PO_ZAH_RIZIK__OPERATER);
	}

	public String getKreditniRejting() {
		return get(PO_ZAH_RIZIK__KREDITNI_REJTING);
	}

	public String getStatusProcjene() {
		return get(PO_ZAH_RIZIK__STATUS_PROCJENE);
	}

	public String getPozitivniFaktori() {
		return get(PO_ZAH_RIZIK__POZITIVNI_FAKTORI);
	}

	public String getNegativniFaktori() {
		return get(PO_ZAH_RIZIK__NEGATIVNI_FAKTORI);
	}

	public String getIdRizika() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__ID_RIZIKA);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__BROJ_ZAHTJEVA);
	}

	public Calendar getDatumRizika() {
		return getAsCalendar(PO_ZAH_RIZIK__DATUM_RIZIKA);
	}

	public String getJmbgMb() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__JMBG_MB);
	}

	public String getOib() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__OIB);
	}

	public String getOpisZahtjeva() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__OPIS_ZAHTJEVA);
	}

	public String getIznos() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__IZNOS);
	}

	public String getOcjena() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__OCJENA);
	}

	public String getRizik() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__RIZIK);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__NAZIV);
	}

	public String getUkupnaAktiva1() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__UKUPNA_AKTIVA1);
	}

	public String getUkupnaAktiva2() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__UKUPNA_AKTIVA2);
	}

	public String getUkupniPrihodi1() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__UKUPNI_PRIHODI1);
	}

	public String getUkupniPrihodi2() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__UKUPNI_PRIHODI2);
	}

	public String getNetoDobitGubitak1() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__NETO_DOBIT_GUBITAK1);
	}

	public String getNetoDobitGubitak2() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__NETO_DOBIT_GUBITAK2);
	}

	public String getUkupniPrihodi3m1() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__UKUPNI_PRIHODI_3M1);
	}

	public String getUkupniPrihodi3m2() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__UKUPNI_PRIHODI_3M2);
	}

	public String getRazlikaPrihodaRashoda3m1() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__RAZLIKA_PRIHODA_RASHODA_3M1);
	}

	public String getRazlikaPrihodaRashoda3m2() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__RAZLIKA_PRIHODA_RASHODA_3M2);
	}

	public String getKreditnaSposobnost() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__KREDITNA_SPOSOBNOST);
	}

	public String getUrednost() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__UREDNOST);
	}

	public String getOsiguranjePlasmana() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__OSIGURANJE_PLASMANA);
	}

	public String getValutniRizik() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__VALUTNI_RIZIK);
	}

	public String getUpravljackiRizik() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__UPRAVLJACKI_RIZIK);
	}

	public String getProizvodniRizik() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__PROIZVODNI_RIZIK);
	}

	public String getProdajniRizik() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__PRODAJNI_RIZIK);
	}

	public String getRizikNabave() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__RIZIK_NABAVE);
	}

	public String getKoncentracijskiRizik() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__KONCENTRACIJSKI_RIZIK);
	}

	public String getObrazlozenjeZahtjeva() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__OBRAZLOZENJE_ZAHTJEVA);
	}

	public String getOcjenaMenadzmenta() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__OCJENA_MENADZMENTA);
	}

	public String getOcjenaPlana() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__OCJENA_PLANA);
	}

	public String getPovezaneOsobeKomentar() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__POVEZANE_OSOBE_KOMENTAR);
	}

	public String getPoslovniOdnosJbs() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__POSLOVNI_ODNOS_JBS);
	}

	public String getSwotSnage() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__SWOT_SNAGE);
	}

	public String getSwotSlabosti() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__SWOT_SLABOSTI);
	}

	public String getSwotPrilike() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__SWOT_PRILIKE);
	}

	public String getSwotPrijetnje() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__SWOT_PRIJETNJE);
	}

	public String getZakljucak() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__ZAKLJUCAK);
	}

	public String getDospjeliDug() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__DOSPJELI_DUG);
	}

	public String getMaxBrojDanaKasnjenja() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__MAX_BROJ_DANA_KASNJENJA);
	}

	public String getOdnosZaduzenostiOsiguranja() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__ODNOS_ZADUZENOSTI_OSIGURANJA);
	}

	public String getNadleznost() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__NADLEZNOST);
	}

	public String getVraceno() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__VRACENO);
	}

	public String getUvjet() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__UVJET);
	}

	public String getSefSluzbe() {
		return getAsStringOrEmpty(PO_ZAH_RIZIK__SEF_SLUZBE);
	}

	// SETTERS
	public void setIdRizika(String value) {
		set(PO_ZAH_RIZIK__ID_RIZIKA, value);
	}

	public void setBrojZahtjeva(String value) {
		set(PO_ZAH_RIZIK__BROJ_ZAHTJEVA, value);
	}

	public void setDatumRizika(Calendar value) {
		setCalendarAsDateString(value, PO_ZAH_RIZIK__DATUM_RIZIKA);
	}

	public void setJmbgMb(String value) {
		set(PO_ZAH_RIZIK__JMBG_MB, value);
	}

	public void setOib(String value) {
		set(PO_ZAH_RIZIK__OIB, value);
	}

	public void setOpisZahtjeva(String value) {
		set(PO_ZAH_RIZIK__OPIS_ZAHTJEVA, value);
	}

	public void setIznos(String value) {
		set(PO_ZAH_RIZIK__IZNOS, value);
	}

	public void setOcjena(String value) {
		set(PO_ZAH_RIZIK__OCJENA, value);
	}

	public void setRizik(String value) {
		set(PO_ZAH_RIZIK__RIZIK, value);
	}

	public void setNaziv(String value) {
		set(PO_ZAH_RIZIK__NAZIV, value);
	}

	public void setUkupnaAktiva1(String value) {
		set(PO_ZAH_RIZIK__UKUPNA_AKTIVA1, value);
	}

	public void setUkupnaAktiva2(String value) {
		set(PO_ZAH_RIZIK__UKUPNA_AKTIVA2, value);
	}

	public void setUkupniPrihodi1(String value) {
		set(PO_ZAH_RIZIK__UKUPNI_PRIHODI1, value);
	}

	public void setUkupniPrihodi2(String value) {
		set(PO_ZAH_RIZIK__UKUPNI_PRIHODI2, value);
	}

	public void setNetoDobitGubitak1(String value) {
		set(PO_ZAH_RIZIK__NETO_DOBIT_GUBITAK1, value);
	}

	public void setNetoDobitGubitak2(String value) {
		set(PO_ZAH_RIZIK__NETO_DOBIT_GUBITAK2, value);
	}

	public void setUkupniPrihodi3m1(String value) {
		set(PO_ZAH_RIZIK__UKUPNI_PRIHODI_3M1, value);
	}

	public void setUkupniPrihodi3m2(String value) {
		set(PO_ZAH_RIZIK__UKUPNI_PRIHODI_3M2, value);
	}

	public void setRazlikaPrihodaRashoda3m1(String value) {
		set(PO_ZAH_RIZIK__RAZLIKA_PRIHODA_RASHODA_3M1, value);
	}

	public void setRazlikaPrihodaRashoda3m2(String value) {
		set(PO_ZAH_RIZIK__RAZLIKA_PRIHODA_RASHODA_3M2, value);
	}

	public void setKreditnaSposobnost(String value) {
		set(PO_ZAH_RIZIK__KREDITNA_SPOSOBNOST, value);
	}

	public void setUrednost(String value) {
		set(PO_ZAH_RIZIK__UREDNOST, value);
	}

	public void setOsiguranjePlasmana(String value) {
		set(PO_ZAH_RIZIK__OSIGURANJE_PLASMANA, value);
	}

	public void setValutniRizik(String value) {
		set(PO_ZAH_RIZIK__VALUTNI_RIZIK, value);
	}

	public void setUpravljackiRizik(String value) {
		set(PO_ZAH_RIZIK__UPRAVLJACKI_RIZIK, value);
	}

	public void setProizvodniRizik(String value) {
		set(PO_ZAH_RIZIK__PROIZVODNI_RIZIK, value);
	}

	public void setProdajniRizik(String value) {
		set(PO_ZAH_RIZIK__PRODAJNI_RIZIK, value);
	}

	public void setRizikNabave(String value) {
		set(PO_ZAH_RIZIK__RIZIK_NABAVE, value);
	}

	public void setKoncentracijskiRizik(String value) {
		set(PO_ZAH_RIZIK__KONCENTRACIJSKI_RIZIK, value);
	}

	public void setObrazlozenjeZahtjeva(String value) {
		set(PO_ZAH_RIZIK__OBRAZLOZENJE_ZAHTJEVA, value);
	}

	public void setOcjenaMenadzmenta(String value) {
		set(PO_ZAH_RIZIK__OCJENA_MENADZMENTA, value);
	}

	public void setOcjenaPlana(String value) {
		set(PO_ZAH_RIZIK__OCJENA_PLANA, value);
	}

	public void setPovezaneOsobeKomentar(String value) {
		set(PO_ZAH_RIZIK__POVEZANE_OSOBE_KOMENTAR, value);
	}

	public void setPoslovniOdnosJbs(String value) {
		set(PO_ZAH_RIZIK__POSLOVNI_ODNOS_JBS, value);
	}

	public void setSwotSnage(String value) {
		set(PO_ZAH_RIZIK__SWOT_SNAGE, value);
	}

	public void setSwotSlabosti(String value) {
		set(PO_ZAH_RIZIK__SWOT_SLABOSTI, value);
	}

	public void setSwotPrilike(String value) {
		set(PO_ZAH_RIZIK__SWOT_PRILIKE, value);
	}

	public void setSwotPrijetnje(String value) {
		set(PO_ZAH_RIZIK__SWOT_PRIJETNJE, value);
	}

	public void setZakljucak(String value) {
		set(PO_ZAH_RIZIK__ZAKLJUCAK, value);
	}

	public void setDospjeliDug(String value) {
		set(PO_ZAH_RIZIK__DOSPJELI_DUG, value);
	}

	public void setMaxBrojDanaKasnjenja(String value) {
		set(PO_ZAH_RIZIK__MAX_BROJ_DANA_KASNJENJA, value);
	}

	public void setOdnosZaduzenostiOsiguranja(String value) {
		set(PO_ZAH_RIZIK__ODNOS_ZADUZENOSTI_OSIGURANJA, value);
	}

	public void setPozitivniFaktori(String value) {
		set(PO_ZAH_RIZIK__POZITIVNI_FAKTORI, value);
	}

	public void setNegativniFaktori(String value) {
		set(PO_ZAH_RIZIK__NEGATIVNI_FAKTORI, value);
	}

	public void setStatusProcjene(String value) {
		set(PO_ZAH_RIZIK__STATUS_PROCJENE, value);
	}

	public void setKreditniRejting(String value) {
		set(PO_ZAH_RIZIK__KREDITNI_REJTING, value);
	}

	public void setOperater(String value) {
		set(PO_ZAH_RIZIK__OPERATER, value);
	}

	public void setNadleznost(String value) {
		set(PO_ZAH_RIZIK__NADLEZNOST, value);
	}

	public void setVraceno(String value) {
		set(PO_ZAH_RIZIK__VRACENO, value);
	}

	public void setUvjet(String value) {
		set(PO_ZAH_RIZIK__UVJET, value);
	}

	public void setSefSluzbe(String value) {
		set(PO_ZAH_RIZIK__SEF_SLUZBE, value);
	}
	// getters and setters end

}