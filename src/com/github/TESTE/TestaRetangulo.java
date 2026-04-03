package com.github.TESTE;

public class TestaRetangulo {

    void testePontual(int l1, int l2) {
        Retangulo2 r = new Retangulo2();

        r.carregaLados(l1, l2);
        if (r.calcularArea() != l1 * l2) {
            System.out.println("Não funciona área para lados " + l1 + " e " + l2);
        }

        if (r.calcularPerimetro() != 2 * (l1 + l2)) {
            System.out.println("Não funciona perímetro para lados " + l1 + " e " + l2);
        }
    }

    void testarTudo() {
        testePontual(10,20);
        testePontual(1,2);
        testePontual(3,3);
    }
}
