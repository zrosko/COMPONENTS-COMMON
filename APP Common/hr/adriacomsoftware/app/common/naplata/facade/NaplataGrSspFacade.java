package hr.adriacomsoftware.app.common.naplata.facade;

import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspOtplatniPlanRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspOtplatniPlanVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspPrivitakVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrSspVo;

public interface NaplataGrSspFacade {
//	//naplata ssp
	public abstract NaplataGrSspVo azurirajBiljesku(NaplataGrSspVo value) throws Exception;
	public abstract NaplataGrSspRs procitajSveBiljeske(NaplataGrSspVo value) throws Exception;
	public abstract NaplataGrSspVo procitajBiljesku(NaplataGrSspVo value)throws Exception;
	public abstract NaplataGrSspVo dodajBiljesku(NaplataGrSspVo value) throws Exception;
	public abstract NaplataGrSspVo brisiBiljesku(NaplataGrSspVo value) throws Exception;
	public abstract NaplataGrSspVo brisiViseBiljeski(NaplataGrSspRs value) throws Exception;

	public abstract NaplataGrSspRs procitajMogucePotpisnikeNagodbe(NaplataGrSspVo value) throws Exception;
	public abstract NaplataGrSspRs procitajSifre(NaplataGrSspVo value) throws Exception;
	
	public abstract NaplataGrSspRs procitajPartijeNaplateSSP(NaplataGrSspVo value) throws Exception;
	public abstract NaplataGrSspRs pronadiPartijeNaplateSSP(NaplataGrSspVo value) throws Exception;

	public abstract NaplataGrSspRs procitajPovijestPolja(NaplataGrSspVo value) throws Exception;
	public abstract NaplataGrSspRs izvjestaji(NaplataGrSspVo value) throws Exception;
	public abstract NaplataGrSspRs izvjestajReferat(NaplataGrSspVo value) throws Exception;
	//privitak
	public abstract NaplataGrSspPrivitakVo dodajPrivitak(NaplataGrSspPrivitakVo value) throws Exception;
    public abstract NaplataGrSspPrivitakVo citajPrivitak(NaplataGrSspPrivitakVo value) throws Exception;
    public abstract NaplataGrSspPrivitakVo brisiPrivitak(NaplataGrSspPrivitakVo value) throws Exception;
    //otplatni plan
	public abstract NaplataGrSspOtplatniPlanVo azurirajOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws Exception;
	public abstract NaplataGrSspOtplatniPlanRs procitajOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws Exception;
	public abstract NaplataGrSspOtplatniPlanVo dodajOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws Exception;
	public abstract NaplataGrSspOtplatniPlanVo brisiOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws Exception;
	public abstract NaplataGrSspOtplatniPlanVo brisiViseOtplatnihPlanova(NaplataGrSspOtplatniPlanRs value) throws Exception;
	public abstract NaplataGrSspOtplatniPlanVo izradiOtplatniPlan(NaplataGrSspOtplatniPlanVo value) throws Exception;
}
