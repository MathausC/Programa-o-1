package com.CC;

import java.util.Scanner;

public class DecimaQuartaListaQuestaoUm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		System.out.print("informe um numero: ");
		numero = input.nextInt();
		while (numero <= 0) {
			System.out.println("O número deve ser maior que zero (0)");
			System.out.print("informe um numero: ");
			numero = input.nextInt();
		}
		imprimeCrescente(numero);
	}

	public static void imprimeCrescente(int n) {
		if (n > 0) {
			cresce(1, n);
		}
	}

	public static void cresce(int n, int stop) {
		if (n <= stop) {
			System.out.print(n + " ");
			cresce(n + 1, stop);
		}
	}
}
