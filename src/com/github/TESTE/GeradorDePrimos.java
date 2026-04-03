package com.github.TESTE;

public class GeradorDePrimos {

    public static void main(String[] args) {
        verificaPrimalidade(387563973);
    }


    static void verificaPrimalidade(int x) {
        int numeroDeDivisores = 1;
        int candidatoADivisor = 2;

        while (candidatoADivisor <= 2) {
            if (x %candidatoADivisor == 0) numeroDeDivisores = numeroDeDivisores + 1;
            candidatoADivisor = candidatoADivisor + 1;
        }

        if (numeroDeDivisores == 2) {
            System.out.println(x + " é primo.");
        } else {
            System.out.println(x + " não é primo.");
        }
    }
}
