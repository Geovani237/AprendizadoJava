package com.github.interfacefuncionais.estoque.etoque;

import java.math.BigDecimal;

public class Produto {

    public enum Status {
        ATIVO, INATIVO
    }

    private String nome;
    private BigDecimal preco;
    private int quantidade;
    private Status status = Status.ATIVO;

    public Produto(String nome, BigDecimal preco, int quantidade) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, BigDecimal preco, int quantidade, Status status) {
        this(nome, preco, quantidade);
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Status getStatus() {
        return status;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void inativar() {
        status = Status.INATIVO;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;
        return nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", status=" + status +
                '}';
    }
}
