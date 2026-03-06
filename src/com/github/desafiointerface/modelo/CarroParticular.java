package com.github.desafiointerface.modelo;

public class CarroParticular extends VeiculoAutomotor{


    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        if (getAnoFabricacao() < 2000) {
            double acrecimo = getValorMercado() * 0.04;
            return acrecimo * 0.05;
        }
        return getValorMercado() * 0.04;
    }

    @Override
    public String descrever() {
        return String.format("Carro particular %s ano %d, avaliado em R$%.2f", getModelo(), getAnoFabricacao(),getValorMercado());
    }
}
