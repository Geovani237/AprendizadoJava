package com.github.optional.companhiaaerea;

import com.github.optional.companhiaaerea.ciaeaerea.Reserva;
import com.github.optional.companhiaaerea.ciaeaerea.ServicoDeBagagem;
import com.github.optional.companhiaaerea.ciaeaerea.ServicoDeReserva;
import com.github.optional.companhiaaerea.ciaeaerea.Voo;

public class Principal2 {
    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastiam"));

//        Reserva reserva = servicoDeReserva.buscar("28A888").orElse(null);
//        Reserva reserva = servicoDeReserva.buscar("28A889")
//                .orElse(new Reserva("00000", voo, "Não informado"));

//        Reserva reserva = servicoDeReserva.buscar("28A889")
//                .orElseGet(() -> new Reserva("000000", voo, "Não informado"));
//        Reserva reserva = servicoDeReserva.buscar("28A888", () -> new Reserva("000000", voo, "Não informado"));


//        servicoDeReserva.buscar("28A8884")
//                        .ifPresent(reserva -> reserva.adicionarBagagens(10));
        servicoDeReserva.buscar("28A8884").ifPresentOrElse(
                reserva -> reserva.adicionarBagagens(10),
                () -> System.out.println("não encontrado")
        );

        servicoDeReserva.getReservas().forEach(System.out::println);
    }
}
