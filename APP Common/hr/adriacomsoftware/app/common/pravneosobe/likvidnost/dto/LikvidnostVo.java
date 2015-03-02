package hr.adriacomsoftware.app.common.pravneosobe.likvidnost.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class LikvidnostVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__ID = "id";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__DUGUJE_POTRAZUJE = "duguje_potrazuje";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__KREDITOR = "kreditor";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__KORISNIK_KREDITA = "korisnik_kredita";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__IZNOS = "iznos";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__DATUM_ODOBRENJA = "datum_odobrenja";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__ROK = "rok";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__KAMATNA_STOPA = "kamatna_stopa";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__OPIS = "opis";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__ISPRAVNO = "ispravno";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__MATICNI_BROJ_KREDITORA = "maticni_broj_kreditora";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__MATICNI_BROJ_KORISNIKA_KREDITA = "maticni_broj_korisnika_kredita";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__OIB_KREDITORA = "oib_kreditora";
	public static String BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__OIB_KORISNIKA_KREDITA = "oib_korisnika_kredita"; /*
																											 * Attributes
																											 * names
																											 * /
																											 * >
																											 */

	/* </ Constructors */
	public LikvidnostVo() {
		super();
	}

	public LikvidnostVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getId() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__ID);
	}

	public String getDugujePotrazuje() {
		String _value = get(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__DUGUJE_POTRAZUJE);
		if (_value.equals("1"))
			return "Dano";
		else if (_value.equals("-1"))
			return "Primljeno";
		else
			return null;
	}

	public String getKreditor() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__KREDITOR);
	}

	public String getKorisnikKredita() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__KORISNIK_KREDITA);
	}

	public String getIznos() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__IZNOS);
	}

	// public Calendar getDatumOdobrenja() {
	// return
	// getPropertyAsCalendar(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__DATUM_ODOBRENJA);
	// }
	// public Calendar getRok() {
	// return getPropertyAsCalendar(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__ROK);
	// }
	public String getKamatnaStopa() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__KAMATNA_STOPA);
	}

	public String getOpis() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__OPIS);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__ISPRAVNO);
	}

	public String getMaticniBrojKreditora() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__MATICNI_BROJ_KREDITORA);
	}

	public String getMaticniBrojKorisnikaKredita() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__MATICNI_BROJ_KORISNIKA_KREDITA);
	}

	public String getOibKreditora() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__OIB_KREDITORA);
	}

	public String getOibKorisnikaKredita() {
		return getAsStringOrEmpty(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__OIB_KORISNIKA_KREDITA);
	}

	public void setId(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__ID, value);
	}

	public void setDugujePotrazuje(String value) {
		if (value.equals("Dano"))
			set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__DUGUJE_POTRAZUJE, "1");
		else if (value.equals("Primljeno"))
			set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__DUGUJE_POTRAZUJE, "-1");
		else
			delete(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__DUGUJE_POTRAZUJE);
	}

	public void setKreditor(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__KREDITOR, value);
	}

	public void setKorisnikKredita(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__KORISNIK_KREDITA, value);
	}

	public void setIznos(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__IZNOS, value);
	}

	// public void setDatumOdobrenja(Calendar value) {
	// setPropertyCalendarAsDateString(value,
	// BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__DATUM_ODOBRENJA);
	// }
	// public void setRok(Calendar value) {
	// setPropertyCalendarAsDateString(value,
	// BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__ROK);
	// }
	public void setKamatnaStopa(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__KAMATNA_STOPA, value);
	}

	public void setOpis(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__OPIS, value);
	}

	public void setIspravno(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__ISPRAVNO, value);
	}

	public void setMaticniBrojKreditora(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__MATICNI_BROJ_KREDITORA, value);
	}

	public void setMaticniBrojKorisnikaKredita(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__MATICNI_BROJ_KORISNIKA_KREDITA,
				value);
	}

	public void setOibKreditora(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__OIB_KREDITORA, value);
	}

	public void setOibKorisnikaKredita(String value) {
		set(BANKA_KREDITI_DEPOZITI_LIKVIDNOSTI__OIB_KORISNIKA_KREDITA, value);
	}
	/* Setters /> */
}