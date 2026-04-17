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
//        List<Produto> produtos = new ArrayList<>();

        OptionalInt maiorQuantidadeOptional = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(Integer::max);
//                .reduce(0, Integer::max);

        int maiorQuantidade = maiorQuantidadeOptional
                .orElseThrow(() -> new RuntimeException("Quantidade náo encontrada"));

        System.out.println(maiorQuantidade);

    }


}
