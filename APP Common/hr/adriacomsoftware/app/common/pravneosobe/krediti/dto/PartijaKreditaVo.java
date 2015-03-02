package hr.adriacomsoftware.app.common.pravneosobe.krediti.dto;

import hr.adriacomsoftware.app.common.jb.dto.PartijaVo;
import hr.as2.inf.common.data.AS2Record;

public class PartijaKreditaVo extends PartijaVo {
	private static final long serialVersionUID = 1L;
	public static String BI_PARTIJA_KREDITA_NAZIV = "naziv"; // G,K,O -
	public static String BI_PARTIJA_KREDITA_MATICNI_BROJ = "maticni_broj";
	public static String BI_PARTIJA_KREDITA_IZNOS_KREDITA = "iznos_kredita";
	public static String BI_PARTIJA_KREDITA_GLAVNI_DUG = "glavni_dug";
	public static String BI_PARTIJA_KREDITA_DOSPJELA_RATA = "dospjela_rata";
	public static String BI_PARTIJA_KREDITA_KAMATNA_STOPA = "kamatna_stopa";
	public static String BI_PARTIJA_KREDITA_VALUTA_RACUNA = "valuta_racuna";
	public static String BI_PARTIJA_KREDITA_OCJENA = "ocjena";
	public static String BI_PARTIJA_KREDITA_OSNOVNI_KONTO = "osnovni_konto";
	public static String BI_PARTIJA_KREDITA_PROGRAM = "program";
	// dodatak
	public static String BI_PARTIJA_KREDITA_IZNOS_KREDITA_DO = "iznos_kredita_do";
	public static String BI_PARTIJA_KREDITA_GLAVNI_DUG_DO = "glavni_dug_do";
	public static String BI_PARTIJA_KREDITA_DOSPJELA_RATA_DO = "dospjela_rata_do";

	public PartijaKreditaVo() {
		super();
	}

	public PartijaKreditaVo(AS2Record value) {
		super(value);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_NAZIV);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_MATICNI_BROJ);
	}

	public String getIznosKredita() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_IZNOS_KREDITA).replace(
				'.', ',');
	}

	public String getGlavniDug() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_GLAVNI_DUG).replace('.',
				',');
	}

	public String getDospjelaRata() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_DOSPJELA_RATA).replace(
				'.', ',');
	}

	public String getIznosKreditaDo() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_IZNOS_KREDITA_DO).replace(
				'.', ',');
	}

	public String getGlavniDugDo() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_GLAVNI_DUG_DO).replace(
				'.', ',');
	}

	public String getDospjelaRataDo() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_DOSPJELA_RATA_DO).replace(
				'.', ',');
	}

	public String getKamatnaStopa() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_KAMATNA_STOPA).replace(
				'.', ',');
	}

	public String getValutaRacuna() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_VALUTA_RACUNA);
	}

	public String getOcjena() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_OCJENA);
	}

	public String getOsnovniKonto() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_OSNOVNI_KONTO);
	}

	public String getProgram() {
		return getAsStringOrEmpty(BI_PARTIJA_KREDITA_PROGRAM);
	}

	// setters
	public void setNaziv(String value) {
		set(BI_PARTIJA_KREDITA_NAZIV, value);
	}

	public void setMaticniBroj(String value) {
		set(BI_PARTIJA_KREDITA_MATICNI_BROJ, value);
	}

	public void setIznosKredita(String value) {
		value = value.replace(',', '.');
		set(BI_PARTIJA_KREDITA_IZNOS_KREDITA, value);
	}

	public void setGlavniDug(String value) {
		value = value.replace(',', '.');
		set(BI_PARTIJA_KREDITA_GLAVNI_DUG, value);
	}

	public void setDospjelaRata(String value) {
		value = value.replace(',', '.');
		set(BI_PARTIJA_KREDITA_DOSPJELA_RATA, value);
	}

	public void setIznosKreditaDo(String value) {
		value = value.replace(',', '.');
		set(BI_PARTIJA_KREDITA_IZNOS_KREDITA_DO, value);
	}

	public void setGlavniDugDo(String value) {
		value = value.replace(',', '.');
		set(BI_PARTIJA_KREDITA_GLAVNI_DUG_DO, value);
	}

	public void setDospjelaRataDo(String value) {
		value = value.replace(',', '.');
		set(BI_PARTIJA_KREDITA_DOSPJELA_RATA_DO, value);
	}

	public void setKamatnaStopa(String value) {
		value = value.replace(',', '.');
		set(BI_PARTIJA_KREDITA_KAMATNA_STOPA, value);
	}

	public void setValutaRacuna(String value) {
		set(BI_PARTIJA_KREDITA_VALUTA_RACUNA, value);
	}

	public void setOcjena(String value) {
		set(BI_PARTIJA_KREDITA_OCJENA, value);
	}

	public void setOsnovniKonto(String value) {
		set(BI_PARTIJA_KREDITA_OSNOVNI_KONTO, value);
	}

	public void setProgram(String value) {
		set(BI_PARTIJA_KREDITA_PROGRAM, value);
	}
}