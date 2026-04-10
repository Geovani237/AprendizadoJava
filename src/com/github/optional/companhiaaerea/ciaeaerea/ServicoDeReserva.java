package com.github.optional.companhiaaerea.ciaeaerea;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ServicoDeReserva {

    private final Set<Reserva> reservas = new HashSet<>();

    public Collection<Reserva> getReservas() {
        return Collections.unmodifiableSet(reservas);
    }

    public void adicionar(Reserva reserva) {
        boolean reservaAdicionada = reservas.add(reserva);

        if (!reservaAdicionada) {
            throw new RuntimeException(
                    String.format("Reserva %s já existe", reserva.getCodigo()));
        }
    }

    public Reserva buscar(String codigo) {
        Reserva reservaEncontada = null;

        for (Reserva reserva : reservas) {
            if (reserva.getCodigo().equals(codigo)) {
                reservaEncontada = reserva;
                break;
            }
        }

        return reservaEncontada;
    }
}
