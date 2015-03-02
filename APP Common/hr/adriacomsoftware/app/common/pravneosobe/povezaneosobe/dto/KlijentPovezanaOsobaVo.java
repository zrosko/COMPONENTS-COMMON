package hr.adriacomsoftware.app.common.pravneosobe.povezaneosobe.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KlijentPovezanaOsobaVo extends OsnovniVo implements
		KlijentPovezanaOsobaConstants {
	private static final long serialVersionUID = 1L;

	public KlijentPovezanaOsobaVo() {
		super();
	}

	public KlijentPovezanaOsobaVo(AS2Record value) {
		super(value);
	}

	public String getKlijentNaziv() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__KLIJENT_NAZIV);
	}

	public String getKlijentMaticniBroj() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__KLIJENT_MATICNI_BROJ);
	}

	public String getKlijentOib() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__KLIJENT_OIB);
	}

	public String getIdPovezaneOsobe() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__ID_POVEZANE_OSOBE);
	}

	public String getSlog() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__SLOG);
	}

	public String getOdnos() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__ODNOS);
	}

	public String getTipVeze() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__TIP_VEZE);
	}

	public String getNazivVeze() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__NAZIV_VEZE);
	}

	public String getJmbgMb() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__JMBG_MB);
	}

	public String getJmbgMbVeza() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__JMBG_MB_VEZA);
	}

	public String getOib() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__OIB);
	}

	public String getOibVeza() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__OIB_VEZA);
	}

	public String getImePrezimeNaziv() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__IME_PREZIME_NAZIV);
	}

	public String getFunkcija() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__FUNKCIJA);
	}

	public String getStrucnaSprema() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__STRUCNA_SPREMA);
	}

	public String getZvanje() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__ZVANJE);
	}

	public String getPostotakUdjela() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__POSTOTAK_UDJELA);
	}

	public String getTekucaGodina() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__TEKUCA_GODINA);
	}

	public String getPrethodnaGodina() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__PRETHODNA_GODINA);
	}

	public String getIznosZaduzenosti() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__IZNOS_ZADUZENOSTI);
	}

	public String getIznosIzlozenosti() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__IZNOS_IZLOZENOSTI);
	}

	public String getVlasnik() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__VLASNIK);
	}

	public String getUcitano() {
		return getAsStringOrEmpty(KLIJENT_PO_POVEZANA_OSOBA__UCITANO);
	}

	public Calendar getDatumOd() {
		return getAsCalendar(KLIJENT_PO_POVEZANA_OSOBA__DATUM_OD);
	}

	public Calendar getDatumDo() {
		return getAsCalendar(KLIJENT_PO_POVEZANA_OSOBA__DATUM_DO);
	}

	// dodatk
	public String getUkupnaIzlozenost() {
		return get(KLIJENT_PO_POVEZANA_OSOBA__UKUPNA_IZLOZENOST);
	}

	public String getUkupnaZaduzenost() {
		return get(KLIJENT_PO_POVEZANA_OSOBA__UKUPNA_ZADUZENOST);
	}

	public String getSveUkupnaIzlozenost() {
		return get(KLIJENT_PO_POVEZANA_OSOBA__SVEUKUPNA_IZLOZENOST);
	}

	public String getUkupnaIzlozenostJamstveni() {
		return get(KLIJENT_PO_POVEZANA_OSOBA__UKUPNA_IZLOZENOST_JAMSTVENI);
	}

	// SETTER-I
	public void setIdPovezaneOsobe(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__ID_POVEZANE_OSOBE, value);
	}

	public void setSlog(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__SLOG, value);
	}

	public void setOdnos(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__ODNOS, value);
	}

	public void setTipVeze(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__TIP_VEZE, value);
	}

	public void setNazivVeze(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__NAZIV_VEZE, value);
	}

	public void setJmbgMb(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__JMBG_MB, value);
	}

	public void setJmbgMbVeza(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__JMBG_MB_VEZA, value);
	}

	public void setOib(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__OIB, value);
	}

	public void setOibVeza(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__OIB_VEZA, value);
	}

	public void setImePrezimeNaziv(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__IME_PREZIME_NAZIV, value);
	}

	public void setFunkcija(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__FUNKCIJA, value);
	}

	public void setStrucnaSprema(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__STRUCNA_SPREMA, value);
	}

	public void setZvanje(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__ZVANJE, value);
	}

	public void setPostotakUdjela(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__POSTOTAK_UDJELA, value);
	}

	public void setTekucaGodina(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__TEKUCA_GODINA, value);
	}

	public void setPrethodnaGodina(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__PRETHODNA_GODINA, value);
	}

	public void setIznosZaduzenosti(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__IZNOS_ZADUZENOSTI, value);
	}

	public void setIznosIzlozenosti(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__IZNOS_IZLOZENOSTI, value);
	}

	public void setVlasnik(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__VLASNIK, value);
	}

	public void setUcitano(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__UCITANO, value);
	}

	public void setDatumOd(Calendar value) {
		setCalendarAsDateString(value,
				KLIJENT_PO_POVEZANA_OSOBA__DATUM_OD);
	}

	public void setDatumDo(Calendar value) {
		setCalendarAsDateString(value,
				KLIJENT_PO_POVEZANA_OSOBA__DATUM_DO);
	}

	//
	public void setUkupnaZaduzenost(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__UKUPNA_ZADUZENOST, value);
	}

	public void setUkupnaIzlozenost(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__UKUPNA_IZLOZENOST, value);
	}

	public void setSveUkupnaIzlozenost(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__SVEUKUPNA_IZLOZENOST, value);
	}

	public void setUkupnaIzlozenostJamstveni(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__UKUPNA_IZLOZENOST_JAMSTVENI,
				value);
	}

	public void setKlijentNaziv(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__KLIJENT_NAZIV, value);
	}

	public void setKlijentMaticniBroj(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__KLIJENT_MATICNI_BROJ, value);
	}

	public void setKlijentOib(String value) {
		set(KLIJENT_PO_POVEZANA_OSOBA__KLIJENT_OIB, value);
	}
}