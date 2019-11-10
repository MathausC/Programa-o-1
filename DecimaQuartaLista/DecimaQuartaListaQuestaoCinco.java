package com.CC;

import java.util.Scanner;

public class DecimaQuartaListaQuestaoCinco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;

		System.out.print("Informe um número para ser convertido em binario: ");
		numero = input.nextInt();
		while (numero < 0) {
			System.out.println("O numero não pode ser negativo");
			System.out.print("Informe um número para ser convertido em binario: ");
			numero = input.nextInt();
		}

		converteParaBinario(numero);
	}

	public static void converteParaBinario(int n) {
		int resto;
		if (n == 1) {
			System.out.print(1);
		} else if (n == 0) {
			System.out.print(0);
		} else {
			resto = n % 2;
			System.out.print(resto);

			converteParaBinario((n - resto) / 2);
		}
	}
}
