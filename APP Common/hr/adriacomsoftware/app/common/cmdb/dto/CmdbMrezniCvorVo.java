package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class CmdbMrezniCvorVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String CMDB_MREZNI_CVOR__ID_CVORA = "id_cvora";
	public static String CMDB_MREZNI_CVOR__OZNAKA = "oznaka";
	public static String CMDB_MREZNI_CVOR__ID_LOKACIJE = "id_lokacije";
	public static String CMDB_MREZNI_CVOR__KORISNIK = "korisnik";
	public static String CMDB_MREZNI_CVOR__ID_ZGRADE = "id_zgrade";
	public static String CMDB_MREZNI_CVOR__KAT = "kat";
	public static String CMDB_MREZNI_CVOR__OZNAKA_SOBE = "oznaka_sobe";
	public static String CMDB_MREZNI_CVOR__ORMAR = "ormar";
	public static String CMDB_MREZNI_CVOR__IP_ADRESA_PRIVATNA = "ip_adresa_privatna";
	public static String CMDB_MREZNI_CVOR__KOMENTAR = "komentar";

	/* </ Constructors */
	public CmdbMrezniCvorVo() {
		super();
	}

	public CmdbMrezniCvorVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdCvora() {
		return getAsString(CMDB_MREZNI_CVOR__ID_CVORA);
	}

	public String getOznaka() {
		return getAsString(CMDB_MREZNI_CVOR__OZNAKA);
	}

	public String getIdLokacije() {
		return getAsString(CMDB_MREZNI_CVOR__ID_LOKACIJE);
	}

	public String getKorisnik() {
		return getAsString(CMDB_MREZNI_CVOR__KORISNIK);
	}

	public String getIdZgrade() {
		return getAsString(CMDB_MREZNI_CVOR__ID_ZGRADE);
	}

	public String getKat() {
		return getAsString(CMDB_MREZNI_CVOR__KAT);
	}

	public String getOznakaSobe() {
		return getAsString(CMDB_MREZNI_CVOR__OZNAKA_SOBE);
	}

	public String getOrmar() {
		return getAsString(CMDB_MREZNI_CVOR__ORMAR);
	}

	public String getIpAdresaPrivatna() {
		return getAsString(CMDB_MREZNI_CVOR__IP_ADRESA_PRIVATNA);
	}

	public String getKomentar() {
		return getAsString(CMDB_MREZNI_CVOR__KOMENTAR);
	}

	public void setIdCvora(String value) {
		set(CMDB_MREZNI_CVOR__ID_CVORA, value);
	}

	public void setOznaka(String value) {
		set(CMDB_MREZNI_CVOR__OZNAKA, value);
	}

	public void setIdLokacije(String value) {
		set(CMDB_MREZNI_CVOR__ID_LOKACIJE, value);
	}

	public void setKorisnik(String value) {
		set(CMDB_MREZNI_CVOR__KORISNIK, value);
	}

	public void setIdZgrade(String value) {
		set(CMDB_MREZNI_CVOR__ID_ZGRADE, value);
	}

	public void setKat(String value) {
		set(CMDB_MREZNI_CVOR__KAT, value);
	}

	public void setOznakaSobe(String value) {
		set(CMDB_MREZNI_CVOR__OZNAKA_SOBE, value);
	}

	public void setOrmar(String value) {
		set(CMDB_MREZNI_CVOR__ORMAR, value);
	}

	public void setIpAdresaPrivatna(String value) {
		set(CMDB_MREZNI_CVOR__IP_ADRESA_PRIVATNA, value);
	}

	public void setKomentar(String value) {
		set(CMDB_MREZNI_CVOR__KOMENTAR, value);
	}

	/* Getters/Setters /> */
}