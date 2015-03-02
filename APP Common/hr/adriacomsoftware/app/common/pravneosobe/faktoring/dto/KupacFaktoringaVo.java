package hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class KupacFaktoringaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PO_FAKT_KUPAC__ID_KUPCA = "id_kupca";
	public static String PO_FAKT_KUPAC__MATICNI_BROJ_KUPCA = "maticni_broj_kupca";
	public static String PO_FAKT_KUPAC__OIB_KUPCA = "oib_kupca";
	public static String PO_FAKT_KUPAC__NAZIV_KUPCA = "naziv_kupca";
	public static String PO_FAKT_KUPAC__ULICA = "ulica";
	public static String PO_FAKT_KUPAC__POSTANSKI_BROJ = "postanski_broj";
	public static String PO_FAKT_KUPAC__MJESTO = "mjesto";
	public static String PO_FAKT_KUPAC__DRZAVA = "drzava";

	public KupacFaktoringaVo() {
		super();
	}

	public KupacFaktoringaVo(AS2Record value) {
		super(value);
	}

	public String getIdKupca() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC__ID_KUPCA);
	}

	public String getMaticniBrojKupca() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC__MATICNI_BROJ_KUPCA);
	}

	public String getOibKupca() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC__OIB_KUPCA);
	}

	public String getNazivKupca() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC__NAZIV_KUPCA);
	}

	public String getUlica() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC__ULICA);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC__POSTANSKI_BROJ);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC__MJESTO);
	}

	public String getDrzava() {
		return getAsStringOrEmpty(PO_FAKT_KUPAC__DRZAVA);
	}

	public void setIdKupca(String value) {
		set(PO_FAKT_KUPAC__ID_KUPCA, value);
	}

	public void setMaticniBrojKupca(String value) {
		set(PO_FAKT_KUPAC__MATICNI_BROJ_KUPCA, value);
	}

	public void setOibKupca(String value) {
		set(PO_FAKT_KUPAC__OIB_KUPCA, value);
	}

	public void setNazivKupca(String value) {
		set(PO_FAKT_KUPAC__NAZIV_KUPCA, value);
	}

	public void setUlica(String value) {
		set(PO_FAKT_KUPAC__ULICA, value);
	}

	public void setPostanskiBroj(String value) {
		set(PO_FAKT_KUPAC__POSTANSKI_BROJ, value);
	}

	public void setMjesto(String value) {
		set(PO_FAKT_KUPAC__MJESTO, value);
	}

	public void setDrzava(String value) {
		set(PO_FAKT_KUPAC__DRZAVA, value);
	}
}