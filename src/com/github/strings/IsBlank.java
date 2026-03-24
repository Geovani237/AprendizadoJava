package com.github.strings;

public class IsBlank {
    public static void main(String[] args) {
        String nome1 = "   ";

        System.out.println(nome1.isEmpty());
        System.out.println(nome1.isBlank()); //verifica se não tem nenhum caractere e verifica se o que tem é somente espaços
    }
}
