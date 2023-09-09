package br.com.dominio.agenda;

import br.com.dominio.exceptions.agendainvalidaException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Anotacoes {

    private List<Anotacao> anotacoes;

    public Anotacoes() {
        anotacoes = new ArrayList<>();
    }

    public List<Anotacao> getAnotacoes() {
        return anotacoes;
    }

    public boolean inserirTarefa(Anotacao anotacao) {
        if (anotacao == null || anotacao.getMensagem() == null || anotacao.getDataMensagem() == null) {
            throw new agendainvalidaException();
        } else {
            int verificardata = anotacao.getDataMensagem().compareTo(LocalDate.now());
            if (anotacao.getMensagem().length() > 1 && verificardata >= 0) {
                anotacoes.add(anotacao);
                return true;
            } else {
                return false;
            }

        }
    }

    public boolean listarAgenda() {
        if (anotacoes.size() > 0) {
            anotacoes.forEach(System.out::println);
            return true;
        } else {
            return false;
        }

    }

}
