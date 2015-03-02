package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

public class OrPrijetnjaVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_PRIJETNJA__ID_PRIJETNJE = "id_prijetnje";
	public static String OR_PRIJETNJA__ID_OSIGURANJA = "id_osiguranja";
	public static String OR_PRIJETNJA__NAZIV = "naziv";
	public static String OR_PRIJETNJA__VJEROJATNOST = "vjerojatnost";
	public static String OR_PRIJETNJA__UCESTALOST = "ucestalost";
	public static String OR_PRIJETNJA__IZVOR = "izvor";
	public static String OR_PRIJETNJA__NAMJERA = "namjera";
	public static String OR_PRIJETNJA__RAZORNA_MOC = "razorna_moc";
	public static String OR_PRIJETNJA__OPIS = "opis";
	public static String OR_PRIJETNJA__PREVENCIJA = "prevencija";
	public static String OR_PRIJETNJA__OPIS_PREPOZNAVANJA = "opis_prepoznavanja";
	public static String OR_PRIJETNJA__OPIS_PROTUMJERA = "opis_protumjera";
	public static String OR_PRIJETNJA__MOGUCE_KONTROLE = "moguce_kontrole";

	/* Attributes names /> */
	/* </ Constructors */
	public OrPrijetnjaVo() {
		super();
	}

	public OrPrijetnjaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdPrijetnje() {
		return getAsStringOrEmpty(OR_PRIJETNJA__ID_PRIJETNJE);
	}

	public String getIdOsiguranja() {
		return getAsStringOrEmpty(OR_PRIJETNJA__ID_OSIGURANJA);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(OR_PRIJETNJA__NAZIV);
	}

	public String getVjerojatnost() {
		return getAsStringOrEmpty(OR_PRIJETNJA__VJEROJATNOST);
	}

	public String getUcestalost() {
		return getAsStringOrEmpty(OR_PRIJETNJA__UCESTALOST);
	}

	public String getIzvor() {
		return getAsStringOrEmpty(OR_PRIJETNJA__IZVOR);
	}

	public String getNamjera() {
		return getAsStringOrEmpty(OR_PRIJETNJA__NAMJERA);
	}

	public String getRazornaMoc() {
		return getAsStringOrEmpty(OR_PRIJETNJA__RAZORNA_MOC);
	}

	public String getOpis() {
		return getAsStringOrEmpty(OR_PRIJETNJA__OPIS);
	}

	public String getPrevencija() {
		return getAsStringOrEmpty(OR_PRIJETNJA__PREVENCIJA);
	}

	public String getOpisPrepoznavanja() {
		return getAsStringOrEmpty(OR_PRIJETNJA__OPIS_PREPOZNAVANJA);
	}

	public String getOpisProtumjera() {
		return getAsStringOrEmpty(OR_PRIJETNJA__OPIS_PROTUMJERA);
	}

	public String getMoguceKontrole() {
		return getAsStringOrEmpty(OR_PRIJETNJA__MOGUCE_KONTROLE);
	}

	public void setIdPrijetnje(String value) {
		set(OR_PRIJETNJA__ID_PRIJETNJE, value);
	}

	public void setIdOsiguranja(String value) {
		set(OR_PRIJETNJA__ID_OSIGURANJA, value);
	}

	public void setNaziv(String value) {
		set(OR_PRIJETNJA__NAZIV, value);
	}

	public void setVjerojatnost(String value) {
		set(OR_PRIJETNJA__VJEROJATNOST, value);
	}

	public void setUcestalost(String value) {
		set(OR_PRIJETNJA__UCESTALOST, value);
	}

	public void setIzvor(String value) {
		set(OR_PRIJETNJA__IZVOR, value);
	}

	public void setNamjera(String value) {
		set(OR_PRIJETNJA__NAMJERA, value);
	}

	public void setRazornaMoc(String value) {
		set(OR_PRIJETNJA__RAZORNA_MOC, value);
	}

	public void setOpis(String value) {
		set(OR_PRIJETNJA__OPIS, value);
	}

	public void setPrevencija(String value) {
		set(OR_PRIJETNJA__PREVENCIJA, value);
	}

	public void setOpisPrepoznavanja(String value) {
		set(OR_PRIJETNJA__OPIS_PREPOZNAVANJA, value);
	}

	public void setOpisProtumjera(String value) {
		set(OR_PRIJETNJA__OPIS_PROTUMJERA, value);
	}

	public void setMoguceKontrole(String value) {
		set(OR_PRIJETNJA__MOGUCE_KONTROLE, value);
	}

}