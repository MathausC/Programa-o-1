package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;
        String situacaoAluno;
        System.out.println("Vamos ver a situação academica do aluno:");
        System.out.println("Informe a nota do primeiro exame:");
        nota1 = input.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida, informe novamente a nota do aluno.");
            nota1 = input.nextDouble();
        }
        System.out.println("Informe a nota do segundo exame:");
        nota2 = input.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida, informe novamente a nota do aluno.");
            nota2 = input.nextDouble();
        }
        media = (nota1 + nota2) / 2;
        if (media < 3) {
            situacaoAluno = "reprovado";
        }
        else if (media < 7) {
            situacaoAluno = "em recuperação";
        }
        else {
            situacaoAluno = "aprovado";
        }
        System.out.println("O aluno obteve media " + media + " e está " + situacaoAluno + ".");
    }
}
