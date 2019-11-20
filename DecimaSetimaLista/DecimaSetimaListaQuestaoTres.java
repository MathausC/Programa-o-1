package com.CC;

import java.util.Scanner;

public class DecimaSetimaListaQuestaoTres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, termos;
		double somatorio;
		char continuar;

		System.out.println("Vamos fazer um somatório comforme o modelo abaixo:");
		System.out.println("X^1/1! - X^2/3! + X^4/5! - X^6/7! + X^8/9! - ... +/- X^Y/Z!");
		System.out.println();

		do {
			System.out.print("Informe o valor de X: ");
			x = input.nextInt();
			x = verificarMaiorZero(x);

			System.out.print("Informe o valor de termos que o somatório deverá ter: ");
			termos = input.nextInt();
			termos = verificarMaiorZero(termos);

			somatorio = somatorioExpecial(x, termos);

			System.out.println("O resultado do somatório é " + somatorio);

			System.out.print("Digite 'S' para novamente o somatório ou 'N' para encerrar o programa: ");
			continuar = input.next().charAt(0);
			while (continuar != 'S' && continuar != 's' || continuar != 'N' || continuar != 'n') {
				System.out.println("Opção incorreta.");
				System.out.print("Digite 'S' para novamente o somatório ou 'N' para encerrar o programa: ");
				continuar = input.next().charAt(0);
			}

		} while (continuar == 'S' || continuar == 's');
	}

	public static int somatorioExpecial(int x, int n) {
		int fatorial = 3;
		int expoente = 2;
		int soma = x;
		for (int termo = 2; termo <= n; termo++) {
			if (termo % 2 == 0) {
				soma -= potencia(x, expoente) / fatorial(fatorial);
			} else {
				soma += potencia(x, expoente) / fatorial(fatorial);
			}
			expoente += 2;
			fatorial += 2;
		}

		return soma;
	}

	public static double fatorial(int n) {
		double fatorial = 1;
		for (double cont = 1; cont <= n; cont++) {
			fatorial *= cont;
		}
		return fatorial;
	}

	public static double potencia(int x, int y) {
		double resultado = 1;
		for (double cont = 1; cont <= y; cont++) {
			resultado *= x;
		}
		return resultado;
	}

	public static int verificarMaiorZero(int n) {
		Scanner input = new Scanner(System.in);
		while (n < 1) {
			System.out.println("Este valor deve ser maior que zero (0).");
			System.out.print("Informe o valor: ");
			n = input.nextInt();
		}
		return n;
	}

}
