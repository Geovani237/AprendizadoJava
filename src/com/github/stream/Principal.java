package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Produto;

import java.util.List;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
//                .filter(produto -> produto.temEstoque() && produto.isInativo())
                .filter(Produto::temEstoque)//operação intermediária
                .filter(Produto::isInativo)//operação intermediária
                .forEach(produto -> { //operação terminal
                    System.out.println("Ativando " + produto);
                    produto.ativar();
                });

//        Stream<Produto> stream = produtos.stream();
//
//        Stream<Produto> streamComEstoque = stream
//                .filter(Produto::temEstoque);
//
//        Stream<Produto> streamComEstoqueInativo = streamComEstoque
//                .filter(Produto::isInativo);
//
//        streamComEstoqueInativo.forEach(produto -> {
//            System.out.println("Ativando " + produto);
//            produto.ativar();
//        });
    }
}
