package br.com.dominio.exceptions;

public class agendainvalidaException extends RuntimeException {

    @Override
    public String getMessage() {
        return "produto esta invalido";
    }
}
