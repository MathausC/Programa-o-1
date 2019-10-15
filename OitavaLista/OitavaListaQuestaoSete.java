package com.CC;
import java.util.Scanner;

public class OitavaListaQuestaoSete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int primeiroNumero, segundoNumero, cont, somaPares = 0, produtoImpares = 1;
		
		System.out.println("Vamos verificar a soma dos números pares e o produto dos impares entre dois números.");
		System.out.print("Informe o primeiro número: ");
		primeiroNumero = scanner.nextInt();
		
		do {
			System.out.print("Informe o segundo número: ");
			segundoNumero = scanner.nextInt();
			
			if(primeiroNumero >= segundoNumero) {
				System.out.println("O segundo número deve ser maior que o primeiro.");
			}
		}
		while(primeiroNumero >= segundoNumero);
		
		for(cont = primeiroNumero; cont <= segundoNumero; cont++) {
			if((cont % 2) == 0) {
				somaPares += cont;
			}
			else {
				produtoImpares *= cont;
			}
		}
		
		System.out.println("A soma dos pares no intervalo de " + primeiroNumero + " e " + segundoNumero + " é " + somaPares + ".");
		System.out.println("O produto dos números impares de " + primeiroNumero + " e " + segundoNumero + " é " + produtoImpares + ".");

	}

}
