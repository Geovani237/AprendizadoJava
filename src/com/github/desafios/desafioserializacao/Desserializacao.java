package com.github.desafios.desafioserializacao;

import com.github.desafios.desafioserializacao.crm.Cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Desserializacao {

    public static void main(String[] args) {
        Path path = Path.of("objetos/cliente.cli");
        Cliente cliente = null;

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path,
                StandardOpenOption.READ))) {
            cliente = (Cliente) inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println(cliente);
    }
}
