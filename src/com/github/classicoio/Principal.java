package com.github.classicoio;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        File arquivo1 = new File("/home/c51442790822/ProjectsGit/AprendizadoJava/docs/contrato.txt");//Caminho absoluto
        System.out.println(arquivo1);
        System.out.println();
        File arquivo2 = new File("docs/contrato.txt");//Caminho relativo
        System.out.println(arquivo2);
        System.out.println(arquivo2.getAbsoluteFile());

        System.out.println();
        File arquivo3 = new File("../docs/contrato.txt");
        System.out.println(arquivo3);
        System.out.println(arquivo3.getAbsoluteFile());
        System.out.println();
        System.out.println(arquivo3.getCanonicalFile());//Caminho canõnico

    }
}
