package com.CC;

import java.util.Scanner;

public class DecimaQuartaListaQuestaoTres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		System.out.print("Informe um número: ");
		numero = input.nextInt();
		while (numero <= 0) {
			System.out.println("O número deve ser maior que zero (0)");
			System.out.print("Informe um número: ");
			numero = input.nextInt();
		}

		System.out.println("O resultado é: " + soma(numero));

	}

	public static int soma(int n) {
		int resultado = 0;
		if (n == 1) {
			resultado += 1;
		} else {
			resultado += n + soma(n - 1);
		}
		return resultado;
	}

}
