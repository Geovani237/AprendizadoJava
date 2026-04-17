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


//        int menorQuantidadeEstoque = produtos.stream()
//                .filter(Produto::temEstoque)
//                .mapToInt(Produto::getQuantidade)
//                .min()
//                .orElseThrow(() -> new RuntimeException("Menos quantidade não encontrada"));
//
//        System.out.println(menorQuantidadeEstoque);


            Produto produtoMaisBarato = produtos.stream()
                    .filter(Produto::temEstoque)
                    .min(Comparator.comparing(Produto::getPreco))
                    .orElseThrow(() -> new RuntimeException("Produto mais barato não encontrado!"));

        System.out.println(produtoMaisBarato);

    }


}
