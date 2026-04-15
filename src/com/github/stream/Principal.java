package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Produto;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        boolean temProdutoNoEstoque = produtos.stream()
//                .peek(System.out::println)
//                .anyMatch(Produto::temEstoque); //operação terminal de curto circuito


//        boolean todosProdutoNoEstoque = produtos.stream()
//                .peek(System.out::println)
//                .allMatch(Produto::temEstoque);
//
//        System.out.println(todosProdutoNoEstoque);

        boolean nenhumProdutoNoEstoque = produtos.stream()
                .peek(System.out::println)
                .noneMatch(Produto::temEstoque);

        System.out.println(nenhumProdutoNoEstoque);
    }
}
