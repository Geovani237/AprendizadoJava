package com.github.desafios.desafioclassicoio.io;

import java.io.File;

public class FragmentadorDeArquivo {
    File nomeDaPasta;
    int tamanho;

    public FragmentadorDeArquivo(File nomeDaPasta, int tamanho) {
        this.nomeDaPasta = nomeDaPasta;
        this.tamanho = tamanho;
    }

    public void fragmentar() {
        System.out.println(nomeDaPasta.length());
        System.out.println(nomeDaPasta.getParent());
    }
}
