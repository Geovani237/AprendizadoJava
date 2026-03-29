package com.github.desafiodatalegado;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalculadoraParcelas {

    private String data;
    private String parcelas;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        Objects.requireNonNull(data);
        this.data = data;
    }

    public String getParcelas() {
        return parcelas;
    }

    public void setParcelas(String parcelas) {
        Objects.requireNonNull(parcelas);
        this.parcelas = parcelas;
    }

    //TODO fazer com que essa Método seja privada e seja somente utilizada pela método que exibe para a classe Principal

    public void calcularParcelas(String data, int parcelas) throws ParseException {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formatador.parse(data);

        for (int i = 0; i < parcelas;){
            Calendar dataParcela = Calendar.getInstance();
            dataParcela.setTime(dataFormatada);

            dataParcela.add(Calendar.MONTH, i);
            System.out.println(String.format("Parcela #%d - %s", i++,formatador.format(dataParcela.getTime())));
        }

    }

    //TODO criar um método para exibir que use a método calcularParcelas
}
