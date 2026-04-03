package com.github.desafiodata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatador = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
                .withLocale(new Locale("pt", "BR"));

        LocalDate dataEvento = LocalDate.now();
        LocalTime horaEvento = LocalTime.now();

        boolean dataCorreta = false;
        do {
            try {
                System.out.print("Data do evento: ");
                String dataEventoTexto = scanner.nextLine();
                dataEvento = LocalDate.parse(dataEventoTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                dataCorreta = true;
            } catch (DateTimeParseException e) {
                System.out.println("Data Inválida");
            }

        } while (!dataCorreta);


        boolean horaCorreta = false;

        do {
            try {
                System.out.print("Horário do evento: ");
                String horaEventoTexto = scanner.nextLine();
                horaEvento = LocalTime.parse(horaEventoTexto, DateTimeFormatter.ofPattern("HH:mm"));
                horaCorreta = true;
            } catch (DateTimeParseException e) {
                System.out.println("Horário Inválido");
            }
        } while (!horaCorreta);

        LocalDateTime dataHora = LocalDateTime.of(dataEvento, horaEvento);
        System.out.println(formatador.format(dataHora));
    }
}
