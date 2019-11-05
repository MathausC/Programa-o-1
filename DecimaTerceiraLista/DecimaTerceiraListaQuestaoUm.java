package com.CC;

import java.util.Scanner;

public class DecimaTerceiraListaQuestaoUm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1, nota2;
		int alunos;

		System.out.println("Vamos avaliar a media e o conceito de 60 alunos.");

		for (alunos = 1; alunos <= 60; alunos++) {
			System.out.print("Informe a primeira nota do aluno: ");
			nota1 = input.nextDouble();
			nota1 = devolverNotaValida(nota1);

			System.out.print("Informe a segunda nota do aluno: ");
			nota2 = input.nextDouble();
			nota2 = devolverNotaValida(nota2);

			exibeNotaEConceitoDoAluno(nota1, nota2);
		}

	}

	public static double devolverNotaValida(double nota) {
		Scanner input = new Scanner(System.in);
		while (nota < 0 || nota > 10) {
			System.out.print("A nota deve estar entre 0 e 10, informe novamente: ");
			nota = input.nextDouble();
		}
		return nota;
	}

	public static void exibeNotaEConceitoDoAluno(double nota1, double nota2) {
		double media = calcularMedia(nota1, nota2);
		char conceito = determinaConceito(media);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);
	}

	public static double calcularMedia(double nota1, double nota2) {
		double media = (nota1 + nota2) / 2;
		return media;
	}

	public static char determinaConceito(double media) {
		char conceito;
		if (media < 5) {
			conceito = 'D';
		} else if (media < 7) {
			conceito = 'C';
		} else if (media < 9) {
			conceito = 'B';
		} else {
			conceito = 'A';
		}
		return conceito;
	}

}
