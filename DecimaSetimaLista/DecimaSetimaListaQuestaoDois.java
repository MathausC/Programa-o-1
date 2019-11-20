package com.CC;

import java.util.Scanner;

public class DecimaSetimaListaQuestaoDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeroA, numeroB, continuar;
		String mensagem;

		System.out.println("Vamos comprarar dois números e verificat s eles são primos entre si.");

		do {
			System.out.print("Informe o primeiro número a ser comparado: ");
			numeroA = input.nextInt();
			while (numeroA <= 1) {
				System.out.println("O número deve ser maior que 1.");
				System.out.print("Informe o primeiro número a ser comparado: ");
				numeroA = input.nextInt();
			}

			System.out.print("Informe o segundo número a ser comparado: ");
			numeroB = input.nextInt();
			while (numeroB <= 1) {
				System.out.println("O número deve ser maior que 1.");
				System.out.print("Informe o segundo número a ser comparado: ");
				numeroB = input.nextInt();
			}

			if (verificarPrimos(numeroA, numeroB)) {
				mensagem = "Os números " + numeroA + " e " + numeroB + " SÃO primos entre si.";
			} else {
				mensagem = "Os números " + numeroA + " e " + numeroB + " NÃO são primos entre si.";
			}

			System.out.println(mensagem);

			System.out.print("Digite 1 para continuar ou 0 para encerrar: ");
			continuar = input.nextInt();
			while (continuar < 0 || continuar > 1) {
				System.out.println("Opção incorreta.");
				System.out.print("Digite 1 para continuar ou 0 para encerrar: ");
				continuar = input.nextInt();
			}

		} while (continuar != 0);

	}

	public static boolean verificarPrimos(int a, int b) {
		boolean resultado = true;
		int cont = 2;

		if (a > b) {
			while (resultado == true || cont <= b) {
				if (a % cont == 0 && b % cont == 0) {
					resultado = false;
				} else {
					resultado = true;
				}
				cont++;
			}
		} else {
			while (resultado == true || cont <= a) {
				if (a % cont == 0 && b % cont == 0) {
					resultado = false;
				} else {
					resultado = true;
				}
				cont++;
			}
		}
		return resultado;
	}

}
