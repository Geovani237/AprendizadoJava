package com.github.desafios.desafioclassicoio.io;

import java.io.*;

public class UnificadorDeArquivos {

    private File caminhoPasta;
    private File caminhoComNome;
    private String prefixoArquivosFragmentados;

    public UnificadorDeArquivos(File caminhoPasta, File caminhoComNome, String prefixoArquivosFragmentados) {
        this.caminhoPasta = caminhoPasta;
        this.caminhoComNome = caminhoComNome;
        this.prefixoArquivosFragmentados = prefixoArquivosFragmentados;
    }

    public File getCaminhoPasta() {
        return caminhoPasta;
    }

    public File getCaminhoComNome() {
        return caminhoComNome;
    }

    public String getPrefixoArquivosFragmentados() {
        return prefixoArquivosFragmentados;
    }

    public void unificar() throws IOException {

        File[] arquivo = getCaminhoPasta().listFiles();

        if (arquivo != null) {
            for (File file : arquivo) {
                System.out.println(file.getName());
            }
        }
        System.out.println(arquivo[2].getParent());


        //TODO termina desafio

//        try (OutputStream outputStream = new FileOutputStream(getCaminhoComNome())) {
//            while (())
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
