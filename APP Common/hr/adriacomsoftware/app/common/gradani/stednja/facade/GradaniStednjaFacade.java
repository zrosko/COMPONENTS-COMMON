package hr.adriacomsoftware.app.common.gradani.stednja.facade;

import hr.adriacomsoftware.app.common.gradani.dto.OsobaRs;
import hr.adriacomsoftware.app.common.gradani.stednja.dto.StednjaVo;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.jb.dto.PartijaRs;

public interface GradaniStednjaFacade {
	public abstract OsnovniVo azurirajPartijuZaObavijest(OsnovniVo value) throws Exception;
	public abstract OsnovniRs procitajSvePartijeZaObavijest(OsnovniVo value) throws Exception;
	public abstract OsnovniVo dodajPartijuZaObavijest(OsnovniVo value) throws Exception;
	public abstract OsnovniVo brisiPartijuZaObavijest(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajObavijestiDoznaka(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajObavijestiMirovine(OsnovniVo value) throws Exception;
	public abstract OsnovniRs listaNegativnihPartija(OsnovniVo value) throws Exception;
	public abstract OsnovniRs listaPrometaPogresnaValuta(OsnovniVo value) throws Exception;
	public abstract PartijaRs listaPartijaNerezidenata(OsnovniVo value) throws Exception;
	public abstract OsobaRs procitajSveOsobe() throws Exception;
	public abstract OsobaRs pronadiSveOsobe(OsnovniVo value) throws Exception;
	public abstract PartijaRs listaTecajnihRazlika(OsnovniVo value) throws Exception;
	public abstract PartijaRs listaStednjaFiksnaKamata(OsnovniVo value) throws Exception;
	public abstract OsnovniRs brojPartijaDepozitaNaDan(OsnovniVo value) throws Exception;
	public abstract OsnovniRs rekapitulacijaPripisaKamataKune(OsnovniVo value) throws Exception;
	public abstract OsnovniRs rekapitulacijaPripisaKamataDevize(OsnovniVo value) throws Exception;
	public abstract OsnovniRs priljevOdljev(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajPoredakStednje(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajKunskaStednja(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajKunskaStednjaBrojPartija(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajDeviznaStednja(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajDeviznaStednjaBrojPartija(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajOrocenaStednja(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajOrocenaStednjaPartije(StednjaVo value) throws Exception;
	public abstract OsnovniRs izvjestajTransakcijePreko105000(StednjaVo value) throws Exception;
	public abstract OsnovniRs izvjestajPregledPartijaKonto924061(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajNeregularnoZatvorenePartije(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajRekapitulacijaPoKontima(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajRekapitulacijaPoValutama(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajDeviznaStednjaPoIntervalima(OsnovniVo value) throws Exception;
	public abstract OsnovniRs izvjestajNajvecih20(OsnovniVo value) throws Exception;
}
