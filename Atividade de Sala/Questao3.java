package com.CC;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lado, coluna, linha;
		System.out.print("Informe o tamanho do lado do quadrado a ser formado: ");
		lado = input.nextInt();
		while(lado < 10 || lado > 20) {
			System.out.println("O tamanho dos lados do quadrado deve ter valor entre 10 e 20");
			System.out.print("Informe o tamanho do lado do quadrado a ser formado: ");
			lado = input.nextInt();
		}
		
		for(linha = 0; linha < lado; linha++) {
			for(coluna = 0; coluna < lado; coluna++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
