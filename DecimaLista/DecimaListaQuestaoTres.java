package com.CC;
import java.util.Scanner;

public class DecimaListaQuestaoTres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dia, mes, ano;
		boolean validadeDia, validadeMes, validadeAno, anoBissexto;
		char continuar;
		String mensagem;
		
		System.out.println("Vamos verificar a validade de uma data a partir dos dados informado.");
		do {
			System.out.print("Informe o ano: ");
			ano = input.nextInt();
			
			System.out.print("Informe o mês: ");
			mes = input.nextInt();
			
			System.out.print("Informe o dia: ");
			dia = input.nextInt();
			
			validadeAno = validarAno(ano);
			anoBissexto = verificarAnoBissexto(ano);			
			validadeMes = validadeMes(mes);
			validadeDia = validarDia(dia, mes, anoBissexto);
			
			if(validadeDia && validadeMes && validadeAno) {
				mensagem = "A data " + dia + "/" + mes + "/" + ano + " é válida.";
			}
			else {
				mensagem = "A dáta é inválida.";
			}
			
			System.out.println(mensagem);
			
			System.out.print("Deseja verificar mais alguma data? (S - sim, N - não) ");
			continuar = input.next().charAt(0);
			while(validarSaidaPrograma(continuar)) {
				System.out.println("Caractere informado incorretamente.");
				System.out.print("Deseja verificar mais alguma data? (S - sim, N - não) ");
				continuar = input.next().charAt(0);
			}			
			
		}
		while(continuar == 'S' || continuar == 's');
		
		System.out.println("Programa encerrado.");

	}
	
	public static boolean validarAno(int ano) {
		if(ano < 1900 || ano > 3000) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean verificarAnoBissexto(int ano) {
		if(ano % 4 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean validadeMes(int mes) {
		if (mes <= 12 && mes >= 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean validarDia(int dia, int mes, boolean anoBissexto) {
		if(mes == 2) {
			return verificaFevereiro(dia, mes, anoBissexto);
		}
		else if(verificarMes30(mes)) {
			return verificarDiaDeMes30(dia);
		}
		else {
			return verificarDiaDeMes31(dia);
		}
		
	}
	
	public static boolean verificarMes30(int mes) {
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean verificarDiaDeMes30 (int dia) {
		if(dia >= 1 && dia <= 30) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean verificarDiaDeMes31 (int dia) {
		if(dia >= 1 && dia <= 31) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean verificaFevereiro(int dia, int mes, boolean anoBissexto) {
		if(anoBissexto ) {
			if(mes == 2 && dia >= 1 && dia <= 29) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(mes == 2 && dia >= 1 && dia <= 28) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean validarSaidaPrograma(char resposta) {
		if(resposta == 'S' || resposta == 's' || resposta == 'N' || resposta == 'n') {
			return true;
		}
		else {
			return false;
		}
		
	}

}
