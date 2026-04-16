package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Categoria;
import com.github.stream.estoque.Fabricante;
import com.github.stream.estoque.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .forEach(System.out::println);

//        stream.forEach(obj -> {
//            System.out.println(obj.getClass().getName() + " - " + obj);
//        });
    }
}
