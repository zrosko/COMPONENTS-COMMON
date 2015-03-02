package hr.adriacomsoftware.app.common.studija.facade;

import hr.adriacomsoftware.app.common.or.dto.OrPoduzetaMjeraRs;
import hr.adriacomsoftware.app.common.or.dto.OrPoduzetaMjeraVo;
import hr.adriacomsoftware.app.common.studija.dto.InvPlanRs;
import hr.adriacomsoftware.app.common.studija.dto.InvPlanVo;
import hr.adriacomsoftware.app.common.studija.dto.InvProizvodRs;
import hr.adriacomsoftware.app.common.studija.dto.InvProizvodVo;
import hr.adriacomsoftware.app.common.studija.dto.InvRadRs;
import hr.adriacomsoftware.app.common.studija.dto.InvRadVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface InvStudijaFacade {
    //rad
    public abstract InvRadRs listajSveRadnike(InvRadVo value) throws Exception;
    public abstract InvRadVo azurirajRadnika(InvRadVo value) throws Exception;
    public abstract InvRadVo dodajRadnika(InvRadVo value) throws Exception;
    public abstract InvRadVo brisiRadnika(InvRadVo value) throws Exception;
    //proizvod
    public abstract InvProizvodVo dodajProizvod(InvProizvodVo value) throws Exception;
    public abstract InvProizvodVo azurirajProizvod(InvProizvodVo value) throws Exception;
    public abstract void brisiProizvod(InvProizvodVo value) throws Exception;
    public abstract InvProizvodRs procitajProizvode(InvProizvodVo value) throws Exception;    
    //plan
    public abstract InvPlanVo brisiInvPlan(InvPlanVo value) throws Exception;
    public abstract InvPlanVo dodajInvPlan(InvPlanVo value) throws Exception;
    public abstract InvPlanVo azurirajInvPlan(InvPlanVo value) throws Exception;
    public abstract InvPlanRs procitajSveInvPlan(InvPlanVo value) throws Exception;
    public abstract AS2RecordList listajSveInvPlan() throws Exception;
    //poduzeta mjera
    public abstract InvPlanRs pretraziInvPlan(InvPlanVo value) throws Exception;
    public abstract OrPoduzetaMjeraRs procitajSvePoduzetaMjera(OrPoduzetaMjeraVo value) throws Exception;
    public abstract OrPoduzetaMjeraVo azurirajPoduzetaMjera(OrPoduzetaMjeraVo value) throws Exception;
    public abstract OrPoduzetaMjeraVo dodajPoduzetaMjera(OrPoduzetaMjeraVo value) throws Exception;
    public abstract OrPoduzetaMjeraVo brisiPoduzetaMjera(OrPoduzetaMjeraVo value) throws Exception;
    }
