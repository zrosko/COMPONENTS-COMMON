package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.facade;

import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.BankaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.BankaVo;

public interface OsnovniPodaciFacade {
	public abstract BankaVo azurirajOsnovnePodatke(BankaVo value) throws Exception;
	public abstract BankaRs procitajSveOsnovnePodatke(BankaVo value) throws Exception;
	public abstract BankaVo dodajOsnovnePodatke(BankaVo value) throws Exception;
	public abstract BankaVo brisiOsnovnePodatke(BankaVo value) throws Exception;
}
