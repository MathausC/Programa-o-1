package com.CC;
import java.util.Scanner;

public class OitavaListaQuestaoDois {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int quantNumeros, soma = 0, numero, cont;
		
		System.out.println("Vamos fazer uma soma de uma quatidades de n�meros informado.");
		
		do {
			System.out.print("informe a quantidade de n�meros que ser�o somados: ");
			quantNumeros =  scanner.nextInt();
			
			if(quantNumeros <= 1) {
				System.out.println("A quantidade de n�meros a serem somados deve er no m�nimo 2.");
				
			}
			
		}
		while(quantNumeros <= 1);
		
		for(cont = 1; cont <= quantNumeros; cont++) {
			do {
				System.out.print("Informe o " + cont + "� n�mero a ser somado: ");
				numero = scanner.nextInt();
				
				if(numero < 0) {
					System.out.println("O n�mero informado � menor que 0.");
					
				}
				
			}
			while(numero < 0);
			
			soma += numero;
			
		}
		
		System.out.println("A soma dos " + quantNumeros + " n�meros informados � " + soma + ".");

	}

}
