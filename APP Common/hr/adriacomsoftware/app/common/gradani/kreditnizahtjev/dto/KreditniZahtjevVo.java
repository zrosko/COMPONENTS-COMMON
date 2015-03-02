package hr.adriacomsoftware.app.common.gradani.kreditnizahtjev.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class KreditniZahtjevVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	private final static String KREDITNI_ZAHTJEV_OSOBA = "@osoba";
	private final static String PRIHODI_CLANOVA1 = "@prihodi_clanova1";
	private final static String PRIHODI_CLANOVA2 = "@prihodi_clanova2";
	private final static String PRIHODI_CLANOVA3 = "@prihodi_clanova3";
	private final static String PRIHODI_CLANOVA4 = "@prihodi_clanova4";

	private final static String MJESECNE_OBVEZE1 = "@mjesecne_obveze1";
	private final static String MJESECNE_OBVEZE2 = "@mjesecne_obveze2";
	private final static String MJESECNE_OBVEZE3 = "@mjesecne_obveze3";
	private final static String MJESECNE_OBVEZE4 = "@mjesecne_obveze4";
	private final static String MJESECNE_OBVEZE5 = "@mjesecne_obveze5";
	public final static String STATUS_KREDITA_ODBIJEN = "0";
	public final static String STATUS_KREDITA_ZAHTJEV = "1";
	public final static String STATUS_KREDITA_OCJENA = "2";
	public final static String STATUS_KREDITA_RIZIK = "3";
	public final static String STATUS_KREDITA_ODOBREN = "4";
	// vrsta kredita
	public final static String VRSTA_KREDITA_DUGOROCNI_ZADANO = "D";
	public final static String ORGANIZACIJSKA_JEDINICA_ZADANO = "14040";
	public final static String SIFRA_VALUTE_ZADANO = "978";

	/* Attributes names /> */
	/* </ Constructors */
	public KreditniZahtjevVo() {
		super();
	}

	public KreditniZahtjevVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public KreditniZahtjevOsobaVo getKreditniZahtjevOsoba() {
		return (KreditniZahtjevOsobaVo) getProperty(KREDITNI_ZAHTJEV_OSOBA);
	}

	public void setKreditniZahtjevOsoba(KreditniZahtjevOsobaVo value) {
		set(KREDITNI_ZAHTJEV_OSOBA, value);
	}

	// prihodi clanova
	public PrihodiClanovaVo getPrihodiClanova1() {
		if (getProperty(PRIHODI_CLANOVA1) == null)
			setPrihodiClanova1(new PrihodiClanovaVo());
		return (PrihodiClanovaVo) getProperty(PRIHODI_CLANOVA1);
	}

	public PrihodiClanovaVo getPrihodiClanova2() {
		if (getProperty(PRIHODI_CLANOVA2) == null)
			setPrihodiClanova2(new PrihodiClanovaVo());
		return (PrihodiClanovaVo) getProperty(PRIHODI_CLANOVA2);
	}

	public PrihodiClanovaVo getPrihodiClanova3() {
		if (getProperty(PRIHODI_CLANOVA3) == null)
			setPrihodiClanova3(new PrihodiClanovaVo());
		return (PrihodiClanovaVo) getProperty(PRIHODI_CLANOVA3);
	}

	public PrihodiClanovaVo getPrihodiClanova4() {
		if (getProperty(PRIHODI_CLANOVA4) == null)
			setPrihodiClanova4(new PrihodiClanovaVo());
		return (PrihodiClanovaVo) getProperty(PRIHODI_CLANOVA4);
	}

	public void setPrihodiClanova1(PrihodiClanovaVo value) {
		set(PRIHODI_CLANOVA1, value);
	}

	public void setPrihodiClanova2(PrihodiClanovaVo value) {
		set(PRIHODI_CLANOVA2, value);
	}

	public void setPrihodiClanova3(PrihodiClanovaVo value) {
		set(PRIHODI_CLANOVA3, value);
	}

	public void setPrihodiClanova4(PrihodiClanovaVo value) {
		set(PRIHODI_CLANOVA4, value);
	}

	// mjesecne obveze
	public MjesecneObvezeVo getMjesecneObveze1() {
		if (getProperty(MJESECNE_OBVEZE1) == null)
			setMjesecneObveze1(new MjesecneObvezeVo());
		return (MjesecneObvezeVo) getProperty(MJESECNE_OBVEZE1);
	}

	public MjesecneObvezeVo getMjesecneObveze2() {
		if (getProperty(MJESECNE_OBVEZE2) == null)
			setMjesecneObveze2(new MjesecneObvezeVo());
		return (MjesecneObvezeVo) getProperty(MJESECNE_OBVEZE2);
	}

	public MjesecneObvezeVo getMjesecneObveze3() {
		if (getProperty(MJESECNE_OBVEZE3) == null)
			setMjesecneObveze3(new MjesecneObvezeVo());
		return (MjesecneObvezeVo) getProperty(MJESECNE_OBVEZE3);
	}

	public MjesecneObvezeVo getMjesecneObveze4() {
		if (getProperty(MJESECNE_OBVEZE4) == null)
			setMjesecneObveze4(new MjesecneObvezeVo());
		return (MjesecneObvezeVo) getProperty(MJESECNE_OBVEZE4);
	}

	public MjesecneObvezeVo getMjesecneObveze5() {
		if (getProperty(MJESECNE_OBVEZE5) == null)
			setMjesecneObveze5(new MjesecneObvezeVo());
		return (MjesecneObvezeVo) getProperty(MJESECNE_OBVEZE5);
	}

	// setter
	public void setMjesecneObveze(MjesecneObvezeRs value) {
		if (value.getRowAt(0) != null)
			set(MJESECNE_OBVEZE1, value.getRowAt(0));
		if (value.getRowAt(1) != null)
			set(MJESECNE_OBVEZE2, value.getRowAt(1));
		if (value.getRowAt(2) != null)
			set(MJESECNE_OBVEZE3, value.getRowAt(2));
		if (value.getRowAt(3) != null)
			set(MJESECNE_OBVEZE4, value.getRowAt(3));
		if (value.getRowAt(4) != null)
			set(MJESECNE_OBVEZE5, value.getRowAt(4));
	}

	public void setPrihodiClanova(PrihodiClanovaRs value) {
		if (value.getRowAt(0) != null)
			set(PRIHODI_CLANOVA1, value.getRowAt(0));
		if (value.getRowAt(1) != null)
			set(PRIHODI_CLANOVA2, value.getRowAt(1));
		if (value.getRowAt(2) != null)
			set(PRIHODI_CLANOVA3, value.getRowAt(2));
		if (value.getRowAt(3) != null)
			set(PRIHODI_CLANOVA4, value.getRowAt(3));
	}

	public void setMjesecneObveze1(MjesecneObvezeVo value) {
		set(MJESECNE_OBVEZE1, value);
	}

	public void setMjesecneObveze2(MjesecneObvezeVo value) {
		set(MJESECNE_OBVEZE2, value);
	}

	public void setMjesecneObveze3(MjesecneObvezeVo value) {
		set(MJESECNE_OBVEZE3, value);
	}

	public void setMjesecneObveze4(MjesecneObvezeVo value) {
		set(MJESECNE_OBVEZE4, value);
	}

	public void setMjesecneObveze5(MjesecneObvezeVo value) {
		set(MJESECNE_OBVEZE5, value);
	}

	// mjesecne obveze
	public String getIdZahtjeva() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__ID_ZAHTJEVA);
	}

	public String getSifraZahtjeva() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__SIFRA_ZAHTJEVA);
	}

	public String getVrstaKredita() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__VRSTA_KREDITA);
	}

	public String getStatusKredita() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__STATUS_KREDITA);
	}

	public Calendar getDatumZaprimanja() {
		return getAsCalendar(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__DATUM_ZAPRIMANJA);
	}

	public Calendar getDatumOdobrenja() {
		return getAsCalendar(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__DATUM_ODOBRENJA);
	}

	public String getKreditniReferent() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__KREDITNI_REFERENT);
	}

	public String getDirektorDirekcije() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__DIREKTOR_DIREKCIJE);
	}

	public String getKontrolor() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__KONTROLOR);
	}

	public String getPravniSavjetnik() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__PRAVNI_SAVJETNIK);
	}

	public String getKontroKredita() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__KONTRO_KREDITA);
	}

	public String getBrojPartije() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__BROJ_PARTIJE);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__ORGANIZACIJSKA_JEDINICA);
	}

	public String getIznosKredita() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__IZNOS_KREDITA);
	}

	public String getSifraValute() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__SIFRA_VALUTE);
	}

	public String getRokOtplate() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__ROK_OTPLATE);
	}

	public String getTrazenaVrstaKredita() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__TRAZENA_VRSTA_KREDITA);
	}

	public String getDepozit() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__DEPOZIT);
	}

	public String getBrojTekucegRacuna() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__BROJ_TEKUCEG_RACUNA);
	}

	public String getOpisNamjene() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__OPIS_NAMJENE);
	}

	public String getNapomena() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__NAPOMENA);
	}

	public String getIzjava() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__IZJAVA);
	}

	public String getPrijedlog() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__PRIJEDLOG);
	}

	public String getJamacSuduznik1() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK1);
	}

	public String getJamacSuduznik2() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK2);
	}

	public String getJamacSuduznik3() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK3);
	}

	public String getJamacSuduznik4() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK4);
	}

	public String getIzjavaJmbg1() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JMBG1);
	}

	public String getIzjavaJmbg2() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JMBG2);
	}

	public String getIzjavaJmbg3() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JMBG3);
	}

	public String getIzjavaJmbg4() {
		return getAsStringOrEmpty(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JMBG4);
	}

	public void setIdZahtjeva(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__ID_ZAHTJEVA, value);
	}

	public void setSifraZahtjeva(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__SIFRA_ZAHTJEVA, value);
	}

	public void setVrstaKredita(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__VRSTA_KREDITA, value);
	}

	public void setStatusKredita(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__STATUS_KREDITA, value);
	}

	public void setDatumZaprimanja(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__DATUM_ZAPRIMANJA);
	}

	public void setDatumOdobrenja(Calendar value) {
		setCalendarAsDateString(value,
				JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__DATUM_ODOBRENJA);
	}

	public void setKreditniReferent(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__KREDITNI_REFERENT, value);
	}

	public void setDirektorDirekcije(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__DIREKTOR_DIREKCIJE, value);
	}

	public void setKontrolor(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__KONTROLOR, value);
	}

	public void setPravniSavjetnik(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__PRAVNI_SAVJETNIK, value);
	}

	public void setKontroKredita(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__KONTRO_KREDITA, value);
	}

	public void setBrojPartije(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__BROJ_PARTIJE, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__ORGANIZACIJSKA_JEDINICA,
				value);
	}

	public void setIznosKredita(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__IZNOS_KREDITA, value);
	}

	public void setSifraValute(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__SIFRA_VALUTE, value);
	}

	public void setRokOtplate(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__ROK_OTPLATE, value);
	}

	public void setTrazenaVrstaKredita(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__TRAZENA_VRSTA_KREDITA,
				value);
	}

	public void setDepozit(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__DEPOZIT, value);
	}

	public void setBrojTekucegRacuna(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__BROJ_TEKUCEG_RACUNA, value);
	}

	public void setOpisNamjene(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__OPIS_NAMJENE, value);
	}

	public void setNapomena(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__NAPOMENA, value);
	}

	public void setIzjava(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__IZJAVA, value);
	}

	public void setPrijedlog(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__PRIJEDLOG, value);
	}

	public void setJamacSuduznik1(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK1, value);
	}

	public void setJamacSuduznik2(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK2, value);
	}

	public void setJamacSuduznik3(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK3, value);
	}

	public void setJamacSuduznik4(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JAMAC_SUDUZNIK4, value);
	}

	public void setIzjavaJmbg1(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JMBG1, value);
	}

	public void setIzjavaJmbg2(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JMBG2, value);
	}

	public void setIzjavaJmbg3(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JMBG3, value);
	}

	public void setIzjavaJmbg4(String value) {
		set(JBDataDictionary.JB_GR_KREDITNI_ZAHTJEV__JMBG4, value);
	}
	/* Setters /> */
}