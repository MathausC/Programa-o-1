package com.CC;
import java.util.Scanner;

public class DecimaListaQuestaoUm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lado1, lado2, lado3, tipoTriangulo;
		String mensagem;
		boolean verificacao;
		
		System.out.println("Vamos verificar se é possível formar um triangulo e que tipo de triangulo será.");
		System.out.print("Informe o primeiro lado: ");
		lado1 = input.nextInt();
		while(lado1 <= 0) {
			System.out.println("O tamanho do lado dever ser maior que zero (0).");
			System.out.print("Informe o primeiro lado: ");
			lado1 = input.nextInt();
		}
		
		System.out.print("Informe o segundo lado: ");
		lado2 = input.nextInt();
		while(lado2 <= 0) {
			System.out.println("O tamanho do lado dever ser maior que zero (0).");
			System.out.print("Informe o segundo lado: ");
			lado2 = input.nextInt();
		}
		
		System.out.print("Informe o terceiro lado: ");
		lado3 = input.nextInt();
		while(lado3 <= 0) {
			System.out.println("O tamanho do lado dever ser maior que zero (0).");
			System.out.print("Informe o terceiro lado: ");
			lado3 = input.nextInt();
		}
		
		verificacao = verificarPossivelTriangulo(lado1, lado2, lado3);
		
		if(verificacao) {
			
			tipoTriangulo = verificarTipoTriangulo(lado1, lado2, lado3);
			
			switch(tipoTriangulo) {
				case 1:
						mensagem = "O triangulo é escaleno!";
						break;
				case 2:
						mensagem = "O triangulo é isoceles!";
						break;
				case 3: 
						mensagem = "O triangulo é equilátero!";
						break;
				default:
						mensagem = "Não é possível formar um triangulo!";
			}			
		}
		else {
			mensagem = "Não é possível formar um triangulo!";
		}
		
		System.out.println(mensagem);
		
	}
	
	public static boolean verificarPossivelTriangulo(int lado1, int lado2, int lado3) {
		if(lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int verificarTipoTriangulo(int lado1, int lado2, int lado3) {
		if(lado1 == lado2 && lado2 ==  lado3) {
			return 3;
		}
		else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return 2;
		}
		else {
			return 1;
		}
	}

}
