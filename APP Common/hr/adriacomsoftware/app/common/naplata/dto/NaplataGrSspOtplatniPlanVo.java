package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class NaplataGrSspOtplatniPlanVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String NAPLATA_KLIJENT_OTPLATNI_PLAN__ID_PLANA = "id_plana";
	public static String NAPLATA_KLIJENT_OTPLATNI_PLAN__DATUM_UPLATE_PLANIRANI = "datum_uplate_planirani";
	public static String NAPLATA_KLIJENT_OTPLATNI_PLAN__IZNOS_RATE_PLANIRANI = "iznos_rate_planirani";
	public static String NAPLATA_KLIJENT_OTPLATNI_PLAN__VRIJEME_UNOSA_IZMJENE = "vrijeme_unosa_izmjene";
	public static String NAPLATA_KLIJENT_OTPLATNI_PLAN__REFERENT = "referent";
	public static String NAPLATA_KLIJENT_OTPLATNI_PLAN__ID_BILJESKE = "id_biljeske";
	public static String NAPLATA_KLIJENT_OTPLATNI_PLAN__ISPRAVNO = "ispravno";

	/* Attributes names /> */
	/* </ Constructors */
	public NaplataGrSspOtplatniPlanVo() {
		super();
	}

	public NaplataGrSspOtplatniPlanVo(AS2Record value) {
		super(value);
	}

	public String getIdPlana() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_OTPLATNI_PLAN__ID_PLANA);
	}

	// public Calendar getDatumUplatePlanirani() {
	// return
	// getAsCalendar(NAPLATA_KLIJENT_OTPLATNI_PLAN__DATUM_UPLATE_PLANIRANI);
	// }
	public String getIznosRatePlanirani() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_OTPLATNI_PLAN__IZNOS_RATE_PLANIRANI);
	}

	public Calendar getVrijemeUnosaIzmjene() {
		return getAsCalendar(NAPLATA_KLIJENT_OTPLATNI_PLAN__VRIJEME_UNOSA_IZMJENE);
	}

	public String getReferent() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_OTPLATNI_PLAN__REFERENT);
	}

	public String getIdBiljeske() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_OTPLATNI_PLAN__ID_BILJESKE);
	}

	public String getIspravno() {
		return getAsStringOrEmpty(NAPLATA_KLIJENT_OTPLATNI_PLAN__ISPRAVNO);
	}

	public void setIdPlana(String value) {
		set(NAPLATA_KLIJENT_OTPLATNI_PLAN__ID_PLANA, value);
	}

	// public void setDatumUplatePlanirani(Calendar value) {
	// setCalendarAsDateString(value,
	// NAPLATA_KLIJENT_OTPLATNI_PLAN__DATUM_UPLATE_PLANIRANI);
	// }
	public void setIznosRatePlanirani(String value) {
		set(NAPLATA_KLIJENT_OTPLATNI_PLAN__IZNOS_RATE_PLANIRANI, value);
	}

	public void setVrijemeUnosaIzmjene(Calendar value) {
		setCalendarAsDateString(value,
				NAPLATA_KLIJENT_OTPLATNI_PLAN__VRIJEME_UNOSA_IZMJENE);
	}

	public void setReferent(String value) {
		set(NAPLATA_KLIJENT_OTPLATNI_PLAN__REFERENT, value);
	}

	public void setIdBiljeske(String value) {
		set(NAPLATA_KLIJENT_OTPLATNI_PLAN__ID_BILJESKE, value);
	}

	public void setIspravno(String value) {
		set(NAPLATA_KLIJENT_OTPLATNI_PLAN__ISPRAVNO, value);
	}

}