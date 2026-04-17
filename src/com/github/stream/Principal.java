package com.github.stream;

import com.github.stream.estoque.CadastroProduto;
import com.github.stream.estoque.Categoria;
import com.github.stream.estoque.Fabricante;
import com.github.stream.estoque.Produto;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
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

//        BigDecimal valorEmEstoque = produtos.stream()
//                .map(produto -> produto.getPreco()
//                        .multiply(new BigDecimal(produto.getQuantidade())))
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//
//        System.out.println(valorEmEstoque);

        BigDecimal valorEmEstoque = produtos.stream()
                .reduce(BigDecimal.ZERO, (subtotal, produto) -> {
                    BigDecimal valorEstoqueProduto = produto.getPreco()
                            .multiply(new BigDecimal(produto.getQuantidade()));
                    return subtotal.add(valorEstoqueProduto);
                }, BigDecimal::add);

        System.out.println(valorEmEstoque);

    }


}
