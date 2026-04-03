package com.github.datetimeapi.chronofield;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AdicionandoESubstraindoObjetosTemporais {
    public static void main(String[] args) {
//        LocalDate hoje = LocalDate.now();
//        LocalDate semanaPassado = hoje.minusWeeks(1);
//        System.out.println(hoje);
//        System.out.println(semanaPassado);

//        LocalDateTime agora = LocalDateTime.now();
//        LocalDateTime semanaPassada = agora
//                .minusWeeks(1)
//                .minusHours(10);
//        System.out.println(agora);
//        System.out.println(semanaPassada);

        LocalDate hoje = LocalDate.now();
        LocalDate dataProximaParcela = hoje.plusDays(30);

        System.out.println(hoje);
        System.out.println(dataProximaParcela);
    }
}
