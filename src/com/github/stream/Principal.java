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

        Optional<Produto> produtoOptional = produtos.stream()
                .peek(System.out::println)
                .filter(Produto::temEstoque)
                .filter(Produto::isInativo)
//                .findFirst(); garante que seja o primeiro objeto encontrado a ser retornado
                .findAny(); //não tem garantia de qual objeto será retornado

        System.out.println("------");
        Produto produto = produtoOptional.orElseThrow(
                () -> new RuntimeException("Produto não encontrado"));
        System.out.println(produto);
    }
}
