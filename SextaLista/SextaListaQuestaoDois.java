package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;
        int contador = 0;
        String situacaoAluno;
        System.out.println("Vamos verificar a situação academica de 30 alunos:");
        while (contador < 30) {
            System.out.println("Informe a primeira nota:");
            nota1 = input.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("A nota informada é inválida. Informe novamente:");
                nota1 = input.nextDouble();
            }
            nota2 = input.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("A nota informada é inválida. Informe novamente:");
                nota2 = input.nextDouble();
            }

            media = (nota1 + nota2) / 2;
            if(media < 3) {
                situacaoAluno = "reprovado";
            }
            else if (media < 7) {
                situacaoAluno = "em recuperação";
            }
            else{
                situacaoAluno = "aprovado";
            }
            System.out.println("O(A) aluno(a) obteve média " + media + " e está " + situacaoAluno + ".");
            contador = contador + 1;
        }
        System.out.println("Já foram verificados todos os 30 alunos.");
    }
}
