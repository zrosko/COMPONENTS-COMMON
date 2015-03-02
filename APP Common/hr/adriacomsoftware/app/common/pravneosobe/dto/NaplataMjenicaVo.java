package hr.adriacomsoftware.app.common.pravneosobe.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class NaplataMjenicaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String PO_NAPLATA_MJENICA__ID_MJENICE = "id_mjenice";
	public static String PO_NAPLATA_MJENICA__DATUM_ZAPRIMANJA = "datum_zaprimanja";
	public static String PO_NAPLATA_MJENICA__DATUM_DOSPIJECA = "datum_dospijeca";
	public static String PO_NAPLATA_MJENICA__MATICNI_BROJ_TRASANTA = "maticni_broj_trasanta";
	public static String PO_NAPLATA_MJENICA__OIB_TRASANTA = "oib_trasanta";
	public static String PO_NAPLATA_MJENICA__NAZIV_TRASANTA = "naziv_trasanta";
	public static String PO_NAPLATA_MJENICA__MATICNI_BROJ_REMITENTA = "maticni_broj_remitenta";
	public static String PO_NAPLATA_MJENICA__OIB_REMITENTA = "oib_remitenta";
	public static String PO_NAPLATA_MJENICA__NAZIV_REMITENTA = "naziv_remitenta";
	public static String PO_NAPLATA_MJENICA__IZNOS = "iznos";
	public static String PO_NAPLATA_MJENICA__PLACENO = "placeno";
	public static String PO_NAPLATA_MJENICA__IZNOS_DJELOMICNO = "iznos_djelomicno";
	public static String PO_NAPLATA_MJENICA__NAPOMENA = "napomena";
	public static String PO_NAPLATA_MJENICA__REFERENT_ZAPRIMANJA = "referent_zaprimanja";
	public static String PO_NAPLATA_MJENICA__REFERENT_PLACANJA = "referent_placanja";
	public static String PO_NAPLATA_MJENICA__DATUM_PLACANJA = "datum_placanja";
	public static String PO_NAPLATA_MJENICA__REFERENT_ZADNJE_IZMJENE = "referent_zadnje_izmjene";
	public static String PO_NAPLATA_MJENICA__VRIJEME_ZADNJE_IZMJENE = "vrijeme_zadnje_izmjene";

	/* Attributes names /> */
	/* </ Constructors */
	public NaplataMjenicaVo() {
		super();
	}

	public NaplataMjenicaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getIdMjenice() {
		return getAsString(PO_NAPLATA_MJENICA__ID_MJENICE);
	}

	/*
	 * public Calendar getDatumZaprimanja() { return
	 * getAsCalendar(PO_NAPLATA_MJENICA__DATUM_ZAPRIMANJA); } public Calendar
	 * getDatumDospijeca() { return
	 * getAsCalendar(PO_NAPLATA_MJENICA__DATUM_DOSPIJECA); }
	 */
	public String getMaticniBrojTrasanta() {
		return getAsString(PO_NAPLATA_MJENICA__MATICNI_BROJ_TRASANTA);
	}

	public String getOibTrasanta() {
		return getAsString(PO_NAPLATA_MJENICA__OIB_TRASANTA);
	}

	public String getNazivTrasanta() {
		return getAsString(PO_NAPLATA_MJENICA__NAZIV_TRASANTA);
	}

	public String getMaticniBrojRemitenta() {
		return getAsString(PO_NAPLATA_MJENICA__MATICNI_BROJ_REMITENTA);
	}

	public String getOibRemitenta() {
		return getAsString(PO_NAPLATA_MJENICA__OIB_REMITENTA);
	}

	public String getNazivRemitenta() {
		return getAsString(PO_NAPLATA_MJENICA__NAZIV_REMITENTA);
	}

	public String getIznos() {
		return getAsString(PO_NAPLATA_MJENICA__IZNOS);
	}

	public String getPlaceno() {
		return getAsString(PO_NAPLATA_MJENICA__PLACENO);
	}

	public String getIznosDjelomicno() {
		return getAsString(PO_NAPLATA_MJENICA__IZNOS_DJELOMICNO);
	}

	public String getNapomena() {
		return getAsString(PO_NAPLATA_MJENICA__NAPOMENA);
	}

	public String getReferentZaprimanja() {
		return getAsString(PO_NAPLATA_MJENICA__REFERENT_ZAPRIMANJA);
	}

	public String getReferentPlacanja() {
		return getAsString(PO_NAPLATA_MJENICA__REFERENT_PLACANJA);
	}

	/*
	 * public Calendar getDatumPlacanja() { return
	 * getAsCalendar(PO_NAPLATA_MJENICA__DATUM_PLACANJA); }
	 */
	public String getReferentZadnjeIzmjene() {
		return getAsString(PO_NAPLATA_MJENICA__REFERENT_ZADNJE_IZMJENE);
	}

	public Calendar getVrijemeZadnjeIzmjene() {
		return getAsCalendar(PO_NAPLATA_MJENICA__VRIJEME_ZADNJE_IZMJENE);
	}

	/* Getters /> */
	/* </ Setters */
	public void setIdMjenice(String value) {
		set(PO_NAPLATA_MJENICA__ID_MJENICE, value);
	}

	/*
	 * public void setDatumZaprimanja(Calendar value) {
	 * setPropertyCalendarAsDateString(value,
	 * PO_NAPLATA_MJENICA__DATUM_ZAPRIMANJA); } public void
	 * setDatumDospijeca(Calendar value) {
	 * setPropertyCalendarAsDateString(value,
	 * PO_NAPLATA_MJENICA__DATUM_DOSPIJECA); }
	 */
	public void setMaticniBrojTrasanta(String value) {
		set(PO_NAPLATA_MJENICA__MATICNI_BROJ_TRASANTA, value);
	}

	public void setOibTrasanta(String value) {
		set(PO_NAPLATA_MJENICA__OIB_TRASANTA, value);
	}

	public void setNazivTrasanta(String value) {
		set(PO_NAPLATA_MJENICA__NAZIV_TRASANTA, value);
	}

	public void setMaticniBrojRemitenta(String value) {
		set(PO_NAPLATA_MJENICA__MATICNI_BROJ_REMITENTA, value);
	}

	public void setOibRemitenta(String value) {
		set(PO_NAPLATA_MJENICA__OIB_REMITENTA, value);
	}

	public void setNazivRemitenta(String value) {
		set(PO_NAPLATA_MJENICA__NAZIV_REMITENTA, value);
	}

	public void setIznos(String value) {
		set(PO_NAPLATA_MJENICA__IZNOS, value);
	}

	public void setPlaceno(String value) {
		set(PO_NAPLATA_MJENICA__PLACENO, value);
	}

	public void setIznosDjelomicno(String value) {
		set(PO_NAPLATA_MJENICA__IZNOS_DJELOMICNO, value);
	}

	public void setNapomena(String value) {
		set(PO_NAPLATA_MJENICA__NAPOMENA, value);
	}

	public void setReferentZaprimanja(String value) {
		set(PO_NAPLATA_MJENICA__REFERENT_ZAPRIMANJA, value);
	}

	public void setReferentPlacanja(String value) {
		set(PO_NAPLATA_MJENICA__REFERENT_PLACANJA, value);
	}

	/*
	 * public void setDatumPlacanja(Calendar value) {
	 * setPropertyCalendarAsDateString(value,
	 * PO_NAPLATA_MJENICA__DATUM_PLACANJA); }
	 */
	public void setReferentZadnjeIzmjene(String value) {
		set(PO_NAPLATA_MJENICA__REFERENT_ZADNJE_IZMJENE, value);
	}

	public void setVrijemeZadnjeIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				PO_NAPLATA_MJENICA__VRIJEME_ZADNJE_IZMJENE);
	}
	/* Setters /> */
}