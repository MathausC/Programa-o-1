package com.CC;

import java.util.Scanner;

public class DecimaSegundaListaQuestaoTres {

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
		int primeiro, segundo, terceiro;
		
		if(a > b && a > c && b > c) {
			primeiro = c;
			segundo = b;
			terceiro = a;
		}
		else if (a > b && a > c && c > b) {
			primeiro = b;
			segundo = c;
			terceiro = a;
		}
		else if(b > a && b > c && a > c) {
			primeiro = c;
			segundo = a;
			terceiro = b;
		}
		else if(b > a && b > c && c > a) {
			primeiro = a;
			segundo = c;
			terceiro = b;
		}
		else if(c > a && c > b && a > b) {
			primeiro = b;
			segundo = a;
			terceiro = c;
		}
		else if(c > a && c > b && b > a) {
			primeiro = a;
			segundo = b;
			terceiro = c;
		}
		else if(a == b && a > c) {
			primeiro = c;
			segundo = b;
			terceiro = a;
		}
		else if(a == b && c > a) {
			primeiro = c;
			segundo = b;
			terceiro = a;
		}
		else if(a == c && b > a) {
			primeiro = a;
			segundo = c;
			terceiro = b;
		}
		else if (a == c && a > b) {
			primeiro = b;
			segundo = c;
			terceiro = a;
		}
		else if (b == c && b > a) {
			primeiro = a;
			segundo = b;
			terceiro = c;
		}
		else if (b == c && a > b) {
			primeiro = c;
			segundo = b;
			terceiro = a;
		}
		else {
			primeiro = a;
			segundo = b;
			terceiro = c;
		}
		
		System.out.println("Os numeros em ordem crescente são: " + primeiro + ", " + segundo + " e " + terceiro);
	}

}
