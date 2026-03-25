package com.github.strings;

public class Strip {
    public static void main(String[] args) {
        String nome = "\n   Pedro    ";

        System.out.println(nome);
        System.out.println(nome.strip()); //Strip a partir do Java 11
        System.out.println(nome.trim());// para Java legado, porem não remove alguns caracteres diferentes que representam espaço ele não remove.

        System.out.println(nome.stripLeading());// remove os espaços a esquerda
        System.out.println(nome.stripTrailing());//remove os espaços a direita
    }
}
