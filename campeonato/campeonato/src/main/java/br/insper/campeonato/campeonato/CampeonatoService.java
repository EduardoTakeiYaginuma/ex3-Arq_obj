package br.insper.campeonato.campeonato;

import br.insper.campeonato.partida.Partida;
import br.insper.campeonato.partida.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CampeonatoService {
    private List<Campeonato> campeonatos = new ArrayList<Campeonato>();
    public void cadastraCampeonato(Campeonato campeonato){
        if (campeonato.getNome().equals("") || campeonato.getIdentificador().equals("")){
            return;
        }
        else {
            campeonatos.add(campeonato);
        }
    }


    public Campeonato getCampeonatoId(String identificador) {
        for (Campeonato campeonato : campeonatos) {
            if (campeonato.getIdentificador().equals(identificador)) {
                return campeonato;
            }
        }
        return null;
    }
}
