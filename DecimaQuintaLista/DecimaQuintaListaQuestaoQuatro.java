package com.CC;
import java.util.Scanner;

public class DecimaQuintaListaQuestaoQuatro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.print("Informe um numero para formarmos um triangulo: ");
		numero = input.nextInt();
		while(numero < 1) {
			System.out.println("O número deve ser maior que zero(0)");
			System.out.print("Informe um numero para formarmos um triangulo: ");
			numero = input.nextInt();
		}
		
		escreveTriangulo(numero);		
	}
	
	public static void escreveTriangulo(int n) {
		if(n >= 1) {
			escreveLinha(n);
			System.out.println();
			escreveTriangulo(n-1);
		}
	}
	
	public static void escreveLinha(int n) {
		if(n >= 1) {
			escreveLinha(n - 1);
			System.out.print(n);
		}
	}
}
