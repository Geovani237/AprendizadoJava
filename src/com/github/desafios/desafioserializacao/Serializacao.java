package com.github.desafios.desafioserializacao;

import com.github.desafios.desafioserializacao.crm.Cliente;
import com.github.desafios.desafioserializacao.crm.Endereco;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Serializacao {

    public static void main(String[] args) throws IOException {
        Endereco endereco = new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        System.out.println(cliente);

        // TODO implementar serialização

        Path path = Path.of("objetos/cliente.cli");

        try (var outputStream = new ObjectOutputStream(Files.newOutputStream(path,
                StandardOpenOption.WRITE, StandardOpenOption.CREATE))) {
            outputStream.writeObject(cliente);
        }
    }
}
