package com.github.nio2;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;

public class MovendoArquivoseDiretorio {

    public static void main(String[] args) throws IOException {
        Path pastaFornecedores = Path.of("docs/contratos/fornecedores");
        Path pastaClientes = Path.of("docs/contratos/clientes");
        Path arquivoContrato = Path.of("contrato-venda.txt");


        Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContrato);
        Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

//        Files.move(arquivoContratoOrigem, arquivoContratoDestino);

        Path pastaVendas = Path.of("docs/vendas");
        Files.move(pastaClientes, pastaVendas);
    }
}
