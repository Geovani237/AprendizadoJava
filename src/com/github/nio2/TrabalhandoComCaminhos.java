package com.github.nio2;

import java.nio.file.Path;

public class TrabalhandoComCaminhos {

    public static void main(String[] args) {
//        Path arquivo = Path.of("/home/geovani/IdeaProjects/AprendizadoJava/doc/contrato.txt");//Caminho absoluto
//        Path arquivo = Path.of("doc/contrato.txt");//Caminho relativo
        Path arquivo = Path.of("../contrato.txt");

        Path arquivoAbsoluto = arquivo.toAbsolutePath();
        System.out.println(arquivoAbsoluto);

        System.out.println(arquivo.isAbsolute());
        System.out.println(arquivoAbsoluto.isAbsolute());

        Path arquivoNormalizado = arquivoAbsoluto.normalize();

        System.out.println(arquivoNormalizado);

        System.out.println("---------");

        Path pasta = Path.of("doc");
        Path arquivo1 = Path.of("contrato.txt");
        Path arquivoResolvido = pasta.resolve(arquivo1);

        System.out.println(arquivoResolvido.toAbsolutePath());

    }
}
