package com.github.datetimeapi.monthday;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public class Principal1 {
    public static void main(String[] args) {
//        MonthDay diaMesAtual = MonthDay.now();
//        MonthDay diaAniversaio = MonthDay.of(Month.SEPTEMBER,13);
//        MonthDay diaMes = MonthDay.from(LocalDate.now());
        MonthDay diaMes = MonthDay.parse("--11-13");

        System.out.println(diaMes);

//        LocalDate dataAniversaio = diaMes.atYear(2003);
        LocalDate dataAniversaio = Year.now().atMonthDay(diaMes);

        System.out.println(dataAniversaio);
    }
}
