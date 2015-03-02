package hr.adriacomsoftware.app.common.pravneosobe.zahtjev.facade;

import hr.adriacomsoftware.app.common.cmdb.dto.EmailVo;
import hr.adriacomsoftware.app.common.jb.dto.ZahtjevPrivitakRs;
import hr.adriacomsoftware.app.common.jb.dto.ZahtjevPrivitakVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.BankarskiProizvodRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.BankarskiProizvodVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.Bon2Rs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.Bon2Vo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.DobavljacRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.DobavljacVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KolateralPonudeniRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KolateralPonudeniVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KratkorocniPlanVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KupacRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.KupacVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.OsiguranjeVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PodaciKlijentaVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PoslovniOdnosBankaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PoslovniOdnosBankaVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PovezanaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.PovezanaOsobaVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.RizikKomentarRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.RizikKomentarVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.RizikRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.RizikVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.UrednostVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.VikrRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.VikrVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZaduzenostKodBankeRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZaduzenostKodBankeVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZaduzenostRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZaduzenostVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZahtjevPravnaOsobaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.dto.ZahtjevPravnaOsobaVo;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.rizik.dto.ZahOcjenaRs;
import hr.adriacomsoftware.app.common.pravneosobe.zahtjev.rizik.dto.ZahOcjenaVo;

public interface ZahtjevPravneOsobeFacade {
    public abstract RizikVo osvjeziFinancijskePodatkeZaProcjenu(RizikVo value) throws Exception;
    public abstract RizikVo osvjeziPoslovniOdnosZaProcjenu(RizikVo value) throws Exception;
    public abstract RizikVo dodajProcjenuRizika(RizikVo value) throws Exception;
    public abstract RizikVo azurirajProcjenuRizika(RizikVo value) throws Exception;
    public abstract RizikVo brisiProcjenuRizika(RizikVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo promjenaDatumaProcjeneRizika(ZahtjevPravnaOsobaVo value) throws Exception; 
    public abstract ZahtjevPravnaOsobaVo ponavljanjeObradeNaDatumObrade(ZahtjevPravnaOsobaVo value) throws Exception; 
    public abstract ZahtjevPravnaOsobaVo duplicirajZahtjev(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaRs procitajSvePodatkeZahtjeva(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo dodajZahtjev(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaRs citajSveZahtjeve(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaRs pronadiSveZahtjeve(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo citajZahtjev(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo brisiZahtjev(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo azurirajStatusZahtjeva(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo azurirajOdobrenjeZahtjeva(ZahtjevPravnaOsobaVo value) throws Exception; 
    public abstract ZahtjevPravnaOsobaVo obradaZahtjeva(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract EmailVo proslijediZahtjev(EmailVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo pripremiZahtjev(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo pripremiOsnovnePodatke(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo pripremiPrijedlogOdluke(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract PodaciKlijentaVo dodajOsnovnePodatke(PodaciKlijentaVo value) throws Exception;
    public abstract PodaciKlijentaVo azurirajOsnovnePodatke(PodaciKlijentaVo value) throws Exception;
    public abstract PoslovniOdnosBankaVo dodajPoslovniOdnosBanka(PoslovniOdnosBankaVo value) throws Exception;
    public abstract PoslovniOdnosBankaVo azurirajPoslovniOdnosBanka(PoslovniOdnosBankaVo value) throws Exception;
    public abstract PoslovniOdnosBankaVo citajPoslovniOdnosBanka(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract PoslovniOdnosBankaVo citajPoslovniOdnosBankaPOVIJEST(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract PoslovniOdnosBankaVo azurirajKomentarPoslovnogOdnosaBanka (PoslovniOdnosBankaVo value) throws Exception;
    public abstract PoslovniOdnosBankaRs citajStednjuPovezanihOsoba(ZahtjevPravnaOsobaVo value) throws Exception;
    //bon 2
	public abstract Bon2Vo azurirajBon2(Bon2Vo value) throws Exception;
	public abstract Bon2Rs procitajSveBon2(Bon2Vo value) throws Exception;
	public abstract Bon2Vo dodajBon2(Bon2Vo value) throws Exception;
	public abstract Bon2Vo brisiBon2(Bon2Vo value) throws Exception;
	public abstract Bon2Rs procitajSveBon2POVIJEST(Bon2Vo value) throws Exception;
	public abstract Bon2Vo brisiViseBon2(Bon2Rs value) throws Exception;
	 //kupac
	public abstract KupacVo azurirajKupca(KupacVo value) throws Exception;
	public abstract KupacRs procitajSveKupce(KupacVo value) throws Exception;
	public abstract KupacVo dodajKupca(KupacVo value) throws Exception;
	public abstract KupacVo brisiKupca(KupacVo value) throws Exception;
	public abstract KupacVo brisiSveKupce(KupacVo value) throws Exception;
	public abstract KupacVo brisiViseKupaca(KupacRs value) throws Exception;
	public abstract KupacRs procitajSveKupcePOVIJEST(KupacVo value) throws Exception;
	public abstract KupacVo dodajViseKupaca(KupacRs value) throws Exception;
	 //dobavljac
	public abstract DobavljacVo azurirajDobavljaca(DobavljacVo value) throws Exception;
	public abstract DobavljacRs procitajSveDobavljace(DobavljacVo value) throws Exception;
	public abstract DobavljacVo dodajDobavljaca(DobavljacVo value) throws Exception;
	public abstract DobavljacVo brisiDobavljaca(DobavljacVo value) throws Exception;
	public abstract DobavljacVo brisiSveDobavljace(DobavljacVo value) throws Exception;
	public abstract DobavljacVo brisiViseDobavljaca(DobavljacRs value) throws Exception;
	public abstract DobavljacRs procitajSveDobavljacePOVIJEST(DobavljacVo value) throws Exception;
	public abstract DobavljacVo dodajViseDobavljaca(DobavljacRs value) throws Exception;
	//povezana osoba
	public abstract PovezanaOsobaVo azurirajPovezanuOsobu(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaRs procitajSvePovezaneOsobe(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaRs procitajSvePovezaneOsobePOVIJEST(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaVo dodajPovezanuOsobu(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaVo dodajPovezaneOsobe(PovezanaOsobaRs value) throws Exception;
	public abstract PovezanaOsobaVo brisiPovezanuOsobu(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaRs listaPovezanihOsoba(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaRs procitajSvePovezaneOsobePOVIJESTZahtjev(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaRs procitajSvePovezaneOsobeVlasnikePOVIJESTZahtjev(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaRs dodajPovezaneOsobeIzPO(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaVo brisiVisePovezanihOsoba(PovezanaOsobaRs value) throws Exception;
	//vlasnici
	public abstract PovezanaOsobaRs procitajSvePovezaneOsobeVlasnike(PovezanaOsobaVo value) throws Exception;
	public abstract PovezanaOsobaRs procitajSvePovezaneOsobeVlasnikePOVIJEST(PovezanaOsobaVo value) throws Exception;
	//kratkorocni poslovni plan
    public abstract KratkorocniPlanVo dodajKratkorocniPlan(KratkorocniPlanVo value) throws Exception;
    public abstract KratkorocniPlanVo azurirajKratkorocniPlan(KratkorocniPlanVo value) throws Exception;
    public abstract KratkorocniPlanVo citajKratkorocniPlan(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract KratkorocniPlanVo citajKratkorocniPlanPOVIJEST(ZahtjevPravnaOsobaVo value) throws Exception;
    public abstract KratkorocniPlanVo brisiKratkorocniPlan(KratkorocniPlanVo value) throws Exception;
    //zaduzensot kod drugih
	public abstract ZaduzenostVo azurirajZaduzenost(ZaduzenostVo value) throws Exception;
	public abstract ZaduzenostRs procitajSveZaduzenosti(ZaduzenostVo value) throws Exception;
	public abstract ZaduzenostVo dodajZaduzenost(ZaduzenostVo value) throws Exception;
	public abstract ZaduzenostVo brisiZaduzenost(ZaduzenostVo value) throws Exception;
	public abstract ZaduzenostVo brisiViseZaduzenosti(ZaduzenostRs value) throws Exception;
	public abstract ZaduzenostVo dodajViseZaduzenosti(ZaduzenostRs value) throws Exception;
	//zaduzenost kod banke
	public abstract ZaduzenostKodBankeVo azurirajZaduzenostKodBanke(ZaduzenostKodBankeVo value) throws Exception;
	public abstract ZaduzenostKodBankeRs procitajSveZaduzenostiKodBanke(ZaduzenostKodBankeVo value) throws Exception;
	public abstract ZaduzenostKodBankeRs procitajSveZaduzenostiKodBankePovezanaOsoba(ZaduzenostKodBankeVo value) throws Exception;
	public abstract ZaduzenostKodBankeVo dodajZaduzenostKodBanke(ZaduzenostKodBankeVo value) throws Exception;
	public abstract ZaduzenostKodBankeVo brisiZaduzenostKodBanke(ZaduzenostKodBankeVo value) throws Exception;
	public abstract ZaduzenostKodBankeRs procitajSveZaduzenostiKodBankePOVIJEST(ZaduzenostKodBankeVo value) throws Exception;
	public abstract ZaduzenostKodBankeRs procitajSveZaduzenostiKodBankePovezanaOsobaPOVIJEST(ZaduzenostKodBankeVo value) throws Exception;
	//trazeni proizvod
	public abstract BankarskiProizvodVo azurirajTrazeniProizvod(BankarskiProizvodVo value) throws Exception;
	public abstract BankarskiProizvodRs procitajSveTrazeneProizvode(BankarskiProizvodVo value) throws Exception;
	public abstract BankarskiProizvodVo dodajTrazeniProizvod(BankarskiProizvodVo value) throws Exception;
	public abstract BankarskiProizvodVo brisiTrazeniProizvod(BankarskiProizvodVo value) throws Exception;
	//ponuđeni kolateral
	public abstract KolateralPonudeniVo azurirajPonudeniKolateral(KolateralPonudeniVo value) throws Exception;
	public abstract KolateralPonudeniRs procitajSvePonudeneKolaterale(KolateralPonudeniVo value) throws Exception;
	public abstract KolateralPonudeniRs procitajSvePonudeneKolateralePOVIJEST(KolateralPonudeniVo value) throws Exception;
	public abstract KolateralPonudeniVo dodajPonudeniKolateral(KolateralPonudeniVo value) throws Exception;
	public abstract KolateralPonudeniVo brisiPonudeniKolateral(KolateralPonudeniVo value) throws Exception;
	public abstract KolateralPonudeniVo brisiVisePonudenihKolaterala(KolateralPonudeniRs value) throws Exception;
	//vikr
	public abstract VikrVo azurirajVikr(VikrVo value) throws Exception;
	public abstract VikrRs procitajSveVikr(VikrVo value) throws Exception;
	public abstract VikrVo dodajVikr(VikrVo value) throws Exception;
	public abstract VikrVo brisiVikr(VikrVo value) throws Exception;
	//privitak
    public abstract ZahtjevPrivitakRs procitajSvePrivitke(ZahtjevPrivitakVo value) throws Exception;
    public abstract ZahtjevPrivitakVo dodajPrivitak(ZahtjevPrivitakVo value) throws Exception;
    public abstract ZahtjevPrivitakVo citajPrivitak(ZahtjevPrivitakVo value) throws Exception;
    public abstract ZahtjevPrivitakVo brisiPrivitak(ZahtjevPrivitakVo value) throws Exception;
    //rizik
    public abstract RizikVo azurirajOpceKomentare(RizikVo value) throws Exception;
    public abstract RizikVo citajRizik(RizikVo value) throws Exception;
    public abstract RizikVo dodajOpceKomentare(RizikVo value) throws Exception;
    public abstract BankarskiProizvodRs procitajSveOdobreneProizvode(BankarskiProizvodVo value) throws Exception;
    public abstract ZahtjevPravnaOsobaVo citajZahtjevZaProcjenuRizika(RizikVo value) throws Exception;
    public abstract RizikRs pripremaMisljenja(RizikVo value) throws Exception;
    public abstract RizikRs citajMisljenje(RizikVo value) throws Exception;
    public abstract RizikRs procitajSveProcjeneRizika(RizikVo value) throws Exception;
    public abstract RizikRs pronadiProcjeneRizika(RizikVo value) throws Exception;
    public abstract RizikVo duplicirajMisljenje(RizikVo value) throws Exception;
    //ocjena
	public abstract ZahOcjenaVo azurirajOcjenu(ZahOcjenaVo value) throws Exception;
	public abstract ZahOcjenaRs procitajSveOcjene(ZahOcjenaVo value) throws Exception;
	public abstract ZahOcjenaVo brisiOcjenu(ZahOcjenaVo value) throws Exception;
	public abstract ZahOcjenaRs pripremaOcjena(ZahOcjenaVo value) throws Exception;
	public abstract ZahOcjenaVo brisiViseOcjena(ZahOcjenaRs value) throws Exception;
	//bonitet
	public abstract ZahtjevPravnaOsobaVo dodajBonitet(ZahtjevPravnaOsobaVo value) throws Exception;
	public abstract ZahtjevPravnaOsobaVo citajPrijedlogOdobrenja(ZahtjevPravnaOsobaVo value) throws Exception;
	//urednost
	public abstract UrednostVo dodajUrednostZahtjeva(ZahtjevPravnaOsobaVo value) throws Exception;
	public abstract UrednostVo azurirajUrednostZahtjeva(UrednostVo value) throws Exception;
	public abstract UrednostVo citajUrednostZahtjeva(ZahtjevPravnaOsobaVo value) throws Exception;
	//osiguranje
	public abstract OsiguranjeVo dodajOsiguranjeZahtjeva(OsiguranjeVo value) throws Exception;
	public abstract OsiguranjeVo azurirajOsiguranjeZahtjeva(OsiguranjeVo value) throws Exception;
	public abstract OsiguranjeVo citajOsiguranjeZahtjeva(ZahtjevPravnaOsobaVo value) throws Exception;
	//bsa kolateral
	public abstract KolateralPonudeniRs procitajSvePostojeceKolaterale(ZaduzenostKodBankeVo value) throws Exception;
	//rizik komentar
	public abstract RizikKomentarVo dodajKomentar(RizikKomentarVo value) throws Exception;
	public abstract RizikKomentarVo azurirajKomentar(RizikKomentarVo value) throws Exception;
	public abstract RizikKomentarVo brisiKomentar(RizikKomentarVo value) throws Exception;
	public abstract RizikKomentarRs procitajSveKomentare(RizikKomentarVo value) throws Exception;
	//dionice
	public abstract PoslovniOdnosBankaRs citajDionicePovezanihOsoba(ZahtjevPravnaOsobaVo value)throws Exception;
}
