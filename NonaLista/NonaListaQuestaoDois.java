package com.CC;
import java.util.Scanner;

public class NonaListaQuestaoDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temperatura, conversao;
		int tipoConversao;
		char continuar;
		
		System.out.println("Vamos fazer uma convers�o entre Celsius e Fahrenheit.");
		do {
			do {
				System.out.print("Informe o tipo de convers�o que deseja fazer: (1 - Celsius para Fahrenheit, 2 - Fahrenheit para Celsius) ");
				tipoConversao = input.nextInt();
				if(tipoConversao < 1 || tipoConversao > 2) {
					System.out.println("Tipo de convers�o incorreta.");
				}
			}
			while(tipoConversao < 1 || tipoConversao > 2);
			
			switch(tipoConversao) {
			
				case 1:
					System.out.print("Informe o valor da temperatura em Celsius: ");
					temperatura = input.nextInt();
					
					conversao = converterCelsiusParaFahrenheit(temperatura);
					
					System.out.println("A temperatura de " + temperatura + "�C � equivalente a " + conversao + "�F.");
					break;
				
				case 2:
					System.out.print("Informe o valor da temperatura em Fahrenheit: ");
					temperatura = input.nextInt();
					
					conversao = converterFahrenheitParaCelsius(temperatura);
					
					System.out.println("A temperatura de " + temperatura + "�F � equivalente a " + conversao + "�C.");
			}
			
			
			
			do {
				System.out.print("Voc� deseja fazer outra convers�o? (S - sim, N - n�o) " );
				continuar = input.next().charAt(0);
				if(continuar != 'S' && continuar != 's' && continuar != 'N' && continuar != 'n') {
					System.out.println("Caractere informado incorretamente.");
				}
			}
			while(continuar != 'S' && continuar != 's' && continuar != 'N' && continuar != 'n');
		}
		while(continuar == 'S' || continuar == 's');

	}
	
	public static double converterCelsiusParaFahrenheit(double temperatura) {
		double resultado = (temperatura * 1.8) + 32;
		return resultado;
	}
	
	public static double converterFahrenheitParaCelsius(double temperatura) {
		double resultado = (temperatura - 32)/1.8;
		return resultado;
	}

}
