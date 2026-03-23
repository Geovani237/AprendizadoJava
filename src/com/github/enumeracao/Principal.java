package com.github.enumeracao;

public class Principal {
    public static void main(String[] args) {
        ServicoCancelamentoPedido servico = new ServicoCancelamentoPedido();

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotal(90);
        pedido.setStatus(StatusPedido.EMITIDO);

        servico.cancelar(pedido,TipoUsuario.CLIENTE);
    }
}
