package com.github.classicoio;

import java.io.*;

public class Principal12 {
    public static void main(String[] args) throws IOException {
        String nome = "Robertinho";
//        OutputStream out = System.out;
//        out.write(nome.getBytes());

//        PrintStream printStream = System.out;
        PrintStream printStream = new PrintStream(
                new FileOutputStream(new File("docs/arquivo.txt")));
        printStream.printf("Olá %s%n", nome);
    }
}
