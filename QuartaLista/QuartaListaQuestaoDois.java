package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorSalario, valorNovoSalario, almento;

        System.out.println("Verifique qual o almento que o jogador irá receber.");
        System.out.println("Informe o salário do jogador:");
        valorSalario = input.nextDouble();

        if (valorSalario <= 1900) {
            valorNovoSalario = valorSalario * 1.2;
        }
        else if (valorSalario <= 3300) {
            valorNovoSalario = valorSalario * 1.15;
        }
        else  if(valorSalario <= 5800) {
            valorNovoSalario = valorSalario * 1.1;
        }
        else {
            valorNovoSalario = valorSalario * 1.05;
        }

        almento = valorNovoSalario - valorSalario;
        System.out.println("O jogador terá um almento de R$"  + almento + " e passará a receber R$" + valorNovoSalario + ".");
    }
}
