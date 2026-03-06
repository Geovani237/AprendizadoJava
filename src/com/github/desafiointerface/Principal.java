package com.github.desafiointerface;

import com.github.desafiointerface.modelo.CarroParticular;
import com.github.desafiointerface.modelo.ImovelResidencial;
import com.github.desafiointerface.servico.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {
        ServicoPropostaSeguro servico = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("HR-V", 150_000, 2022);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        servico.emitir(carro);
    }


}
