package com.github.desafioperiodo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class IdadePaciente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Data de nascimento: ");
            try{
                String dataTexto = scanner.nextLine();
                LocalDate dataConvertida = LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate dataAtual = LocalDate.now();
                Period dataNascimento = dataConvertida.until(dataAtual);
                String labelAno = dataNascimento.getYears() > 1 ? "anos" : dataNascimento.getYears() < 1 ? "anos" : "ano";
                String labelDia = dataNascimento.getDays() > 1 ? "dias" : dataNascimento.getDays() < 1 ? "dias" : "dia";
                String labelMes = dataNascimento.getMonths() > 1 ? "meses" : dataNascimento.getMonths() < 1 ? "meses" : "mês";

                String periodoFormatado = String.format("Paciente tem %d %s, %d %s, %d %s de vida",
                        dataNascimento.getYears(),
                        labelAno,
                        dataNascimento.getMonths(),
                        labelMes,
                        dataNascimento.getDays(),
                        labelDia);

                System.out.println(periodoFormatado);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamete");
            }

        }
        scanner.close();
    }
}
