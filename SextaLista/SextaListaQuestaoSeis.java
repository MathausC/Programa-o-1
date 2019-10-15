package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, contadorCidadoes = 0, votantes = 0, naoVotantes = 0;
        String statusVotador;
        System.out.println("Vamos verificar quantos cidadãos de Paraízo Feliz podem votar.");
        while (contadorCidadoes < 100) {
            System.out.println("Informe a idade do cidadão:");
            idade = input.nextInt();
            while (idade < 0 || idade > 120) {
                System.out.println("Idade informada é inválida. Informe novamente uma idade correta:");
                idade = input.nextInt();
            }
            if (idade < 18 || idade > 90) {
                statusVotador = "não pode";
                naoVotantes = naoVotantes + 1;
            }
            else {
                statusVotador = "pode";
                votantes = votantes + 1;
            }
            System.out.println("Esta pessoa tem " + idade + " anos e " + statusVotador + "votar.");
            contadorCidadoes = contadorCidadoes + 1;
        }
        System.out.println(votantes + "% dos cidadãos podem votar e " + naoVotantes + "% dos cidadãos não podem votar.");

    }
}
