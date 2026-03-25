package com.github.strings;

public class TextBlocks {
    public static void main(String[] args) {
        String nome = "João da Silza";

        String html1 = """
                "<a href="mailto:joao@gmail.com">
                  %s - joao@gmail.com
                </a>
                <a>abc@mail.com</a>
                <a>xyz@mail.com</a>
                <strong>maria@mail.com</strong>""".formatted(nome);
        // isso é o TextBlock ele foi implementado apartir do Java 15
        System.out.println(html1);
    }
}
