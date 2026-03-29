package com.github.datetimeapi.convertendostring;

import java.time.Instant;

public class ExemploInstant {
    public static void main(String[] args) {
//        Instant instante = Instant.parse("2010-08-20T19:24:20-00:00");
//        Instant instante = Instant.parse("2010-08-20T19:24:20Z");
        Instant instante = Instant.parse("2010-08-20T19:24:20-03:00");
        System.out.println(instante);
    }
}
