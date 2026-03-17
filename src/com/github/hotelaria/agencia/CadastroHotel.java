package com.github.hotelaria.agencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CadastroHotel {

    private final List<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel);
    }

    public List<Hotel> obterTotos() {
        return hoteis;
    }

    public Hotel[] obterTodosComoArray() {
     return hoteis.toArray(new Hotel[0]);
    }

    public void ordenar() {
        Collections.sort(hoteis);
    }

    public void removerPorCidade(String cidade) {
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()){
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove();
            }
        }

        /*
        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equals(cidade)) {
                hoteisParaRemocao.add(hotel);
//                hoteis.remove(i);
//                i--;
            }
        }
        if (!hoteis.removeAll(hoteisParaRemocao)){
            throw new HotelNaoEncontradoException("Hotel(eis) não encontrado para remoção");
        } else {
            hoteis.removeAll(hoteisParaRemocao);
        }
         */
    }
    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if (!removido) {
            throw new HotelNaoEncontradoException("Hotel não encontrado para remoção");
        }
    }

    public void removerTodos() {
        hoteis.clear();
    }

}
