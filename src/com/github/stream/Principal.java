package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Categoria;
import com.github.stream.estoque.Fabricante;
import com.github.stream.estoque.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        IntBinaryOperator operacaoSoma = (subtotal, valor) -> {
//            System.out.println(subtotal + " + " + valor);
//            return subtotal + valor;
//        };

//        IntBinaryOperator operacaoSoma = (subtotal, valor) -> subtotal + valor;

//        int totalEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(0, (subtotal, valor) -> subtotal + valor);

//        int totalEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(0, Integer::sum);
//
//        System.out.println(totalEstoque);

        int maximoEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(0, Integer::max);

        System.out.println(maximoEstoque);
    }
}
