package hr.adriacomsoftware.app.common.gradani.tekuci.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class TrajniNalogVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_IZVOD_VO__PONAVLJANJE_OBRADE = "@ponavljanje_obrade";

	/* Attributes names /> */
	/* </ Constructors */
	public TrajniNalogVo() {
		super();
	}

	public TrajniNalogVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getBrojPartijeDugujePostoji() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_PARTIJE_DUGUJE_POSTOJI);
	}

	public String getBrojPartijePotrazujePostoji() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_PARTIJE_POTRAZUJE_POSTOJI);
	}

	public String getIdTrajnogNaloga() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__ID_TRAJNOG_NALOGA);
	}

	public String getVrstaTrajnogNaloga() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__VRSTA_TRAJNOG_NALOGA);
	}

	public String getBrojTrajnogNaloga() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_TRAJNOG_NALOGA);
	}

	public String getVbdiDuguje() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__VBDI_DUGUJE);
	}

	public String getBrojPartijeDuguje() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_PARTIJE_DUGUJE);
	}

	public String getVbdiPotrazuje() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__VBDI_POTRAZUJE);
	}

	public String getBrojPartijePotrazuje() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_PARTIJE_POTRAZUJE);
	}

	public String getBrojRacunaPotrazuje() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_RACUNA_POTRAZUJE);
	}

	public String getMaticniBrojPotrazuje() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__MATICNI_BROJ_POTRAZUJE);
	}

	public String getNacinKnjizenja() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__NACIN_KNJIZENJA);
	}

	public Calendar getPocetniDatum() {
		return getAsCalendar(JBDataDictionary.BI_TRAJNI_NALOG__POCETNI_DATUM);
	}

	public Calendar getZavrsniDatum() {
		return getAsCalendar(JBDataDictionary.BI_TRAJNI_NALOG__ZAVRSNI_DATUM);
	}

	public String getPlatitelj() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__PLATITELJ);
	}

	public String getSvrhaPlacanja() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__SVRHA_PLACANJA);
	}

	public String getPrimatelj() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__PRIMATELJ);
	}

	public String getPozivNaBrojOdobrenja() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__POZIV_NA_BROJ_ODOBRENJA);
	}

	public String getPozivNaBrojZaduzenja() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__POZIV_NA_BROJ_ZADUZENJA);
	}

	public String getModelBrojaZaduzenja() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__MODEL_BROJA_ZADUZENJA);
	}

	public String getModelBrojaOdobrenja() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__MODEL_BROJA_ODOBRENJA);
	}

	public String getIznosNaloga() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__IZNOS_NALOGA);
	}

	public String getSifraValute() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__SIFRA_VALUTE);
	}

	public String getOperaterUnosa() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__OPERATER_UNOSA);
	}

	public Calendar getVrijemeUnosa() {
		return getAsCalendar(JBDataDictionary.BI_TRAJNI_NALOG__VRIJEME_UNOSA);
	}

	public String getDan() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__DAN);
	}

	public String getMjesec() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__MJESEC);
	}

	public String getGodina() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__GODINA);
	}

	public String getOpis() {
		return getAsStringOrEmpty(JBDataDictionary.BI_TRAJNI_NALOG__OPIS);
	}

	/* Setters /> */
	public void setBrojPartijeDugujePostoji(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_PARTIJE_DUGUJE_POSTOJI,
				value);
	}

	public void setBrojPartijePotrazujePostoji(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_PARTIJE_POTRAZUJE_POSTOJI,
				value);
	}

	public void setIdTrajnogNaloga(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__ID_TRAJNOG_NALOGA, value);
	}

	public void setVrstaTrajnogNaloga(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__VRSTA_TRAJNOG_NALOGA, value);
	}

	public void setBrojTrajnogNaloga(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_TRAJNOG_NALOGA, value);
	}

	public void setVbdiDuguje(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__VBDI_DUGUJE, value);
	}

	public void setBrojPartijeDuguje(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_PARTIJE_DUGUJE, value);
	}

	public void setVbdiPotrazuje(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__VBDI_POTRAZUJE, value);
	}

	public void setBrojPartijePotrazuje(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_PARTIJE_POTRAZUJE, value);
	}

	public void setBrojRacunaPotrazuje(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__BROJ_RACUNA_POTRAZUJE, value);
	}

	public void setMaticniBrojPotrazuje(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__MATICNI_BROJ_POTRAZUJE, value);
	}

	public void setNacinKnjizenja(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__NACIN_KNJIZENJA, value);
	}

	public void setPocetniDatum(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.BI_TRAJNI_NALOG__POCETNI_DATUM);
	}

	public void setZavrsniDatum(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.BI_TRAJNI_NALOG__ZAVRSNI_DATUM);
	}

	public void setPlatitelj(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__PLATITELJ, value);
	}

	public void setSvrhaPlacanja(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__SVRHA_PLACANJA, value);
	}

	public void setPrimatelj(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__PRIMATELJ, value);
	}

	public void setPozivNaBrojOdobrenja(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__POZIV_NA_BROJ_ODOBRENJA, value);
	}

	public void setPozivNaBrojZaduzenja(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__POZIV_NA_BROJ_ZADUZENJA, value);
	}

	public void setModelBrojaZaduzenja(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__MODEL_BROJA_ZADUZENJA, value);
	}

	public void setModelBrojaOdobrenja(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__MODEL_BROJA_ODOBRENJA, value);
	}

	public void setIznosNaloga(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__IZNOS_NALOGA, value);
	}

	public void setSifraValute(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__SIFRA_VALUTE, value);
	}

	public void setOperaterUnosa(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__OPERATER_UNOSA, value);
	}

	public void setVrijemeUnosa(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.BI_TRAJNI_NALOG__VRIJEME_UNOSA);
	}

	public void setDan(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__DAN, value);
	}

	public void setMjesec(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__MJESEC, value);
	}

	public void setGodina(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__GODINA, value);
	}

	public void setOpis(String value) {
		set(JBDataDictionary.BI_TRAJNI_NALOG__OPIS, value);
	}
}