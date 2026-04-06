package com.github.desafios.desafiodatalegado;

import java.text.ParseException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        CalculadoraParcelas calculadora = new CalculadoraParcelas();
        System.out.print("Data da primeira parcela: ");
        String data = scanner.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantidade = scanner.nextInt();

        calculadora.calcularParcelas(data, quantidade);


    }
}
