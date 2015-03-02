package hr.adriacomsoftware.app.common.jb.dto;

import hr.adriacomsoftware.app.common.jb.BankaConstants;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/**
 * Zajednicki atributi projekta za Cistocu.
 */
public class AdresaVo extends AS2Record implements BankaConstants{
    static final long serialVersionUID = 8878435581765500759L;
    /* </ Attribute names */ 
    public final static String ADRESA1 = "adresa1";
    public final static String ADRESA2 = "adresa2";
    public final static String MJESTO = "mjesto";
    public final static String DRZAVA = "drzava";
    public final static String POSTANSKI_BROJ = "postanski_broj";
    public final static String DATUM_VAZENJA_OD = "datum_vazenja_od";
    public final static String DATUM_VAZENJA_DO = "datum_vazenja_do"; 
    public final static String JMBG = "jmbg";
    public final static String MATICNI_BROJ = "maticni_broj";
    public final static String BROJ_PARTIJE = "broj_partije";
    /* Attributes names /> */
    /* </ Constructors */
    public AdresaVo() {
        super();
    }

    public AdresaVo(AS2Record value) {
        super(value);
    }

    /* Constructors /> */
    /* </ Getters */  
    public String getJmbg() {
        return getAsStringOrEmpty(JMBG);
    }
    public String getMaticniBroj() {
        return getAsStringOrEmpty(MATICNI_BROJ);
    }
    public String getBrojPartije() {
        return getAsStringOrEmpty(BROJ_PARTIJE);
    }
    public String getAdresa1() {
        return getAsStringOrEmpty(ADRESA1);
    }
    public String getAdresa2() {
        return getAsStringOrEmpty(ADRESA2);
    }
    public String getMjesto() {
        return getAsStringOrEmpty(MJESTO);
    }
    public String getDrzava() {
        return getAsStringOrEmpty(DRZAVA);
    }
    public String getPostanskiBroj() {
        return getAsStringOrEmpty(POSTANSKI_BROJ);
    }
    public Calendar getDatumVazenjaOd() {
    	return getAsCalendar(DATUM_VAZENJA_OD);
    }
    public Calendar getDatumVazenjaDo() {
    	return getAsCalendar(DATUM_VAZENJA_DO);
    }
    /* Getters /> */
    /* </ Setters */
    public void setJmbg(String value) {
        set(JMBG, value);
    }
    public void setMaticniBroj(String value) {
        set(MATICNI_BROJ, value);
    }
    public void setBrojPartije(String value) {
        set(BROJ_PARTIJE, value);
    }
    public void setAdresa1(String value) {
        set(ADRESA1, value);
    }
    public void setAdresa2(String value) {
        set(ADRESA2, value);
    }
    public void setMjesto(String value) {
        set(MJESTO, value);
    }
    public void setDrzava(String value) {
        set(DRZAVA, value);
    }
    public void setPostanskiBroj(String value) {
        set(POSTANSKI_BROJ, value);
    }
    public void setDatumVazenjaOd(Calendar value) {
    	setCalendarAsDateString(value, DATUM_VAZENJA_OD);
    }
    public void setDatumVazenjaDo(Calendar value) {
    	setCalendarAsDateString(value, DATUM_VAZENJA_DO);
    }        
    /* Setters /> */
}