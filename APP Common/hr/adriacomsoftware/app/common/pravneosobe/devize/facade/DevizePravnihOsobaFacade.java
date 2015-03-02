package hr.adriacomsoftware.app.common.pravneosobe.devize.facade;

import hr.adriacomsoftware.app.common.jb.dto.IzvjestajRs;
import hr.adriacomsoftware.app.common.jb.dto.IzvjestajVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaVo;
import hr.adriacomsoftware.app.common.jb.dto.RacunPartijeRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.IzvodRs;
import hr.adriacomsoftware.app.common.pravneosobe.dto.IzvodVo;
import hr.adriacomsoftware.app.common.pravneosobe.dto.PravnaOsobaRs;

public interface DevizePravnihOsobaFacade {
	public abstract PravnaOsobaRs procitajSvePravneOsobeDevize() throws Exception;
	public abstract PravnaOsobaRs pronadiSvePravneOsobeDevize(OsnovniVo value) throws Exception;
	public abstract IzvodRs izvjestajIzvodiDeviza(IzvodVo value) throws Exception;
	public abstract IzvodRs procitajSveObradeDeviznihIzvoda(IzvodVo value) throws Exception;
	public abstract RacunPartijeRs izvjestajStanjePartije(PartijaVo value) throws Exception;
	public abstract RacunPartijeRs izvjestajStanjeValute(PartijaVo value) throws Exception;
	public abstract IzvjestajRs priljevOdljev(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs izvjestajDevizneTecajneRazlike(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs izvjestajOroceniDevizniDepoziti(IzvjestajVo value) throws Exception;
	public abstract IzvjestajRs izvjestajOroceniKunskiDepoziti(IzvjestajVo value) throws Exception;
}
