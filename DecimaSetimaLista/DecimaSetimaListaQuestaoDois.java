package com.CC;

import java.util.Scanner;

public class DecimaSetimaListaQuestaoDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeroA, numeroB, continuar;
		String mensagem;

		System.out.println("Vamos comprarar dois n�meros e verificat s eles s�o primos entre si.");

		do {
			System.out.print("Informe o primeiro n�mero a ser comparado: ");
			numeroA = input.nextInt();
			while (numeroA <= 1) {
				System.out.println("O n�mero deve ser maior que 1.");
				System.out.print("Informe o primeiro n�mero a ser comparado: ");
				numeroA = input.nextInt();
			}

			System.out.print("Informe o segundo n�mero a ser comparado: ");
			numeroB = input.nextInt();
			while (numeroB <= 1) {
				System.out.println("O n�mero deve ser maior que 1.");
				System.out.print("Informe o segundo n�mero a ser comparado: ");
				numeroB = input.nextInt();
			}

			if (verificarPrimos(numeroA, numeroB)) {
				mensagem = "Os n�meros " + numeroA + " e " + numeroB + " S�O primos entre si.";
			} else {
				mensagem = "Os n�meros " + numeroA + " e " + numeroB + " N�O s�o primos entre si.";
			}

			System.out.println(mensagem);

			System.out.print("Digite 1 para continuar ou 0 para encerrar: ");
			continuar = input.nextInt();
			while (continuar < 0 || continuar > 1) {
				System.out.println("Op��o incorreta.");
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
