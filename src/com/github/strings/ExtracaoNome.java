package com.github.strings;

public class ExtracaoNome {
    public static void main(String[] args) {
        String nome = "João Silva Souza Magalhães";

        // para identificar o 1 espaço utiliza indexOf
//        System.out.println(nome.indexOf(" ")); //4
//        System.out.println(nome.substring(5));
//        System.out.println(nome.substring(5, 10));
//
//        System.out.println(nome.lastIndexOf(" "));
//        System.out.println(nome.substring(11));
//        System.out.println(obterSegundonome(nome));
        System.out.println(obterUltimoNome(nome));
    }

    private static String obterUltimoNome(String nome) {
        int posicaoUltimoEspaco = nome.lastIndexOf(" "); //Se o caracter não é econtrado com o IndexOf ele retorna um número negativo
        if (posicaoUltimoEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }
        return nome.substring(posicaoUltimoEspaco + 1);
    }


    private static String obterSobrenome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" "); //Se o caracter não é econtrado com o IndexOf ele retorna um número negativo
        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }
        return nome.substring(posicaoPrimeiroEspaco + 1);
    }

    private static String obterSegundonome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" "); //Se o caracter não é econtrado com o IndexOf ele retorna um número negativo
        int posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }
        return nome.substring(posicaoPrimeiroEspaco + 1,
                posicaoSegundoEspaco < 0 ? nome.length() : posicaoSegundoEspaco);
    }
}
