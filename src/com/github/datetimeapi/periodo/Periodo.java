package com.github.datetimeapi.periodo;

import java.time.Period;

public class Periodo {
    public static void main(String[] args) {
//        Period periodo = Period.ofMonths(15);
//        Period periodo = Period.ofDays(77);
//        Period periodo = Period.of(1,5,20);
        Period periodo = Period.parse("P2Y12M10D");
        System.out.println(periodo);

//        Period periodoCalculado = periodo.plus(Period.ofYears(1));
//        Period periodoCalculado = periodo.plusYears(10);
        Period periodoCalculado = periodo.multipliedBy(3).normalized();

        System.out.println(periodoCalculado);

        String periodoFormatado = String.format("%d anos, %d meses e %d dias", periodoCalculado.getYears(),
                periodoCalculado.getMonths(),
                periodoCalculado.getDays());
        System.out.println(periodoFormatado);
    }
}
