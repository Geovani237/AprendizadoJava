package com.github.desafioenumeracao;

public enum StatusNotaFiscal {

    NAO_EMITADA {
        @Override
        public boolean podeMudarParaCancelar(double valorNota) {
            return true;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return true;
        }
    },
    EMITIDA {
        @Override
        public boolean podeMudarParaCancelar(double valorNota) {
            return valorNota < 1_000;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return false;
        }
    },
    CANCELADA {
        @Override
        public boolean podeMudarParaCancelar(double valorNota) {
            return true;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return false;
        }
    };

    public abstract boolean podeMudarParaCancelar(double valorNota);
    public abstract boolean podeMudarParaEmitido(double valor);
}
