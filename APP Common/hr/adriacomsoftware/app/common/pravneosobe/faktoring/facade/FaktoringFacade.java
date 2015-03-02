package hr.adriacomsoftware.app.common.pravneosobe.faktoring.facade;

import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.DiskontRs;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.DiskontVo;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.FakturaRs;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.FakturaVo;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.KupacFaktoringaRs;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.KupacFaktoringaVo;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.KupacLimitRs;
import hr.adriacomsoftware.app.common.pravneosobe.faktoring.dto.KupacLimitVo;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

public interface FaktoringFacade {
    //temeljnica
	public abstract AS2RecordList temeljnicaFaktoring(AS2Record value) throws Exception;
	//specifikacija
    public abstract FakturaRs procitajSveSpecifikacije(FakturaVo value) throws Exception;
    public abstract FakturaRs pronadiSpecifikacije(FakturaVo value) throws Exception;
    public abstract FakturaVo azurirajSpecifikaciju(FakturaVo value) throws Exception;
    public abstract FakturaVo dodajSpecifikaciju(FakturaVo value) throws Exception;
    public abstract FakturaVo brisiSpecifikaciju(FakturaVo value) throws Exception;
    //faktura
    public abstract FakturaRs procitajSveFakture(FakturaVo value) throws Exception;
    public abstract FakturaVo azurirajFakturu(FakturaVo value) throws Exception;
    public abstract FakturaVo dodajFakturu(FakturaVo value) throws Exception;
    public abstract FakturaVo brisiFakturu(FakturaVo value) throws Exception;
    //kupac faktoringa
    public abstract KupacFaktoringaRs procitajSveKupceFaktoringa(KupacFaktoringaVo value) throws Exception;
    public abstract KupacFaktoringaVo azurirajKupcaFaktoringa(KupacFaktoringaVo value) throws Exception;
    public abstract KupacFaktoringaVo dodajKupcaFaktoringa(KupacFaktoringaVo value) throws Exception;
    public abstract KupacFaktoringaVo brisiKupcaFaktoringa(KupacFaktoringaVo value) throws Exception;
    //diskont
    public abstract DiskontRs procitajSveDiskonte(DiskontVo value) throws Exception;
    public abstract DiskontVo azurirajDiskont(DiskontVo value) throws Exception;
    public abstract DiskontVo dodajDiskont(DiskontVo value) throws Exception;
    public abstract DiskontVo brisiDiskont(DiskontVo value) throws Exception;
    //kupac limit
    public abstract KupacLimitRs procitajSveLimiteKupca(KupacLimitVo value) throws Exception;
    public abstract KupacLimitVo azurirajLimitKupca(KupacLimitVo value) throws Exception;
    public abstract KupacLimitVo dodajLimitKupca(KupacLimitVo value) throws Exception;
    public abstract KupacLimitVo brisiLimitKupca(KupacLimitVo value) throws Exception;
}
