package com.github.optional.companhiaaerea.tiposespeciais;

import java.util.Optional;
import java.util.OptionalInt;

public class Principal {
    public static void main(String[] args) {
//        int resultado = divirir(10,0);
        OptionalInt resultadoOptional = divirir(10, 2);

//        System.out.println("Resultado: " + resultado);
        resultadoOptional.ifPresentOrElse(resultado -> System.out.println("Resultado: " + resultado),
                () -> System.out.println("Sem resultado"));
    }

    private static OptionalInt divirir(int x, int y) {
        if (y == 0) return OptionalInt.empty();
        return OptionalInt.of(x / y);
    }

}
