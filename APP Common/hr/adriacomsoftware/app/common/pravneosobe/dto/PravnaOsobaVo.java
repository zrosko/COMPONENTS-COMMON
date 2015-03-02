package hr.adriacomsoftware.app.common.pravneosobe.dto;

import hr.adriacomsoftware.app.common.datadictionary.JBDataDictionary;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

public class PravnaOsobaVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public final static String TEST = "test";
	public static String PO_OSOBA__NAZIV = "naziv";
	public static String PO_OSOBA__MATICNI_BROJ = "maticni_broj";
	public static String PO_OSOBA__OIB = "oib";

	/* Attributes names /> */
	/* </ Constructors */
	public PravnaOsobaVo() {
		super();
	}

	public PravnaOsobaVo(AS2Record value) {
		super(value);
	}

	/* </ Getters */
	public String getNaziv() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PRAVNA_OSOBA__NAZIV);
	}

	public String getMaticniBroj() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PRAVNA_OSOBA__MATICNI_BROJ);
	}

	public String getOcjenaObjektivna() {
		return getAsStringOrEmpty(JBDataDictionary.BI_PRAVNA_OSOBA__OCJENA_OBJEKTIVNA);
	}

	/* Getters /> */
	/* </ Setters */
	public void setNaziv(String value) {
		String oldValue = getNaziv();
		set(PO_OSOBA__NAZIV, value);
		firePropertyChange(PO_OSOBA__NAZIV, oldValue, value);
	}

	public void setMaticniBroj(String value) {
		String oldValue = getMaticniBroj();
		set(PO_OSOBA__MATICNI_BROJ, value);
		firePropertyChange(PO_OSOBA__MATICNI_BROJ, oldValue, value);
	}

	public void setOib(String value) {
		String oldValue = getOib();
		set(PO_OSOBA__OIB, value);
		firePropertyChange(PO_OSOBA__OIB, oldValue, value);
	}

	public void setOcjenaObjektivna(String value) {
		set(JBDataDictionary.BI_PRAVNA_OSOBA__OCJENA_OBJEKTIVNA, value);
	}
	/* Setters /> */
}