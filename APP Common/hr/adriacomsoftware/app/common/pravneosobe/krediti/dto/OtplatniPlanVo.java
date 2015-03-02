package hr.adriacomsoftware.app.common.pravneosobe.krediti.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class OtplatniPlanVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* NOVI atirubti */
	public static String OTPLATNI_PLAN__TROSAK_KREDITA = "trosak_kredita";
	public static String OTPLATNI_PLAN__POSTOTAK_NAKNADE = "postotak_naknade";
	public static String OTPLATNI_PLAN__BROJ_GODINA = "broj_godina";
	public static String OTPLATNI_PLAN__SIFRA_VALUTE = "sifra_valute";
	public static String OTPLATNI_PLAN__SIFRA_PROTUVALUTE = "sifra_protuvalute";
	public static String OTPLATNI_PLAN__DATUM_TECAJA = "datum_tecaja";
	public static String OTPLATNI_PLAN__TECAJ = "tecaj";
	public static String OTPLATNI_PLAN__VRSTA_TECAJA = "vrsta_tecaja";
	public static String OTPLATNI_PLAN__POSTOTAK_MANIPULATIVNOG_TROSKA = "postotak_manipulativnog_troska";

	public OtplatniPlanVo() {
		super();
	}

	public OtplatniPlanVo(AS2Record value) {
		super(value);
	}

	// novo
	public String getTrosakKredita() {
		return get(OTPLATNI_PLAN__TROSAK_KREDITA);
	}

	public String getPostotakNaknade() {
		return get(OTPLATNI_PLAN__POSTOTAK_NAKNADE);
	}

	public String getBrojGodina() {
		return get(OTPLATNI_PLAN__BROJ_GODINA);
	}

	public String getSifraValute() {
		return get(OTPLATNI_PLAN__SIFRA_VALUTE);
	}

	public String getSifraProtuvalute() {
		return get(OTPLATNI_PLAN__SIFRA_PROTUVALUTE);
	}

	public Calendar getDatumTecaja() {
		return getAsCalendar(OTPLATNI_PLAN__DATUM_TECAJA);
	}

	public String getTecaj() {
		return get(OTPLATNI_PLAN__TECAJ);
	}

	public String getVrstaTecaja() {
		return get(OTPLATNI_PLAN__VRSTA_TECAJA);
	}

	public String getPostotakManipulativnogTroska() {
		return get(OTPLATNI_PLAN__POSTOTAK_MANIPULATIVNOG_TROSKA);
	}

	// set
	public void setTrosakKredita(String value) {
		set(OTPLATNI_PLAN__TROSAK_KREDITA, value);
	}

	public void setPostotakNaknade(String value) {
		set(OTPLATNI_PLAN__POSTOTAK_NAKNADE, value);
	}

	public void setBrojGodina(String value) {
		set(OTPLATNI_PLAN__BROJ_GODINA, value);
	}

	public void setSifraValute(String value) {
		set(OTPLATNI_PLAN__SIFRA_VALUTE, value);
	}

	public void setSifraProtuvalute(String value) {
		set(OTPLATNI_PLAN__SIFRA_PROTUVALUTE, value);
	}

	public void setDatumTecaja(Calendar value) {
		setCalendarAsDateString(value, OTPLATNI_PLAN__DATUM_TECAJA);
	}

	public void setTecaj(String value) {
		set(OTPLATNI_PLAN__TECAJ, value);
	}

	public void setVrstaTecaja(String value) {
		set(OTPLATNI_PLAN__VRSTA_TECAJA, value);
	}

	public void setPostotakManipulativnogTroska(String value) {
		set(OTPLATNI_PLAN__POSTOTAK_MANIPULATIVNOG_TROSKA, value);
	}

	// novo
	public String getVrstaPlana() {
		return getAsStringOrEmpty("vrsta_plana");
	}

	public void setVrstaPlana(String value) {
		set("vrsta_plana", value);
	}

	public Calendar getPocetakKoristenja() {
		return getAsCalendar(JBDataDictionary.BI_OTPLATNI_PLAN__POCETAK_KORISTENJA);
	}

	public Calendar getPrviObracunKamate() {
		return getAsCalendar(JBDataDictionary.BI_OTPLATNI_PLAN__PRVI_OBRACUN_KAMATE);
	}

	public Calendar getDospijecePrveRate() {
		return getAsCalendar(JBDataDictionary.BI_OTPLATNI_PLAN__DOSPIJECE_PRVE_RATE);
	}

	public String getIznosKredita() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OTPLATNI_PLAN__IZNOS_KREDITA);
	}

	public String getKamatnaStopa() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OTPLATNI_PLAN__KAMATNA_STOPA);
	}

	public String getRataKredita() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OTPLATNI_PLAN__RATA_KREDITA);
	}

	public String getBrojMjeseciKamate() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OTPLATNI_PLAN__BROJ_MJESECI_KAMATE);
	}

	public String getBrojMjeseciRate() {
		return getAsStringOrEmpty(JBDataDictionary.BI_OTPLATNI_PLAN__BROJ_MJESECI_RATE);
	}

	public String getSifraGrupe() {
		return getAsStringOrEmpty(JBDataDictionary.JB_KREDITNI_PROGRAM__SIFRA_GRUPE);
	}

	// setters
	public void setPocetakKoristenja(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.BI_OTPLATNI_PLAN__POCETAK_KORISTENJA);
	}

	public void setPrviObracunKamate(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.BI_OTPLATNI_PLAN__PRVI_OBRACUN_KAMATE);
	}

	public void setDospijecePrveRate(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.BI_OTPLATNI_PLAN__DOSPIJECE_PRVE_RATE);
	}

	public void setIznosKredita(String value) {
		set(JBDataDictionary.BI_OTPLATNI_PLAN__IZNOS_KREDITA, value);
	}

	public void setKamatnaStopa(String value) {
		set(JBDataDictionary.BI_OTPLATNI_PLAN__KAMATNA_STOPA, value);
	}

	public void setRataKredita(String value) {
		set(JBDataDictionary.BI_OTPLATNI_PLAN__RATA_KREDITA, value);
	}

	public void setBrojMjeseciKamate(String value) {
		set(JBDataDictionary.BI_OTPLATNI_PLAN__BROJ_MJESECI_KAMATE, value);
	}

	public void setBrojMjeseciRate(String value) {
		set(JBDataDictionary.BI_OTPLATNI_PLAN__BROJ_MJESECI_RATE, value);
	}

	public void setSifraGrupe(String value) {
		set(JBDataDictionary.JB_KREDITNI_PROGRAM__SIFRA_GRUPE, value);
	}
}