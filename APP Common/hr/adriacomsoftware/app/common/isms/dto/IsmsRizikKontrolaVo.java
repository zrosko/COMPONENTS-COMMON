package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

public class IsmsRizikKontrolaVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_RIZIK_KONTROLA__ID_RIZIK_KONTROLA = "id_rizik_kontrola";
	public static String ISMS_RIZIK_KONTROLA__ID_KONTROLE = "id_kontrole";
	public static String ISMS_RIZIK_KONTROLA__ID_RIZIKA = "id_rizika";
	public static String ISMS_RIZIK_KONTROLA__PRIJEDLOG = "prijedlog";
	public static String ISMS_RIZIK_KONTROLA__PRIMJENA = "primjena";
	public static String ISMS_RIZIK_KONTROLA__STATUS = "status";
	public static String ISMS_RIZIK_KONTROLA__PROVODENJE_ISPLATIVOST = "provodenje_isplativost";
	public static String ISMS_RIZIK_KONTROLA__OCJENA_IZVODIVOSTI = "ocjena_izvodivosti";
	public static String ISMS_RIZIK_KONTROLA__OCJENA_DJELOTVORNOSTI = "ocjena_djelotvornosti";
	public static String ISMS_RIZIK_KONTROLA__PRIKLADNOST_OPIS = "prikladnost_opis";
	public static String ISMS_RIZIK_KONTROLA__PROVODENJE_TROSAK = "provodenje_trosak";
	public static String ISMS_RIZIK_KONTROLA__PROVODENJE_RAZLOG = "provodenje_razlog";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsRizikKontrolaVo() {
		super();
	}

	public IsmsRizikKontrolaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdRizikKontrola() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__ID_RIZIK_KONTROLA);
	}

	public String getIdKontrole() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__ID_KONTROLE);
	}

	public String getIdRizika() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__ID_RIZIKA);
	}

	public String getPrijedlog() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__PRIJEDLOG);
	}

	public String getPrimjena() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__PRIMJENA);
	}

	public String getStatus() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__STATUS);
	}

	public String getProvodenjeIsplativost() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__PROVODENJE_ISPLATIVOST);
	}

	public String getOcjenaIzvodivosti() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__OCJENA_IZVODIVOSTI);
	}

	public String getOcjenaDjelotvornosti() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__OCJENA_DJELOTVORNOSTI);
	}

	public String getPrikladnostOpis() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__PRIKLADNOST_OPIS);
	}

	public String getProvodenjeTrosak() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__PROVODENJE_TROSAK);
	}

	public String getProvodenjeRazlog() {
		return getAsStringOrEmpty(ISMS_RIZIK_KONTROLA__PROVODENJE_RAZLOG);
	}

	public void setIdRizikKontrola(String value) {
		set(ISMS_RIZIK_KONTROLA__ID_RIZIK_KONTROLA, value);
	}

	public void setIdKontrole(String value) {
		set(ISMS_RIZIK_KONTROLA__ID_KONTROLE, value);
	}

	public void setIdRizika(String value) {
		set(ISMS_RIZIK_KONTROLA__ID_RIZIKA, value);
	}

	public void setPrijedlog(String value) {
		set(ISMS_RIZIK_KONTROLA__PRIJEDLOG, value);
	}

	public void setPrimjena(String value) {
		set(ISMS_RIZIK_KONTROLA__PRIMJENA, value);
	}

	public void setStatus(String value) {
		set(ISMS_RIZIK_KONTROLA__STATUS, value);
	}

	public void setProvodenjeIsplativost(String value) {
		set(ISMS_RIZIK_KONTROLA__PROVODENJE_ISPLATIVOST, value);
	}

	public void setOcjenaIzvodivosti(String value) {
		set(ISMS_RIZIK_KONTROLA__OCJENA_IZVODIVOSTI, value);
	}

	public void setOcjenaDjelotvornosti(String value) {
		set(ISMS_RIZIK_KONTROLA__OCJENA_DJELOTVORNOSTI, value);
	}

	public void setPrikladnostOpis(String value) {
		set(ISMS_RIZIK_KONTROLA__PRIKLADNOST_OPIS, value);
	}

	public void setProvodenjeTrosak(String value) {
		set(ISMS_RIZIK_KONTROLA__PROVODENJE_TROSAK, value);
	}

	public void setProvodenjeRazlog(String value) {
		set(ISMS_RIZIK_KONTROLA__PROVODENJE_RAZLOG, value);
	}
	/* Getters/Setters /> */
}