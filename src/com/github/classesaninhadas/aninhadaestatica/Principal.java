package com.github.classesaninhadas.aninhadaestatica;

public class Principal {
    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();
        Mensagem mensagem = new Mensagem("joao@mail.com", "maria@mail.com", "Olá, tudo bem?");
        servico.enviar(mensagem);
    }
}
