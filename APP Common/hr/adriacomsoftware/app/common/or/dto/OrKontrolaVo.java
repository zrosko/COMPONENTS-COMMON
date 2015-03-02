package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/**
 * 
 */
public class OrKontrolaVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_KONTROLA__ID_KONTROLE = "id_kontrole";
	public static String OR_KONTROLA__NAZIV = "naziv";
	public static String OR_KONTROLA__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String OR_KONTROLA__ODGOVORNA_OSOBA = "odgovorna_osoba";
	public static String OR_KONTROLA__OCJENA_DJELOTVORNOSTI = "ocjena_djelotvornosti";
	public static String OR_KONTROLA__KLASIFIKACIJA = "klasifikacija";
	public static String OR_KONTROLA__FREKVENCIJA_PROVJERE = "frekvencija_provjere";
	public static String OR_KONTROLA__POCETAK_PRIMJENE = "pocetak_primjene";
	public static String OR_KONTROLA__ODLUKA_REGULATORA = "odluka_regulatora";
	public static String OR_KONTROLA__LINK_ODLUKA_REGULATORA = "link_odluka_regulatora";
	public static String OR_KONTROLA__PROCEDURA = "procedura";
	public static String OR_KONTROLA__LINK_PROCEDURA = "link_procedura";
	public static String OR_KONTROLA__CIJENA_PRIMJENE = "cijena_primjene";
	public static String OR_KONTROLA__OPIS = "opis";

	/* Attributes names /> */
	/* </ Constructors */
	public OrKontrolaVo() {
		super();
	}

	public OrKontrolaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdKontrole() {
		return getAsStringOrEmpty(OR_KONTROLA__ID_KONTROLE);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(OR_KONTROLA__NAZIV);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(OR_KONTROLA__ORGANIZACIJSKA_JEDINICA);
	}

	public String getOdgovornaOsoba() {
		return getAsStringOrEmpty(OR_KONTROLA__ODGOVORNA_OSOBA);
	}

	public String getOcjenaDjelotvornosti() {
		return getAsStringOrEmpty(OR_KONTROLA__OCJENA_DJELOTVORNOSTI);
	}

	public String getKlasifikacija() {
		return getAsStringOrEmpty(OR_KONTROLA__KLASIFIKACIJA);
	}

	public String getFrekvencijaProvjere() {
		return getAsStringOrEmpty(OR_KONTROLA__FREKVENCIJA_PROVJERE);
	}

	public Calendar getPocetakPrimjene() {
		return getAsCalendar(OR_KONTROLA__POCETAK_PRIMJENE);
	}

	public String getOdlukaRegulatora() {
		return getAsStringOrEmpty(OR_KONTROLA__ODLUKA_REGULATORA);
	}

	public String getLinkOdlukaRegulatora() {
		return getAsStringOrEmpty(OR_KONTROLA__LINK_ODLUKA_REGULATORA);
	}

	public String getProcedura() {
		return getAsStringOrEmpty(OR_KONTROLA__PROCEDURA);
	}

	public String getLinkProcedura() {
		return getAsStringOrEmpty(OR_KONTROLA__LINK_PROCEDURA);
	}

	public String getCijenaPrimjene() {
		return getAsStringOrEmpty(OR_KONTROLA__CIJENA_PRIMJENE);
	}

	public String getOpis() {
		return getAsStringOrEmpty(OR_KONTROLA__OPIS);
	}

	public void setIdKontrole(String value) {
		set(OR_KONTROLA__ID_KONTROLE, value);
	}

	public void setNaziv(String value) {
		set(OR_KONTROLA__NAZIV, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(OR_KONTROLA__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setOdgovornaOsoba(String value) {
		set(OR_KONTROLA__ODGOVORNA_OSOBA, value);
	}

	public void setOcjenaDjelotvornosti(String value) {
		set(OR_KONTROLA__OCJENA_DJELOTVORNOSTI, value);
	}

	public void setKlasifikacija(String value) {
		set(OR_KONTROLA__KLASIFIKACIJA, value);
	}

	public void setFrekvencijaProvjere(String value) {
		set(OR_KONTROLA__FREKVENCIJA_PROVJERE, value);
	}

	public void setPocetakPrimjene(Calendar value) {
		setCalendarAsDateString(value, OR_KONTROLA__POCETAK_PRIMJENE);
	}

	public void setOdlukaRegulatora(String value) {
		set(OR_KONTROLA__ODLUKA_REGULATORA, value);
	}

	public void setLinkOdlukaRegulatora(String value) {
		set(OR_KONTROLA__LINK_ODLUKA_REGULATORA, value);
	}

	public void setProcedura(String value) {
		set(OR_KONTROLA__PROCEDURA, value);
	}

	public void setLinkProcedura(String value) {
		set(OR_KONTROLA__LINK_PROCEDURA, value);
	}

	public void setCijenaPrimjene(String value) {
		set(OR_KONTROLA__CIJENA_PRIMJENE, value);
	}

	public void setOpis(String value) {
		set(OR_KONTROLA__OPIS, value);
	}

}