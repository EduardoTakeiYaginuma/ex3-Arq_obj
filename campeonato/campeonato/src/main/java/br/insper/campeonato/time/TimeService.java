package br.insper.campeonato.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
@Service
public class TimeService {

        private ArrayList<Time> times = new ArrayList<>();

        public void cadastrarTime(Time time) {
            if (time.getNome().equals("")) {
                return;
            } else {
                times.add(time);
            }
        }
        public ArrayList<Time> listarTimes(String estado) {
            if (estado != null) {
                ArrayList<Time> lista = new ArrayList<>();
                for (Time time : times) {
                    if (time.getEstado().equalsIgnoreCase(estado)) {
                        lista.add(time);
                    }
                }
                return lista;
            }
            return times;
        }

        public Time getTimeId(String identificador) {
            for (Time time : times) {
                if (time.getIdentificador().equals(identificador)) {
                    return time;
                }
            }
            return null;
        }

        public void excluirTime(String nome) {
            Time timeRemover = null;
            for (Time time : times) {
                if (nome.equalsIgnoreCase(time.getNome())) {
                    timeRemover = time;
                }
            }
            if (timeRemover != null) {
                times.remove(timeRemover);
            } else {
                return;
            }
        }

}
