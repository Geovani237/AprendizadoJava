package com.github.desafios.desafiocalculadoraparcelas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraParcelas calculadoraDeParcelas = new CalculadoraParcelas();
            System.out.print("Data da primeira parcela: ");
            String data = scanner.nextLine();
            System.out.print("Quantidade de parcelas: ");
            int parcelas = scanner.nextInt();
            calculadoraDeParcelas.calcular(data, parcelas);


    }
}
