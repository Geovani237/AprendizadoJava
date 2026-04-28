package com.github.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class SimplificandoLeituraDeArquivosComFiles {

    //Não utilize esses métodos para arquivos gigantes
    public static void main(String[] args) throws IOException {
        Path path = Path.of("docs/poema.txt");

//        try (var stream = Files.lines(path)) {
//            stream.forEach(System.out::println);
//        }

//        Files.readAllLines(path)
//                .forEach(System.out::println);

//        String conteudo = Files.readString(path);
//        System.out.println(conteudo);

        byte[] bytes = Files.readAllBytes(path);
        System.out.println(Arrays.toString(bytes));
    }
}
