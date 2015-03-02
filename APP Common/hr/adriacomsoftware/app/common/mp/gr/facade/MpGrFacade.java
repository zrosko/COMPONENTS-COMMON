package hr.adriacomsoftware.app.common.mp.gr.facade;

import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrOsobaRs;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrOsobaVo;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrPartijaRs;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrPartijaVo;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrPrometRs;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrPrometVo;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrVezanaOsobaRs;
import hr.adriacomsoftware.app.common.mp.gr.dto.MpGrVezanaOsobaVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface MpGrFacade {	
	/************* FACADE INTERFACE  mp_gr_osoba ************/
	public abstract MpGrOsobaVo brisiMpGrOsoba(MpGrOsobaVo value) throws Exception;
	public abstract MpGrOsobaVo dodajMpGrOsoba(MpGrOsobaVo value) throws Exception;
	public abstract MpGrOsobaVo azurirajMpGrOsoba(MpGrOsobaVo value) throws Exception;
	public abstract MpGrOsobaRs procitajSveMpGrOsoba(MpGrOsobaVo value) throws Exception;
	public abstract AS2RecordList listajSveMpGrOsoba() throws Exception;
	public abstract MpGrOsobaRs pretraziMpGrOsoba(MpGrOsobaVo value) throws Exception;

	/************* FACADE INTERFACE  mp_gr_partija ************/
	public abstract MpGrPartijaVo brisiMpGrPartija(MpGrPartijaVo value) throws Exception;
	public abstract MpGrPartijaVo dodajMpGrPartija(MpGrPartijaVo value) throws Exception;
	public abstract MpGrPartijaVo azurirajMpGrPartija(MpGrPartijaVo value) throws Exception;
	public abstract MpGrPartijaRs procitajSveMpGrPartija(MpGrPartijaVo value) throws Exception;
	public abstract AS2RecordList listajSveMpGrPartija() throws Exception;
	public abstract MpGrPartijaRs pretraziMpGrPartija(MpGrPartijaVo value) throws Exception;
	public abstract MpGrPartijaVo provjeriMpGrPartija(MpGrPartijaVo value) throws Exception;

	/************* FACADE INTERFACE  mp_gr_vezana_osoba ************/
	public abstract MpGrVezanaOsobaVo brisiMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws Exception;
	public abstract MpGrVezanaOsobaVo dodajMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws Exception;
	public abstract MpGrVezanaOsobaVo azurirajMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws Exception;
	public abstract MpGrVezanaOsobaRs procitajSveMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws Exception;
	public abstract AS2RecordList listajSveMpGrVezanaOsoba() throws Exception;
	public abstract MpGrVezanaOsobaRs pretraziMpGrVezanaOsoba(MpGrVezanaOsobaVo value) throws Exception;
	
	/************* FACADE INTERFACE  mp_gr_promet ************/
	public abstract MpGrPrometVo brisiMpGrPromet(MpGrPrometVo value) throws Exception;
	public abstract MpGrPrometVo dodajMpGrPromet(MpGrPrometVo value) throws Exception;
	public abstract MpGrPrometVo azurirajMpGrPromet(MpGrPrometVo value) throws Exception;
	public abstract MpGrPrometRs procitajSveMpGrPromet(MpGrPrometVo value) throws Exception;
	public abstract AS2RecordList listajSveMpGrPromet() throws Exception;
	public abstract MpGrPrometRs pretraziMpGrPromet(MpGrPrometVo value) throws Exception;
	public abstract MpGrPrometRs procitajSveMpGrPrometGrupno(MpGrPrometVo value) throws Exception;
	public abstract MpGrPrometRs pretraziMpGrPrometGrupno(MpGrPrometVo value) throws Exception;
	public abstract void proknjiziMpGrPromet(MpGrPrometVo value) throws Exception;
	public abstract MpGrPrometVo validate(MpGrPrometVo value) throws Exception;
	
	public abstract MpGrPrometRs izvjestaji(MpGrPrometVo value) throws Exception;
}
