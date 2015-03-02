package hr.adriacomsoftware.app.common.pdv.ostaliposlovi.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class PdvOstaliPosloviVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_OSTALI_POSLOVI_PDV__ID = "id";
	public static String BI_OSTALI_POSLOVI_PDV__VRSTA_PODKNJIGE = "vrsta_podknjige";
	public static String BI_OSTALI_POSLOVI_PDV__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String BI_OSTALI_POSLOVI_PDV__BROJ_RACUNA = "broj_racuna";
	public static String BI_OSTALI_POSLOVI_PDV__MATICNI_BROJ = "maticni_broj";
	public static String BI_OSTALI_POSLOVI_PDV__DATUM_IZDAVANJA_RACUNA = "datum_izdavanja_racuna";
	public static String BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_UKUPNO = "iznos_racuna_ukupno";
	public static String BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_POREZ = "iznos_racuna_porez";
	public static String BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_OSNOVICA_23 = "iznos_racuna_osnovica_23";
	public static String BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_NEOPOREZIVO = "iznos_racuna_neoporezivo";
	public static String BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_OSLOBODJENO = "iznos_racuna_oslobodjeno";

	/* Attributes names /> */
	/* </ Constructors */
	public PdvOstaliPosloviVo() {
		super();
	}

	public PdvOstaliPosloviVo(AS2Record value) {
		super(value);
	}

	public String getId() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__ID);
	}

	public String getVrstaPodknjige() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__VRSTA_PODKNJIGE);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__ORGANIZACIJSKA_JEDINICA);
	}

	public String getBrojRacuna() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__BROJ_RACUNA);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__MATICNI_BROJ);
	}

	public Calendar getDatumIzdavanjaRacuna() {
		return getAsCalendar(BI_OSTALI_POSLOVI_PDV__DATUM_IZDAVANJA_RACUNA);
	}

	public String getIznosRacunaUkupno() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_UKUPNO);
	}

	public String getIznosRacunaPorez() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_POREZ);
	}

	public String getIznosRacunaOsnovica23() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_OSNOVICA_23);
	}

	public String getIznosRacunaNeoporezivo() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_NEOPOREZIVO);
	}

	public String getIznosRacunaOslobodjeno() {
		return getAsStringOrEmpty(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_OSLOBODJENO);
	}

	public void setId(String value) {
		set(BI_OSTALI_POSLOVI_PDV__ID, value);
	}

	public void setVrstaPodknjige(String value) {
		set(BI_OSTALI_POSLOVI_PDV__VRSTA_PODKNJIGE, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(BI_OSTALI_POSLOVI_PDV__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setBrojRacuna(String value) {
		set(BI_OSTALI_POSLOVI_PDV__BROJ_RACUNA, value);
	}

	public void setMaticniBroj(String value) {
		set(BI_OSTALI_POSLOVI_PDV__MATICNI_BROJ, value);
	}

	public void setDatumIzdavanjaRacuna(Calendar value) {
		setCalendarAsDateString(value,
				BI_OSTALI_POSLOVI_PDV__DATUM_IZDAVANJA_RACUNA);
	}

	public void setIznosRacunaUkupno(String value) {
		set(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_UKUPNO, value);
	}

	public void setIznosRacunaPorez(String value) {
		set(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_POREZ, value);
	}

	public void setIznosRacunaOsnovica23(String value) {
		set(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_OSNOVICA_23, value);
	}

	public void setIznosRacunaNeoporezivo(String value) {
		set(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_NEOPOREZIVO, value);
	}

	public void setIznosRacunaOslobodjeno(String value) {
		set(BI_OSTALI_POSLOVI_PDV__IZNOS_RACUNA_OSLOBODJENO, value);
	}

}