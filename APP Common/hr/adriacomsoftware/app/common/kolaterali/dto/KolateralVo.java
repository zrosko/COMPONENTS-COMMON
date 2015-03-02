package hr.adriacomsoftware.app.common.kolaterali.dto;

import hr.adriacomsoftware.app.common.datadictionary.KOLDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KolateralVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;

	public KolateralVo() {
		super();
	}

	public KolateralVo(AS2Record value) {
		super(value);
	}

	public String getIdKolaterala() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__ID_KOLATERALA);
	}

	public String getGrupa() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__GRUPA);
	}

	public String getMaticniBrojJmbg() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__MATICNI_BROJ_JMBG);
	}

	public String getOib() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__OIB);
	}

	public Calendar getVrijediOd() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL__VRIJEDI_OD);
	}

	public Calendar getVrijediDo() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL__VRIJEDI_DO);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__NAZIV);
	}

	public String getKolicina() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__KOLICINA);
	}

	public String getVrsta() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__VRSTA);
	}

	public String getSifraKolaterala() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__SIFRA_KOLATERALA);
	}

	public String getVlasnik() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__VLASNIK);
	}

	public String getLokacija() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__LOKACIJA);
	}

	public String getPovrsinaObjekta() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__POVRSINA_OBJEKTA);
	}

	public String getPovrsinaZemljista() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__POVRSINA_ZEMLJISTA);
	}

	public String getCiklusProcjeneDana() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__CIKLUS_PROCJENE_DANA);
	}

	public String getCiklusProcjeneMjeseci() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__CIKLUS_PROCJENE_MJESECI);
	}

	public String getCiklusProcjeneGodina() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__CIKLUS_PROCJENE_GODINA);
	}

	public String getProcjenjenaVrijednost() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__PROCJENJENA_VRIJEDNOST);
	}

	public String getValutaProcjene() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__VALUTA_PROCJENE);
	}

	public Calendar getDatumProcjene() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL__DATUM_PROCJENE);
	}

	public String getProcjenitelj() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__PROCJENITELJ);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__NAPOMENA);
	}

	public String getTereti() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__TERETI);
	}

	public String getValutaTereti() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__VALUTA_TERETI);
	}

	public Calendar getDatumDospijeca() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL__DATUM_DOSPIJECA);
	}

	public String getDepozitKamatnaStopa() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__DEPOZIT_KAMATNA_STOPA);
	}

	public String getDepozitBrojKnjizice() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__DEPOZIT_BROJ_KNJIZICE);
	}

	public String getDioniceTip() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__DIONICE_TIP);
	}

	public String getDioniceOznaka() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__DIONICE_OZNAKA);
	}

	public String getDioniceUdio() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__DIONICE_UDIO);
	}

	public String getDioniceTrzisniIznos() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__DIONICE_TRZISNI_IZNOS);
	}

	public String getDioniceValutaTrzisniIznos() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__DIONICE_VALUTA_TRZISNI_IZNOS);
	}

	public String getGarancijaTip() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__GARANCIJA_TIP);
	}

	public String getJamacImePrezime() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__JAMAC_IME_PREZIME);
	}

	public String getJamacAdresa() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__JAMAC_ADRESA);
	}

	public String getJamacMjesto() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__JAMAC_MJESTO);
	}

	public String getJamacOib() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__JAMAC_OIB);
	}

	public String getJamacMaticniBrojJmbg() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__JAMAC_MATICNI_BROJ_JMBG);
	}

	public String getJamacZaposlenje() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__JAMAC_ZAPOSLENJE);
	}

	public String getMjenicaDuznik() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__MJENICA_DUZNIK);
	}

	public String getKatastarskaCestica() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__KATASTARSKA_CESTICA);
	}

	public String getKatastarskeCesticeDodatak() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__KATASTARSKE_CESTICE_DODATAK);
	}

	public String getKatastarskaOpcina() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__KATASTARSKA_OPCINA);
	}

	public String getBrojZkUloska() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__BROJ_ZK_ULOSKA);
	}

	public String getRegistarskaOznaka() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__REGISTARSKA_OZNAKA);
	}

	public Calendar getDatumProizvodnje() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL__DATUM_PROIZVODNJE);
	}

	public String getUdioPostotak() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__UDIO_POSTOTAK);
	}

	public String getUdioMaticniBroj() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__UDIO_MATICNI_BROJ);
	}

	public Calendar getKoncesijaDatumOdobrenja() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL__KONCESIJA_DATUM_ODOBRENJA);
	}

	public Calendar getKoncesijaVrijediDo() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL__KONCESIJA_VRIJEDI_DO);
	}

	public String getKoncesijaBrojUgovora() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__KONCESIJA_BROJ_UGOVORA);
	}

	public Calendar getZalogDatumZaloga() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL__ZALOG_DATUM_ZALOGA);
	}

	public Calendar getZalogDatumOvjere() {
		return getAsCalendar(KOLDataDictionary.KOL_KOLATERAL__ZALOG_DATUM_OVJERE);
	}

	public String getZalogBrojZaloga() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__ZALOG_BROJ_ZALOGA);
	}

	public String getZalogBrojOvjere() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__ZALOG_BROJ_OVJERE);
	}

	public String getZalogSud() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__ZALOG_SUD);
	}

	public String getZalogJavniBiljeznik() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__ZALOG_JAVNI_BILJEZNIK);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(KOLDataDictionary.KOL_KOLATERAL__ISPRAVNO);
	}

	public void setIdKolaterala(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__ID_KOLATERALA, value);
	}

	public void setGrupa(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__GRUPA, value);
	}

	public void setMaticniBrojJmbg(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__MATICNI_BROJ_JMBG, value);
	}

	public void setOib(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__OIB, value);
	}

	public void setVrijediOd(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL__VRIJEDI_OD);
	}

	public void setVrijediDo(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL__VRIJEDI_DO);
	}

	public void setNaziv(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__NAZIV, value);
	}

	public void setKolicina(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__KOLICINA, value);
	}

	public void setVrsta(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__VRSTA, value);
	}

	public void setSifraKolaterala(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__SIFRA_KOLATERALA, value);
	}

	public void setVlasnik(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__VLASNIK, value);
	}

	public void setLokacija(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__LOKACIJA, value);
	}

	public void setPovrsinaObjekta(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__POVRSINA_OBJEKTA, value);
	}

	public void setPovrsinaZemljista(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__POVRSINA_ZEMLJISTA, value);
	}

	public void setCiklusProcjeneDana(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__CIKLUS_PROCJENE_DANA,
				value);
	}

	public void setCiklusProcjeneMjeseci(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__CIKLUS_PROCJENE_MJESECI,
				value);
	}

	public void setCiklusProcjeneGodina(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__CIKLUS_PROCJENE_GODINA,
				value);
	}

	public void setProcjenjenaVrijednost(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__PROCJENJENA_VRIJEDNOST,
				value);
	}

	public void setValutaProcjene(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__VALUTA_PROCJENE, value);
	}

	public void setDatumProcjene(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL__DATUM_PROCJENE);
	}

	public void setProcjenitelj(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__PROCJENITELJ, value);
	}

	public void setNapomena(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__NAPOMENA, value);
	}

	public void setTereti(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__TERETI, value);
	}

	public void setValutaTereti(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__VALUTA_TERETI, value);
	}

	public void setDatumDospijeca(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL__DATUM_DOSPIJECA);
	}

	public void setDepozitKamatnaStopa(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__DEPOZIT_KAMATNA_STOPA,
				value);
	}

	public void setDepozitBrojKnjizice(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__DEPOZIT_BROJ_KNJIZICE,
				value);
	}

	public void setDioniceTip(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__DIONICE_TIP, value);
	}

	public void setDioniceOznaka(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__DIONICE_OZNAKA, value);
	}

	public void setDioniceUdio(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__DIONICE_UDIO, value);
	}

	public void setDioniceTrzisniIznos(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__DIONICE_TRZISNI_IZNOS,
				value);
	}

	public void setDioniceValutaTrzisniIznos(String value) {
		set(
				KOLDataDictionary.KOL_KOLATERAL__DIONICE_VALUTA_TRZISNI_IZNOS,
				value);
	}

	public void setGarancijaTip(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__GARANCIJA_TIP, value);
	}

	public void setJamacImePrezime(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__JAMAC_IME_PREZIME, value);
	}

	public void setJamacAdresa(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__JAMAC_ADRESA, value);
	}

	public void setJamacMjesto(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__JAMAC_MJESTO, value);
	}

	public void setJamacOib(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__JAMAC_OIB, value);
	}

	public void setJamacMaticniBrojJmbg(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__JAMAC_MATICNI_BROJ_JMBG,
				value);
	}

	public void setJamacZaposlenje(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__JAMAC_ZAPOSLENJE, value);
	}

	public void setMjenicaDuznik(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__MJENICA_DUZNIK, value);
	}

	public void setKatastarskaCestica(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__KATASTARSKA_CESTICA, value);
	}

	public void setKatastarskeCesticeDodatak(String value) {
		set(
				KOLDataDictionary.KOL_KOLATERAL__KATASTARSKE_CESTICE_DODATAK,
				value);
	}

	public void setKatastarskaOpcina(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__KATASTARSKA_OPCINA, value);
	}

	public void setBrojZkUloska(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__BROJ_ZK_ULOSKA, value);
	}

	public void setRegistarskaOznaka(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__REGISTARSKA_OZNAKA, value);
	}

	public void setDatumProizvodnje(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL__DATUM_PROIZVODNJE);
	}

	public void setUdioPostotak(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__UDIO_POSTOTAK, value);
	}

	public void setUdioMaticniBroj(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__UDIO_MATICNI_BROJ, value);
	}

	public void setKoncesijaDatumOdobrenja(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL__KONCESIJA_DATUM_ODOBRENJA);
	}

	public void setKoncesijaVrijediDo(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL__KONCESIJA_VRIJEDI_DO);
	}

	public void setKoncesijaBrojUgovora(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__KONCESIJA_BROJ_UGOVORA,
				value);
	}

	public void setZalogDatumZaloga(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL__ZALOG_DATUM_ZALOGA);
	}

	public void setZalogDatumOvjere(Calendar value) {
		setCalendarAsDateString(value,
				KOLDataDictionary.KOL_KOLATERAL__ZALOG_DATUM_OVJERE);
	}

	public void setZalogBrojZaloga(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__ZALOG_BROJ_ZALOGA, value);
	}

	public void setZalogBrojOvjere(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__ZALOG_BROJ_OVJERE, value);
	}

	public void setZalogSud(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__ZALOG_SUD, value);
	}

	public void setZalogJavniBiljeznik(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__ZALOG_JAVNI_BILJEZNIK,
				value);
	}

	public void setIspravno(String value) {
		set(KOLDataDictionary.KOL_KOLATERAL__ISPRAVNO, value);
	}

}