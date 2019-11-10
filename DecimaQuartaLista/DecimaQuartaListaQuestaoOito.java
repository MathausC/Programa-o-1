package com.CC;

import java.util.Scanner;

public class DecimaQuartaListaQuestaoOito {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x;
		int y;
		
		System.out.print("Informe o valor de x para x^y: ");
		x = input.nextDouble();
		
		System.out.print("Informe o valor de y para x^y: ");
		y = input.nextInt();
		while(y < 0) {
			System.out.println("O valor de y não pode ser menor que zero(0).");
			System.out.print("Informe o valor de y para x^y: ");
			y = input.nextInt();
		}
		
		System.out.println("O resulatdo de " + x + " elevado a " + y + " é " + power(x, y));
	}
	
	public static double power(double x, int y) {
		if(y == 0) {
			return 1;
		}
		else if (y == 1) {
			return x;
		}
		else {
			return x * power(x, y - 1);
		}
	}

}
