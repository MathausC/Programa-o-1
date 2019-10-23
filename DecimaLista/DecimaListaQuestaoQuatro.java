package com.CC;
import java.util.Scanner;

public class DecimaListaQuestaoQuatro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numero, fatorial, resultadoPotencia;
		int opcao, expoente;
		String mensagem;
		
		do {
			System.out.println("Qual func�o voc� deseja executar?");
			System.out.println("1 - Calcular Fatorial de X");
			System.out.println("2 - Calcular X elevado a Y");
			System.out.println("0 - Sair");
			opcao = input.nextInt();
			while(opcao < 1 || opcao > 2) {
				System.out.println("Op��o incorreta.");
				System.out.println("Qual func�o voc� deseja executar?");
				System.out.println("1 - Calcular Fatorial de X");
				System.out.println("2 - Calcular X elevado a Y");
				System.out.println("0 - Sair");
				opcao = input.nextInt();
			}
			
			switch(opcao) {
				case 1:
					System.out.print("Informe o n�mero e saiba seu fatorial: ");
					numero = input.nextInt();
					
					fatorial = calcularFatorial(numero);
					if(fatorial == 0) {
						mensagem = "O fatorial n�o existem.";
					}
					else {
						mensagem = "O fatorial de " + numero  + " � " + fatorial + ".";
					}
					break;
					
				case 2:
					System.out.print("Informe a base do n�mero: ");
					numero = input.nextDouble();
					
					System.out.print("Informe a pot�ncia do n�mero: ");
					expoente = input.nextInt();
					
					resultadoPotencia = calcularPotencia(numero, expoente);
					
					mensagem = "O valor de " + numero + " elevado a " + expoente + " � " + resultadoPotencia + ".";
					break;
					
				case 0:
					mensagem = "Programa encerrado.";
					break;
					
				default:
					mensagem = "Programa encerrado.";
					opcao = 0;
			}
			
			System.out.println(mensagem);
			System.out.println();
		}
		while(opcao != 0);		

	}
	
	public static double calcularFatorial(double numero) {
		double resultado = 1;
		if(numero > 1) {
			for(double i = numero; i > 0; i--) {
				resultado *= i;
			}
			return resultado;
		}
		else if(numero >= 0) {
			return resultado;
		}
		else {
			return 0;
		}
	}
	
	public static double calcularPotencia(double numero, int expoente) {
		double resultado = 1;
		if(expoente > 0) {
			for(int i = 0; i < expoente; i++) {
				resultado *= numero;
			}
		}
		else if(expoente < 0) {
			expoente *= -1;
			for(int i = 0; i < expoente; i++) {
				resultado /= numero;
			}		
		}
		return resultado;
	}

}
