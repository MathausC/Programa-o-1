package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double nota1, nota2, media;
	    String situacaoAluno;
	    System.out.println("Vejamos a situação do aluno em relação as notas.");
	    System.out.println("Informe a nota do primeiro teste parcial:");
	    nota1 = input.nextDouble();
	    System.out.println("Agora, informe a nota do segundo teste parcial:");
	    nota2 = input.nextDouble();
	    media = (nota1 + nota2) / 2;
	    if(media > 7){
	        situacaoAluno = "aprovado";
        }
	    else if(media >= 3) {
	        situacaoAluno = "na final";
        }
	    else {
	        situacaoAluno = "reprovado";
        }
	    System.out.println("O aluno obteve média " + media + " e está " + situacaoAluno + ".");
    }
}
