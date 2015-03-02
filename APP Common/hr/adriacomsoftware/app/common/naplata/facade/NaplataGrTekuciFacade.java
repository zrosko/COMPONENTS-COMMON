package hr.adriacomsoftware.app.common.naplata.facade;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniRs;
import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciBiljeskaRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciBiljeskaVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciDopisRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciDopisVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciObradaRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciObradaVo;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciPracenjeRs;
import hr.adriacomsoftware.app.common.naplata.dto.NaplataGrTekuciPracenjeVo;
import hr.as2.inf.common.data.AS2Record;
import hr.as2.inf.common.data.AS2RecordList;

public interface NaplataGrTekuciFacade {

	/************* FACADE INTERFACE  naplata_gr_tekuci_pracenje ************/

	public abstract NaplataGrTekuciPracenjeVo brisiNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws Exception;
	public abstract NaplataGrTekuciPracenjeVo dodajNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws Exception;
	public abstract NaplataGrTekuciPracenjeVo azurirajNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws Exception;
	public abstract NaplataGrTekuciPracenjeRs procitajSveNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws Exception;
	public abstract AS2RecordList listajSveNaplataGrTekuciPracenje() throws Exception;
	public abstract NaplataGrTekuciPracenjeRs pretraziNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws Exception;
	public abstract NaplataGrTekuciPracenjeVo procitajiNaplataGrTekuciPracenje(NaplataGrTekuciPracenjeVo value) throws Exception;
	public abstract NaplataGrTekuciPracenjeVo dodajNoveKlijente(NaplataGrTekuciPracenjeRs value) throws Exception;
	
	/************* FACADE INTERFACE  naplata_gr_tekuci_biljeska ************/

	public abstract NaplataGrTekuciBiljeskaVo brisiNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws Exception;
	public abstract NaplataGrTekuciBiljeskaVo dodajNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws Exception;
	public abstract NaplataGrTekuciBiljeskaVo azurirajNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws Exception;
	public abstract NaplataGrTekuciBiljeskaRs procitajSveNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws Exception;
	public abstract AS2RecordList listajSveNaplataGrTekuciBiljeska() throws Exception;
	public abstract NaplataGrTekuciBiljeskaRs pretraziNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws Exception;
	public abstract NaplataGrTekuciBiljeskaVo procitajiNaplataGrTekuciBiljeska(NaplataGrTekuciBiljeskaVo value) throws Exception;
	public abstract NaplataGrTekuciBiljeskaVo brisiViseBiljeski(NaplataGrTekuciBiljeskaRs value) throws Exception;
	
	/************* FACADE INTERFACE  naplata_gr_tekuci_dopis ************/

	public abstract NaplataGrTekuciDopisVo brisiNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws Exception;
	public abstract NaplataGrTekuciDopisVo dodajNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws Exception;
	public abstract NaplataGrTekuciDopisVo azurirajNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws Exception;
	public abstract NaplataGrTekuciDopisRs procitajSveNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws Exception;
	public abstract AS2RecordList listajSveNaplataGrTekuciDopis() throws Exception;
	public abstract NaplataGrTekuciDopisRs pretraziNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws Exception;
	public abstract NaplataGrTekuciDopisVo procitajiNaplataGrTekuciDopis(NaplataGrTekuciDopisVo value) throws Exception;
	public abstract NaplataGrTekuciDopisVo brisiViseDopisa(NaplataGrTekuciDopisRs value) throws Exception;
	
	public abstract NaplataGrTekuciDopisVo citajPrivitak(NaplataGrTekuciDopisVo value) throws Exception;
	

	/************* FACADE INTERFACE  naplata_gr_tekuci_obrada ************/

	public abstract NaplataGrTekuciObradaVo brisiNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws Exception;
	public abstract NaplataGrTekuciObradaVo dodajNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws Exception;
	public abstract NaplataGrTekuciObradaVo azurirajNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws Exception;
	public abstract NaplataGrTekuciObradaRs procitajSveNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws Exception;
	public abstract AS2RecordList listajSveNaplataGrTekuciObrada() throws Exception;
	public abstract NaplataGrTekuciObradaRs pretraziNaplataGrTekuciObrada(NaplataGrTekuciObradaVo value) throws Exception;
	
	public abstract NaplataGrTekuciObradaRs citajStavkeObrade(NaplataGrTekuciObradaVo value) throws Exception;
	public abstract AS2Record dodajObradu(NaplataGrTekuciPracenjeRs value) throws Exception;
	public abstract NaplataGrTekuciObradaVo citajObradu(NaplataGrTekuciObradaVo value) throws Exception;
	
	/************* FACADE INTERFACE  zajednicko ************/
	
	public abstract OsnovniRs procitajSifre(OsnovniVo value) throws Exception;
    public abstract OsnovniRs izvjestaji(OsnovniVo value) throws Exception;
}
