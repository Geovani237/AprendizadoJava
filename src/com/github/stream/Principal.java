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

        Map<Boolean, List<Produto>> estoqueProdutos = produtos.stream()
                .collect(Collectors.partitioningBy(Produto::temEstoque));

        estoqueProdutos.forEach((chave, valor) -> {
            System.out.println();
            System.out.println(chave);
            System.out.println("--------");
            valor.forEach(System.out::println);
        });
    }


}
