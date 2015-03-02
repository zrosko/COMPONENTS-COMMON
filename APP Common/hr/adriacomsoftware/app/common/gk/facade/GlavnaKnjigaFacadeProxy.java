package hr.adriacomsoftware.app.common.gk.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2RecordList;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class GlavnaKnjigaFacadeProxy extends AS2FacadeProxy implements GlavnaKnjigaFacade{

	private static GlavnaKnjigaFacadeProxy _instance = null;
	
	private GlavnaKnjigaFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.gk.facade.GlavnaKnjigaFacadeServer");
	}

	public static GlavnaKnjigaFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new GlavnaKnjigaFacadeProxy();
		return _instance;
	}
	public OsnovniRs procitajSveStavke(OsnovniVo value) throws AS2Exception {
	    value.setRemoteMethod("procitajSveStavke");
	    OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
	 }
	public OsnovniRs pronadiSveStavke(OsnovniVo value) throws AS2Exception {
        value.setRemoteMethod("pronadiSveStavke");
        OsnovniRs res = (OsnovniRs) executeQuery(value);
		return res;
    }
	public AS2RecordList temeljnica(AS2Record value) throws AS2Exception {
		value.setRemoteMethod("temeljnica");
		AS2RecordList res = (AS2RecordList) executeQuery(value);
		return res;
	 }
 }
