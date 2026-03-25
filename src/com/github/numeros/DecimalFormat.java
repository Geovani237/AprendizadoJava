package com.github.numeros;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class DecimalFormat {
    public static void main(String[] args) {
        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = 1;
        BigDecimal d = new BigDecimal("45.362");

        NumberFormat formatador = new java.text.DecimalFormat("#.###");

        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
    }
}
