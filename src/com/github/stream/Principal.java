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

        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new)); // garante a caracteristica da lista retornada
                //.collect(Collectors.toList()); // NÃO existe garantia das caracteristicas da lista retornada
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll); // garante a caracteristica da lista retornada

        System.out.println(categorias);
    }


}
