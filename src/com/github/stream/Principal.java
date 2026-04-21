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

//        List<Fabricante> fabricantes = new ArrayList<>();


//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .forEach(produto -> {
//                    if (!fabricantes.contains(produto.getFabricante())) {
//                        fabricantes.add(produto.getFabricante());
//                    }
//                });
//        System.out.println(fabricantes);
//    }

        // Usando o paradigma de programação funcional correto
        List<Fabricante> fabricantes = produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .distinct()
                .toList();

        System.out.println(fabricantes);
    }
}
