package com.github.desafiointerface.modelo;

public class Caminhao extends VeiculoAutomotor{

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        return getValorMercado() * 0.02 + getQuantidadeEixos() * 50;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão ano %d, %d eixos, avaliado em R$%.2f", getAnoFabricacao(), getQuantidadeEixos(), getValorMercado());
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }
}
