package com.CC;
import java.util.Scanner;

public class OItavaListaQuestaoCinco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroTabuada, cont, resultado;
		
		do {
			System.out.print("Informe um número de 1 a 10 e saiba as suas tabuadas: ");
			numeroTabuada = scanner.nextInt();
			
			if(numeroTabuada < 1 || numeroTabuada > 10) {
				System.out.println("O número informado é inválido:");
			}
		}
		while(numeroTabuada < 1 || numeroTabuada > 10);

		System.out.println("Tabuada de adição:");
		for(cont = 1; cont <= 10; cont++) {
			resultado = numeroTabuada + cont;
			System.out.println(numeroTabuada + " + " + cont + " = " + resultado);
			
		}
		System.out.println();
		
		System.out.println("Tabuada de subitração:");
		for(cont = 10; cont >= 1; cont--) {
			if(cont >= numeroTabuada) {
				resultado = cont - numeroTabuada;
				System.out.println(cont + " - " + numeroTabuada + " = " + resultado);				
				
			}
			
		}
		System.out.println();
		
		System.out.println("Tabuada de multiplicação:");
		for(cont = 0; cont <= 10; cont++) {
			resultado = numeroTabuada * cont;
			System.out.println(numeroTabuada + " * " + cont + " = " + resultado);
			
		}
		System.out.println();
		
		System.out.println("Tabuada de divisão:");
		for(cont = 1; cont <= 10; cont++) {
			resultado = numeroTabuada / cont;
			if((numeroTabuada % cont) == 0) {
				System.out.println(numeroTabuada + " / " + cont + " = " + resultado);
				
			}
			
		}

	}

}
