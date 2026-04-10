package com.github.optional.companhiaaerea.ciaeaerea;

import java.util.Objects;

public class Reserva {

    private final String codigo;
    private final Voo voo;
    private final Passageiro passageiro;
    private int quantidadeBagagens;

    public Reserva(String codigo, Voo voo, String nomePassageiro) {
        Objects.requireNonNull(codigo);
        Objects.requireNonNull(voo);
        Objects.requireNonNull(nomePassageiro);
        this.codigo = codigo;
        this.voo = voo;
        this.passageiro = new Passageiro(nomePassageiro);
    }

    public String getCodigo() {
        return codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public String getNomePassageiro() {
        return passageiro.getNome();
    }

    public int getQuantidadeBagagens() {
        return quantidadeBagagens;
    }

    public void adicionarBagagns(int quantidade) {
        this.quantidadeBagagens += quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Reserva reserva = (Reserva) o;
        return codigo.equals(reserva.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo='" + codigo + '\'' +
                ", voo=" + voo +
                ", passageiro=" + passageiro +
                ", quantidadeBagagens=" + quantidadeBagagens +
                '}';
    }
}
