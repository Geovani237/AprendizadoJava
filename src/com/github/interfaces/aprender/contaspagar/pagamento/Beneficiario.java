package com.github.interfaces.aprender.contaspagar.pagamento;

public class Beneficiario {

    private String nome;
    private String chavePix;
    private String contaBancario;

    public Beneficiario(String nome, String chavePix, String contaBancario) {
        this.nome = nome;
        this.chavePix = chavePix;
        this.contaBancario = contaBancario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getContaBancario() {
        return contaBancario;
    }

    public void setContaBancario(String contaBancario) {
        this.contaBancario = contaBancario;
    }

    public boolean naoPossuiChavePix() {
        return getChavePix() == null || getChavePix().isEmpty();
        // null é diferênte de vazio

    }

    public boolean naoPossuiContaBancaria() {
        return getContaBancario() == null || getContaBancario().isEmpty();
    }
}
