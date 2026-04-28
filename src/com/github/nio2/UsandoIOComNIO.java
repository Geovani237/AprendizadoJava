package com.github.nio2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class UsandoIOComNIO {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("docs/poema.txt");

        // com essa solução evita o problema de quebrar uma sequência de bytes no meio
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines()
                    .forEach(System.out::println);
        }

//        ByteBuffer buffer = ByteBuffer.allocate(40);
//        try (var inputStream = new FileInputStream(path.toFile());
//        var channel = inputStream.getChannel()){
//            while (channel.read(buffer) > 0) {
//                buffer.flip();
//                CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
//                System.out.print(charBuffer);
//                buffer.clear();
//            }
//        }

    }
}
