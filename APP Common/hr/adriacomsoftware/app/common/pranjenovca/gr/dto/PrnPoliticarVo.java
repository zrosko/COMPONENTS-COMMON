package hr.adriacomsoftware.app.common.pranjenovca.gr.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;
/**
 * 
 */ 
public class PrnPoliticarVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
    public static String PRN_GR_UPITNIK_POLITICAR__ID_UPITNIKA = "id_upitnika";
    public static String PRN_GR_UPITNIK_POLITICAR__DUZNOSNIK = "duznosnik";
    public static String PRN_GR_UPITNIK_POLITICAR__ZASTUPNIK = "zastupnik";
    public static String PRN_GR_UPITNIK_POLITICAR__CLAN_VISOKOG_SUDA = "clan_visokog_suda";
    public static String PRN_GR_UPITNIK_POLITICAR__SUDAC = "sudac";
    public static String PRN_GR_UPITNIK_POLITICAR__VELEPOSLANIK = "veleposlanik";
    public static String PRN_GR_UPITNIK_POLITICAR__CLAN_UPRAVAE_NADZORNOG = "clan_upravae_nadzornog";
    public static String PRN_GR_UPITNIK_POLITICAR__BRACNI_DRUG = "bracni_drug";
    public static String PRN_GR_UPITNIK_POLITICAR__BRAT_SESTRA = "brat_sestra";
    public static String PRN_GR_UPITNIK_POLITICAR__VANBRACNI_DRUG = "vanbracni_drug";
    public static String PRN_GR_UPITNIK_POLITICAR__DIJETE = "dijete";
    public static String PRN_GR_UPITNIK_POLITICAR__RODITELJ = "roditelj";
    public static String PRN_GR_UPITNIK_POLITICAR__SURADNIK = "suradnik";
    public static String PRN_GR_UPITNIK_POLITICAR__PRESTANAK_DUZNOSTI = "prestanak_duznosti";
    public static String PRN_GR_UPITNIK_POLITICAR__IZVOR_IMOVINE = "izvor_imovine";

    
    /* Attributes names /> */
    /* </ Constructors */
    public PrnPoliticarVo() {
        super();
    }
    public PrnPoliticarVo(AS2Record value) {
        super(value);
    }
    /* Constructors /> */
    
    /* </ Getters */ 
   
    public String getIdUpitnika() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__ID_UPITNIKA);
    }
    public String getDuznosnik() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__DUZNOSNIK);
    }
    public String getZastupnik() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__ZASTUPNIK);
    }
    public String getClanVisokogSuda() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__CLAN_VISOKOG_SUDA);
    }
    public String getSudac() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__SUDAC);
    }
    public String getVeleposlanik() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__VELEPOSLANIK);
    }
    public String getClanUpravaeNadzornog() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__CLAN_UPRAVAE_NADZORNOG);
    }
    public String getBracniDrug() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__BRACNI_DRUG);
    }
    public String getBratSestra() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__BRAT_SESTRA);
    }
    public String getVanbracniDrug() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__VANBRACNI_DRUG);
    }
    public String getDijete() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__DIJETE);
    }
    public String getRoditelj() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__RODITELJ);
    }
    public String getSuradnik() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__SURADNIK);
    }
    public String getPrestanakDuznosti() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__PRESTANAK_DUZNOSTI);
    }
    public String getIzvorImovine() {
    	return getAsStringOrEmpty(PRN_GR_UPITNIK_POLITICAR__IZVOR_IMOVINE);
    }
    public void setIdUpitnika(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__ID_UPITNIKA, value);
    }
    public void setDuznosnik(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__DUZNOSNIK, value);
    }
    public void setZastupnik(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__ZASTUPNIK, value);
    }
    public void setClanVisokogSuda(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__CLAN_VISOKOG_SUDA, value);
    }
    public void setSudac(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__SUDAC, value);
    }
    public void setVeleposlanik(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__VELEPOSLANIK, value);
    }
    public void setClanUpravaeNadzornog(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__CLAN_UPRAVAE_NADZORNOG, value);
    }
    public void setBracniDrug(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__BRACNI_DRUG, value);
    }
    public void setBratSestra(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__BRAT_SESTRA, value);
    }
    public void setVanbracniDrug(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__VANBRACNI_DRUG, value);
    }
    public void setDijete(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__DIJETE, value);
    }
    public void setRoditelj(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__RODITELJ, value);
    }
    public void setSuradnik(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__SURADNIK, value);
    }
    public void setPrestanakDuznosti(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__PRESTANAK_DUZNOSTI, value);
    }
    public void setIzvorImovine(String value) {
    	set(PRN_GR_UPITNIK_POLITICAR__IZVOR_IMOVINE, value);
    }

    
    /* Setters /> */
}