package com.github.classicoio;

import java.io.*;

public class Principal5 {
    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/contrato.txt");



        //Boa prática: utilize try-with-resource para fechar os recursos
        try (InputStream inputStream = new FileInputStream(arquivoOrigem)) {
            int conteudo;

            while ((conteudo = inputStream.read()) != -1) {
                System.out.print((char) conteudo);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado",e);
        } catch (IOException e) {
            throw new RuntimeException("erro I/O", e);
        }



    }
}
