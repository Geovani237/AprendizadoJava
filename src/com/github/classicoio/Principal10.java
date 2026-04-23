package com.github.classicoio;

import java.io.*;

public class Principal10 {
    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/lista.txt");
        File arquivoDestino = new File("docs/saida.txt");

        try (Reader leitor = new FileReader(arquivoOrigem);
             Writer escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {
            // Buffer é muito bom para arquivos grandes
            int conteudo;
            while ((conteudo = leitor.read()) != -1) {
                escritor.write(conteudo);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
