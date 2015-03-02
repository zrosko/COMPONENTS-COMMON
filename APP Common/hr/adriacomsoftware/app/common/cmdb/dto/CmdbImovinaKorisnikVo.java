package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class CmdbImovinaKorisnikVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_IMOVINA_KORISNIK__ID = "id";
	public static String CMDB_IMOVINA_KORISNIK__ID_IMOVINE = "id_imovine";
	public static String CMDB_IMOVINA_KORISNIK__JMBG = "jmbg";
	public static String CMDB_IMOVINA_KORISNIK__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica"; /*

	/* </ Constructors */
	public CmdbImovinaKorisnikVo() {
		super();
	}

	public CmdbImovinaKorisnikVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getId() {
		return getAsString(CMDB_IMOVINA_KORISNIK__ID);
	}

	public String getIdImovine() {
		return getAsString(CMDB_IMOVINA_KORISNIK__ID_IMOVINE);
	}

	public String getJmbg() {
		return getAsString(CMDB_IMOVINA_KORISNIK__JMBG);
	}

	public String getOrganizacijskaJedinica() {
		return getAsString(CMDB_IMOVINA_KORISNIK__ORGANIZACIJSKA_JEDINICA);
	}

	public void setId(String value) {
		set(CMDB_IMOVINA_KORISNIK__ID, value);
	}

	public void setIdImovine(String value) {
		set(CMDB_IMOVINA_KORISNIK__ID_IMOVINE, value);
	}

	public void setJmbg(String value) {
		set(CMDB_IMOVINA_KORISNIK__JMBG, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(CMDB_IMOVINA_KORISNIK__ORGANIZACIJSKA_JEDINICA, value);
	}
	/* Getters/Setters /> */
}