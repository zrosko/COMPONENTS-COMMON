package hr.adriacomsoftware.app.common.pravneosobe.likvidnost.facade;

import hr.adriacomsoftware.app.common.pravneosobe.likvidnost.dto.LikvidnostRs;
import hr.adriacomsoftware.app.common.pravneosobe.likvidnost.dto.LikvidnostVo;
import hr.as2.inf.common.exceptions.AS2Exception;
import hr.as2.inf.common.requesthandlers.AS2FacadeProxy;

public class LikvidnostFacadeProxy extends AS2FacadeProxy implements LikvidnostFacade {

	private static LikvidnostFacadeProxy _instance = null;
	
	private LikvidnostFacadeProxy()
	{
		setRemoteObject("hr.adriacomsoftware.app.server.pravneosobe.likvidnost.facade.LikvidnostFacadeServer");
	}

	public static LikvidnostFacadeProxy getInstance()
	{
		if (_instance == null)
			_instance = new LikvidnostFacadeProxy();
		return _instance;
	}
	public LikvidnostVo dodajLikvidnost(LikvidnostVo value) throws AS2Exception {

		value.setRemoteMethod("dodajLikvidnost");
		LikvidnostVo res = (LikvidnostVo)  execute(value);
		return res;
	 }
	public LikvidnostVo azurirajLikvidnost(LikvidnostVo value) throws AS2Exception {

		value.setRemoteMethod("azurirajLikvidnost");
		LikvidnostVo res = (LikvidnostVo)  execute(value);
		return res;
	 }
	public LikvidnostRs procitajSveLikvidnosti(LikvidnostVo value) throws AS2Exception {

		value.setRemoteMethod("procitajSveLikvidnosti");
		LikvidnostRs res = (LikvidnostRs) executeQuery(value);
		return res;
	 }
	public LikvidnostRs pronadiLikvidnosti(LikvidnostVo value) throws AS2Exception {

		value.setRemoteMethod("pronadiLikvidnosti");
		LikvidnostRs res = (LikvidnostRs) executeQuery(value);
		return res;
	 }
	public LikvidnostVo brisiLikvidnost(LikvidnostVo value) throws AS2Exception {

		value.setRemoteMethod("brisiLikvidnost");
		LikvidnostVo res = (LikvidnostVo)  execute(value);
		return res;
	 }
	public LikvidnostVo brisiViseLikvidnosti(LikvidnostRs value) throws AS2Exception {

		value.setRemoteMethod("brisiViseLikvidnosti");
		LikvidnostVo res = (LikvidnostVo)  execute(value);
		return res;
	 }
}
