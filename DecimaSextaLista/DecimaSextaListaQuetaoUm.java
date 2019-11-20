package com.CC;

import java.util.Scanner;

public class DecimaSextaListaQuetaoUm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inicio, fim, incremento;
		
		System.out.print("Informe o n�mero para iniciar a sequencia: ");
		inicio = input.nextInt();
		while(inicio <= 0) {
			System.out.println("O n�mero deve ser maior que zero (0)");
			System.out.print("Informe o n�mero para iniciar a sequencia de n�mero: ");
			inicio = input.nextInt();
		}
		
		System.out.print("Informe o n�mero para finalizar a sequencia: ");
		fim = input.nextInt();
		while(fim > inicio) {
			System.out.println("O n�mero deve ser menor que " + inicio + ".");
			System.out.print("Informe o n�mero para finalizar a sequencia: ");
			fim = input.nextInt();
		}
		
		System.out.print("Informe o valor de incremento da sequencia: ");
		incremento = input.nextInt();
		while(incremento >= inicio) {
			System.out.println("O incremento deve ser menor que " + inicio + ".");
			System.out.print("Informe o valor de incremento da sequencia: ");
			incremento = input.nextInt();
		}
		
		imprimeSerieInversa(fim, inicio, incremento);

	}
	
	public static void imprimeSerieInversa (int i, int j, int k) {		
		if(i <= j) {
			imprimeSerieInversa(i + k, j, k);
			System.out.print(i + " ");
		}		
	}

}
