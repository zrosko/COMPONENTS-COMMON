package hr.adriacomsoftware.app.common.rizik.izlozenost.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.rizik.izlozenost.dto.KrTransakcijaRs;
import hr.adriacomsoftware.app.common.rizik.izlozenost.dto.KrTransakcijaVo;

public interface IzlozenostFacade {
    public abstract KrTransakcijaRs procitajIzlozenosti(KrTransakcijaVo value) throws Exception;
    public abstract KrTransakcijaRs pronadiIzlozenosti(KrTransakcijaVo value) throws Exception;
    public abstract KrTransakcijaRs procitajZaduzenostiOsobe(KrTransakcijaVo value) throws Exception;
    public abstract KrTransakcijaRs procitajZaduzenostiNaplate(KrTransakcijaVo value) throws Exception;
    public abstract KrTransakcijaRs procitajPragMaterijalnostiPO(KrTransakcijaVo value) throws Exception;
    public abstract OsnovniRs procitajJamstveniKapital(OsnovniVo value) throws Exception;
}
