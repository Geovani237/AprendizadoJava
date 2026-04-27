package com.github.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal2 {

    public static void main(String[] args) throws IOException {
//        Path pastaDocs = Path.of("doc");
//        Files.createDirectories(pastaDocs);

        Path pastaFornecedores = Path.of("doc/contratos/fornecedores");
        Files.createDirectories(pastaFornecedores);

        Path arquivoContrato = pastaFornecedores.resolve(Path.of("contrato-venda.txt"));
        System.out.println(Files.exists(arquivoContrato));
        Files.createFile(arquivoContrato);
        System.out.println(Files.exists(arquivoContrato));
    }
}
