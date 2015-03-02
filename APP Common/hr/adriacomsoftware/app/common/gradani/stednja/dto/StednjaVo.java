package hr.adriacomsoftware.app.common.gradani.stednja.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class StednjaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public final static String DATUM = "datum";
	public final static String ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public final static String PROFITNI_CENTAR = "profitni_centar";
	public final static String OZNAKA_STEDNJE = "oznaka_stednje";
	public final static String ROCNOST = "rocnost";
	public final static String VALUTNA_KLAUZULA = "valutna_klauzula";
	public final static String TRANSAKCIJE = "transakcije";

	/* Attributes names /> */

	/* </ Constructors */
	public StednjaVo() {
		super();
	}

	public StednjaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */

	/* </ Getters */
	public Calendar getDatum() {
		return getAsCalendar(DATUM);
	}

	public String getOrganizacijskaJedinica() {
		return getAsStringOrEmpty(ORGANIZACIJSKA_JEDINICA);
	}

	public String getProfitniCentar() {
		return getAsStringOrEmpty(PROFITNI_CENTAR);
	}

	public String getOznakaValute() {
		return getAsStringOrEmpty(OZNAKA_STEDNJE);
	}

	public String getRocnost() {
		return getAsStringOrEmpty(ROCNOST);
	}

	public String getValutnaKlauzula() {
		return getAsStringOrEmpty(VALUTNA_KLAUZULA);
	}

	public String getTransakcije() {
		return getAsStringOrEmpty(TRANSAKCIJE);
	}

	/* Getters /> */

	/* </ Setters */
	public void setDatum(Calendar value) {
		setCalendarAsDateString(value, DATUM);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setProfitniCentar(String value) {
		set(PROFITNI_CENTAR, value);
	}

	public void setOznakaValute(String value) {
		set(OZNAKA_STEDNJE, value);
	}

	public void setRocnost(String value) {
		set(ROCNOST, value);
	}

	public void setValutnaKlauzula(String value) {
		set(VALUTNA_KLAUZULA, value);
	}

	public void setTransakcije(String value) {
		set(TRANSAKCIJE, value);
	}
	/* Setters /> */
}