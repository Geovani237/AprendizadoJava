package com.github.banco.algabank;

import com.github.banco.javabank.Conta;

public class PontuacaoDecorator extends ContaBaseDecorator {

    private int pontos;

    public PontuacaoDecorator(Conta contaOriginal, int pontos) {
        super(contaOriginal);
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    @Override
    public void depositar(double valor) {
        getContaOriginal().depositar(valor);
        pontos += valor / 100;
    }

}
