package com.github.desafios.desafiolambdaereference;

import java.math.BigDecimal;

public class Funcionario {

    private final String nome;
    private final BigDecimal salario;
    private final boolean ativo;

    public Funcionario(String nome, BigDecimal salario, boolean ativo) {
        this.nome = nome;
        this.salario = salario;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;
        return salario.equals(that.salario);
    }

    @Override
    public int hashCode() {
        return salario.hashCode();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", ativo=" + ativo +
                '}';
    }
}
