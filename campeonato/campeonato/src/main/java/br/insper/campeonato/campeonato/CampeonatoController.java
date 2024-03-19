package br.insper.campeonato.campeonato;

import br.insper.campeonato.partida.Partida;
import br.insper.campeonato.partida.PartidaService;
import br.insper.campeonato.time.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class CampeonatoController {


        @Autowired
        private CampeonatoService campeonatoService;
        @Autowired
        private PartidaService partidaService;


        @PostMapping("/campeonato")
        public void salvaCampeonato(@RequestBody Campeonato campeonato){
            campeonatoService.cadastraCampeonato(campeonato);
        }

        @GetMapping("/campeonato")
        public ArrayList<Partida> getCampeonato(@RequestParam(required = false) String nome){
            return partidaService.listarCampeonatos(nome);
        }

        @GetMapping("/campeonato/{identificador}")
        public Campeonato getCampeonatoId(@PathVariable String identificador) {
            return campeonatoService.getCampeonatoId(identificador);
        }




}
