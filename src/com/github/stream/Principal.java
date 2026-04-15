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
                .peek(produto -> produto.setNome(produto.getNome().toUpperCase())) // serve para inspecionar, depurar (debugar) ou realizar ações colaterais
                .peek(p -> System.out.println("Antes do temEstoque: " + p)) // o uso mais comum é para debugar a pipeline
                .filter(Produto::temEstoque) //operação intermediária
                .peek(p -> System.out.println("Depois do temEstoque: " + p))
                .filter(Produto::isInativo) //operação intermediária
                .forEach(produto -> { //operação terminal
                    System.out.println("Ativando " + produto);
                    produto.ativar();
                });

    }
}
