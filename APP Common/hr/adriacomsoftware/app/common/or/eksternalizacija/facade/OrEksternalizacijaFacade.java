package hr.adriacomsoftware.app.common.or.eksternalizacija.facade;

import hr.adriacomsoftware.app.common.or.eksternalizacija.dto.OrEksternalizacijaRs;
import hr.adriacomsoftware.app.common.or.eksternalizacija.dto.OrEksternalizacijaVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface OrEksternalizacijaFacade {
	public abstract OrEksternalizacijaVo brisiOrEksternalizacija(OrEksternalizacijaVo value)throws Exception;
	public abstract OrEksternalizacijaVo dodajOrEksternalizacija(OrEksternalizacijaVo value)throws Exception;
	public abstract OrEksternalizacijaVo azurirajOrEksternalizacija(OrEksternalizacijaVo value)throws Exception;
	public abstract OrEksternalizacijaRs procitajSveOrEksternalizacija(OrEksternalizacijaVo value)throws Exception;
	public abstract AS2RecordList listajSveOrEksternalizacija()throws Exception;
	public abstract OrEksternalizacijaRs pretraziOrEksternalizacija(OrEksternalizacijaVo value)throws Exception;
}
