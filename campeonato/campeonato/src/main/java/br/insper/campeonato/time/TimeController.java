package br.insper.campeonato.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class TimeController {
    @Autowired
    private TimeService timeService;

    @GetMapping("/time")
    public ArrayList<Time> getTime(@RequestParam(required = false) String estado) {
        return timeService.listarTimes(estado);
    }

    @GetMapping("/time/{identificador}")
    public Time getTimeId(@PathVariable String identificador) {
        return timeService.getTimeId(identificador);
    }

    @PostMapping("/time")
    public void salvaTime(@RequestBody Time time) {
        timeService.cadastrarTime(time);
    }

    @DeleteMapping("/time/{nome}")
    public void delete(@PathVariable String nome) {
        timeService.excluirTime(nome);
    }



}
