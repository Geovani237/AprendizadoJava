package com.github.locadoranotebooks.locadora;

public interface Precificacao {

    double calcularValorTotal(Notebook notebook, int horasUtilizadas);
}
