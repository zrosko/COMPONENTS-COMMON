package hr.adriacomsoftware.app.common.kalkulatori.dto;

import hr.as2.inf.common.core.AS2Constants;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class FinancijskiKalkulatorVo extends AS2Record implements AS2Constants {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public final static String GLAVNICA = "glavnica";
	public final static String KAMATNA_STOPA = "kamatna_stopa";
	public final static String BROJ_GODINA = "broj_godina";
	public final static String IZRACUN = "izracun";
	public final static String DATUM_OD = "datum_od";
	public final static String DATUM_DO = "datum_do";
	public final static String KAMATNJAK = "kamatnjak";
	// otplatni plan
	public static String OTPLATNI_PLAN__IZNOS_KREDITA = "iznos_kredita";
	public static String OTPLATNI_PLAN__TROSAK_KREDITA = "trosak_kredita";
	public static String OTPLATNI_PLAN__POSTOTAK_NAKNADE = "postotak_naknade";
	public static String OTPLATNI_PLAN__BROJ_GODINA = "broj_godina";
	public static String OTPLATNI_PLAN__SIFRA_VALUTE = "sifra_valute";
	public static String OTPLATNI_PLAN__SIFRA_PROTUVALUTE = "sifra_protuvalute";
	public static String OTPLATNI_PLAN__DATUM_TECAJA = "datum_tecaja";
	public static String OTPLATNI_PLAN__TECAJ = "tecaj";
	public static String OTPLATNI_PLAN__BROJ_RATA_POCEKA = "broj_rata_poceka";
	public static String OTPLATNI_PLAN__VRSTA_TECAJA = "vrsta_tecaja";

	/* Attributes names /> */
	/* </ Constructors */
	public FinancijskiKalkulatorVo() {
		super();
	}

	public FinancijskiKalkulatorVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getBrojRataPoceka() {
		return get(OTPLATNI_PLAN__BROJ_RATA_POCEKA);
	}

	public String getGlavnica() {
		return get(GLAVNICA);
	}

	public String getKamatnaStopa() {
		return get(KAMATNA_STOPA);
	}

	public String getBrojGodina() {
		return get(BROJ_GODINA);
	}

	public String getIzracun() {
		return get(IZRACUN);
	}

	public java.sql.Date getDatumOd() {
		return getAsSqlDate(DATUM_OD);
	}

	public java.sql.Date getDatumDo() {
		return getAsSqlDate(DATUM_DO);
	}

	public String getKamatnjak() {
		return get(KAMATNJAK);
	}

	/* Getters /> */
	/* </ Setters */
	public void setGlavnica(String value) {
		set(GLAVNICA, value);
	}

	public void setKamatnaStopa(String value) {
		set(KAMATNA_STOPA, value);
	}

	public void setBrojGodina(String value) {
		set(BROJ_GODINA, value);
	}

	public void setIzracun(String value) {
		set(IZRACUN, value);
	}

	public void setDatumOd(Calendar value) {
		setCalendarAsDateString(value, DATUM_OD);
	}

	public void setDatumDo(Calendar value) {
		setCalendarAsDateString(value, DATUM_DO);
	}

	public void setKamatnjak(String value) {
		set(KAMATNJAK, value);
	}

	/* Setters /> */
	// novo
	public String getIznosKredita() {
		return get(OTPLATNI_PLAN__IZNOS_KREDITA);
	}

	public String getTrosakKredita() {
		return get(OTPLATNI_PLAN__TROSAK_KREDITA);
	}

	public String getPostotakNaknade() {
		return get(OTPLATNI_PLAN__POSTOTAK_NAKNADE);
	}

	public String getSifraValute() {
		String value = get(OTPLATNI_PLAN__SIFRA_VALUTE);
		if (value != null && value.trim().length() < 1)
			return null;
		return value;
	}

	public String getSifraProtuvalute() {
		String value = get(OTPLATNI_PLAN__SIFRA_PROTUVALUTE);
		if (value != null && value.trim().length() < 1)
			return null;
		return value;
	}

	public java.sql.Date getDatumTecaja() {
		return getAsSqlDate(OTPLATNI_PLAN__DATUM_TECAJA);
	}

	public String getTecaj() {
		return get(OTPLATNI_PLAN__TECAJ);
	}

	public String getVrstaTecaja() {
		return get(OTPLATNI_PLAN__VRSTA_TECAJA);
	}

	// set
	public void setIznosKredita(String value) {
		set(OTPLATNI_PLAN__IZNOS_KREDITA, value);
	}

	public void setTrosakKredita(String value) {
		set(OTPLATNI_PLAN__TROSAK_KREDITA, value);
	}

	public void setPostotakNaknade(String value) {
		set(OTPLATNI_PLAN__POSTOTAK_NAKNADE, value);
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

	public void setBrojRataPoceka(String value) {
		set(OTPLATNI_PLAN__BROJ_RATA_POCEKA, value);
	}
}