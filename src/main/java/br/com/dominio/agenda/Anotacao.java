package br.com.dominio.agenda;

import java.time.LocalDate;
import java.util.Objects;

public class Anotacao {

    private String mensagem;
    private LocalDate dataMensagem;

    public Anotacao(String mensagem, LocalDate data) {
        this.mensagem = mensagem;
        this.dataMensagem = data;
    }

    public String getMensagem() {

        return mensagem;
    }

    public void setMensagem(String mensagem) {

        this.mensagem = mensagem;
    }

    public LocalDate getDataMensagem() {
        return dataMensagem;
    }

    public void setDataMensagem(LocalDate dataMensagem) {
        this.dataMensagem = dataMensagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anotacao anotacao = (Anotacao) o;
        return Objects.equals(mensagem, anotacao.mensagem) && Objects.equals(dataMensagem, anotacao.dataMensagem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mensagem, dataMensagem);
    }
}
