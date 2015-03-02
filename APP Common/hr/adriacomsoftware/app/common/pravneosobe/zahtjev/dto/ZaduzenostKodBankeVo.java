package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class ZaduzenostKodBankeVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;
    public ZaduzenostKodBankeVo() {
        super();
    }
    public ZaduzenostKodBankeVo(AS2Record value) {
        super(value);
    }
    public String getIdZaduzenosti() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__ID_ZADUZENOSTI);
    }
    public String getBrojZahtjeva() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_ZAHTJEVA);
    }
    public String getJmbgMb() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__JMBG_MB);
    }
    public Calendar getDatumAnalize() {
    	return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DATUM_ANALIZE);
    }
    public String getBrojPartije() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_PARTIJE);
    }
    public String getVrstaProizvoda() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__VRSTA_PROIZVODA);
    }
    public String getVrstaDuga() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__VRSTA_DUGA);
    }
    public String getProgram() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__PROGRAM);
    }
    public String getNamjena() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__NAMJENA);
    }
    public String getBrojUgovora() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_UGOVORA);
    }
    public String getValutnaKlauzula() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__VALUTNA_KLAUZULA);
    }
    public Calendar getDatumOdobravanja() {
    	return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DATUM_ODOBRAVANJA);
    }
    public Calendar getDatumDospijeca() {
    	return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DATUM_DOSPIJECA);
    }
    public String getOdobreniIznos() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__ODOBRENI_IZNOS);
    }
    public String getPocek() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__POCEK);
    }
    public String getKamatnaStopa() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__KAMATNA_STOPA);
    }
    public String getNedospjelaGlavnica() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__NEDOSPJELA_GLAVNICA);
    }
    public String getNedospjelaKamata() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__NEDOSPJELA_KAMATA);
    }
    public String getDospjelaGlavnica() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DOSPJELA_GLAVNICA);
    }
    public String getDospjelaKamata() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DOSPJELA_KAMATA);
    }
    public String getMjesecnaRata() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__MJESECNA_RATA);
    }
    public String getBrojDanaKasnjenjaKamate() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_DANA_KASNJENJA_KAMATE);
    }
    public String getBrojDanaKasnjenjaGlavnica() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_DANA_KASNJENJA_GLAVNICA);
    }
    public String getRokOtplate() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__ROK_OTPLATE);
    }
    public String getUkupnaIzlozenost() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNA_IZLOZENOST);
    }
    public String getUkupnaZaduzenost() {
        return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNA_ZADUZENOST);
    }
    public String getUkupnoZaduzenost() {        
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_ZADUZENOST);
    }
    public String getUkupnoPlasmani() {        
        return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_PLASMANI);
    }
    public String getUkupnoMjesecneRate() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_MJESECNE_RATE);
    }
    public String getUkupnoIzlozenost() {
    	return get(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_IZLOZENOST);
    }
    public String getUcitano() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UCITANO);
    }
    public String getNeiskoristeniIznos() {
        return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__NEISKORISTENI_IZNOS);
    }
    public String getTekucaFaza() {
        return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__TEKUCA_FAZA);
    }
    //setters
    public void setIdZaduzenosti(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__ID_ZADUZENOSTI, value);
    }
    public void setBrojZahtjeva(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_ZAHTJEVA, value);
    }
    public void setDatumAnalize(Calendar value) {
    	setCalendarAsDateString(value, ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DATUM_ANALIZE);
    }
    public void setBrojPartije(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_PARTIJE, value);
    }
    public void setJmbgMb(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__JMBG_MB, value);
    }
    public void setVrstaProizvoda(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__VRSTA_PROIZVODA, value);
    }
    public void setVrstaDuga(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__VRSTA_DUGA, value);
    }
    public void setProgram(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__PROGRAM, value);
    }
    public void setNamjena(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__NAMJENA, value);
    }
    public void setBrojUgovora(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_UGOVORA, value);
    }
    public void setValutnaKlauzula(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__VALUTNA_KLAUZULA, value);
    }
    public void setDatumOdobravanja(Calendar value) {
    	setCalendarAsDateString(value, ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DATUM_ODOBRAVANJA);
    }
    public void setDatumDospijeca(Calendar value) {
    	setCalendarAsDateString(value, ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DATUM_DOSPIJECA);
    }
    public void setOdobreniIznos(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__ODOBRENI_IZNOS, value);
    }
    public void setPocek(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__POCEK, value);
    }
    public void setKamatnaStopa(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__KAMATNA_STOPA, value);
    }
    public void setNedospjelaGlavnica(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__NEDOSPJELA_GLAVNICA, value);
    }
    public void setNedospjelaKamata(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__NEDOSPJELA_KAMATA, value);
    }
    public void setDospjelaGlavnica(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DOSPJELA_GLAVNICA, value);
    }
    public void setDospjelaKamata(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__DOSPJELA_KAMATA, value);
    }
    public void setMjesecnaRata(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__MJESECNA_RATA, value);
    }
    public void setBrojDanaKasnjenjaKamate(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_DANA_KASNJENJA_KAMATE, value);
    }
    public void setBrojDanaKasnjenjaGlavnica(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__BROJ_DANA_KASNJENJA_GLAVNICA, value);
    }
    public void setRokOtplate(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__ROK_OTPLATE, value);
    }
    public void setUkupnaZaduzenost(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNA_ZADUZENOST, value);
    } 
    public void setUkupnaIzlozenost(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNA_IZLOZENOST, value);
    } 
    public void setUcitano(String value) {
    	set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UCITANO, value);
    }
    //
    public void setUkupnoIzlozenost(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_IZLOZENOST, value);
    }
    public void setUkupnoZaduzenost(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_ZADUZENOST, value);
    }
    public void setUkupnoPlasmani(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_PLASMANI, value);
    }
    public void setUkupnoMjesecneRate(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__UKUPNO_MJESECNE_RATE, value);
    }
    public void setNeiskoristeniIznos(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__NEISKORISTENI_IZNOS, value);
    }
    public void setTekucaFaza(String value) {
        set(ZAHDataDictionary.PO_ZAH_ZADUZENOST_KOD_BANKE__TEKUCA_FAZA, value);
    }
}