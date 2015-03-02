package hr.adriacomsoftware.app.common.pravneosobe.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class VezanaOsobaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_PO_VEZANA_OSOBA__ID_VEZANE_OSOBE = "id_vezane_osobe";
	public static String BI_PO_VEZANA_OSOBA__JMBG_MATICNI_BROJ = "jmbg_maticni_broj";
	public static String BI_PO_VEZANA_OSOBA__JMBG_MATICNI_BROJ_VEZA = "jmbg_maticni_broj_veza";
	public static String BI_PO_VEZANA_OSOBA__TIP_VEZE = "tip_veze";
	public static String BI_PO_VEZANA_OSOBA__POSTOTAK_UDJELA = "postotak_udjela";
	public static String BI_PO_VEZANA_OSOBA__OPIS = "opis";
	public static String BI_PO_VEZANA_OSOBA__OPERATER_PROMJENE = "operater_promjene";
	public static String BI_PO_VEZANA_OSOBA__VRIJEME_UNOSA = "vrijeme_unosa";
	public static String BI_PO_VEZANA_OSOBA__DATUM_OD = "datum_od";
	public static String BI_PO_VEZANA_OSOBA__DATUM_DO = "datum_do";
	public static String BI_PO_VEZANA_OSOBA__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public VezanaOsobaVo() {
		super();
	}

	public VezanaOsobaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getIdVezaneOsobe() {
		return getAsStringOrEmpty(BI_PO_VEZANA_OSOBA__ID_VEZANE_OSOBE);
	}

	public String getJmbgMaticniBroj() {
		return getAsStringOrEmpty(BI_PO_VEZANA_OSOBA__JMBG_MATICNI_BROJ);
	}

	public String getJmbgMaticniBrojVeza() {
		return getAsStringOrEmpty(BI_PO_VEZANA_OSOBA__JMBG_MATICNI_BROJ_VEZA);
	}

	public String getTipVeze() {
		return getAsStringOrEmpty(BI_PO_VEZANA_OSOBA__TIP_VEZE);
	}

	public String getPostotakUdjela() {
		return getAsStringOrEmpty(BI_PO_VEZANA_OSOBA__POSTOTAK_UDJELA);
	}

	public String getOpis() {
		return getAsStringOrEmpty(BI_PO_VEZANA_OSOBA__OPIS);
	}

	public String getOperaterPromjene() {
		return getAsStringOrEmpty(BI_PO_VEZANA_OSOBA__OPERATER_PROMJENE);
	}

	public Calendar getVrijemeUnosa() {
		return getAsCalendar(BI_PO_VEZANA_OSOBA__VRIJEME_UNOSA);
	}

	public Calendar getDatumOd() {
		return getAsCalendar(BI_PO_VEZANA_OSOBA__DATUM_OD);
	}

	public Calendar getDatumDo() {
		return getAsCalendar(BI_PO_VEZANA_OSOBA__DATUM_DO);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(BI_PO_VEZANA_OSOBA__ISPRAVNO);
	}

	public void setIdVezaneOsobe(String value) {
		set(BI_PO_VEZANA_OSOBA__ID_VEZANE_OSOBE, value);
	}

	public void setJmbgMaticniBroj(String value) {
		set(BI_PO_VEZANA_OSOBA__JMBG_MATICNI_BROJ, value);
	}

	public void setJmbgMaticniBrojVeza(String value) {
		set(BI_PO_VEZANA_OSOBA__JMBG_MATICNI_BROJ_VEZA, value);
	}

	public void setTipVeze(String value) {
		set(BI_PO_VEZANA_OSOBA__TIP_VEZE, value);
	}

	public void setPostotakUdjela(String value) {
		set(BI_PO_VEZANA_OSOBA__POSTOTAK_UDJELA, value);
	}

	public void setOpis(String value) {
		set(BI_PO_VEZANA_OSOBA__OPIS, value);
	}

	public void setOperaterPromjene(String value) {
		set(BI_PO_VEZANA_OSOBA__OPERATER_PROMJENE, value);
	}

	public void setVrijemeUnosa(Calendar value) {
		setCalendarAsDateString(value, BI_PO_VEZANA_OSOBA__VRIJEME_UNOSA);
	}

	public void setDatumOd(Calendar value) {
		setCalendarAsDateString(value, BI_PO_VEZANA_OSOBA__DATUM_OD);
	}

	public void setDatumDo(Calendar value) {
		setCalendarAsDateString(value, BI_PO_VEZANA_OSOBA__DATUM_DO);
	}

	public void setIspravno(String value) {
		set(BI_PO_VEZANA_OSOBA__ISPRAVNO, value);
	}

	/* Setters /> */
}