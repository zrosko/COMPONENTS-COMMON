package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.as2.inf.common.data.AS2Record;

public class PoslovniOdnosBankaVo extends ZahtjevPravnaOsobaVo {
	private static final long serialVersionUID = 1L;
    public PoslovniOdnosBankaVo() {
        super();
    }
    public PoslovniOdnosBankaVo(AS2Record value) {
        super(value);
    }
    public String getIdPoslovnogOdnosa() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__ID_POSLOVNOG_ODNOSA);
    }
    public String getIznosIzlozenosti() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI);
    }
    public String getIznosIzlozenostiNeto() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI_NETO);
    }
    public String getIznosIzlozenostiPo() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI_PO);
    }
    public String getIznosIzlozenostiNetoPo() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI_NETO_PO);
    }
    public String getIzlozenostPremaJamKapitalu() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZLOZENOST_PREMA_JAM_KAPITALU);
    }
    public String getIzlozenostPremaJamKapitaluPo() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZLOZENOST_PREMA_JAM_KAPITALU_PO);
    }
    public String getBrojZahtjeva() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_ZAHTJEVA);
    }
    public String getPocetakPoslovnogOdnosa() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__POCETAK_POSLOVNOG_ODNOSA);
    }
    public String getBrojZiroRacuna() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_ZIRO_RACUNA);
    }
    public String getPostotakPrometa() {
    	return get(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__POSTOTAK_PROMETA);
    }
    public String getBrojDjelatnikaPlaca() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_DJELATNIKA_PLACA);
    }
    public String getDepozitiTrazitelja() {
    	return get(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__DEPOZITI_TRAZITELJA);
    }
    public String getStednjaVlasnikaFormated() {
    	return getFormatedAmount(getAsDouble(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__STEDNJA_VLASNIKA));
    }
    public String getDepozitiTraziteljaFormated() {
    	return getFormatedAmount(getAsDouble(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__DEPOZITI_TRAZITELJA));
    }

	public String getStednjaVlasnika() {
    	return get(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__STEDNJA_VLASNIKA);
    }
    public String getBrojDionicaBanke() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_DIONICA_BANKE);
    }
    public String getBrojDionicaBankePo() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_DIONICA_BANKE_PO);
    }
    public String getUdioVlasnistvaBanke() {
    	return get(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__UDIO_VLASNISTVA_BANKE);
    }
    public String getJamstveniKapital() {
    	return get(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__JAMSTVENI_KAPITAL);
    }
    public String getRizicnaSkupina() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__RIZICNA_SKUPINA);
    }
    public String getPosebanOdnos() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__POSEBAN_ODNOS);
    }
    public String getVelikaIzlozenost() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__VELIKA_IZLOZENOST);
    }
    public String getOpisPosebnogOdnosa() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__OPIS_POSEBNOG_ODNOSA);
    }
    public String getKomentarPoslovnogOdnosa() {
    	return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__KOMENTAR_POSLOVNOG_ODNOSA);
    }
    public void setIdPoslovnogOdnosa(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__ID_POSLOVNOG_ODNOSA, value);
    }
    public void setBrojZahtjeva(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_ZAHTJEVA, value);
    }
    public void setPocetakPoslovnogOdnosa(String value) {
        set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__POCETAK_POSLOVNOG_ODNOSA, value);
    }
    public void setBrojZiroRacuna(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_ZIRO_RACUNA, value);
    }
    public void setPostotakPrometa(String value) {
        set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__POSTOTAK_PROMETA, value);
    }
    public void setBrojDjelatnikaPlaca(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_DJELATNIKA_PLACA, value);
    }
    public void setDepozitiTrazitelja(String value) {
        set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__DEPOZITI_TRAZITELJA, value);
    }
    public void setStednjaVlasnika(String value) {
        set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__STEDNJA_VLASNIKA, value);
    }
    public void setBrojDionicaBanke(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_DIONICA_BANKE, value);
    }
    public void setBrojDionicaBankePo(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__BROJ_DIONICA_BANKE_PO, value);
    }
    public void setUdioVlasnistvaBanke(String value) {
        set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__UDIO_VLASNISTVA_BANKE, value);
    }
    public void setJamstveniKapital(String value) {
        set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__JAMSTVENI_KAPITAL, value);
    }
    public void setRizicnaSkupina(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__RIZICNA_SKUPINA, value);
    }
    public void setPosebanOdnos(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__POSEBAN_ODNOS, value);
    }
    public void setVelikaIzlozenost(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__VELIKA_IZLOZENOST, value);
    }
    public void setOpisPosebnogOdnosa(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__OPIS_POSEBNOG_ODNOSA, value);
    }
    public void setKomentarPoslovnogOdnosa(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__KOMENTAR_POSLOVNOG_ODNOSA, value);
    }
    public void setIzlozenostPremaJamKapitalu(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZLOZENOST_PREMA_JAM_KAPITALU, value);
    }
    public void setIzlozenostPremaJamKapitaluPo(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZLOZENOST_PREMA_JAM_KAPITALU_PO, value);
    }
    public void setIznosIzlozenosti(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI, value);
    }
    public void setIznosIzlozenostiNeto(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI_NETO, value);
    }
    public void setIznosIzlozenostiPo(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI_PO, value);
    }
    public void setIznosIzlozenostiNetoPo(String value) {
    	set(ZAHDataDictionary.PO_ZAH_POSLOVNI_ODNOS_BANKA__IZNOS_IZLOZENOSTI_NETO_PO, value);
    }
}