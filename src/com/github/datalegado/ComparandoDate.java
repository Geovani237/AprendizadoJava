package com.github.datalegado;

import java.util.Date;

public class ComparandoDate {
    public static void main(String[] args) {
        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));

        long diferencaMillis = hoje.getTime() - ontem.getTime();
        System.out.println(diferencaMillis);

        double diferencaHoras = diferencaMillis / 1000 / 60 / 60;

        System.out.printf("Diferença em horas: %.2f%n", diferencaHoras);

        System.out.printf("Depois: %b%n", hoje.after(ontem));
        System.out.printf("Antes: %b%n", hoje.before(ontem));
        System.out.printf("Comparação: %d%n", hoje.compareTo(ontem));

//        Date data = new Date(System.currentTimeMillis() - (24 *  60 * 60 * 1000));
//        Não utilize esses métodos são antigos demais
//        System.out.println(data.getMonth());
//        System.out.println(data.getYear());
    }
}
