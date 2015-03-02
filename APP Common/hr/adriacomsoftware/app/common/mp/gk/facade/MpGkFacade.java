package hr.adriacomsoftware.app.common.mp.gk.facade;


import hr.adriacomsoftware.app.common.mp.gk.dto.MpGkKnjizenjaRs;
import hr.adriacomsoftware.app.common.mp.gk.dto.MpGkKnjizenjaVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface MpGkFacade {
	public abstract MpGkKnjizenjaVo brisiMpGkKnjizenja(MpGkKnjizenjaVo value) throws Exception;
	public abstract MpGkKnjizenjaVo dodajMpGkKnjizenja(MpGkKnjizenjaVo value) throws Exception;
	public abstract MpGkKnjizenjaVo azurirajMpGkKnjizenja(MpGkKnjizenjaVo value) throws Exception;
	public abstract MpGkKnjizenjaRs procitajSveMpGkKnjizenja(MpGkKnjizenjaVo value) throws Exception;
	public abstract AS2RecordList listajSveMpGkKnjizenja() throws Exception;
	public abstract MpGkKnjizenjaRs pretraziMpGkKnjizenja(MpGkKnjizenjaVo value) throws Exception;
	public abstract MpGkKnjizenjaRs procitajSveMpGkKnjizenjaGrupno(MpGkKnjizenjaVo value) throws Exception;
	public abstract MpGkKnjizenjaRs pretraziMpGkKnjizenjaGrupno(MpGkKnjizenjaVo value) throws Exception;
	public abstract void proknjiziMpGkKnjizenja(MpGkKnjizenjaVo value) throws Exception;
	public abstract MpGkKnjizenjaVo validate(MpGkKnjizenjaVo value) throws Exception;
	public abstract MpGkKnjizenjaRs izvjestaji(MpGkKnjizenjaVo value) throws Exception;
}
