package com.CC;
import java.util.Scanner;

public class DecimaSegundaListaQuestaoCinco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.print("Informe um numero para fazermos a série de Fibonnacci: ");
		numero = input.nextInt();
		while(numero < 1) {
			System.out.println("O número deve ser maior que 1");
			System.out.print("Informe um numero para fazermos a série de Fibonnacci: ");
			numero = input.nextInt();
		}
		
		exibeSerieDeFibonnacci(numero);
	}
	
	public static void exibeSerieDeFibonnacci(int numero) {
		int numeroAnterior = 0;
		int cont = 1;
		while(cont <= numero) {
			System.out.print(cont + ", ");
			cont += numeroAnterior;
			numeroAnterior = cont - numeroAnterior;
		}
	}

}
