package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.partija.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class ZahNalogPartijeVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__ID_NALOGA = "id_naloga";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__ID_BANKARSKOG_PROIZVODA = "id_bankarskog_proizvoda";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__REDNI_BROJ = "redni_broj";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__EVIDENCIJSKI_BROJ = "evidencijski_broj";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__SIFRA_PROIZVODA = "sifra_proizvoda";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PROIZVOD = "proizvod";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__MODEL = "model";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__POVEZNICA_KAMATE = "poveznica_kamate";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__POVEZNICA_MT = "poveznica_mt";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__POVEZNICA_TOZ = "poveznica_toz";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__BROJ_PARTIJE = "broj_partije";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_UGOVOR = "prilog_ugovor";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_GARANCIJA = "prilog_garancija";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_ODLUKA = "prilog_odluka";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_POLICA = "prilog_polica";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_PISMO_NAMJERE = "prilog_pismo_namjere";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_VLASNICKI_LIST = "prilog_vlasnicki_list";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_RJESENJE_OSIGURANJA = "prilog_rjesenje_osiguranja";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_MJENICA = "prilog_mjenica";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_ZADUZNICA = "prilog_zaduznica";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_SUGLASNOST = "prilog_suglasnost";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_UGOVOR_ZALOG = "prilog_ugovor_zalog";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_NALOGA = "datum_naloga";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__UGOVARANJE_REFERENT = "ugovaranje_referent";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__UGOVARANJE_SEF_SLUZBE = "ugovaranje_sef_sluzbe";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__UGOVARANJE_DIREKTOR = "ugovaranje_direktor";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PODRSKA_SEF_SLUZBE = "podrska_sef_sluzbe";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__PODRSKA_DIREKTOR = "podrska_direktor";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__DOSTAVA_OPIS = "dostava_opis";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_PARAFIRANJA = "datum_parafiranja";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_KONTROLE = "datum_kontrole";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__REFERENT_PODRSKE = "referent_podrske";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__STATUS_ODLUKE = "status_odluke";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__OPERATER_UNOSA = "operater_unosa";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__OPERATER_PROMJENE = "operater_promjene";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_UNOSA = "datum_unosa";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_PROMJENE = "datum_promjene";
	public static String PO_ZAH_NALOG_OTVARANJA_PARTIJE__ISPRAVNO = "ispravno";

	public ZahNalogPartijeVo() {
		super();
	}

	public ZahNalogPartijeVo(AS2Record value) {
		super(value);
	}

	public String getIdNaloga() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__ID_NALOGA);
	}

	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__BROJ_ZAHTJEVA);
	}

	public String getIdBankarskogProizvoda() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__ID_BANKARSKOG_PROIZVODA);
	}

	public String getSifraProizvoda() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__SIFRA_PROIZVODA);
	}

	public String getProizvod() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PROIZVOD);
	}

	public String getModel() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__MODEL);
	}

	public String getPoveznicaKamate() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__POVEZNICA_KAMATE);
	}

	public String getPoveznicaMt() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__POVEZNICA_MT);
	}

	public String getPoveznicaToz() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__POVEZNICA_TOZ);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__BROJ_PARTIJE);
	}

	public String getPrilogUgovor() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_UGOVOR);
	}

	public String getPrilogGarancija() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_GARANCIJA);
	}

	public String getPrilogOdluka() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_ODLUKA);
	}

	public String getPrilogVlasnickiList() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_VLASNICKI_LIST);
	}

	public String getPrilogMjenica() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_MJENICA);
	}

	public String getPrilogZaduznica() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_ZADUZNICA);
	}

	public String getPrilogSuglasnost() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_SUGLASNOST);
	}

	public String getPrilogUgovorZalog() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_UGOVOR_ZALOG);
	}

	public Calendar getDatumNaloga() {
		return getAsCalendar(PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_NALOGA);
	}

	public String getUgovaranjeReferent() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__UGOVARANJE_REFERENT);
	}

	public String getUgovaranjeSefSluzbe() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__UGOVARANJE_SEF_SLUZBE);
	}

	public String getUgovaranjeDirektor() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__UGOVARANJE_DIREKTOR);
	}

	public String getPodrskaSefSluzbe() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PODRSKA_SEF_SLUZBE);
	}

	public String getPodrskaDirektor() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PODRSKA_DIREKTOR);
	}

	public String getStatusOdluke() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__STATUS_ODLUKE);
	}

	public String getOperaterUnosa() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__OPERATER_UNOSA);
	}

	public String getOperaterPromjene() {
		return getAsStringOrEmpty(PO_ZAH_NALOG_OTVARANJA_PARTIJE__OPERATER_PROMJENE);
	}

	public Calendar getDatumUnosa() {
		return getAsCalendar(PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_UNOSA);
	}

	public Calendar getDatumPromjene() {
		return getAsCalendar(PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_PROMJENE);
	}

	public void setIdNaloga(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__ID_NALOGA, value);
	}

	public void setBrojZahtjeva(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__BROJ_ZAHTJEVA, value);
	}

	public void setIdBankarskogProizvoda(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__ID_BANKARSKOG_PROIZVODA, value);
	}

	public void setSifraProizvoda(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__SIFRA_PROIZVODA, value);
	}

	public void setProizvod(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PROIZVOD, value);
	}

	public void setModel(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__MODEL, value);
	}

	public void setPoveznicaKamate(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__POVEZNICA_KAMATE, value);
	}

	public void setPoveznicaMt(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__POVEZNICA_MT, value);
	}

	public void setPoveznicaToz(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__POVEZNICA_TOZ, value);
	}

	public void setBrojPartije(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__BROJ_PARTIJE, value);
	}

	public void setPrilogUgovor(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_UGOVOR, value);
	}

	public void setPrilogGarancija(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_GARANCIJA, value);
	}

	public void setPrilogOdluka(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_ODLUKA, value);
	}

	public void setPrilogVlasnickiList(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_VLASNICKI_LIST, value);
	}

	public void setPrilogMjenica(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_MJENICA, value);
	}

	public void setPrilogZaduznica(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_ZADUZNICA, value);
	}

	public void setPrilogSuglasnost(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_SUGLASNOST, value);
	}

	public void setPrilogUgovorZalog(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PRILOG_UGOVOR_ZALOG, value);
	}

	public void setDatumNaloga(Calendar value) {
		setCalendarAsDateString(value,
				PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_NALOGA);
	}

	public void setUgovaranjeReferent(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__UGOVARANJE_REFERENT, value);
	}

	public void setUgovaranjeSefSluzbe(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__UGOVARANJE_SEF_SLUZBE, value);
	}

	public void setUgovaranjeDirektor(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__UGOVARANJE_DIREKTOR, value);
	}

	public void setPodrskaSefSluzbe(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PODRSKA_SEF_SLUZBE, value);
	}

	public void setPodrskaDirektor(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__PODRSKA_DIREKTOR, value);
	}

	public void setStatusOdluke(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__STATUS_ODLUKE, value);
	}

	public void setOperaterUnosa(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__OPERATER_UNOSA, value);
	}

	public void setOperaterPromjene(String value) {
		set(PO_ZAH_NALOG_OTVARANJA_PARTIJE__OPERATER_PROMJENE, value);
	}

	public void setDatumUnosa(Calendar value) {
		setCalendarAsDateString(value,
				PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_UNOSA);
	}

	public void setDatumPromjene(Calendar value) {
		setCalendarAsDateString(value,
				PO_ZAH_NALOG_OTVARANJA_PARTIJE__DATUM_PROMJENE);
	}
}