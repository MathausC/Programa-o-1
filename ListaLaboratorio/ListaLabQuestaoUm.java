package com.CC;
import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        char nota;
        int idade, contadorLike = 0, contadorDeslike = 0, quantidadeAvaliacoes = 0, somaIdadesLike = 0, percentDeslike, idadeMediaLike;
        System.out.println("Vamos contabilizar a avaliação da palestra.");
        while (quantidadeAvaliacoes  <= 10) {
            System.out.println("Qual a idade do avaliante?");
            idade = scanner.nextInt();
            System.out.println("Informe a avaliação: (A - ótimo, B- bom, C - regular, D- ruim, E - péssimo)");
            nota = scanner.next().charAt(0);
            while (nota < 'A' || nota > 'E') {
                System.out.println("Nota informada inválida. Digite novamente:");
                nota = scanner.next().charAt(0);
            }
            if (nota == 'A' || nota == 'B') {
                somaIdadesLike = somaIdadesLike + idade;
                contadorLike = contadorLike + 1;
            }
            if (nota == 'D' || nota == 'E') {
                contadorDeslike = contadorDeslike + 1;
            }
            quantidadeAvaliacoes = quantidadeAvaliacoes + 1;
        }
        percentDeslike = (contadorDeslike / 300) * 100;
        idadeMediaLike = somaIdadesLike / contadorLike;
        System.out.println("A média da idade de pessoas que Avaliaram como bom ou ótimo é de " + idadeMediaLike + ".");
        System.out.println("O percentual de pessoas que acharam péssimo ou ruim foi de " + percentDeslike  + "%.");
    }
}
