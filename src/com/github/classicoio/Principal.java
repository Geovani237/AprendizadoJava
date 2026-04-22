package com.github.classicoio;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        File pasta1 = new File("/home/c51442790822/ProjectsGit/AprendizadoJava/docs");
        System.out.printf("Pasta 1 criada: %b%n", pasta1.mkdir());

        File pasta2 = new File("/home/c51442790822/ProjectsGit/AprendizadoJava/fotos/viagens");
        System.out.printf("Pasta 2 criada: %b%n", pasta2.mkdirs());

        File arquivo1 = new File("/home/c51442790822/ProjectsGit/AprendizadoJava/docs/contrato.txt");
        File arquivo2 = new File("/home/c51442790822/ProjectsGit/AprendizadoJava", "docs/contrato.txt");
        File arquivo3 = new File(pasta1, "contrato.txt");

        System.out.printf("Arquivo 4 criada: %b%n", arquivo3.createNewFile());


//        System.out.printf("Arquivo 1 criada: %b%n", arquivo1.mkdirs());

    }
}
