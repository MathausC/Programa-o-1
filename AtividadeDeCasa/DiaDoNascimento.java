package com.CC;
import java.util.Scanner;

public class DiaDoNascimento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dia, mes, ano, diaSemana;
		boolean dataValida;
		String diaSemanaString;
		do {
			do{
				System.out.println("Informe sua data de nascimento:");
				System.out.print("Dia: ");
				dia = input.nextInt();
				System.out.print("Mês: ");
				mes = input.nextInt();
				System.out.print("Ano: ");
				ano = input.nextInt();
				dataValida = verificarData(dia, mes, ano);
				if(!dataValida) {
					System.out.println("Data inválida.");
				}
			}while(!dataValida);
			
			diaSemana = varificarDiaSemana(dia, mes, ano);
			switch(diaSemana) {
				case 6: 
					diaSemanaString = "domingo";
					break;
				case 0: 
					diaSemanaString = "segunda-feira";
					break;
				case 1: 
					diaSemanaString = "terça-feira";
					break;
				case 2:
					diaSemanaString = "quarta-feira";
					break;
				case 3:
					diaSemanaString = "quinta-feira";
					break;
				case 4:
					diaSemanaString = "sexta-feira";
					break;
				case 5:
					diaSemanaString = "sábado";
					break;
				default:
					diaSemanaString = "data inválido";
			}

			System.out.println(diaSemana);
			
			System.out.println("Você nasceu no dia " + dia + " de " + mes + " de " + ano + ". Esse dia foi uma " + diaSemanaString + ".");
			System.out.print("Digite 0 para sair ou 1 para continua: ");
			diaSemana = input.nextInt();
			while(diaSemana < 0 || diaSemana > 1) {
				System.out.println("Informação incorreta.");
				System.out.print("Digite 0 para sair ou 1 para continua: ");
				diaSemana = input.nextInt();
			}
		}while(diaSemana != 0);
		
		System.out.println("Programa encerrado.");

	}
	
	public static boolean verificarAnoBissexto(int ano) {
		boolean resposta;
		if(ano % 4 == 0 && ano % 100 != 0) {
			resposta = true;
		}
		else if(ano % 400 == 0) {
			resposta = true;
		}
		else {
			resposta = false;
		}
		return resposta;
	}
	
	public static boolean verificarData(int dia, int mes, int ano) {
		if(ano >= 1900 && ano <= 2399) {
			if(mes >= 1 && mes <= 12) {
				if(mesFevereiro(mes)) {
					if(verificarAnoBissexto(ano)) {
						if(dia >= 1 && dia <= 29) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(dia >= 1 && dia <= 28) {
						return true;
					}
					else {
						return false;
					}
				}
				else if(mes30Dias(mes)) {
					if(dia >= 1 && dia <= 30) {
						return true;
					}
					else {
						return false;
					}
				}
				else if(dia >= 1 && dia <= 31) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	
	public static boolean mes30Dias(int mes) {
		boolean resposta;
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean mesFevereiro(int mes) {
		if(mes == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int varificarDiaSemana(int dia, int mes, int ano) {
		int dias29DeFevereiro, mesAssociado, diaMenos1, resposta;
		int anosDesde1900 =  ano - 1900;
		if(verificarAnoBissexto(ano) && mes <= 2) {
				dias29DeFevereiro = (anosDesde1900 / 4) - 1;
		}
		else {
			dias29DeFevereiro = anosDesde1900 / 4;
		}
		
		switch (mes) {
			case 1:
				mesAssociado = 0;
				break;
			case 2:
				mesAssociado = 3;
				break;
			case 3:
				mesAssociado = 3;
				break;
			case 4:
				mesAssociado = 6;
				break;
			case 5:
				mesAssociado = 1;
				break;
			case 6:
				mesAssociado = 4;
				break;
			case 7:
				mesAssociado = 6;
				break;
			case 8:
				mesAssociado = 2;
				break;
			case 9:
				mesAssociado = 5;
				break;
			case 10:
				mesAssociado = 0;
				break;
			case 11:
				mesAssociado = 3;
				break;
			case 12:
				mesAssociado = 5;
				break;
			default:
				mesAssociado = 0;	
				
		}
		diaMenos1 = dia - 1;
		resposta = (anosDesde1900 + dias29DeFevereiro + mesAssociado + diaMenos1) % 7;
		return resposta;
	}
}
