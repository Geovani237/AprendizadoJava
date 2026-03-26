package com.github.desafionumerico;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;


public class Cambio {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        DecimalFormatSymbols symbolsReal = new DecimalFormatSymbols(new Locale("pt", "BR"));
        DecimalFormat formatadorDeReal = new DecimalFormat("#,##0.00", symbolsReal);
        formatadorDeReal.setParseBigDecimal(true);

        DecimalFormat formatadorDeDolar = new DecimalFormat("#,##0.00");
        formatadorDeDolar.setParseBigDecimal(true);

        System.out.print("Preço do produto em Dolar: ");
        String dolar = sc.next();
        BigDecimal converteDolarParaBigDecimal = (BigDecimal) formatadorDeDolar.parse(dolar);

        System.out.print("Preço de 1 Real em Dolar: ");
        String real = sc.next();
        BigDecimal converteRealParaBigDecimal = (BigDecimal) formatadorDeReal.parse(real);

        BigDecimal valorProdutoEmDolar = converteRealParaBigDecimal.multiply(converteDolarParaBigDecimal);

        NumberFormat formatadorBr = new DecimalFormat("¤ #,##0.00",
                new DecimalFormatSymbols(new Locale("pt", "BR")));
        System.out.print("Preço do produto em Reais: ");
        System.out.println(formatadorBr.format(valorProdutoEmDolar));
    }
}
