package com.github.classicoio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Principal8 {
    public static void main(String[] args) {
        String[] nomes = { "João", "Maria", "Sebastião", "José" };
        File arquivoDestino = new File("docs/lista.txt");

        try (Writer escritor = new FileWriter(arquivoDestino)) {
            for (String nome : nomes) {
                escritor.write(nome + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
