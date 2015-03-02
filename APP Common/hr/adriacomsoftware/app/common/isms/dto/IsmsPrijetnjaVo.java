package hr.adriacomsoftware.app.common.isms.dto;

import hr.as2.inf.common.data.AS2Record;

public class IsmsPrijetnjaVo extends IsmsVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String ISMS_PRIJETNJA__ID_PRIJETNJE = "id_prijetnje";
	public static String ISMS_PRIJETNJA__VRSTA_PRIJETNJE = "vrsta_prijetnje";
	public static String ISMS_PRIJETNJA__VJEROJATNOST = "vjerojatnost";
	public static String ISMS_PRIJETNJA__AKTIVNO = "aktivno";
	public static String ISMS_PRIJETNJA__PORIJEKLO = "porijeklo";
	public static String ISMS_PRIJETNJA__MOTIV = "motiv";
	public static String ISMS_PRIJETNJA__UCESTALOST = "ucestalost";
	public static String ISMS_PRIJETNJA__IZVOR = "izvor";
	public static String ISMS_PRIJETNJA__NAMJERA = "namjera";
	public static String ISMS_PRIJETNJA__RAZORNA_MOC = "razorna_moc";
	public static String ISMS_PRIJETNJA__NAZIV = "naziv";
	public static String ISMS_PRIJETNJA__OPIS = "opis";
	public static String ISMS_PRIJETNJA__TIPICNO_PONASANJE = "tipicno_ponasanje";
	public static String ISMS_PRIJETNJA__OPIS_RANJIVOSTI = "opis_ranjivosti";
	public static String ISMS_PRIJETNJA__PREVENCIJA = "prevencija";
	public static String ISMS_PRIJETNJA__OPIS_PREPOZNAVANJA = "opis_prepoznavanja";
	public static String ISMS_PRIJETNJA__OPIS_PROTUMJERA = "opis_protumjera";
	public static String ISMS_PRIJETNJA__MOGUCE_KONTROLE = "moguce_kontrole";
	public static String ISMS_PRIJETNJA__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public IsmsPrijetnjaVo() {
		super();
	}

	public IsmsPrijetnjaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdPrijetnje() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__ID_PRIJETNJE);
	}

	public String getVrstaPrijetnje() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__VRSTA_PRIJETNJE);
	}

	public String getVjerojatnost() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__VJEROJATNOST);
	}

	public String getAktivno() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__AKTIVNO);
	}

	public String getPorijeklo() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__PORIJEKLO);
	}

	public String getMotiv() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__MOTIV);
	}

	public String getUcestalost() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__UCESTALOST);
	}

	public String getIzvor() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__IZVOR);
	}

	public String getNamjera() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__NAMJERA);
	}

	public String getRazornaMoc() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__RAZORNA_MOC);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__OPIS);
	}

	public String getTipicnoPonasanje() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__TIPICNO_PONASANJE);
	}

	public String getOpisRanjivosti() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__OPIS_RANJIVOSTI);
	}

	public String getPrevencija() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__PREVENCIJA);
	}

	public String getOpisPrepoznavanja() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__OPIS_PREPOZNAVANJA);
	}

	public String getOpisProtumjera() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__OPIS_PROTUMJERA);
	}

	public String getMoguceKontrole() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__MOGUCE_KONTROLE);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(ISMS_PRIJETNJA__ISPRAVNO);
	}

	public void setIdPrijetnje(String value) {
		set(ISMS_PRIJETNJA__ID_PRIJETNJE, value);
	}

	public void setVrstaPrijetnje(String value) {
		set(ISMS_PRIJETNJA__VRSTA_PRIJETNJE, value);
	}

	public void setVjerojatnost(String value) {
		set(ISMS_PRIJETNJA__VJEROJATNOST, value);
	}

	public void setAktivno(String value) {
		set(ISMS_PRIJETNJA__AKTIVNO, value);
	}

	public void setPorijeklo(String value) {
		set(ISMS_PRIJETNJA__PORIJEKLO, value);
	}

	public void setMotiv(String value) {
		set(ISMS_PRIJETNJA__MOTIV, value);
	}

	public void setUcestalost(String value) {
		set(ISMS_PRIJETNJA__UCESTALOST, value);
	}

	public void setIzvor(String value) {
		set(ISMS_PRIJETNJA__IZVOR, value);
	}

	public void setNamjera(String value) {
		set(ISMS_PRIJETNJA__NAMJERA, value);
	}

	public void setRazornaMoc(String value) {
		set(ISMS_PRIJETNJA__RAZORNA_MOC, value);
	}

	public void setNaziv(String value) {
		set(ISMS_PRIJETNJA__NAZIV, value);
	}

	public void setOpis(String value) {
		set(ISMS_PRIJETNJA__OPIS, value);
	}

	public void setTipicnoPonasanje(String value) {
		set(ISMS_PRIJETNJA__TIPICNO_PONASANJE, value);
	}

	public void setOpisRanjivosti(String value) {
		set(ISMS_PRIJETNJA__OPIS_RANJIVOSTI, value);
	}

	public void setPrevencija(String value) {
		set(ISMS_PRIJETNJA__PREVENCIJA, value);
	}

	public void setOpisPrepoznavanja(String value) {
		set(ISMS_PRIJETNJA__OPIS_PREPOZNAVANJA, value);
	}

	public void setOpisProtumjera(String value) {
		set(ISMS_PRIJETNJA__OPIS_PROTUMJERA, value);
	}

	public void setMoguceKontrole(String value) {
		set(ISMS_PRIJETNJA__MOGUCE_KONTROLE, value);
	}

	public void setIspravno(String value) {
		set(ISMS_PRIJETNJA__ISPRAVNO, value);
	}
	/* Getters/Setters /> */
}