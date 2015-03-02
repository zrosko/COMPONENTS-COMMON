package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/**
 * 
 */
public class OrGubitakVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_GUBITAK__ID_GUBITKA = "id_gubitka";
	public static String OR_GUBITAK__ID_DOGADAJA = "id_dogadaja";
	public static String OR_GUBITAK__ID_KATEGORIJE_GUBITKA = "id_kategorije_gubitka";
	public static String OR_GUBITAK__DATUM_GUBITKA = "datum_gubitka";
	public static String OR_GUBITAK__NAZIV_GUBITKA = "naziv_gubitka";
	public static String OR_GUBITAK__VRSTA = "vrsta";
	public static String OR_GUBITAK__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String OR_GUBITAK__OPIS_POSLJEDICE = "opis_posljedice";
	public static String OR_GUBITAK__VISINA_GUBITKA = "visina_gubitka";
	public static String OR_GUBITAK__DOBIT = "dobit";
	public static String OR_GUBITAK__GUBITAK_PRILIKA = "gubitak_prilika";
	public static String OR_GUBITAK__DIREKTNI_DATUM_KNJIZENJA = "direktni_datum_knjizenja";
	public static String OR_GUBITAK__DIREKTNI_GUBITAK = "direktni_gubitak";
	public static String OR_GUBITAK__DIREKTNI_GUBITAK_VALUTA = "direktni_gubitak_valuta";
	public static String OR_GUBITAK__DIREKTNI_BROJ_KONTA = "direktni_broj_konta";
	public static String OR_GUBITAK__DIREKTNI_OIB = "direktni_oib";
	public static String OR_GUBITAK__DOBROVOLJNA_NAKNADA = "dobrovoljna_naknada";
	public static String OR_GUBITAK__INDIREKTNI_GUBITAK = "indirektni_gubitak";
	public static String OR_GUBITAK__INDIREKTNI_GUBITAK_VALUTA = "indirektni_gubitak_valuta";
	public static String OR_GUBITAK__INDIREKTNI_GUBITAK_OPIS = "indirektni_gubitak_opis";
	public static String OR_GUBITAK__OSIGURANJE_IZNOS = "osiguranje_iznos";
	public static String OR_GUBITAK__OSIGURANJE_DATUM = "osiguranje_datum";
	public static String OR_GUBITAK__REZERVACIJA_OD = "rezervacija_od";
	public static String OR_GUBITAK__REZERVACIJA_DO = "rezervacija_do";
	public static String OR_GUBITAK__REZERVACIJA_OPIS = "rezervacija_opis";
	public static String OR_GUBITAK__REZERVACIJA_IZNOS = "rezervacija_iznos";

	/* Attributes names /> */
	/* </ Constructors */
	public OrGubitakVo() {
		super();
	}

	public OrGubitakVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdGubitka() {
		return getAsStringOrEmpty(OR_GUBITAK__ID_GUBITKA);
	}

	public String getIdDogadaja() {
		return getAsStringOrEmpty(OR_GUBITAK__ID_DOGADAJA);
	}

	public String getIdKategorijeGubitka() {
		return getAsStringOrEmpty(OR_GUBITAK__ID_KATEGORIJE_GUBITKA);
	}

	public Calendar getDatumGubitka() {
		return getAsCalendar(OR_GUBITAK__DATUM_GUBITKA);
	}

	public String getNazivGubitka() {
		return getAsStringOrEmpty(OR_GUBITAK__NAZIV_GUBITKA);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(OR_GUBITAK__VRSTA);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(OR_GUBITAK__ORGANIZACIJSKA_JEDINICA);
	}

	public String getOpisPosljedice() {
		return getAsStringOrEmpty(OR_GUBITAK__OPIS_POSLJEDICE);
	}

	public String getVisinaGubitka() {
		return getAsStringOrEmpty(OR_GUBITAK__VISINA_GUBITKA);
	}

	public String getDobit() {
		return getAsStringOrEmpty(OR_GUBITAK__DOBIT);
	}

	public String getGubitakPrilika() {
		return getAsStringOrEmpty(OR_GUBITAK__GUBITAK_PRILIKA);
	}

	// public Calendar getDirektniDatumKnjizenja() {
	// return getAsCalendar(OR_GUBITAK__DIREKTNI_DATUM_KNJIZENJA);
	// }
	public String getDirektniGubitak() {
		return getAsStringOrEmpty(OR_GUBITAK__DIREKTNI_GUBITAK);
	}

	public String getDirektniGubitakValuta() {
		return getAsStringOrEmpty(OR_GUBITAK__DIREKTNI_GUBITAK_VALUTA);
	}

	public String getDirektniBrojKonta() {
		return getAsStringOrEmpty(OR_GUBITAK__DIREKTNI_BROJ_KONTA);
	}

	public String getDirektniOib() {
		return getAsStringOrEmpty(OR_GUBITAK__DIREKTNI_OIB);
	}

	public String getDobrovoljnaNaknada() {
		return getAsStringOrEmpty(OR_GUBITAK__DOBROVOLJNA_NAKNADA);
	}

	public String getIndirektniGubitak() {
		return getAsStringOrEmpty(OR_GUBITAK__INDIREKTNI_GUBITAK);
	}

	public String getIndirektniGubitakValuta() {
		return getAsStringOrEmpty(OR_GUBITAK__INDIREKTNI_GUBITAK_VALUTA);
	}

	public String getIndirektniGubitakOpis() {
		return getAsStringOrEmpty(OR_GUBITAK__INDIREKTNI_GUBITAK_OPIS);
	}

	public String getOsiguranjeIznos() {
		return getAsStringOrEmpty(OR_GUBITAK__OSIGURANJE_IZNOS);
	}

	// public Calendar getOsiguranjeDatum() {
	// return getAsCalendar(OR_GUBITAK__OSIGURANJE_DATUM);
	// }
	// public Calendar getRezervacijaOd() {
	// return getAsCalendar(OR_GUBITAK__REZERVACIJA_OD);
	// }
	// public Calendar getRezervacijaDo() {
	// return getAsCalendar(OR_GUBITAK__REZERVACIJA_DO);
	// }
	public String getRezervacijaOpis() {
		return getAsStringOrEmpty(OR_GUBITAK__REZERVACIJA_OPIS);
	}

	public String getRezervacijaIznos() {
		return getAsStringOrEmpty(OR_GUBITAK__REZERVACIJA_IZNOS);
	}

	public void setIdGubitka(String value) {
		set(OR_GUBITAK__ID_GUBITKA, value);
	}

	public void setIdDogadaja(String value) {
		set(OR_GUBITAK__ID_DOGADAJA, value);
	}

	public void setIdKategorijeGubitka(String value) {
		set(OR_GUBITAK__ID_KATEGORIJE_GUBITKA, value);
	}

	public void setDatumGubitka(Calendar value) {
		setCalendarAsDateString(value, OR_GUBITAK__DATUM_GUBITKA);
	}

	public void setNazivGubitka(String value) {
		set(OR_GUBITAK__NAZIV_GUBITKA, value);
	}

	public void setVrsta(String value) {
		set(OR_GUBITAK__VRSTA, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(OR_GUBITAK__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setOpisPosljedice(String value) {
		set(OR_GUBITAK__OPIS_POSLJEDICE, value);
	}

	public void setVisinaGubitka(String value) {
		set(OR_GUBITAK__VISINA_GUBITKA, value);
	}

	public void setDobit(String value) {
		set(OR_GUBITAK__DOBIT, value);
	}

	public void setGubitakPrilika(String value) {
		set(OR_GUBITAK__GUBITAK_PRILIKA, value);
	}

	// public void setDirektniDatumKnjizenja(Calendar value) {
	// setCalendarAsDateString(value,
	// OR_GUBITAK__DIREKTNI_DATUM_KNJIZENJA);
	// }
	public void setDirektniGubitak(String value) {
		set(OR_GUBITAK__DIREKTNI_GUBITAK, value);
	}

	public void setDirektniGubitakValuta(String value) {
		set(OR_GUBITAK__DIREKTNI_GUBITAK_VALUTA, value);
	}

	public void setDirektniBrojKonta(String value) {
		set(OR_GUBITAK__DIREKTNI_BROJ_KONTA, value);
	}

	public void setDirektniOib(String value) {
		set(OR_GUBITAK__DIREKTNI_OIB, value);
	}

	public void setDobrovoljnaNaknada(String value) {
		set(OR_GUBITAK__DOBROVOLJNA_NAKNADA, value);
	}

	public void setIndirektniGubitak(String value) {
		set(OR_GUBITAK__INDIREKTNI_GUBITAK, value);
	}

	public void setIndirektniGubitakValuta(String value) {
		set(OR_GUBITAK__INDIREKTNI_GUBITAK_VALUTA, value);
	}

	public void setIndirektniGubitakOpis(String value) {
		set(OR_GUBITAK__INDIREKTNI_GUBITAK_OPIS, value);
	}

	public void setOsiguranjeIznos(String value) {
		set(OR_GUBITAK__OSIGURANJE_IZNOS, value);
	}

	// public void setOsiguranjeDatum(Calendar value) {
	// setCalendarAsDateString(value, OR_GUBITAK__OSIGURANJE_DATUM);
	// }
	// public void setRezervacijaOd(Calendar value) {
	// setCalendarAsDateString(value, OR_GUBITAK__REZERVACIJA_OD);
	// }
	// public void setRezervacijaDo(Calendar value) {
	// setCalendarAsDateString(value, OR_GUBITAK__REZERVACIJA_DO);
	// }
	public void setRezervacijaOpis(String value) {
		set(OR_GUBITAK__REZERVACIJA_OPIS, value);
	}

	public void setRezervacijaIznos(String value) {
		set(OR_GUBITAK__REZERVACIJA_IZNOS, value);
	}

}