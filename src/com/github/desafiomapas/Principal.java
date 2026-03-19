package com.github.desafiomapas;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal {

    public static void main(String[] args) {
        Estado mg = new Estado("MG", "Minas Gerais");
        Estado ce = new Estado("CE", "Ceará");
        Estado ro = new Estado("RO", "Rondônia");
        Estado sp = new Estado("SP", "São Paulo");

        Cidade saoPaulo = new Cidade(3550308, "São Paulo", 12_396_372);
        Cidade beloHorizonte = new Cidade(3106200, "Belo Horizonte", 2_530_701);
        Cidade fortaleza = new Cidade(2304400, "Fortaleza", 2_703_391);
        Cidade portoVelho = new Cidade(1100205, "Porto Velho", 548_952);

        // TODO Performance é mais importante (não garante a ordem das chaves)
//        Map<Cidade, Estado> capitais = new HashMap<>();
        // TODO Performance é importante, mas precisa manter ordem de inserção das chaves
//        Map<Cidade, Estado> capitais = new LinkedHashMap<>();
        // TODO Performance é menos importante e precisa manter a ordem natural das chaves
        Map<Cidade, Estado> capitais = new TreeMap<>();

        capitais.put(saoPaulo, sp);
        capitais.put(beloHorizonte, mg);
        capitais.put(fortaleza, ce);
        capitais.put(portoVelho, ro);


        // TODO Iteração nas entradas do mapa (chave/valor)
        for (Map.Entry<Cidade, Estado> estadoCidadeEntry : capitais.entrySet()) {
            System.out.printf("(%s - %s)%n", estadoCidadeEntry.getValue().getSigla(), estadoCidadeEntry.getKey().getNome());
        }
    }
}
