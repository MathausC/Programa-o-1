package com.CC;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sinalMenos, asteristico, numero, linha, coluna;
		
		System.out.print("Informe um número entre 10 e 20: ");
		numero = input.nextInt();
		while(numero < 10 || numero > 20) {
			System.out.println("O número deve ter valor entre 10 e 20");
			System.out.print("Informe um número entre 10 e 20: ");
			numero = input.nextInt();
		}
		
		for(linha = numero; linha > 0; linha--) {
			for(sinalMenos = linha; sinalMenos > 1; sinalMenos--) {
				System.out.print("-");
			}
			for(asteristico = linha; asteristico <= numero; asteristico++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
