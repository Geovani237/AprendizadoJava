package com.github.interfaces.aprender.contaspagar.servico;

import com.github.interfaces.aprender.contaspagar.pagamento.Beneficiario;
import com.github.interfaces.aprender.contaspagar.pagamento.DocumentoPagavel;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiário não possui chave PIX");
        }
        System.out.printf("DEBUG: Efetuando PIX para %s no valor de %.2f com a chave %s%n", beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());
    }
}
