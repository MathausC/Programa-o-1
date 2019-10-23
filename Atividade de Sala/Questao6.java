package com.CC;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char linha, coluna, letra;
		
		System.out.print("Digite uma letra: ");
		letra = input.next().charAt(0);
		while(letra < 'A' || letra > 'Z') {
			System.out.println("Caracter inválido, A letra deve ser maiuscula.");
			System.out.print("Digite uma letra: ");
			letra = input.next().charAt(0);
		}
		
		for(linha = 'A'; linha <= letra; linha++) {
			for(coluna = 'A'; coluna <= linha; coluna++) {
				System.out.print(linha);
			}
			System.out.println();
		}

	}

}
