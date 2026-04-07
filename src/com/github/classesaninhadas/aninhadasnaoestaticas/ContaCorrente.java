package com.github.classesaninhadas.aninhadasnaoestaticas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ContaCorrente {

    private BigDecimal saldo;
    private List<Transacao> transacaos = new ArrayList<>();

    public ContaCorrente(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacaos() {
        return Collections.unmodifiableList(transacaos);
    }

    public class Transacao {

        private String descricao;
        private BigDecimal valor;

        public Transacao(String descricao, BigDecimal valor) {
            this.descricao = descricao;
            this.valor = valor;

            ContaCorrente.this.saldo = ContaCorrente.this.saldo.subtract(valor);
            ContaCorrente.this.transacaos.add(this); // retorna a própria instancia da transação que está sendo instanciada no momento
        }

        public String getDescricao() {
            return descricao;
        }

        public BigDecimal getValor() {
            return valor;
        }
    }
}
