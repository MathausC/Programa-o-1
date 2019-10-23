package com.CC;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero, linha, coluna;
		
		System.out.print("Informe um número: ");
		numero = input.nextInt();
		while(numero < 5 || numero > 10) {
			System.out.println("O número deve ter valor entre 5 e 10.");
			System.out.print("Informe um número: ");
			numero = input.nextInt();
		}
		
		for(linha = 0; linha < numero; linha++) {
			for(coluna = numero; coluna > linha; coluna--) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}

	}

}
