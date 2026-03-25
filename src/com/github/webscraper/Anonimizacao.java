package com.github.webscraper;

public class Anonimizacao {
    public static void main(String[] args) {
        String html = "<a href=\"mailto:joao@gmail.com\">joao@gmail.com</a>" +
                "<a>abc@mail.com</a><a>xyz@mail.com</a>" +
                "<strong>maria@mail.com</strong>";

        String regex = "[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}";
        String novoHtml = html.replaceAll(regex, "email@anonimizado");

        System.out.println(novoHtml);

    }
}
