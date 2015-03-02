package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class CmdbPromjenaPrivitakVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
    /* </ Attribute names */ 
    public static String CMDB_PROMJENA_PRIVITAK__ID_PRIVITKA = "id_privitka";
    public static String CMDB_PROMJENA_PRIVITAK__ID_PROMJENE = "id_promjene";
    public static String CMDB_PROMJENA_PRIVITAK__DOKUMENT = "dokument";
    public static String CMDB_PROMJENA_PRIVITAK__NAZIV_DOKUMENTA = "naziv_dokumenta";
    /* </ Constructors */
    public CmdbPromjenaPrivitakVo() {
        super();
    }
    public CmdbPromjenaPrivitakVo(AS2Record value) {
        super(value);
    }
    /* Constructors /> */
    /* </ Getters/Setters */ 
    public String getIdPrivitka() {
    	return getAsString(CMDB_PROMJENA_PRIVITAK__ID_PRIVITKA);
    }
    public String getIdPromjene() {
    	return getAsString(CMDB_PROMJENA_PRIVITAK__ID_PROMJENE);
    }
    public String getDokument() {
    	return getAsString(CMDB_PROMJENA_PRIVITAK__DOKUMENT);
    }
    public String getNazivDokumenta() {
    	return getAsString(CMDB_PROMJENA_PRIVITAK__NAZIV_DOKUMENTA);
    }
    public void setIdPrivitka(String value) {
    	set(CMDB_PROMJENA_PRIVITAK__ID_PRIVITKA, value);
    }
    public void setIdPromjene(String value) {
    	set(CMDB_PROMJENA_PRIVITAK__ID_PROMJENE, value);
    }
    public void setDokument(String value) {
    	set(CMDB_PROMJENA_PRIVITAK__DOKUMENT, value);
    }
    public void setNazivDokumenta(String value) {
    	set(CMDB_PROMJENA_PRIVITAK__NAZIV_DOKUMENTA, value);
    }
     /* Getters/Setters /> */
}