package com.CC;
import java.util.Scanner;

public class DecimaPrimeiraListaQuestaoUm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char turno, cargo, continua;
		double salarioBase, horasTrabalhadas, coeficienteTurno, imposto, salarioBruto, salarioLiquido, auxilioAlimentacao, gratificacao;
		int remuneracao;
		String situacaoRemuneracao;
		
		do {
			System.out.print("Informe o salário base do funcionário: ");
			salarioBase = input.nextDouble();
			while(salarioBase <= 0) {
				System.out.println("O salário deve ser maior que zero (0).");
				System.out.print("Informe o salário base do funcionário: ");
				salarioBase = input.nextDouble();
			}
			
			System.out.println("M - Matutino");
			System.out.println("V - Vespertino");
			System.out.println("N - Noturno");

			System.out.print("Informe o turno do funcionário: ");
			turno = input.next().charAt(0);
			while(turno != 'M' && turno != 'V' && turno != 'N') {
				System.out.println("Turno informado incorretamente.");
				
				System.out.println("M - Matutino");
				System.out.println("V - Vespertino");
				System.out.println("N - Noturno");

				System.out.print("Informe o turno do funcionário:");
				turno = input.next().charAt(0);
			}
			
			System.out.println("G - Gerente");
			System.out.println("O - Operador");
			
			System.out.print("Informe qual o cargo do funcionário: ");
			cargo = input.next().charAt(0);
			while(cargo != 'G' && cargo != 'O') {
				System.out.println("Cargo informado incorretamente.");
				
				System.out.println("G - Gerente");
				System.out.println("O - Operador");
				
				System.out.print("Informe qual o cargo do funcionário: ");
				cargo = input.next().charAt(0);				
			}
			
			System.out.print("Informe a quantidade de horas trabalhadas do funcionário: ");
			horasTrabalhadas = input.nextDouble();
			while(horasTrabalhadas < 0) {
				System.out.println("As horas trabalhadas não podem ser menores que zero (0)");
				System.out.print("Informe a quantidade de horas trabalhadas do funcionário: ");
				horasTrabalhadas = input.nextDouble();
			}
			
			coeficienteTurno = verificarCoeficienteTurno(turno, salarioBase);
			salarioBruto = calcularSalarioBruto(salarioBase, horasTrabalhadas, coeficienteTurno);
			imposto = calcularImposto(salarioBruto, cargo);
			gratificacao = calcularGraificacao(turno, horasTrabalhadas);
			auxilioAlimentacao = calcularAuxilioAlimentaco(cargo, coeficienteTurno, salarioBruto);
			salarioLiquido = calcularSalarioLiquido(salarioBruto, imposto, auxilioAlimentacao);
			remuneracao = verificaRemuneracao(salarioLiquido);
			
			switch(remuneracao) {
				case 1:
					situacaoRemuneracao = "Mal remunerado";
					break;
				case 2:
					situacaoRemuneracao = "Normal";
					break;
				case 3:
					situacaoRemuneracao = "Bem remunerado";
					break;
				default:
					situacaoRemuneracao = "Remuneração inválida";
			}
			
			System.out.println("Salario bruto: " + salarioBruto);
			System.out.println("Imposto: " + imposto);
			System.out.println("Gratificação: " + gratificacao);
			System.out.println("Auxilio Alimentação: " + auxilioAlimentacao);
			System.out.println("Salario Liquido: " + salarioLiquido);
			System.out.println("Situação de remuneração: " + situacaoRemuneracao);
			System.out.println();
			System.out.print("Digite 0 para encerrar ou 1 para continuar: ");
			remuneracao = input.nextInt();
			while(remuneracao < 0 || remuneracao > 1) {
				System.out.println("Digito incorreto.");
				System.out.print("Digite 0 para encerrar ou 1 para continuar: ");
				remuneracao = input.nextInt();
			}
		}while(remuneracao != 0);
		
		System.out.println("Programa encerrado.");

	}
	
	public static double verificarCoeficienteTurno(char turno, double salarioBase) {
		double coeficiente;
		if(turno == 'M') {
			coeficiente = 0.1;
		}
		else if (turno == 'V') {
			coeficiente = 0.15;
		}
		else {
			coeficiente = 0.2;
		}
		
		return coeficiente * salarioBase;
	}
	
	public static double calcularSalarioBruto(double salarioBase, double horasTrabalhadas, double coeficienteTurno) {
		return salarioBase + (horasTrabalhadas * coeficienteTurno);
	}
	
	public static double calcularImposto(double salarioBruto, char cargo) {
		if(cargo == 'O') {
			if(salarioBruto >= 300) {
				return salarioBruto * 0.05;
			}
			else {
				return salarioBruto * 0.03;
			}
		}
		else if(salarioBruto > 400) {
			return salarioBruto * 0.06;
		}
		else {
			return salarioBruto * 0.04;
		}
	}
	
	public static double calcularGraificacao(char turno, double horasTrabalhadas) {
		if(turno == 'N' && horasTrabalhadas > 80) {
			return 50;
		}
		else {
			return 30;
		}
	}
	
	public static double calcularAuxilioAlimentaco(char cargo, double coeficienteTurno, double salarioBruto) {
		if(cargo == 'O' || coeficienteTurno <= 25) {
			return salarioBruto / 3;
		}
		else {
			return salarioBruto / 2;
		}
	}
	
	public static double calcularSalarioLiquido(double salarioBruto, double imposto, double auxilioAlimentacao) {
		return salarioBruto - imposto + auxilioAlimentacao;
	}
	
	public static int verificaRemuneracao(double salarioLiquido) {
		if(salarioLiquido < 500) {
			return 1;
		}
		else if (salarioLiquido <= 1000) {
			return 2;
		}
		else {
			return 3;
		}
	}

}
