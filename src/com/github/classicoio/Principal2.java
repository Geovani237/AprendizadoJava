package com.github.classicoio;

import java.io.File;

public class Principal2 {
    public static void main(String[] args) {
        File pasta1 = new File("docs");
        File pasta2 = new File("documentos");
        File arquivo1 = new File(pasta2, "contrato.txt");

//        System.out.println(pasta1.renameTo(pasta2));
        System.out.println(pasta2.delete());
//        System.out.println(arquivo1.delete());

    }
}
