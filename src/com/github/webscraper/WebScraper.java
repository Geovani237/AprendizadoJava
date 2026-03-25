package com.github.webscraper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScraper {
    public static void main(String[] args) {
        String html = "<a href=\"mailto:joao@gmail.com\">joao@gmail.com</a>" +
                "<a>abc@mail.com</a><a>xyz@mail.com</a>" +
                "<strong>maria@mail.com</strong>";

//        String regex = "<strong>(.*)</strong>";

        String regex = "<.*?>\\s*(?<email>[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})\\s*</.*?>";
        Pattern pattern = Pattern.compile(regex);//representação compilada de uma expressão regular
        Matcher matcher = pattern.matcher(html);//o motor que faz a operação de correspondência através do padrão(Pattern)

        while (matcher.find()) {//find é localize o próximo
            System.out.println(matcher.group("email"));
        }
    }
}
