package com.CC;
import java.util.Scanner;

public class DecimaQuintaListaQuestaoTres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dividendo, divisor, resto;
		
		System.out.println("Vamos verificar o resto de uma divisão.");
		
		System.out.print("Informe o valor do dividendo: ");
		dividendo = input.nextInt();
		while(dividendo < 1) {
			System.out.println("O número deve ser maior que zero (0).");
			System.out.print("Informe o valor do dividendo: ");
			dividendo = input.nextInt();
		}
		
		System.out.print("Agora, informe o divisor: ");
		divisor = input.nextInt();
		while(divisor < 1) {
			System.out.println("O número deve ser maior que zero (0).");
			System.out.print("Agora, informe o divisor: ");
			divisor = input.nextInt();
		}
		
		resto = restoDiv(dividendo, divisor);
		
		System.out.println("O resto da divisão de " + dividendo + " por " + divisor + " é " + resto + ".");
	}
	
	public static int restoDiv(int x, int y) {
		if(x > y) {
			return restoDiv(x - y, y);
		}
		else if(x < y) {
			return x;
		}
		else {
			return 0;
		}
	}

}
