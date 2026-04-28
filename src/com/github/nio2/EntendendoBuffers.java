package com.github.nio2;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class EntendendoBuffers {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        System.out.println(buffer.limit());
//        System.out.println(buffer.position());
        buffer.put((byte) 40);
        buffer.put((byte) 10);
        buffer.put((byte) 50);
        buffer.put((byte) 60);
        buffer.put((byte) 7);
        buffer.put((byte) 99);
//        System.out.println(buffer.position());
//        buffer.flip();
        buffer.clear();
//        System.out.println(buffer.position());
        System.out.println(buffer.limit());

        buffer.put((byte) 55);
        buffer.put((byte) 127);
//        System.out.println(Arrays.toString(buffer.array()));
    }
}
