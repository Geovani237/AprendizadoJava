package com.github.datetimeapi.temporaladjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Principal1 {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        LocalDate primeiraSegundaProximoMes = dataHoje
                .plusMonths(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        LocalDate ultimoDiaDoMes = dataHoje.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(primeiraSegundaProximoMes);
        System.out.println(ultimoDiaDoMes);

        LocalDate dataProximaSextaFeita = dataHoje.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(dataProximaSextaFeita);
    }
}
