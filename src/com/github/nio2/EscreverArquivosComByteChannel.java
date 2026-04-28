package com.github.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class EscreverArquivosComByteChannel {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("docs/arquivo.txt");
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put((byte) 79);
        buffer.put((byte) 108);
        buffer.put((byte) -61);
        buffer.put((byte) -95);

//        System.out.println(Arrays.toString(buffer.array()));
        try (ByteChannel channel = Files.newByteChannel(
                path, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            buffer.flip();
            channel.write(buffer);
        }
    }
}
