package com.github.datetimeapi.chronofield;

import java.time.LocalDateTime;

public class Principal2 {
    public static void main(String[] args) {
        LocalDateTime datahoraCompra = LocalDateTime.parse("2022-11-25T21:05:54");
        System.out.println(datahoraCompra.getDayOfMonth());
        System.out.println(datahoraCompra.getHour());
        System.out.println(datahoraCompra.getMinute());
    }
}
