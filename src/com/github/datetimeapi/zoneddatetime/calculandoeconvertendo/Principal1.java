package com.github.datetimeapi.zoneddatetime.calculandoeconvertendo;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Principal1 {
    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now();
        LocalDateTime dataHoraSemFuso = dataHoraFusoPadrao.toLocalDateTime();
        System.out.println(dataHoraFusoPadrao);
        System.out.println(dataHoraSemFuso);
    }
}
