package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class Bon2Vo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;

	public Bon2Vo() {
		super();
	}

	public Bon2Vo(AS2Record value) {
		super(value);
	}

	public String getIdBon2() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BON2__ID_BON2);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BON2__BROJ_ZAHTJEVA);
	}

	public String getTrenutnaBlokada() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BON2__TRENUTNA_BLOKADA);
	}

	public String getNazivBanke() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BON2__NAZIV_BANKE);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BON2__BROJ_PARTIJE);
	}

	public Calendar getRazdobljeOd() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_BON2__RAZDOBLJE_OD);
	}

	public Calendar getRazdobljeDo() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_BON2__RAZDOBLJE_DO);
	}

	public String getIznosPrimitaka() {
		return get(ZAHDataDictionary.PO_ZAH_BON2__IZNOS_PRIMITAKA);
	}

	public String getNepodmireneObveze() {
		return get(ZAHDataDictionary.PO_ZAH_BON2__NEPODMIRENE_OBVEZE);
	}

	public String getIznosProsjecnogStanja() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BON2__IZNOS_PROSJECNOG_STANJA);
	}

	public String getStanjeRacuna() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BON2__STANJE_RACUNA);
	}

	public String getBrojDana() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BON2__BROJ_DANA);
	}

	public String getBrojDanaBlokade() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BON2__BROJ_DANA_BLOKADE);
	}

	public Calendar getNeprekidnaBlokada() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_BON2__NEPREKIDNA_BLOKADA);
	}

	public void setIdBon2(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__ID_BON2, value);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__BROJ_ZAHTJEVA, value);
	}

	public void setTrenutnaBlokada(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__TRENUTNA_BLOKADA, value);
	}

	public void setNazivBanke(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__NAZIV_BANKE, value);
	}

	public void setBrojPartije(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__BROJ_PARTIJE, value);
	}

	public void setRazdobljeOd(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_BON2__RAZDOBLJE_OD);
	}

	public void setRazdobljeDo(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_BON2__RAZDOBLJE_DO);
	}

	public void setIznosPrimitaka(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__IZNOS_PRIMITAKA, value);
	}

	public void setNepodmireneObveze(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__NEPODMIRENE_OBVEZE, value);
	}

	public void setIznosProsjecnogStanja(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__IZNOS_PROSJECNOG_STANJA, value);
	}

	public void setStanjeRacuna(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__STANJE_RACUNA, value);
	}

	public void setBrojDanaBlokade(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__BROJ_DANA_BLOKADE, value);
	}

	public void setBrojDana(String value) {
		set(ZAHDataDictionary.PO_ZAH_BON2__BROJ_DANA, value);
	}

	public void setNeprekidnaBlokada(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_BON2__NEPREKIDNA_BLOKADA);
	}
}