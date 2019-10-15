package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, novoSalario;
        char resposta = 'S';
        System.out.println("Vamos calcular o novo salário do funcionário:");
        while (resposta != 'N' && resposta == 'S'){
            System.out.println("Informe o salário do funcionário:");
            salario = scanner.nextDouble();
            while (salario < 880) {
                System.out.println("O salário informado não é válido. Digite um salário maior ou igual a R$880,00.");
                System.out.println("Informe o salário do funcionário:");
                salario = scanner.nextDouble();
            }
            if (salario <= 1500){
                novoSalario = salario * 1.2;
            }
            else if (salario <= 2500) {
                novoSalario = salario * 1.15;
            }
            else if (salario <= 4000) {
                novoSalario = salario * 1.1;
            }
            else  {
                novoSalario = salario * 1.05;
            }

            System.out.println("O funcionário terá aumento de R$" + salario + " e passará a receber R$" + novoSalario + ".");
            System.out.println("Deseja continuar a verificar novos almentos de salários? (S- sim / N - não)");
            resposta = scanner.next().charAt(0);
            while (resposta != 'S' && resposta != 'N') {
                System.out.println("Resposta incorreta. Informe utilizando 'S' para sim e 'N' para não.");
                System.out.println("Deseja continuar a verificar novos almentos de salários?");
                resposta = scanner.next().charAt(0);
            }
        }
    }
}
