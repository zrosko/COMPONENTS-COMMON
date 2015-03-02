package hr.adriacomsoftware.app.common.kolaterali.dto;

import hr.adriacomsoftware.app.common.datadictionary.KOLDataDictionary;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KolateralPolicaVo extends KolateralVo {
	private static final long serialVersionUID = 1L;

	public KolateralPolicaVo() {
		super();
	}

	public KolateralPolicaVo(AS2Record value) {
		super(value);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_POLICA__BROJ_PARTIJE);
	}

	public String getKomentar() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_POLICA__KOMENTAR);
	}

	public String getIdPolice() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_POLICA__ID_POLICE);
	}

	public String getIdKolaterala() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_POLICA__ID_KOLATERALA);
	}

	public String getOsiguravajucaKuca() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_POLICA__OSIGURAVAJUCA_KUCA);
	}

	public String getBrojPolice() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_POLICA__BROJ_POLICE);
	}

	public Calendar getDatumDospijecaPolice() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL_POLICA__DATUM_DOSPIJECA_POLICE);
	}

	public Calendar getDatumOtvaranjaPolice() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL_POLICA__DATUM_OTVARANJA_POLICE);
	}

	public Calendar getDatumIzdavanjaPolice() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL_POLICA__DATUM_IZDAVANJA_POLICE);
	}

	public String getOsiguranaSvota() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_POLICA__OSIGURANA_SVOTA);
	}

	public String getValutaOsiguraneSvote() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL_POLICA__VALUTA_OSIGURANE_SVOTE);
	}

	public Calendar getDatumDospijecaPremije() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL_POLICA__DATUM_DOSPIJECA_PREMIJE);
	}

	public void setIdPolice(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_POLICA__ID_POLICE, value);
	}

	public void setIdKolaterala(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_POLICA__ID_KOLATERALA,
				value);
	}

	public void setOsiguravajucaKuca(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_POLICA__OSIGURAVAJUCA_KUCA,
				value);
	}

	public void setBrojPolice(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_POLICA__BROJ_POLICE, value);
	}

	public void setDatumDospijecaPolice(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL_POLICA__DATUM_DOSPIJECA_POLICE);
	}

	public void setDatumIzdavanjaPolice(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL_POLICA__DATUM_IZDAVANJA_POLICE);
	}

	public void setDatumOtvaranjaPolice(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL_POLICA__DATUM_OTVARANJA_POLICE);
	}

	public void setOsiguranaSvota(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_POLICA__OSIGURANA_SVOTA,
				value);
	}

	public void setValutaOsiguraneSvote(String value) {
		set(
				KOLDataDictionary.KOL_KOLATERAL_POLICA__VALUTA_OSIGURANE_SVOTE,
				value);
	}

	public void setDatumDospijecaPremije(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL_POLICA__DATUM_DOSPIJECA_PREMIJE);
	}

	public void setBrojPartije(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_POLICA__BROJ_PARTIJE, value);
	}

	public void setKomentar(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL_POLICA__KOMENTAR, value);
	}
}