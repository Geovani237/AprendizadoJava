package com.github.desafiotemporaladjuster;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendaReuniao {
    //Pré requisitos
    //Year -> pedir o Ano
    //Month -> pedir o mes
    //MonthYear -> provavelmente unir Year e Month
    //Fim pré requisitos
    //sera usado o Enum DayOfWeek
    //provalvelmente MonthDay
    //Reuniões toda a primeira segunda-feira do mês



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano: ");
        String anoReuniaoTexto = scanner.nextLine();
        Year anoReuniao = Year.parse(anoReuniaoTexto);

        System.out.print("Mês inicial: ");
        int mesInicialInt = scanner.nextInt();
        Month mesInicial = Month.of(mesInicialInt);
        System.out.println("Gerando agenda anual de reunião desde " +
                mesInicial.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + " de " + anoReuniao);

        DayOfWeek diaDaReuniao = DayOfWeek.MONDAY;
        System.out.println(diaDaReuniao);
        while (mesInicialInt <= 12) {
            System.out.println(mesInicial.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + " de " + anoReuniao);
            mesInicial = mesInicial.plus(1);
            mesInicialInt++;
        }
    }



}
