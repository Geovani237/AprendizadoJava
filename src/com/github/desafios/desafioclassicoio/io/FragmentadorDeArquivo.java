package com.github.desafios.desafioclassicoio.io;

import java.io.*;
import java.util.Objects;

public class FragmentadorDeArquivo {
    private final File nomeDaPasta;
    private final int tamanho;

    public FragmentadorDeArquivo(File nomeDaPasta, int tamanho) {
        Objects.requireNonNull(nomeDaPasta);
        this.nomeDaPasta = nomeDaPasta;
        this.tamanho = tamanho;
    }

    public File getNomeDaPasta() {
        return nomeDaPasta;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void fragmentar()  throws IOException {
        int numero = 1;

        String nomeOriginal = getNomeDaPasta().getName();
        int posicaoDoPonto = nomeOriginal.lastIndexOf(".");
        String nomeSemExtensao = nomeOriginal.substring(0, posicaoDoPonto);
        String extensao = nomeOriginal.substring(posicaoDoPonto);

        try (InputStream inputStream = new FileInputStream(getNomeDaPasta())) {
            byte[] counteudo = new byte[getTamanho()];
            int quantidadeBytes;

            while ((quantidadeBytes = inputStream.read(counteudo)) > 0) {

                String caminhoCompleto = getNomeDaPasta().getParent() + "/" + nomeSemExtensao + numero + extensao;

                try (OutputStream outputStream = new FileOutputStream(caminhoCompleto)){
                    outputStream.write(counteudo, 0, quantidadeBytes);
                    numero++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
