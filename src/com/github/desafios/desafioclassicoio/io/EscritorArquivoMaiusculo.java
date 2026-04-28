package com.github.desafios.desafioclassicoio.io;

import java.io.*;

public class EscritorArquivoMaiusculo {

    private File arquivoOrigem;
    private File arquivoDestino;

    public EscritorArquivoMaiusculo(File arquivoOrigem, File arquivoDestino) {
        this.arquivoOrigem = arquivoOrigem;
        this.arquivoDestino = arquivoDestino;
    }

    public File getArquivoOrigem() {
        return arquivoOrigem;
    }

    public File getArquivoDestino() {
        return arquivoDestino;
    }

    public void processar() throws IOException {
        File arquivoOrigem = new File(getArquivoOrigem().toURI());
        File arquivoDestino = new File(getArquivoDestino().toURI());
        StringBuilder textoOrigem = new StringBuilder();

        try (Reader leitor = new FileReader(arquivoOrigem);
        Writer escritor = new FileWriter(arquivoDestino)) {
            char[] conteudo = new char[1000];
            int quantidadeCaracteres;

            while ((quantidadeCaracteres = leitor.read(conteudo)) > 0) {
                textoOrigem.append(conteudo, 0, quantidadeCaracteres);
            }

            escritor.write(textoOrigem.toString().toUpperCase());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(textoOrigem);
    }
}
