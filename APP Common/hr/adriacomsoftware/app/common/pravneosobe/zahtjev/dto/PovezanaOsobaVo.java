package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

public class PovezanaOsobaVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;

	public PovezanaOsobaVo() {
		super();
	}

	public PovezanaOsobaVo(AS2Record value) {
		super(value);
	}

	public String getIdPovezaneOsobe() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__ID_POVEZANE_OSOBE);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__BROJ_ZAHTJEVA);
	}

	public String getSlog() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__SLOG);
	}

	public String getOdnos() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__ODNOS);
	}

	public String getTipVeze() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__TIP_VEZE);
	}

	public String getNazivVeze() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__NAZIV_VEZE);
	}

	public String getJmbgMb() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__JMBG_MB);
	}

	public String getJmbgMbVeza() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__JMBG_MB_VEZA);
	}

	public String getOib() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__OIB);
	}

	public String getOibVeza() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__OIB_VEZA);
	}

	public String getImePrezimeNaziv() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__IME_PREZIME_NAZIV);
	}

	public String getFunkcija() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__FUNKCIJA);
	}

	public String getStrucnaSprema() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__STRUCNA_SPREMA);
	}

	public String getZvanje() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__ZVANJE);
	}

	public String getPostotakUdjela() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__POSTOTAK_UDJELA);
	}

	public String getTekucaGodina() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__TEKUCA_GODINA);
	}

	public String getPrethodnaGodina() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__PRETHODNA_GODINA);
	}

	public String getIznosZaduzenosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__IZNOS_ZADUZENOSTI);
	}

	public String getIznosIzlozenosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__IZNOS_IZLOZENOSTI);
	}

	public String getVlasnik() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__VLASNIK);
	}

	public String getUcitano() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UCITANO);
	}

	// dodatk
	public String getUkupnaIzlozenost() {
		return get(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UKUPNA_IZLOZENOST);
	}

	public String getUkupnaZaduzenost() {
		return get(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UKUPNA_ZADUZENOST);
	}

	public String getSveUkupnaIzlozenost() {
		return get(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__SVEUKUPNA_IZLOZENOST);
	}

	public String getSveUkupnaIzlozenostZahtjeva() {
		return get(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__SVEUKUPNA_IZLOZENOST_ZAHTJEVA);
	}

	public String getUkupnaIzlozenostJamstveni() {
		return get(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UKUPNA_IZLOZENOST_JAMSTVENI);
	}

	public String getUkupnaIzlozenostJamstveniZahtjeva() {
		return get(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UKUPNA_IZLOZENOST_JAMSTVENI_ZAHTJEVA);
	}

	// SETTER-I
	public void setIdPovezaneOsobe(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__ID_POVEZANE_OSOBE, value);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__BROJ_ZAHTJEVA, value);
	}

	public void setSlog(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__SLOG, value);
	}

	public void setOdnos(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__ODNOS, value);
	}

	public void setTipVeze(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__TIP_VEZE, value);
	}

	public void setNazivVeze(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__NAZIV_VEZE, value);
	}

	public void setJmbgMb(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__JMBG_MB, value);
	}

	public void setJmbgMbVeza(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__JMBG_MB_VEZA, value);
	}

	public void setOib(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__OIB, value);
	}

	public void setOibVeza(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__OIB_VEZA, value);
	}

	public void setImePrezimeNaziv(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__IME_PREZIME_NAZIV, value);
	}

	public void setFunkcija(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__FUNKCIJA, value);
	}

	public void setStrucnaSprema(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__STRUCNA_SPREMA, value);
	}

	public void setZvanje(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__ZVANJE, value);
	}

	public void setPostotakUdjela(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__POSTOTAK_UDJELA, value);
	}

	public void setTekucaGodina(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__TEKUCA_GODINA, value);
	}

	public void setPrethodnaGodina(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__PRETHODNA_GODINA, value);
	}

	public void setIznosZaduzenosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__IZNOS_ZADUZENOSTI, value);
	}

	public void setIznosIzlozenosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__IZNOS_IZLOZENOSTI, value);
	}

	public void setVlasnik(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__VLASNIK, value);
	}

	public void setUcitano(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UCITANO, value);
	}

	//
	public void setUkupnaZaduzenost(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UKUPNA_ZADUZENOST, value);
	}

	public void setUkupnaIzlozenost(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UKUPNA_IZLOZENOST, value);
	}

	public void setSveUkupnaIzlozenostZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__SVEUKUPNA_IZLOZENOST_ZAHTJEVA,
				value);
	}

	public void setSveUkupnaIzlozenost(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__SVEUKUPNA_IZLOZENOST,
				value);
	}

	public void setUkupnaIzlozenostJamstveni(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UKUPNA_IZLOZENOST_JAMSTVENI,
				value);
	}

	public void setUkupnaIzlozenostJamstveniZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_POVEZANA_OSOBA__UKUPNA_IZLOZENOST_JAMSTVENI_ZAHTJEVA,
				value);
	}
}