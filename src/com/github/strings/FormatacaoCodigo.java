package com.github.strings;

public class FormatacaoCodigo {
    public static void main(String[] args) {
        // 0000000123
        int codigo = 123;

        String codigoFormatado = preencherEsquerda(
                String.valueOf(codigo),'0', 10);
        System.out.println(codigoFormatado);
    }

    public static String preencherEsquerda(String texto, char caracter, int tamanhoTotal) {
        if (texto.length() >= tamanhoTotal) {
            return texto;
        }
        return String.valueOf(caracter).repeat(tamanhoTotal - texto.length()) + texto;
    }
}
