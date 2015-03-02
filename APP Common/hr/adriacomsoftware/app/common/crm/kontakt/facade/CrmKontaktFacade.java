package hr.adriacomsoftware.app.common.crm.kontakt.facade;

import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktAktivnostRs;
import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktAktivnostVo;
import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktPredmetRs;
import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktPredmetVo;
import hr.adriacomsoftware.app.common.crm.kontakt.dto.KontaktPrivitakVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface CrmKontaktFacade {

	/************* FACADE INTERFACE  kontakt_predmet ************/
	
	public abstract KontaktPredmetVo brisiKontaktPredmet(KontaktPredmetVo value) throws Exception;
	public abstract KontaktPredmetVo dodajKontaktPredmet(KontaktPredmetVo value) throws Exception;
	public abstract KontaktPredmetVo azurirajKontaktPredmet(KontaktPredmetVo value) throws Exception;
	public abstract KontaktPredmetRs procitajSveKontaktPredmet(KontaktPredmetVo value) throws Exception;
	public abstract AS2RecordList listajSveKontaktPredmet() throws Exception;
	public abstract KontaktPredmetRs pretraziKontaktPredmet(KontaktPredmetVo value) throws Exception;
		
	/************* FACADE INTERFACE  kontakt_aktivnost ************/

	public abstract KontaktAktivnostVo brisiKontaktAktivnost(KontaktAktivnostVo value) throws Exception;
	public abstract KontaktAktivnostVo dodajKontaktAktivnost(KontaktAktivnostVo value) throws Exception;
	public abstract KontaktAktivnostVo azurirajKontaktAktivnost(KontaktAktivnostVo value) throws Exception;
	public abstract KontaktAktivnostRs procitajSveKontaktAktivnost(KontaktAktivnostVo value) throws Exception;
	public abstract AS2RecordList listajSveKontaktAktivnost() throws Exception;
	public abstract KontaktAktivnostRs pretraziKontaktAktivnost(KontaktAktivnostVo value) throws Exception;

	/************* FACADE INTERFACE  kontakt_privitak ************/

	public abstract KontaktPrivitakVo dodajPrivitak(KontaktPrivitakVo value) throws Exception;
    public abstract KontaktPrivitakVo citajPrivitak(KontaktPrivitakVo value) throws Exception;
    public abstract KontaktPrivitakVo brisiPrivitak(KontaktPrivitakVo value) throws Exception;

	/************* FACADE INTERFACE  zajednicko ************/
	
	public abstract OsnovniRs procitajCrmKontaktSifre(OsnovniVo value) throws Exception;
    public abstract OsnovniRs izvjestaji(OsnovniVo value) throws Exception;	
}
