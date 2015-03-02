package hr.adriacomsoftware.app.common.bpm.dto;

import hr.as2.inf.common.data.AS2Record;

public class BpmProcesVo extends BpmVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BPM_PROCES__ID_PROCESA = "id_procesa";
	public static String BPM_PROCES__ID_NADREDENOG_PROCESA = "id_nadredenog_procesa";
	public static String BPM_PROCES__RAZINA = "razina";
	public static String BPM_PROCES__TIP = "tip";
	public static String BPM_PROCES__NAZIV_PROCESA = "naziv_procesa";
	public static String BPM_PROCES__OPIS_PROCESA = "opis_procesa";
	public static String BPM_PROCES__ID_POSLOVNE_LINIJE = "id_poslovne_linije";
	public static String BPM_PROCES__ODGOVORNA_OSOBA = "odgovorna_osoba";
	public static String BPM_PROCES__VAZNOST = "vaznost";
	public static String BPM_PROCES__OCJENA_BROJ_KLIJENATA = "ocjena_broj_klijenata";
	public static String BPM_PROCES__OCJENA_IZNOS_PRIHODA = "ocjena_iznos_prihoda";
	public static String BPM_PROCES__OCJENA_STRATESKA_VAZNOST = "ocjena_strateska_vaznost";
	public static String BPM_PROCES__OCJENA_TRZISNI_UDIO = "ocjena_trzisni_udio";

	/* Attributes names /> */
	/* </ Constructors */
	public BpmProcesVo() {
		super();
	}

	public BpmProcesVo(AS2Record value) {
		super(value);
	}

	/* </ Getters */
	public String getIdProcesa() {
		return getAsStringOrEmpty(BPM_PROCES__ID_PROCESA);
	}

	public String getIdNadredenogProcesa() {
		return getAsStringOrEmpty(BPM_PROCES__ID_NADREDENOG_PROCESA);
	}

	public String getRazina() {
		return getAsStringOrEmpty(BPM_PROCES__RAZINA);
	}

	public String getTip() {
		return getAsStringOrEmpty(BPM_PROCES__TIP);
	}

	public String getNazivProcesa() {
		return getAsStringOrEmpty(BPM_PROCES__NAZIV_PROCESA);
	}

	public String getOpisProcesa() {
		return getAsStringOrEmpty(BPM_PROCES__OPIS_PROCESA);
	}

	public String getIdPoslovneLinije() {
		return getAsStringOrEmpty(BPM_PROCES__ID_POSLOVNE_LINIJE);
	}

	public String getOdgovornaOsoba() {
		return getAsStringOrEmpty(BPM_PROCES__ODGOVORNA_OSOBA);
	}

	public String getVaznost() {
		return getAsStringOrEmpty(BPM_PROCES__VAZNOST);
	}

	public String getOcjenaBrojKlijenata() {
		return getAsStringOrEmpty(BPM_PROCES__OCJENA_BROJ_KLIJENATA);
	}

	public String getOcjenaIznosPrihoda() {
		return getAsStringOrEmpty(BPM_PROCES__OCJENA_IZNOS_PRIHODA);
	}

	public String getOcjenaStrateskaVaznost() {
		return getAsStringOrEmpty(BPM_PROCES__OCJENA_STRATESKA_VAZNOST);
	}

	public String getOcjenaTrzisniUdio() {
		return getAsStringOrEmpty(BPM_PROCES__OCJENA_TRZISNI_UDIO);
	}

	public void setIdProcesa(String value) {
		set(BPM_PROCES__ID_PROCESA, value);
	}

	public void setIdNadredenogProcesa(String value) {
		set(BPM_PROCES__ID_NADREDENOG_PROCESA, value);
	}

	public void setRazina(String value) {
		set(BPM_PROCES__RAZINA, value);
	}

	public void setTip(String value) {
		set(BPM_PROCES__TIP, value);
	}

	public void setNazivProcesa(String value) {
		set(BPM_PROCES__NAZIV_PROCESA, value);
	}

	public void setOpisProcesa(String value) {
		set(BPM_PROCES__OPIS_PROCESA, value);
	}

	public void setIdPoslovneLinije(String value) {
		set(BPM_PROCES__ID_POSLOVNE_LINIJE, value);
	}

	public void setOdgovornaOsoba(String value) {
		set(BPM_PROCES__ODGOVORNA_OSOBA, value);
	}

	public void setVaznost(String value) {
		set(BPM_PROCES__VAZNOST, value.trim());
	}

	public void setOcjenaBrojKlijenata(String value) {
		set(BPM_PROCES__OCJENA_BROJ_KLIJENATA, value.trim());
	}

	public void setOcjenaIznosPrihoda(String value) {
		set(BPM_PROCES__OCJENA_IZNOS_PRIHODA, value.trim());
	}

	public void setOcjenaStrateskaVaznost(String value) {
		set(BPM_PROCES__OCJENA_STRATESKA_VAZNOST, value.trim());
	}

	public void setOcjenaTrzisniUdio(String value) {
		set(BPM_PROCES__OCJENA_TRZISNI_UDIO, value.trim());
	}
	/* Setters /> */
}