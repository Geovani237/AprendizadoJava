package com.github.enumeracao;

public class Pedido {

    private String nomeCliente;
    private double valorTotal;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public int getTempoEntregaEmHoras() {
        return status.getTempoEntregaEmHoras();
//        return switch (status) {
//            case EMITIDO -> 12;
//            case FATURADO -> 10;
//            case DESPACHADO -> 6;
//            case ENTREGUE -> 0;
//            default -> throw new IllegalStateException("Pedido não pode ser entregue");
//        };
    }

    public void marcarComoEntregue() {
        status = StatusPedido.ENTREGUE;
    }

    public void emitir() {
        status = StatusPedido.EMITIDO;
    }
    public void cancelar() {
//        if (getStatus().equals(StatusPedido.RASCUNHO)) esse maneira daria null point exception
        if (getStatus().podeMudarParaCancelado(getValorTotal())) { // essa maneira não
            status = StatusPedido.CANCELADO;
        } else {
            throw new IllegalStateException("Pedido não pode ser cancelado");
        }

    }
}
