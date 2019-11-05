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
				exibeResultado("milímetros", convertido);
				break;
			case 2:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaCentimetros(metros);
				exibeResultado("centímentros", convertido);
				break;
			case 3:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaDecimetros(metros);
				exibeResultado("decímentros", convertido);
				break;
			case 4:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaDecâmetro(metros);
				exibeResultado("decâmetro", convertido);
				break;
			case 5:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaHectômetro(metros);
				exibeResultado("hectômetro", convertido);
				break;
			case 6:
				System.out.print("Informe o valor em metros: ");
				metros = input.nextDouble();

				convertido = converterMetrosParaQuilômetro(metros);
				exibeResultado("quilômetro", convertido);
				break;
			case 0:
				System.out.println("Obrigado por usar o programa.");
				break;
			default:
				System.out.println("Opção incorreta.");
			}
		} while (opcao != 0);

	}

	public static void exibeMenu() {
		System.out.println("Digite uma das opções abaixo:");
		System.out.println("1 - Milímetros");
		System.out.println("2 - Centímetros");
		System.out.println("3 - Decímetros");
		System.out.println("4 - Decâmetros");
		System.out.println("5 - Hectômetros");
		System.out.println("6 - Quilômetros");
		System.out.println("0 - Encerrar Programa");
		System.out.println();
	}

	public static void exibeResultado(String unidade, double valor) {
		System.out.println("O valor em " + unidade + " é " + valor);
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

	public static double converterMetrosParaDecâmetro(double metros) {
		return metros / 10;
	}

	public static double converterMetrosParaHectômetro(double metros) {
		return metros / 100;
	}

	public static double converterMetrosParaQuilômetro(double metros) {
		return metros / 1000;
	}

}
