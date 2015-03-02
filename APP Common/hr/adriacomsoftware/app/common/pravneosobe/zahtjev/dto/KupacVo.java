package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KupacVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;
    public static String PO_ZAH_KUPAC__ID_KUPCA = "id_kupca";
    public static String PO_ZAH_KUPAC__BROJ_ZAHTJEVA = "broj_zahtjeva";
    public static String PO_ZAH_KUPAC__NAZIV = "naziv";
    public static String PO_ZAH_KUPAC__STRANI = "strani";
    public static String PO_ZAH_KUPAC__PRETHODNA_SALDO = "prethodna_saldo";
    public static String PO_ZAH_KUPAC__PRETHODNA_PROMET = "prethodna_promet";
    public static String PO_ZAH_KUPAC__TEKUCA_SALDO = "tekuca_saldo";
    public static String PO_ZAH_KUPAC__TEKUCA_PROMET = "tekuca_promet";
    public static String PO_ZAH_KUPAC__PRETHODNA_POSTOTAK_PROMETA = "prethodna_postotak_prometa";
    public static String PO_ZAH_KUPAC__TEKUCA_POSTOTAK_PROMETA = "tekuca_postotak_prometa";
    public static String PO_ZAH_KUPAC__PRETHODNA_PROMET_UKUPNO = "prethodna_promet_ukupno";
    public static String PO_ZAH_KUPAC__PRETHODNA_SALDO_UKUPNO = "prethodna_saldo_ukupno";
    public static String PO_ZAH_KUPAC__TEKUCA_PROMET_UKUPNO = "tekuca_promet_ukupno";
    public static String PO_ZAH_KUPAC__TEKUCA_SALDO_UKUPNO = "tekuca_saldo_ukupno";
    public static String PO_ZAH_KUPAC__DATUM_ANALIZE = "datum_analize";
    public static String PO_ZAH_KUPAC__UCITANO = "ucitano";
    public KupacVo() {
        super();
    }
    public KupacVo(AS2Record value) {
        super(value);
    }
    public Calendar getDatumAnalize() {
    	return getAsCalendar(PO_ZAH_KUPAC__DATUM_ANALIZE);
    }
    public String getIdKupca() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__ID_KUPCA);
    }
    public String getBrojZahtjeva() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__BROJ_ZAHTJEVA);
    }
    public String getNaziv() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__NAZIV);
    }
    public String getStrani() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__STRANI);
    }
    public String getPrethodnaSaldo() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__PRETHODNA_SALDO);
    }
    public String getPrethodnaPromet() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__PRETHODNA_PROMET);
    }
    public String getTekucaSaldo() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__TEKUCA_SALDO);
    }
    public String getTekucaPromet() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__TEKUCA_PROMET);
    }
    public String getPrethodnaPostotakPrometa() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__PRETHODNA_POSTOTAK_PROMETA);
    }
    public String getTekucaPostotakPrometa() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__TEKUCA_POSTOTAK_PROMETA);
    }
    public String getPrethodnaPrometUkupno() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__PRETHODNA_PROMET_UKUPNO);
    }
    public String getPrethodnaSaldoUkupno() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__PRETHODNA_SALDO_UKUPNO);
    }
    public String getTekucaPrometUkupno() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__TEKUCA_PROMET_UKUPNO);
    }
    public String getTekucaSaldoUkupno() {
    	return getAsStringOrEmpty(PO_ZAH_KUPAC__TEKUCA_SALDO_UKUPNO);
    }
    public void setDatumAnalize(Calendar value) {
    	setCalendarAsDateString(value, PO_ZAH_KUPAC__DATUM_ANALIZE);
    }
    public void setIdKupca(String value) {
    	set(PO_ZAH_KUPAC__ID_KUPCA, value);
    }
    public void setBrojZahtjeva(String value) {
    	set(PO_ZAH_KUPAC__BROJ_ZAHTJEVA, value);
    }
    public void setNaziv(String value) {
    	set(PO_ZAH_KUPAC__NAZIV, value);
    }
    public void setStrani(String value) {
    	set(PO_ZAH_KUPAC__STRANI, value);
    }
    public void setPrethodnaSaldo(double value) {
    	set(PO_ZAH_KUPAC__PRETHODNA_SALDO, value);
    }
    public void setPrethodnaPromet(double value) {
    	set(PO_ZAH_KUPAC__PRETHODNA_PROMET, value);
    }
    public void setPrethodnaSaldo(String value) {
    	set(PO_ZAH_KUPAC__PRETHODNA_SALDO, value);
    }
    public void setPrethodnaPromet(String value) {
    	set(PO_ZAH_KUPAC__PRETHODNA_PROMET, value);
    }    
    public void setTekucaSaldo(String value) {
    	set(PO_ZAH_KUPAC__TEKUCA_SALDO, value);
    }
    public void setTekucaPromet(String value) {
    	set(PO_ZAH_KUPAC__TEKUCA_PROMET, value);
    }
    public void setPrethodnaPostotakPrometa(String value) {
    	set(PO_ZAH_KUPAC__PRETHODNA_POSTOTAK_PROMETA, value);
    }
    public void setTekucaPostotakPrometa(String value) {
    	set(PO_ZAH_KUPAC__TEKUCA_POSTOTAK_PROMETA, value);
    }
    public void setPrethodnaPrometUkupno(String value) {
    	set(PO_ZAH_KUPAC__PRETHODNA_PROMET_UKUPNO, value);
    }
    public void setPrethodnaSaldoUkupno(String value) {
    	set(PO_ZAH_KUPAC__PRETHODNA_SALDO_UKUPNO, value);
    }
    public void setTekucaPrometUkupno(String value) {
    	set(PO_ZAH_KUPAC__TEKUCA_PROMET_UKUPNO, value);
    }
    public void setTekucaSaldoUkupno(String value) {
    	set(PO_ZAH_KUPAC__TEKUCA_SALDO_UKUPNO, value);
    }
    public void setUcitano(String value) {
    	set(PO_ZAH_KUPAC__UCITANO, value);
    }   
}