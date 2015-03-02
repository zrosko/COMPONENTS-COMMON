package hr.adriacomsoftware.app.common.pranjenovca.crnalista.dto;

import hr.as2.inf.common.data.AS2Record;

public class CrnaListaVo extends AS2Record {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	public static final String UID = "id_liste";
	public static final String NAME = "naziv";

	/* Attributes names /> */
	/* </ Constructors */
	public CrnaListaVo() {
		super();
	}

	public CrnaListaVo(AS2Record value) {
		super(value);
	}

	/* Constructors /> */
	/* </ Getters */
	public String getValue(String name) {
		String value = "";
		if (name.equalsIgnoreCase("uid"))
			value = get(UID);
		else if (name.equalsIgnoreCase("name"))
			value = get(NAME);
		return value;
	}

	public void setValue(String name, String value) {
		if (name.equalsIgnoreCase("uid"))
			set(UID, value);
		else if (name.equalsIgnoreCase("name"))
			set(NAME, value);
	}
}