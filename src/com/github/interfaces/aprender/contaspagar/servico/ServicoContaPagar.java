package com.github.interfaces.aprender.contaspagar.servico;


import com.github.interfaces.aprender.contaspagar.pagamento.DocumentoPagavel;
import com.github.interfaces.aprender.contaspagar.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {


        metodoPagamento.pagar(documento);
    }
}
