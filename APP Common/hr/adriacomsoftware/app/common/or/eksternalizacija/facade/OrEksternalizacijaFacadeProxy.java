package hr.adriacomsoftware.app.common.or.eksternalizacija.facade;


import hr.adriacomsoftware.app.common.or.eksternalizacija.dto.OrEksternalizacijaRs;
import hr.adriacomsoftware.app.common.or.eksternalizacija.dto.OrEksternalizacijaVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class OrEksternalizacijaFacadeProxy extends AS2FacadeProxy implements OrEksternalizacijaFacade {

    private static OrEksternalizacijaFacadeProxy _instance = null;

    private OrEksternalizacijaFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.or.eksternalizacija.facade.OrEksternalizacijaFacadeServer");
    }

    public static OrEksternalizacijaFacadeProxy getInstance() {
        if (_instance == null)
            _instance = new OrEksternalizacijaFacadeProxy();
        return _instance;
    }

/************* FACADE PROXY  or_eksternalizacija ************/

public OrEksternalizacijaVo brisiOrEksternalizacija(OrEksternalizacijaVo value) {
	value.setRemoteMethod("brisiOrEksternalizacija");
	OrEksternalizacijaVo res = (OrEksternalizacijaVo) execute(value);
	return res;
}
public OrEksternalizacijaVo dodajOrEksternalizacija(OrEksternalizacijaVo value) {
	value.setRemoteMethod("dodajOrEksternalizacija");
	OrEksternalizacijaVo res = (OrEksternalizacijaVo) execute(value);
	return res;
}
public OrEksternalizacijaVo azurirajOrEksternalizacija(OrEksternalizacijaVo value) {
	value.setRemoteMethod("azurirajOrEksternalizacija");
	OrEksternalizacijaVo res = (OrEksternalizacijaVo) execute(value);
	return res;
}
public OrEksternalizacijaRs procitajSveOrEksternalizacija(OrEksternalizacijaVo value) {
	value.setRemoteMethod("procitajSveOrEksternalizacija");
	OrEksternalizacijaRs res = (OrEksternalizacijaRs) executeQuery(value);
	return res;
}
public AS2RecordList listajSveOrEksternalizacija() {
	AS2RecordList res = (AS2RecordList) executeQuery("listajSveOrEksternalizacija");
	return res;
}
public OrEksternalizacijaRs pretraziOrEksternalizacija(OrEksternalizacijaVo value) {
	value.setRemoteMethod("pretraziSveOrEksternalizacija");
	OrEksternalizacijaRs res = (OrEksternalizacijaRs) executeQuery(value);
	return res;
}

}