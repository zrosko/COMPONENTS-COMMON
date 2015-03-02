package hr.adriacomsoftware.app.common.studija.dto;

import hr.as2.inf.common.data.AS2Record;

public class InvRadVo extends InvVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String INV_RAD__ID_RADA = "id_rada";
	public static String INV_RAD__ID_PLANA = "id_plana";
	public static String INV_RAD__BROJ = "broj";
	public static String INV_RAD__NAZIV_RADNOG_MJESTA = "naziv_radnog_mjesta";
	public static String INV_RAD__KOLICINA = "kolicina";
	public static String INV_RAD__PLACA_BRUTO = "placa_bruto";
	public static String INV_RAD__PLACA_NETO = "placa_neto";

	/* Attributes names /> */
	/* </ Constructors */
	public InvRadVo() {
		super();
	}

	public InvRadVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	public String getIdRada() {
		return get(INV_RAD__ID_RADA);
	}

	public void setIdRada(String value) {
		set(INV_RAD__ID_RADA, value);
	}
	// TODO
}