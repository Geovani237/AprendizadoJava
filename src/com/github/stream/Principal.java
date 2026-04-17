package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Categoria;
import com.github.stream.estoque.Fabricante;
import com.github.stream.estoque.Produto;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        Map<String, Long> produtosPorFabricante = produtos.stream()
//                .filter(Produto::temEstoque)
//                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
//                        Collectors.counting()));
//
//        System.out.println(produtosPorFabricante);

        Map<String, Integer> estoquePorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                        Collectors.summingInt(Produto::getQuantidade)));

        System.out.println(estoquePorFabricante);

    }


}
