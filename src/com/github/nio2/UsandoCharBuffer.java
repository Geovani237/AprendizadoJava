package com.github.nio2;

import java.nio.CharBuffer;
import java.util.Arrays;

public class UsandoCharBuffer {
    // Aloca caracteres e não bytes.

    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(1000);

        charBuffer.put('O');
        charBuffer.put('l');
        charBuffer.put('a');

        charBuffer.flip();
//        System.out.println(Arrays.toString(charBuffer.array()));
//        charBuffer.chars().forEach(c -> System.out.print((char) c));

        System.out.println(charBuffer);
    }
}
