package com.github.interfacefuncionais.methodreferences.exemplo3.estoque;

public class ServicoInativacaoProduto {

    public static void processar(Produto produto) {
        System.out.println("Inativando " + produto.getNome());
        produto.inativar();
    }
}
