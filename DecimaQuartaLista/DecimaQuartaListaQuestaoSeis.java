package com.CC;

import java.util.Scanner;

public class DecimaQuartaListaQuestaoSeis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.print("Informe o primeiro termo da multiplicação: ");
		numero1 = input.nextInt();
		numero1 = verificarMaiorQueZero(numero1);
		
		System.out.print("Informe o segundo termo da multiplicação: ");
		numero2 = input.nextInt();
		numero2 = verificarMaiorQueZero(numero2);
		
		System.out.println("O resultado da multiplicação é " + produto(numero1, numero2));

	}
	
	public static int produto(int n1, int n2) {
		int resultado = 0;
		if(n1 == 1) {
			resultado += n2;
		}
		else {
			resultado += n2 + produto(n1 - 1, n2);
		}
		return resultado;
	}
	
	public static int verificarMaiorQueZero(int n) {
		Scanner input = new Scanner(System.in);
		while(n <= 0) {
			System.out.println("O numero deve ser maior que zero (0)");
			System.out.print("Informe o o numero novamente: ");
			n = input.nextInt();
		}
		return n;
	}

}
