package br.com.dominio;

import br.com.dominio.agenda.Anotacao;
import br.com.dominio.agenda.Anotacoes;
import br.com.dominio.exceptions.agendainvalidaException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestarAnotacoes {

    @Test
    void testarInserirTarefaInvalida() {
        Anotacao anotacao = new Anotacao(null, null);
        //testar o retorno da exception personalizada
        Anotacoes anotacoes = new Anotacoes();
        Assertions.assertThrows(agendainvalidaException.class, () -> anotacoes.inserirTarefa(anotacao));
    }

    @Test
    void testarInserirTarefavalida() {
        Anotacao anotacao = new Anotacao("mensagem legal", LocalDate.now());
        //testar o retorno da exception personalizada
        Anotacoes anotacoes = new Anotacoes();
        Assertions.assertTrue(anotacoes.inserirTarefa(anotacao));
    }

    @Test
    void testarInserirTarefaMensagemInvalida() {
        Anotacao anotacao = new Anotacao("m", LocalDate.now());
        //testar o retorno da exception personalizada
        Anotacoes anotacoes = new Anotacoes();
        Assertions.assertFalse(anotacoes.inserirTarefa(anotacao));
    }
    @Test
    void testarImprimirAnotacoesInvalida(){
        Anotacoes anotacoes = new Anotacoes();
        Assertions.assertFalse(anotacoes.listarAgenda());
    }

    @Test
    void testarImprimirAnotacoesvalida(){
        Anotacao anotacao = new Anotacao("deu certo", LocalDate.now());
        Anotacoes anotacoes = new Anotacoes();
        anotacoes.inserirTarefa(anotacao);
        Assertions.assertTrue(anotacoes.listarAgenda());
    }
    @Test
    void verificardataIgualPosterior(){
        Anotacao anotacao = new Anotacao("deu certo", LocalDate.now());
        Anotacoes anotacoes = new Anotacoes();
        Assertions.assertTrue(anotacoes.inserirTarefa(anotacao));
    }

    @Test
    void verificarDataInvalida(){
        Anotacao anotacao = new Anotacao("deu certo", LocalDate.of(2023, 9, 8));
        Anotacoes anotacoes = new Anotacoes();
        Assertions.assertFalse(anotacoes.inserirTarefa(anotacao));
    }




}
