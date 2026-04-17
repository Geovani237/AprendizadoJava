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

        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .collect(ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);
//                .collect(() -> new ArrayList<>(),
//                        (lista, elemento) -> lista.add(elemento),
//                        (lista1, lista2) -> lista1.addAll(lista2));




        System.out.println(categorias);
    }


}
