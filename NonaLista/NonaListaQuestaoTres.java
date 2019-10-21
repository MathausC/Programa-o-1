package com.CC;
import java.util.Scanner;

public class NonaListaQuestaoTres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double saldoMedio, resultado;
		char continuar;
		System.out.println("Vamos calcular o valor de cr�dito em rela��o ao seu saldo m�dio.");
		do {
			do {
				System.out.print("Informe o saldo m�dio: ");
				saldoMedio = input.nextDouble();
				if(saldoMedio <= 0) {
					System.out.println("O saldo deve ser maior que zero (0)");
				}
			}
			while(saldoMedio <= 0);
			
			if(saldoMedio <= 200) {
				resultado = calcularPercentual(saldoMedio, 10);
			}
			else if(saldoMedio <= 300) {
				resultado = calcularPercentual(saldoMedio, 20);
			}
			else if(saldoMedio <= 400) {
				resultado = calcularPercentual(saldoMedio, 25);
			}
			else {
				resultado = calcularPercentual(saldoMedio, 30);
			}
			
			System.out.println("Para um saldo m�dio igual a R$" + saldoMedio + ", ser� dado um cr�dito de R$" + resultado + ".");
			
			do {
				System.out.print("Deseja calular novamente? (S = sim. N - n�o) ");
				continuar = input.next().charAt(0);
				if(continuar != 'S' && continuar != 's' && continuar != 'N' && continuar != 'n') {
					System.out.println("Resposta n�o v�lida.");
				}
			}
			while(continuar != 'S' && continuar != 's' && continuar != 'N' && continuar != 'n');
		}
		while(continuar == 'S' || continuar == 's');

	}
	
	public static double calcularPercentual(double valor, double porcentagem) {
		double resultado = (valor * porcentagem) / 100;
		return resultado;
	}

}
