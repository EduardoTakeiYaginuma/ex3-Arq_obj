package br.insper.campeonato.partida;

import br.insper.campeonato.campeonato.Campeonato;
import br.insper.campeonato.campeonato.CampeonatoService;
import br.insper.campeonato.time.Time;
import br.insper.campeonato.time.TimeService;
import jakarta.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PartidaService {
    @Autowired
    private TimeService timeService;
    @Autowired
    private CampeonatoService campeonatoService;
    private ArrayList<Partida> partidas = new ArrayList<>();

    public void cadastraPartida(Partida partida){
        Time timeMandante = timeService.getTimeId(partida.getTimeMandante().getIdentificador());
        Time timeVisitante = timeService.getTimeId(partida.getTimeVisitante().getIdentificador());
        Campeonato campeonato = campeonatoService.getCampeonatoId(partida.getCampeonato().getIdentificador());
        if (partida.getPlacarMandante().equals("") || partida.getPlacarVisitante().equals("") || partida.getTimeMandante().equals("") || partida.getTimeVisitante().equals("") || partida.getCampeonato().equals("")){
            return;
        }
        else if (timeMandante == null || timeVisitante == null || campeonato == null){
            return;
        }
        else {
            partida.setTimeMandante(timeMandante);
            partida.setTimeVisitante(timeVisitante);
            partida.setCampeonato(campeonato);
            partidas.add(partida);
        }
    }

    public ArrayList<Partida> listarPartidas(String timeMandante) {
        if (timeMandante != null) {
            ArrayList<Partida> lista = new ArrayList<>();
            for (Partida partida : partidas) {
                if (partida.getTimeMandante().getNome().equals(timeMandante)) {
                    lista.add(partida);
                }
            }
            return lista;
        }
        return partidas;
    }

    public Integer calculaVitorias(String time) {
        Integer vitorias = 0;

        for (Partida partida : partidas) {
            if (partida.getTimeMandante().getNome().equals(time)) {
                if (partida.getPlacarMandante() > partida.getPlacarVisitante()) {
                    vitorias++;
                }
            }
            if (partida.getTimeVisitante().getNome().equals(time)){
                if (partida.getPlacarVisitante() > partida.getPlacarMandante()) {
                    vitorias++;
                }
            }
        }
        return vitorias;
    }

    public ArrayList<Partida> listarCampeonatos(String nome) {
        if (nome != null){
            ArrayList<Partida> lista = new ArrayList<>();

            for (Partida partida : partidas) {
                if (partida.getCampeonato().getNome().equals(nome)) {
                    lista.add(partida);
                }
            }
            return lista;
        }
        return partidas;
    }

}
