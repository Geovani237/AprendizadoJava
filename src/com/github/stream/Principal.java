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

        produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .distinct() //Operação intermediária com estada (stateful) pode precisar processar todos os elementos do Stream, retorna uma stream com elementos únicos, e tem de ter o metodo equals implementado na classe,
                .forEach(System.out::println);
    }
}
