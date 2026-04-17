package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Categoria;
import com.github.stream.estoque.Fabricante;
import com.github.stream.estoque.Produto;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        int totalEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .sum();
////                .reduce(0, Integer::sum);
//
//        System.out.println(totalEstoque);

//        double mediaEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .average()
//                .orElseThrow(() -> new RuntimeException("Não há produtos para calcular a média"));
//
//        System.out.println(mediaEstoque);

        long totalProdutosComEstoque = produtos.stream()
                .filter(Produto::temEstoque)
                .count();

        System.out.println(totalProdutosComEstoque);
    }


}
