package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Produto;

import java.util.List;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Stream<Produto> stream = produtos.stream();
    }
}
