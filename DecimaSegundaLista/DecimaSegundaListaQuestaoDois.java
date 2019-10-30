package com.CC;
import java.util.Scanner;

public class DecimaSegundaListaQuestaoDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero1, numero2, numero3;
		System.out.print("informe um numero: ");
		numero1 = input.nextInt();
		System.out.print("informe mais um numero: ");
		numero2 = input.nextInt();
		System.out.print("informe o ultimo numero: ");
		numero3 = input.nextInt();
		
		exibirResultado(numero1, numero2, numero3);
		
	}
	
	public static void exibirResultado(int a, int b, int c) {
		int maior;
		if(a > b && a > c) {
			maior = a;
		}
		else if(b > c) {
			maior = b;
		}
		else {
			maior = c;
		}
		
		System.out.println("O maior numero entre " + a + ", " + b + " e " + c + " é " + maior + ".");
	}

}
