package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;
public class CmdbDjelatnikVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
    /* </ Attribute names */ 
    public static String CMDB_DJELATNIK__ID_DJELATNIKA = "id_djelatnika";
    public static String CMDB_DJELATNIK__OZNAKA_RADNIKA = "oznaka_radnika";
    public static String CMDB_DJELATNIK__BSA_KORISNIK = "bsa_korisnik";
    public static String CMDB_DJELATNIK__BSA_LOKALNA_STANICA = "bsa_lokalna_stanica";
    public static String CMDB_DJELATNIK__IME = "ime";
    public static String CMDB_DJELATNIK__PREZIME = "prezime";
    public static String CMDB_DJELATNIK__EMAIL = "email";
    public static String CMDB_DJELATNIK__JMBG = "jmbg";
    public static String CMDB_DJELATNIK__OIB = "oib";
    public static String CMDB_DJELATNIK__ORG_JEDINICA_FUNKCIJE = "org_jedinica_funkcije";
    public static String CMDB_DJELATNIK__ORG_JEDINICA_RADA = "org_jedinica_rada";
    public static String CMDB_DJELATNIK__GENERIRANI_BROJ = "generirani_broj";
    public static String CMDB_DJELATNIK__ULICA = "ulica";
    public static String CMDB_DJELATNIK__POSTANSKI_BROJ = "postanski_broj";
    public static String CMDB_DJELATNIK__MJESTO = "mjesto";
    public static String CMDB_DJELATNIK__DATUM_RODENJA = "datum_rodenja";
    public static String CMDB_DJELATNIK__STUPANJ_STRUCNE_SPREME = "stupanj_strucne_spreme";
    public static String CMDB_DJELATNIK__OPIS_STRUCNE_SPREME = "opis_strucne_spreme";
    public static String CMDB_DJELATNIK__DATUM_ZAPOSLENJA = "datum_zaposlenja";
    public static String CMDB_DJELATNIK__BROJ_GODINA_RADA = "broj_godina_rada";
    public static String CMDB_DJELATNIK__STATUS = "status";
    public static String CMDB_DJELATNIK__ISPRAVNO = "ispravno";
    public static String CMDB_DJELATNIK__STVARNO_RADNO_MJESTO = "stvarno_radno_mjesto";
    public static String CMDB_DJELATNIK__UGOVORNO_RADNO_MJESTO = "ugovorno_radno_mjesto";
    public static String CMDB_DJELATNIK__STVARNO_MJESTO = "stvarno_mjesto";
    public static String CMDB_DJELATNIK__UGOVORNO_MJESTO = "ugovorno_mjesto";
    public static String CMDB_DJELATNIK__NAZIV_LOKACIJE = "naziv_lokacije";
    public static String CMDB_DJELATNIK__RADNI_STAZ = "radni_staz";
    public static String CMDB_DJELATNIK__NADREDENI_RADNIK = "nadredeni_radnik";
    public static String CMDB_DJELATNIK__TELEFON_KUCI = "telefon_kuci";
    public static String CMDB_DJELATNIK__MOBITEL = "mobitel";
    public static String CMDB_DJELATNIK__TELEFON_POSAO = "telefon_posao";
    public static String CMDB_DJELATNIK__FAX_POSAO = "fax_posao";
    public static String CMDB_DJELATNIK__DATUM_ODLASKA = "datum_odlaska";
    public static String CMDB_DJELATNIK__RAZLOG_ODLASKA = "razlog_odlaska";
    public static String CMDB_DJELATNIK__RADNIK_ZAMJENE = "radnik_zamjene";
    public static String CMDB_DJELATNIK__ID_LOKACIJE = "id_lokacije";
    public static String CMDB_DJELATNIK__SPOL = "spol";
    //NOVO iz baze placa
    public static String CMDB_DJELATNIK__OSOBNI_BROJ_MIO = "osobni_broj_mio";
    public static String CMDB_DJELATNIK__OZNAKA_MATICNE_EVIDENCIJE = "oznaka_maticne_evidencije";
    public static String CMDB_DJELATNIK__RS_SIFRA_OPCINE_RADA = "rs_sifra_opcine_rada";
    public static String CMDB_DJELATNIK__GRUPA = "grupa";
    /* Attributes names /> */
    /* </ Constructors */
    public CmdbDjelatnikVo() {
        super();
    }
    public CmdbDjelatnikVo(AS2Record value) {
        super(value);
    }
    /* Constructors /> */
    /* </ Getters/Setters */  
    public String getIdDjelatnika() {
    	return getAsString(CMDB_DJELATNIK__ID_DJELATNIKA);
    }
    public String getOznakaRadnika() {
    	return getAsString(CMDB_DJELATNIK__OZNAKA_RADNIKA);
    }
    public String getBsaKorisnik() {
    	return getAsString(CMDB_DJELATNIK__BSA_KORISNIK);
    }
    public String getBsaLokalnaStanica() {
    	return getAsString(CMDB_DJELATNIK__BSA_LOKALNA_STANICA);
    }
    public String getIme() {
    	return getAsString(CMDB_DJELATNIK__IME);
    }
    public String getPrezime() {
    	return getAsString(CMDB_DJELATNIK__PREZIME);
    }
    public String getEmail() {
    	return getAsString(CMDB_DJELATNIK__EMAIL);
    }
    public String getJmbg() {
    	return getAsString(CMDB_DJELATNIK__JMBG);
    }
    public String getOib() {
    	return getAsString(CMDB_DJELATNIK__OIB);
    }
    public String getOrgJedinicaFunkcije() {
    	return getAsString(CMDB_DJELATNIK__ORG_JEDINICA_FUNKCIJE);
    }
    public String getOrgJedinicaRada() {
    	return getAsString(CMDB_DJELATNIK__ORG_JEDINICA_RADA);
    }
    public String getGeneriraniBroj() {
    	return getAsString(CMDB_DJELATNIK__GENERIRANI_BROJ);
    }
    public String getUlica() {
    	return getAsString(CMDB_DJELATNIK__ULICA);
    }
    public String getPostanskiBroj() {
    	return getAsString(CMDB_DJELATNIK__POSTANSKI_BROJ);
    }
    public String getMjesto() {
    	return getAsString(CMDB_DJELATNIK__MJESTO);
    }
    public Calendar getDatumRodenja() {
    	return getAsCalendar(CMDB_DJELATNIK__DATUM_RODENJA);
    }
    public String getStupanjStrucneSpreme() {
    	return getAsString(CMDB_DJELATNIK__STUPANJ_STRUCNE_SPREME);
    }
    public String getOpisStrucneSpreme() {
    	return getAsString(CMDB_DJELATNIK__OPIS_STRUCNE_SPREME);
    }
    public Calendar getDatumZaposlenja() {
    	return getAsCalendar(CMDB_DJELATNIK__DATUM_ZAPOSLENJA);
    }
    public String getBrojGodinaRada() {
    	return getAsString(CMDB_DJELATNIK__BROJ_GODINA_RADA);
    }
    public String getStatus() {
    	return getAsString(CMDB_DJELATNIK__STATUS);
    }
    public String getIspravno() {
    	return getAsString(CMDB_DJELATNIK__ISPRAVNO);
    }
    public String getStvarnoRadnoMjesto() {
    	return getAsString(CMDB_DJELATNIK__STVARNO_RADNO_MJESTO);
    }
    public String getUgovornoRadnoMjesto() {
    	return getAsString(CMDB_DJELATNIK__UGOVORNO_RADNO_MJESTO);
    }
    public String getStvarnoMjesto() {
    	return getAsString(CMDB_DJELATNIK__STVARNO_MJESTO);
    }
    public String getUgovornoMjesto() {
    	return getAsString(CMDB_DJELATNIK__UGOVORNO_MJESTO);
    }
    public String getNazivLokacije() {
    	return getAsString(CMDB_DJELATNIK__NAZIV_LOKACIJE);
    }
    public String getRadniStaz() {
    	return getAsString(CMDB_DJELATNIK__RADNI_STAZ);
    }
    public String getNadredeniRadnik() {
    	return getAsString(CMDB_DJELATNIK__NADREDENI_RADNIK);
    }
    public String getTelefonKuci() {
    	return getAsString(CMDB_DJELATNIK__TELEFON_KUCI);
    }
    public String getMobitel() {
    	return getAsString(CMDB_DJELATNIK__MOBITEL);
    }
    public String getTelefonPosao() {
    	return getAsString(CMDB_DJELATNIK__TELEFON_POSAO);
    }
    public String getFaxPosao() {
    	return getAsString(CMDB_DJELATNIK__FAX_POSAO);
    }
    public Calendar getDatumOdlaska() {
    	return getAsCalendar(CMDB_DJELATNIK__DATUM_ODLASKA);
    }
    public String getRazlogOdlaska() {
    	return getAsString(CMDB_DJELATNIK__RAZLOG_ODLASKA);
    }
    public String getRadnikZamjene() {
    	return getAsString(CMDB_DJELATNIK__RADNIK_ZAMJENE);
    }
    public String getIdLokacije() {
    	return getAsString(CMDB_DJELATNIK__ID_LOKACIJE);
    }
    public String getSpol() {
    	return getAsString(CMDB_DJELATNIK__SPOL);
    }
    public String getOsobniBrojMio() {
    	return getAsString(CMDB_DJELATNIK__OSOBNI_BROJ_MIO);
    }
    public String getOznakaMaticneEvidencije() {
    	return getAsString(CMDB_DJELATNIK__OZNAKA_MATICNE_EVIDENCIJE);
    }
    public String getRsSifraOpcineRada() {
    	return getAsString(CMDB_DJELATNIK__RS_SIFRA_OPCINE_RADA);
    }
    public String getGrupa() {
    	return getAsString(CMDB_DJELATNIK__GRUPA);
    }
    public void setIdDjelatnika(String value) {
    	set(CMDB_DJELATNIK__ID_DJELATNIKA, value);
    }
    public void setOznakaRadnika(String value) {
    	set(CMDB_DJELATNIK__OZNAKA_RADNIKA, value);
    }
    public void setBsaKorisnik(String value) {
    	set(CMDB_DJELATNIK__BSA_KORISNIK, value);
    }
    public void setBsaLokalnaStanica(String value) {
    	set(CMDB_DJELATNIK__BSA_LOKALNA_STANICA, value);
    }
    public void setIme(String value) {
    	set(CMDB_DJELATNIK__IME, value);
    }
    public void setPrezime(String value) {
    	set(CMDB_DJELATNIK__PREZIME, value);
    }
    public void setEmail(String value) {
    	set(CMDB_DJELATNIK__EMAIL, value);
    }
    public void setJmbg(String value) {
    	set(CMDB_DJELATNIK__JMBG, value);
    }
    public void setOib(String value) {
    	set(CMDB_DJELATNIK__OIB, value);
    }
    public void setOrgJedinicaFunkcije(String value) {
    	set(CMDB_DJELATNIK__ORG_JEDINICA_FUNKCIJE, value);
    }
    public void setOrgJedinicaRada(String value) {
    	set(CMDB_DJELATNIK__ORG_JEDINICA_RADA, value);
    }
    public void setGeneriraniBroj(String value) {
    	set(CMDB_DJELATNIK__GENERIRANI_BROJ, value);
    }
    public void setUlica(String value) {
    	set(CMDB_DJELATNIK__ULICA, value);
    }
    public void setPostanskiBroj(String value) {
    	set(CMDB_DJELATNIK__POSTANSKI_BROJ, value);
    }
    public void setMjesto(String value) {
    	set(CMDB_DJELATNIK__MJESTO, value);
    }
    public void setDatumRodenja(Calendar value) {
    	setCalendarAsDateString(value, CMDB_DJELATNIK__DATUM_RODENJA);
    }
    public void setStupanjStrucneSpreme(String value) {
    	set(CMDB_DJELATNIK__STUPANJ_STRUCNE_SPREME, value);
    }
    public void setOpisStrucneSpreme(String value) {
    	set(CMDB_DJELATNIK__OPIS_STRUCNE_SPREME, value);
    }
    public void setDatumZaposlenja(Calendar value) {
    	setCalendarAsDateString(value, CMDB_DJELATNIK__DATUM_ZAPOSLENJA);
    }
    public void setBrojGodinaRada(String value) {
    	set(CMDB_DJELATNIK__BROJ_GODINA_RADA, value);
    }
    public void setStatus(String value) {
    	set(CMDB_DJELATNIK__STATUS, value);
    }
    public void setIspravno(String value) {
    	set(CMDB_DJELATNIK__ISPRAVNO, value);
    }
    public void setStvarnoRadnoMjesto(String value) {
    	set(CMDB_DJELATNIK__STVARNO_RADNO_MJESTO, value);
    }
    public void setUgovornoRadnoMjesto(String value) {
    	set(CMDB_DJELATNIK__UGOVORNO_RADNO_MJESTO, value);
    }
    public void setStvarnoMjesto(String value) {
    	set(CMDB_DJELATNIK__STVARNO_MJESTO, value);
    }
    public void setUgovornoMjesto(String value) {
    	set(CMDB_DJELATNIK__UGOVORNO_MJESTO, value);
    }
    public void setNazivLokacije(String value) {
    	set(CMDB_DJELATNIK__NAZIV_LOKACIJE, value);
    }
    public void setRadniStaz(String value) {
    	set(CMDB_DJELATNIK__RADNI_STAZ, value);
    }
    public void setNadredeniRadnik(String value) {
    	set(CMDB_DJELATNIK__NADREDENI_RADNIK, value);
    }
    public void setTelefonKuci(String value) {
    	set(CMDB_DJELATNIK__TELEFON_KUCI, value);
    }
    public void setMobitel(String value) {
    	set(CMDB_DJELATNIK__MOBITEL, value);
    }
    public void setTelefonPosao(String value) {
    	set(CMDB_DJELATNIK__TELEFON_POSAO, value);
    }
    public void setFaxPosao(String value) {
    	set(CMDB_DJELATNIK__FAX_POSAO, value);
    }
    public void setDatumOdlaska(Calendar value) {
    	setCalendarAsDateString(value, CMDB_DJELATNIK__DATUM_ODLASKA);
    }
    public void setRazlogOdlaska(String value) {
    	set(CMDB_DJELATNIK__RAZLOG_ODLASKA, value);
    }
    public void setRadnikZamjene(String value) {
    	set(CMDB_DJELATNIK__RADNIK_ZAMJENE, value);
    }
    public void setIdLokacije(String value) {
    	set(CMDB_DJELATNIK__ID_LOKACIJE, value);
    }
    public void setSpol(String value) {
    	set(CMDB_DJELATNIK__SPOL, value);
    }
    public void setOsobniBrojMio(String value) {
    	set(CMDB_DJELATNIK__OSOBNI_BROJ_MIO, value);
    }
    public void setOznakaMaticneEvidencije(String value) {
    	set(CMDB_DJELATNIK__OZNAKA_MATICNE_EVIDENCIJE, value);
    }
    public void setRsSifraOpcineRada(String value) {
    	set(CMDB_DJELATNIK__RS_SIFRA_OPCINE_RADA, value);
    }
    public void setGrupa(String value) {
    	set(CMDB_DJELATNIK__GRUPA, value);
    }
    /* Getters/Setters /> */
}