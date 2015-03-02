package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.ZahConstants;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class BankarskiProizvodVo extends ZahtjevPravnaOsobaVo implements
		ZahConstants {
	private static final long serialVersionUID = 1L;

	public BankarskiProizvodVo() {
		super();
	}

	public BankarskiProizvodVo(AS2Record value) {
		super(value);
	}

	public void setKolateraleLISTA(KolateralPonudeniRs value) {
		set(ZAH_KOLATERAL, value);
	}

	// POCETAK UKUPNO
	public String getUkupnoTrazeniIznosProizvoda() {
		return get(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__UKUPNO_TRAZENI_IZNOS_PROIZVODA);
	}

	public void setUkupnoTrazeniIznosProizvoda(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__UKUPNO_TRAZENI_IZNOS_PROIZVODA,
				value);
	}

	public String getUkupnoOdobreniIznosProizvoda() {
		return get(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__UKUPNO_ODOBRENI_IZNOS_PROIZVODA);
	}

	public void setUkupnoOdobreniIznosProizvoda(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__UKUPNO_ODOBRENI_IZNOS_PROIZVODA,
				value);
	}

	// KRAJ
	public KolateralPonudeniRs getKolateraleLISTA() {
		return (KolateralPonudeniRs) getProperty(ZAH_KOLATERAL);
	}

	public String getIdBankarskogProizvoda() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__ID_BANKARSKOG_PROIZVODA);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__BROJ_ZAHTJEVA);
	}

	public String getTipZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TIP_ZAHTJEVA);
	}

	public String getProdavateljMjenice() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__PRODAVATELJ_MJENICE);
	}

	public String getTrazenaVrstaProizvoda() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_VRSTA_PROIZVODA);
	}

	public String getTrazeniIznosProizvoda() {
		return get(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_IZNOS_PROIZVODA);
	}

	public String getTrazenaSifraValute() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_SIFRA_VALUTE);
	}

	public String getTrazenaKamatnaStopa() {
		return get(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_KAMATNA_STOPA);
	}

	public String getTrazenaVrstaKamate() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_VRSTA_KAMATE);
	}

	public String getTrazenaValutnaKlauzula() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_VALUTNA_KLAUZULA);
	}

	public String getTrazeniRokOtplate() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_ROK_OTPLATE);
	}

	public String getTrazeniPocek() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_POCEK);
	}

	public String getTrazeniRokKoristenja() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_ROK_KORISTENJA);
	}

	public String getTrazeniNacinOtplate() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_NACIN_OTPLATE);
	}

	public String getOpisNamjene() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__OPIS_NAMJENE);
	}

	public String getIzvorOtplate() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__IZVOR_OTPLATE);
	}

	public String getObrazlozenje() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__OBRAZLOZENJE);
	}

	public String getVrstaProizvoda() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__VRSTA_PROIZVODA);
	}

	public String getPreporuka() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__PREPORUKA);
	}

	public String getProgram() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__PROGRAM);
	}

	public String getTrazeniProgram() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_PROGRAM);
	}

	public String getKamatnaStopa() {
		return getAsStringOrZero(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__KAMATNA_STOPA);
	}

	public String getVrstaKamate() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__VRSTA_KAMATE);
	}

	public String getRokOtplate() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__ROK_OTPLATE);
	}

	public String getPocek() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__POCEK);
	}

	public String getIznosPlasmana() {
		return getAsStringOrZero(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__IZNOS_PLASMANA);
	}

	public String getValutaPlasmana() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__VALUTA_PLASMANA);
	}

	public String getValutnaKlauzula() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__VALUTNA_KLAUZULA);
	}

	public String getMjesecnaRata() {
		return getAsStringOrZero(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__MJESECNA_RATA);
	}

	public String getIznosNaknade() {
		return getAsStringOrZero(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__IZNOS_NAKNADE);
	}

	public String getKoristenje() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__KORISTENJE);
	}

	public String getInterkalarnaKamata() {
		return getAsStringOrZero(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__INTERKALARNA_KAMATA);
	}

	public String getZateznaKamata() {
		return getAsStringOrZero(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__ZATEZNA_KAMATA);
	}

	public Calendar getDospijecePrveRate() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__DOSPIJECE_PRVE_RATE);
	}

	public Calendar getDospijeceZadnjeRate() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__DOSPIJECE_ZADNJE_RATE);
	}

	public String getPrijevremenaOtplata() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__PRIJEVREMENA_OTPLATA);
	}

	public String getNacinOtplate() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__NACIN_OTPLATE);
	}

	public String getPosebniUvjeti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__POSEBNI_UVJETI);
	}

	public String getBrojOdluke() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__BROJ_ODLUKE);
	}

	public Calendar getDatumOdluke() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__DATUM_ODLUKE);
	}

	public String getOpisOdluke() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__OPIS_ODLUKE);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__BROJ_PARTIJE);
	}

	public String getStatusProizvoda() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__STATUS_PROIZVODA);
	}

	public String getStatusRizika() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__STATUS_RIZIKA);
	}

	public void setIdBankarskogProizvoda(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__ID_BANKARSKOG_PROIZVODA,
				value);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__BROJ_ZAHTJEVA, value);
	}

	public void setTipZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TIP_ZAHTJEVA, value);
	}

	public void setProdavateljMjenice(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__PRODAVATELJ_MJENICE,
				value);
	}

	public void setTrazenaVrstaProizvoda(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_VRSTA_PROIZVODA,
				value);
	}

	public void setTrazeniIznosProizvoda(String value) {
		setReplaceComma(
				ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_IZNOS_PROIZVODA,
				value);
	}

	public void setTrazenaSifraValute(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_SIFRA_VALUTE,
				value);
	}

	public void setTrazenaKamatnaStopa(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_KAMATNA_STOPA,
				value);
	}

	public void setTrazenaVrstaKamate(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_VRSTA_KAMATE,
				value);
	}

	public void setTrazenaValutnaKlauzula(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_VALUTNA_KLAUZULA,
				value);
	}

	public void setTrazeniRokOtplate(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_ROK_OTPLATE,
				value);
	}

	public void setTrazeniPocek(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_POCEK, value);
	}

	public void setTrazeniRokKoristenja(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_ROK_KORISTENJA,
				value);
	}

	public void setTrazeniNacinOtplate(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_NACIN_OTPLATE,
				value);
	}

	public void setOpisNamjene(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__OPIS_NAMJENE, value);
	}

	public void setIzvorOtplate(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__IZVOR_OTPLATE, value);
	}

	public void setObrazlozenje(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__OBRAZLOZENJE, value);
	}

	public void setVrstaProizvoda(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__VRSTA_PROIZVODA, value);
	}

	public void setPreporuka(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__PREPORUKA, value);
	}

	public void setProgram(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__PROGRAM, value);
	}

	public void setTrazeniProgram(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_PROGRAM, value);
	}

	public void setKamatnaStopa(String value) {
		setReplaceComma(
				ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__KAMATNA_STOPA,
				value);
	}

	public void setVrstaKamate(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__VRSTA_KAMATE, value);
	}

	public void setRokOtplate(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__ROK_OTPLATE, value);
	}

	public void setPocek(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__POCEK, value);
	}

	public void setIznosPlasmana(String value) {
		setReplaceComma(
				ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__IZNOS_PLASMANA,
				value);
	}

	public void setValutaPlasmana(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__VALUTA_PLASMANA, value);
	}

	public void setValutnaKlauzula(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__VALUTNA_KLAUZULA,
				value);
	}

	public void setMjesecnaRata(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__MJESECNA_RATA, value);
	}

	public void setIznosNaknade(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__IZNOS_NAKNADE, value);
	}

	public void setKoristenje(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__KORISTENJE, value);
	}

	public void setInterkalarnaKamata(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__INTERKALARNA_KAMATA,
				value);
	}

	public void setZateznaKamata(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__ZATEZNA_KAMATA, value);
	}

	public void setDospijecePrveRate(Calendar value) {
		setCalendarAsDateString(
				value,
				ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__DOSPIJECE_PRVE_RATE);
	}

	public void setDospijeceZadnjeRate(Calendar value) {
		setCalendarAsDateString(
				value,
				ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__DOSPIJECE_ZADNJE_RATE);
	}

	public void setPrijevremenaOtplata(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__PRIJEVREMENA_OTPLATA,
				value);
	}

	public void setNacinOtplate(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__NACIN_OTPLATE, value);
	}

	public void setPosebniUvjeti(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__POSEBNI_UVJETI, value);
	}

	public void setBrojOdluke(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__BROJ_ODLUKE, value);
	}

	public void setDatumOdluke(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__DATUM_ODLUKE);
	}

	public void setOpisOdluke(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__OPIS_ODLUKE, value);
	}

	public void setBrojPartije(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__BROJ_PARTIJE, value);
	}

	public void setStatusProizvoda(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__STATUS_PROIZVODA,
				value);
	}

	public void setStatusRizika(String value) {
		set(ZAHDataDictionary.PO_ZAH_BANKARSKI_PROIZVOD__STATUS_RIZIKA, value);
	}
}