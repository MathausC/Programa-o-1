package com.CC;
import java.util.Scanner;

public class OitavaListaQuestaoDez {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double cont, resultado = 1;
		int numero, contSinal = 1;
		
		do {
			System.out.println("Informe um número para fazermos a subitração de frações como é mostrado abaixo:");
			System.out.println("1 - (1/3^3) + (1/5^3) - (1/7^3) + ... +/- (1/N^3)");
			System.out.print("Numero = ");
			numero = scanner.nextInt();
			if(numero <= 0) {
				System.out.println("O número deve ser maior que 0.");
			}
		}
		while(numero <= 0);
		
		for(cont = 3; cont <= numero; cont += 2) {
			if(contSinal % 2 == 0) {
				resultado += (1/(Math.pow(cont, 3)));
			}
			else {
				resultado -= (1/(Math.pow(cont, 3)));
			}
			contSinal++;
		}
		
		System.out.println("O resultado da conta é " + resultado + ".");

	}

}
