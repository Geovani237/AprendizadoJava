package com.github.classesaninhadas.aninhadaestatica.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
//        List<Cliente> clientes = new ArrayList<>();
//        clientes.add(new Cliente("João", 41));
//        clientes.add(new Cliente("Maria", 37));
//        clientes.add(new Cliente("Sebastiam", 27));
//
//        Cliente.ordenarPorIdade(clientes);
        Cliente cliente = new Cliente("João", 42);
        cliente.setStatus(Cliente.Status.BLOQUEADO);

//        System.out.println(clientes);
        System.out.println(cliente);
    }
}
