package com.github.datalegado;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatandoDateParaString {
    public static void main(String[] args) {
        Date hoje = new Date();

//        DateFormat formatador = DateFormat.getTimeInstance();
//        DateFormat formatador = DateFormat.getDateInstance();
//        DateFormat formatador = DateFormat.getDateTimeInstance();
//        DateFormat formatador = DateFormat.getDateTimeInstance(DateFormat.FULL,
//                DateFormat.FULL, Locale.US);

        DateFormat formatador = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println(formatador.format(hoje));
    }
}
