package com.github.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class SimplificandoEscritaDeArquivosComFiles {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("docs/arquivo.txt");

//        Files.writeString(path, "opa!");

//        var linhas = Arrays.asList("Opa!", "Beleza, campeão?");
//        Files.write(path, linhas);

        byte[] bytes = {79, 108, -61, -95};
        Files.write(path, bytes);
    }
}
