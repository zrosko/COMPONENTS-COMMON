package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class CmdbPromjenaVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
    /* </ Attribute names */
    public static String CMDB_PROMJENA__ID_PROMJENE = "id_promjene";
    public static String CMDB_PROMJENA__ID_IMOVINE = "id_imovine";
    public static String CMDB_PROMJENA__NAZIV = "naziv";
    public static String CMDB_PROMJENA__ZADUZENA_OSOBA = "zaduzena_osoba";
    public static String CMDB_PROMJENA__ID_POZIVA = "id_poziva";
    public static String CMDB_PROMJENA__ID_RADNOG_NALOGA = "id_radnog_naloga";
    public static String CMDB_PROMJENA__VRSTA_DOGADAJA = "vrsta_dogadaja";
    public static String CMDB_PROMJENA__DATUM = "datum";
    public static String CMDB_PROMJENA__ROK_PROVEDBE = "rok_provedbe";
    public static String CMDB_PROMJENA__INACICA = "inacica";
    public static String CMDB_PROMJENA__OPIS = "opis";
    public static String CMDB_PROMJENA__IZVRSENI_RADOVI = "izvrseni_radovi";
    public static String CMDB_PROMJENA__UTROSENI_MATERIJAL = "utroseni_materijal";
    public static String CMDB_PROMJENA__ZAPAZANJA = "zapazanja";
    public static String CMDB_PROMJENA__STATUS = "status";

    /* </ Constructors */
    public CmdbPromjenaVo() {
        super();
    }
    public CmdbPromjenaVo(AS2Record value) {
        super(value);
    }
    /* Constructors /> */
    /* </ Getters/Setters */ 
    public String getIdPromjene() {
    	return getAsString(CMDB_PROMJENA__ID_PROMJENE);
    }
    public String getIdImovine() {
    	return getAsString(CMDB_PROMJENA__ID_IMOVINE);
    }
    public String getNaziv() {
    	return getAsString(CMDB_PROMJENA__NAZIV);
    }
    public String getZaduzenaOsoba() {
    	return getAsString(CMDB_PROMJENA__ZADUZENA_OSOBA);
    }
    public String getIdPoziva() {
    	return getAsString(CMDB_PROMJENA__ID_POZIVA);
    }
    public String getIdRadnogNaloga() {
    	return getAsString(CMDB_PROMJENA__ID_RADNOG_NALOGA);
    }
    public String getVrstaDogadaja() {
    	return getAsString(CMDB_PROMJENA__VRSTA_DOGADAJA);
    }
    public Calendar getDatum() {
    	return getAsCalendar(CMDB_PROMJENA__DATUM);
    }
    public Calendar getRokProvedbe() {
    	return getAsCalendar(CMDB_PROMJENA__ROK_PROVEDBE);
    }
    public String getInacica() {
    	return getAsString(CMDB_PROMJENA__INACICA);
    }
    public String getOpis() {
    	return getAsString(CMDB_PROMJENA__OPIS);
    }
    public String getIzvrseniRadovi() {
    	return getAsString(CMDB_PROMJENA__IZVRSENI_RADOVI);
    }
    public String getUtroseniMaterijal() {
    	return getAsString(CMDB_PROMJENA__UTROSENI_MATERIJAL);
    }
    public String getZapazanja() {
    	return getAsString(CMDB_PROMJENA__ZAPAZANJA);
    }
    public String getStatus() {
    	return getAsString(CMDB_PROMJENA__STATUS);
    }
    public void setIdPromjene(String value) {
    	set(CMDB_PROMJENA__ID_PROMJENE, value);
    }
    public void setIdImovine(String value) {
    	set(CMDB_PROMJENA__ID_IMOVINE, value);
    }
    public void setNaziv(String value) {
    	set(CMDB_PROMJENA__NAZIV, value);
    }
    public void setZaduzenaOsoba(String value) {
    	set(CMDB_PROMJENA__ZADUZENA_OSOBA, value);
    }
    public void setIdPoziva(String value) {
    	set(CMDB_PROMJENA__ID_POZIVA, value);
    }
    public void setIdRadnogNaloga(String value) {
    	set(CMDB_PROMJENA__ID_RADNOG_NALOGA, value);
    }
    public void setVrstaDogadaja(String value) {
    	set(CMDB_PROMJENA__VRSTA_DOGADAJA, value);
    }
    public void setDatum(Calendar value) {
    	setCalendarAsDateString(value, CMDB_PROMJENA__DATUM);
    }
    public void setRokProvedbe(Calendar value) {
    	setCalendarAsDateString(value, CMDB_PROMJENA__ROK_PROVEDBE);
    }
    public void setInacica(String value) {
    	set(CMDB_PROMJENA__INACICA, value);
    }
    public void setOpis(String value) {
    	set(CMDB_PROMJENA__OPIS, value);
    }
    public void setIzvrseniRadovi(String value) {
    	set(CMDB_PROMJENA__IZVRSENI_RADOVI, value);
    }
    public void setUtroseniMaterijal(String value) {
    	set(CMDB_PROMJENA__UTROSENI_MATERIJAL, value);
    }
    public void setZapazanja(String value) {
    	set(CMDB_PROMJENA__ZAPAZANJA, value);
    }
    public void setStatus(String value) {
    	set(CMDB_PROMJENA__STATUS, value);
    }

     /* Getters/Setters /> */
}