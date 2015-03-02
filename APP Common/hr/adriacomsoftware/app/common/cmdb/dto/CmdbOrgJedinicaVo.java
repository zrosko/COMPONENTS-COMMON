package hr.adriacomsoftware.app.common.cmdb.dto;

import hr.as2.inf.common.data.AS2Record;

public class CmdbOrgJedinicaVo extends CmdbVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static String BI_ORGANIZACIJSKA_JEDINICA__ID_ORGANIZACIJSKE_JEDINICE = "id_organizacijske_jedinice";
	public static String BI_ORGANIZACIJSKA_JEDINICA__ORGANIZACIJSKA_JEDINICA = "organizacijska_jedinica";
	public static String BI_ORGANIZACIJSKA_JEDINICA__NOVA_ORG_JEDINICA = "nova_org_jedinica";
	public static String BI_ORGANIZACIJSKA_JEDINICA__NAZIV = "naziv";
	public static String BI_ORGANIZACIJSKA_JEDINICA__ULICA = "ulica";
	public static String BI_ORGANIZACIJSKA_JEDINICA__POSTANSKI_BROJ = "postanski_broj";
	public static String BI_ORGANIZACIJSKA_JEDINICA__MJESTO = "mjesto";
	public static String BI_ORGANIZACIJSKA_JEDINICA__TELEFON = "telefon";
	public static String BI_ORGANIZACIJSKA_JEDINICA__HIJERARHIJSKA_RAZINA = "hijerarhijska_razina";
	public static String BI_ORGANIZACIJSKA_JEDINICA__NADREDENA_ORG_JEDINICA = "nadredena_org_jedinica";
	public static String BI_ORGANIZACIJSKA_JEDINICA__PROFITNI_CENTAR = "profitni_centar";
	public static String BI_ORGANIZACIJSKA_JEDINICA__ZONA_BROJEVA = "zona_brojeva";

	/* Attributes names /> */
	/* </ Constructors */
	public CmdbOrgJedinicaVo() {
		super();
	}

	public CmdbOrgJedinicaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters/Setters */
	public String getIdOrganizacijskeJedinice() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__ID_ORGANIZACIJSKE_JEDINICE);
	}

	public String getOrganizacijskaJedinica() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__ORGANIZACIJSKA_JEDINICA);
	}

	public String getNovaOrgJedinica() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__NOVA_ORG_JEDINICA);
	}

	public String getNaziv() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__NAZIV);
	}

	public String getUlica() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__ULICA);
	}

	public String getPostanskiBroj() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__POSTANSKI_BROJ);
	}

	public String getMjesto() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__MJESTO);
	}

	public String getTelefon() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__TELEFON);
	}

	public String getHijerarhijskaRazina() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__HIJERARHIJSKA_RAZINA);
	}

	public String getNadredenaOrgJedinica() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__NADREDENA_ORG_JEDINICA);
	}

	public String getProfitniCentar() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__PROFITNI_CENTAR);
	}

	public String getZonaBrojeva() {
		return getAsString(BI_ORGANIZACIJSKA_JEDINICA__ZONA_BROJEVA);
	}

	public void setIdOrganizacijskeJedinice(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__ID_ORGANIZACIJSKE_JEDINICE, value);
	}

	public void setOrganizacijskaJedinica(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__ORGANIZACIJSKA_JEDINICA, value);
	}

	public void setNovaOrgJedinica(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__NOVA_ORG_JEDINICA, value);
	}

	public void setNaziv(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__NAZIV, value);
	}

	public void setUlica(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__ULICA, value);
	}

	public void setPostanskiBroj(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__POSTANSKI_BROJ, value);
	}

	public void setMjesto(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__MJESTO, value);
	}

	public void setTelefon(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__TELEFON, value);
	}

	public void setHijerarhijskaRazina(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__HIJERARHIJSKA_RAZINA, value);
	}

	public void setNadredenaOrgJedinica(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__NADREDENA_ORG_JEDINICA, value);
	}

	public void setProfitniCentar(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__PROFITNI_CENTAR, value);
	}

	public void setZonaBrojeva(String value) {
		set(BI_ORGANIZACIJSKA_JEDINICA__ZONA_BROJEVA, value);
	}

	/* Getters/Setters /> */
}