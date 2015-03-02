package hr.adriacomsoftware.app.common.pdv.gr.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class PdvVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String PDV_GR_RACUN__ID_UNOSA = "id_unosa";
	public static String PDV_GR_RACUN__REDNI_BROJ = "redni_broj";
	public static String PDV_GR_RACUN__DATUM = "datum";
	public static String PDV_GR_RACUN__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String PDV_GR_RACUN__BROJ_PARTIJE = "broj_partije";
	public static String PDV_GR_RACUN__NAZIV = "naziv";
	public static String PDV_GR_RACUN__MATICNI_BROJ = "maticni_broj";
	public static String PDV_GR_RACUN__OIB = "oib";
	public static String PDV_GR_RACUN__ULICA = "ulica";
	public static String PDV_GR_RACUN__POSTANSKI_BROJ = "postanski_broj";
	public static String PDV_GR_RACUN__MJESTO = "mjesto";
	public static String PDV_GR_RACUN__VRSTA_USLUGE = "vrsta_usluge";
	public static String PDV_GR_RACUN__BROJ_KONTA = "broj_konta";
	public static String PDV_GR_RACUN__JEDINICNA_CIJENA = "jedinicna_cijena";
	public static String PDV_GR_RACUN__BROJ_USLUGA = "broj_usluga";
	public static String PDV_GR_RACUN__IZNOS_NAKNADE = "iznos_naknade";
	public static String PDV_GR_RACUN__PDV = "pdv";
	public static String PDV_GR_RACUN__IZNOS_PDV = "iznos_pdv";
	public static String PDV_GR_RACUN__UKUPNO = "ukupno";
	public static String PDV_GR_RACUN__PROTU_KONTO = "protu_konto";
	public static String PDV_GR_RACUN__OZNAKA = "oznaka";
	public static String PDV_GR_RACUN__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public PdvVo() {
		super();
	}

	public PdvVo(AS2Record value) {
		super(value);
	}

	public String getIdUnosa() {
		return getAsStringOrEmpty(PDV_GR_RACUN__ID_UNOSA);
	}

	public String getRedniBroj() {
		return getAsStringOrEmpty(PDV_GR_RACUN__REDNI_BROJ);
	}

	public Calendar getDatum() {
		return getAsCalendar(PDV_GR_RACUN__DATUM);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(PDV_GR_RACUN__ORGANIZACIJSKA_JEDINICA);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(PDV_GR_RACUN__BROJ_PARTIJE);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(PDV_GR_RACUN__NAZIV);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(PDV_GR_RACUN__MATICNI_BROJ);
	}

	public String getOib() {
		return getAsStringOrEmpty(PDV_GR_RACUN__OIB);
	}

	public String getUlica() {
		return getAsStringOrEmpty(PDV_GR_RACUN__ULICA);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(PDV_GR_RACUN__POSTANSKI_BROJ);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(PDV_GR_RACUN__MJESTO);
	}

	public String getVrstaUsluge() {
		return getAsStringOrEmpty(PDV_GR_RACUN__VRSTA_USLUGE);
	}

	public String getBrojKonta() {
		return getAsStringOrEmpty(PDV_GR_RACUN__BROJ_KONTA);
	}

	public String getJedinicnaCijena() {
		return getAsStringOrEmpty(PDV_GR_RACUN__JEDINICNA_CIJENA);
	}

	public String getBrojUsluga() {
		return getAsStringOrEmpty(PDV_GR_RACUN__BROJ_USLUGA);
	}

	public String getIznosNaknade() {
		return getAsStringOrEmpty(PDV_GR_RACUN__IZNOS_NAKNADE);
	}

	public String getPdv() {
		return getAsStringOrEmpty(PDV_GR_RACUN__PDV);
	}

	public String getIznosPdv() {
		return getAsStringOrEmpty(PDV_GR_RACUN__IZNOS_PDV);
	}

	public String getUkupno() {
		return getAsStringOrEmpty(PDV_GR_RACUN__UKUPNO);
	}

	public String getProtuKonto() {
		return getAsStringOrEmpty(PDV_GR_RACUN__PROTU_KONTO);
	}

	public String getOznaka() {
		return getAsStringOrEmpty(PDV_GR_RACUN__OZNAKA);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(PDV_GR_RACUN__ISPRAVNO);
	}

	public void setIdUnosa(String value) {
		set(PDV_GR_RACUN__ID_UNOSA, value);
	}

	public void setRedniBroj(String value) {
		set(PDV_GR_RACUN__REDNI_BROJ, value);
	}

	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, PDV_GR_RACUN__DATUM);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(PDV_GR_RACUN__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setBrojPartije(String value) {
		set(PDV_GR_RACUN__BROJ_PARTIJE, value);
	}

	public void setNaziv(String value) {
		set(PDV_GR_RACUN__NAZIV, value);
	}

	public void setMaticniBroj(String value) {
		set(PDV_GR_RACUN__MATICNI_BROJ, value);
	}

	public void setOib(String value) {
		set(PDV_GR_RACUN__OIB, value);
	}

	public void setUlica(String value) {
		set(PDV_GR_RACUN__ULICA, value);
	}

	public void setPostanskiBroj(String value) {
		set(PDV_GR_RACUN__POSTANSKI_BROJ, value);
	}

	public void setMjesto(String value) {
		set(PDV_GR_RACUN__MJESTO, value);
	}

	public void setVrstaUsluge(String value) {
		set(PDV_GR_RACUN__VRSTA_USLUGE, value);
	}

	public void setBrojKonta(String value) {
		set(PDV_GR_RACUN__BROJ_KONTA, value);
	}

	public void setJedinicnaCijena(String value) {
		set(PDV_GR_RACUN__JEDINICNA_CIJENA, value);
	}

	public void setBrojUsluga(String value) {
		set(PDV_GR_RACUN__BROJ_USLUGA, value);
	}

	public void setIznosNaknade(String value) {
		set(PDV_GR_RACUN__IZNOS_NAKNADE, value);
	}

	public void setPdv(String value) {
		set(PDV_GR_RACUN__PDV, value);
	}

	public void setIznosPdv(String value) {
		set(PDV_GR_RACUN__IZNOS_PDV, value);
	}

	public void setUkupno(String value) {
		set(PDV_GR_RACUN__UKUPNO, value);
	}

	public void setProtuKonto(String value) {
		set(PDV_GR_RACUN__PROTU_KONTO, value);
	}

	public void setOznaka(String value) {
		set(PDV_GR_RACUN__OZNAKA, value);
	}

	public void setIspravno(String value) {
		set(PDV_GR_RACUN__ISPRAVNO, value);
	}

}