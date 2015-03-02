package hr.adriacomsoftware.app.common.rizik.rejting.facade;

import hr.adriacomsoftware.app.common.rizik.rejting.dto.PokazateljOcjenaRs;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.PokazateljOcjenaVo;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.PokazateljRs;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.PokazateljVo;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.RejtingRs;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.RejtingVo;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.SkoringRs;
import hr.adriacomsoftware.app.common.rizik.rejting.dto.SkoringVo;

public interface RejtingFacade {
    public abstract RejtingRs procitajRejtingPravnihOsoba(RejtingVo value) throws Exception;
    public abstract RejtingRs pronadiRejtingPravnihOsoba(RejtingVo value) throws Exception;
    //skoring
    public abstract SkoringRs pripremaOcjenaPravneOsobe(SkoringVo value) throws Exception;
    public abstract SkoringRs procitajSkoringPravneOsobe(SkoringVo value) throws Exception;
    public abstract SkoringVo azurirajSkoring(SkoringVo value) throws Exception;
    public abstract SkoringVo brisiSkoring(SkoringVo value) throws Exception;
    public abstract SkoringVo brisiViseSkoringa(SkoringRs value) throws Exception;
    //pokazatelji
    public abstract PokazateljRs procitajSvePokazatelje(PokazateljVo value) throws Exception;
    public abstract PokazateljRs izracunajPokazatelje(PokazateljVo value) throws Exception;
    public abstract PokazateljVo azurirajPokazatelj(PokazateljVo value) throws Exception;
    public PokazateljVo citajPokazatelj(PokazateljVo value) throws Exception;
    //vrsta pokazatelja
    public abstract PokazateljRs procitajSveVrstePokazatelja(PokazateljVo value) throws Exception;
    public abstract PokazateljVo azurirajVrstuPokazatelja(PokazateljVo value) throws Exception;
    //ocjene
    public abstract PokazateljOcjenaRs procitajSveOcjenePokazatelja(PokazateljVo value) throws Exception;
    public abstract PokazateljOcjenaVo azurirajOcjenuPokazatelja(PokazateljOcjenaVo value) throws Exception;
    //rano upozorenje
    public PokazateljRs izracunajRanoUpozorenje(PokazateljVo value) throws Exception;
}
