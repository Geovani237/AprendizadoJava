package com.github.desafios.desafioclasseaninhada.vendas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Pedido {

    private final Cliente cliente;
    private Status status = Status.RASCUNHO;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private final List<ItemPed> itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        Objects.requireNonNull(cliente);
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Status getStatus() {
        return status;
    }

    public List<ItemPed> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public ItemPed adicionarItem(String descricao, int quantidade, BigDecimal valorUnitario) {
        ItemPed item = new ItemPed(descricao, quantidade, valorUnitario, this);
        itens.add(item);
        return item;
    }

    public void emitir() {
        checarPedidoParaModificacao();
        status = Status.EMITIDO;
    }

    public void cancelar() {
        checarPedidoParaModificacao();
        status = Status.CANCELADO;
    }

    void checarPedidoParaModificacao() {
        if (!Status.RASCUNHO.equals(status)) {
            throw new IllegalArgumentException("Pedido não pode ser modificado");
        }
    }

    public enum Status {
        RASCUNHO, EMITIDO, CANCELADO
    }

    public static class Cliente {

        private String nome;

        public Cliente(String nome) {
            setNome(nome);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            Objects.requireNonNull(nome);
            this.nome = nome;
        }
    }



    public class ItemPed {

        private Pedido pedido;
        private final String descricao;
        private final BigDecimal valorUnitario;
        private int quantidade;

        ItemPed(String descricao, int quantidade, BigDecimal valorUnitario, Pedido pedido) {
            Objects.requireNonNull(pedido);
            Objects.requireNonNull(descricao);
            Objects.requireNonNull(valorUnitario);

            if (valorUnitario.compareTo(BigDecimal.ZERO) < 1) {
                throw new IllegalArgumentException("Valor unitário deve ser mair que zero");
            }

            this.pedido = pedido;
            this.descricao = descricao;
            this.valorUnitario = valorUnitario;
            setQuantidade(quantidade);
        }

        public String getDescricao() {
            return descricao;
        }

        public BigDecimal getValorUnitario() {
            return valorUnitario;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            pedido.checarPedidoParaModificacao();

            if (quantidade < 1) {
                throw new IllegalArgumentException("Quantidade deve ser maior que zero");
            }

            pedido.valorTotal = pedido.valorTotal.subtract(calcularValorTotal(this.quantidade));
            this.quantidade = quantidade;
            pedido.valorTotal = pedido.valorTotal.add(calcularValorTotal(quantidade));
        }

        public BigDecimal getValorTotal() {
            return calcularValorTotal(this.quantidade);
        }

        private BigDecimal calcularValorTotal(int quantidade) {
            return valorUnitario.multiply(new BigDecimal(quantidade));
        }

    }

}