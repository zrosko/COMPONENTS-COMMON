package hr.adriacomsoftware.app.common.pranjenovca.gr.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

/**
 * 
 */
public class PrnGrRacunVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String PRN_GR_UPITNIK_RACUN__ID_UPITNIKA = "id_upitnika";
	public static String PRN_GR_UPITNIK_RACUN__SVRHA_OTVARANJA_RACUNA = "svrha_otvaranja_racuna";
	public static String PRN_GR_UPITNIK_RACUN__RACUN_U_IME_DRUGOGA = "racun_u_ime_drugoga";
	public static String PRN_GR_UPITNIK_RACUN__RACUN_U_IME_DRUGOGA_OPIS = "racun_u_ime_drugoga_opis";
	public static String PRN_GR_UPITNIK_RACUN__DOKAZ_OVLASTENOSTI_ZASTUPANJA = "dokaz_ovlastenosti_zastupanja";
	public static String PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_GOTOVINSKA = "vrsta_prometa_gotovinska";
	public static String PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_BEZGOTOVINSKA = "vrsta_prometa_bezgotovinska";
	public static String PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_PREKOGRANICNA = "vrsta_prometa_prekogranicna";
	public static String PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_STEDNJA_ULAGANJA = "vrsta_prometa_stednja_ulaganja";
	public static String PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_OSTALO = "vrsta_prometa_ostalo";
	public static String PRN_GR_UPITNIK_RACUN__GOTOVINSKA_TRANSAKCIJA = "gotovinska_transakcija";
	public static String PRN_GR_UPITNIK_RACUN__GOTOVINSKA_TRANSAKCIJA_SVRHA = "gotovinska_transakcija_svrha";
	public static String PRN_GR_UPITNIK_RACUN__PROSJECNI_IZNOS = "prosjecni_iznos";
	public static String PRN_GR_UPITNIK_RACUN__PROSJECNI_IZNOS_VALUTA = "prosjecni_iznos_valuta";
	public static String PRN_GR_UPITNIK_RACUN__OCEKIVANI_GODISNJI_PROMET = "ocekivani_godisnji_promet";
	public static String PRN_GR_UPITNIK_RACUN__OCEKIVANI_GODISNJI_PROMET_GODINA = "ocekivani_godisnji_promet_godina";
	public static String PRN_GR_UPITNIK_RACUN__IZVOR_SREDSTAVA_NA_RACUN_PLACA = "izvor_sredstava_na_racun_placa";
	public static String PRN_GR_UPITNIK_RACUN__IZVOR_SREDSTAVA_NA_RACUN_OSTALO = "izvor_sredstava_na_racun_ostalo";
	public static String PRN_GR_UPITNIK_RACUN__DATUM_ANALIZE = "datum_analize";
	public static String PRN_GR_UPITNIK_RACUN__ZADNJA_PROMJENA_VRIJEME = "zadnja_promjena_vrijeme";

	/* Attributes names /> */
	/* </ Constructors */
	public PrnGrRacunVo() {
		super();
	}

	public PrnGrRacunVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */

	/* </ Getters */

	public String getIdUpitnika() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__ID_UPITNIKA);
	}

	public String getSvrhaOtvaranjaRacuna() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__SVRHA_OTVARANJA_RACUNA);
	}

	public String getRacunUImeDrugoga() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__RACUN_U_IME_DRUGOGA);
	}

	public String getRacunUImeDrugogaOpis() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__RACUN_U_IME_DRUGOGA_OPIS);
	}

	public String getDokazOvlastenostiZastupanja() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__DOKAZ_OVLASTENOSTI_ZASTUPANJA);
	}

	public String getVrstaPrometaGotovinska() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_GOTOVINSKA);
	}

	public String getVrstaPrometaBezgotovinska() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_BEZGOTOVINSKA);
	}

	public String getVrstaPrometaPrekogranicna() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_PREKOGRANICNA);
	}

	public String getVrstaPrometaStednjaUlaganja() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_STEDNJA_ULAGANJA);
	}

	public String getVrstaPrometaOstalo() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_OSTALO);
	}

	public String getGotovinskaTransakcija() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__GOTOVINSKA_TRANSAKCIJA);
	}

	public String getGotovinskaTransakcijaSvrha() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__GOTOVINSKA_TRANSAKCIJA_SVRHA);
	}

	public String getProsjecniIznos() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__PROSJECNI_IZNOS);
	}

	public String getProsjecniIznosValuta() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__PROSJECNI_IZNOS_VALUTA);
	}

	public String getOcekivaniGodisnjiPromet() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__OCEKIVANI_GODISNJI_PROMET);
	}

	public String getOcekivaniGodisnjiPrometGodina() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__OCEKIVANI_GODISNJI_PROMET_GODINA);
	}

	public String getIzvorSredstavaNaRacunPlaca() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__IZVOR_SREDSTAVA_NA_RACUN_PLACA);
	}

	public String getIzvorSredstavaNaRacunOstalo() {
		return getAsStringOrEmpty(PRN_GR_UPITNIK_RACUN__IZVOR_SREDSTAVA_NA_RACUN_OSTALO);
	}

	public Calendar getDatumAnalize() {
		return getAsCalendar(PRN_GR_UPITNIK_RACUN__DATUM_ANALIZE);
	}

	public Calendar getZadnjaPromjenaVrijeme() {
		return getAsCalendar(PRN_GR_UPITNIK_RACUN__ZADNJA_PROMJENA_VRIJEME);
	}

	public void setIdUpitnika(String value) {
		set(PRN_GR_UPITNIK_RACUN__ID_UPITNIKA, value);
	}

	public void setSvrhaOtvaranjaRacuna(String value) {
		set(PRN_GR_UPITNIK_RACUN__SVRHA_OTVARANJA_RACUNA, value);
	}

	public void setRacunUImeDrugoga(String value) {
		set(PRN_GR_UPITNIK_RACUN__RACUN_U_IME_DRUGOGA, value);
	}

	public void setRacunUImeDrugogaOpis(String value) {
		set(PRN_GR_UPITNIK_RACUN__RACUN_U_IME_DRUGOGA_OPIS, value);
	}

	public void setDokazOvlastenostiZastupanja(String value) {
		set(PRN_GR_UPITNIK_RACUN__DOKAZ_OVLASTENOSTI_ZASTUPANJA, value);
	}

	public void setVrstaPrometaGotovinska(String value) {
		set(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_GOTOVINSKA, value);
	}

	public void setVrstaPrometaBezgotovinska(String value) {
		set(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_BEZGOTOVINSKA, value);
	}

	public void setVrstaPrometaPrekogranicna(String value) {
		set(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_PREKOGRANICNA, value);
	}

	public void setVrstaPrometaStednjaUlaganja(String value) {
		set(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_STEDNJA_ULAGANJA, value);
	}

	public void setVrstaPrometaOstalo(String value) {
		set(PRN_GR_UPITNIK_RACUN__VRSTA_PROMETA_OSTALO, value);
	}

	public void setGotovinskaTransakcija(String value) {
		set(PRN_GR_UPITNIK_RACUN__GOTOVINSKA_TRANSAKCIJA, value);
	}

	public void setGotovinskaTransakcijaSvrha(String value) {
		set(PRN_GR_UPITNIK_RACUN__GOTOVINSKA_TRANSAKCIJA_SVRHA, value);
	}

	public void setProsjecniIznos(String value) {
		set(PRN_GR_UPITNIK_RACUN__PROSJECNI_IZNOS, value);
	}

	public void setProsjecniIznosValuta(String value) {
		set(PRN_GR_UPITNIK_RACUN__PROSJECNI_IZNOS_VALUTA, value);
	}

	public void setOcekivaniGodisnjiPromet(String value) {
		set(PRN_GR_UPITNIK_RACUN__OCEKIVANI_GODISNJI_PROMET, value);
	}

	public void setOcekivaniGodisnjiPrometGodina(String value) {
		set(PRN_GR_UPITNIK_RACUN__OCEKIVANI_GODISNJI_PROMET_GODINA, value);
	}

	public void setIzvorSredstavaNaRacunPlaca(String value) {
		set(PRN_GR_UPITNIK_RACUN__IZVOR_SREDSTAVA_NA_RACUN_PLACA, value);
	}

	public void setIzvorSredstavaNaRacunOstalo(String value) {
		set(PRN_GR_UPITNIK_RACUN__IZVOR_SREDSTAVA_NA_RACUN_OSTALO, value);
	}

	public void setDatumAnalize(Calendar value) {
		setCalendarAsDateString(value, PRN_GR_UPITNIK_RACUN__DATUM_ANALIZE);
	}

	public void setZadnjaPromjenaVrijeme(Calendar value) {
		setCalendarAsDateString(value,
				PRN_GR_UPITNIK_RACUN__ZADNJA_PROMJENA_VRIJEME);
	}

	/* Setters /> */
}