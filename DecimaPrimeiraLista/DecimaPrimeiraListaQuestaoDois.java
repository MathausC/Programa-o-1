package com.CC;
import java.util.Scanner;

public class DecimaPrimeiraListaQuestaoDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numero, resposta;
		
		System.out.print("Informe um número maior que zero (0): ");
		numero = input.nextInt();
		while(numero <= 0) {
			System.out.print("Informe um número maior que zero (0): ");
			numero = input.nextDouble();
		}
		
		resposta = calcularResposta(numero);
		
		System.out.println("A resposta da subitração 1 (E - 1/N^3) N indo de 1 a " +  numero  + " é: " + resposta + ".");

	}
	
	public static double calcularPotencia(double x, int y) {
		double resposta = 1;
		int cont;
		for(cont = 1; cont <= y; cont++) {
			resposta *= x;
		}
		return resposta;
	}
	
	public static double calcularResposta(double numero) {
		double resposta = 1;
		double cont;
		for(cont = 3; cont <= numero; cont = cont + 2) {
			resposta -= 1/calcularPotencia(cont, 3);
		}
		return resposta;
	}

}
