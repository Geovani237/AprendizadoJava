package com.github.desafios.desafioenumeracao;
public class NotaFiscal {

//    public static final int STATUS_NAO_EMITIDA = 0;
//    public static final int STATUS_EMITIDA = 1;
//    public static final int STATUS_CANCELADA = 2;

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusNotaFiscal status = StatusNotaFiscal.NAO_EMITADA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNotaFiscal getStatus() {
        return status;
    }

    public void cancelar() {
        if (getStatus().podeMudarParaCancelar(getValor())){
            status = StatusNotaFiscal.CANCELADA;
        } else {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

    }

    public void emitir() {
        if (getStatus().podeMudarParaEmitido(getValor())) {
            status = StatusNotaFiscal.EMITIDA;
        } else {
            throw new IllegalStateException("Não foi possivel emitir");
        }
    }

    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), status);
    }

}