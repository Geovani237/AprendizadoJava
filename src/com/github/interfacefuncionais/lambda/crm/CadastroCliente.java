package com.github.interfacefuncionais.lambda.crm;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CadastroCliente {

    private final List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    /*
    O ideal seria melhor não ter usado a interface Filtro, é uma boa prátcia usar interefaces funcionais padrão
    public List<Cliente> consultar(Filtro<Cliente> filtro) {
        List<Cliente> clientesFiltrados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (filtro.avaliar(cliente)) {
                clientesFiltrados.add(cliente);
            }
        }
        return clientesFiltrados;
    }
     */

    // Interface Padrão Predicate
    public List<Cliente> consultar(Predicate<Cliente> filtro) {
        List<Cliente> clientesFiltrados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (filtro.test(cliente)) {
                clientesFiltrados.add(cliente);
            }
        }
        return clientesFiltrados;
    }
}
