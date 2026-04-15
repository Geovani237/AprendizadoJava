package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .filter(Produto::temEstoque)
                .sorted(Comparator.comparingInt(Produto::getQuantidade)) // isso não está alterando a ordem da fonte de dados, apenas está alterando a ordem do Stream
                .forEach(produto -> System.out.printf("%s = %d unidades%n"
                        ,produto.getNome(), produto.getQuantidade()));
    }
}
