package hr.adriacomsoftware.app.common.or.eksternalizacija.dto;

import hr.as2.inf.common.data.AS2Record;

public class OrEksternalizacijaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String OR_EKSTERNALIZACIJA__ID_EKSTERNALIZACIJE = "id_eksternalizacije";
	public static String OR_EKSTERNALIZACIJA__MATICNI_BROJ = "maticni_broj";
	public static String OR_EKSTERNALIZACIJA__JMBG = "jmbg";
	public static String OR_EKSTERNALIZACIJA__OIB = "oib";
	public static String OR_EKSTERNALIZACIJA__NAZIV = "naziv";
	public static String OR_EKSTERNALIZACIJA__DATUM = "datum";
	public static String OR_EKSTERNALIZACIJA__DOKUMENTACIJA = "dokumentacija";
	public static String OR_EKSTERNALIZACIJA__OPIS = "opis";
	public static String OR_EKSTERNALIZACIJA__OCJENA_EKONOMSKO_FINANCIJSKA = "ocjena_ekonomsko_financijska";
	public static String OR_EKSTERNALIZACIJA__OCJENA_ZAPOSLENICI_BROJ = "ocjena_zaposlenici_broj";
	public static String OR_EKSTERNALIZACIJA__OCJENA_ZAPOSLENICI_FLUKTUACIJA = "ocjena_zaposlenici_fluktuacija";
	public static String OR_EKSTERNALIZACIJA__OCJENA_ZAPOSLENICI_STRUCNOST = "ocjena_zaposlenici_strucnost";
	public static String OR_EKSTERNALIZACIJA__OCJENA_RIZIK_PAVNI = "ocjena_rizik_pavni";
	public static String OR_EKSTERNALIZACIJA__OCJENA_RIZIK_OPERATIVNI = "ocjena_rizik_operativni";
	public static String OR_EKSTERNALIZACIJA__OCJENA_RIZIK_FINANCIJSKI = "ocjena_rizik_financijski";
	public static String OR_EKSTERNALIZACIJA__OCJENA_RIZIK_TEHNOLOSKI = "ocjena_rizik_tehnoloski";
	public static String OR_EKSTERNALIZACIJA__OCJENA_RIZIK_STRATESKI = "ocjena_rizik_strateski";
	public static String OR_EKSTERNALIZACIJA__OCJENA_USLUGA_KORISNICI = "ocjena_usluga_korisnici";
	public static String OR_EKSTERNALIZACIJA__OCJENA_USLUGA_REFERENCE = "ocjena_usluga_reference";
	public static String OR_EKSTERNALIZACIJA__OCJENA_USLUGA_ODGOVORNA_OSOBA = "ocjena_usluga_odgovorna_osoba";
	public static String OR_EKSTERNALIZACIJA__OCJENA_UGOVOR_ODREDBE = "ocjena_ugovor_odredbe";
	public static String OR_EKSTERNALIZACIJA__OCJENA_UGOVOR_ELEMENTI = "ocjena_ugovor_elementi";
	public static String OR_EKSTERNALIZACIJA__OCJENA_UGOVOR_NEUSKLADENOST = "ocjena_ugovor_neuskladenost";

	public OrEksternalizacijaVo() {
		super();
	}

	public OrEksternalizacijaVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdEksternalizacije() {
		return get(OR_EKSTERNALIZACIJA__ID_EKSTERNALIZACIJE);
	}

	public String getMaticniBroj() {
		return get(OR_EKSTERNALIZACIJA__MATICNI_BROJ);
	}

	public String getJmbg() {
		return get(OR_EKSTERNALIZACIJA__JMBG);
	}

	public String getOib() {
		return get(OR_EKSTERNALIZACIJA__OIB);
	}

	public String getNaziv() {
		return get(OR_EKSTERNALIZACIJA__NAZIV);
	}

	// public Calendar getDatum() {
	// return getPropertyAsCalendar(OR_EKSTERNALIZACIJA__DATUM);
	// }

	public String getDokumentacija() {
		return get(OR_EKSTERNALIZACIJA__DOKUMENTACIJA);
	}

	public String getOpis() {
		return get(OR_EKSTERNALIZACIJA__OPIS);
	}

	public String getOcjenaEkonomskoFinancijska() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_EKONOMSKO_FINANCIJSKA);
	}

	public String getOcjenaZaposleniciBroj() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_ZAPOSLENICI_BROJ);
	}

	public String getOcjenaZaposleniciFluktuacija() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_ZAPOSLENICI_FLUKTUACIJA);
	}

	public String getOcjenaZaposleniciStrucnost() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_ZAPOSLENICI_STRUCNOST);
	}

	public String getOcjenaRizikPavni() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_PAVNI);
	}

	public String getOcjenaRizikOperativni() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_OPERATIVNI);
	}

	public String getOcjenaRizikFinancijski() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_FINANCIJSKI);
	}

	public String getOcjenaRizikTehnoloski() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_TEHNOLOSKI);
	}

	public String getOcjenaRizikStrateski() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_STRATESKI);
	}

	public String getOcjenaUslugaKorisnici() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_USLUGA_KORISNICI);
	}

	public String getOcjenaUslugaReference() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_USLUGA_REFERENCE);
	}

	public String getOcjenaUslugaOdgovornaOsoba() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_USLUGA_ODGOVORNA_OSOBA);
	}

	public String getOcjenaUgovorOdredbe() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_UGOVOR_ODREDBE);
	}

	public String getOcjenaUgovorElementi() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_UGOVOR_ELEMENTI);
	}

	public String getOcjenaUgovorNeuskladenost() {
		return get(OR_EKSTERNALIZACIJA__OCJENA_UGOVOR_NEUSKLADENOST);
	}

	/************* SETTERS ************/

	public void setIdEksternalizacije(String value) {
		set(OR_EKSTERNALIZACIJA__ID_EKSTERNALIZACIJE, value);
	}

	public void setMaticniBroj(String value) {
		set(OR_EKSTERNALIZACIJA__MATICNI_BROJ, value);
	}

	public void setJmbg(String value) {
		set(OR_EKSTERNALIZACIJA__JMBG, value);
	}

	public void setOib(String value) {
		set(OR_EKSTERNALIZACIJA__OIB, value);
	}

	public void setNaziv(String value) {
		set(OR_EKSTERNALIZACIJA__NAZIV, value);
	}

	// public void setDatum(Calendar value) {
	// setPropertyCalendarAsDateString(value, OR_EKSTERNALIZACIJA__DATUM);
	// }

	public void setDokumentacija(String value) {
		set(OR_EKSTERNALIZACIJA__DOKUMENTACIJA, value);
	}

	public void setOpis(String value) {
		set(OR_EKSTERNALIZACIJA__OPIS, value);
	}

	public void setOcjenaEkonomskoFinancijska(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_EKONOMSKO_FINANCIJSKA, value);
	}

	public void setOcjenaZaposleniciBroj(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_ZAPOSLENICI_BROJ, value);
	}

	public void setOcjenaZaposleniciFluktuacija(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_ZAPOSLENICI_FLUKTUACIJA, value);
	}

	public void setOcjenaZaposleniciStrucnost(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_ZAPOSLENICI_STRUCNOST, value);
	}

	public void setOcjenaRizikPavni(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_PAVNI, value);
	}

	public void setOcjenaRizikOperativni(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_OPERATIVNI, value);
	}

	public void setOcjenaRizikFinancijski(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_FINANCIJSKI, value);
	}

	public void setOcjenaRizikTehnoloski(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_TEHNOLOSKI, value);
	}

	public void setOcjenaRizikStrateski(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_RIZIK_STRATESKI, value);
	}

	public void setOcjenaUslugaKorisnici(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_USLUGA_KORISNICI, value);
	}

	public void setOcjenaUslugaReference(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_USLUGA_REFERENCE, value);
	}

	public void setOcjenaUslugaOdgovornaOsoba(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_USLUGA_ODGOVORNA_OSOBA, value);
	}

	public void setOcjenaUgovorOdredbe(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_UGOVOR_ODREDBE, value);
	}

	public void setOcjenaUgovorElementi(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_UGOVOR_ELEMENTI, value);
	}

	public void setOcjenaUgovorNeuskladenost(String value) {
		set(OR_EKSTERNALIZACIJA__OCJENA_UGOVOR_NEUSKLADENOST, value);
	}

}
