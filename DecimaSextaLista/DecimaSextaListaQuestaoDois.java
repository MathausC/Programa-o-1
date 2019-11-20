package com.CC;
import java.util.Scanner;

public class DecimaSextaListaQuestaoDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, mdc;
		System.out.println("Vamos verificar o maior divisor comum entre dois n�meros.");
		
		System.out.print("Informe o primero n�mero: ");
		x = input.nextInt();
		while(x <= 0) {
			System.out.println("O n�mero deve ser maior que zero (0).");
			System.out.print("Informe o primero n�mero: ");
			x = input.nextInt();
		}
		
		System.out.print("Informe o segundo n�mero: ");
		y = input.nextInt();
		while(y <= 0) {
			System.out.println("O n�mero deve ser maior que zero (0).");
			System.out.print("Informe o segundo n�mero: ");
			y = input.nextInt();
		}
		
		mdc = MaximoDivisorComum(x, y);
		
		System.out.println("O M�ximo Divisor Comum entre " + x + " e " + y + " � " + mdc + ".");

	}
	
	public static int MaximoDivisorComum(int x, int y) {
		if(x > y) {
			return MaximoDivisorComum(x - y, y);
		}
		else if(y > x) {
			return MaximoDivisorComum(y, x);
		}
		else {
			return x;
		}
	}

}
