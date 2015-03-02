package hr.adriacomsoftware.app.common.naplata.dto;

import hr.as2.inf.common.data.AS2Record;

/************* CONSTANTS naplata_gr_ssp_privitak ************/

public class NaplataGrSspPrivitakVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	public static String NAPLATA_GR_SSP_PRIVITAK__ID_PRIVITKA = "id_privitka";
	public static String NAPLATA_GR_SSP_PRIVITAK__DOKUMENT = "dokument";
	public static String NAPLATA_GR_SSP_PRIVITAK__NAZIV_DOKUMENTA = "naziv_dokumenta";
	public static String NAPLATA_GR_SSP_PRIVITAK__ID_BILJESKE = "id_biljeske";
	public static String NAPLATA_GR_SSP_PRIVITAK__ISPRAVNO = "ispravno";

	public NaplataGrSspPrivitakVo() {
		super();
	}

	public NaplataGrSspPrivitakVo(AS2Record value) {
		super(value);
	}

	/************* GETTERS ************/

	public String getIdPrivitka() {
		return get(NAPLATA_GR_SSP_PRIVITAK__ID_PRIVITKA);
	}

	public String getDokument() {
		return get(NAPLATA_GR_SSP_PRIVITAK__DOKUMENT);
	}

	public String getNazivDokumenta() {
		return get(NAPLATA_GR_SSP_PRIVITAK__NAZIV_DOKUMENTA);
	}

	public String getIdBiljeske() {
		return get(NAPLATA_GR_SSP_PRIVITAK__ID_BILJESKE);
	}

	public String getIspravno() {
		return get(NAPLATA_GR_SSP_PRIVITAK__ISPRAVNO);
	}

	/************* SETTERS ************/

	public void setIdPrivitka(String value) {
		set(NAPLATA_GR_SSP_PRIVITAK__ID_PRIVITKA, value);
	}

	public void setDokument(String value) {
		set(NAPLATA_GR_SSP_PRIVITAK__DOKUMENT, value);
	}

	public void setNazivDokumenta(String value) {
		set(NAPLATA_GR_SSP_PRIVITAK__NAZIV_DOKUMENTA, value);
	}

	public void setIdBiljeske(String value) {
		set(NAPLATA_GR_SSP_PRIVITAK__ID_BILJESKE, value);
	}

	public void setIspravno(String value) {
		set(NAPLATA_GR_SSP_PRIVITAK__ISPRAVNO, value);
	}

}