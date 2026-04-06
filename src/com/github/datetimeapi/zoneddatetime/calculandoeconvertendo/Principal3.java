package com.github.datetimeapi.zoneddatetime.calculandoeconvertendo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal3 {
    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoSaoPaulo = ZonedDateTime.parse("2022-11-20T20:00:00-03:00[America/Sao_Paulo]");

        Instant instant = dataHoraFusoSaoPaulo.toInstant();

        LocalDateTime dataHoraLocalLosAngeles = LocalDateTime.ofInstant(instant, ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraFusoSaoPaulo);
        System.out.println(instant);
        System.out.println(dataHoraLocalLosAngeles);

    }
}
