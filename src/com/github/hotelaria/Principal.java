package com.github.hotelaria;

import com.github.hotelaria.agencia.CadastroHotel;
import com.github.hotelaria.agencia.Hotel;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 1300);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//        cadastro.adicionar("Mercure", "Uberlandia/MG", 400);
//        cadastro.removerPorCidade("Fortim/CE");
//        cadastro.remover(new Hotel("Vila Selvagem", "Fortim/CE", 0));
//        cadastro.removerTodos();

//        cadastro.ordenar();
        cadastro.ordenarPorPreco();
        List<Hotel> hoteis = cadastro.obterTotos();

        imprimirHoteis(hoteis);

//        Hotel[] hoteis = cadastro.obterTodosComoArray();
//        System.out.println(Arrays.toString(hoteis));
    }

    private static void imprimirHoteis(List<Hotel> hoteis){
        for (Hotel hotel: hoteis) {
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
//
//        ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());
//        while (hotelIterator.hasPrevious()) {
//            Hotel hotel = hotelIterator.previous();
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }



//        Iterator<Hotel> hotelIterator = hoteis.iterator();
//        while (hotelIterator.hasNext()) {
//            Hotel hotel = hotelIterator.next();
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }


//        for (int i = 0; i < hoteis.size(); i++) {
//            Hotel hotel = hoteis.get(i);
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }
    }
}
