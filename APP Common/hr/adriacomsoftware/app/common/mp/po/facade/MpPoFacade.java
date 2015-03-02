package hr.adriacomsoftware.app.common.mp.po.facade;

import hr.adriacomsoftware.app.common.mp.po.dto.MpPoOsobaRs;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoOsobaVo;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoPartijaRs;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoPartijaVo;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoPrometRs;
import hr.adriacomsoftware.app.common.mp.po.dto.MpPoPrometVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface MpPoFacade {
	
	/************* FACADE INTERFACE  mp_po_osoba ************/
	public abstract MpPoOsobaVo brisiMpPoOsoba(MpPoOsobaVo value) throws Exception;
	public abstract MpPoOsobaVo dodajMpPoOsoba(MpPoOsobaVo value) throws Exception;
	public abstract MpPoOsobaVo azurirajMpPoOsoba(MpPoOsobaVo value) throws Exception;
	public abstract MpPoOsobaRs procitajSveMpPoOsoba(MpPoOsobaVo value) throws Exception;
	public abstract AS2RecordList listajSveMpPoOsoba() throws Exception;
	public abstract MpPoOsobaRs pretraziMpPoOsoba(MpPoOsobaVo value) throws Exception;

	/************* FACADE INTERFACE  mp_po_partija ************/
	public abstract MpPoPartijaVo brisiMpPoPartija(MpPoPartijaVo value) throws Exception;
	public abstract MpPoPartijaVo dodajMpPoPartija(MpPoPartijaVo value) throws Exception;
	public abstract MpPoPartijaVo azurirajMpPoPartija(MpPoPartijaVo value) throws Exception;
	public abstract MpPoPartijaRs procitajSveMpPoPartija(MpPoPartijaVo value) throws Exception;
	public abstract AS2RecordList listajSveMpPoPartija() throws Exception;
	public abstract MpPoPartijaRs pretraziMpPoPartija(MpPoPartijaVo value) throws Exception;
	public abstract MpPoPartijaVo provjeriMpPoPartija(MpPoPartijaVo value) throws Exception;

	/************* FACADE INTERFACE  mp_po_promet ************/
	public abstract MpPoPrometVo brisiMpPoPromet(MpPoPrometVo value) throws Exception;
	public abstract MpPoPrometVo dodajMpPoPromet(MpPoPrometVo value) throws Exception;
	public abstract MpPoPrometVo azurirajMpPoPromet(MpPoPrometVo value) throws Exception;
	public abstract MpPoPrometRs procitajSveMpPoPromet(MpPoPrometVo value) throws Exception;
	public abstract AS2RecordList listajSveMpPoPromet() throws Exception;
	public abstract MpPoPrometRs pretraziMpPoPromet(MpPoPrometVo value) throws Exception;
	public abstract MpPoPrometRs procitajSveMpPoPrometGrupno(MpPoPrometVo value) throws Exception;
	public abstract MpPoPrometRs pretraziMpPoPrometGrupno(MpPoPrometVo value) throws Exception;
	public abstract void proknjiziMpPoPromet(MpPoPrometVo value) throws Exception;
	public abstract MpPoPrometVo validate(MpPoPrometVo value) throws Exception;
	
	public abstract MpPoPrometRs izvjestaji(MpPoPrometVo value) throws Exception;
}
