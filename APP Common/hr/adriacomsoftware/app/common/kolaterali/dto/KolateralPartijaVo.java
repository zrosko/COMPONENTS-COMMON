package hr.adriacomsoftware.app.common.kolaterali.dto;

import hr.adriacomsoftware.app.common.datadictionary.KOLDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KolateralPartijaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	public KolateralPartijaVo() {
		super();
	}

	public KolateralPartijaVo(AS2Record value) {
		super(value);
	}

	public String getIdKolateralaPartije() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__ID_KOLATERALA_PARTIJE);
	}

	public String getIdKolaterala() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__ID_KOLATERALA);
	}

	public String getRedoslijedUpisa() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__REDOSLIJED_UPISA);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__BROJ_PARTIJE);
	}

	public String getTeretDrugaBanka() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__TERET_DRUGA_BANKA);
	}

	public String getPostotakVeze() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__POSTOTAK_VEZE);
	}

	public String getBrojUgovora() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__BROJ_UGOVORA);
	}

	public String getOib() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__OIB);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__NAZIV);
	}

	public String getNazivKreditora() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__NAZIV_KREDITORA);
	}

	public String getOdobreniIznos() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__ODOBRENI_IZNOS);
	}

	public String getSaldo() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__SALDO);
	}

	public String getJmbgMb() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__JMBG_MB);
	}

	public Calendar getDatumSalda() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__DATUM_SALDA);
	}

	public Calendar getDatumUpisa() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__DATUM_UPISA);
	}

	public Calendar getDatumBrisanja() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__DATUM_BRISANJA);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__NAPOMENA);
	}

	public String getKamatnaStopa() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__KAMATNA_STOPA);
	}

	public String getValutaTereta() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__VALUTA_TERETA);
	}

	public String getValutaSalda() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__VALUTA_SALDA);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__ISPRAVNO);
	}

	public String getUcitano() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__UCITANO);
	}

	public void setUcitano(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__UCITANO, value);
	}

	public void setIdKolateralaPartije(String value) {
		set(
				KOLDataDictionary.KOL_KOLATERAL_PARTIJA__ID_KOLATERALA_PARTIJE,
				value);
	}

	public void setIdKolaterala(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__ID_KOLATERALA,
				value);
	}

	public void setRedoslijedUpisa(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__REDOSLIJED_UPISA,
				value);
	}

	public void setBrojPartije(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__BROJ_PARTIJE,
				value);
	}

	public void setTeretDrugaBanka(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__TERET_DRUGA_BANKA,
				value);
	}

	public void setBrojUgovora(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__BROJ_UGOVORA,
				value);
	}

	public void setOib(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__OIB, value);
	}

	public void setNaziv(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__NAZIV, value);
	}

	public void setNazivKreditora(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__NAZIV_KREDITORA,
				value);
	}

	public void setOdobreniIznos(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__ODOBRENI_IZNOS,
				value);
	}

	public void setSaldo(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__SALDO, value);
	}

	public void setJmbgMb(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__JMBG_MB, value);
	}

	public void setDatumUpisa(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL_PARTIJA__DATUM_UPISA);
	}

	public void setDatumSalda(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL_PARTIJA__DATUM_SALDA);
	}

	public void setDatumBrisanja(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL_PARTIJA__DATUM_BRISANJA);
	}

	public void setNapomena(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__NAPOMENA, value);
	}

	public void setKamatnaStopa(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__KAMATNA_STOPA,
				value);
	}

	public void setValutaTereta(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__VALUTA_TERETA,
				value);
	}

	public void setValutaSalda(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__VALUTA_SALDA,
				value);
	}

	public void setIspravno(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__ISPRAVNO, value);
	}

	public void setPostotakVeze(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_PARTIJA__POSTOTAK_VEZE,
				value);
	}
}