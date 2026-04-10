package com.github.optional.companhiaaerea.ciaeaerea;

public class ReservaNaoEncontradaException extends RuntimeException{
    public ReservaNaoEncontradaException() {
    }

    public ReservaNaoEncontradaException(String message) {
        super(message);
    }
}
