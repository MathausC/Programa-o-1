package com.CC;
import java.util.Scanner;

public class OitavaListaQuestaoNove {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int linhas, colunas, numero, intLetra;
		char letra = 65;
		
		System.out.println("Vamos contruir uma pir�mide de letras:");
		do {
			System.out.print("Informe um n�mero entre 1 e 26: ");
			numero = scanner.nextInt();
			if(numero < 1 || numero > 26) {
				System.out.println("N�mero fora da faixa.");
				
			}
			
		}
		while(numero <1 || numero > 26);
		
		for(linhas = 0; linhas < numero; linhas++) {
			for(colunas = 0; colunas <= linhas; colunas++) {
				System.out.print(letra);
				
			}
			System.out.println();
			letra++;
			
		}		

	}

}
