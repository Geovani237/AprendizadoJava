package com.github.desafios.desafiotemporaladjuster;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class AgendaReuniao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano: ");
        String anoReuniaoTexto = scanner.nextLine();
        Year anoReuniao = Year.parse(anoReuniaoTexto);
        int anoReuniaoInt = anoReuniao.getValue();

        System.out.print("Mês inicial: ");
        int mesInicialInt = scanner.nextInt();
        Month mesInicial = Month.of(mesInicialInt);
        System.out.println("Gerando agenda anual de reunião desde " +
                mesInicial.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + " de " + anoReuniao);

        DayOfWeek diaDaReuniao = DayOfWeek.from(DayOfWeek.MONDAY);

        LocalDate data = LocalDate.of(anoReuniaoInt,mesInicial,1);
        while (mesInicialInt <= 12) {

            LocalDate segundaMesAtual = data.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
            System.out.println(diaDaReuniao.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + ", " + segundaMesAtual.getDayOfMonth()  + " de " + mesInicial.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + " de " + anoReuniao);

            mesInicial = mesInicial.plus(1);
            data = data.plusMonths(1);
            mesInicialInt++;
        }
    }
}
