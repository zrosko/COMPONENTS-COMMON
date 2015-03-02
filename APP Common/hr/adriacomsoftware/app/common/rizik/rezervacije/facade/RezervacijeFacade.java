package hr.adriacomsoftware.app.common.rizik.rezervacije.facade;

import hr.adriacomsoftware.app.common.rizik.rezervacije.dto.RezervacijaRs;
import hr.adriacomsoftware.app.common.rizik.rezervacije.dto.RezervacijaVo;

public interface RezervacijeFacade {
    public abstract RezervacijaRs procitajRezervacije(RezervacijaVo value) throws Exception;
    public abstract RezervacijaRs pronadiRezervacije(RezervacijaVo value) throws Exception;
}
