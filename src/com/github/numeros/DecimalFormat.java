package com.github.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormat {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.CHINA);
//        Locale.setDefault(new Locale("pt", "BR"));

        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = -1;
        BigDecimal d = new BigDecimal("45.362");

        //Conjunto de simbolos para formatação, utilizando o DecimalFormatSymbols podemos atribuir uma mudaça
        // de Localidade somente para o DecimalFormat, sem alterar o Locale do nosso projeto em sí
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        NumberFormat formatador = new java.text.DecimalFormat("¤ #,##0.00", symbols);

//        NumberFormat formatador = NumberFormat.getPercentInstance();

        //Da para fazer isso com o getCurrencyInstance
//        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));


        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
    }
}
