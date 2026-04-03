package com.github.desafiocalculadoraparcelas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class CalculadoraParcelas {

    public void calcular(String dataTexto, int parcelas) {
        LocalDate data = LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int dataMaxima = data.getDayOfMonth();

        for (int i = 1; i <= parcelas; i++) {
            LocalDate ultimoDiaLocalDate = data.with(TemporalAdjusters.lastDayOfMonth());

            int diaNovaData = ultimoDiaLocalDate.getDayOfMonth();

            if (diaNovaData < dataMaxima) {
                System.out.println("Parcela #" + i + " - " + ultimoDiaLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            } else {
                data = data.withDayOfMonth(dataMaxima);
                System.out.println("Parcela #" + i + " - " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }

            data = ChronoUnit.MONTHS.addTo(data,1);
        }
    }

}
