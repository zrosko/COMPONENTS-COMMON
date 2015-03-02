package hr.adriacomsoftware.app.common.pravneosobe.obrasci.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class VikrStavkaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PO_VIKR_KLIJENT__ID_VIKR_KLIJENTA = "id_vikr_klijenta";
	public static String PO_VIKR_KLIJENT__OIB = "oib";
	public static String PO_VIKR_KLIJENT__MATICNI_BROJ = "maticni_broj";
	public static String PO_VIKR_KLIJENT__NAZIV = "naziv";
	public static String PO_VIKR_KLIJENT__DATUM_STANJA = "datum_stanja";
	public static String PO_VIKR_KLIJENT_STAVKA__VRSTA_IZNOSA = "vrsta_iznosa";
	public static String PO_VIKR_KLIJENT_STAVKA__VALUTA = "valuta";
	public static String PO_VIKR_KLIJENT_STAVKA__IZNOS = "iznos";
	public static String PO_VIKR_KLIJENT_STAVKA__OPIS = "opis";

	public VikrStavkaVo() {
		super();
	}

	public VikrStavkaVo(AS2Record value) {
		super(value);
	}

	public Calendar getDatumStanja() {
		return getAsCalendar(PO_VIKR_KLIJENT__DATUM_STANJA);
	}

	public String getVrstaIznosa() {
		return get(PO_VIKR_KLIJENT_STAVKA__VRSTA_IZNOSA);
	}

	public String getValuta() {
		return get(PO_VIKR_KLIJENT_STAVKA__VALUTA);
	}

	public String getIznos() {
		return get(PO_VIKR_KLIJENT_STAVKA__IZNOS);
	}

	public String getOpis() {
		return get(PO_VIKR_KLIJENT_STAVKA__OPIS);
	}

	/**********************/
	public void setDatumStanja(Calendar value) {
		setCalendarAsDateString(value, PO_VIKR_KLIJENT__DATUM_STANJA);
	}

	public void setVrstaIznosa(String value) {
		set(PO_VIKR_KLIJENT_STAVKA__VRSTA_IZNOSA, value);
	}

	public void setValuta(String value) {
		set(PO_VIKR_KLIJENT_STAVKA__VALUTA, value);
	}

	public void setIznos(String value) {
		set(PO_VIKR_KLIJENT_STAVKA__IZNOS, value);
	}

	public void setOpis(String value) {
		set(PO_VIKR_KLIJENT_STAVKA__OPIS, value);
	}
}