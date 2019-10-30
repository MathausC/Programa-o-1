package com.CC;
import java.util.Scanner;

public class DecimaSegundaListaQuestaoQuatro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c; 
		int continua;
		
		do {
			System.out.println("Vamos verificar as raizes de uma equação de segundo grau.");
			System.out.print("Informe o coeficiente de grau 2: ");
			a = input.nextInt();
			System.out.print("Informe o coeficiente de grau 1: ");
			b = input.nextInt();
			System.out.print("Informe o coeficiente de grau 0: ");
			c = input.nextInt();
			
			calculaEExibeRaizes(a, b, c);
			
			System.out.print("Digite 0 para encerrar ou 1 pata continua: ");
			continua = input.nextInt();
			while(continua < 0 || continua > 1) {
				System.out.println("Digito incorreto.");
				System.out.print("Digite 0 para encerrar ou 1 pata continua: ");
				continua = input.nextInt();
			}
		}while(continua != 0);
		
		System.out.println("Programa encerrado.");
		
	}
	
	public static void calculaEExibeRaizes(double a, double b, double c) {
		double delta = calcularDelta(a, b, c);
		String mensagem;
		if(delta < 0) {
			mensagem = "As raizes não existem.";
		}
		else if(delta == 0) {
			double raiz = -b/(2*a);
			mensagem = "A raiz é " + raiz + ".";
		}
		else {
			double raizPositiva = (-b + Math.sqrt(delta))/(2*a);
			double raizNegativa = (-b - Math.sqrt(delta))/(2*a);
			mensagem = "As raizes são: " + raizPositiva + " e " + raizNegativa + ".";
		}
		
		System.out.println(mensagem);
	}
	
	public static double calcularDelta(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);
		return delta;
	}

}
