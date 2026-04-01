package com.github.DESAFIO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class CalculadoraParcelas {

    public void calcular(String dataTexto, int parcelas) {
        LocalDate data = LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int dataMaxima = data.getDayOfMonth();

        for (int i = 1; i <= parcelas;) {
            LocalDate novaData = ChronoUnit.MONTHS.addTo(data,1);
            LocalDate ultimoDiaLocalDate = data.with(TemporalAdjusters.lastDayOfMonth());

            int diaNovaData = novaData.getDayOfMonth();

            if (dataMaxima <= diaNovaData) {
                System.out.println("Parcela #" + i + " - " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                data = novaData;
            } else {
                data = ultimoDiaLocalDate;
                System.out.println("Parcela #" + i + " - " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                data = novaData;
            }

            i++;
        }
    }

}
