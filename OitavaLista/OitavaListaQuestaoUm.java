package com.CC;
import java.util.Scanner;

public class OitavaListaQuestaoUm {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero, soma = 0, cont;
		
		do {
			System.out.print("Informe um n�mero maior que 0 e saiba qual a soma de 1 at� esse n�mero: ");
			numero = scanner.nextInt();
			if(numero < 0) {
				System.out.println("N�mero informado menor que 0");
			}
		}
		while(numero < 0);
		
		for(cont = 0; cont <= numero; cont++) {
			soma += cont;
		}
		
		System.out.println("A soma dos n�meros de 1 a " + numero + " � " + soma);
		
	}
	
}
