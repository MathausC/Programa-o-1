package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double horasTrabalhadas, horasExtras, salarioMinimo, valorHora, valorHoraExtra,
                salarioMensal, salarioExtra, salarioFamilia, salarioBruto, salarioLiquido;
        int dependentes;
        System.out.println("Quantas horas você trabalhou no mês passado?");
        horasTrabalhadas = input.nextDouble();
        System.out.println("Quantas horas extras você fez no mês passado?");
        horasExtras = input.nextDouble();
        System.out.println("Você possui quantos dependentes?");
        dependentes = input.nextInt();
        System.out.println("Qual o valor do salário mínimo do mês passado?");
        salarioMinimo = input.nextDouble();
        valorHora = salarioMinimo/10;
        valorHoraExtra = valorHora * 1.5;
        salarioMensal = valorHora * horasTrabalhadas;
        salarioExtra = valorHoraExtra * horasExtras;
        salarioFamilia = salarioMensal * (dependentes * 0.05);
        salarioBruto = salarioMensal + salarioFamilia + salarioExtra;
        salarioLiquido = salarioBruto * (1 - 0.1);
        System.out.println("O salário a ser recebido pelo funcionário é de R$ " + salarioLiquido + ".");
    }
}
