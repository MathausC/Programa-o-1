package com.CC;
import java.util.Scanner;

public class NonaListaQuestaoUm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor, conversao;
		int tipoConversao;
		char continuar;
		
		System.out.println("Vamos vazer uma conversão entre dolars e reais.");
		do {
			do {
				System.out.print("Qual conversão você deseja fazer? (1 - Dolar para Real, 2 - Real para Dolar) ");
				tipoConversao = input.nextInt();
				
				if(tipoConversao <1 || tipoConversao >2) {
					System.out.println("Tipo de conversão não existente.");
					
				}
			}
			while(tipoConversao <1 || tipoConversao >2);
			
			switch(tipoConversao) {			
				case 1: 
					do {
					System.out.print("Informe o valor em Dolar: ");
					valor = input.nextDouble();
					
					if(valor <= 0) {
						System.out.println("O valor deve ser maior que zero (0)");
					}
					
					}
					while(valor <= 0);
					
					conversao = ConverterDolarParaReal(valor);
					
					System.out.println("O valor de US$ " + valor + " em Reais é R$ " + conversao + ".");
					break;
					
				case 2: 
					do {
						System.out.print("Informe o valor em Real: ");
						valor = input.nextDouble();
						
						if(valor <= 0) {
							System.out.println("O valor deve ser maior que zero (0)");
						}
						
					}
					while(valor <= 0);
					
					conversao = ConverterRealParaDolar(valor);
					
					System.out.println("O valor de R$ " + valor + " em Dolares é US$ " + conversao + ".");				
			}
			
			System.out.print("Deseja fazer outra conversão? (S- sim, N - não) ");
			continuar = input.next().charAt(0);
			
			if(continuar != 'S' || continuar != 's'|| continuar != 'N' || continuar != 'n') {
				System.out.println("Caractere digitado incorreto.");
			}
			
		}
		while(continuar == 'S' || continuar == 's');
		

	}
	
	public static double ConverterDolarParaReal(double valor) {
		
		double resultado = valor * 2.5384;
		return resultado;
		
	}
	
	public static double ConverterRealParaDolar(double valor) {
		
		double resultado = valor / 2.5384;
		return resultado;
	}

}
