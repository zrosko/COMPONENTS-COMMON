package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

public class KratkorocniPlanVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCA_GODINA = "tekuca_godina";
	public static String PO_ZAH_KRATKOROCNI_PLAN__SLIJEDECA_GODINA = "slijedeca_godina";
	public static String PO_ZAH_KRATKOROCNI_PLAN__VRSTA = "vrsta";

	// Plan restrukturiranja, Ocjena investicijskog projekta, Poslovni plan

	public KratkorocniPlanVo() {
		super();
	}

	public KratkorocniPlanVo(AS2Record value) {
		super(value);
	}

	// izvedenice POCETAK
	public String getUkupnoPoslovniPrihodiA() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_PRIHODI_A);
	}

	public String getUkupnoPoslovniPrihodiB() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_PRIHODI_B);
	}

	public String getUkupnoPoslovniRashodiA() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_RASHODI_A);
	}

	public String getUkupnoPoslovniRashodiB() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_RASHODI_B);
	}

	public String getUkupnoPrihodiA() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_PRIHODI_A);
	}

	public String getUkupnoPrihodiB() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_PRIHODI_B);
	}

	public String getUkupnoRashodiA() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_RASHODI_A);
	}

	public String getUkupnoRashodiB() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_RASHODI_B);
	}

	public String getUkupnoOperativnaDobitGubitakA() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_OPRATIVNA_DOBIT_GUBITAK_A);
	}

	public String getUkupnoOperativnaDobitGubitakB() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_OPERATIVA_DOBIT_GUBITAK_B);
	}

	public String getUkupnoBrutoDobitGubitakA() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_BRUTO_DOBIT_GUBITAK_A);
	}

	public String getUkupnoBrutoDobitGubitakB() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_BRUTO_DOBIT_GUBITAK_B);
	}

	public String getUkupnoNetoDobitGubitakA() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_NETO_DOBIT_GUBITAK_A);
	}

	public String getUkupnoNetoDobitGubitakB() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_NETO_DOBIT_GUBITAK_B);
	}

	// izvedenice KRAJ
	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BROJ_ZAHTJEVA);
	}

	public String getTekuciPrihodProizvoda() {
		return get(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHOD_PROIZVODA);
	}

	public String getBuduciPrihodProizvoda() {
		return get(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHOD_PROIZVODA);
	}

	public String getTekuciPrihodUsluga() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHOD_USLUGA);
	}

	public String getBuduciPrihodUsluga() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHOD_USLUGA);
	}

	public String getTekuciRashodiMaterijalni() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_MATERIJALNI);
	}

	public String getBuduciRashodiMaterijalni() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_MATERIJALNI);
	}

	public String getTekuciRashodiNajam() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_NAJAM);
	}

	public String getBuduciRashodiNajam() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_NAJAM);
	}

	public String getTekuciRashodiPlace() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_PLACE);
	}

	public String getBuduciRashodiPlace() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_PLACE);
	}

	public String getTekuciRashodiAmortizacija() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_AMORTIZACIJA);
	}

	public String getBuduciRashodiAmortizacija() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_AMORTIZACIJA);
	}

	public String getTekuciRashodiOstali() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_OSTALI);
	}

	public String getBuduciRashodiOstali() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_OSTALI);
	}

	public String getTekuciPrihodiFinancijski() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHODI_FINANCIJSKI);
	}

	public String getBuduciPrihodiFinancijski() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHODI_FINANCIJSKI);
	}

	public String getTekuciRashodiFinancijski() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_FINANCIJSKI);
	}

	public String getBuduciRashodiFinancijski() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_FINANCIJSKI);
	}

	public String getTekuciPrihodiIzvanredni() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHODI_IZVANREDNI);
	}

	public String getBuduciPrihodiIzvanredni() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHODI_IZVANREDNI);
	}

	public String getTekuciRashodiIzvanredni() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_IZVANREDNI);
	}

	public String getBuduciRashodiIzvanredni() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_IZVANREDNI);
	}

	public String getTekuciPorez() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_POREZ);
	}

	public String getBuduciPorez() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_POREZ);
	}

	public String getOpisPlanaPoslovanja() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__OPIS_PLANA_POSLOVANJA);
	}

	public String getTekucaGodina() {
		return getAsStringOrEmpty(PO_ZAH_KRATKOROCNI_PLAN__TEKUCA_GODINA);
	}

	public String getSlijedecaGodina() {
		return getAsStringOrEmpty(PO_ZAH_KRATKOROCNI_PLAN__SLIJEDECA_GODINA);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(PO_ZAH_KRATKOROCNI_PLAN__VRSTA);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BROJ_ZAHTJEVA, value);
	}

	public void setTekuciPrihodProizvoda(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHOD_PROIZVODA,
				value);
	}

	public void setBuduciPrihodProizvoda(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHOD_PROIZVODA,
				value);
	}

	public void setTekuciPrihodUsluga(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHOD_USLUGA,
				value);
	}

	public void setBuduciPrihodUsluga(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHOD_USLUGA,
				value);
	}

	public void setTekuciRashodiMaterijalni(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_MATERIJALNI,
				value);
	}

	public void setBuduciRashodiMaterijalni(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_MATERIJALNI,
				value);
	}

	public void setTekuciRashodiNajam(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_NAJAM,
				value);
	}

	public void setBuduciRashodiNajam(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_NAJAM,
				value);
	}

	public void setTekuciRashodiPlace(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_PLACE,
				value);
	}

	public void setBuduciRashodiPlace(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_PLACE,
				value);
	}

	public void setTekuciRashodiAmortizacija(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_AMORTIZACIJA,
				value);
	}

	public void setBuduciRashodiAmortizacija(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_AMORTIZACIJA,
				value);
	}

	public void setTekuciRashodiOstali(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_OSTALI,
				value);
	}

	public void setBuduciRashodiOstali(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_OSTALI,
				value);
	}

	public void setTekuciPrihodiFinancijski(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHODI_FINANCIJSKI,
				value);
	}

	public void setBuduciPrihodiFinancijski(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHODI_FINANCIJSKI,
				value);
	}

	public void setTekuciRashodiFinancijski(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_FINANCIJSKI,
				value);
	}

	public void setBuduciRashodiFinancijski(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_FINANCIJSKI,
				value);
	}

	public void setTekuciPrihodiIzvanredni(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHODI_IZVANREDNI,
				value);
	}

	public void setBuduciPrihodiIzvanredni(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHODI_IZVANREDNI,
				value);
	}

	public void setTekuciRashodiIzvanredni(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_IZVANREDNI,
				value);
	}

	public void setBuduciRashodiIzvanredni(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_IZVANREDNI,
				value);
	}

	public void setTekuciPorez(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_POREZ, value);
	}

	public void setBuduciPorez(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_POREZ, value);
	}

	public void setOpisPlanaPoslovanja(String value) {
		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__OPIS_PLANA_POSLOVANJA,
				value);
	}

	// izvedenice POCETAK
	public void setUkupnoPoslovniPrihodiA(String value) {
		setReplaceComma(
				ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_PRIHODI_A,
				value);
	}

	public void setUkupnoPoslovniPrihodiB(String value) {
		setReplaceComma(
				ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_PRIHODI_B,
				value);
	}

	public void setUkupnoPoslovniRashodiA(String value) {
		setReplaceComma(
				ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_RASHODI_A,
				value);
	}

	public void setUkupnoPoslovniRashodiB(String value) {
		setReplaceComma(
				ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_RASHODI_B,
				value);
	}

	public void setUkupnoOperativnaDobitGubitakA(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_OPRATIVNA_DOBIT_GUBITAK_A,
				value);
	}

	public void setUkupnoOperativnaDobitGubitakB(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_OPERATIVA_DOBIT_GUBITAK_B,
				value);
	}

	public void setUkupnoPrihodiA(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_PRIHODI_A, value);
	}

	public void setUkupnoPrihodiB(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_PRIHODI_B, value);
	}

	public void setUkupnoRashodiA(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_RASHODI_A, value);
	}

	public void setUkupnoRashodiB(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_RASHODI_B, value);
	}

	//
	public void setUkupnoBrutoDobitGubitakA(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_BRUTO_DOBIT_GUBITAK_A,
				value);
	}

	public void setUkupnoBrutoDobitGubitakB(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_BRUTO_DOBIT_GUBITAK_B,
				value);
	}

	public void setUkupnoNetoDobitGubitakA(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_NETO_DOBIT_GUBITAK_A,
				value);
	}

	public void setUkupnoNetoDobitGubitakB(String value) {

		set(ZAHDataDictionary.PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_NETO_DOBIT_GUBITAK_B,
				value);
	}

	public void setTekucaGodina(String value) {
		set(PO_ZAH_KRATKOROCNI_PLAN__TEKUCA_GODINA, value);
	}

	public void setSlijedecaGodina(String value) {
		set(PO_ZAH_KRATKOROCNI_PLAN__SLIJEDECA_GODINA, value);
	}

	public void setVrsta(String value) {
		set(PO_ZAH_KRATKOROCNI_PLAN__VRSTA, value);
	}
}