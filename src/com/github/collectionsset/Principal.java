package com.github.collectionsset;

import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(100);
        numeros.add(45);
        numeros.add(1);
        numeros.add(34);
        numeros.add(null);
//        numeros.add(5);
        System.out.println(numeros.add(5));
        System.out.println(numeros.add(5));
        System.out.println(numeros.add(5));

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
