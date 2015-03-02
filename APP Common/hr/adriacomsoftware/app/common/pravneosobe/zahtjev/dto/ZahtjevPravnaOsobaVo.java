package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.ZAHDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.pravneosobe.bonitet.dto.BonitetBilancaVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.ZahConstants;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class ZahtjevPravnaOsobaVo extends OsnovniVo implements ZahConstants {
	private static final long serialVersionUID = 1L;
	// za prikaz na referatu
	public static String PO_ZAH_ZAHTJEV__BROJ_JRR_PARTIJA = "broj_jrr_partija";

	public ZahtjevPravnaOsobaVo() {
		super();
	}

	public ZahtjevPravnaOsobaVo(AS2Record value) {
		super(value);
	}

	// extra
	public String getBrojJrrPartija() {
		return get(PO_ZAH_ZAHTJEV__BROJ_JRR_PARTIJA);
	}

	public void setBrojJrrPartija(String value) {
		set(PO_ZAH_ZAHTJEV__BROJ_JRR_PARTIJA, value);
	}

	public String getOpcijeIspisa() {
		return get(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OPCIJE_ISPISA);
	}

	public String getObrazlozenje() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__OBRAZLOZENJE);
	}

	public String getNaziv() {
		return getPodaciKlijenta().getNaziv();
	}

	public void setNaziv(String value) {
		getPodaciKlijenta().setNaziv(value);
	}

	public String getOpis() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OPIS);
	}

	public String getEmailDjelantika() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__EMAIL_DJELATNIKA);
	}

	public void setOpcijeIspisa(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OPCIJE_ISPISA, value);
	}

	public void setEmailDjelatnika(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__EMAIL_DJELATNIKA, value);
	}

	public void setOpis(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OPIS, value);
	}

	public void setStatusZahtjevaNaziv(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__STATUS_ZAHTJEVA_NAZIV, value);
	}

	public String getStatusZahtjevaNaziv() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__STATUS_ZAHTJEVA_NAZIV);
	}

	public String getHitnost() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__HITNOST);
		// 9.11.1009. Komentirano ispod zbog "pretrazivanja".
		// if(getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__HITNOST).length()>0)
		// return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__HITNOST);
		// else
		// return "M";
	}

	// get/set liste
	public void setBankarskeProizvode(BankarskiProizvodRs value) {
		set("@@" + ZAH_BANKARSKI_PROIZVOD, value);
	}

	public BankarskiProizvodRs getBankarskeProizvode() {
		BankarskiProizvodRs rs = (BankarskiProizvodRs) getProperty("@@"
				+ ZAH_BANKARSKI_PROIZVOD);
		if (rs == null)
			rs = new BankarskiProizvodRs();
		return rs;
	}

	public void setPodaciKlijenta(PodaciKlijentaVo value) {
		set("@@" + ZAH_PODACI_KLIJENTA, value);
	}

	public PodaciKlijentaVo getPodaciKlijenta() {
		PodaciKlijentaVo vo = (PodaciKlijentaVo) getProperty("@@"
				+ ZAH_PODACI_KLIJENTA);
		if (vo == null)
			vo = new PodaciKlijentaVo();
		return vo;
	}

	public void setBonitet(BonitetBilancaVo value) {
		set("@@" + ZAH_BONITET, value);
	}

	public BonitetBilancaVo getBonitet() {
		BonitetBilancaVo vo = (BonitetBilancaVo) getProperty("@@" + ZAH_BONITET);
		if (vo == null)
			vo = new BonitetBilancaVo();
		return vo;
	}

	public void setPoslovneOdnoseBanka(PoslovniOdnosBankaVo value) {
		set("@@" + ZAH_POSLOVNI_ODNOS_BANKA, value);
	}

	public PoslovniOdnosBankaVo getPoslovneOdnoseBanka() {
		PoslovniOdnosBankaVo vo = (PoslovniOdnosBankaVo) getProperty("@@"
				+ ZAH_POSLOVNI_ODNOS_BANKA);
		if (vo == null)
			vo = new PoslovniOdnosBankaVo();
		return vo;
	}

	public void setPovezaneOsobe(PovezanaOsobaRs value) {
		set("@@" + ZAH_POVEZANA_OSOBA, value);
	}

	public PovezanaOsobaRs getPovezaneOsobe() {
		PovezanaOsobaRs rs = (PovezanaOsobaRs) getProperty("@@"
				+ ZAH_POVEZANA_OSOBA);
		if (rs == null)
			rs = new PovezanaOsobaRs();
		return rs;
	}

	public void setZaduzenostKodBanke(ZaduzenostKodBankeRs value) {
		set("@@" + ZAH_ZADUZENOST_KOD_BANKE, value);
	}

	public ZaduzenostKodBankeRs getZaduzenostKodBanke() {
		ZaduzenostKodBankeRs rs = (ZaduzenostKodBankeRs) getProperty("@@"
				+ ZAH_ZADUZENOST_KOD_BANKE);
		if (rs == null)
			rs = new ZaduzenostKodBankeRs();
		return rs;
	}

	// public void setBon2(Bon2Rs value){
	// set("@@Bon2Rs", value);
	// }
	// public void setZaduzenosti(ZaduzenostRs value){
	// set("@@ZaduzenostRs", value);
	// }
	// public void setDobavljaci(DobavljacRs value){
	// set("@@DobavljacRs", value);
	// }
	// public void setKupci(KupacRs value){
	// set("@@KupacRs", value);
	// }
	// public void setKratkorocniPlanovi(KratkorocniPlanRs value){
	// set("@@KratkorocniPlanRs", value);
	// }
	// get liste

	// public Bon2Rs getBon2(){
	// return(Bon2Rs)getProperty("@@Bon2Rs");
	// }
	// public ZaduzenostRs getZaduzenosti(){
	// return (ZaduzenostRs)getProperty("@@ZaduzenostRs");
	// }
	// public DobavljacRs getDobavljaci(){
	// return (DobavljacRs)getProperty("@@DobavljacRs");
	// }
	// public KupacRs setKupci(){
	// return (KupacRs)getProperty("@@KupacRs");
	// }
	// public KratkorocniPlanRs getKratkorocniPlanovi(){
	// return (KratkorocniPlanRs)getProperty("@@KratkorocniPlanRs");
	// }
	public String getBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__BROJ_ZAHTJEVA);
	}

	public String getVrstaZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__VRSTA_ZAHTJEVA);
	}

	public String getBsaBrojZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__BSA_BROJ_ZAHTJEVA);
	}

	public String getBsaOperater() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__BSA_OPERATER);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__NAPOMENA);
	}

	public String getBrojZahtjevaVeza() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__BROJ_ZAHTJEVA_VEZA);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ORGANIZACIJSKA_JEDINICA);
	}

	public Calendar getDatumZaprimanja() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_ZAPRIMANJA);
	}

	public String getZaprimatelj() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAPRIMATELJ);
	}

	public String getOdobrava() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ODOBRAVA);
	}

	public String getObrada() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OBRADA);
	}

	public Calendar getDatumObrade() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_OBRADE);
	}

	public String getProcjenaRizika() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__PROCJENA_RIZIKA);
	}

	public Calendar getDatumProcjeneRizika() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_PROCJENE_RIZIKA);
	}

	public Calendar getDatumZaprimanjaProcjeneRizika() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_ZAPRIMANJA_PROCJENE_RIZIKA);
	}

	public String getZakljucakPozitivno() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAKLJUCAK_POZITIVNO);
	}

	public String getZakljucakNegativno() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAKLJUCAK_NEGATIVNO);
	}

	public String getZakljucakPreporuka() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAKLJUCAK_PREPORUKA);
	}

	public String getOperaterUnosa() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OPERATER_UNOSA);
	}

	public String getOperaterPromjene() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OPERATER_PROMJENE);
	}

	public Calendar getDatumUnosa() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_UNOSA);
	}

	public Calendar getDatumPromjene() {
		return getAsCalendar(ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_PROMJENE);
	}

	public String getStatusZahtjeva() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__STATUS_ZAHTJEVA);
	}

	public String getPrijedlogOdluke() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__PRIJEDLOG_ODLUKE);
	}

	// novo ispod
	public String getReferent() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__REFERENT);
	}

	public String getSefSluzbe() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__SEF_SLUZBE);
	}

	public String getZamjenikDirektoraDirekcije() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAMJENIK_DIREKTORA_DIREKCIJE);
	}

	public String getDirektorDirekcije() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__DIREKTOR_DIREKCIJE);
	}

	// novo iznad
	public String getIspravno() {
		return getAsStringOrEmpty(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ISPRAVNO);
	}

	public void setBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__BROJ_ZAHTJEVA, value);
	}

	public void setVrstaZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__VRSTA_ZAHTJEVA, value);
	}

	public void setBsaOperater(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__BSA_OPERATER, value);
	}

	public void setNapomena(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__NAPOMENA, value);
	}

	public void setBsaBrojZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__BSA_BROJ_ZAHTJEVA, value);
	}

	public void setBrojZahtjevaVeza(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__BROJ_ZAHTJEVA_VEZA, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setDatumZaprimanja(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_ZAPRIMANJA);
	}

	public void setZaprimatelj(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAPRIMATELJ, value);
	}

	public void setOdobrava(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ODOBRAVA, value);
	}

	public void setObrada(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OBRADA, value);
	}

	public void setDatumObrade(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_OBRADE);
	}

	public void setProcjenaRizika(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__PROCJENA_RIZIKA, value);
	}

	public void setDatumProcjeneRizika(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_PROCJENE_RIZIKA);
	}

	public void setDatumZaprimanjaProcjeneRizika(Calendar value) {
		setCalendarAsDateString(
				value,
				ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_ZAPRIMANJA_PROCJENE_RIZIKA);
	}

	public void setZakljucakPozitivno(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAKLJUCAK_POZITIVNO, value);
	}

	public void setZakljucakNegativno(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAKLJUCAK_NEGATIVNO, value);
	}

	public void setZakljucakPreporuka(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAKLJUCAK_PREPORUKA, value);
	}

	public void setOperaterUnosa(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OPERATER_UNOSA, value);
	}

	public void setOperaterPromjene(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__OPERATER_PROMJENE, value);
	}

	public void setDatumUnosa(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_UNOSA);
	}

	public void setDatumPromjene(Calendar value) {
		setCalendarAsDateString(value,
				ZAHDataDictionary.PO_ZAH_ZAHTJEV__DATUM_PROMJENE);
	}

	public void setStatusZahtjeva(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__STATUS_ZAHTJEVA, value);
	}

	public void setIspravno(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ISPRAVNO, value);
	}

	public void setPrijedlogOdluke(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__PRIJEDLOG_ODLUKE, value);
	}

	public void setHitnost(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__HITNOST, value);
	}

	// novo ispod
	public void setReferent(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__REFERENT, value);
	}

	public void setSefSluzbe(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__SEF_SLUZBE, value);
	}

	public void setZamjenikDirektoraDirekcije(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__ZAMJENIK_DIREKTORA_DIREKCIJE,
				value);
	}

	public void setDirektorDirekcije(String value) {
		set(ZAHDataDictionary.PO_ZAH_ZAHTJEV__DIREKTOR_DIREKCIJE, value);
	}

	public void setObrazlozenje(String value) {
		set(ZAHDataDictionary.PO_ZAH_STATUS_ZAHTJEVA__OBRAZLOZENJE, value);
	}
}