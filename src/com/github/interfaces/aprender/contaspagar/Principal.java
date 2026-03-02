package com.github.interfaces.aprender.contaspagar;

import com.github.interfaces.aprender.contaspagar.modelo.Holerite;
import com.github.interfaces.aprender.contaspagar.modelo.OrdemServico;
import com.github.interfaces.aprender.contaspagar.pagamento.Beneficiario;
import com.github.interfaces.aprender.contaspagar.pagamento.MetodoPagamento;
import com.github.interfaces.aprender.contaspagar.pagamento.Pix;
import com.github.interfaces.aprender.contaspagar.pagamento.Transferencia;
import com.github.interfaces.aprender.contaspagar.servico.ServicoContaPagar;

public class Principal {
    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Transferencia();

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Joao", "123123123", " 4354545");
        Holerite holerite = new Holerite(funcionario, 100, 168);


        Beneficiario fornecedor = new Beneficiario("Consultoria", "1401492049859", "0181293");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }
}
