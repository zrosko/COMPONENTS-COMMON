package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

/************* CONSTANTS or_kontni_plan ************/

public class OrKontniPlanVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String OR_KONTNI_PLAN__BROJ_KONTA = "broj_konta";
	public static String OR_KONTNI_PLAN__NAZIV = "naziv";
	public static String OR_KONTNI_PLAN__OPIS = "opis";

	public OrKontniPlanVo() {
		super();
	}

	public OrKontniPlanVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getBrojKonta() {
		return get(OR_KONTNI_PLAN__BROJ_KONTA);
	}

	public String getNaziv() {
		return get(OR_KONTNI_PLAN__NAZIV);
	}

	public String getOpis() {
		return get(OR_KONTNI_PLAN__OPIS);
	}

	/************* SETTERS ************/

	public void setBrojKonta(String value) {
		set(OR_KONTNI_PLAN__BROJ_KONTA, value);
	}

	public void setNaziv(String value) {
		set(OR_KONTNI_PLAN__NAZIV, value);
	}

	public void setOpis(String value) {
		set(OR_KONTNI_PLAN__OPIS, value);
	}
}