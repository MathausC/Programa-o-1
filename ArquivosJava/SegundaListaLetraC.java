package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notaExameIntermediario, notaTrabalho, notaExameFinal, notaFinal;
        System.out.println("Qual a nota do exame intermediário do aluno?");
        notaExameIntermediario = input.nextDouble();
        System.out.println("Qual a nota do trabalho prático do aluno?");
        notaTrabalho = input.nextDouble();
        System.out.println("Qual a nota do exame final do aluno?");
        notaExameFinal = input.nextDouble();
        notaFinal = (notaExameIntermediario * 0.3) + (notaTrabalho * 0.2) + (notaExameFinal * 0.5);
        System.out.println("A nota final do aluno é " + notaFinal + ".");
    }
}
