package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

public class IsmsImovinaKorisnikVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_IMOVINA_KORISNIK__ID_KORISNIKA = "id_korisnika";
	public static String ISMS_IMOVINA_KORISNIK__ID_IMOVINE = "id_imovine";
	public static String ISMS_IMOVINA_KORISNIK__ID_PROCESA = "id_procesa";
	public static String ISMS_IMOVINA_KORISNIK__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsImovinaKorisnikVo() {
		super();
	}

	public IsmsImovinaKorisnikVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdKorisnika() {
		return getAsStringOrEmpty(ISMS_IMOVINA_KORISNIK__ID_KORISNIKA);
	}

	public String getIdImovine() {
		return getAsStringOrEmpty(ISMS_IMOVINA_KORISNIK__ID_IMOVINE);
	}

	public String getIdProcesa() {
		return getAsStringOrEmpty(ISMS_IMOVINA_KORISNIK__ID_PROCESA);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(ISMS_IMOVINA_KORISNIK__ORGANIZACIJSKA_JEDINICA);
	}

	public void setIdKorisnika(String value) {
		set(ISMS_IMOVINA_KORISNIK__ID_KORISNIKA, value);
	}

	public void setIdImovine(String value) {
		set(ISMS_IMOVINA_KORISNIK__ID_IMOVINE, value);
	}

	public void setIdProcesa(String value) {
		set(ISMS_IMOVINA_KORISNIK__ID_PROCESA, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(ISMS_IMOVINA_KORISNIK__ORGANIZACIJSKA_JEDINICA, value);
	}

	/* Getters/Setters /> */
}