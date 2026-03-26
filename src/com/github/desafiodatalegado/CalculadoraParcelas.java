package com.github.desafiodatalegado;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

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

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataFormatada);

        int inicioMesParcela = calendar.get(Calendar.MONTH);
        int diaDaParcela = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.add(Calendar.MONTH, parcelas);
//
        for (int i = 0; i < parcelas; i++){
            System.out.println(calendar.getTime());
        }

    }

    //TODO criar um método para exibir que use a método calcularParcelas
}
