package hr.adriacomsoftware.app.common.helpdesk.facade;

import hr.adriacomsoftware.app.common.cmdb.dto.EmailVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskKontaktRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskKontaktVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivAktivnostRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivKomentarRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivKomentarVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivPrivitakRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivPrivitakVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskPozivVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogAktivnostVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogPrivitakRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogPrivitakVo;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogRs;
import hr.adriacomsoftware.app.common.helpdesk.dto.HelpDeskRadniNalogVo;

public interface HelpDeskFacade {
    //poziv
    public abstract HelpDeskPozivRs procitajSvePozive(HelpDeskPozivVo value) throws Exception;
    public abstract HelpDeskPozivRs pronadiPozive(HelpDeskPozivVo value) throws Exception;
    public abstract HelpDeskPozivVo azurirajPoziv(HelpDeskPozivVo value) throws Exception;
    public abstract HelpDeskPozivVo dodajPoziv(HelpDeskPozivVo value) throws Exception;
    public abstract HelpDeskPozivVo brisiPoziv(HelpDeskPozivVo value) throws Exception;
    public abstract HelpDeskPozivVo procitajZadnjiZahtjev(HelpDeskPozivVo value) throws Exception;
    public abstract HelpDeskPozivRs procitajDopusteneZahtjeve(HelpDeskPozivVo value) throws Exception;
    public abstract HelpDeskPozivVo dodajDopusteniZahtjev(HelpDeskPozivVo value) throws Exception;
    public abstract HelpDeskPozivVo brisiDopusteniZahtjev(HelpDeskPozivVo value) throws Exception;
    //radni nalog
    public abstract HelpDeskRadniNalogRs procitajSveRadneNaloge(HelpDeskRadniNalogVo value) throws Exception;
    public abstract HelpDeskRadniNalogRs pronadiRadneNaloge(HelpDeskRadniNalogVo value) throws Exception;
    public abstract HelpDeskRadniNalogVo azurirajRadniNalog(HelpDeskRadniNalogVo value) throws Exception;
    public abstract HelpDeskRadniNalogVo dodajRadniNalog(HelpDeskRadniNalogVo value) throws Exception;
    public abstract HelpDeskRadniNalogVo brisiRadniNalog(HelpDeskRadniNalogVo value) throws Exception;
    //poziv komentar
    public abstract HelpDeskPozivKomentarRs procitajSveKomentare(HelpDeskPozivKomentarVo value) throws Exception;
    public abstract HelpDeskPozivKomentarVo azurirajKomentar(HelpDeskPozivKomentarVo value) throws Exception;
    public abstract HelpDeskPozivKomentarVo dodajKomentar(HelpDeskPozivKomentarVo value) throws Exception;
    public abstract HelpDeskPozivKomentarVo brisiKomentar(HelpDeskPozivKomentarVo value) throws Exception;
    //poziv aktivnost
    public abstract HelpDeskPozivAktivnostRs procitajSveAktivnosti(HelpDeskRadniNalogAktivnostVo value) throws Exception;
    public abstract HelpDeskRadniNalogAktivnostVo azurirajAktivnost(HelpDeskRadniNalogAktivnostVo value) throws Exception;
    public abstract HelpDeskRadniNalogAktivnostVo dodajAktivnost(HelpDeskRadniNalogAktivnostVo value) throws Exception;
    public abstract HelpDeskRadniNalogAktivnostVo brisiAktivnost(HelpDeskRadniNalogAktivnostVo value) throws Exception;
    //email poziv i radni nalog
    public abstract EmailVo proslijediRadniNalogEmailom(EmailVo value) throws Exception;
    public abstract EmailVo proslijediHelpDeskPozivEmailom(EmailVo value) throws Exception;
    //privitak poziv
    public abstract HelpDeskPozivPrivitakRs procitajSvePrivitke(HelpDeskPozivPrivitakVo value) throws Exception;
    public abstract HelpDeskPozivPrivitakVo dodajPrivitak(HelpDeskPozivPrivitakVo value) throws Exception;
    public abstract HelpDeskPozivPrivitakVo citajPrivitak(HelpDeskPozivPrivitakVo value) throws Exception;
    public abstract HelpDeskPozivPrivitakVo brisiPrivitak(HelpDeskPozivPrivitakVo value) throws Exception;
    //privitak radni nalog
    public abstract HelpDeskRadniNalogPrivitakRs procitajSvePrivitkeRn(HelpDeskRadniNalogPrivitakVo value) throws Exception;
    public abstract HelpDeskRadniNalogPrivitakVo dodajPrivitakRn(HelpDeskRadniNalogPrivitakVo value) throws Exception;
    public abstract HelpDeskRadniNalogPrivitakVo citajPrivitakRn(HelpDeskRadniNalogPrivitakVo value) throws Exception;
    public abstract HelpDeskRadniNalogPrivitakVo brisiPrivitakRn(HelpDeskRadniNalogPrivitakVo value) throws Exception;
    //kontakt
    public abstract HelpDeskKontaktRs procitajSveKontakte(HelpDeskKontaktVo value) throws Exception;
    public abstract HelpDeskKontaktRs pronadiKontakte(HelpDeskKontaktVo value) throws Exception;
    public abstract HelpDeskKontaktVo azurirajKontakt(HelpDeskKontaktVo value) throws Exception;
    public abstract HelpDeskKontaktVo dodajKontakt(HelpDeskKontaktVo value) throws Exception;
    public abstract HelpDeskKontaktVo brisiKontakt(HelpDeskKontaktVo value) throws Exception;    
}
