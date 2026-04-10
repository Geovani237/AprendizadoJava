package com.github.optional.companhiaaerea.ciaeaerea;

import java.util.Objects;
import java.util.Optional;

public class ServicoDeBagagem {

    private ServicoDeReserva servicoDeReserva;

    public ServicoDeBagagem(ServicoDeReserva servicoDeReserva){
        Objects.requireNonNull(servicoDeReserva);
        this.servicoDeReserva = servicoDeReserva;
    }

    public void contratar(String codigoReserva, int quantidadeBagagens) {
        if (quantidadeBagagens <= 0) {
            throw new IllegalArgumentException("Quantidade de bagagens inválida");
        }

//        Optional<Reserva> reservaOptional = servicoDeReserva.buscar(codigoReserva);
//
//        if (reservaOptional.isPresent()) {
//            reservaOptional.get().adicionarBagagens(quantidadeBagagens);
//        } else {
//            throw new ReservaNaoEncontradaException("Reserva não existe");
//        }

        // Com method Reference não tem como passar uma mensagem...
//        servicoDeReserva.buscar(codigoReserva)
//                .orElseThrow(ReservaNaoEncontradaException::new)
//                .adicionarBagagens(quantidadeBagagens);

        servicoDeReserva.buscar(codigoReserva)
                .orElseThrow(() -> new ReservaNaoEncontradaException("Reserva não existe"))
                .adicionarBagagens(quantidadeBagagens);

    }
}
