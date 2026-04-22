package com.github.classicoio;

import java.io.*;

public class Principal6 {
    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/foto.png");
        File arquivoDestino = new File("docs/foto2.png");

        try (InputStream inputStream = new FileInputStream(arquivoOrigem);
        OutputStream outputStream = new FileOutputStream(arquivoDestino)) {
            byte[] conteudo = new byte[1024];
            int quantidadeBytes;

            while ((quantidadeBytes = inputStream.read(conteudo)) > 0) {
                outputStream.write(conteudo, 0, quantidadeBytes);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado",e);
        } catch (IOException e) {
            throw new RuntimeException("erro I/O", e);
        }
    }
}
