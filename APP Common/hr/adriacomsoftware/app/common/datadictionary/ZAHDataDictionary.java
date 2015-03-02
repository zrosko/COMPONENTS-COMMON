package hr.adriacomsoftware.app.common.datadictionary;

import java.util.Properties;

public final class ZAHDataDictionary {    
	private static ZAHDataDictionary _instance = null;
	public Properties _properties;
	//zahtjev (status)
	public static String PO_ZAH_ZAHTJEV__OPIS = "opis";
	public static String PO_ZAH_STATUS_ZAHTJEVA__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_STATUS_ZAHTJEVA__STATUS_ZAHTJEVA = "status_zahtjeva";
	public static String PO_ZAH_STATUS_ZAHTJEVA__DATUM_PROMJENE = "datum_promjene";
	public static String PO_ZAH_STATUS_ZAHTJEVA__OPERATER = "operater";
	public static String PO_ZAH_STATUS_ZAHTJEVA__EMAIL = "email";
	public static String PO_ZAH_STATUS_ZAHTJEVA__PORUKA = "poruka";
	public static String PO_ZAH_STATUS_ZAHTJEVA__OBRAZLOZENJE = "obrazlozenje";
	public static String PO_ZAH_ZAHTJEV__STATUS_ZAHTJEVA_NAZIV = "status_zahtjeva_naziv";
	//zahtjev
	public static String PO_ZAH_ZAHTJEV__HITNOST = "hitnost";
	public static String PO_ZAH_ZAHTJEV__EMAIL_DJELATNIKA = "email_djelatnika";
	public static String PO_ZAH_ZAHTJEV__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_ZAHTJEV__VRSTA_ZAHTJEVA = "vrsta_zahtjeva";
	public static String PO_ZAH_ZAHTJEV__BSA_BROJ_ZAHTJEVA = "bsa_broj_zahtjeva";
	public static String PO_ZAH_ZAHTJEV__BSA_OPERATER = "bsa_operater";
	public static String PO_ZAH_ZAHTJEV__NAPOMENA = "napomena";
	public static String PO_ZAH_ZAHTJEV__BROJ_ZAHTJEVA_VEZA = "broj_zahtjeva_veza";
	public static String PO_ZAH_ZAHTJEV__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String PO_ZAH_ZAHTJEV__DATUM_ZAPRIMANJA = "datum_zaprimanja";
	public static String PO_ZAH_ZAHTJEV__ZAPRIMATELJ = "zaprimatelj";
	public static String PO_ZAH_ZAHTJEV__ODOBRAVA = "odobrava";
	public static String PO_ZAH_ZAHTJEV__OBRADA = "obrada";
	public static String PO_ZAH_ZAHTJEV__DATUM_OBRADE = "datum_obrade";
	public static String PO_ZAH_ZAHTJEV__DATUM_PROCJENE_RIZIKA = "datum_procjene_rizika";
	public static String PO_ZAH_ZAHTJEV__DATUM_ZAPRIMANJA_PROCJENE_RIZIKA = "datum_zaprimanja_procjene_rizika";
	public static String PO_ZAH_ZAHTJEV__PROCJENA_RIZIKA = "procjena_rizika";
	public static String PO_ZAH_ZAHTJEV__ZAKLJUCAK_POZITIVNO = "zakljucak_pozitivno";
	public static String PO_ZAH_ZAHTJEV__ZAKLJUCAK_NEGATIVNO = "zakljucak_negativno";
	public static String PO_ZAH_ZAHTJEV__ZAKLJUCAK_PREPORUKA = "zakljucak_preporuka";
	public static String PO_ZAH_ZAHTJEV__PRIJEDLOG_ODLUKE = "prijedlog_odluke";
	public static String PO_ZAH_ZAHTJEV__OPERATER_UNOSA = "operater_unosa";
	public static String PO_ZAH_ZAHTJEV__OPERATER_PROMJENE = "operater_promjene";
	public static String PO_ZAH_ZAHTJEV__DATUM_UNOSA = "datum_unosa";
	public static String PO_ZAH_ZAHTJEV__DATUM_PROMJENE = "datum_promjene";
	public static String PO_ZAH_ZAHTJEV__STATUS_ZAHTJEVA = "status_zahtjeva";
	public static String PO_ZAH_ZAHTJEV__REFERENT = "referent";
	public static String PO_ZAH_ZAHTJEV__SEF_SLUZBE = "sef_sluzbe";
	public static String PO_ZAH_ZAHTJEV__ZAMJENIK_DIREKTORA_DIREKCIJE = "zamjenik_direktora_direkcije";
	public static String PO_ZAH_ZAHTJEV__DIREKTOR_DIREKCIJE = "direktor_direkcije";
	public static String PO_ZAH_ZAHTJEV__ISPRAVNO = "ispravno";
	public static String PO_ZAH_ZAHTJEV__OPCIJE_ISPISA = "opcije_ispisa";
	//podaci klijenta
	public static String PO_ZAH_PODACI_KLIJENTA__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_PODACI_KLIJENTA__KOMENTAR_POSLOVNOG_ODNOSA = "komentar_poslovnog_odnosa";
	public static String PO_ZAH_PODACI_KLIJENTA__MATICNI_BROJ = "maticni_broj";
	public static String PO_ZAH_PODACI_KLIJENTA__OIB = "oib";
	public static String PO_ZAH_PODACI_KLIJENTA__NAZIV = "naziv";
	public static String PO_ZAH_PODACI_KLIJENTA__ULICA = "ulica";
	public static String PO_ZAH_PODACI_KLIJENTA__POSTANSKI_BROJ = "postanski_broj";
	public static String PO_ZAH_PODACI_KLIJENTA__MJESTO = "mjesto";
	public static String PO_ZAH_PODACI_KLIJENTA__SIFRA_ZUPANIJE = "sifra_zupanije";
	public static String PO_ZAH_PODACI_KLIJENTA__KONTAKT_OSOBA = "kontakt_osoba";
	public static String PO_ZAH_PODACI_KLIJENTA__EMAIL = "email";
	public static String PO_ZAH_PODACI_KLIJENTA__TELEFON = "telefon";
	public static String PO_ZAH_PODACI_KLIJENTA__FAX = "fax";
	public static String PO_ZAH_PODACI_KLIJENTA__GODINA_POCETKA_POSLOVANJA = "godina_pocetka_poslovanja";
	public static String PO_ZAH_PODACI_KLIJENTA__OBLIK_VLASNISTVA = "oblik_vlasnistva";
	public static String PO_ZAH_PODACI_KLIJENTA__PRAVNI_STATUS = "pravni_status";
	public static String PO_ZAH_PODACI_KLIJENTA__TEMELJNI_KAPITAL = "temeljni_kapital";
	public static String PO_ZAH_PODACI_KLIJENTA__VELICINA_PODUZECA = "velicina_poduzeca";
	public static String PO_ZAH_PODACI_KLIJENTA__SIFRA_DJELATNOSTI = "sifra_djelatnosti";
	public static String PO_ZAH_PODACI_KLIJENTA__NAZIV_DJELATNOSTI = "naziv_djelatnosti";
	public static String PO_ZAH_PODACI_KLIJENTA__VRSTA_DJELATNOSTI = "vrsta_djelatnosti";
	public static String PO_ZAH_PODACI_KLIJENTA__OSTALE_DJELATNOSTI = "ostale_djelatnosti";
	public static String PO_ZAH_PODACI_KLIJENTA__OPIS_DJELATNOSTI = "opis_djelatnosti";
	public static String PO_ZAH_PODACI_KLIJENTA__BROJ_ZAPOSLENIH = "broj_zaposlenih";
	public static String PO_ZAH_PODACI_KLIJENTA__BROJ_ZAPOSLENIH_SEZONA = "broj_zaposlenih_sezona";
	public static String PO_ZAH_PODACI_KLIJENTA__KALSIFIKACIJA_ZAPOSLENIH = "kalsifikacija_zaposlenih";
	public static String PO_ZAH_PODACI_KLIJENTA__GLAVNA_BANKA = "glavna_banka";
	public static String PO_ZAH_PODACI_KLIJENTA__OSTALE_BANKE = "ostale_banke";
	public static String PO_ZAH_PODACI_KLIJENTA__OPIS_IMOVINE = "opis_imovine";
	public static String PO_ZAH_PODACI_KLIJENTA__OPIS_POSLOVNIH_AKTIVNOSTI = "opis_poslovnih_aktivnosti";
	public static String PO_ZAH_PODACI_KLIJENTA__KOMENTAR_FINANCIJSKE_ANALIZE = "komentar_financijske_analize";
	public static String PO_ZAH_PODACI_KLIJENTA__KOMENTAR_KUPACA = "komentar_kupaca";
	public static String PO_ZAH_PODACI_KLIJENTA__KOMENTAR_DOBAVLJACA = "komentar_dobavljaca";
	public static String PO_ZAH_PODACI_KLIJENTA__KOMENTAR_OSIGURANJA = "komentar_osiguranja";
	public static String PO_ZAH_PODACI_KLIJENTA__SWOT_SNAGE = "swot_snage";
	public static String PO_ZAH_PODACI_KLIJENTA__SWOT_SLABOSTI = "swot_slabosti";
	public static String PO_ZAH_PODACI_KLIJENTA__SWOT_PRILIKE = "swot_prilike";
	public static String PO_ZAH_PODACI_KLIJENTA__SWOT_PRIJETNJE = "swot_prijetnje";
	//bankarski proizvod
	public static String PO_ZAH_BANKARSKI_PROIZVOD__ID_BANKARSKOG_PROIZVODA = "id_bankarskog_proizvoda";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TIP_ZAHTJEVA = "tip_zahtjeva";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_VRSTA_PROIZVODA = "trazena_vrsta_proizvoda";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_IZNOS_PROIZVODA = "trazeni_iznos_proizvoda";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_SIFRA_VALUTE = "trazena_sifra_valute";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_KAMATNA_STOPA = "trazena_kamatna_stopa";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_VRSTA_KAMATE = "trazena_vrsta_kamate";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENA_VALUTNA_KLAUZULA = "trazena_valutna_klauzula";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_ROK_OTPLATE = "trazeni_rok_otplate";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_POCEK = "trazeni_pocek";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_ROK_KORISTENJA = "trazeni_rok_koristenja";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_NACIN_OTPLATE = "trazeni_nacin_otplate";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__OPIS_NAMJENE = "opis_namjene";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__IZVOR_OTPLATE = "izvor_otplate";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__OBRAZLOZENJE = "obrazlozenje";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__VRSTA_PROIZVODA = "vrsta_proizvoda";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__PREPORUKA = "preporuka";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__PROGRAM = "program";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__TRAZENI_PROGRAM = "trazeni_program";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__KAMATNA_STOPA = "kamatna_stopa";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__VRSTA_KAMATE = "vrsta_kamate";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__ROK_OTPLATE = "rok_otplate";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__POCEK = "pocek";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__IZNOS_PLASMANA = "iznos_plasmana";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__VALUTA_PLASMANA = "valuta_plasmana";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__VALUTNA_KLAUZULA = "valutna_klauzula";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__MJESECNA_RATA = "mjesecna_rata";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__IZNOS_NAKNADE = "iznos_naknade";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__KORISTENJE = "koristenje";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__INTERKALARNA_KAMATA = "interkalarna_kamata";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__ZATEZNA_KAMATA = "zatezna_kamata";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__DOSPIJECE_PRVE_RATE = "dospijece_prve_rate";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__DOSPIJECE_ZADNJE_RATE = "dospijece_zadnje_rate";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__PRIJEVREMENA_OTPLATA = "prijevremena_otplata";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__NACIN_OTPLATE = "nacin_otplate";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__POSEBNI_UVJETI = "posebni_uvjeti";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__BROJ_ODLUKE = "broj_odluke";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__DATUM_ODLUKE = "datum_odluke";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__OPIS_ODLUKE = "opis_odluke";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__BROJ_PARTIJE = "broj_partije";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__STATUS_PROIZVODA = "status_proizvoda";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__STATUS_OBRADE = "status_obrade";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__STATUS_RIZIKA = "status_rizika";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__PRODAVATELJ_MJENICE = "prodavatelj_mjenice";
	//
	public static String PO_ZAH_BANKARSKI_PROIZVOD__UKUPNO_ODOBRENI_IZNOS_PROIZVODA = "ukupno_odobreni_iznos_proizvoda";
	public static String PO_ZAH_BANKARSKI_PROIZVOD__UKUPNO_TRAZENI_IZNOS_PROIZVODA = "ukupno_trazeni_iznos_proizvoda";
	//kolateral ponudeni
	public static String PO_ZAH_KOLATERAL_PONUDENI__ID_KOLATERALA = "id_kolaterala";
	public static String PO_ZAH_KOLATERAL_PONUDENI__ID_KOLATERALA_VEZA = "id_kolaterala_veza";
	public static String PO_ZAH_KOLATERAL_PONUDENI__ID_BANKARSKOG_PROIZVODA = "id_bankarskog_proizvoda";
	public static String PO_ZAH_KOLATERAL_PONUDENI__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_KOLATERAL_PONUDENI__VRSTA = "vrsta";
	public static String PO_ZAH_KOLATERAL_PONUDENI__LOKACIJA = "lokacija";
	public static String PO_ZAH_KOLATERAL_PONUDENI__POVRSINA_OBJEKTA = "povrsina_objekta";
	public static String PO_ZAH_KOLATERAL_PONUDENI__POVRSINA_ZEMLJISTA = "povrsina_zemljista";
	public static String PO_ZAH_KOLATERAL_PONUDENI__VLASNIK = "vlasnik";
	public static String PO_ZAH_KOLATERAL_PONUDENI__PROCJENJENA_VRIJEDNOST = "procjenjena_vrijednost";
	public static String PO_ZAH_KOLATERAL_PONUDENI__PROCJENJENA_VRIJEDNOST_HRK = "procjenjena_vrijednost_hrk";
	public static String PO_ZAH_KOLATERAL_PONUDENI__VALUTA_PROCJENE = "valuta_procjene";
	public static String PO_ZAH_KOLATERAL_PONUDENI__DATUM_PROCJENE = "datum_procjene";
	public static String PO_ZAH_KOLATERAL_PONUDENI__PROCJENITELJ = "procjenitelj";
	public static String PO_ZAH_KOLATERAL_PONUDENI__TERETI = "tereti";
	public static String PO_ZAH_KOLATERAL_PONUDENI__TERETI_HRK = "tereti_hrk";
	public static String PO_ZAH_KOLATERAL_PONUDENI__VALUTA_TERETI = "valuta_tereti";
	public static String PO_ZAH_KOLATERAL_PONUDENI__NAPOMENA = "napomena";
	public static String PO_ZAH_KOLATERAL_PONUDENI__UCITANO = "ucitano";
	//
	public static String PO_ZAH_KOLATERAL_PONUDENI__OMJER_TRAZENI_IZNOS_KOLATERALI = "omjer_trazeni_iznos_kolaterali";
	public static String PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_PROCJENJENA_VRIJEDNOST_HRK = "ukupno_procjenjena_vrijednost_hrk";
	public static String PO_ZAH_KOLATERAL_PONUDENI__UKUPNO_TERETI_HRK = "ukupno_tereti_hrk";
	//poslovni odnos banka
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__ID_POSLOVNOG_ODNOSA = "id_poslovnog_odnosa";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__POCETAK_POSLOVNOG_ODNOSA = "pocetak_poslovnog_odnosa";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_ZIRO_RACUNA = "broj_ziro_racuna";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__POSTOTAK_PROMETA = "postotak_prometa";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_DJELATNIKA_PLACA = "broj_djelatnika_placa";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__DEPOZITI_TRAZITELJA = "depoziti_trazitelja";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__STEDNJA_VLASNIKA = "stednja_vlasnika";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_DIONICA_BANKE = "broj_dionica_banke";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_DIONICA_BANKE_PO = "broj_dionica_banke_po";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__UDIO_VLASNISTVA_BANKE = "udio_vlasnistva_banke";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__JAMSTVENI_KAPITAL = "jamstveni_kapital";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__RIZICNA_SKUPINA = "rizicna_skupina";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__POSEBAN_ODNOS = "poseban_odnos";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__VELIKA_IZLOZENOST = "velika_izlozenost";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__OPIS_POSEBNOG_ODNOSA = "opis_posebnog_odnosa";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__KOMENTAR_POSLOVNOG_ODNOSA = "komentar_poslovnog_odnosa";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__IZLOZENOST_PREMA_JAM_KAPITALU  = "izlozenost_prema_jam_kapitalu";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__IZLOZENOST_PREMA_JAM_KAPITALU_PO  = "izlozenost_prema_jam_kapitalu_po";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI  = "iznos_izlozenosti";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI_PO  = "iznos_izlozenosti_po";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI_NETO  = "iznos_izlozenosti_neto";
	public static String PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI_NETO_PO  = "iznos_izlozenosti_neto_po";
	//zaduženost
	public static String PO_ZAH_ZADUZENOST__ID_ZADUZENOSTI = "id_zaduzenosti";
	public static String PO_ZAH_ZADUZENOST__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_ZADUZENOST__VRSTA_DUGA = "vrsta_duga";
	public static String PO_ZAH_ZADUZENOST__NAZIV_KREDITORA = "naziv_kreditora";
	public static String PO_ZAH_ZADUZENOST__ODOBRENI_IZNOS = "odobreni_iznos";
	public static String PO_ZAH_ZADUZENOST__DATUM_ODOBRENJA = "datum_odobrenja";
	public static String PO_ZAH_ZADUZENOST__ROK_OTPLATE = "rok_otplate";
	public static String PO_ZAH_ZADUZENOST__POCEK = "pocek";
	public static String PO_ZAH_ZADUZENOST__KAMATNA_STOPA = "kamatna_stopa";
	public static String PO_ZAH_ZADUZENOST__MJESECNA_RATA = "mjesecna_rata";
	public static String PO_ZAH_ZADUZENOST__SALDO = "saldo";
	public static String PO_ZAH_ZADUZENOST__OPIS_KOLATERALA = "opis_kolaterala";
	public static String PO_ZAH_ZADUZENOST__VRIJEDNOST_KOLATERALA = "vrijednost_kolaterala";
	public static String PO_ZAH_ZADUZENOST__DATUM_ANALIZE = "datum_analize";
	//
	public static String PO_ZAH_ZADUZENOST__UKUPNO_ZADUZENOST = "ukupno_zaduzenost";
	public static String PO_ZAH_ZADUZENOST__UKUPNO_MJESECNE_RATE = "ukupno_mjesecne_rate";
	public static String PO_ZAH_ZADUZENOST__UKUPNO_SALDO = "ukupno_saldo";
	public static String PO_ZAH_ZADUZENOST__UKUPNO_KOLATERALI = "ukupno_kolaterali";
	public static String PO_ZAH_ZADUZENOST__VALUTNA_KLAUZULA = "valutna_klauzula";
	//bon 2
	public static String PO_ZAH_BON2__ID_BON2 = "id_bon2";
	public static String PO_ZAH_BON2__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_BON2__NAZIV_BANKE = "naziv_banke";
	public static String PO_ZAH_BON2__BROJ_PARTIJE = "broj_partije";
	public static String PO_ZAH_BON2__RAZDOBLJE_OD = "razdoblje_od";
	public static String PO_ZAH_BON2__RAZDOBLJE_DO = "razdoblje_do";
	public static String PO_ZAH_BON2__IZNOS_PRIMITAKA = "iznos_primitaka";
	public static String PO_ZAH_BON2__NEPODMIRENE_OBVEZE = "nepodmirene_obveze";
	public static String PO_ZAH_BON2__IZNOS_PROSJECNOG_STANJA = "iznos_prosjecnog_stanja";
	public static String PO_ZAH_BON2__STANJE_RACUNA = "stanje_racuna";
	public static String PO_ZAH_BON2__BROJ_DANA_BLOKADE = "broj_dana_blokade";
	public static String PO_ZAH_BON2__NEPREKIDNA_BLOKADA = "neprekidna_blokada";
	//broj dana za upit u Bon2
	public static String PO_ZAH_BON2__BROJ_DANA = "broj_dana";
	//
	public static String PO_ZAH_BON2__TRENUTNA_BLOKADA = "trenutna_blokada";
	//povezana osoba
	public static String PO_ZAH_POVEZANA_OSOBA__ID_POVEZANE_OSOBE = "id_povezane_osobe";
	public static String PO_ZAH_POVEZANA_OSOBA__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_POVEZANA_OSOBA__SLOG = "slog";
	public static String PO_ZAH_POVEZANA_OSOBA__TIP_VEZE = "tip_veze";
	public static String PO_ZAH_POVEZANA_OSOBA__NAZIV_VEZE = "naziv_veze";
	public static String PO_ZAH_POVEZANA_OSOBA__JMBG_MB = "jmbg_mb";
	public static String PO_ZAH_POVEZANA_OSOBA__OIB = "oib";
	public static String PO_ZAH_POVEZANA_OSOBA__JMBG_MB_VEZA = "jmbg_mb_veza";
	public static String PO_ZAH_POVEZANA_OSOBA__OIB_VEZA = "oib_veza";
	public static String PO_ZAH_POVEZANA_OSOBA__IME_PREZIME_NAZIV = "ime_prezime_naziv";
	public static String PO_ZAH_POVEZANA_OSOBA__FUNKCIJA = "funkcija";
	public static String PO_ZAH_POVEZANA_OSOBA__STRUCNA_SPREMA = "strucna_sprema";
	public static String PO_ZAH_POVEZANA_OSOBA__ZVANJE = "zvanje";
	public static String PO_ZAH_POVEZANA_OSOBA__POSTOTAK_UDJELA = "postotak_udjela";
	public static String PO_ZAH_POVEZANA_OSOBA__IZNOS_ZADUZENOSTI = "iznos_zaduzenosti";
	public static String PO_ZAH_POVEZANA_OSOBA__IZNOS_IZLOZENOSTI = "iznos_izlozenosti";
	public static String PO_ZAH_POVEZANA_OSOBA__VLASNIK = "vlasnik";
	public static String PO_ZAH_POVEZANA_OSOBA__ODNOS = "odnos";
	public static String PO_ZAH_POVEZANA_OSOBA__UCITANO = "ucitano";//0-unos, 1-bsas, 2-OLTP, 3-zahtjev, 4-PDF
	public static String PO_ZAH_POVEZANA_OSOBA__TEKUCA_GODINA = "tekuca_godina";
	public static String PO_ZAH_POVEZANA_OSOBA__PRETHODNA_GODINA = "prethodna_godina";
	//dodatak
	public static String PO_ZAH_POVEZANA_OSOBA__UKUPNA_ZADUZENOST = "ukupna_zaduzenost";
	public static String PO_ZAH_POVEZANA_OSOBA__UKUPNA_IZLOZENOST = "ukupna_izlozenost";
	public static String PO_ZAH_POVEZANA_OSOBA__SVEUKUPNA_IZLOZENOST = "sveukupna_izlozenost";
	public static String PO_ZAH_POVEZANA_OSOBA__SVEUKUPNA_IZLOZENOST_ZAHTJEVA= "sveukupna_izlozenost_zahtjeva";
	public static String PO_ZAH_POVEZANA_OSOBA__UKUPNA_IZLOZENOST_JAMSTVENI = "ukupna_izlozenost_jamstveni";
	public static String PO_ZAH_POVEZANA_OSOBA__UKUPNA_IZLOZENOST_JAMSTVENI_ZAHTJEVA = "ukupna_izlozenost_jamstveni_zahtjeva";
	//dobavljac
//	public static String PO_ZAH_DOBAVLJAC__ID_DOBAVLJACA = "id_dobavljaca";
//	public static String PO_ZAH_DOBAVLJAC__BROJ_ZAHTJEVA = "broj_zahtjeva";
//	public static String PO_ZAH_DOBAVLJAC__NAZIV = "naziv";
//	public static String PO_ZAH_DOBAVLJAC__STRANI = "strani";
//	public static String PO_ZAH_DOBAVLJAC__SALDO = "saldo";
//	public static String PO_ZAH_DOBAVLJAC__DOSPJELE_OBVEZE = "dospjele_obveze";
//	public static String PO_ZAH_DOBAVLJAC__UKUPAN_PROMET = "ukupan_promet";
//	public static String PO_ZAH_DOBAVLJAC__SSP_OBVEZE = "ssp_obveze";
//	//kupac
//	public static String PO_ZAH_KUPAC__ID_KUPCA = "id_kupca";
//	public static String PO_ZAH_KUPAC__BROJ_ZAHTJEVA = "broj_zahtjeva";
//	public static String PO_ZAH_KUPAC__NAZIV = "naziv";
//	public static String PO_ZAH_KUPAC__STRANI = "strani";
//	public static String PO_ZAH_KUPAC__SALDO = "saldo";
//	public static String PO_ZAH_KUPAC__DOSPJELA_POTRAZIVANJA = "dospjela_potrazivanja";
//	public static String PO_ZAH_KUPAC__UKUPAN_PROMET = "ukupan_promet";
//	public static String PO_ZAH_KUPAC__SSP_POTRAZIVANJA = "ssp_potrazivanja";
	//kratkorocni plan
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_PRIHODI_A = "ukupno_poslovni_prihodiA";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_PRIHODI_B = "ukupno_poslovni_prihodiB";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_RASHODI_A = "ukupno_poslovni_rashodiA";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_POSLOVNI_RASHODI_B = "ukupno_poslovni_rashodiB";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_OPRATIVNA_DOBIT_GUBITAK_A = "ukupno_operativna_dobit_gubitakA";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_OPERATIVA_DOBIT_GUBITAK_B = "ukupno_operativna_dobit_gubitakB";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_PRIHODI_A = "ukupno_prihodiA";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_PRIHODI_B = "ukupno_prihodiB";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_RASHODI_A = "ukupno_rashodiA";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_RASHODI_B = "ukupno_rashodiB";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_BRUTO_DOBIT_GUBITAK_A = "ukupno_bruto_dobit_gubitakA";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_BRUTO_DOBIT_GUBITAK_B = "ukupno_bruto_dobit_gubitakB";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_NETO_DOBIT_GUBITAK_A = "ukupno_neto_dobit_gubitakA";
	public static String PO_ZAH_KRATKOROCNI_PLAN__UKUPNO_NETO_DOBIT_GUBITAK_B = "ukupno_neto_dobit_gubitakB";
	//izvedenice kraj
	public static String PO_ZAH_KRATKOROCNI_PLAN__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHOD_PROIZVODA = "tekuci_prihod_proizvoda";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHOD_PROIZVODA = "buduci_prihod_proizvoda";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHOD_USLUGA = "tekuci_prihod_usluga";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHOD_USLUGA = "buduci_prihod_usluga";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_MATERIJALNI = "tekuci_rashodi_materijalni";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_MATERIJALNI = "buduci_rashodi_materijalni";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_NAJAM = "tekuci_rashodi_najam";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_NAJAM = "buduci_rashodi_najam";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_PLACE = "tekuci_rashodi_place";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_PLACE = "buduci_rashodi_place";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_AMORTIZACIJA = "tekuci_rashodi_amortizacija";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_AMORTIZACIJA = "buduci_rashodi_amortizacija";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_OSTALI = "tekuci_rashodi_ostali";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_OSTALI = "buduci_rashodi_ostali";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHODI_FINANCIJSKI = "tekuci_prihodi_financijski";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHODI_FINANCIJSKI = "buduci_prihodi_financijski";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_FINANCIJSKI = "tekuci_rashodi_financijski";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_FINANCIJSKI = "buduci_rashodi_financijski";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_PRIHODI_IZVANREDNI = "tekuci_prihodi_izvanredni";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_PRIHODI_IZVANREDNI = "buduci_prihodi_izvanredni";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_RASHODI_IZVANREDNI = "tekuci_rashodi_izvanredni";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_RASHODI_IZVANREDNI = "buduci_rashodi_izvanredni";
	public static String PO_ZAH_KRATKOROCNI_PLAN__TEKUCI_POREZ = "tekuci_porez";
	public static String PO_ZAH_KRATKOROCNI_PLAN__BUDUCI_POREZ = "buduci_porez";
	public static String PO_ZAH_KRATKOROCNI_PLAN__OPIS_PLANA_POSLOVANJA = "opis_plana_poslovanja";
	//zaduzenost kod banke
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__ID_ZADUZENOSTI = "id_zaduzenosti";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__DATUM_ANALIZE = "datum_analize";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_PARTIJE = "broj_partije";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__VRSTA_PROIZVODA = "vrsta_proizvoda";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__PROGRAM = "program";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__NAMJENA = "namjena";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_UGOVORA = "broj_ugovora";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__VALUTNA_KLAUZULA = "valutna_klauzula";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__DATUM_ODOBRAVANJA = "datum_odobravanja";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__DATUM_DOSPIJECA = "datum_dospijeca";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__ODOBRENI_IZNOS = "odobreni_iznos";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__POCEK = "pocek";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__KAMATNA_STOPA = "kamatna_stopa";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__NEDOSPJELA_GLAVNICA = "nedospjela_glavnica";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__NEDOSPJELA_KAMATA = "nedospjela_kamata";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__DOSPJELA_GLAVNICA = "dospjela_glavnica";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__DOSPJELA_KAMATA = "dospjela_kamata";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__MJESECNA_RATA = "mjesecna_rata";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_DANA_KASNJENJA_KAMATE = "broj_dana_kasnjenja_kamate";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_DANA_KASNJENJA_GLAVNICA = "broj_dana_kasnjenja_glavnica";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__ROK_OTPLATE = "rok_otplate";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__JMBG_MB = "jmbg_mb";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNA_ZADUZENOST = "ukupna_zaduzenost";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNA_IZLOZENOST = "ukupna_izlozenost";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__UCITANO = "ucitano";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__TEKUCA_FAZA = "tekuca_faza";
	//
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_ZADUZENOST = "ukupno_zaduzenost";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_MJESECNE_RATE = "ukupno_mjesecne_rate";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_IZLOZENOST = "ukupno_izlozenost";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__VRSTA_DUGA = "vrsta_duga";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__NEISKORISTENI_IZNOS = "neiskoristeni_iznos";
	public static String PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_PLASMANI = "ukupno_plasmani";
	//procjena rizika
	//kolateral zaduzenost
	//banka
	public static String PO_ZAH_BANKA__DATUM_STANJA = "datum_stanja";
	public static String PO_ZAH_BANKA__JAMSTVENI_KAPITAL = "jamstveni_kapital";
	public static String PO_ZAH_BANKA__BROJ_DIONICA = "broj_dionica";
	public static String PO_ZAH_BANKA__CIJENA_DIONICE = "cijena_dionice";
	//VIKR
	public static String PO_ZAH_VIKR__BROJ_ZAHTJEVA = "broj_zahtjeva";
	public static String PO_ZAH_VIKR__SIFRA_VALUTE = "sifra_valute";
	public static String PO_ZAH_VIKR__IZVOZNIK = "izvoznik";
	public static String PO_ZAH_VIKR__ZASTITA = "zastita";
	public static String PO_ZAH_VIKR__POSTOTAK_ZASTITE = "postotak_zastite";
	public static String PO_ZAH_VIKR__UKUPNO_OBVEZE = "ukupno_obveze";
	public static String PO_ZAH_VIKR__NAPOMENA = "napomena";
	//KRAJ
	private ZAHDataDictionary() {
	    _properties = new Properties();
	}
	public static synchronized ZAHDataDictionary getInstance () {
		if (_instance==null)
			_instance=new ZAHDataDictionary();
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
