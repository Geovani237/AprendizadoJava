package com.github.desafios.desafiolambdaereference;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

        // Method Reference
        // TODO remover funcionários inativos
        funcionarios.removeIf(Funcionario::isInativo);

        // TODO ordenar funcionários pelo valor do salário
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

        // TODO iterar e imprimir funcionários usando o método estático imprimir

        funcionarios.forEach(Principal::imprimir);

        /* Lambda Expression
        // TODO remover funcionários inativos
        funcionarios.removeIf(funcionario -> funcionario.isInativo());

        // TODO ordenar funcionários pelo valor do salário
        funcionarios.sort(Comparator.comparing(funcionario -> funcionario.getSalario()));

        // TODO iterar e imprimir funcionários usando o método estático imprimir

        funcionarios.forEach(funcionario -> imprimir(funcionario));
         */
    }

    private static void imprimir(Funcionario funcionario) {
        // TODO implementar a impressão do nome, salário e impostos (20%)
        System.out.printf("Nome: %s Salário: %s Imposto: %s%n", funcionario.getNome(), funcionario.getSalario(), funcionario.getSalario().multiply(new BigDecimal("0.2")));
    }

}
