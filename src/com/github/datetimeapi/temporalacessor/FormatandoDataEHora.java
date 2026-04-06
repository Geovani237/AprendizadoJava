package com.github.datetimeapi.temporalacessor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDataEHora {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
//        DateTimeFormatter formatador = DateTimeFormatter.ISO_DATE;
//        System.out.println(dataHora);
//        DateTimeFormatter formatador = DateTimeFormatter
//                .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
//                .withLocale(new Locale("pt","BR"));

//        System.out.println(formatador.format(dataHora));
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss");

        System.out.println(dataHora.format(formatador));
    }
}
