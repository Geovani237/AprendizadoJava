package com.github.classicoio;

import java.io.File;

public class Principal2 {
    public static void main(String[] args) {
        File pasta1 = new File("docs");
        File pasta2 = new File("documentos");

        System.out.println(pasta1.renameTo(pasta2));

    }
}
