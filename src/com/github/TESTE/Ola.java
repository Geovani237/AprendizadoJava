package com.github.TESTE;

public class Ola {

    void cumprimenta(String nome) {
        if (nome.length() > 6){
            System.out.println("Hola que tal " + nome);
        } else if (nome.length() < 5) {
            System.out.println("Hello " + nome);
        } else {
            System.out.println("Como vai " + nome);
        }
    }
}
