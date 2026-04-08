package com.github.interfacefuncionais.crm;

@FunctionalInterface
public interface Filtro<T> {
    /*
    Só é possível criar uma função Lambda quando a interface só tem um metodo abstrato,
    é possível ter metodo default.
     */
    boolean avaliar(T objeto);
    default void ola() {
        System.out.println("Olá");
    }
//    String salva();
}
