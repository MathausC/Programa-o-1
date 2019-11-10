package com.CC;

import java.util.Scanner;

public class DecimaQuartaListaQuestaoQuatro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeroMaior, numeroMenor, incremento;
		
		System.out.print("Informe primeiro n�mero da s�rie: ");
		numeroMenor = input.nextInt();
		numeroMenor = verificarMaiorQueZero(numeroMenor);
		
		System.out.print("Informe o �ltimo n�mero da s�rie: ");
		numeroMaior = input.nextInt();
		numeroMaior = verificarMaiorQueZero(numeroMaior);
		
		while(numeroMenor >= numeroMaior) {
			System.out.println("O come�o d� s�rie deve ser maior que o fim.");
			
			System.out.print("Informe primeiro n�mero da s�rie: ");
			numeroMenor = input.nextInt();
			numeroMenor = verificarMaiorQueZero(numeroMenor);
			
			System.out.print("Informe o �ltimo n�mero da s�rie: ");
			numeroMaior = input.nextInt();
			numeroMaior = verificarMaiorQueZero(numeroMaior);
		}
		
		System.out.print("Informe o valor de encremento: ");
		incremento = input.nextInt();
		incremento = verificarMaiorQueZero(incremento);
		
		System.out.println("A soma dos n�mero da s�rie de " + numeroMenor + " a " 
		+ numeroMaior + " variando de " + incremento + " em " + incremento + " � " 
		+ somaSerie(numeroMenor, numeroMaior, incremento));

	}

	public static int somaSerie(int i, int j, int k) {
		int resultado = 0;
		if (i == j) {
			resultado += j;
		} else if (i > j) {
			resultado += 0;
		} else {

			resultado += i + somaSerie(i + k, j, k);
		}
		return resultado;
	}
	
	public static int verificarMaiorQueZero(int n) {
		Scanner input = new Scanner(System.in);
		while(n <= 0) {
			System.out.println("O n�mero deve ser maior que zero(0)");
			System.out.print("Informe novamente: ");
			n = input.nextInt();
		}
		return n;
	}

}
