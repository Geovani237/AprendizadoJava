package com.github.classesaninhadas.aninhadaestatica.exemplo1;

public class ServicoEmail {

    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando de %s para %s: %s%n", mensagem.getRemetente(), mensagem.getDestinatario(), mensagem.getTexto());
    }

    private static String gerarAssinatura() {
        return "\n--\nGeovani-Java";
    }

//    private static class Mensagem {
    public static class Mensagem {
        private final String remetente;
        private final String destinatario;
        private final String texto;

        public Mensagem(String remetente, String destinatario, String texto) {
            this.remetente = remetente;
            this.destinatario = destinatario;
            this.texto = texto;
        }

        public String getRemetente() {
            return remetente;
        }

        public String getDestinatario() {
            return destinatario;
        }

        public String getTexto() {
            return texto + gerarAssinatura();
        }
    }

}

// Uma boa para pensar antes de criar uma classe aninhada, ela deve existir para servir a sua classe superior.
