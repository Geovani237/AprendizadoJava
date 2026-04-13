package com.github.optional.companhiaaerea;

import com.github.optional.companhiaaerea.ciaeaerea.Reserva;
import com.github.optional.companhiaaerea.ciaeaerea.ServicoDeBagagem;
import com.github.optional.companhiaaerea.ciaeaerea.ServicoDeReserva;
import com.github.optional.companhiaaerea.ciaeaerea.Voo;

public class Principal3 {
    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastiam"));

        servicoDeBagagem.contratar("28A888",5);

        Reserva reserva = servicoDeReserva.buscar("28A888")
                .filter(r -> r.getQuantidadeBagagens() > 0)
                .orElseThrow(RuntimeException::new);
        System.out.println(reserva);

    }
}
