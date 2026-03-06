package com.github.desafiointerface.modelo;

public class Caminhao extends VeiculoAutomotor{

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        return 0;
    }

    @Override
    public String descrever() {
        return "";
    }
}
