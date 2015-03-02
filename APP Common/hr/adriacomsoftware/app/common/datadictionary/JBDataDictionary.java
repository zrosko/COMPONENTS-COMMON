package hr.adriacomsoftware.app.common.datadictionary;

import java.util.Properties;

public final class JBDataDictionary {    
	private static JBDataDictionary _instance = null;
	public Properties _properties;
	//TODO definirati imena kolona domene
	public static String BI_DOMENA__ISKLJUCENE_PARTIJE = "iskljucene_partije";
	public static String BI_IZVJESTAJ_NASLOV = "izvjestaj_naslov";
	
	public static String BI_PO_FO = "po_fo";
	
	public static String BI_RADNIK__ID_RADNIKA = "id_radnika";
	public static String BI_RADNIK__IME = "ime";
	public static String BI_RADNIK__PREZIME = "prezime";
	public static String BI_DATUM = "datum";
	public static String BI_BROJ_KONTA = "broj_konta";
	public static String BI_BROJ_PARTIJE = "broj_partije";
	public static String BI_MATICNI_BROJ = "maticni_broj";
	public static String BI_OIB = "oib";
	//partija
	public static String BI_PARTIJA__BROJ_PARTIJE = "broj_partije";
	public static String BI_PARTIJA__STANJE_PARTIJE_OD = "stanje_partije_od";
	public static String BI_PARTIJA__STANJE_PARTIJE_DO = "stanje_partije_do";
	public static String BI_PARTIJA__UGOVORENO_PREKORACENJE_OD = "ugovoreno_prekoracenje_od";
	public static String BI_PARTIJA__UGOVORENO_PREKORACENJE_DO = "ugovoreno_prekoracenje_do";
	public static String BI_PARTIJA__DOZVOLJENO_PREKORACENJE_OD = "dozvoljeno_prekoracenje_od";
	public static String BI_PARTIJA__DOZVOLJENO_PREKORACENJE_DO = "dozvoljeno_prekoracenje_do";
	public static String BI_PARTIJA__NEDOZVOLJENO_PREKORACENJE_OD = "nedozvoljeno_prekoracenje_od";
	public static String BI_PARTIJA__NEDOZVOLJENO_PREKORACENJE_DO = "nedozvoljeno_prekoracenje_do";
	public static String BI_PARTIJA__MOGUCI_KREDIT_OD = "moguci_kredit_od";
	public static String BI_PARTIJA__MOGUCI_KREDIT_DO = "moguci_kredit_do";	
	public static String BI_PARTIJA__VALUTA_PROTUVALUTA = "valuta_protuvaluta";
	//ročnost
	public static String BI_ROCNOST__DATUM = "datum";
	public static String BI_ROCNOST__BROJ_PARTIJE = "broj_partije";
	public static String BI_ROCNOST__BROJ_PARTIJE_DO = "broj_partije_do";
	public static String BI_ROCNOST__IME_PREZIME = "ime_prezime";
	public static String BI_ROCNOST__JMBG = "jmbg";
	public static String BI_ROCNOST__NAZIV = "naziv";
	public static String BI_ROCNOST__MATICNI_BROJ = "maticni_broj";
	public static String BI_ROCNOST__GLAVNICA_KAMATE = "glavnica_kamate"; //G,K,O - glavnica, kamate, oboje
	public static String BI_ROCNOST__ORGANIZACIJSKA_JEDINICA_OD = "organizacijska_jedinica_od";
	public static String BI_ROCNOST__ORGANIZACIJSKA_JEDINICA_DO = "organizacijska_jedinica_do";
	public static String BI_ROCNOST__VALUTA_PROTUVALUTA = "valuta_protuvaluta";
	//osoba
	public static String BI_OSOBA__JMBG_MB = "jmbg_mb";
	public static String BI_OSOBA__IME_PREZIME_NAZIV = "ime_prezime_naziv";
	//fizičk aosoba
	public static String BI_OSOBA__IME_PREZIME = "ime_prezime";
	public static String BI_OSOBA__JMBG = "jmbg";
	public static String BI_OSOBA__OIB = "oib";
	//pravna osoba
	public static String BI_PRAVNA_OSOBA__NAZIV = "naziv";
	public static String BI_PRAVNA_OSOBA__MATICNI_BROJ = "maticni_broj";
	public static String BI_PRAVNA_OSOBA__OCJENA_OBJEKTIVNA = "objektivna_ocjena";//"ocjena_objektivna";
	//opomene
	public static String BI_OPOMENE__DATUM = "datum";
	public static String BI_OPOMENE__ZADANI_DATUM = "zadani_datum";
	public static String BI_OPOMENE__BROJ_RATA_OD = "broj_rata_od";
	public static String BI_OPOMENE__BROJ_RATA_DO = "broj_rata_do";
	public static String BI_OPOMENE__BROJ_PARTIJE_OD = "broj_partije_od";
	public static String BI_OPOMENE__BROJ_PARTIJE_DO = "broj_partije_do";
	public static String BI_OPOMENE__VRSTA_OPOMENE = "vrsta_opomene";
	public static String BI_OPOMENE__BROJ_OPOMENE = "broj_opomene";
	//obavijesti
	public static String BI_OBAVIJEST__VRSTA_OBAVIJESTI = "vrsta_obavijesti";
	//izvodi
	public static String BI_IZVOD__DATUM = "datum";
	public static String BI_IZVOD__DATUM_POCETAK = "datum_pocetak";
	public static String BI_IZVOD__DATUM_KRAJ = "datum_kraj";
	public static String BI_IZVOD__BROJ_PARTIJE = "broj_partije";
	public static String BI_IZVOD__BROJ_KONTA = "broj_konta";
	public static String BI_IZVOD__BROJ_PARTIJE_DO = "broj_partije_do";
	public static String BI_IZVOD__NAZIV = "naziv";
	public static String BI_IZVOD__MATICNI_BROJ = "maticni_broj";
	public static String BI_IZVOD__BROJ_IZVODA = "broj_izvoda";
	public static String BI_IZVOD__ORGANIZACIJSKA_JEDINICA_OD = "organizacijska_jedinica_od";
	public static String BI_IZVOD__ORGANIZACIJSKA_JEDINICA_DO = "organizacijska_jedinica_do";
	//trajni nalozi
	public static String BI_TRAJNI_NALOG__BROJ_PARTIJE_DUGUJE_POSTOJI = "broj_partije_duguje_postoji";
	public static String BI_TRAJNI_NALOG__BROJ_PARTIJE_POTRAZUJE_POSTOJI = "broj_partije_potrazuje_postoji";
	public static String BI_TRAJNI_NALOG__ID_TRAJNOG_NALOGA = "id_trajnog_naloga";
	public static String BI_TRAJNI_NALOG__VRSTA_TRAJNOG_NALOGA = "vrsta_trajnog_naloga";
	public static String BI_TRAJNI_NALOG__BROJ_TRAJNOG_NALOGA = "broj_trajnog_naloga";
	public static String BI_TRAJNI_NALOG__VBDI_DUGUJE = "vbdi_duguje";
	public static String BI_TRAJNI_NALOG__BROJ_PARTIJE_DUGUJE = "broj_partije_duguje";
	public static String BI_TRAJNI_NALOG__VBDI_POTRAZUJE = "vbdi_potrazuje";
	public static String BI_TRAJNI_NALOG__BROJ_PARTIJE_POTRAZUJE = "broj_partije_potrazuje";
	public static String BI_TRAJNI_NALOG__BROJ_RACUNA_POTRAZUJE = "broj_racuna_potrazuje";
	public static String BI_TRAJNI_NALOG__MATICNI_BROJ_POTRAZUJE = "maticni_broj_potrazuje";
	public static String BI_TRAJNI_NALOG__NACIN_KNJIZENJA = "nacin_knjizenja";
	public static String BI_TRAJNI_NALOG__POCETNI_DATUM = "pocetni_datum";
	public static String BI_TRAJNI_NALOG__ZAVRSNI_DATUM = "zavrsni_datum";
	public static String BI_TRAJNI_NALOG__PLATITELJ = "platitelj";
	public static String BI_TRAJNI_NALOG__SVRHA_PLACANJA = "svrha_placanja";
	public static String BI_TRAJNI_NALOG__PRIMATELJ = "primatelj";
	public static String BI_TRAJNI_NALOG__POZIV_NA_BROJ_ODOBRENJA = "poziv_na_broj_odobrenja";
	public static String BI_TRAJNI_NALOG__POZIV_NA_BROJ_ZADUZENJA = "poziv_na_broj_zaduzenja";
	public static String BI_TRAJNI_NALOG__MODEL_BROJA_ZADUZENJA = "model_broja_zaduzenja";
	public static String BI_TRAJNI_NALOG__MODEL_BROJA_ODOBRENJA = "model_broja_odobrenja";
	public static String BI_TRAJNI_NALOG__IZNOS_NALOGA = "iznos_naloga";
	public static String BI_TRAJNI_NALOG__SIFRA_VALUTE = "sifra_valute";
	public static String BI_TRAJNI_NALOG__OPERATER_UNOSA = "operater_unosa";
	public static String BI_TRAJNI_NALOG__VRIJEME_UNOSA = "vrijeme_unosa";
	public static String BI_TRAJNI_NALOG__DAN = "dan";
	public static String BI_TRAJNI_NALOG__MJESEC = "mjesec";
	public static String BI_TRAJNI_NALOG__GODINA = "godina";
	public static String BI_TRAJNI_NALOG__OPIS = "opis";
	public static String BI_TRAJNI_NALOG__AKTIVNI = "aktivni";
	public static String BI_TRAJNI_NALOG__NEAKTIVNI = "neaktivni";
	public static String BI_TRAJNI_NALOG__NEISPRAVAN_DATUM = "neispravan_datum";
	//kreditni zahtjev
	public static String JB_GR_KREDITNI_ZAHTJEV__ID_ZAHTJEVA = "id_zahtjeva";
	public static String JB_GR_KREDITNI_ZAHTJEV__SIFRA_ZAHTJEVA = "sifra_zahtjeva";
	public static String JB_GR_KREDITNI_ZAHTJEV__VRSTA_KREDITA = "vrsta_kredita";
	public static String JB_GR_KREDITNI_ZAHTJEV__STATUS_KREDITA = "status_kredita";
	public static String JB_GR_KREDITNI_ZAHTJEV__DATUM_ZAPRIMANJA = "datum_zaprimanja";
	public static String JB_GR_KREDITNI_ZAHTJEV__DATUM_ODOBRENJA = "datum_odobrenja";
	public static String JB_GR_KREDITNI_ZAHTJEV__KREDITNI_REFERENT = "kreditni_referent";
	public static String JB_GR_KREDITNI_ZAHTJEV__DIREKTOR_DIREKCIJE = "direktor_direkcije";
	public static String JB_GR_KREDITNI_ZAHTJEV__KONTROLOR = "kontrolor";
	public static String JB_GR_KREDITNI_ZAHTJEV__PRAVNI_SAVJETNIK = "pravni_savjetnik";
	public static String JB_GR_KREDITNI_ZAHTJEV__KONTRO_KREDITA = "kontro_kredita";
	public static String JB_GR_KREDITNI_ZAHTJEV__BROJ_PARTIJE = "broj_partije";
	public static String JB_GR_KREDITNI_ZAHTJEV__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String JB_GR_KREDITNI_ZAHTJEV__IZNOS_KREDITA = "iznos_kredita";
	public static String JB_GR_KREDITNI_ZAHTJEV__SIFRA_VALUTE = "sifra_valute";
	public static String JB_GR_KREDITNI_ZAHTJEV__ROK_OTPLATE = "rok_otplate";
	public static String JB_GR_KREDITNI_ZAHTJEV__TRAZENA_VRSTA_KREDITA = "trazena_vrsta_kredita";
	public static String JB_GR_KREDITNI_ZAHTJEV__DEPOZIT = "depozit";
	public static String JB_GR_KREDITNI_ZAHTJEV__BROJ_TEKUCEG_RACUNA = "broj_tekuceg_racuna";
	public static String JB_GR_KREDITNI_ZAHTJEV__OPIS_NAMJENE = "opis_namjene";
	public static String JB_GR_KREDITNI_ZAHTJEV__NAPOMENA = "napomena";
	public static String JB_GR_KREDITNI_ZAHTJEV__IZJAVA = "izjava";
	public static String JB_GR_KREDITNI_ZAHTJEV__PRIJEDLOG = "prijedlog";
	public static String JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK1 = "jamac_suduznik1";
	public static String JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK2 = "jamac_suduznik2";
	public static String JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK3 = "jamac_suduznik3";
	public static String JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK4 = "jamac_suduznik4";
	public static String JB_GR_KREDITNI_ZAHTJEV__JMBG1 = "jmbg1";
	public static String JB_GR_KREDITNI_ZAHTJEV__JMBG2 = "jmbg2";
	public static String JB_GR_KREDITNI_ZAHTJEV__JMBG3 = "jmbg3";
	public static String JB_GR_KREDITNI_ZAHTJEV__JMBG4 = "jmbg4";
	public static String JB_GR_KREDITNI_ZAHTJEV__DATUM_PROMJENE = "datum_promjene";
	public static String JB_GR_KREDITNI_ZAHTJEV__DATUM_UNOSA = "datum_unosa";
	public static String JB_GR_KREDITNI_ZAHTJEV__OPERATER = "operater";
	//kreditni zahtjev osoba
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ID_OSOBE = "id_osobe";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ID_ZAHTJEVA = "id_zahtjeva";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__TIP_PUNOMOCI = "tip_punomoci";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__IME = "ime";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__PREZIME = "prezime";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__JMBG = "jmbg";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__MJESTO_RODENJA = "mjesto_rodenja";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__IME_RODITELJA = "ime_roditelja";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__MJESTO_STANOVANJA = "mjesto_stanovanja";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__POSTANSKI_BROJ = "postanski_broj";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ULICA = "ulica";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__TELEFON = "telefon";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__MOBITEL = "mobitel";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__BRACNO_STANJE = "bracno_stanje";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__BROJ_CLANOVA = "broj_clanova";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__BROJ_ZAPOSLENIH = "broj_zaposlenih";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__STANOVANJE = "stanovanje";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__OPIS_NEKRETNINA = "opis_nekretnina";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZAPOSLENJE = "zaposlenje";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZANIMANJE = "zanimanje";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZVANJE = "zvanje";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__STRUCNA_SPREMA = "strucna_sprema";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__UKUPNI_RADNI_STAZ = "ukupni_radni_staz";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__KOD_DANASNJEG_POSLODAVCA = "kod_danasnjeg_poslodavca";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ODREDENO_NEODREDENO = "odredeno_neodredeno";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZAPOSLENJE_OD = "zaposlenje_od";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZAPOSLENJE_DO = "zaposlenje_do";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__NAZIV_POSLODAVCA = "naziv_poslodavca";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__MATICNI_BROJ_POSLODAVCA = "maticni_broj_poslodavca";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ADRESA_POSLODAVCA = "adresa_poslodavca";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZIRO_RACUN_POSLODAVCA = "ziro_racun_poslodavca";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__TELEFON_POSLODAVCA = "telefon_poslodavca";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__FAX_POSLODAVCA = "fax_poslodavca";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__EMAIL_POSLODAVCA = "email_poslodavca";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__ZADNJA_NETO_PLACA = "zadnja_neto_placa";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__DODATNI_MJESECNI_PRIHOD = "dodatni_mjesecni_prihod";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__VRSTA_DODATNOG_PRIHODA = "vrsta_dodatnog_prihoda";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__KLIJENT_BANKE = "klijent_banke";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__VRSTA_RACUNA_KOD_BANKE = "vrsta_racuna_kod_banke";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__KLIJENT_DRUGE_BANKE = "klijent_druge_banke";
	public static String JB_GR_KREDITNI_ZAHTJEV_OSOBA__VRSTA_RACUNA_KOD_DRUGE_BANKE = "vrsta_racuna_kod_druge_banke";
	//kreditni zahtjev mjesecne obveze
	public static String JB_GR_MJESECNE_OBVEZE__ID_OBVEZE = "id_obveze";
	public static String JB_GR_MJESECNE_OBVEZE__ID_ZAHTJEVA = "id_zahtjeva";
	public static String JB_GR_MJESECNE_OBVEZE__ID_OSOBE = "id_osobe";
	public static String JB_GR_MJESECNE_OBVEZE__VRSTA_OBVEZE = "vrsta_obveze";
	public static String JB_GR_MJESECNE_OBVEZE__BANKA = "banka";
	public static String JB_GR_MJESECNE_OBVEZE__UKUPNI_IZNOS = "ukupni_iznos";
	public static String JB_GR_MJESECNE_OBVEZE__ROK = "rok";
	public static String JB_GR_MJESECNE_OBVEZE__MJESECNI_IZNOS = "mjesecni_iznos";
	public static String JB_GR_MJESECNE_OBVEZE__DATUM_POCETKA = "datum_pocetka";
	//kreditni zahtjev prihodi clanova
	public static String JB_GR_PRIHODI_CLANOVA__ID_PRIHODA = "id_prihoda";
	public static String JB_GR_PRIHODI_CLANOVA__ID_ZAHTJEVA = "id_zahtjeva";
	public static String JB_GR_PRIHODI_CLANOVA__ID_OSOBE = "id_osobe";
	public static String JB_GR_PRIHODI_CLANOVA__IME = "ime";
	public static String JB_GR_PRIHODI_CLANOVA__PREZIME = "prezime";
	public static String JB_GR_PRIHODI_CLANOVA__JMBG = "jmbg";
	public static String JB_GR_PRIHODI_CLANOVA__SRODSTVO = "srodstvo";
	public static String JB_GR_PRIHODI_CLANOVA__IZNOS_PRIHODA = "iznos_prihoda";
	//kreditni program
	public static String JB_KREDITNI_PROGRAM__ID_KREDITNOG_PROGRAMA = "id_kreditnog_programa";
	public static String JB_KREDITNI_PROGRAM__SIFRA_GRUPE = "sifra_grupe";
	public static String JB_KREDITNI_PROGRAM__BROJ_PARTIJE = "broj_partije";
	public static String JB_KREDITNI_PROGRAM__DATUM_UNOSA = "datum_unosa";
	public static String JB_KREDITNI_PROGRAM__KAMATNA_STOPA = "kamatna_stopa";
	//datum stanja (za izvješće)
	public static String JB_KREDITNI_PROGRAM__DATUM_STANJA = "datum_stanja";
	//otplatni plan
	//public static String BI_OTPLATNI_PLAN__BROJ_PARTIJE = "broj_partije";
	public static String BI_OTPLATNI_PLAN__IZNOS_KREDITA = "iznos_kredita";
	public static String BI_OTPLATNI_PLAN__KAMATNA_STOPA = "kamatna_stopa";
	public static String BI_OTPLATNI_PLAN__RATA_KREDITA = "rata_kredita";
	public static String BI_OTPLATNI_PLAN__BROJ_MJESECI_KAMATE = "broj_mjeseci_kamate";
	public static String BI_OTPLATNI_PLAN__BROJ_MJESECI_RATE = "broj_mjeseci_rate";
	public static String BI_OTPLATNI_PLAN__POCETAK_KORISTENJA = "pocetak_koristenja";
	public static String BI_OTPLATNI_PLAN__PRVI_OBRACUN_KAMATE = "prvi_obracun_kamate";	
	public static String BI_OTPLATNI_PLAN__DOSPIJECE_PRVE_RATE = "dospijece_prve_rate";	
	
	private JBDataDictionary() {
	    _properties = new Properties();
	}
	public static synchronized JBDataDictionary getInstance () {
		if (_instance==null)
			_instance=new JBDataDictionary();
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
