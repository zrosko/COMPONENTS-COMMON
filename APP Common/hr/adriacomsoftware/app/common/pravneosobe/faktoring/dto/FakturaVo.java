package hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class FakturaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PO_FAKT_SPECIFIKACIJA__ID_SPEC = "id_spec";
	public static String PO_FAKT_SPECIFIKACIJA__DATUM_SPECIFIKACIJE = "datum_specifikacije";
	public static String PO_FAKT_SPECIFIKACIJA__DATUM_SPECIFIKACIJE_DO = "datum_specifikacije_do";
	public static String PO_FAKT_SPECIFIKACIJA__MATICNI_BROJ = "maticni_broj";
	public static String PO_FAKT_SPECIFIKACIJA__OIB = "oib";
	public static String PO_FAKT_SPECIFIKACIJA__ISPRAVNO = "ispravno";
	public static String PO_FAKT_SPECIFIKACIJA__REGRES = "regres";
	public static String PO_FAKT_SPECIFIKACIJA__NAZIV = "naziv";
	public static String PO_FAKT_SPECIFIKACIJA__BROJ_UGOVORA = "broj_ugovora";
	public static String PO_FAKT_SPECIFIKACIJA__OPERATER_UNOSA = "operater_unosa";
	public static String PO_FAKT_SPECIFIKACIJA__ZAPRIMATELJ = "zaprimatelj";
	public static String PO_FAKT_SPECIFIKACIJA__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String PO_FAKT_SPECIFIKACIJA__BROJ_ZAHTJEVA = "broj_zahtjeva";
	// faktura
	public static String PO_FAKT_FAKTURA__ID_FAKTURE = "id_fakture";
	public static String PO_FAKT_FAKTURA__MATICNI_BROJ_KUPCA = "maticni_broj_kupca";
	public static String PO_FAKT_FAKTURA__OIB_KUPCA = "oib_kupca";
	public static String PO_FAKT_FAKTURA__NAZIV_KUPCA = "naziv_kupca";
	public static String PO_FAKT_FAKTURA__BROJ_FAKTURE = "broj_fakture";
	public static String PO_FAKT_FAKTURA__SIFRA_VALUTE = "sifra_valute";
	public static String PO_FAKT_FAKTURA__IZNOS = "iznos";
	public static String PO_FAKT_FAKTURA__DATUM_DOSPIJECA = "datum_dospijeca";
	public static String PO_FAKT_FAKTURA__TROSAK_SERVISIRANJA = "trosak_servisiranja";
	public static String PO_FAKT_FAKTURA__POSTOTAK_REZERVE = "postotak_rezerve";
	public static String PO_FAKT_FAKTURA__POSTOTAK_PROVIZIJE = "postotak_provizije";
	public static String PO_FAKT_FAKTURA__POSTOTAK_PDV = "postotak_pdv";

	public FakturaVo() {
		super();
	}

	public FakturaVo(AS2Record value) {
		super(value);
	}

	// U K U P N O
	public String getUkupnoIznos() {
		return get("ukupno_iznos");
	}

	public void setUkupnoIznos(String value) {
		set("ukupno_iznos", value);
	}

	// U K U P N O
	public String getIdSpec() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__ID_SPEC);
	}

	public Calendar getDatumSpecifikacije() {
		return getAsCalendar(PO_FAKT_SPECIFIKACIJA__DATUM_SPECIFIKACIJE);
	}

	public Calendar getDatumSpecifikacijeDo() {
		return getAsCalendar(PO_FAKT_SPECIFIKACIJA__DATUM_SPECIFIKACIJE_DO);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__MATICNI_BROJ);
	}

	public String getOib() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__OIB);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__ISPRAVNO);
	}

	public String getRegres() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__REGRES);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__NAZIV);
	}

	public String getBrojUgovora() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__BROJ_UGOVORA);
	}

	public String getOperaterUnosa() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__OPERATER_UNOSA);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__ORGANIZACIJSKA_JEDINICA);
	}

	public String getZaprimatelj() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__ZAPRIMATELJ);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(PO_FAKT_SPECIFIKACIJA__BROJ_ZAHTJEVA);
	}

	public void setIdSpec(String value) {
		set(PO_FAKT_SPECIFIKACIJA__ID_SPEC, value);
	}

	public void setDatumSpecifikacije(Calendar value) {
		setCalendarAsDateString(value,
				PO_FAKT_SPECIFIKACIJA__DATUM_SPECIFIKACIJE);
	}

	public void setDatumSpecifikacijeDo(Calendar value) {
		setCalendarAsDateString(value,
				PO_FAKT_SPECIFIKACIJA__DATUM_SPECIFIKACIJE_DO);
	}

	public void setMaticniBroj(String value) {
		set(PO_FAKT_SPECIFIKACIJA__MATICNI_BROJ, value);
	}

	public void setOib(String value) {
		set(PO_FAKT_SPECIFIKACIJA__OIB, value);
	}

	public void setIspravno(String value) {
		set(PO_FAKT_SPECIFIKACIJA__ISPRAVNO, value);
	}

	public void setRegres(String value) {
		set(PO_FAKT_SPECIFIKACIJA__REGRES, value);
	}

	public void setNaziv(String value) {
		set(PO_FAKT_SPECIFIKACIJA__NAZIV, value);
	}

	public void setBrojUgovora(String value) {
		set(PO_FAKT_SPECIFIKACIJA__BROJ_UGOVORA, value);
	}

	public void setOperaterUnosa(String value) {
		set(PO_FAKT_SPECIFIKACIJA__OPERATER_UNOSA, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(PO_FAKT_SPECIFIKACIJA__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setZaprimatelj(String value) {
		set(PO_FAKT_SPECIFIKACIJA__ZAPRIMATELJ, value);
	}

	public void setBrojZahtjeva(String value) {
		set(PO_FAKT_SPECIFIKACIJA__BROJ_ZAHTJEVA, value);
	}

	// faktura
	public String getIdFakture() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__ID_FAKTURE);
	}

	public String getMaticniBrojKupca() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__MATICNI_BROJ_KUPCA);
	}

	public String getOibKupca() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__OIB_KUPCA);
	}

	public String getNazivKupca() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__NAZIV_KUPCA);
	}

	public String getBrojFakture() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__BROJ_FAKTURE);
	}

	public String getSifraValute() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__SIFRA_VALUTE);
	}

	public String getIznos() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__IZNOS);
	}

	public Calendar getDatumDospijeca() {
		return getAsCalendar(PO_FAKT_FAKTURA__DATUM_DOSPIJECA);
	}

	public String getTrosakServisiranja() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__TROSAK_SERVISIRANJA);
	}

	public String getPostotakRezerve() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__POSTOTAK_REZERVE);
	}

	public String getPostotakProvizije() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__POSTOTAK_PROVIZIJE);
	}

	public String getPostotakPdv() {
		return getAsStringOrEmpty(PO_FAKT_FAKTURA__POSTOTAK_PDV);
	}

	public void setIdFakture(String value) {
		set(PO_FAKT_FAKTURA__ID_FAKTURE, value);
	}

	public void setMaticniBrojKupca(String value) {
		set(PO_FAKT_FAKTURA__MATICNI_BROJ_KUPCA, value);
	}

	public void setOibKupca(String value) {
		set(PO_FAKT_FAKTURA__OIB_KUPCA, value);
	}

	public void setNazivKupca(String value) {
		set(PO_FAKT_FAKTURA__NAZIV_KUPCA, value);
	}

	public void setBrojFakture(String value) {
		set(PO_FAKT_FAKTURA__BROJ_FAKTURE, value);
	}

	public void setSifraValute(String value) {
		set(PO_FAKT_FAKTURA__SIFRA_VALUTE, value);
	}

	public void setIznos(String value) {
		set(PO_FAKT_FAKTURA__IZNOS, value);
	}

	public void setDatumDospijeca(Calendar value) {
		setCalendarAsDateString(value, PO_FAKT_FAKTURA__DATUM_DOSPIJECA);
	}

	public void setTrosakServisiranja(String value) {
		set(PO_FAKT_FAKTURA__TROSAK_SERVISIRANJA, value.trim());
	}

	public void setPostotakRezerve(String value) {
		set(PO_FAKT_FAKTURA__POSTOTAK_REZERVE, value.trim());
	}

	public void setPostotakProvizije(String value) {
		set(PO_FAKT_FAKTURA__POSTOTAK_PROVIZIJE, value.trim());
	}

	public void setPostotakPdv(String value) {
		set(PO_FAKT_FAKTURA__POSTOTAK_PDV, value.trim());
	}
}