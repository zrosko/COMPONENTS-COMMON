package hr.adriacomsoftware.app.common.kolaterali.facade;

import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralPartijaRs;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralPartijaVo;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralPolicaRs;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralPolicaVo;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralRs;
import hr.adriacomsoftware.app.common.kolaterali.dto.KolateralVo;
import hr.as2.inf.common.data.AS2RecordList;

public interface KolateraliFacade {
    //kolateral
    public abstract KolateralRs citajSveKolaterale(KolateralVo value) throws Exception;
    public abstract KolateralRs pronadiSveKolaterale(KolateralVo value) throws Exception;
    public abstract KolateralRs citajKolateral(KolateralVo value) throws Exception;
	public abstract KolateralVo azurirajKolateral(KolateralVo value) throws Exception;
	public abstract KolateralVo dodajKolateral(KolateralVo value) throws Exception;
	public abstract KolateralVo brisiKolateral(KolateralVo value) throws Exception;
	//polica
	public abstract KolateralPolicaVo azurirajPolicuZaKolateral(KolateralPolicaVo value) throws Exception;
	public abstract KolateralPolicaRs procitajSvePoliceZaKolateral(KolateralPolicaVo value) throws Exception;
	public abstract KolateralPolicaVo dodajPolicuZaKolateral(KolateralPolicaVo value) throws Exception;
	public abstract KolateralPolicaVo brisiPolicuZaKolateral(KolateralPolicaVo value) throws Exception;
	//
	public abstract KolateralPolicaRs pronadiSvePolice(KolateralPolicaVo value) throws Exception;
	public abstract KolateralRs citajSvePolice(KolateralVo value) throws Exception;
	//partija
	public abstract KolateralPartijaVo azurirajPartijuZaKolateral(KolateralPartijaVo value) throws Exception;
	public abstract KolateralPartijaRs procitajSvePartijeZaKolateral(KolateralPartijaVo value) throws Exception;
	public abstract KolateralPartijaVo dodajPartijuZaKolateral(KolateralPartijaVo value) throws Exception;
	public abstract KolateralPartijaVo brisiPartijuZaKolateral(KolateralPartijaVo value) throws Exception;
    public abstract KolateralPartijaRs procitajSveZaduzenostiKodBankePOVIJEST(KolateralPartijaVo value) throws Exception;
    //vrste
    public abstract AS2RecordList procitajVrsteKolaterala() throws Exception;
    public abstract KolateralRs procitajSveBsaKolateraleOsobe(KolateralVo value) throws Exception;
}
