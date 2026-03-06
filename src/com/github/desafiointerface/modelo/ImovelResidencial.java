package com.github.desafiointerface.modelo;

public class ImovelResidencial implements BemSeguravel{

    private double valorMercado;
    private int areaConstruida;

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.1) + (getAreaConstruida() * 0.3) ;
    }

    @Override
    public String descrever() {
        return "";
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }
}
