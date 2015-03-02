package hr.adriacomsoftware.app.common.or.facade;

import hr.adriacomsoftware.app.common.or.dto.OrDogadajRs;
import hr.adriacomsoftware.app.common.or.dto.OrDogadajVo;
import hr.adriacomsoftware.app.common.or.dto.OrGubitakRs;
import hr.adriacomsoftware.app.common.or.dto.OrGubitakVo;
import hr.adriacomsoftware.app.common.or.dto.OrNadoknadaRs;
import hr.adriacomsoftware.app.common.or.dto.OrNadoknadaVo;
import hr.adriacomsoftware.app.common.or.dto.OrPoduzetaMjeraRs;
import hr.adriacomsoftware.app.common.or.dto.OrPoduzetaMjeraVo;

public interface OrFacade {
    //dogadaj
    public abstract OrDogadajRs pronadiDogadaje(OrDogadajVo value) throws Exception;;
    public abstract OrDogadajRs procitajSveDogadaje(OrDogadajVo value) throws Exception;;
    public abstract OrDogadajVo azurirajDogadaj(OrDogadajVo value) throws Exception;;
    public abstract OrDogadajVo dodajDogadaj(OrDogadajVo value) throws Exception;;
    public abstract OrDogadajVo brisiDogadaj(OrDogadajVo value) throws Exception;;
    //gubitak
    public abstract OrGubitakRs pronadiGubitake(OrGubitakVo value) throws Exception;;
    public abstract OrGubitakRs procitajSveGubitake(OrGubitakVo value) throws Exception;;
    public abstract OrGubitakVo azurirajGubitak(OrGubitakVo value) throws Exception;;
    public abstract OrGubitakVo dodajGubitak(OrGubitakVo value) throws Exception;;
    public abstract OrGubitakVo brisiGubitak(OrGubitakVo value) throws Exception;;
    //nadoknada
    public abstract OrNadoknadaRs pronadiNadoknada(OrNadoknadaVo value) throws Exception;;
    public abstract OrNadoknadaRs procitajSveNadoknada(OrNadoknadaVo value) throws Exception;;
    public abstract OrNadoknadaVo azurirajNadoknada(OrNadoknadaVo value) throws Exception;;
    public abstract OrNadoknadaVo dodajNadoknada(OrNadoknadaVo value) throws Exception;;
    public abstract OrNadoknadaVo brisiNadoknada(OrNadoknadaVo value) throws Exception;;
    //poduzeta mjera
    public abstract OrPoduzetaMjeraRs pronadiPoduzetaMjera(OrPoduzetaMjeraVo value) throws Exception;;
    public abstract OrPoduzetaMjeraRs procitajSvePoduzetaMjera(OrPoduzetaMjeraVo value) throws Exception;;
    public abstract OrPoduzetaMjeraVo azurirajPoduzetaMjera(OrPoduzetaMjeraVo value) throws Exception;;
    public abstract OrPoduzetaMjeraVo dodajPoduzetaMjera(OrPoduzetaMjeraVo value) throws Exception;;
    public abstract OrPoduzetaMjeraVo brisiPoduzetaMjera(OrPoduzetaMjeraVo value) throws Exception;;
}
