package com.github.interfacefuncionais.lambda;

import com.github.interfacefuncionais.lambda.crm.CadastroCliente;
import com.github.interfacefuncionais.lambda.crm.Cliente;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João",30));
        cadastroCliente.adicionar(new Cliente("Maria",90));
        cadastroCliente.adicionar(new Cliente("Sebastiam",50));
        cadastroCliente.adicionar(new Cliente("Jonas",45));
        cadastroCliente.adicionar(new Cliente("Moabe",25));

        //Classe anonima
//        Filtro<Cliente> filtro = new Filtro<Cliente>() {
//            @Override
//            public boolean avaliar(Cliente cliente) {
//                return cliente.getIdade() > 40;
//            }
//        };

        //Expressões Lambda
//        Filtro<Cliente> filtro = (Cliente cliente ) -> {
//            boolean resultado = cliente.getIdade() > 40;
//            return resultado;
//        };

        //Torne lambda mais concisas, evite os tipos dos parametros, evite parenteses caso tenha só um parametro
//        List<Cliente> clientes = cadastroCliente.consultar((Cliente cliente) -> cliente.getIdade() > 40);
//        List<Cliente> clientes = cadastroCliente.consultar((cliente) -> cliente.getIdade() > 40);
        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);


        // Como seria o comparator sem Lambda
//        List<Cliente> clientes = cadastroCliente.getClientes();
//        clientes.sort(new Comparator<Cliente>() {
//                    @Override
//                    public int compare(Cliente o1, Cliente o2) {
//                        return Integer.compare(o1.getIdade(), o2.getIdade());
//                    }
//                });

        //Comparator Com Lambda
//        clientes.sort((cliente1, cliente2) -> Integer.compare(cliente1.getIdade(), cliente2.getIdade()));

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }
}
