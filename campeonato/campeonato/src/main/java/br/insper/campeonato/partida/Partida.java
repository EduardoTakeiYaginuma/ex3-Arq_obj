package br.insper.campeonato.partida;

import br.insper.campeonato.time.Time;
import br.insper.campeonato.campeonato.Campeonato;

public class Partida {

    private Time timeMandante;
    private Time timeVisitante;
    private Integer placarMandante;
    private Integer placarVisitante;
    private Campeonato campeonato;

    public Partida(Time timeMandante, Time timeVisitante, Integer placarMandante, Integer placarVisitante, Campeonato campeonato){
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
        this.campeonato = campeonato;
    }

    public Time getTimeMandante() {
        return timeMandante;
    }

    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Integer getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(Integer placarMandante) {
        this.placarMandante = placarMandante;
    }

    public Integer getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(Integer placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
}
