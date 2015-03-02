package hr.adriacomsoftware.app.common.bpm.facade;


import hr.adriacomsoftware.app.common.bpm.dto.BpmProcesRs;
import hr.adriacomsoftware.app.common.bpm.dto.BpmProcesVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class BpmFacadeProxy extends AS2FacadeProxy implements BpmFacade {

    private static BpmFacadeProxy _instance = null;

    private BpmFacadeProxy() {
        setRemoteObject("hr.adriacomsoftware.app.server.bpm.facade.BpmFacadeServer");
    }

    public static BpmFacadeProxy getInstance() { 
        if (_instance == null)
            _instance = new BpmFacadeProxy();
        return _instance;
    }
    public BpmProcesRs procitajSveProcese(BpmProcesVo value) throws AS2Exception {
    	value.setRemoteMethod("procitajSveProcese");
    	BpmProcesRs res = (BpmProcesRs) executeQuery(value);
    	return res;
    }
    public BpmProcesVo azurirajProces(BpmProcesVo value) throws AS2Exception {
    	value.setRemoteMethod("azurirajProces");
    	BpmProcesVo res = (BpmProcesVo)  execute(value);
    	return res;
    }
    public BpmProcesVo dodajProces(BpmProcesVo value) throws AS2Exception {
    	value.setRemoteMethod("dodajProces");
    	BpmProcesVo res = (BpmProcesVo)  execute(value);
    	return res;
    }
    public BpmProcesVo brisiProces(BpmProcesVo value) throws AS2Exception {
    	value.setRemoteMethod("brisiProces");
    	BpmProcesVo res = (BpmProcesVo)  execute(value);
    	return res;
    }
    public AS2RecordList listajSveProcese() throws AS2Exception {
        AS2Record vo = new AS2Record();
	    vo.setRemoteMethod("listajSveProcese");
	    AS2RecordList rs = (AS2RecordList)getQueryFromCache(vo);
		if(rs==null){
		    rs = (AS2RecordList) executeQuery("listajSveProcese");
		    addToCache("listajSveProcese", rs);
		}
		return rs;
    } 
    //lookup procesi
    public String getNazivZaSifruProcesa(String sifra){
	    return listajSveProcese().rsReadNameForId(sifra);
    }
    public String getSifruProcesaZaNaziv(String naziv){
	    return listajSveProcese().rsReadIdForName(naziv);
    }
}