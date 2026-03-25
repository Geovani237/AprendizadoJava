package com.github.strings;

public class teste {
    public static void main(String[] args) {

        String nome = "robocop@email.com";

        int posicaoSufixo = nome.lastIndexOf(".");
        int posicaoArroba = nome.indexOf("@");

        if (posicaoArroba == -1) System.out.println("Posição Arroba: " + posicaoArroba);
        if (posicaoSufixo <= posicaoArroba) System.out.println("Posição Sufixo: " + posicaoSufixo);

        String nomeUsuario = nome.substring(0, posicaoArroba);
        String nomeDomino = nome.substring(posicaoArroba + 1, posicaoSufixo);
        String sufixoDomino = nome.substring(posicaoSufixo + 1);

        System.out.printf("Nome do usuário: %s%n Nome do Domínio: %s%n Sufixo do Dominio: %s%n", nomeUsuario, nomeDomino, sufixoDomino);

        for (int i = 0; i < nome.length(); i++) {
            char caractere = nome.charAt(i);
            System.out.println(caractere);
        }


//        System.out.println(nome.lastIndexOf("."));
//        System.out.println(nome.length());
//        System.out.println(email(nome));
//        System.out.println(!nome.isBlank());
//        int posicaoPrimeira = nome.indexOf("@");
//        int posicaoUltima = nome.lastIndexOf("@");
//        if (posicaoUltima == posicaoPrimeira) {
//
//        }
//        System.out.println(nome.indexOf("@"));
//
//        int posicaoUltimoPonto = nome.lastIndexOf(".");
//        System.out.println("Posição do ultimo ponto:" + posicaoUltimoPonto);
//        System.out.println("Nome:" + nome.length());
//        int maximoTdl = nome.length() - (posicaoUltimoPonto + 1);
//        System.out.println(maximoTdl);
//        if (maximoTdl >= 2) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
    }

//    private static boolean maximoTdl(String nome) {
//        int posicaoUltimoPonto = nome.lastIndexOf(".");
////        System.out.println(posicaoUltimoPonto);
//        return posicaoUltimoPonto;
//    }


}
