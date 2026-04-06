package com.github.datetimeapi.temporalacessor;

import java.time.Instant;
import java.util.Date;

public class ConhecendoInstant3 {
    public static void main(String[] args) {
        Date data = new Date();
        Instant instante = data.toInstant();

        System.out.println(data);
        System.out.println(instante);
        //Convertendo da api antiga para a nova
    }
}
