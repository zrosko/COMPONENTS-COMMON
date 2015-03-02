package hr.adriacomsoftware.app.common.or.dto;

import hr.as2.inf.common.data.AS2Record;

/**
 * 
 */
public class OrPoslovnaLinijaVo extends OperativniRizikVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String OR_POSLOVNA_LINIJA__ID_POSLOVNE_LINIJE = "id_poslovne_linije";
	public static String OR_POSLOVNA_LINIJA__NAZIV = "naziv";
	public static String OR_POSLOVNA_LINIJA__OPIS = "opis";
	public static String OR_POSLOVNA_LINIJA__STOPA_KAPITALNOG_ZAHTJEVA = "stopa_kapitalnog_zahtjeva";

	/* Attributes names /> */
	/* </ Constructors */
	public OrPoslovnaLinijaVo() {
		super();
	}

	public OrPoslovnaLinijaVo(AS2Record value) {
		super(value);
	}

	/* </ Getters */
	public String getIdPoslovneLinije() {
		return getAsStringOrEmpty(OR_POSLOVNA_LINIJA__ID_POSLOVNE_LINIJE);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(OR_POSLOVNA_LINIJA__NAZIV);
	}

	public String getOpis() {
		return getAsStringOrEmpty(OR_POSLOVNA_LINIJA__OPIS);
	}

	public String getStopaKapitalnogZahtjeva() {
		return getAsStringOrEmpty(OR_POSLOVNA_LINIJA__STOPA_KAPITALNOG_ZAHTJEVA);
	}

	public void setIdPoslovneLinije(String value) {
		set(OR_POSLOVNA_LINIJA__ID_POSLOVNE_LINIJE, value);
	}

	public void setNaziv(String value) {
		set(OR_POSLOVNA_LINIJA__NAZIV, value);
	}

	public void setOpis(String value) {
		set(OR_POSLOVNA_LINIJA__OPIS, value);
	}

	public void setStopaKapitalnogZahtjeva(String value) {
		set(OR_POSLOVNA_LINIJA__STOPA_KAPITALNOG_ZAHTJEVA, value);
	}
	/* Setters /> */
}