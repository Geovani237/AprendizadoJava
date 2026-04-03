package com.github.datetimeapi.chronounit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculandoObjetosTemporais {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();

//        LocalDate dataProximaParcela = agora.plus(30, ChronoUnit.DAYS);
        LocalDate dataProximaParcela = ChronoUnit.DAYS.addTo(agora,30);
        LocalDate dataDecadaPassada = agora.minus(1,ChronoUnit.CENTURIES);
        System.out.println(agora);
        System.out.println(dataProximaParcela);
        System.out.println(dataDecadaPassada);
    }
}
