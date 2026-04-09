package com.github.interfacefuncionais.methodreferences.exemplo2.estoque;

public class ServicoInativacaoProduto {

    public void processar(Produto produto) {
        System.out.println("Inativando " + produto.getNome());
        produto.inativar();
    }
}
