package com.github.desafios.desafiointerface;

import com.github.desafios.desafiointerface.modelo.Caminhao;
import com.github.desafios.desafiointerface.modelo.CarroParticular;
import com.github.desafios.desafiointerface.modelo.ImovelResidencial;
import com.github.desafios.desafiointerface.servico.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {
        ServicoPropostaSeguro servico = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("HR-V", 150_000, 1999);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);
        Caminhao caminhao = new Caminhao("Actros", 780_000, 2021, 4);
        servico.emitir(caminhao);
    }


}
