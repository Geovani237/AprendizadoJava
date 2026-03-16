package com.github.hotelaria;

import com.github.hotelaria.agencia.CadastroHotel;
import com.github.hotelaria.agencia.Hotel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//        cadastro.adicionar("Mercure", "Uberlandia/MG", 400);



        ArrayList<Hotel> hoteis = cadastro.obterTotos();

        int indice =hoteis.indexOf(new Hotel("Tivoli Ecoresort", "Praia do Forte/BA", 140));
        System.out.println(indice);

        System.out.println(hoteis.get(indice));
//        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis){
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}
