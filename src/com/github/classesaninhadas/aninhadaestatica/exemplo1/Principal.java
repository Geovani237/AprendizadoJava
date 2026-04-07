package com.github.classesaninhadas.aninhadaestatica.exemplo1;

public class Principal {
    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();
        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem("joao@mail.com", "maria@mail.com", "Olá, tudo bem?");
        servico.enviar(mensagem);
    }
}
