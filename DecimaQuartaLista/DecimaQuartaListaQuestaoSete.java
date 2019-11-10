package com.CC;

import java.util.Scanner;

public class DecimaQuartaListaQuestaoSete {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.print("Informe um número par e maior que zero(0): ");
		numero = input.nextInt();
		while(numero % 2 != 0 || numero <= 0) {
			System.out.print("Informe um número par e maior que zero(0): ");
			numero = input.nextInt();
		}
		
		exibeNumerosPares(numero);		

	}
	
	public static void exibeNumerosPares(int n) {
		if(n == 0) {
			System.out.print(n);
		} else {
			System.out.print(n + " ");
			exibeNumerosPares(n - 2);
		}
	}

}
