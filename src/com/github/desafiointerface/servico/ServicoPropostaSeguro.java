package com.github.desafiointerface.servico;

import com.github.desafiointerface.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem){
        System.out.println("-----------------");
        System.out.println("Proposta de seguro");
        System.out.println("-----------------");

        System.out.println(bem.descrever());
        System.out.printf("Prêmio: R$%.2f",bem.calcularValorPremio());


    }
}
