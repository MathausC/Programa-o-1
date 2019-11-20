package com.CC;

import java.util.Scanner;

public class DecimaSextaListaQuestaoQuatro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;

		System.out.print("Informe quantos numeros de fibnacci voc� deseja imprimir: ");
		numero = input.nextInt();
		while (numero < 1) {
			System.out.println("O n�mero deve ser maior que zero (0)");
			System.out.print("Informe quantos numeros de fibnacci voc� deseja imprimir: ");
			numero = input.nextInt();
		}

		numero = ultimoNumeroFibonacci(numero);
		exibeFibonacci(numero);
	}

	public static int ultimoNumeroFibonacci(int n) {
		if (n < 2) {
			return 1;
		} else {
			return ultimoNumeroFibonacci(n - 1) + ultimoNumeroFibonacci(n - 2);
		}
	}

	public static void exibeFibonacci(int n) {
		int numero = 1, numeroAnterior = 0;
		while (numero < n) {
			System.out.print(numero + " ");
			numero += numeroAnterior;
			numeroAnterior = numero - numeroAnterior;
		}
	}

}
