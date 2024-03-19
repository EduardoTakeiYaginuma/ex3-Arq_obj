package br.insper.campeonato.partida;

import br.insper.campeonato.time.Time;
import br.insper.campeonato.time.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class PartidaController {
    @Autowired
    private PartidaService partidaService;

    @PostMapping("/partida")
    public void salvaPartida(@RequestBody Partida partida){
        partidaService.cadastraPartida(partida);
    }

    @GetMapping("/partida")
    public ArrayList<Partida> getPartidas(@RequestParam(required = false) String timeMandante){
        return partidaService.listarPartidas(timeMandante);
    }

    @GetMapping("/vitorias")
    public Integer calculaPartidas(@RequestParam(required = true) String time){
        return partidaService.calculaVitorias(time);
    }


}
