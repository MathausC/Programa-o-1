package com.CC;

import java.util.Scanner;

public class DecimaQuartaListaQuestaoDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeroInicio, numeroFim, incremento;
		System.out.print("informe um número: ");
		numeroInicio = input.nextInt();
		System.out.print("Informe um número maior: ");
		numeroFim = input.nextInt();
		while (numeroInicio >= numeroFim) {
			System.out.println("O primeiro número deve ser maior que o segundo.");
			System.out.print("informe um número: ");
			numeroInicio = input.nextInt();
			System.out.print("Informe um número maior: ");
			numeroFim = input.nextInt();
		}
		System.out.print("Informe o incremento: ");
		incremento = input.nextInt();
		while (incremento <= 0) {
			System.out.println("O incremento deve ser maior que zero (0)");
			System.out.print("Informe o incremento: ");
			incremento = input.nextInt();
		}
		System.out.println("Seu resultado é:");
		imprimeSerie(numeroInicio, numeroFim, incremento);

	}

	public static void imprimeSerie(int i, int j, int k) {
		if (i <= j) {
			System.out.print(i + " ");
			imprimeSerie(i + k, j, k);
		}
	}

}
