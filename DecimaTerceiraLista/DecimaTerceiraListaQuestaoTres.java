package com.CC;

import java.util.Scanner;

public class DecimaTerceiraListaQuestaoTres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double metros, convertido;
		int opcao;

		System.out.println("Vamos converter metros para outras escalas de unicades.");
		do {

			exibeMenu();
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaMilimetros(metros);
				exibeResultado("mil�metros", convertido);
				break;
			case 2:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaCentimetros(metros);
				exibeResultado("cent�mentros", convertido);
				break;
			case 3:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaDecimetros(metros);
				exibeResultado("dec�mentros", convertido);
				break;
			case 4:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaDec�metro(metros);
				exibeResultado("dec�metro", convertido);
				break;
			case 5:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaHect�metro(metros);
				exibeResultado("hect�metro", convertido);
				break;
			case 6:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaQuil�metro(metros);
				exibeResultado("quil�metro", convertido);
				break;
			case 0:
				System.out.println("Obrigado por usar o programa.");
				break;
			default:
				System.out.println("Op��o incorreta.");
			}
		} while (opcao != 0);

	}

	public static void exibeMenu() {
		System.out.println("Digite uma das op��es abaixo:");
		System.out.println("1 - Mil�metros");
		System.out.println("2 - Cent�metros");
		System.out.println("3 - Dec�metros");
		System.out.println("4 - Dec�metros");
		System.out.println("5 - Hect�metros");
		System.out.println("6 - Quil�metros");
		System.out.println("0 - Encerrar Programa");
		System.out.println();
	}

	public static void exibeResultado(String unidade, double valor) {
		System.out.println("O valor em " + unidade + " � " + valor);
		System.out.println();
	}

	public static double converterMetrosParaMilimetros(double metros) {
		return metros * 1000;
	}

	public static double converterMetrosParaCentimetros(double metros) {
		return metros * 100;
	}

	public static double converterMetrosParaDecimetros(double metros) {
		return metros * 10;
	}

	public static double converterMetrosParaDec�metro(double metros) {
		return metros / 10;
	}

	public static double converterMetrosParaHect�metro(double metros) {
		return metros / 100;
	}

	public static double converterMetrosParaQuil�metro(double metros) {
		return metros / 1000;
	}

}
