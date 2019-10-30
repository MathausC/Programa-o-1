package com.CC;
import java.util.Scanner;

public class DecimaSegundaListaQuestaoUm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int horas, minutos, minutosPos, opcao;
		
		System.out.println("Vamos converter os formatos de tempo");
		do {
			System.out.println("1 - Horas e Minutos para Minutos");
			System.out.println("2 - Minuros para Hora e Minutos");
			System.out.print("Qual conversão você deseja fazer? ");
			opcao = input.nextInt();
			switch(opcao) {
				case 1 :
					System.out.print("Informe as horas: ");
					horas = input.nextInt();
					while(horas < 0) {
						System.out.println("A hora não pode ser negativa.");
						System.out.print("Informe as horas: ");
						horas = input.nextInt();
					}
					System.out.print("Informe os minutos: ");
					minutos = input.nextInt();
					while(minutos < 0) {
						System.out.println("O minuto não pode ser negativa.");
						System.out.print("Informe os minutos: ");
						horas = input.nextInt();
					}
					minutosPos = converterHoraMinutos(horas, minutos);
					System.out.println(horas + " horas e " + minutos + " minutos são equivalentes a " + minutosPos + " minutos.");
					System.out.println();
										
					System.out.print("Digite 0 para continuar ou 1 para encerrar: ");
					opcao = input.nextInt();
					while(opcao < 0 || opcao > 1) {
						System.out.println("Digito incorreto.");
						System.out.print("Digite 0 para continuar ou 1 para encerrar: ");
						opcao = input.nextInt();
					}
					break;
				case 2 :
					System.out.print("Informe os minutos: ");
					minutos = input.nextInt();
					while(minutos < 0) {
						System.out.println("Os minutos não podem ser negativos");
						System.out.print("Informe os minutos: ");
						minutos = input.nextInt();
					}
					converteMinutosEExibe(minutos);
					System.out.println();
					
					System.out.print("Digite 0 para continuar ou 1 para encerrar: ");
					opcao = input.nextInt();
					while(opcao < 0 || opcao > 1) {
						System.out.println("Digito incorreto.");
						System.out.print("Digite 0 para continuar ou 1 para encerrar: ");
						opcao = input.nextInt();
					}
					break;
				default:
					System.out.println("Opção invalida.");
					opcao = 0;
			}
		}
		while(opcao == 0);
		
		System.out.println("Programa encerrado.");
		
	}
	
	public static int converterHoraMinutos(int horas, int minutos) {
		int conversao = (horas * 60) + minutos;
		return conversao;
	}
	
	public static void converteMinutosEExibe(int minutos) {
		int horas = minutos / 60;
		int minutosPos = minutos % 60;
		System.out.println(minutos + " minutos equivale a " + horas + " horas e " + minutosPos + " minutos.");
		return;
	}
	
	

}
