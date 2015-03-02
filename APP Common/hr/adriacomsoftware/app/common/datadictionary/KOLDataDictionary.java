package hr.adriacomsoftware.app.common.datadictionary;

import java.util.Properties;

public final class KOLDataDictionary {    
	private static KOLDataDictionary _instance = null;
	public Properties _properties;
	//kolateral
	public static String KOL_KOLATERAL__ID_KOLATERALA = "id_kolaterala";
	public static String KOL_KOLATERAL__GRUPA = "grupa";
	public static String KOL_KOLATERAL__MATICNI_BROJ_JMBG = "maticni_broj_jmbg";
	public static String KOL_KOLATERAL__OIB = "oib";
	public static String KOL_KOLATERAL__VRIJEDI_OD = "vrijedi_od";
	public static String KOL_KOLATERAL__VRIJEDI_DO = "vrijedi_do";
	public static String KOL_KOLATERAL__NAZIV = "naziv";
	public static String KOL_KOLATERAL__KOLICINA = "kolicina";
	public static String KOL_KOLATERAL__VRSTA = "vrsta";
	public static String KOL_KOLATERAL__SIFRA_KOLATERALA = "sifra_kolaterala";
	public static String KOL_KOLATERAL__VLASNIK = "vlasnik";
	public static String KOL_KOLATERAL__LOKACIJA = "lokacija";
	public static String KOL_KOLATERAL__POVRSINA_OBJEKTA = "povrsina_objekta";
	public static String KOL_KOLATERAL__POVRSINA_ZEMLJISTA = "povrsina_zemljista";
	public static String KOL_KOLATERAL__CIKLUS_PROCJENE_DANA = "ciklus_procjene_dana";
	public static String KOL_KOLATERAL__CIKLUS_PROCJENE_MJESECI = "ciklus_procjene_mjeseci";
	public static String KOL_KOLATERAL__CIKLUS_PROCJENE_GODINA = "ciklus_procjene_godina";
	public static String KOL_KOLATERAL__PROCJENJENA_VRIJEDNOST = "procjenjena_vrijednost";
	public static String KOL_KOLATERAL__VALUTA_PROCJENE = "valuta_procjene";
	public static String KOL_KOLATERAL__DATUM_PROCJENE = "datum_procjene";
	public static String KOL_KOLATERAL__PROCJENITELJ = "procjenitelj";
	public static String KOL_KOLATERAL__NAPOMENA = "napomena";
	public static String KOL_KOLATERAL__TERETI = "tereti";
	public static String KOL_KOLATERAL__VALUTA_TERETI = "valuta_tereti";
	public static String KOL_KOLATERAL__DATUM_DOSPIJECA = "datum_dospijeca";
	public static String KOL_KOLATERAL__DEPOZIT_KAMATNA_STOPA = "depozit_kamatna_stopa";
	public static String KOL_KOLATERAL__DEPOZIT_BROJ_KNJIZICE = "depozit_broj_knjizice";
	public static String KOL_KOLATERAL__DIONICE_TIP = "dionice_tip";
	public static String KOL_KOLATERAL__DIONICE_OZNAKA = "dionice_oznaka";
	public static String KOL_KOLATERAL__DIONICE_UDIO = "dionice_udio";
	public static String KOL_KOLATERAL__DIONICE_TRZISNI_IZNOS = "dionice_trzisni_iznos";
	public static String KOL_KOLATERAL__DIONICE_VALUTA_TRZISNI_IZNOS = "dionice_valuta_trzisni_iznos";
	public static String KOL_KOLATERAL__GARANCIJA_TIP = "garancija_tip";
	public static String KOL_KOLATERAL__JAMAC_IME_PREZIME = "jamac_ime_prezime";
	public static String KOL_KOLATERAL__JAMAC_ADRESA = "jamac_adresa";
	public static String KOL_KOLATERAL__JAMAC_MJESTO = "jamac_mjesto";
	public static String KOL_KOLATERAL__JAMAC_ZAPOSLENJE = "jamac_zaposlenje";
	public static String KOL_KOLATERAL__JAMAC_MATICNI_BROJ_JMBG = "jamac_maticni_broj_jmbg";
	public static String KOL_KOLATERAL__JAMAC_OIB = "jamac_oib";
	public static String KOL_KOLATERAL__MJENICA_DUZNIK = "mjenica_duznik";
	public static String KOL_KOLATERAL__KATASTARSKA_CESTICA = "katastarska_cestica";
	public static String KOL_KOLATERAL__KATASTARSKE_CESTICE_DODATAK = "katastarske_cestice_dodatak";
	public static String KOL_KOLATERAL__KATASTARSKA_OPCINA = "katastarska_opcina";
	public static String KOL_KOLATERAL__BROJ_ZK_ULOSKA = "broj_zk_uloska";
	public static String KOL_KOLATERAL__REGISTARSKA_OZNAKA = "registarska_oznaka";
	public static String KOL_KOLATERAL__DATUM_PROIZVODNJE = "datum_proizvodnje";
	public static String KOL_KOLATERAL__UDIO_POSTOTAK = "udio_postotak";
	public static String KOL_KOLATERAL__UDIO_MATICNI_BROJ = "udio_maticni_broj";
	public static String KOL_KOLATERAL__KONCESIJA_DATUM_ODOBRENJA = "koncesija_datum_odobrenja";
	public static String KOL_KOLATERAL__KONCESIJA_VRIJEDI_DO = "koncesija_vrijedi_do";
	public static String KOL_KOLATERAL__KONCESIJA_BROJ_UGOVORA = "koncesija_broj_ugovora";
	public static String KOL_KOLATERAL__ZALOG_DATUM_ZALOGA = "zalog_datum_zaloga";
	public static String KOL_KOLATERAL__ZALOG_DATUM_OVJERE = "zalog_datum_ovjere";
	public static String KOL_KOLATERAL__ZALOG_BROJ_ZALOGA = "zalog_broj_zaloga";
	public static String KOL_KOLATERAL__ZALOG_BROJ_OVJERE = "zalog_broj_ovjere";
	public static String KOL_KOLATERAL__ZALOG_SUD = "zalog_sud";
	public static String KOL_KOLATERAL__ZALOG_JAVNI_BILJEZNIK = "zalog_javni_biljeznik";
	public static String KOL_KOLATERAL__ISPRAVNO = "ispravno";
	//polica
	public static String KOL_KOLATERAL_POLICA__ID_POLICE = "id_police";
	public static String KOL_KOLATERAL_POLICA__ID_KOLATERALA = "id_kolaterala";
	public static String KOL_KOLATERAL_POLICA__OSIGURAVAJUCA_KUCA = "osiguravajuca_kuca";
	public static String KOL_KOLATERAL_POLICA__BROJ_POLICE = "broj_police";
	public static String KOL_KOLATERAL_POLICA__DATUM_DOSPIJECA_POLICE = "datum_dospijeca_police";
	public static String KOL_KOLATERAL_POLICA__DATUM_IZDAVANJA_POLICE = "datum_izdavanja_police";
	public static String KOL_KOLATERAL_POLICA__OSIGURANA_SVOTA = "osigurana_svota";
	public static String KOL_KOLATERAL_POLICA__VALUTA_OSIGURANE_SVOTE = "valuta_osigurane_svote";
	public static String KOL_KOLATERAL_POLICA__DATUM_DOSPIJECA_PREMIJE = "datum_dospijeca_premije";
	public static String KOL_KOLATERAL_POLICA__DATUM_OTVARANJA_POLICE = "datum_otvaranja_police";
	public static String KOL_KOLATERAL_POLICA__BROJ_PARTIJE = "broj_partije";
	public static String KOL_KOLATERAL_POLICA__KOMENTAR = "komentar";
	//partija
	public static String KOL_KOLATERAL_PARTIJA__ID_KOLATERALA_PARTIJE = "id_kolaterala_partije";
	public static String KOL_KOLATERAL_PARTIJA__ID_KOLATERALA = "id_kolaterala";
	public static String KOL_KOLATERAL_PARTIJA__BROJ_PARTIJE = "broj_partije";
	public static String KOL_KOLATERAL_PARTIJA__POSTOTAK_VEZE = "postotak_veze";
	public static String KOL_KOLATERAL_PARTIJA__BROJ_UGOVORA = "broj_ugovora";
	public static String KOL_KOLATERAL_PARTIJA__OIB = "oib";
	public static String KOL_KOLATERAL_PARTIJA__NAZIV = "naziv";
	public static String KOL_KOLATERAL_PARTIJA__NAZIV_KREDITORA = "naziv_kreditora";
	public static String KOL_KOLATERAL_PARTIJA__ODOBRENI_IZNOS = "odobreni_iznos";
	public static String KOL_KOLATERAL_PARTIJA__SALDO = "saldo";
	public static String KOL_KOLATERAL_PARTIJA__JMBG_MB = "jmbg_mb";
	public static String KOL_KOLATERAL_PARTIJA__DATUM_UPISA = "datum_upisa";
	public static String KOL_KOLATERAL_PARTIJA__DATUM_BRISANJA = "datum_brisanja";
	public static String KOL_KOLATERAL_PARTIJA__NAPOMENA = "napomena";
	public static String KOL_KOLATERAL_PARTIJA__KAMATNA_STOPA = "kamatna_stopa";
	public static String KOL_KOLATERAL_PARTIJA__VALUTA_TERETA = "valuta_tereta";
	public static String KOL_KOLATERAL_PARTIJA__VALUTA_SALDA = "valuta_salda";
	public static String KOL_KOLATERAL_PARTIJA__ISPRAVNO = "ispravno";
	public static String KOL_KOLATERAL_PARTIJA__REDOSLIJED_UPISA = "redoslijed_upisa";
	public static String KOL_KOLATERAL_PARTIJA__DATUM_SALDA = "datum_salda";
	public static String KOL_KOLATERAL_PARTIJA__TERET_DRUGA_BANKA = "teret_druga_banka";
	public static String KOL_KOLATERAL_PARTIJA__UCITANO = "ucitano";
	private KOLDataDictionary() {
	    _properties = new Properties();
	}
	public static synchronized KOLDataDictionary getInstance () {
		if (_instance==null)
			_instance=new KOLDataDictionary();
		return _instance;
	}
	public Properties getProperties() {
		return _properties;
	}
	public String getProperty(String name, String defaultValue) {
		return _properties.getProperty(name, defaultValue);
	}
	public String getProperty(String name) {
		return _properties.getProperty(name);
	}
}
