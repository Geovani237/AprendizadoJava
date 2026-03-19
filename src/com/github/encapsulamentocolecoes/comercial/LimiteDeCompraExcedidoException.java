package com.github.encapsulamentocolecoes.comercial;

public class LimiteDeCompraExcedidoException extends RuntimeException{
    public LimiteDeCompraExcedidoException(String message) {
        super(message);
    }
}
