package com.github.datetimeapi.temporalacessor;

import java.time.Instant;
import java.util.Calendar;

public class ConhecendoInstant4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Instant instante = calendar.toInstant();

        System.out.println(calendar.getTime());
        System.out.println(instante);
        //Convertendo Calendar para Instant
    }
}
