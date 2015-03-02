package hr.adriacomsoftware.app.common.pravneosobe.likvidnost.facade;

import hr.adriacomsoftware.app.common.pravneosobe.likvidnost.dto.LikvidnostRs;
import hr.adriacomsoftware.app.common.pravneosobe.likvidnost.dto.LikvidnostVo;

public interface LikvidnostFacade {
	public abstract LikvidnostVo dodajLikvidnost(LikvidnostVo value) throws Exception;
	public abstract LikvidnostVo azurirajLikvidnost(LikvidnostVo value) throws Exception;
	public abstract LikvidnostRs procitajSveLikvidnosti(LikvidnostVo value) throws Exception;
	public abstract LikvidnostRs pronadiLikvidnosti(LikvidnostVo value) throws Exception;
	public abstract LikvidnostVo brisiLikvidnost(LikvidnostVo value) throws Exception;
	public abstract LikvidnostVo brisiViseLikvidnosti(LikvidnostRs value) throws Exception;
}