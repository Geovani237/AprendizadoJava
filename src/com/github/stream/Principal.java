package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Fabricante;
import com.github.stream.estoque.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();


//        for (Produto produto : produtos) {
//            if (produto.temEstoque()) {
//                Fabricante fabricante = produto.getFabricante();
//                System.out.println(fabricante);
//            }
//        }

//        Stream<Fabricante> stream = produtos.stream()
//                .filter(Produto::temEstoque)
//                .map(Produto::getFabricante); // operação intermediária que transforma cada elemento de stream, em um novo elemento de um novo steam
//
//        stream.forEach(System.out::println);

        produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .forEach(System.out::println);
    }
}
