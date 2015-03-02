package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

public class PodaciKlijentaVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;

	public PodaciKlijentaVo() {
		super();
	}

	public PodaciKlijentaVo(AS2Record value) {
		super(value);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__BROJ_ZAHTJEVA);
	}

	public String getKomentarPoslovnogOdnosa() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_POSLOVNOG_ODNOSA);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__MATICNI_BROJ);
	}

	public String getOib() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OIB);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__NAZIV);
	}

	public String getUlica() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__ULICA);
	}

	public String getPostanskiBroj() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__POSTANSKI_BROJ);
	}

	public String getMjesto() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__MJESTO);
	}

	public String getSifraZupanije() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SIFRA_ZUPANIJE);
	}

	public String getKontaktOsoba() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KONTAKT_OSOBA);
	}

	public String getEmail() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__EMAIL);
	}

	public String getTelefon() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__TELEFON);
	}

	public String getFax() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__FAX);
	}

	public String getGodinaPocetkaPoslovanja() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__GODINA_POCETKA_POSLOVANJA);
	}

	public String getOblikVlasnistva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OBLIK_VLASNISTVA);
	}

	public String getPravniStatus() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__PRAVNI_STATUS);
	}

	public String getTemeljniKapital() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__TEMELJNI_KAPITAL);
	}

	public String getVelicinaPoduzeca() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__VELICINA_PODUZECA);
	}

	public String getSifraDjelatnosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SIFRA_DJELATNOSTI);
	}

	public String getNazivDjelatnosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__NAZIV_DJELATNOSTI);
	}

	public String getVrstaDjelatnosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__VRSTA_DJELATNOSTI);
	}

	public String getOstaleDjelatnosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OSTALE_DJELATNOSTI);
	}

	public String getOpisDjelatnosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OPIS_DJELATNOSTI);
	}

	public String getBrojZaposlenih() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__BROJ_ZAPOSLENIH);
	}

	public String getBrojZaposlenihSezona() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__BROJ_ZAPOSLENIH_SEZONA);
	}

	public String getKalsifikacijaZaposlenih() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KALSIFIKACIJA_ZAPOSLENIH);
	}

	public String getGlavnaBanka() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__GLAVNA_BANKA);
	}

	public String getOstaleBanke() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OSTALE_BANKE);
	}

	public String getOpisImovine() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OPIS_IMOVINE);
	}

	public String getOpisPoslovnihAktivnosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OPIS_POSLOVNIH_AKTIVNOSTI);
	}

	public String getKomentarFinancijskeAnalize() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_FINANCIJSKE_ANALIZE);
	}

	public String getKomentarKupaca() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_KUPACA);
	}

	public String getKomentarDobavljaca() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_DOBAVLJACA);
	}

	public String getKomentarOsiguranja() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_OSIGURANJA);
	}

	public String getSwotSnage() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SWOT_SNAGE);
	}

	public String getSwotSlabosti() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SWOT_SLABOSTI);
	}

	public String getSwotPrilike() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SWOT_PRILIKE);
	}

	public String getSwotPrijetnje() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SWOT_PRIJETNJE);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__BROJ_ZAHTJEVA, value);
	}

	public void setMaticniBroj(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__MATICNI_BROJ, value);
	}

	public void setOib(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OIB, value);
	}

	public void setNaziv(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__NAZIV, value);
	}

	public void setUlica(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__ULICA, value);
	}

	public void setPostanskiBroj(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__POSTANSKI_BROJ, value);
	}

	public void setMjesto(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__MJESTO, value);
	}

	public void setSifraZupanije(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SIFRA_ZUPANIJE, value);
	}

	public void setKontaktOsoba(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KONTAKT_OSOBA, value);
	}

	public void setEmail(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__EMAIL, value);
	}

	public void setTelefon(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__TELEFON, value);
	}

	public void setFax(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__FAX, value);
	}

	public void setGodinaPocetkaPoslovanja(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__GODINA_POCETKA_POSLOVANJA,
				value);
	}

	public void setOblikVlasnistva(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OBLIK_VLASNISTVA, value);
	}

	public void setPravniStatus(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__PRAVNI_STATUS, value);
	}

	public void setTemeljniKapital(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__TEMELJNI_KAPITAL, value);
	}

	public void setVelicinaPoduzeca(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__VELICINA_PODUZECA, value);
	}

	public void setSifraDjelatnosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SIFRA_DJELATNOSTI, value);
	}

	public void setNazivDjelatnosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__NAZIV_DJELATNOSTI, value);
	}

	public void setVrstaDjelatnosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__VRSTA_DJELATNOSTI, value);
	}

	public void setOstaleDjelatnosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OSTALE_DJELATNOSTI, value);
	}

	public void setOpisDjelatnosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OPIS_DJELATNOSTI, value);
	}

	public void setBrojZaposlenih(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__BROJ_ZAPOSLENIH, value);
	}

	public void setBrojZaposlenihSezona(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__BROJ_ZAPOSLENIH_SEZONA,
				value);
	}

	public void setKalsifikacijaZaposlenih(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KALSIFIKACIJA_ZAPOSLENIH,
				value);
	}

	public void setGlavnaBanka(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__GLAVNA_BANKA, value);
	}

	public void setOstaleBanke(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OSTALE_BANKE, value);
	}

	public void setOpisImovine(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OPIS_IMOVINE, value);
	}

	public void setOpisPoslovnihAktivnosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__OPIS_POSLOVNIH_AKTIVNOSTI,
				value);
	}

	public void setKomentarFinancijskeAnalize(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_FINANCIJSKE_ANALIZE,
				value);
	}

	public void setKomentarKupaca(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_KUPACA, value);
	}

	public void setKomentarDobavljaca(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_DOBAVLJACA,
				value);
	}

	public void setKomentarOsiguranja(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_OSIGURANJA,
				value);
	}

	public void setSwotSnage(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SWOT_SNAGE, value);
	}

	public void setSwotSlabosti(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SWOT_SLABOSTI, value);
	}

	public void setSwotPrilike(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SWOT_PRILIKE, value);
	}

	public void setSwotPrijetnje(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__SWOT_PRIJETNJE, value);
	}

	public void setKomentarPoslovnogOdnosa(String value) {
		set(ZAHDataDictionary.PO_ZAH_PODACI_KLIJENTA__KOMENTAR_POSLOVNOG_ODNOSA,
				value);
	}
}