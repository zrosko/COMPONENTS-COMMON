package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

public class OrOcjenaVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	public static String OCJENA__IZNOS = "iznos";
	public static String OCJENA__UCESTALOST = "ucestalost";
	public static String OCJENA__UCINAK = "ucinak";
	public static String OCJENA__VISINA_RIZIKA = "visina_rizika";
	public static String OCJENA__STATUS_OPERATIVNOG_RIZIKA = "status_operativnog_rizika";
	public static String OCJENA__STATUS_DOGADAJA = "status_dogadaja";
	public static String OCJENA__VISINA_GUBITKA = "visina_gubitka";
	// eksternalizacija
	public static String OCJENA__EKST_EKONOM_FINANCIJSKA = "ekst_ekonom_financijska";
	public static String OCJENA__EKST_ZAPOSLENICI = "ekst_zaposlenici";
	public static String OCJENA__EKST_RIZIK = "ekst_rizik";
	public static String OCJENA__EKST_USLUGA = "ekst_usluga";
	public static String OCJENA__EKST_UGOVOR = "ekst_ugovor";
	/* </ Attribute names */
	public static String OR_OCJENA__STUPANJ = "stupanj";
	public static String OR_OCJENA__VRSTA = "vrsta";
	public static String OR_OCJENA__NAZIV = "naziv";
	public static String OR_OCJENA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public OrOcjenaVo() {
		super();
	}

	public OrOcjenaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getStupanj() {
		return getAsStringOrEmpty(OR_OCJENA__STUPANJ);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(OR_OCJENA__VRSTA);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(OR_OCJENA__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(OR_OCJENA__OPIS);
	}

	public void setStupanj(String value) {
		set(OR_OCJENA__STUPANJ, value);
	}

	public void setVrsta(String value) {
		set(OR_OCJENA__VRSTA, value);
	}

	public void setNaziv(String value) {
		set(OR_OCJENA__NAZIV, value);
	}

	public void setOpis(String value) {
		set(OR_OCJENA__OPIS, value);
	}

}